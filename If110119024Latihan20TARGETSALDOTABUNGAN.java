/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119024.latihan20.target.saldo.tabungan;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF1
 * 10119024
 */
public class If110119024Latihan20TARGETSALDOTABUNGAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double saldo_awal = 3500000;
        double i = 0;
        do {
            i += 1;
            saldo_awal += Math.floor(saldo_awal * 0.08);
            System.out.printf(Locale.ITALY, "Saldo di bulan ke-%1$.0f Rp. %2$,.0f%n" , i , saldo_awal);      
        } while (saldo_awal<6000000);
        
    }
    
}
