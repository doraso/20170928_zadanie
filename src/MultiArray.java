import java.util.Random;

public class MultiArray {
    private int[][] tab;
    Random random = new Random();

    public MultiArray(int n, int m) {
        tab = new int[n][m];
        randomize();
    }

    public void randomize() {
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = random.nextInt(20);

            }
        }
    }

    public int findMin() {
        int min = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (min > tab[i][j]) {
                    min = tab[i][j];
                }
            }
        }
        return min;
    }

    public int findMax() {
        int max = tab[0][0];
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                if (max < tab[i][j]) {
                    max = tab[i][j];
                }
            }
        }
        return max;
    }

    public void print() {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(" ");
            System.out.println(" ");
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(" " + tab[i][j]);
            }
        }
    }
}