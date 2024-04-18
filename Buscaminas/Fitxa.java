public class Fitxa {
    private boolean esBomba = false;
    private boolean esRelevat = false;
    private int esNumero = 0;
    private boolean bandera = false;

    public boolean isBandera() {return bandera;}

    public boolean isBomb() {
        return esBomba;
    }

    public boolean isRelevat() {
        return esRelevat;
    }

    public int isNumero() {
        return esNumero;
    }

    public void setBandera(){this.bandera = true;}

    public void setBomb() {
        this.esBomba = true;
    }

    public void setRelevat() {
        this.esRelevat = true;
    }

    public void Destepat(int num){
        this.esNumero = num;
    }

    // millor toString i logica I/O a una altra classe
    public String print() {
        if (!esRelevat) {
            return "-";
        }

        if (esBomba) {
            return "X";
        }
        return String.valueOf(esNumero);

    }

}
