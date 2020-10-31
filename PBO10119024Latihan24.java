/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119024latihan24;

/**
 *
 * @author kusnandi
 * Kusnandi Pirmansyah
 * IF-1
 * 10119024
 */
public class PBO10119024Latihan24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nilai1, nilai2, hasil;
        String pilihan;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=====Program Perbandingan Nilai=====");
        do {
            System.out.print("Masukan nilai pertama : ");
            nilai1 = scanner.nextInt();
            System.out.print("Masukan nilai pertama : ");
            nilai2 + scanner.nextInt();
            if (nilai1 < nilai2){
                System.out.printf("Hasil : %1$d Lebih Kecil dari %2$d%n", nilai1, nilai2);
            }
            if (nilai1 > nilai2){
                System.out.printf("Hasil : %1$d Lebih Besar dari %2$d%n", nilai1, nilai2);
            }
            if (nilai1 == nilai2){
                System.out.printf("Hasil : %1$d Sama Dengan %2$d%n", nilai1, nilai2);
            }
            System.out.print("\nUlangi Aktifitas? Ya/Tidak : ");
            pilihan = scanner.next();
            System.out.println();
        } while (pilihan.equals("ya") || pilihan.equals("Ya"));    
    }
}
