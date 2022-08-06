import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int heat;

        System.out.print("Sicaklik degerini giriniz: ");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak yapabilirsiniz!");
        } else if (heat >= 5 && heat <= 25) {
            if (heat <= 15) {
                System.out.println("Sinemaya gidebilirsin!");
            }
            if (heat >= 10) {
                System.out.println("Piknige gidebilirsin!");
            }
        } else {
            System.out.println("Yuzmeye gidebilirsin!");
        }
    }
}
