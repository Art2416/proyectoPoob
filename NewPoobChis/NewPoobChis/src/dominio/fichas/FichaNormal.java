package dominio.fichas;

import dominio.Equipo;
import dominio.Tablero;

public class FichaNormal extends Ficha{
    int idFicha;
    int pos;
    Equipo equipo;
    Tablero tablero;

    public void Ficha(int id, Tablero tablero){
        this.idFicha = id;
        this.tablero = tablero;
    }


    @Override
    void usarPoder() {

    }
}
