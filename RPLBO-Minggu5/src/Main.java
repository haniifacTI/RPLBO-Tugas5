import java.util.ArrayList;

//README
//Dosen, Mahasiswa, Jadwal, MataKuliah sudah bisa

public class Main {
    public static Mahasiswa orang1;
    public static Mahasiswa orang2;

    public static void main(String[] args) {
        Inisialisasi();

        System.out.println("Jadwal "+orang1.getNama());
        orang1.getJadwalMahasiswa().getListMatkul();
        System.out.println();

        System.out.println("Jadwal "+orang2.getNama());
        orang2.getJadwalMahasiswa().getListMatkul();
        System.out.println();
    }

    public static void Inisialisasi(){
        orang1 = new Mahasiswa("Haniif","Informatika","71200660");
        orang2 = new Mahasiswa("Richard","Informatika","71200594");

        Dosen dosen1 = new Dosen("Nila");
        Dosen dosen2 = new Dosen("Dendy");
        Dosen dosen3 = new Dosen("BudSus");
        Dosen dosen4 = new Dosen("Agata");

        MataKuliah matkul1 = new MataKuliah("RPLBO",dosen1,"Senin, 13:30");
        MataKuliah matkul2 = new MataKuliah("Prak RPLBO",dosen2,"Rabu, 10:30");
        MataKuliah matkul3 = new MataKuliah("Progweb",dosen4,"Selasa, 13:30");
        MataKuliah matkul4 = new MataKuliah("Prak Progweb",dosen4,"Kamis, 10:30");
        MataKuliah[] matkuls = {matkul1,matkul2,matkul3,matkul4};

        orang1.getJadwalMahasiswa().addListMatkul(matkuls);
        orang2.getJadwalMahasiswa().addListMatkul(matkul1);
        orang2.getJadwalMahasiswa().addListMatkul(matkul3);
        orang2.getJadwalMahasiswa().addListMatkul(matkul4);
    }
}
