package sbproyect;

public class SalaEjecutiva extends SalaCine{
    private static final int COLUMNAS = 8;
    private static final int FILAS = 6;
    
    public SalaEjecutiva(){
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
