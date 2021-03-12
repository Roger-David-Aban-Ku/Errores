package metodonumericos;

import javax.swing.JOptionPane;

public class MetodoNumericos {

    public static void main(String[] args) {
        double valorR, valorA;
        
        valorR = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor Real"));
        JOptionPane.showMessageDialog(null, valorR);
        valorA = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Valor Aproximado"));
        JOptionPane.showMessageDialog(null, valorA);
        
        Errores errores = new Errores(valorR, valorA);
        
        JOptionPane.showMessageDialog(null, "El Error Absoluto es: " + errores.ErrorAbsoluto());
        JOptionPane.showMessageDialog(null, "El Error Relativo es: " + errores.ErrorRelativo());
        JOptionPane.showMessageDialog(null, "El Error Relativo Porcentual es: " + errores.ErrorRelativoPorcentual() + "%");

    }

}
