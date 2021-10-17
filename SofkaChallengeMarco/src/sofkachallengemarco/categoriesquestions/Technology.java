package sofkachallengemarco.categoriesquestions;

import java.util.Random;
import javax.swing.JOptionPane;

public class Technology {
    
    private String tecnologia1 = "Cual es el celular de la Manzanita" + "\n"
            + "1. Motorola" + "\n"
            + "2. Xiaomi" + "\n"
            + "3. iPhone" + "\n"
            + "4. Samsung" + "\n" + "\n"
            + "5.Salir del juego";
    
    private String tecnologia2 = "Cual es el sistema operativo mas usado en usuarios de PC" + "\n"
            + "1.Linux" + "\n"
            + "2.Mac OS" + "\n"
            + "3.Windows" + "\n"
            + "4.Chrome OS" + "\n" + "\n"
            + "5.Salir del juego";
    
    private String tecnologia3 = "Cual es la Cripto moneda mas conocida" + "\n"
            + "1.Bitcoin" + "\n"
            + "2.Euro" + "\n"
            + "3.LiteCoin" + "\n"
            + "4.Yenes" + "\n" + "\n"
            + "5.Salir del juego";
    
    private String tecnologia4 = "Cual es el creador de facebook" + "\n"
            + "1.Mark Zuckerberg" + "\n"
            + "2.Tom Holland" + "\n"
            + "3.Bill Gates" + "\n"
            + "4.Steve Jobs" + "\n" + "\n"
            + "5.Salir del juego";
    
    private String tecnologia5 = "Pais originario de la marca Xiaomi" + "\n"
            + "1.China" + "\n"
            + "2.Japon" + "\n"
            + "3.Korea" + "\n"
            + "4.Taiwan" + "\n" + "\n"
            + "5.Salir del juego";
    
    public void Cuestionario() {
        
        Random random = new Random();
        int numeroAleatorio;
        String preguntasTecnologia[] = new String[5];
        int respuestasTecnologia[] = new int[5];
        int opcion;
        
        preguntasTecnologia[0] = tecnologia1;
        preguntasTecnologia[1] = tecnologia2;
        preguntasTecnologia[2] = tecnologia3;
        preguntasTecnologia[3] = tecnologia4;
        preguntasTecnologia[4] = tecnologia5;
        
        respuestasTecnologia[0] = 3;
        respuestasTecnologia[1] = 3;
        respuestasTecnologia[2] = 1;
        respuestasTecnologia[3] = 1;
        respuestasTecnologia[4] = 1;
        
        numeroAleatorio = random.nextInt(5);
        
        for (int i = 0; i < 1; i++) {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(preguntasTecnologia[numeroAleatorio]));
            
            if (opcion == 5) {
                JOptionPane.showMessageDialog(null, "Bueno Adios");
                System.exit(0);
            }
            
            if (!(opcion == respuestasTecnologia[numeroAleatorio])) {
                JOptionPane.showMessageDialog(null, "Ups Fallaste, te vas con 0 Pesos");
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "Muy bien");
            }
        }
        
    }
    
}
