package BAB8.Interface;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Computer 8
 */
public class G0001 extends Pembayaran {
    public String nama,alamat;
    public String InputPinKredit;
    public int saldo;
    public String kode;
    double diskon,bayar,total;
    public G0001(){
        this.nama = "Muhammad Ridho";
        this.kode= "G0001";
        this.saldo = 5000000;
        this.alamat = "Malang, jl.lowokwaru no 50";
    }
        public double hasil(){
            return diskon;
        
        }
        
        @Override 
        double cekKode(String input){
            if(input.compareTo(kode) == 0){
                diskon = 0.2;
            }else {
                diskon = 0;
            }
            return diskon;
        }
        @Override 
        double hitpembayaran(double bayar){
            diskon = bayar * diskon;
            total = bayar - diskon;
            return total;
        }
        double potsaldo(){
            return this.saldo - total;
        }
        @Override
        void tampilanmember(){
        System.out.println("Member G0001 dengan diskon 20% ");
} 
        void jenisPembayaran(cash Cash) {
        if (bayar >= total) {
             System.out.println("Kembalian : " + Cash.kembalian(total, bayar));
        } else if (bayar <= total) {
             System.out.println("uang anda kurang");
        } else {
             System.out.println("Pembayaran Berhasil");
        }
 }
 
        void jenisPembayaran(emoney Emoney) {
         Emoney.scanQris();
 }
 
        void jenisPembayaran(kredit credit) {
        credit.cekKartuKredit(kode, InputPinKredit);
 }
}

