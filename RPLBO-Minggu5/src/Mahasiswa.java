public class Mahasiswa {
    private String nama;
    private String prodi;
    private String nim;
    private Jadwal jadwalMahasiswa = new Jadwal();

    public Mahasiswa(String nama, String prodi, String nim){
        this.nama = nama;
        this.prodi = prodi;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public String getNim() {
        return nim;
    }

    public Jadwal getJadwalMahasiswa() {return jadwalMahasiswa;}

}
