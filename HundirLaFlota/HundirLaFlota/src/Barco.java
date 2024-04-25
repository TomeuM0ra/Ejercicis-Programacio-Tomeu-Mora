public class Barco {
    private boolean teBarco = false;
    private boolean teBarcoAprop = false;
    private boolean esRevelat = false;

    public void especificarBarco(){ this.teBarco = true; }
    public void voltantsBarco(){ this.teBarcoAprop = true; }
    public boolean isBarco(){ return teBarco; }
    public boolean isAprop(){ return teBarcoAprop; }
    public boolean isRevelat() { return esRevelat; }
    public void Revelar(boolean esRevelat) { this.esRevelat = esRevelat; }
}
