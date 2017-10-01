import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {

        int[] tab = new int[10];
        Random random = new Random();
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(50);
        }

        System.out.println();
        for (int i = 0; i < tab.length * 2; i++) {
            if (tab.length > i) {
                System.out.print(tab[i] + " ");
            }
            else {
                System.out.print(tab[tab.length * 2 - i - 1] + " ");
            }

        }


    }


}
