package Array;

import java.util.HashMap;
import java.util.Map;

public class Valid_sudoku {
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0 ; i<board.length; i++)
        {
            Map<Character,Integer> row = new HashMap<>();
            Map<Character,Integer> col = new HashMap<>();
            for(int j=0; j<board.length; j++)
            {
                if(board[i][j]=='.' || board[j][i]=='.')
                    continue;
                if(row.containsKey(board[i][j]))
                {
                    return false;
                }
                row.put(board[i][j],j);

                if(col.containsKey(board[j][i]))
                {
                    return false;
                }
                col.put(board[j][i],i);
            }
        }

        for(int i=0; i<9; i+=3)
        {
            for(int j=0; j<9; j+=3)
            {
                Map<Character,Integer> box = new HashMap<>();
                for(int k=0; k<3; k++)
                {
                    for(int l=0 ;l<3; l++)
                    {
                        if(board[i+k][j+l]=='.')
                            continue;
                        if(box.containsKey(board[i+k][j+l]))
                            {
                                return false;
                            }
                            box.put(board[i+k][j+l],l);
                    }
                }
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        char[][] sudoku = {
            {'5', '3', '4', '6', '7', '8', '9', '1', '2'},
            {'6', '7', '2', '1', '9', '5', '3', '4', '8'},
            {'1', '9', '8', '3', '4', '2', '5', '6', '7'},
            {'8', '5', '9', '7', '6', '1', '4', '2', '3'},
            {'4', '2', '6', '8', '5', '3', '7', '9', '1'},
            {'7', '1', '3', '9', '2', '4', '8', '5', '6'},
            {'9', '6', '1', '5', '3', '7', '2', '8', '4'},
            {'2', '8', '7', '4', '1', '9', '6', '3', '5'},
            {'3', '4', '5', '2', '8', '6', '1', '7', '9'}
        };
        System.out.println(isValidSudoku(sudoku));
    }
}
