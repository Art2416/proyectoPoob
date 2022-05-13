package dominio.comodines;

import dominio.Tablero;
import dominio.fichas.Ficha;



public class ComodinAvanzar implements Comodin{
    int pos;
    boolean picked;
    Ficha ficha;
    Tablero tablero;

    public ComodinAvanzar(Ficha ficha, Tablero tablero){
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
        ficha.mover(5);
    }
}
