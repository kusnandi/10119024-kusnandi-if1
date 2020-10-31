/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo119024latihan26;

import java.util.calender;
import java.util.GregorianCalendar;


/**
 *
 * @author kusnandi
 * NAMA  : KUSNANDI PIRMANSYAH
 * KELAS : IF 1
 * NIM   : 10119024
 */
public class PBO119024Latihan26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int hari, tanggal, bulan, tahun, jam, menit, detik;
        GregorianCalender waktu = new GregorianCalendar();
        String nama_bulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "November", "Desember"};
        String nama_hari[] = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu", "Minggu"};
        hari = waktu.get(Calendar.DAY_OF_WEEK);
        tanggal = waktu.get(Calendar.DAY_OF_MONTH);
        bulan = waktu.get(Calendar.MONTH);
        tahun = waktu.get(Calendar.YEAR);
        jam = waktu.get(Calendar.HOUR_OF_DAY);
        menit = waktu.get(Calendar.MINUTE);
        detik = waktu.get(Calendar.SECOND);
        System.out.println("Hari ini adalah hari : "+nama_hari[hari]+", "+tanggal+" "+nama_bulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik);
    }
    
}
