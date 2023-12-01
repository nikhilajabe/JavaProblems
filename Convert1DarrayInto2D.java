class Convert1DarrayInto2D {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int arr2D[][]=new int[m][n];
        if(m*n!=original.length){
            return new int [0][0];
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr2D[i][j]=original[i*n+j];
            }
        }
        return arr2D;
    }
}
