
package pbo10119024latihan27;


import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author kusnandi
 * KUSNANDI PIRMANSYAH
 * IF 1
 * 10119024
 */
public class PBO10119024Latihan27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String besar, kecil;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Kalimat : ");
        String nama = scanner.nextLine();
        System.out.println();
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar : "+nama.toUpperCase());
        System.out.println("Huruf Kecil : "+nama.toLowerCase());
    }
    
}
