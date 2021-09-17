package sbproyect;

public class Compra {
    protected final int PRECIO_BOLETO = 6;
    protected String sala;
    protected int horaFuncion;
    protected int numeroBoletos;
    protected double precioFacturado;
   
    public int getPRECIO_BOLETO() {
        return PRECIO_BOLETO;
    }

    public double getPrecioFacturado() {
        return precioFacturado;
    }

    public String getSala() {
        return sala;
    }
    
    @Override
    public String toString(){
        return "Su valor a pagar es: " + precioFacturado;
    }
    
}
