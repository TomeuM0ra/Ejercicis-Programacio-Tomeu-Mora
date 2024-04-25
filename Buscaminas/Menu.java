import java.util.Scanner;
public class Menu {
    public static Scanner escaner = new Scanner(System.in);

    public  int elecio() {
        int elecio;
        Missatge.soutText("Menu elecio ");
        Missatge.soutText("1. Revelar posicio");
        Missatge.soutText("2. Colocar Bandera");
        elecio =escaner.nextInt();
        escaner.nextLine();
        return elecio;
    }

    public  int menu() {
        int elecio;
        Missatge.soutText("Menu");
        Missatge.soutText("1. Super Facil");
        Missatge.soutText("2. Facil");
        Missatge.soutText("3. Normal");
        Missatge.soutText("4. Difici");
        Missatge.soutText("5. Demon");  //need a good computer
        Missatge.soutText("Selecione modo de juego");
        elecio = escaner.nextInt();
        escaner.nextLine();
        return elecio;
    }
}
