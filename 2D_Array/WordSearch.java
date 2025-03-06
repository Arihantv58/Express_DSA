import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordSearch {
    public static boolean exist(char[][] board, String word) {
        Map<Character, List<int[]>> map = new HashMap<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                map.computeIfAbsent(board[i][j], k->new ArrayList<>()).add(new int[]{i, j});
            }
        }
        char[] w = word.toCharArray();
        if(!map.containsKey(w[0])){
            return false;
        }

        for(int[] index: map.get(w[0])){
            int x = index[0], y = index[1];
            if(exist(w, 0, x, y, board)){
                return true;
            }
        }
        return false;
    }

    private static boolean exist(char[] w, int i, int x, int y, char[][] board){
        if(i == w.length){
            return true;
        }
        if(x < 0 || y < 0 || x >= board.length || y >= board[x].length || w[i] != board[x][y]){
            return false;
        }
        char c = board[x][y];
        board[x][y] = '0';
        boolean flag = exist(w, i+1, x-1, y, board) || exist(w, i+1, x+1, y, board) || exist(w, i+1, x, y-1, board) || exist(w, i+1, x, y+1, board);
        board[x][y] = c;
        return flag;
    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
}
