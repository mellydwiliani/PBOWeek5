package akademik;

public class MataKuliah {
    private String namaMataKuliah;
    private String kodeMataKuliah; 

    public MataKuliah(String namaMataKuliah, String kodeMataKuliah) { 
        this.namaMataKuliah = namaMataKuliah;
        this.kodeMataKuliah = kodeMataKuliah; 
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void setNamaMataKuliah(String namaMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
    }

    public String getKodeMataKuliah() { 
        return kodeMataKuliah;
    }

    public void setKodeMataKuliah(String kodeMataKuliah) {
        this.kodeMataKuliah = kodeMataKuliah;
    }

    @Override
    public String toString() {
        return "Mata Kuliah: " + namaMataKuliah + ", Kode: " + kodeMataKuliah;
    }
}
