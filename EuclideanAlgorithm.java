import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukkan bilangan bulat pertama: ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan bulat kedua: ");
        int bil2 = sc.nextInt();
        sc.close();

        if (bil2 > bil1) {
            int container = bil1;
            bil1 = bil2;
            bil2 = container;
        }

        int sisaPembagi = bil1 - ((bil1 / bil2)*bil2);
        while (sisaPembagi != 0) {
            System.out.printf("%d = %d * %d + %d\n", bil1, bil1/bil2, bil2, sisaPembagi);
            bil1 = bil2;
            bil2 = sisaPembagi;
            sisaPembagi = bil1 - ((bil1 / bil2)*bil2);
        }
        System.out.printf("%d = %d * %d + %d\n", bil1, bil1/bil2, bil2, sisaPembagi);
    }
}
