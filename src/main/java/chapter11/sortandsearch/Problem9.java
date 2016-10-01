package chapter11.sortandsearch;

/**
 * Created by ceejay562 on 10/1/2016.
 */
public class Problem9 {
    static class Coordinate{
        int row;
        int col;

        Coordinate(int row, int col){
            this.row = row;
            this.col = col;
        }

        @Override
        public String toString(){
            return "(" + row + "," + col + ")";
        }
    }
    public static Coordinate search(int[][] mat, int val){
        if(val < mat[0][0] || val > mat[mat.length - 1][mat[0].length - 1]) return null;
        int row = searchRows(mat, val, 0, mat.length - 1);
        int col = searchCol(mat, val, 0, mat[0].length - 1, row);
        if(col < 0) return null;
        return new Coordinate(row, col);
    }

    public static int searchRows(int[][] mat, int val, int min, int max) {
        int mid = (min + max) / 2;
        System.out.println(mid);
        if(mat[mid][0] <= val && val <= mat[mid][mat[mid].length -1])
            return mid;
        else if(mat[mid][0] > val){
            return searchRows(mat, val, min, mid - 1);
        } else {
            return searchRows(mat, val, mid + 1, max);
        }
    }

    public static int searchCol(int[][] mat, int val, int min, int max, int row){
        if(min > max) return -1;

        int mid = (min + max) / 2;

        if(mat[row][mid] > val){
            return searchCol(mat, val, min, mid -1, row);
        } else if(mat[row][mid] < val) {
            return searchCol(mat, val,  mid + 1, max, row);
        } else {
            return mid;
        }
    }

    public static void main(String[] args){
        int[][] mat = {
                {0, 2, 3, 4},
                {5, 7, 8, 9},
                {12, 13, 15, 17},
                {20, 21, 26, 30}
        };

        System.out.println(search(mat, 6));
    }

}
