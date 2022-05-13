package Presentacion;

import java.awt.*;

public class Fichas {
    private int x = 40;
    private int y = 40;
    private final int ancho = 40;
    private final int alto = 40;
    private final int movimiento = 40;
    Color fRojas, fAzules, fAmarillas, fVerdes;

    public void paint(Graphics grafico){
        fRojas = new Color(107,0,0);
        fAzules = new Color(21,27,141);
        fVerdes = new Color(48,103,84);
        fAmarillas = new Color(196,145,2);
//Rojas
        grafico.setColor(fRojas);
        grafico.fillOval(40,40,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(40,40,ancho,alto);

        grafico.setColor(fRojas);
        grafico.fillOval(40,240,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(40,240,ancho,alto);

        grafico.setColor(fRojas);
        grafico.fillOval(240,240,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(240,240,ancho,alto);

        grafico.setColor(fRojas);
        grafico.fillOval(240,40,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(240,40,ancho,alto);
//Azules

        grafico.setColor(fAzules);
        grafico.fillOval(600,40,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(600,40,ancho,alto);

        grafico.setColor(fAzules);
        grafico.fillOval(600,240,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(600,240,ancho,alto);

        grafico.setColor(fAzules);
        grafico.fillOval(800,240,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(800,240,ancho,alto);

        grafico.setColor(fAzules);
        grafico.fillOval(800,40,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(800,40,ancho,alto);
//Amarillas

        grafico.setColor(fVerdes);
        grafico.fillOval(40,600,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(40,600,ancho,alto);

        grafico.setColor(fVerdes);
        grafico.fillOval(40,800,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(40,800,ancho,alto);

        grafico.setColor(fVerdes);
        grafico.fillOval(240,800,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(240,800,ancho,alto);

        grafico.setColor(fVerdes);
        grafico.fillOval(240,600,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(240,600,ancho,alto);
//Verdes
        grafico.setColor(fAmarillas);
        grafico.fillOval(600,600,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(600,600,ancho,alto);

        grafico.setColor(fAmarillas);
        grafico.fillOval(600,800,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(600,800,ancho,alto);

        grafico.setColor(fAmarillas);
        grafico.fillOval(800,800,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(800,800,ancho,alto);

        grafico.setColor(fAmarillas);
        grafico.fillOval(800,600,ancho,alto);
        grafico.setColor(Color.black);
        grafico.drawOval(800,600,ancho,alto);
    }

}
