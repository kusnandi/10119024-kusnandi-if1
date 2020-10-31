/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119024latihan23;

/**
 *
 * @author acer
 * Kusnandi Pirmansyah
 * IF1
 * 10119024
 */
public class PBO10119024Latihan23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, jum_nilai, terbesar = 0, terkecil = 0;
        Scanner scanner = new scanner(System.in);
        System.out.println("=====Program NIlai Terbesar dan Terkecil Nilai Mahasiswa=====");
        System.out.print("Masukan Nama Petugas : ");
        String petugas = scanner.next();
        System.out.print("Masukan Banyak Nilai Mahasiswa : ");
        jum_nilai = scanner.nextInt();
        int nilai_mhs[] = new int[jum_nilai];
        for (i = 0; < jum_nilai; i++) {
            System.out.printf("Masukan Nilai Mahasiswa ke-%d: ", i+1);
            nilai_mhs[i]= scanner.nextInt();
        }
        
        System.out.println();
        System.out.println("=====Hasil Nilai Mahasiswa=====");
        terkecil = nilai_mhs[0];
        for (i = 0; i < jum_nilai; i++) {
            System.out.printf("Nilai Mahasiswa ke-%1$d = %2$d%n", i+1, nilai_mhs[i]);
            if (nilai_mhs[i] < terkecil) {
                terkecil = nilai_mhs[i];
            }
            if (nilai_mhs[i] > terbesar) {
                terbesar = nilai_mhs[i];
            }
        }
        System.out.println();
        System.out.println("Nilai Terbesar Adalah "+terbesar);
        System.out.println("Nilai Terkecil Adalah "+terkecil);
        System.out.println();
        System.out.println("Petugas : "+petugas);
    }
}
