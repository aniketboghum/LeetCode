package LeetCode;

public class ValidSudoku_medium {
    public static boolean IsValidSudoku(char[][] board) {
        return isRowValid(board) && isColumnValid(board) && isSubBoxesValid(board);
    }

    private static boolean isRowValid(char[][] board){
        boolean isValid = true;
        for (int row=0; row<board.length; row++) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (i == j) continue;
                    if (board[row][i] == '.' && board[row][j] == '.') continue;
                    if (board[row][i] == board[row][j]) {
                        isValid = false;
                        break;
                    }
                }
            }
        }
        return isValid;
    }
    

    private static  boolean isColumnValid(char[][] board) {
        boolean isValid = true;
        for (int col=0; col<board.length; col++) {
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board.length; j++) {
                    if (i == j) continue;
                    if (board[i][col] == '.' && board[j][col] == '.') continue;
                    if (board[i][col] == board[j][col]) {
                        isValid = false;
                        break;
                    }
                }
            }
        }
        return isValid;
    }

    private static  boolean isSubBoxesValid(char[][] board) {
        boolean isValid = true;

        int startRow = 0;
        int startCol = 0;
        for (int i=0; i<board.length; i=i+3) {
            for (int j=0; j<board.length; j=j+3) {
                display2dArray(getSubBox(startRow, startCol, board));
                System.out.println("---------------------");
                if (!isValidSubBox(getSubBox(startRow, startCol, board))){
                    isValid = false;
                    break;
                }
                startCol = j;
            }
            startRow = i;
        }
        return isValid;
    }

    private static char[][] getSubBox(int startRow, int startCol, char[][] board) {
        char[][] temp = new char[3][3];
        for (int i=startRow, k=0; i<startRow+3; i++, k++) {
            for (int j=startCol, l=0; j<startCol+3; j++, l++)
                temp[k][l] = board[i][j];
        }
        return temp;
    }

    private static boolean isValidSubBox(char[][] subBox) {
        int temp = 0;
        for (int i=0; i<subBox.length; i++) {
            for (int j=0; j<subBox.length; j++) {
                temp = subBox[i][j];
                if (temp == '.') continue;

                for (int k=0; k<subBox.length; k++) {
                    for (int l=0; l<subBox.length; l++) {

                        if (i==k && j==l) continue;
                        if (temp == subBox[k][l]) return false;
                    }
                }
            }
        }
        return true;
    }
    private static void display2dArray(char[][] board) {
        for (char[] chars : board) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(chars[j] + ' ');
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //valid
        char[][] board = {{'5','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};
        
        //invalid
//        char[][] board ={{'.','.','.','.','.','.','5','.','.'},
//                         {'.','.','.','.','.','.','.','.','.'},
//                         {'.','.','.','.','.','.','.','.','.'},
//                         {'9','3','.','.','2','.','4','.','.'},
//                         {'.','.','7','.','.','.','3','.','.'},
//                         {'.','.','.','.','.','.','.','.','.'},
//                         {'.','.','.','3','4','.','.','.','.'},
//                         {'.','.','.','.','.','3','.','.','.'},
//                         {'.','.','.','.','.','5','2','.','.'}};
//        char[][] board = {{'8', '.', '.'},
//                          {'4', '.', '.'},
//                          {'7', '.', '.'}};
        System.out.println(IsValidSudoku(board));
//        System.out.println(isValidSubBox(board));
    }
}
