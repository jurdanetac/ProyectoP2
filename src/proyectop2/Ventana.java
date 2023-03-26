package proyectop2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Ventana extends JFrame {

  // Inicialización de la ventana
  public Ventana(String title) {
    // Establecer el título de la ventana
    this.setTitle(title);
    // Establecer el tamaño de la ventana
    this.setSize(750, 750);
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
    String[] nombresBotones = {
      "Reina", "Domino", "Pelua",
      "Quesillo", "Chicha", "Pabellon",
      "Cachapa", "Pan", "Patacon"
    };

    // Iteramos por cada botón
    for (int i = 0; i < 9; i++) {
      // Crear botón "i"
      botones[i] = new JButton();
      // Hacemos que la referencia al botón seleccionado sea más sencilla
      JButton boton = botones[i];

      // Crear variable del nombre del plato, en el orden del array
      String nombreBoton = nombresBotones[i];
      // Asignar dicho nombre del respectivo plato al botón
      boton.setName(nombreBoton);

      // Establecer borde del botón "i" de color negro
      boton.setBorder(new javax.swing.border.LineBorder(Color.BLACK));

      // Crear ícono del botón
      ImageIcon icon = new ImageIcon(getClass().getResource("images/250/" + nombreBoton + ".png"));
      // Establecer ícono
      boton.setIcon(icon);

      // Agregar un oyente de click al botón
      botones[i].addActionListener((ActionEvent ae) -> {
        // System.out.println(nombreBoton);
      });

      // Anexar botón al frame
      this.add(botones[i]);
    }

    // Desactivamos la posibilidad de alterar el tamaño por defecto de la ventana
    this.setResizable(false);

    // Hacemos que la ventana sea visible
    this.setVisible(true);
  }

}
