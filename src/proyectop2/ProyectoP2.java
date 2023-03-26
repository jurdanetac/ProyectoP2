package proyectop2;

import javax.swing.JOptionPane;

public class ProyectoP2 {

  // Aquí comienza la ejecución del programa
  public static void main(String[] args) {

    // Correo
    JOptionPane.showMessageDialog(null,
        "Hola",
        "Título",
        JOptionPane.INFORMATION_MESSAGE,
        null
    );

    // Creamos el objeto de la ventana principal
    Ventana ventana = new Ventana("Recetario");
  }
}
