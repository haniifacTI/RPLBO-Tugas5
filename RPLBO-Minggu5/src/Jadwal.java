import java.util.ArrayList;
import java.util.Arrays;

public class Jadwal {
    private ArrayList<MataKuliah> listMatkul = new ArrayList<>();

    public void getListMatkul() {
        int count = 1;
        for(MataKuliah matkul : listMatkul){
            System.out.println(count+". "+matkul.getNamaMatkul()+" || "+matkul.getHariTanggal()+" || "+matkul.getDosenPengampu());
            count++;
        }
    }

    public void addListMatkul(MataKuliah[] matkul) {
        for (int i = 0; i < matkul.length; i++) {
            this.listMatkul.add(matkul[i]);
        }
//        this.listMatkul.addAll(Arrays.asList(matkul));
    }

    public void addListMatkul(MataKuliah matkul) {
        this.listMatkul.add(matkul);
    }
}
