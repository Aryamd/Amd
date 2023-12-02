package projekakhir_pbo;

import java.util.ArrayList;

public class User {
    private Nasabah nasabah;
    
    public User(Nasabah nasabah) {
        this.nasabah = nasabah;
    }
    
    public void lihatInfoSendiri(){
        nasabah.lihatInfo();
        System.out.println("Detail Transaksi:");
        for (Transaksi transaksi : nasabah.riwayatTransaksi) {
            System.out.println("  - " + transaksi);
        }
    }
    
    // menambahkan  fitur sendiri 
    public void menambahkanFiturSendiri() {
        System.out.println("Fitur tambahan dari User");
    }
}
