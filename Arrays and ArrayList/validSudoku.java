import java.util.*;

class validSudoku {

    public static boolean valid(int[][] matrix){
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] box = new int[9][9];

        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char ch = matrix[i][j];

                if(ch == '.') continue;
                int num = ch - '1';
                int boxIndex = (i/3)*3 + j/3;

                if(row[i][num] || col[j][num] || box[boxIndex][num]) return false;

                row[i][num] = true;
                col[j][num] = true;
                box[boxIndex][num] = true;

            }
        }

        return true;
    }

    public static void main(String[] args) {

    }
}