package akademik;

public class ProgramStudi {
    private String namaProdi;
    private Jurusan jurusan;

    public ProgramStudi(String namaProdi, Jurusan jurusan) {
        this.namaProdi = namaProdi;
        this.jurusan = jurusan;
    }

    public String getNamaProdi() {
        return namaProdi;
    }

    public void setNamaProdi(String namaProdi) {
        this.namaProdi = namaProdi;
    }

    public Jurusan getJurusan() {
        return jurusan;
    }

    public void setJurusan(Jurusan jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Program Studi: " + namaProdi + ", Jurusan: " + jurusan.getNamaJurusan();
    }
}