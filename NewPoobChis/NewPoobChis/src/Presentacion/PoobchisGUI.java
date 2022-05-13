package Presentacion;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class PoobchisGUI extends JPanel {
    Tablero tablero = new Tablero();
    Fichas fichas = new Fichas();
    @Override
    public void paint(Graphics grafico){
        tablero.paint(grafico);
        fichas.paint(grafico);
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("PoobChis");
        PoobchisGUI game = new PoobchisGUI();
        ventana.add(game);
        ventana.setSize(897,1000);
        //ventana.setSize(810,900);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}
