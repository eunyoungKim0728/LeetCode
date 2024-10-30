class Solution {
    public void rotate(int[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        int lastIndex = matrix.length -1;
        int length = matrix.length;
        int index1 = 0;
        int matrixIndex = 0;
        int index2 = 0;
        for (int[] row : matrix) {
            if(length > 0){
                for(int i = lastIndex; i >=0 ; i--){
                    result[index1][index2] = matrix[i][matrixIndex];
                    index2++;
                }
                matrixIndex++;
                index1++;
                index2 = 0;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = result[i][j];  
            }
        }

    }
}