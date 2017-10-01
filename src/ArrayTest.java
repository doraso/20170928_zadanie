public class ArrayTest {
    public static void main(String[] args) {
        ArrayComparator arcom = new ArrayComparator();
        int[][] tab1 = new int [4][5];
        int[] i0 = {4, 2, 3, 4, 5};
        int[] i1 = {2, 3, 4, 5, 6};
        int[] i2 = {1, 2, 3, 4, 5};
        int[] i3 = {2, 3, 4, 5, 6};

        tab1[0] = i0;
        tab1[1] = i1;
        tab1[2] = i2;
        tab1[3] = i3;


        int[][] tab2 = new int [4][5];
        int[] j0 = {1, 2, 3, 4, 5};
        int[] j1 = {2, 3, 4, 5, 6};
        int[] j2 = {1, 2, 3, 4, 5};
        int[] j3 = {2, 3, 4, 5, 6};

        tab2[0] = j0;
        tab2[1] = j1;
        tab2[2] = j2;
        tab2[3] = j3;

        boolean result = arcom.compare(tab1, tab2);
        System.out.println(result);


    }
}
