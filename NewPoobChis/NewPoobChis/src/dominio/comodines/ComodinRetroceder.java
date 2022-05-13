package dominio.comodines;

import dominio.Tablero;
import dominio.fichas.Ficha;

public class ComodinRetroceder implements Comodin{
    int pos;
    boolean picked;
    Ficha ficha;
    Tablero tablero;

    void Rectroceder(Ficha ficha, Tablero tablero){
        this.ficha = ficha;
        this.tablero = tablero;
        action();
    }

    @Override
    public int getPos() {
        return pos;
    }

    @Override
    public boolean isPicked() {
        return picked;
    }

    @Override
    public void action() {
        ficha.mover(-5);
    }
}
