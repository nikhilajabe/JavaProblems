class Solution {
    public static String dayOfTheWeek(int day, int month, int year) {
        // Array to represent days of the week
        String[] s = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Array to represent the number of days in each month
        int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};      
        int d = day;

        // Add the days of the months before the current month to d
        for (int i = 1; i < month; i++) {
            d += m[i];
        }

        // Check for a leap year and increment d if the month is after February
        if (isLeapYear(year) && month > 2) {
            d++;
        }

        // Adjust the year and add the calculated days based on Zeller's Congruence algorithm
        year--;
        d += (year + (year / 4) - (year / 100) + (year / 400)) % 7;

        // Return the corresponding day of the week from the s array
        return s[(d) % 7];
    }

    // Helper method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
    }
    public static void main(String[] args) {
        System.out.println(dayOfTheWeek(28,11,2023)); //Tuesday
        
    }
}
