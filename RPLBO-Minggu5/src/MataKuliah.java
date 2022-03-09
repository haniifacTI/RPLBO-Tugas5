import java.util.ArrayList;

public class MataKuliah {
    private String namaMatkul;
    private ArrayList<Dosen> dosenPengampu = new ArrayList<>();
    private String hariTanggal;

    public MataKuliah(String namaMatkul,Dosen dosen, String hariTanggal){
        this.namaMatkul = namaMatkul;
        this.dosenPengampu.add(dosen);
        this.hariTanggal = hariTanggal;
    }

    public void addDosenPengampu(Dosen dosen){
        dosenPengampu.add(dosen);
    }

    public String getDosenPengampu() {
        String listdosenPengampu = "";
        for(Dosen dosen : dosenPengampu){
            listdosenPengampu += dosen.getNama();
        }

        return listdosenPengampu;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public String getHariTanggal() {
        return hariTanggal;
    }
}
