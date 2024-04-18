import java.util.Random;

public class Tablero {
    private  int FILAS;
    private  int COLUMNAS;

    private Fitxa[][] tablero;

    public  Tablero(int columna , int fila , int bombes) {
        this.COLUMNAS = columna;
        this.FILAS = fila;
        tablero = new Fitxa[FILAS][COLUMNAS];
        inicializarTablero();
        posarBombes(bombes , columna , fila);
    }

    private void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = new Fitxa();
            }
        }
    }

     protected String imprimirTablero() {
        String print = "    ";
        for (int i = 0; i < tablero.length; i++) {
            // print +=  i + " ";
        }
        print += "\n";
        for (int i = 0; i < FILAS; i++) {
            // if (i < 10){
            //     print += "0"+i + "   ";
            // } else{
            //     print += i + "   ";}
            for (int j = 0; j < COLUMNAS; j++) {
                print += tablero[i][j].print() + " ";
            }
            print += "\n";
        }
          
        return print;
    }


    protected boolean setRevelet(int fila , int columna){
        tablero[fila][columna].setRelevat();
        if ( tablero[fila][columna].getBomb()){
            return true;
        }
        return false;
    };

    private void posarBombes(int bombes , int columna , int fila){
        int bombesFinal = 0;
        while (bombesFinal < bombes) {
            Random random = new Random();
            int rcol = random.nextInt(columna+1);
            int rfila = random.nextInt(fila+1);
            if (rcol >=0 && rcol < columna && rfila  >=0 && rfila < fila ) {
                if (!tablero[rfila][rcol].getBomb()) {
                    tablero[rfila][rcol].setBomb();
                    bombesFinal++;
                }
            }
        }
    }


}
