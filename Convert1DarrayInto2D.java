class Convert1DarrayInto2D {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int arr2D[][]=new int[m][n];
        if(m*n!=original.length){  //
            return new int [0][0]; //return empty array if not fit
        }

        for(int i=0;i<m;i++){    //iteration over array
            for(int j=0;j<n;j++){
                arr2D[i][j]=original[i*n+j];  //add element  in 2Darray
            }
        }
        return arr2D;
    }
}
