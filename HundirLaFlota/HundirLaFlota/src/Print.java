public class Print {
    public void printTablero(Barco[][] tablero){
        String imprimir = "";
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[0].length; columna++) {
                if (tablero[fila][columna].isRevelat()) {
                    if (tablero[fila][columna].isBarco()) {
                        imprimir += "\033[31mX\033[0m" + " ";
                    }
                }else {
                    imprimir += "\033[34mS\033[0m";
                }
            }
            imprimir += "\n";
        }
        Missatge.soutText(imprimir);
    }
}