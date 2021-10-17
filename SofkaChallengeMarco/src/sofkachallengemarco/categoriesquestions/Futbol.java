package sofkachallengemarco.categoriesquestions;

import java.util.Random;
import javax.swing.JOptionPane;

public class Futbol {

    private String futbol1 = "Que significa FIFA" + "\n"
            + "1.Federación Internacional de Fútbol Asociación​" + "\n"
            + "2.Fundacion Internacional de Fútbol Asociación​" + "\n"
            + "3.Federación Intecolgegiados de Fútbol Asociación​" + "\n"
            + "4.Juego de Electronic Arts el cual sale cada año" + "\n" + "\n"
            + "5.Salir del juego";

    private String futbol2 = "Cada cuanto se celebra un mundial de futbol" + "\n"
            + "1.6 años" + "\n"
            + "2.3 años" + "\n"
            + "3.2 años" + "\n"
            + "4.4 años" + "\n" + "\n"
            + "5.Salir del juego";

    private String futbol3 = "Cual es la nacionalidad del famoso futbolista Cristiano Ronaldo dos Santos Aveiro alias El Bicho" + "\n"
            + "1.Argentino" + "\n"
            + "2.Español" + "\n"
            + "3.Italiano" + "\n"
            + "4.Portugues" + "\n" + "\n"
            + "5.Salir del juego";

    private String futbol4 = "Cual es el campeon del mundial 1986 celebrado en Mexico " + "\n"
            + "1.Inglaterra" + "\n"
            + "2.Argentina" + "\n"
            + "3.Alemania" + "\n"
            + "4.Brasil" + "\n" + "\n"
            + "5.Salir del juego";

    private String futbol5 = "Quien es el autor del gol apodado 'La Mano de Dios' " + "\n"
            + "1.Pele" + "\n"
            + "2.Lionel Andres Messi" + "\n"
            + "3.Diego Armando Maradona" + "\n"
            + "4.Paul Pogba" + "\n" + "\n"
            + "5.Salir del juego";

    public void Cuestionario() {

        Random random = new Random();
        int numeroAleatorio;
        String[] preguntasFutbol = new String[5];
        int[] respuestasFutbol = new int[5];
        int opcion;

        preguntasFutbol[0] = futbol1;
        preguntasFutbol[1] = futbol2;
        preguntasFutbol[2] = futbol3;
        preguntasFutbol[3] = futbol4;
        preguntasFutbol[4] = futbol5;

        respuestasFutbol[0] = 1;
        respuestasFutbol[1] = 4;
        respuestasFutbol[2] = 4;
        respuestasFutbol[3] = 2;
        respuestasFutbol[4] = 3;

        numeroAleatorio = random.nextInt(5);

        for (int i = 0; i < 1; i++) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntasFutbol[numeroAleatorio]));

            if (opcion == 5) {
                JOptionPane.showMessageDialog(null, "Bueno Adios");
                System.exit(0);
            }

            if (!(opcion == respuestasFutbol[numeroAleatorio])) {
                JOptionPane.showMessageDialog(null, "Ups Fallaste, te vas con 0 Pesos");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Muy bien");
            }
        }

    }
}
