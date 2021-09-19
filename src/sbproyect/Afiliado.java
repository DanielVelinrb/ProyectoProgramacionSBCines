package sbproyect;

import java.io.Serializable;

public class Afiliado implements Serializable{
    String nombre;
    int cedula;
    int puntos;
    
    public Afiliado(String nombre, int cedula, int puntos){
        this.nombre = nombre;
        this.cedula = cedula;
        this.puntos = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setPuntos(int puntos) {
        this.puntos += puntos;
    }

    public int getPuntos() {
        return puntos;
    }
    
}
