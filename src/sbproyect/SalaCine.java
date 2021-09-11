package sbproyect;

public class SalaCine{
    protected int asientosTotales;
    protected int asientosDisponibles;
    protected String asientos[][];
    
    protected void diseniarTabla(int filas, int columnas){
        this.asientos = new String[filas][columnas+1];
        for(int i = 0; i < filas; i++){
            this.asientos[i][0] = String.valueOf(i+1);
            for(int j = 1; j < columnas+1; j++){
                this.asientos[i][j] = "VACIO";
            }
        }
    }
}
