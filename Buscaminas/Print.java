public class Print {
    public void printTablero(Fitxa[][] tablero){
        String imprimir = "";
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[0].length; columna++) {
                    if (tablero[fila][columna].isBandera()){
                        imprimir += "\033[33m!\033[0m"+ " ";
                    }else if (tablero[fila][columna].isRelevat()) {
                        if (tablero[fila][columna].isBomb()) {
                            imprimir += "\033[31mX\033[0m" + " ";
                        }else {
                            imprimir += tablero[fila][columna].isNumero() + " ";
                        }

                    }else {
                        imprimir += "\033[37m-\033[0m ";
                    }

            }
            imprimir += "\n";
        }
        Missatge.soutText(imprimir);
    }
}