public class MultiArrayApp {
    public static void main(String[] args) {
        MultiArray tmp = new MultiArray(4,8);
        System.out.println("Tablica wypełniona wartościami z konstruktora: ");
        tmp.print();
        tmp.randomize();
        System.out.println(" ");
        System.out.println("Tablica wypełniona ponownie z metody randomize: ");
        tmp.print();
        System.out.println(" ");
        System.out.println("Najmniejszy element w tablicy = " + tmp.findMin());
        System.out.println("Największy element w tablicy = " + tmp.findMax());

    }
}
