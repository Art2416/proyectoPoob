package Presentacion;

import java.awt.*;

public class Tablero {
    private int fila = 0;
    private int columna = 0;
    private final int numeroFilas = 22;
    private final int numeroColumnas = 22;
    private final int anchoCasilla = 40;
    private final int altoCasilla = 40;

    public void paint(Graphics grafico){
        int[][] tablero = getTablero();
        for(fila = 0; fila < numeroFilas; fila++){
            for(columna = 0; columna < numeroColumnas; columna++){
                if(tablero[fila][columna] == 0){
                    grafico.setColor(Color.white);
                    grafico.fillRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                    grafico.setColor(Color.BLACK);
                    grafico.drawRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                }
                if(tablero[fila][columna] == 1){
                    grafico.setColor(Color.red);
                    grafico.fillRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                    grafico.setColor(Color.BLACK);
                    grafico.drawRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                }
                if(tablero[fila][columna] == 2){
                    grafico.setColor(Color.blue);
                    grafico.fillRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                    grafico.setColor(Color.BLACK);
                    grafico.drawRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                }
                if(tablero[fila][columna] == 3){
                    grafico.setColor(Color.yellow);
                    grafico.fillRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                    grafico.setColor(Color.BLACK);
                    grafico.drawRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                }
                if(tablero[fila][columna] == 4){
                    grafico.setColor(Color.green);
                    grafico.fillRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                    grafico.setColor(Color.BLACK);
                    grafico.drawRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                }
                if(tablero[fila][columna] == 5){
                    grafico.setColor(Color.GRAY);
                    grafico.fillRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                    grafico.setColor(Color.BLACK);
                    grafico.drawRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                }
                if(tablero[fila][columna] == 6){
                    grafico.setColor(Color.DARK_GRAY);
                    grafico.fillRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                    grafico.setColor(Color.BLACK);
                    grafico.drawRect(columna*40,fila*40,anchoCasilla,altoCasilla);
                }
            }
        }

    }
    public int[][] getTablero(){
        int tablero[][] =
                {       {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 5, 5, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2},
                        {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2},
                        {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2},
                        {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2},
                        {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 2, 2, 2, 2, 2, 2, 2, 2},
                        {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2},
                        {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2},
                        {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2},
                        {0, 0, 0, 0, 5, 0, 0, 0, 6, 6, 6, 6, 6, 6, 0, 0, 0, 2, 0, 0, 0, 0},
                        {0, 0, 0, 0, 5, 0, 0, 0, 6, 6, 6, 6, 6, 6, 0, 0, 0, 2, 0, 0, 0, 0},
                        {5, 4, 4, 4, 4, 4, 4, 4, 6, 6, 6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2, 5},
                        {5, 4, 4, 4, 4, 4, 4, 4, 6, 6, 6, 6, 6, 6, 2, 2, 2, 2, 2, 2, 2, 5},
                        {0, 0, 0, 0, 4, 0, 0, 0, 6, 6, 6, 6, 6, 6, 0, 0, 0, 5, 0, 0, 0, 0},
                        {0, 0, 0, 0, 4, 0, 0, 0, 6, 6, 6, 6, 6, 6, 0, 0, 0, 5, 0, 0, 0, 0},
                        {4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 3, 3, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3},
                        {4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 3, 3, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3},
                        {4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 3, 3, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3},
                        {4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3},
                        {4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 3, 3, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3},
                        {4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 3, 3, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3},
                        {4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 3, 3, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3},
                        {4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 5, 5, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3}
                };
        return tablero;
    }
}
