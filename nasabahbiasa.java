package pa_pbo;

public class NasabahBiasa extends User{
    public NasabahBiasa(Nasabah nasabah) {
        super(nasabah);
    }
    
    //tambah fitur sendiri++
    public void tambahFiturSendiri() {
        System.out.println("Fitur tambahan dari Nasabah Biasa");
    }
}
