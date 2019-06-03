import java.util.ArrayList;
import java.util.Random;

public class EuroJackpot extends Tipos{
    private ArrayList<Integer> cislaHlavne = new ArrayList<>();
    private ArrayList<Integer> cislaVedlajsie = new ArrayList<>();
    Random random = new Random();

    public EuroJackpot(int pocetHlavnePole, int pocetVedlajsiePole) {
        super(pocetHlavnePole, pocetVedlajsiePole);
    }

    public ArrayList<Integer> vratHlavnePole(){
        for(int i=0;i<pocetHlavnePole;i++){
            int a;
            do{
                a = random.nextInt(49) + 1;
            }while(cislaHlavne.contains(a));
            cislaHlavne.add(a);
        }
        return cislaHlavne;
    }

    public ArrayList<Integer> vratVedlajsiePole(){
        for(int i=0;i<pocetVedlajsiePole;i++){
            int a;
            do{
                a = random.nextInt(9)+1;
            }while(cislaVedlajsie.contains(a));
            cislaVedlajsie.add(a);
        }
        return cislaVedlajsie;
    }
}
