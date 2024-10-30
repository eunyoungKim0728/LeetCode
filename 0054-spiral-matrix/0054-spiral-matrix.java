class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        // first row - 0
        int top = 0;

        // last row
        int bottom = matrix.length -1;

        // first col
        int left = 0;

        // last col
        int right = matrix[0].length -1;

        while (top <= bottom && left <= right){
            for(int col = left; col <= right; col++ ){
                result.add(matrix[top][col]);
            }
            top++;
            for(int row = top; row <= bottom;  row++ ){
                result.add(matrix[row][right]);
            }
            right--;

            if(top <= bottom){
                for(int col = right ; col >= left; col-- ){
                    result.add(matrix[bottom][col]);
                }
                bottom--;
            }
            if(left <= right){
                for(int row = bottom; row >= top; row-- ){
                    result.add(matrix[row][left]);
                }
                left++;
            }

        }

        return result;
    }
}