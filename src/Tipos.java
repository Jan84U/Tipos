import java.util.ArrayList;
import java.util.Collections;

public class Tipos {
    protected int pocetHlavnePole;
    protected int pocetVedlajsiePole;

    public Tipos(int pocetHlavnePole, int pocetVedlajsiePole) {
        this.pocetHlavnePole = pocetHlavnePole;
        this.pocetVedlajsiePole = pocetVedlajsiePole;
    }

    public Tipos(int pocetHlavnePole){
        this.pocetHlavnePole = pocetHlavnePole;
    }

    public void zobrazCislaLoto(){
        Tipos tiket = new Loto(pocetHlavnePole);
        ArrayList<Integer> cisla= ((Loto) tiket).vratHlavnePole();
        Collections.sort(cisla);
        int i = 1;
        for (int r:cisla) {
            System.out.println(i+". cislo je: "+r);
            i++;
        }
    }

    public void zobrazCislaEuro(){
        Tipos tiket = new EuroJackpot(pocetHlavnePole,pocetVedlajsiePole);
        ArrayList<Integer> cisla = ((EuroJackpot) tiket).vratHlavnePole();
        ArrayList<Integer> cisla2= ((EuroJackpot) tiket).vratVedlajsiePole();
        Collections.sort(cisla);
        Collections.sort(cisla2);
        int i = 1;
        for (int r:cisla) {
            System.out.println(i+". cislo je: "+r);
            i++;
        }
        int l = 1;
        for (int r:cisla2) {
            System.out.println(l+". cislo je: "+r);
            l++;
        }
    }

}
