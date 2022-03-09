public class Admin {
    String nama;
    Pengumuman pengumuman;

    public Admin(String nama){
        this.nama = nama;
    }

    public void setPengumuman(String judul, String isi){
        Pengumuman pengumuman = new Pengumuman();
        pengumuman.setPengumuman(judul,isi);
    }

    public void getPengumuman(){
        System.out.println(this.pengumuman);
    }
}
