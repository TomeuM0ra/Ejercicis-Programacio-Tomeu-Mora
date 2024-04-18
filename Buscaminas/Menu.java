import java.util.Scanner;
public class Menu {
    public  Scanner escaner = new Scanner(System.in);
    private  int elecio;
    private  int elecio1;
    private  Print print = new Print();

    public  int elecio() {
        System.out.println("Menu elecio ");
        System.out.println("1. Revelar posicio");
        System.out.println("2. Colocar Bandera");
        elecio1 =escaner.nextInt();
        escaner.nextLine();
        return elecio1;
    }

    public  int menu() {
        System.out.println("Menu");
        System.out.println("1. Super Facil");
        System.out.println("2. Facil");
        System.out.println("3. Normal");
        System.out.println("4. Difici");
        System.out.println("5. Demon"); //need a good computer
        System.out.println("Selecione modo de juego");
        elecio = escaner.nextInt();
        escaner.nextLine();
        return elecio;
    }
}
