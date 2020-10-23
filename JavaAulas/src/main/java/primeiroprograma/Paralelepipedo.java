package primeiroprograma;

import javax.swing.JOptionPane;

public class Paralelepipedo {
    public static void main(String[] args) {
        int larg, alt, comp, volume;

        JOptionPane.showMessageDialog(null, "programa para calculo de paralelepípedo");

        String entradaTemp = JOptionPane.showInputDialog("informe a largura:");

        larg = Integer.parseInt(entradaTemp);

        String entradaTemp2 = JOptionPane.showInputDialog("informe a altura:");

        alt = Integer.parseInt(entradaTemp2);

        String entradaTemp3 = JOptionPane.showInputDialog("informe o comprimento:");

        comp = Integer.parseInt(entradaTemp3);

        volume = larg * alt * comp; 

        JOptionPane.showMessageDialog(null, "seu volume é de: " + volume + "cm³");
    }   

    }
