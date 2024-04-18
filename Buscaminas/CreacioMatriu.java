public class CreacioMatriu {
    public static Tablero tablero;

        public static void menu() {
            System.out.println("Anam A comenchar");
            switch (Menu.menu()) {
                case 1:
                    System.out.println("Has elegit el mode Super Facil , anam a començar");
                    tablero = new Tablero(11, 11, 25);
                    break;
                case 2:
                    System.out.println("Has elegit el mode  Facil , anam a començar");
                    tablero = new Tablero(25, 25, 100);
                    break;
                case 3:
                    System.out.println("Has elegit el mode Normal , anam a començar");
                    tablero = new Tablero(50, 50, 200);
                    break;
                case 4:
                    System.out.println("Has elegit el mode Dificil , anam a començar");
                    tablero = new Tablero(99, 99, 300);
                    break;
                case 5:
                    System.out.println("Has elegit el mode Demon , anam a començar");
                    tablero = new Tablero(999, 999, 777);
                    break;
                case 6:
                    System.out.println("modo desarroyo");
                    tablero = new Tablero(5, 5, 5);
                default:
                    break;
            }
        }
}
