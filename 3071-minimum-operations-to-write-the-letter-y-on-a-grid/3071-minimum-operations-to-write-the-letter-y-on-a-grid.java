class Solution {
    public int minimumOperationsToWriteY(int[][] grid) {
         //center =  n//2

        int n = grid.length; // n x n grid
        int center = n / 2;       
        List<int[]> writeY = new ArrayList<>(); 
        List<int[]> other = new ArrayList<>();  

        //  (0,0) -> (center, center)
        for (int i = 0; i <= center; i++) {
            writeY.add(new int[]{i, i});
        }

        //  (0, n-1) -> (center, center)
        for (int i = 0; i <= center; i++) {
            if (i != center) {  
                writeY.add(new int[]{i, n - 1 - i});
            }
        }
        
        //  (center, center) -> (n-1, center)
        for (int i = center; i < n; i++) {
            if (i != center || i == n - 1) {  
                writeY.add(new int[]{i, center});
            }
        }

        // find other cells
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (!containsCell(writeY, new int[]{i, j})) {
                    other.add(new int[]{i, j});
                }
            }
        }

   

        int minNumber = Integer.MAX_VALUE;
        for (int yValue = 0; yValue <= 2; yValue++) {
            for (int otherValue = 0; otherValue <= 2; otherValue++) {
                if (yValue != otherValue) {
                    int yOperations = calculateNumber(grid, writeY, yValue);
                    int otherOperations = calculateNumber(grid, other, otherValue);
                    minNumber = Math.min(minNumber, yOperations + otherOperations);
                }
            }
        }
    
        return minNumber;
    }

        //final calculate
     private int calculateNumber(int[][] grid,  List<int[]> cells, int value) {
        int count = 0;
        for(int[] cell: cells){
            if(grid[cell[0]][cell[1]] != value){
                count++;
            }
        }

        return count;
    }

    private boolean containsCell(List<int[]> list, int[] cell) {
        for (int[] item : list) {
            if (Arrays.equals(item, cell)) {
                return true;
            }
        }
        return false;
    }
}