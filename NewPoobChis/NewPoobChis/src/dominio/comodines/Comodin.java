package dominio.comodines;

import dominio.Tablero;
import dominio.fichas.Ficha;

public interface Comodin {
    Ficha ficha = null;
    Tablero tablero = null;
    boolean picked = false;
    int pos = 0;
    int getPos();
    boolean isPicked();
    void action();
}
