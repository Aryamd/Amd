package pa_pbo;

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
    
    // Tambah fitur sendiri++
    public void tambahFiturSendiri() {
        System.out.println("Fitur tambahan dari User");
    }
}
