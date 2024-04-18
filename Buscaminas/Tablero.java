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
        countBombs();
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
       if (tablero[fila][columna].isBandera()){
           return false;
       }

        tablero[fila][columna].setRelevat();


        if ( tablero[fila][columna].isBomb()){
            return true;
        }
            if (tablero[fila][columna].isNumero()==0){
            revelArea(fila , columna);}
            return false;

    };

    private void posarBombes(int bombes , int columna , int fila){
        int bombesFinal = 0;
        while (bombesFinal < bombes) {
            Random random = new Random();
            int rcol = random.nextInt(columna+1);
            int rfila = random.nextInt(fila+1);
            if (checkArea(rcol, rfila)) {
                if (!tablero[rfila][rcol].isBomb()) {
                    tablero[rfila][rcol].setBomb();
                    bombesFinal++;
                }
            }
        }
    }
    private void countBombs(){
        for (int row = 0; row < FILAS; row++) {
            for (int col = 0; col < COLUMNAS; col++) {
                tablero[row][col].Destepat(teBombaAprop(row, col));
            }
        }
    }

    private  void revelArea(int cordX , int cordY){
        for (int row = cordX-1; row < cordX+2; row++) {
            for (int column = cordY-1; column < cordY+2; column++) {
                if (checkArea(column, row)) {
                    if (!tablero[row][column].isRelevat()) {
                    if (!tablero[row][column].isBomb()){
                        if (!tablero[row][column].isBandera()){
                        tablero[row][column].setRelevat();
                        if (tablero[row][column].isNumero()==0) {
                            revelArea(row , column);
                        }
                    }
                    }
                    }
                }
            }
        }
    }

    private int teBombaAprop(int fila , int columna){
        int bombCount = 0;
        for (int row = fila-1; row < fila+2; row++) {
            for (int column = columna-1; column < columna+2; column++) {
                if (checkArea(column, row)) {
                    if (tablero[row][column].isBomb()) {
                        bombCount++;
                    }
                }
            }
        }
        return bombCount;
    }

    private boolean  checkArea(int column , int row){
        return column >= 0 && column < this.COLUMNAS && row >= 0 && row < this.FILAS;
    }

    public void colocarBandera(int fila , int columna){
        if (checkArea(fila, columna)){
            tablero[fila][columna].setBandera();
        }
    }
}
