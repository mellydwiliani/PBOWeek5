package akademik;

public class Dosen extends Person {
    private String kodedosen; 
    private String jabatan;

    public Dosen(String nama, String alamat, String noTelepon, String kodedosen, String jabatan) {
        super(nama, alamat, noTelepon);  
        this.kodedosen = kodedosen; 
        this.jabatan = jabatan;
    }

    public String getKodedosen() { 
        return kodedosen;
    }

    public void setKodedosen(String kodedosen) { 
        this.kodedosen = kodedosen;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    @Override
    public String toString() {
        return super.toString() + ", Kode Dosen: " + kodedosen + ", Jabatan: " + jabatan; 
    }
}
