package pa_pbo;

public class Transaksi {
    private String jenis;
    private double jumlah;
    private String tujuan;

    public Transaksi(String jenis, double jumlah, String tujuan) {
        this.jenis = jenis;
        this.jumlah = jumlah;
        this.tujuan = tujuan;
    }

    @Override
    public String toString() {
        if ("transfer".equals(jenis)) {
            return jenis + " sejumlah " + jumlah + " ke " + tujuan;
        } else {
            return jenis + " sejumlah " + jumlah;
        }
    }
}
