package pa_pbo;

import java.util.ArrayList;

class Admin {
    private Bank bank;

    public Admin(Bank bank) {
        this.bank = bank;
    }

    public void lihatInfoNasabah() {
        System.out.println("Seluruh Informasi Nasabah:");
        for (Nasabah nasabah : bank.getNasabahList()) {
            nasabah.lihatInfo();
        }
    }
}
