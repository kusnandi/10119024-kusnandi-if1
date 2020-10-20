/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119024.latihan3.input;

import java.util.Scanner;
/**
 *
 * @author acer
 * NAMA     : Kusnandi Pirmansyah
 * KELAS    : IF1
 * NIM      : 10119024
 */
public class IF110119024Latihan3Input {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukan nama anda; ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
    
}
