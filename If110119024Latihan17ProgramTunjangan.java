/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119024.latihan17.program.tunjangan;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF-1
 * 10119024
 */
public class If110119024Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double gaji_pokok, tunjangan, totalgaji;
        
        system.out.print("===========Program Tunjangan===========")
        system.out.print("Berapa Gaji pokok anda perbulan : ");
        Scanner scanner = new Scanner(System.in);
        gaji_pokok = scanner.nextInt();
        System.out.print("Status anda? (Menikah/Belum) : ");
        String status = scanner.next();
        tunjangan = (status.equals("menikah") || status.equals("Menikah"))?0.35*gaji_pokok:0;
        totalgaji = gaji_pokok + tunjangan;
        System.out.printf("Gaji Pokok \t\t: Rp %.1f%n",gaji_pokok);
        System.out.printf("Tunjangan\t\t: Rp %.1f%n", tunjangan);
        System.out.printf("Total Gaji\t\t: Rp %.1f%n", totalgaji);
        scanner.close();
    }
    
}
