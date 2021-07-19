import java.util.Scanner;

public class Array_ezy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner tanahInput = new Scanner(System.in);
        String [] Tanah = new String[3];
        int [] Panjang = new int[Tanah.length];
        int [] Lebar = new int[Tanah.length];
        int Luas;
        
        for (int i = 0; i < Tanah.length; i++){
            System.out.print("Input Nama Tanah : ");
            Tanah[i] = tanahInput.nextLine();
            System.out.print("Input Panjang : ");
            Panjang[i] = input.nextInt();
            System.out.print("Input Lebar : ");
            Lebar[i] = input.nextInt();
        }
        for (int i = 0; i < Tanah.length; i++){
            System.out.println(Tanah[i]);
            System.out.println("Panjang : " + Panjang[i]);
            System.out.println("Lebar : " + Lebar[i]);
        }
        for (int i = 0; i < Tanah.length; i++){
            Luas = Panjang[i] * Lebar[i];
            System.out.println("Luas " + Tanah[i] + " : " + Luas);
        }
    }
}
