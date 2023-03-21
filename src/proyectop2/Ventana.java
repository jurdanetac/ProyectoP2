
package proyectop2;

import javax.swing.*;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame {
  // Inicialización de la ventana
  public Ventana(String title) {
    // Establecer el título de la ventana
    this.setTitle(title);
    // Hacemos que la ventana sea visible
    this.setVisible(true);
    // Establecer el tamaño de la ventana
    this.setSize(602, 602);
    // Centrar ventana
    this.setLocationRelativeTo(null);
    // Terminar proceso al cerrar la ventana
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Crear distribución de la ventana, tres filas por tres columnas
    GridLayout grid = new GridLayout(3, 3);
    // Establecer la distribución de la ventana
    this.setLayout(grid);

    // Creamos un arreglo para almacenar todos los botones del frame
    JButton[] botones = new JButton[9];

    // Iteramos por cada botón
    for (int i = 0; i < 9; i++)
    {
      // Crear botón "i"
      botones[i] = new JButton();
      // Establecer borde del botón "i" de color negro
      botones[i].setBorder(new LineBorder(Color.BLACK));
      // Anexar botón al frame
      this.add(botones[i]);
    }

    // Desactivamos la posibilidad de alterar el tamaño por defecto de la ventana
    this.setResizable(false);
  }
}
