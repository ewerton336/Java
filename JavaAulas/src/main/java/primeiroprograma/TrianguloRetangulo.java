package primeiroprograma;

import javax.swing.JOptionPane;

public class TrianguloRetangulo {
    public static void main(String[] args) {
        float base, altura, areaTriangulo, areaRetangulo;

        JOptionPane.showMessageDialog(null, "Calculo de figuras geométricas");

     

        base = Float.parseFloat(JOptionPane.showInputDialog("informe a base:"));

        altura = Float.parseFloat(JOptionPane.showInputDialog("informe a altura:"));

        areaTriangulo = base * altura / 2;
        areaRetangulo = base * altura;



        JOptionPane.showMessageDialog(null, 
        String.format("Area do triangulo é " + areaTriangulo + " A do retângulo é " + areaRetangulo));
    }   

    }
