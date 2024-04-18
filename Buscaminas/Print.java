public class Print {
    public void printTablero(Fitxa[][] tablero){
        String imprimir = "";
        for (int fila = 0; fila < tablero.length; fila++) {
            for (int columna = 0; columna < tablero[0].length; columna++) {
                    if (tablero[fila][columna].isBandera()){
                        imprimir += "!"+ " ";
                    }else if (tablero[fila][columna].isRelevat()) {
                        if (tablero[fila][columna].isBomb()) {
                            imprimir += "X" + " ";
                        }else {
                            imprimir += tablero[fila][columna].isNumero() + " ";
                        }

                    }else {
                        imprimir += "- ";
                    }

            }
            imprimir += "\n";
        }
        System.out.println(imprimir);
    }
}