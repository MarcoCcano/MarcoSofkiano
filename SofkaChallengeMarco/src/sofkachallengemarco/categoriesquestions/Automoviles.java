
package sofkachallengemarco.categoriesquestions;

import java.util.Random;
import javax.swing.JOptionPane;


public class Automoviles {
        private String automoviles1 = "Cual es el color mas comun para un auto Ferrari" + "\n"
            + "1.Azul" + "\n"
            + "2.Negro" + "\n"
            + "3.Gris" + "\n"
            + "4.Rojo" + "\n" + "\n"
            + "5.Salir del juego";

    private String automoviles2 = "A que pais pertenece la marca Mazda" + "\n"
            + "1.Inglaterra" + "\n"
            + "2.Japon" + "\n"
            + "3.Alemania" + "\n"
            + "4.Colombia" + "\n" + "\n"
            + "5.Salir del juego";

    private String automoviles3 = "Cual es la herramienta que lleva el nombre de un animal y se usa para levantar un carro" + "\n"
            + "1.Zorro" + "\n"
            + "2.Lince" + "\n"
            + "3.Gato" + "\n"
            + "4.Tigre" + "\n" + "\n"
            + "5.Salir del juego";

    private String automoviles4 = "Cual es el nombre de la persona que tiene el titulo de 'El Padre del Automovil'" + "\n"
            + "1.Karl Benz " + "\n"
            + "2.Stephen Hawking" + "\n"
            + "3.Albert Einstein" + "\n"
            + "4.Isaac Newton" + "\n" + "\n"
            + "5.Salir del juego";

    private String automoviles5 = "Cual es la abreviatura de La Federación Internacional del Automóvil" + "\n"
            + "1.FIFA" + "\n"
            + "2.NBA" + "\n"
            + "3.NFS" + "\n"
            + "4.FIA" + "\n" + "\n"
            + "5.Salir del juego";

    public void Cuestionario() {

        Random random = new Random();
        int numeroAleatorio;
        String[] preguntasAutomoviles = new String[5];
        int[] respuestasAutomoviles = new int[5];
        int opcion;

        preguntasAutomoviles[0] = automoviles1;
        preguntasAutomoviles[1] = automoviles2;
        preguntasAutomoviles[2] = automoviles3;
        preguntasAutomoviles[3] = automoviles4;
        preguntasAutomoviles[4] = automoviles5;

        respuestasAutomoviles[0] = 4;
        respuestasAutomoviles[1] = 2;
        respuestasAutomoviles[2] = 3;
        respuestasAutomoviles[3] = 1;
        respuestasAutomoviles[4] = 4;

        numeroAleatorio = random.nextInt(5);

        for (int i = 0; i < 1; i++) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntasAutomoviles[numeroAleatorio]));

            if (opcion == 5) {
                JOptionPane.showMessageDialog(null, "Bueno...Adios");
                System.exit(0);
            }

            if (!(opcion == respuestasAutomoviles[numeroAleatorio])) {
                JOptionPane.showMessageDialog(null, "Ups Fallaste, te vas con 0 Pesos");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Muy bien");
            }
        }

    }
    
}
