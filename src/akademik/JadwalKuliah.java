package akademik;

public class JadwalKuliah {
    private MataKuliah mataKuliah;
    private String hari;
    private String jam;
    private Dosen dosenPengampu;
    private Ruangan ruangan;

    public JadwalKuliah(MataKuliah mataKuliah, String hari, String jam, Dosen dosenPengampu, Ruangan ruangan) {
        this.mataKuliah = mataKuliah;
        this.hari = hari;
        this.jam = jam;
        this.dosenPengampu = dosenPengampu;
        this.ruangan = ruangan;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(MataKuliah mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }

    public void setDosenPengampu(Dosen dosenPengampu) {
        this.dosenPengampu = dosenPengampu;
    }

    public Ruangan getRuangan() {
        return ruangan;
    }

    public void setRuangan(Ruangan ruangan) {
        this.ruangan = ruangan;
    }

    @Override
    public String toString() {
        return "Mata Kuliah: " + mataKuliah.getNamaMataKuliah() +
               ", Hari: " + hari + 
               ", Jam: " + jam + 
               ", Dosen: " + dosenPengampu.getNama() + 
               ", Ruangan: " + ruangan.getKodeRuangan();
    }
}
