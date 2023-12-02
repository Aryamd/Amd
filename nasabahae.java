package pa_pbo;

import java.util.ArrayList;

class Nasabah {
    public String nama;
    public Rekening rekening;
    public ArrayList<Transaksi> riwayatTransaksi;

    public Nasabah(String nama, double saldoAwal) {
        this.nama = nama;
        this.rekening = new Rekening(saldoAwal);
        this.riwayatTransaksi = new ArrayList<>();
    }

    public void tambahTransaksi(Transaksi transaksi) {
        riwayatTransaksi.add(transaksi);
    }

    public void lihatInfo() {
        System.out.println("Informasi Nasabah: " + nama);
        System.out.println("Saldo saat ini: " + rekening.getSaldo());
        System.out.println("Riwayat Transaksi:");
        for (Transaksi transaksi : riwayatTransaksi) {
            System.out.println("  - " + transaksi);
        }
    }

    public String getNama() {
        return nama;
    }
    
    public Rekening getRekening() {
        return rekening;
    }
}
