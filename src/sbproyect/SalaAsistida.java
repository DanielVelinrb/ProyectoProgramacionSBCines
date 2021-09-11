package sbproyect;

public class SalaAsistida extends SalaCine{
    private static final int COLUMNAS = 10;
    private static final int FILAS = 8;
    
    public SalaAsistida(){
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
