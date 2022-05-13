package dominio.fichas;

import dominio.Equipo;
import dominio.Tablero;
import dominio.comodines.Comodin;

public abstract class  Ficha {
    Comodin comodin = null;
    int idFicha = 0;
    Tablero tablero = null;
    Equipo equipo=null;
    int pos = 0;

    public void mover(int i){
        pos += i;
        tablero.moverFicha(equipo.getIdEquipo(),idFicha,pos);
    }

    void esComida(){
        tablero.fichaEsComida(equipo.getIdEquipo(),idFicha,pos);
    }

    void esGanadora(){
        tablero.fichaEsGanadora(equipo.getIdEquipo(),idFicha,pos);
    }

    abstract void usarPoder();


    public Comodin getComodin() {
        return comodin;
    }

    public void setComodin(Comodin comodin) {
        this.comodin = comodin;
    }

    public int getIdFicha() {
        return idFicha;
    }

    public void setIdFicha(int idFicha) {
        this.idFicha = idFicha;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }


}
