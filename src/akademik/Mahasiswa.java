package akademik;

public class Mahasiswa extends Person {
    private String nim;
    private ProgramStudi programStudi;

    public Mahasiswa(String nama, String alamat, String noTelepon, String nim, ProgramStudi programStudi) {
        super(nama, alamat, noTelepon);  
        this.nim = nim;
        this.programStudi = programStudi;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public ProgramStudi getProgramStudi() {
        return programStudi;
    }

    public void setProgramStudi(ProgramStudi programStudi) {
        this.programStudi = programStudi;
    }

    @Override
    public String toString() {
        return super.toString() + ", NIM: " + nim + ", Program Studi: " + programStudi.getNamaProdi();
    }
}
