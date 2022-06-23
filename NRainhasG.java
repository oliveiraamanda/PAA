import java.util.ArrayList;

public class NRainhasG {
    public static void main(String[] args) {
        solve_nqueen(9);
    }

    public static boolean is_possible_nqueen(ArrayList<Integer> queens, int col) {
        for(int i = 0; i < queens.size(); i++){
            if(queens.get(i) == col){
                return false;
            }
        }

        int row = queens.size();

        for(int i = 0; i < queens.size(); i++){
            int d_col = Math.abs(queens.get(i) - col);
            int d_row = Math.abs(i - row);

            if (d_col == d_row) {
                return false;
            }
        }

        return true;
    }

    public static boolean solve_nqueen(ArrayList<Integer> queens, int n) {
        if (queens.size() == n) {
            printQueensPositions(queens);
            printBoard(queens);

            return true;
        } else {
            for (int i = 0; i < n; i++){
                if (is_possible_nqueen(queens, i)) {
                    queens.add(i);
                    if (solve_nqueen(queens, n)) {
                        return true;
                    }
                    queens.remove(queens.size() - 1);
                }
            }

            return false;
        }
    }

    public static void solve_nqueen(int n){
        ArrayList<Integer> queens = new ArrayList<Integer>();

        solve_nqueen(queens, n);
    }

    public static void printQueensPositions(ArrayList<Integer> queensPositions) {
        for(int i = 0; i < queensPositions.size(); i++) {
            System.out.print(queensPositions.get(i) + " ");
        }
        System.out.println("\n");
    }

    public static void printBoard(ArrayList<Integer> queensPositions){
        int columns = queensPositions.size();

        ArrayList<ArrayList<Integer>> board = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < columns; i++) {
            board.add(new ArrayList<Integer>());
            for (int j = 0; j < columns; j++) {
                board.get(i).add(0);
            }
            board.get(i).set(queensPositions.get(i), 1);
        }

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(board.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

}