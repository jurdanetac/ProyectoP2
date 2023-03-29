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
        this.setVisible(false);

        // Crear ícono de la bandera
        ImageIcon flag = new ImageIcon(getClass().getResource("images/flag32.png"));

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
                "Ingredientes - Reina Pepiada",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            // Preparación
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>PREP</font><font·color=#001f7e>ARA</font><font·color=#d00c27>CIÓN</font>:</b></html>\n\n"
                + "<html><b>1.</b> En un tazón, mezcla 2 tazas de harina de maíz precocida, 1 cucharadita de sal y 2 tazas de agua.</html>\n\n"
                + "<html><b>2.</b> Amasa hasta que la masa quede suave y homogénea.</html>\n\n"
                + "<html><b>3.</b> Forma bolas de masa del tamaño de una pelota de golf y aplánalas con las manos para formar las arepas.</html>\n\n"
                + "<html><b>4.</b> Calienta una sartén o plancha a fuego medio-alto y añade una cucharada de aceite o mantequilla.</html>\n\n"
                + "<html><b>5.</b> Coloca las arepas en la sartén y fríelas durante 5 minutos por cada lado o hasta que estén doradas y crujientes.</html>\n\n"
                + "<html><b>6.</b> Mientras tanto, en un tazón, mezcla la pechuga de pollo desmenuzada, el aguacate maduro machacado y la cebolla picada.</html>\n\n"
                + "<html><b>7.</b> Añada el cilantro picado, 2 cucharadas de mayonesa, 1 cucharada de jugo de limón, sal y pimienta al gusto.</html>\n\n"
                + "<html><b>8.</b> Mezcla hasta conseguir una consistencia homogénea.</html>\n\n"
                + "<html><b>9.</b> Una vez que las arepas estén listas, córtalas por la mitad y rellena con la mezcla de pollo y aguacate.</html>\n\n"
                + "<html><b>Sirve <font·color=#ed944d>caliente</font> y disfruta!</b></html>",
                // Título
                "Preparación - Reina Pepiada",
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
                "Ingredientes - Dominó",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            // Preparación
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>PREP</font><font·color=#001f7e>ARA</font><font·color=#d00c27>CIÓN</font>:</b></html>\n\n"
                + "<html><b>1.</b> En un tazón, mezcla 2 tazas de harina de maíz precocida, 1 cucharadita de sal y 2 tazas de agua.</html>\n\n"
                + "<html><b>2.</b> Amasa hasta que la masa quede suave y homogénea.</html>\n\n"
                + "<html><b>3.</b> Forma bolas de masa del tamaño de una pelota de golf y aplánalas con las manos para formar las arepas.</html>\n\n"
                + "<html><b>4.</b> Calienta una sartén o plancha a fuego medio-alto y añade una cucharada de aceite o mantequilla.</html>\n\n"
                + "<html><b>5.</b> Coloca las arepas en la sartén y fríelas durante 5 minutos por cada lado o hasta que estén doradas y crujientes.</html>\n\n"
                + "<html><b>6.</b> Mientras tanto, enjuaga y escurre las caraotas cocidas.</html>\n\n"
                + "<html><b>7.</b> Una vez que las arepas estén listas, corta cada una por la mitad y añade las caraotas y el queso blanco rallado en su interior.</html>\n\n"
                + "<html><b>Sirve <font·color=#ed944d>caliente</font> y disfruta!</b></html>",
                // Título
                "Preparación - Dominó",
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
                "Ingredientes - Pelúa",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            // Preparación
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>PREP</font><font·color=#001f7e>ARA</font><font·color=#d00c27>CIÓN</font>:</b></html>\n\n"
                + "<html><b>1. </b> En un tazón, mezcla 2 tazas de harina de maíz precocida, 1 cucharadita de sal y 2 tazas de agua.</html>\n\n"
                + "<html><b>2. </b> Amasa hasta que la masa quede suave y homogénea.</html>\n\n"
                + "<html><b>3. </b> Forma bolas de masa del tamaño de una pelota de golf y aplánalas con las manos para formar las arepas.</html>\n\n"
                + "<html><b>4. </b> Calienta una sartén o plancha a fuego medio-alto y añade una cucharada de aceite o mantequilla.</html>\n\n"
                + "<html><b>5. </b> Coloca las arepas en la sartén y fríelas durante 5 minutos por cada lado o hasta que estén doradas y crujientes.</html>\n\n"
                + "<html><b>6. </b> Mientras tanto, en una sartén aparte, calienta un poco de aceite y sofríe la cebolla, el ajo y el pimentón hasta que estén tiernos.</html>\n\n"
                + "<html><b>7. </b> Desmenuza la carne de mechar en tiras y agrégalo al sartén.</html>\n\n"
                + "<html><b>8. </b>Añade el tomate picado y sazona con sal y pimienta al gusto.</html>\n\n"
                + "<html><b>9. </b>Cocina por 5 minutos más.</html>\n\n"
                + "<html><b>10. </b>Una vez que las arepas estén listas, rellena las arepas con la mezcla de carne y cubre con queso rallado.</html>\n\n"
                + "<html><b>11. </b>Coloca las arepas en una bandeja para hornear y lleva al horno a 350°F (180°C) por 5-7 minutos, o hasta que el queso esté derretido y dorado.</html>\n\n"
                + "<html><b>Sirve <font·color=#ed944d>caliente</font> y disfruta!</b></html>",
                // Título
                "Preparación - Pelúa",
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
                "Ingredientes - Quesillo",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            // Preparación
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>PREP</font><font·color=#001f7e>ARA</font><font·color=#d00c27>CIÓN</font>:</b></html>\n\n"
                + "<html><b>1. </b>Precalienta el horno a 180°C.</html>\n\n"
                + "<html><b>2. </b>En un recipiente, mezcla la leche condensada, la leche evaporada, los huevos y la esencia de vainilla. Bate todo junto hasta que los ingredientes estén bien integrados.</html>\n\n"
                + "<html><b>3. </b>En un molde para flan, agrega el azúcar y el agua y cocina a fuego medio hasta que el azúcar se derrita y tome un color dorado.</html>\n\n"
                + "<html><b>4. </b>Una vez que el caramelo esté listo, viértelo en el fondo del molde para flan, asegurándote de cubrir todo el fondo.</html>\n\n"
                + "<html><b>5. </b>Agrega la mezcla de quesillo al molde, y tápalo con papel aluminio o papel film.</html>\n\n"
                + "<html><b>6. </b>Coloca el molde en una bandeja para horno con agua hasta la mitad, y hornea por aproximadamente 1 hora.</html>\n\n"
                + "<html><b>7. </b>Pasado el tiempo de cocción, retira el molde del horno y deja enfríar antes de desmoldar.</html>\n\n"
                + "<html><b>8. </b>Para desmoldar, coloca un plato sobre el molde y dale la vuelta con cuidado para que el quesillo se deslice del molde y quede en el plato.</html>\n\n"
                + "<html><b>9. </b>Refrigera el quesillo por al menos 2 horas antes de servir.</html>\n\n"
                + "<html><b>Sirve <font·color=#0eb8be>frío</font> y disfruta!</b></html>",
                // Título
                "Preparación - Quesillo",
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
                "Ingredientes - Chicha",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            // Preparación
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>PREP</font><font·color=#001f7e>ARA</font><font·color=#d00c27>CIÓN</font>:</b></html>\n\n"
                + "<html><b>1. </b>Limpia y pela la piña, quitándole la corona y la base.</html>\n\n"
                + "<html><b>2. </b>Corta la piña en trozos y colócala en una olla grande junto con la canela y los clavos de olor.</html>\n\n"
                + "<html><b>3. </b>Agrega 1 litro de agua y cocina a fuego medio durante unos 20 minutos, hasta que la piña esté suave y el agua haya tomado un color rosado.</html>\n\n"
                + "<html><b>4. </b>Cuela la mezcla de piña para retirar los trozos y las especias.</html>\n\n"
                + "<html><b>5. </b>Reserva el líquido y deja enfríar.</html>\n\n"
                + "<html><b>6. </b>En otra olla, cocina el arroz en 2 litros de agua hasta que esté blando.</html>\n\n"
                + "<html><b>7. </b>Retira del fuego y deja enfríar.</html>\n\n"
                + "<html><b>8. </b>Mezcla el arroz cocido con la mezcla de piña y agrega el papelón rallado o la panela y el azúcar.</html>\n\n"
                + "<html><b>9. </b>Revuelve hasta que el papelón y el azúcar se disuelvan por completo.</html>\n\n"
                + "<html><b>10. </b>Si deseas, puedes agregar un poco de levadura de cerveza para fermentar la chicha y darle un sabor ligeramente ácido y efervescente.</html>\n\n"
                + "<html><b>11. </b>Agrega 1/4 de cucharadita de levadura y mezcla bien.</html>\n\n"
                + "<html><b>12. </b>Deja reposar la chicha en un lugar fresco y oscuro durante al menos 24 horas, o hasta que fermente y adquiera un sabor ácido y ligeramente burbujeante.</html>\n\n"
                + "<html><b>Sirve la chicha bien <font·color=#0eb8be>fría</font> y disfruta!</b></html>",
                // Título
                "Preparación - Chicha",
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
                "Ingredientes - Pabellón",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            // Preparación
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>PREP</font><font·color=#001f7e>ARA</font><font·color=#d00c27>CIÓN</font>:</b></html>\n\n"
                + "<html><b>1. </b>En una olla, cocina las caraotas con un poco de agua y sal durante 15-20 minutos, o hasta que estén suaves.</html>\n\n"
                + "<html><b>2. </b>En otra olla, cocina el arroz con el doble de agua y sal al gusto.</html>\n\n"
                + "<html><b>3. </b>Cuando el agua empiece a hervir, baja el fuego y tapa la olla.</html>\n\n"
                + "<html><b>4. </b>Cocina a fuego bajo durante unos 20 minutos, o hasta que el arroz esté suave y esponjoso.</html>\n\n"
                + "<html><b>5. </b>Corta los plátanos maduros en rodajas gruesas y fríe en aceite caliente hasta que estén dorados y crujientes.</html>\n\n"
                + "<html><b>6. </b>Calienta la carne mechada en una sartén a fuego medio.</html>\n\n"
                + "<html><b>7. </b>Sirve el arroz, las caraotas, los plátanos fritos (tajadas) y la carne mechada en un plato. Puedes servir los ingredientes juntos o en secciones separadas.</html>\n\n"
                + "<html><b>Sirve <font·color=#ed944d>caliente</font> y disfruta!</b></html>",
                // Título
                "Preparación - Pabellón",
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
                "Ingredientes - Cachapa",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            // Preparación
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>PREP</font><font·color=#001f7e>ARA</font><font·color=#d00c27>CIÓN</font>:</b></html>\n\n"
                + "<html><b>1. </b>En una licuadora, agrega el maíz desgranado, la harina de maíz precocida, el azúcar, la sal, la leche y la mantequilla o aceite.</html>\n\n"
                + "<html><b>2. </b>Mezcla bien hasta obtener una mezcla suave y homogénea.</html>\n\n"
                + "<html><b>3. </b>Calienta una sartén o plancha a fuego medio-alto y añade un poco de aceite o mantequilla.</html>\n\n"
                + "<html><b>4. </b>Con la ayuda de un cucharón, vierte la mezcla de maíz en la sartén formando círculos del tamaño deseado.</html>\n\n"
                + "<html><b>5. </b>Cocina las cachapas durante 3-4 minutos por cada lado o hasta que estén doradas y cocidas por dentro.</html>\n\n"
                + "<html><b>6. </b>Rellena con queso de mano, nata o mantequilla.</html>\n\n"
                + "<html><b>Sirve <font·color=#ed944d>caliente</font> y disfruta!</b></html>",
                // Título
                "Preparación - Cachapas",
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
                "Ingredientes - Pan de Jamón",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            // Preparación
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>PREP</font><font·color=#001f7e>ARA</font><font·color=#d00c27>CIÓN</font>:</b></html>\n\n"
                + "<html><b>1. </b>En un tazón grande, mezcla la harina, el agua, la levadura, el azúcar y la sal.</html>\n\n"
                + "<html><b>2. </b>Amasa hasta obtener una masa suave y homogénea.</html>\n\n"
                + "<html><b>3. </b>Agrega la mantequilla y sigue amasando hasta que esté completamente incorporada.</html>\n\n"
                + "<html><b>4. </b>Cubre la masa con un paño húmedo y deja que repose durante 1 hora, hasta que duplique su tamaño.</html>\n\n"
                + "<html><b>5. </b>Precalienta el horno a 180 grados centígrados.</html>\n\n"
                + "<html><b>6. </b>Sobre una superficie enharinada, estira la masa en forma rectangular y coloca el jamón, la tocineta, las pasas y las aceitunas sobre la masa.</html>\n\n"
                + "<html><b>7. </b>Enrolla la masa desde uno de los lados más largos, para formar un rollo.</html>\n\n"
                + "<html><b>8. </b>Coloca el rollo en una bandeja para horno previamente engrasada y enharinada, con la unión del rollo hacia abajo.</html>\n\n"
                + "<html><b>9. </b>Bate los huevos y utiliza una brocha de cocina para cubrir el pan de jamón con huevo batido.</html>\n\n"
                + "<html><b>10. </b>Hornea durante 30-40 minutos, o hasta que el pan esté dorado.</html>\n\n"
                + "<html><b>11. </b>Saca el pan del horno y deja que se enfríe antes de cortarlo en rebanadas.</html>\n\n"
                + "<html><b>Sirve <font·color=#ed944d>caliente</font> y disfruta!</b></html>",
                // Título
                "Preparación - Pan de Jamón",
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
                "Ingredientes - Patacón",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
            // Preparación
            JOptionPane.showMessageDialog(null,
                "<html><font·color=#e59f00><b>PREP</font><font·color=#001f7e>ARA</font><font·color=#d00c27>CIÓN</font>:</b></html>\n\n"
                + "<html><b>1. </b>Lava los plátanos verdes y córtalos en rodajas gruesas.</html>\n\n"
                + "<html><b>2. </b>Calienta suficiente aceite en una sartén profunda a fuego medio-alto.</html>\n\n"
                + "<html><b>3. </b>Fríe las rodajas de plátano hasta que estén doradas, durante unos 3-4 minutos.</html>\n\n"
                + "<html><b>4. </b>Saca las rodajas de plátano frito del aceite y colócalas sobre papel absorbente.</html>\n\n"
                + "<html><b>5. </b>Usa una prensa de plátano o la base de un vaso para aplanar las rodajas de plátano frito.</html>\n\n"
                + "<html><b>6. </b>Vuelve a sumergir las rodajas aplanadas en el aceite caliente y fríe por segunda vez hasta que estén doradas y crujientes, durante unos 2-3 minutos más.</html>\n\n"
                + "<html><b>7. </b>Saca los patacones del aceite y colócalos sobre papel absorbente para eliminar el exceso de aceite.</html>\n\n"
                + "<html><b>8. </b>Coloca un patacón como la base y pon encima el jamón, el queso, el repollo, el pollo y la salsa.</html>\n\n"
                + "<html><b>9. </b>Coloca otro patacón como la tapa.</html>\n\n"
                + "<html><b>Sirve <font·color=#ed944d>caliente</font> y disfruta!</b></html>",
                // Título
                "Preparación - Patacón",
                // Ícono
                JOptionPane.INFORMATION_MESSAGE,
                flag
            );
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
