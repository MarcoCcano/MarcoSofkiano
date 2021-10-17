
package sofkachallengemarco.categoriesquestions;

import java.util.Random;
import javax.swing.JOptionPane;


public class Historia {
    
    private String historia1 = "Cual es la nacionalidad de Simon Bolivar" + "\n"
            + "1.Colombiano" + "\n"
            + "2.Venezolano" + "\n"
            + "3.Ecuatoriano" + "\n"
            + "4.Español" + "\n" + "\n"
            + "5.Salir del juego";

    private String historia2 = "En que año se descubrio America" + "\n"
            + "1.1492" + "\n"
            + "2.1500" + "\n"
            + "3.1810" + "\n"
            + "4.1460" + "\n" + "\n"
            + "5.Salir del juego";

    private String historia3 = "Cómo se llamaba el primer Presidente de los Estados Unidos" + "\n"
            + "1.John Adams" + "\n"
            + "2.Abraham Lincoln" + "\n"
            + "3.George Washington" + "\n"
            + "4.Thomas Jefferson" + "\n" + "\n"
            + "5.Salir del juego";

    private String historia4 = "Cual es el nombre del jefe del partido Nazi" + "\n"
            + "1.Napoleón Bonaparte" + "\n"
            + "2.Lenin" + "\n"
            + "3.Abraham Lincoln" + "\n"
            + "4.Adolf Hitler" + "\n" + "\n"
            + "5.Salir del juego";

    private String historia5 = "Quien descubrio america" + "\n"
            + "1.Rodrigo Borgia" + "\n"
            + "2.Policarpa Salavarrieta" + "\n"
            + "3.Cristóbal Colón" + "\n"
            + "4.Leonardo da Vinci" + "\n" + "\n"
            + "5.Salir del juego";

    public void Cuestionario() {

        Random random = new Random();
        int numeroAleatorio;
        String[] preguntasHistoria = new String[5];
        int[] respuestasHistoria = new int[5];
        int opcion;

        preguntasHistoria[0] = historia1;
        preguntasHistoria[1] = historia2;
        preguntasHistoria[2] = historia3;
        preguntasHistoria[3] = historia4;
        preguntasHistoria[4] = historia5;

        respuestasHistoria[0] = 2;
        respuestasHistoria[1] = 1;
        respuestasHistoria[2] = 3;
        respuestasHistoria[3] = 4;
        respuestasHistoria[4] = 3;

        numeroAleatorio = random.nextInt(5);

        for (int i = 0; i < 1; i++) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntasHistoria[numeroAleatorio]));

            if (opcion == 5) {
                JOptionPane.showMessageDialog(null, "Bueno Adios");
                System.exit(0);
            }

            if (!(opcion == respuestasHistoria[numeroAleatorio])) {
                JOptionPane.showMessageDialog(null, "Ups Fallaste, te vas con 0 Pesos");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Muy bien");
            }
        }

    }
    
}
