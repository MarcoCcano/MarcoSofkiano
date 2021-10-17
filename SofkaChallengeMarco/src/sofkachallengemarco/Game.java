package sofkachallengemarco;

import javax.swing.JOptionPane;
import sofkachallengemarco.categoriesquestions.Animales;
import sofkachallengemarco.categoriesquestions.Automoviles;
import sofkachallengemarco.categoriesquestions.Futbol;
import sofkachallengemarco.categoriesquestions.Historia;
import sofkachallengemarco.categoriesquestions.Technology;

public class Game {

    static Technology technology = new Technology();
    static Futbol futbol = new Futbol();
    static Animales animales = new Animales();
    static Historia historia = new Historia();
    static Automoviles automoviles = new Automoviles();
    static String nombre;
    static int opcion;

    public static Game Concurso() {
        JOptionPane.showMessageDialog(null, "Hola, Bienvenido al concurso de Preguntas y Respuestas..." + "\n"
                + "El juego funciona de la Siguiente Manera" + "\n"
                + "-Consta de 5 rondas, donde en cada ronda tendras que responder a una pregunta en especifico dependiendo el nivel de la categoria" + "\n"
                + "-Cada vez que respondas correctamente una pregunta, el nivel de dificultad ira ascendiendo" + "\n"
                + "-Cada categoria esta asociada a un nivel de Dificultad como se muestra aqui nombradas" + "\n"
                + "Animales(MuyFacil)-Futbol(Facil)-Tecnologia(Normal)--Automoviles(Dificil)-Historia(Avanzado)" + "\n"
                + "-Iras sumando puntos cada vez que aciertes correctamente una pregunta(La puntuacion varia segun el nivel de dificultad de la pregunta)" + "\n"
                + "-El juego te dara la oportunidad de retirarte cada vez que respondas a una pregunta correctamente y asi llevarte tu premio acomulado" + "\n"
                + "-Si por el contrario 'FALLAS' al responder una pregunta o te rindes en mitad de una, perderas todos los puntos acomulados");

        opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas Jugar?" + "\n"
                + "\n" + "1.Si,Adelante" + "\n"
                + "2.No,Me dio Tuto :<"));
        switch (opcion) {
            case 1:
                int contador = 0;
                nombre = JOptionPane.showInputDialog("Antes dinos tu nombre");
                JOptionPane.showMessageDialog(null, "Genial " + nombre + ", Comencemos");
                JOptionPane.showMessageDialog(null, "Por 10 Millones de pesos");
                JOptionPane.showMessageDialog(null, "ANIMALES");
                animales.Cuestionario();
                contador = contador + 10;
                opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas seguir jugando?" + "\n"
                        + "\n"
                        + "1.Si" + "\n"
                        + "2.No"));

                switch (opcion) {
                    case 1:
                        JOptionPane.showMessageDialog(null, "Por 40 Millones de pesos");
                        JOptionPane.showMessageDialog(null, "FUTBOL");
                        futbol.Cuestionario();
                        contador = contador + 30;
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas seguir jugando?" + "\n"
                                + "\n"
                                + "1.Si" + "\n"
                                + "2.No"));

                        switch (opcion) {
                            case 1:
                                JOptionPane.showMessageDialog(null, "Por 80 Millones de pesos");
                                JOptionPane.showMessageDialog(null, "TECNOLOGIA");
                                technology.Cuestionario();
                                contador = contador + 40;
                                opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Deseas seguir jugando?" + "\n"
                                        + "\n"
                                        + "1.Si" + "\n"
                                        + "2.No"));
                                switch (opcion) {
                                    case 1:
                                        JOptionPane.showMessageDialog(null, "Genial Ya casi lo tienes, pero se va a poner dificil");
                                        JOptionPane.showMessageDialog(null, "Por 130 Millones de pesos");
                                        JOptionPane.showMessageDialog(null, "AUTOMOVILES");
                                        automoviles.Cuestionario();
                                        contador = contador + 50;
                                        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ultima oportunidad, puedes irte con tu premio actual, o....Arriesgarlo todo" + "n"
                                                + "¿Deseas seguir jugando?" + "\n"
                                                + "\n"
                                                + "1.Si" + "\n"
                                                + "2.No"));

                                        switch (opcion) {
                                            case 1:
                                                JOptionPane.showMessageDialog(null, "Solo estas a una...");
                                                JOptionPane.showMessageDialog(null, "...");
                                                JOptionPane.showMessageDialog(null, "......");
                                                JOptionPane.showMessageDialog(null, "Por 200 Millones de pesos");
                                                JOptionPane.showMessageDialog(null, "THE LAST");
                                                JOptionPane.showMessageDialog(null, "HISTORIA");
                                                historia.Cuestionario();
                                                contador = contador + 80;
                                                JOptionPane.showMessageDialog(null, "Felicidades " + nombre + " Te has llevado el premio mayor" + "\n"
                                                        + "Te llevas nada mas y nada menos que.. " + contador + " Millones de pesos" + "\n"
                                                        + "Muchas Felicidades..y gracias por jugar");
                                                JOptionPane.showMessageDialog(null, "Hasta la proxima");
                                                System.exit(0);

                                            case 2:
                                                JOptionPane.showMessageDialog(null, "Estubiste cerca" + nombre + " Te vas con " + contador + " Millones de pesos" + "\n"
                                                        + "\n" + "ADIOS");
                                                System.exit(0);
                                                break;

                                        }

                                    case 2:
                                        JOptionPane.showMessageDialog(null, nombre + " Te vas con " + contador + " Millones de pesos" + "\n"
                                                + "\n" + "ADIOS");
                                        System.exit(0);

                                        break;

                                }

                            case 2:
                                JOptionPane.showMessageDialog(null, nombre + " Te vas con " + contador + " Millones de pesos" + "\n"
                                        + "\n" + "ADIOS");
                                System.exit(0);

                        }

                    case 2:
                        JOptionPane.showMessageDialog(null, nombre + " Te vas con " + contador + " Millones de pesos" + "\n"
                                + "\n" + "ADIOS");
                        System.exit(0);

                }

                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Esta bien T.T Sera para otra ocacion..." + "\n"
                        + "\n" + "             ADIOS   ");
                System.exit(0);
            default:

        }

        return Game.Concurso();
    }
}
