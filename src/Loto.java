import java.util.ArrayList;
import java.util.Random;

public class Loto extends Tipos {
    private ArrayList<Integer> cislaHlavne = new ArrayList<>();
    Random random = new Random();


    public Loto(int pocetHlavnePole) {
        super(pocetHlavnePole);
    }

    public ArrayList<Integer> vratHlavnePole(){
        for(int i=0;i<pocetHlavnePole;i++){
            int a;
            do{
                a = random.nextInt(48) + 1;
            }while(cislaHlavne.contains(a));
            cislaHlavne.add(a);
        }
        return cislaHlavne;
    }
}
