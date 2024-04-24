public class Barco {
    private boolean teBarco = false;
    private boolean teBarcoAprop = false;

    public void especificarBarco(){
        this.teBarco = true;
    }

    public void voltantsBarco(){
        this.teBarcoAprop = true;
    }

    public boolean isBarco(){
        return teBarco;
    }
    public boolean isAprop(){
        return teBarcoAprop;
    }
}
