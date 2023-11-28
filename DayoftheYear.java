class DayoftheYear {
    public static int dayOfTheWeek(String date) {
        // separating day,month and year from the date given string format
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        int year = Integer.parseInt(date.substring(0, 4));

        String[] s = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        // Array to represent the number of days in each month
        int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Initialize the variable d with the input day
        int d = day;

        // Add the days of the months before the current month to d
        for (int i = 1; i < month; i++) {
            d += m[i];
        }

        // Check for a leap year and increment d if the month is after February
        if (isLeapYear(year) && month > 2) {
            d++;
        }


        // Return the day of the year
        return d;
    }

    // method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return (year % 400 == 0) || ((year % 100 != 0) && (year % 4 == 0));
    }

    public static void main(String[] args) {

        System.out.println(dayOfTheWeek("2023-12-31")); //365
        System.out.println(dayOfTheWeek("2024-12-31")); //366
    }
}
