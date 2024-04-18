public class Print {
    static Fitxa fitxa = new Fitxa();
    public static String pintar() {
        if (fitxa.isBandera()){
            return "!";
        }

        if (!fitxa.isRelevat()) {
            return "-";
        }

        if (fitxa.isBomb()) {
            return "X";
        }

        return String.valueOf(fitxa.isNumero());

    }
}
