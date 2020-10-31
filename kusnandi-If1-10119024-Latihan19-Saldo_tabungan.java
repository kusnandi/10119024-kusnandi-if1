/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119024.latihan19.saldo_tabungan;

/**
 *
 * @author acer
 * KUSNANDI PIRMANSYAH
 * IF1
 * 10119024
 */
public class If110119024Latihan19Saldo_tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double saldo_awal = 2500000;
        for (double i = 1; i <= 6; i++) {
            saldo_awal += Math.floor(saldo_awal * 0.15);
            System.out.printf("Saldo di bulan ke-%1$.0f Rp. %2$,.0f%n",saldo_awal);
        }
    }
    
}
