package akademik;

public class Jurusan {
    private String namaJurusan;

    public Jurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    public String getNamaJurusan() {
        return namaJurusan;
    }

    public void setNamaJurusan(String namaJurusan) {
        this.namaJurusan = namaJurusan;
    }

    @Override
    public String toString() {
        return "Jurusan: " + namaJurusan;
    }
}