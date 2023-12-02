package projekakhirUas_pbo;

import java.until.ArrayList;

public class Bank {
    private ArrayList<Nasabah> nasabahList;
    
    public Bank() {
        this.nasabahList = new ArrayList<>();
    }
    
    public void tambahNasabah(Nasabah nasabah) {
        nasabahList.add(nasabah);
    }
    
    public ArrayList<Nasabah> getNasabahList() {
        return nasabahList;
    }
    
    public void transfer(Nasabah pengirim, Nasabah penerima, double jumlah) {
        if (pengirim.getNama().equals(penerima.getNama())) {
            System.out.println("Transfer gagal. Nasabah pengirim dan penerima sama.");
            return;
        }
        
        if (pengirim.rekening.tarikTunai(jumlah)) {
            penerima.rekening.tambahSaldo(jumlah);
            pengirim.tambahTransaksi(new Transaksi("transfer", jumlah, penerima.getNama()));
            penerima.tambahTransaksi(new Transaksi("terima transfer",jumlah, pengirim.getNama()));
            System.out.println("Transfer berhasil.");
        } else {
            System.out.println("Transfer gagal. Saldo tidak mencukupi");
        }
    }
}
