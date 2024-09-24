package akademik;

public class Ruangan {
    private String kodeRuangan;

    public Ruangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }

    public String getKodeRuangan() {
        return kodeRuangan;
    }

    public void setKodeRuangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }

    @Override
    public String toString() {
        return "Kode Ruangan: " + kodeRuangan;
    }
}
