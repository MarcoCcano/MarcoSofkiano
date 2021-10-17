
package sofkachallengemarco.categoriesquestions;

import java.util.Random;
import javax.swing.JOptionPane;

public class Animales {
    private String animales1 = "Cual es el animal terrestre mas veloz al correr" + "\n"
            + "1.Chita" + "\n"
            + "2.Leopardo" + "\n"
            + "3.Lince" + "\n"
            + "4.Lobo" + "\n" + "\n"
            + "5.Salir del juego";

    private String animales2 = "Cual es el mamifero mas grande de la tierra" + "\n"
            + "1.Elefante" + "\n"
            + "2.Jirafa" + "\n"
            + "3.Ballena Azul" + "\n"
            + "4.Oso" + "\n" + "\n"
            + "5.Salir del juego";

    private String animales3 = "Cual es el ancestro del perro" + "\n"
            + "1.Zorro" + "\n"
            + "2.Lince" + "\n"
            + "3.Hiena" + "\n"
            + "4.Lobo" + "\n" + "\n"
            + "5.Salir del juego";

    private String animales4 = "Cual animal es conocido como el Rey de la selva" + "\n"
            + "1.Tigre" + "\n"
            + "2.Leon" + "\n"
            + "3.Serpiente" + "\n"
            + "4.Gorila" + "\n" + "\n"
            + "5.Salir del juego";

    private String animales5 = "Cual es el numero de estomagos de un rumiante" + "\n"
            + "1.Tres" + "\n"
            + "2.Cuatro" + "\n"
            + "3.Dos" + "\n"
            + "4.Uno" + "\n" + "\n"
            + "5.Salir del juego";

    public void Cuestionario() {

        Random random = new Random();
        int numeroAleatorio;
        String[] preguntasAnimales = new String[5];
        int[] respuestasAnimales = new int[5];
        int opcion;

        preguntasAnimales[0] = animales1;
        preguntasAnimales[1] = animales2;
        preguntasAnimales[2] = animales3;
        preguntasAnimales[3] = animales4;
        preguntasAnimales[4] = animales5;

        respuestasAnimales[0] = 1;
        respuestasAnimales[1] = 3;
        respuestasAnimales[2] = 4;
        respuestasAnimales[3] = 2;
        respuestasAnimales[4] = 1;

        numeroAleatorio = random.nextInt(5);

        for (int i = 0; i < 1; i++) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntasAnimales[numeroAleatorio]));

            if (opcion == 5) {
                JOptionPane.showMessageDialog(null, "Bueno Adios");
                System.exit(0);
            }

            if (!(opcion == respuestasAnimales[numeroAleatorio])) {
                JOptionPane.showMessageDialog(null, "Ups Fallaste, te vas con 0 Pesos");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Muy bien");
            }
        }

    }
    
}
