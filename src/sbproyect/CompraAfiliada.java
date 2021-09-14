package sbproyect;

public class CompraAfiliada extends Compra{
    private String id;
    private int puntosAfiliacion;
    private double consumoAlimentacion;
    private double DESCUENTO_POR_PUNTOS = 0.05;
    private double descuentoCompra;
    
    public CompraAfiliada(int horaFuncion, int numeroBoletos, 
            double consumoAlimentacion){
        if(horaFuncion == 0){
            this.precioFacturado = numeroBoletos * this.PRECIO_BOLETO;
        }
        else{
            this.precioFacturado = numeroBoletos * 0.8 * this.PRECIO_BOLETO;
        }
       this.consumoAlimentacion = consumoAlimentacion;
       this.precioFacturado += consumoAlimentacion;
       this.sala = "Sala Ejecutiva";
    }

    
    public CompraAfiliada(int horaFuncion, int numeroBoletos, 
            double consumoAlimentacion, double descuento){
    
    }

    public double getDescuentoCompra() {
        return descuentoCompra;
    }
    
}
