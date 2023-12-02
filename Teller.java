package projekakhirUas_pbo;

class Teller extends Admin {
    public Teller(Bank bank) {
        super(bank);
    }
    
    public void prosesSetoran(Nasabah nasabah, double jumlah) {
        nasabah.rekening.tambahSaldo(jumlah);
        nasabah.getRekening().tambahSaldo(jumlah);
        System.out.println("Setoran berhasil.");
    }
}
