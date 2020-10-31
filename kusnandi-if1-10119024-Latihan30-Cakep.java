
package pbo10119024latihan30;

import java.util.Scanner;

/**
 *
 * @author kusnandi
 * KUSNANDI PIRMANSYAH
 * IF 1
 * 10119024
 */
public class PBO10119024latihan30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    String jawab;
    String normal   ="\u001b[0m";
    String merah    ="\u001b[31m";
    String hijau    ="\u001b[32m";
    String kuning   ="\u001b[33m";
    String biru     ="\u001b[34m";
    String ungu     ="\u001b[35m";
    String birumuda ="\u001b[36m";
    
    System.out.print(merah + "Kamu " + hijau + "ngerjain sendiri " + kuning + "latihan 17 sampe " + biru + "latihan 30 ini? \njawab " + merah + "(Yoi/Enggak) : " + normal);
    jawab = input.next();
    jawab = jawab.toUpperCase();
    system.out.println();
    switch (jawab) {
        case ("YOI"):
            System.out.println(merah + "Cakep bener. " + ungu + "Good Job" + normal);
            break;
        case ("ENGGAK"):
            System.out.println(merah + "Tetap cakep sih.\n" + birumuda + "Sing penting paham konsep nya yrr.\n" + normal + "Keep the code works dude");
            break;
        default:
            System.out.println(" ");
    }
  }
}
