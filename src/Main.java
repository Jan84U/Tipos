
public class Main {
    public static void main(String argv[]){
        Tipos tiket = new Loto(6);
        tiket.zobrazCislaLoto();
        System.out.println("----------------------------------------");
        Tipos tiket2 = new EuroJackpot(5,2);
        tiket2.zobrazCislaEuro();
    }
}
