package proyectop2;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class ProyectoP2 {

  // Aquí comienza la ejecución del programa
  public static void main(String[] args) {

    try {
      for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
      // Si no se encuentra disponible el tema
      try {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
      } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        // Ignorar excepción
      }
    }

    // Color del fondo de los paneles
    // UIManager.put("OptionPane.background", Color.DARK_GRAY);
    // UIManager.put("Panel.background", Color.DARK_GRAY);

    // Texto por defecto en el botón "Ok" de JOptionPane
    UIManager.put("OptionPane.okButtonText", "Avanzar");

    // Correo
    // JOptionPane.showMessageDialog(null,
    //     "Hola",
    //     "Título",
    //     JOptionPane.INFORMATION_MESSAGE,
    //     null
    // );

    // Creamos el objeto de la ventana principal
    Window window = new Window("Recetario");
  }
}
