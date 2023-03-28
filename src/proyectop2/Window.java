package proyectop2;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Window extends JFrame {

  // Inicialización de la ventana
  public Window(String title) {
    // Establecer el título de la ventana
    this.setTitle(title);
    // Establecer el tamaño de la ventana
    this.setSize(750, 750);
    // Centrar ventana
    this.setLocationRelativeTo(null);
    // Terminar proceso al cerrar la ventana
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // Establecer favicon del recetario
    this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("images/arepa.png")));

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
      boton.addActionListener((ActionEvent ae) -> {
        // Ocultamos momentáneamente el menú principal
        // this.setVisible(false);

        // Crear ícono de la bandera
        ImageIcon flag = new ImageIcon(getClass().getResource("images/flag32.png"));

        // Mostrar recordatorio previo a receta
        // JOptionPane.showMessageDialog(
        //     null,
        //     "Los ingredientes pueden variar según la receta.",
        //     // Título
        //     "Recordatorio",
        //     // Ícono
        //     JOptionPane.INFORMATION_MESSAGE,
        //     null
        // );
        // Preparación
        // JOptionPane.showMessageDialog(null,
        // "<html><font·color=#e59f00>INGR</font><font·color=#001f7e>EDIE</font><font·color=#d00c27>NTES</font>:</html>\n"
        // + ""
        // Título
        // "Preparación",
        //     // Ícono
        //     JOptionPane.INFORMATION_MESSAGE
        // ,
        //     null
        // );
        switch (nombreBoton) {
          case "Reina":
            // Ingredientes
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>INGR</font><font·color=#001f7e>EDIE</font><font·color=#d00c27>NTES</font>:</b></html>\n"
                + "• Harina de maíz precocida\n"
                + "• Agua\n"
                + "• Sal al gusto\n"
                + "• Aceite o mantequilla para freír\n"
                + "• Pechuga de pollo cocida y desmenuzada\n"
                + "• Aguacate maduro\n"
                + "• Cebolla picada\n"
                + "• Cilantro picado\n"
                + "• Mayonesa\n"
                + "• Jugo de limón\n"
                + "• Pimienta al gusto",
                // Título
                "Ingredientes",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            break;
          case "Domino":
            // Ingredientes
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>INGR</font><font·color=#001f7e>EDIE</font><font·color=#d00c27>NTES</font>:</b></html>\n"
                + "• Harina de maíz precocida\n"
                + "• Agua\n"
                + "• Sal al gusto\n"
                + "• Aceite o mantequilla para freír\n"
                + "• Caraotas cocidas\n"
                + "• Queso blanco rallado",
                // Título
                "Ingredientes",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            break;
          case "Pelua":
            // Ingredientes
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>INGR</font><font·color=#001f7e>EDIE</font><font·color=#d00c27>NTES</font>:</b></html>\n"
                + "• Harina de maíz precocida\n"
                + "• Agua\n"
                + "• Sal al gusto\n"
                + "• Aceite o mantequilla para freír\n"
                + "• Queso rallado (preferiblemente queso llanero o queso blanco duro rallado)\n"
                + "• Carne de mechar\n"
                + "• Cebolla picada\n"
                + "• Tomate picado\n"
                + "• Ajo picado\n"
                + "• Pimentón picado\n"
                + "• Aceite para cocinar",
                // Título
                "Ingredientes",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            break;
          case "Quesillo":
            // Ingredientes
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>INGR</font><font·color=#001f7e>EDIE</font><font·color=#d00c27>NTES</font>:</b></html>\n"
                + "• Leche condensada\n"
                + "• Leche evaporada\n"
                + "• Huevos\n"
                + "• Azúcar\n"
                + "• Agua\n"
                + "• Esencia de vainilla",
                // Título
                "Ingredientes",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            break;
          case "Chicha":
            // Ingredientes
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>INGR</font><font·color=#001f7e>EDIE</font><font·color=#d00c27>NTES</font>:</b></html>\n"
                + "• Arroz\n"
                + "• Canela\n"
                + "• Clavos de olor\n"
                + "• Azúcar\n"
                + "• Agua\n"
                + "• Piña madura\n"
                + "• Papelón rallado o panela\n"
                + "• Levadura de cerveza",
                // Título
                "Ingredientes",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            break;
          case "Pabellon":
            // Ingredientes
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>INGR</font><font·color=#001f7e>EDIE</font><font·color=#d00c27>NTES</font>:</b></html>\n"
                + "• Carne mechada\n"
                + "• Caraotas\n"
                + "• Arroz\n"
                + "• Plátanos maduros\n"
                + "• Aceite vegetal\n"
                + "• Sal al gusto\n"
                + "• Agua",
                // Título
                "Ingredientes",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            break;
          case "Cachapa":
            // Ingredientes
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>INGR</font><font·color=#001f7e>EDIE</font><font·color=#d00c27>NTES</font>:</b></html>\n"
                + "• Mazorca de maíz fresco desgranado (alrededor de 4-5 mazorcas)\n"
                + "• Harina de maíz precocida\n"
                + "• Azúcar\n"
                + "• Sal\n"
                + "• Leche\n"
                + "• Mantequilla o aceite vegetal",
                // Título
                "Ingredientes",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            break;
          case "Pan":
            // Ingredientes
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>INGR</font><font·color=#001f7e>EDIE</font><font·color=#d00c27>NTES</font>:</b></html>\n"
                + "• Harina de trigo\n"
                + "• Agua\n"
                + "• Levadura fresca\n"
                + "• Azúcar\n"
                + "• Sal\n"
                + "• Mantequilla sin sal a temperatura ambiente\n"
                + "• Huevos\n"
                + "• Jamón cocido en rodajas\n"
                + "• Tocineta en tiras\n"
                + "• Pasas sin semillas\n"
                + "• Aceitunas verdes rellenas de pimiento",
                // Título
                "Ingredientes",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            break;
          // Patacon
          default:
            // Ingredientes
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>INGR</font><font·color=#001f7e>EDIE</font><font·color=#d00c27>NTES</font>:</b></html>\n"
                + "• Plátanos verdes firmes (2 o 3 plátanos)\n"
                + "• Aceite vegetal para freír\n"
                + "• Sal al gusto\n"
                + "• Jamón y queso rebanado\n"
                + "• Salsa al gusto\n"
                + "• Repollo rallado\n"
                + "• Pollo (también puede ser carne, tocineta u otra proteína)",
                // Título
                "Ingredientes",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            // Preparación
            break;
        }

        // Reestablecemos el menú principal nuevamente
        this.setVisible(true);
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
