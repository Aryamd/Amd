package pa_pbo;

import java.util.ArrayList;

public class Rekening {
    public double saldo;
    public ArrayList<Transaksi> riwayatTransaksi;

    public Rekening(double saldoAwal) {
        this.saldo = saldoAwal;
        this.riwayatTransaksi = new ArrayList<>();
    }

    public void tambahSaldo(double jumlah) {
        saldo += jumlah;
    }

    public boolean tarikTunai(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            return true;
        } else {
            System.out.println("Saldo tidak mencukupi.");
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }
}
