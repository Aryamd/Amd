package pa_pbo;

public class Main {
    public static void main(String[] args) {
        Rekening rekeningNasabah1 = new Rekening(1000);
        Nasabah nasabah1 = new Nasabah("John Doe", rekeningNasabah1);
        Rekening rekeningNasabah2 = new Rekening(500);
        Nasabah nasabah2 = new Nasabah("Jane Doe", rekeningNasabah2);

        Bank bank = new Bank();
        bank.tambahNasabah(nasabah1);
        bank.tambahNasabah(nasabah2);

        Admin admin = new Admin(bank);
        admin.lihatInfoNasabah();

        Teller teller = new Teller(bank);
        teller.prosesSetoran(nasabah1, 200);

        NasabahBiasa nasabahBiasa = new NasabahBiasa(nasabah1);
        nasabahBiasa.lihatInfoSendiri();
        nasabahBiasa.tambahFiturSendiri();
    }
}
