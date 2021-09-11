package sbproyect;

public class SalaNormal extends SalaCine {
    private static final int COLUMNAS = 12;
    private static final int FILAS = 10;
    
    public SalaNormal(){
        this.asientos = new String[FILAS][COLUMNAS+1];
        diseniarTabla(FILAS, COLUMNAS);
    }

    public static int getCOLUMNAS() {
        return COLUMNAS;
    }

    public static int getFILAS() {
        return FILAS;
    }
    
}
