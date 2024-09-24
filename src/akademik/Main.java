package akademik;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Jurusan jurusanTI = new Jurusan("Jurusan Komputer dan Teknik Informatika");
        
        List<ProgramStudi> prodiList = List.of(
            new ProgramStudi("D3 Teknik Informatika", jurusanTI)
        );
        
        List<Mahasiswa> mahasiswas = List.of(
            new Mahasiswa("Agra Anisa Ibtisamah", "Jl. Sarijadi", "081234567891", "231511067", prodiList.get(0)),
            new Mahasiswa("Aulia Putri Ramadhani", "Jl. Ciwaruga", "081234567892", "231511070", prodiList.get(0)),
            new Mahasiswa("Berliana Novianti", "Jl. Kopo", "081234567893", "231511072", prodiList.get(0)),
            new Mahasiswa("Elsa Monika Sinaga", "Jl. Batujajar", "081234567894", "231511074", prodiList.get(0)),
            new Mahasiswa("Isyana Putri Indriana", "Jl. Ciwaruga", "081234567895", "231511078", prodiList.get(0)),
            new Mahasiswa("Jihan Humaira", "Jl. Jakarta", "081234567896", "231511079", prodiList.get(0)),
            new Mahasiswa("Melly Dwiliani", "Jl. Cimahi", "081234567897", "231511080", prodiList.get(0)),
            new Mahasiswa("Sifa Wafiqna", "Jl. Ciwaruga", "081234567898", "231511092", prodiList.get(0)),
            new Mahasiswa("Syahla Salsabila", "Jl. Cibeureum", "081234567899", "231511095", prodiList.get(0)),
            new Mahasiswa("Yulina Anggraeni", "Jl. Sarijadi", "081234567800", "231511096", prodiList.get(0))
        );

        List<Dosen> dosens = List.of(
            new Dosen("Yadhi Aditya Permana", "Jl. Merdeka", "081234567890", "KO052N", "Ketua Jurusan Teknik Komputer dan Informatika"),
            new Dosen("Yudi Widhiyasana", "Jl. Sudirman", "081234567891", "KO013N", "Dosen Jurusan Teknik Komputer dan Informatika"),
            new Dosen("Suprihanto", "Jl. Thamrin", "081234567892", "KO022N", "Dosen Jurusan Teknik Komputer dan Informatika"),
            new Dosen("Trisna Gelar", "Jl. Veteran", "081234567893", "KO078N", "Dosen Jurusan Teknik Komputer dan Informatika"),
            new Dosen("Ade Chandra Nugraha", "Jl. Gatot Subroto", "081234567894", "KO001N", "Dosen Jurusan Teknik Komputer dan Informatika"),
            new Dosen("Muhammad Rizqi", "Jl. Asia Afrika", "081234567895", "KO074N", "Dosen Jurusan Teknik Komputer dan Informatika"),
            new Dosen("Santi Sundari", "Jl. Ahmad Yani", "081234567896", "KO009N", "Dosen Jurusan Teknik Komputer dan Informatika"),
            new Dosen("Zulkifli Arsyad", "Jl. Diponegoro", "081234567897", "KO061N", "Dosen Jurusan Teknik Komputer dan Informatika"),
            new Dosen("Ade Hodijah", "Jl. Cikini", "081234567898", "KO060N", "Dosen Jurusan Teknik Komputer dan Informatika"),
            new Dosen("Irwan Setiawan", "Jl. Palem", "081234567899", "KO045N", "Dosen Jurusan Teknik Komputer dan Informatika")
        );

        List<Ruangan> ruangans = List.of(
            new Ruangan("D217-Kelas"), new Ruangan("D102-Lab. MT"), new Ruangan("D101-Kelas"),
            new Ruangan("D106-Lab. SDB")
        );

        List<MataKuliah> mataKuliahs = List.of(
            new MataKuliah("Pemrograman Berorientasi Objek TE", "21IF2011"),
            new MataKuliah("Komputer Grafik PR", "21IF2015"),
            new MataKuliah("Matematika Diskrit II", "21IF2010"),
            new MataKuliah("Komputer Grafik PR", "21IF2015"),
            new MataKuliah("Basis Data TE", "21IF2012"),
            new MataKuliah("Aljabar Linear", "21IF2014"),
            new MataKuliah("Pengantar Rekayasa Perangkat Lunak TE", "21IF2013"),
            new MataKuliah("Pemrograman Berorientasi Objek PR", "21IF2011"),
            new MataKuliah("Pengantar Rekayasa Perangkat Lunak PR", "21IF2013"),
            new MataKuliah("Basis Data PR", "21IF2012"),
            new MataKuliah("Proyek 3: Pengembangan Perangkat Lunak Berbasis Web", "21IF2016")
        );

        List<JadwalKuliah> jadwals = List.of(
            new JadwalKuliah(mataKuliahs.get(0), "Senin", "08:40 - 10:40", dosens.get(0), ruangans.get(0)),
            new JadwalKuliah(mataKuliahs.get(1), "Senin", "10:40 - 12:20", dosens.get(1), ruangans.get(0)),
            new JadwalKuliah(mataKuliahs.get(2), "Senin", "13.00 - 15:30", dosens.get(2), ruangans.get(0)),
            new JadwalKuliah(mataKuliahs.get(3), "Senin", "15:30 - 18:20", dosens.get(3), ruangans.get(1)),
            new JadwalKuliah(mataKuliahs.get(4), "Selasa", "07:00 - 08:40", dosens.get(4), ruangans.get(2)),
            new JadwalKuliah(mataKuliahs.get(5), "Selasa", "08:40 - 10:40", dosens.get(5), ruangans.get(2)),
            new JadwalKuliah(mataKuliahs.get(6), "Selasa", "10:40 - 12:20", dosens.get(6), ruangans.get(2)),
            new JadwalKuliah(mataKuliahs.get(2), "Rabu", "07:00 - 16:40", dosens.get(9), ruangans.get(1)),
            new JadwalKuliah(mataKuliahs.get(6), "Kamis", "09:50 - 15:30", dosens.get(0), ruangans.get(3)),
            new JadwalKuliah(mataKuliahs.get(7), "Kamis", "15:50 - 18:20", dosens.get(7), ruangans.get(3)),
            new JadwalKuliah(mataKuliahs.get(9), "Jumat", "07:00 - 14:20", dosens.get(8), ruangans.get(3))
        );
        
        System.out.println("===== Daftar Mahasiswa =====");
        printMahasiswa(mahasiswas);

        System.out.println("\n===== Daftar Dosen =====");
        printDosen(dosens);

        System.out.println("\n===== Daftar Program Studi =====");
        printProdi(prodiList);

        System.out.println("\n===== Daftar Ruangan =====");
        printRuangan(ruangans);

        System.out.println("\n===== Jadwal Kuliah =====");
        printJadwalHarian("Senin", jadwals);
        printJadwalHarian("Selasa", jadwals);
        printJadwalHarian("Rabu", jadwals);
        printJadwalHarian("Kamis", jadwals);
        printJadwalHarian("Jumat", jadwals);
    }

    public static void printMahasiswa(List<Mahasiswa> mahasiswas) {
        for (Mahasiswa m : mahasiswas) {
            System.out.println("Nama: " + m.getNama() + ", NIM: " + m.getNim() + ", Alamat: " + m.getAlamat() + ", Prodi: " + m.getProgramStudi().getNamaProdi());
        }
    }

    public static void printDosen(List<Dosen> dosens) {
        for (Dosen d : dosens) {
            System.out.println("Nama: " + d.getNama() + ", Jabatan: " + d.getJabatan());
        }
    }

    public static void printProdi(List<ProgramStudi> prodis) {
        for (ProgramStudi prodi : prodis) {
            System.out.println("Program Studi: " + prodi.getNamaProdi() + ", Jurusan: " + prodi.getJurusan().getNamaJurusan());
        }
    }

    public static void printRuangan(List<Ruangan> ruangans) {
        for (Ruangan r : ruangans) {
            System.out.println("Ruangan: " + r.getKodeRuangan());
        }
    }

    public static void printJadwalHarian(String hari, List<JadwalKuliah> jadwals) {
        System.out.println("\n===== Jadwal Perkuliahan " + hari + " =====");
        for (JadwalKuliah jadwal : jadwals) {
            if (jadwal.getHari().equalsIgnoreCase(hari)) {
                System.out.println("Jam: " + jadwal.getJam() + ", Mata Kuliah: " + jadwal.getMataKuliah().getNamaMataKuliah() +
                        ", Ruangan: " + jadwal.getRuangan().getKodeRuangan() + ", Dosen: " + jadwal.getDosenPengampu().getNama());
            }
        }
    }
}