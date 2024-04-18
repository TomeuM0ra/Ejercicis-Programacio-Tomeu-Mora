
public class Game {
    private int colReveled;
    private int filaReveled;
    private int colBandera;
    private int filaBandera;
    public void jugar() {
        boolean juegoTerminado = false;
        CreacioMatriu.menu();
        while (!juegoTerminado) {;
            switch (Menu.elecio()) {
                case 1:
                    System.out.println(CreacioMatriu.tablero.imprimirTablero());

                    System.out.println("Selecioni  la columna que vols revelar:");
                    this.colReveled = Menu.escaner.nextInt();
                    Menu.escaner.nextLine();
                    System.out.println("Selecioni la fila que vols revelar:");
                    this.filaReveled = Menu.escaner.nextInt();
                    Menu.escaner.nextLine();

                    if (CreacioMatriu.tablero.setRevelet(filaReveled, colReveled)) {
                        juegoTerminado = true;
                        System.out.println("Has trobat una bomba , has perdut el joc ");
                        System.out.println(CreacioMatriu.tablero.imprimirTablero());
                    } else {
                        juegoTerminado = false;
                    }
                    break;
                case 2:
                    System.out.println(CreacioMatriu.tablero.imprimirTablero());
                    System.out.println("Selecioni la columna que vols colocar la bandera: ");
                    this.colBandera = Menu.escaner.nextInt();
                    Menu.escaner.nextLine();
                    System.out.println("Selecioni la fila que vols colocar la bandera: ");
                    this.filaBandera = Menu.escaner.nextInt();
                    Menu.escaner.nextLine();

                    CreacioMatriu.tablero.colocarBandera(filaBandera,colBandera);
            }
        }
        Menu.escaner.close();
    }



}
