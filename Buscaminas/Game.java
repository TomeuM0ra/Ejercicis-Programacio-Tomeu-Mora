
public class Game {
    private int colReveled;
    private int filaReveled;
    private int colBandera;
    private int filaBandera;
    private int totalBanderes = 0;
    private Print print = new Print();
    private CreacioMatriu matriu = new CreacioMatriu();
    private Menu menu = new Menu();
    public void jugar() {
        boolean juegoTerminado = false;
        matriu.menu();
        while (!juegoTerminado) {;
            print.printTablero(matriu.tablero.istablero());
            switch (menu.elecio()) {
                case 1:
                   print.printTablero(matriu.tablero.istablero());

                    System.out.println("Selecioni  la columna que vols revelar:");
                    this.colReveled = Menu.escaner.nextInt();
                    Menu.escaner.nextLine();
                    System.out.println("Selecioni la fila que vols revelar:");
                    this.filaReveled = Menu.escaner.nextInt();
                    Menu.escaner.nextLine();

                    if (matriu.tablero.setRevelet(filaReveled, colReveled)) {
                        juegoTerminado = true;
                        System.out.println("Has trobat una bomba , has perdut el joc ");
                        print.printTablero(matriu.tablero.istablero());
                    } else {
                        juegoTerminado = false;
                    }
                    break;
                case 2:
                    if (totalBanderes < matriu.getTotalBomes()){
                    print.printTablero(matriu.tablero.istablero());
                    System.out.println("Selecioni la columna que vols colocar la bandera: ");
                    this.colBandera = Menu.escaner.nextInt();
                    Menu.escaner.nextLine();
                    System.out.println("Selecioni la fila que vols colocar la bandera: ");
                    this.filaBandera = Menu.escaner.nextInt();
                    Menu.escaner.nextLine();
                    matriu.tablero.colocarBandera(filaBandera,colBandera);
                    totalBanderes++;
                    break;
                    } else {
                        System.out.println("Has alcalzat el maxim de banderes ");
                        break;
                    }
            }
        }

        Menu.escaner.close();
    }



}
