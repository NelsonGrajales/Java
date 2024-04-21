import javax.swing.*;

public class Taller_13 {

  public void procesar(int num) {
    int i;
    String cad = "";
    for (i = 0; i <= 12; i++)
      cad += num + " x " + i + " = " + (num * i) + "\n";
    imprimir(cad);
  }

  public void imprimir(String cad) {
    JOptionPane.showMessageDialog(null, cad);
  }
}
