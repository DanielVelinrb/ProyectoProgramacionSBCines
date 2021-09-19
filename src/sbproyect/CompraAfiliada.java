package sbproyect;

public class CompraAfiliada extends Compra{
    private String id;
    private int puntosAfiliacion;
    private double consumoAlimentacion;
    private double descuentoCompra;
    
    public CompraAfiliada(int horaFuncion, int numeroBoletos, 
            double consumoAlimentacion){
        if(horaFuncion == 0){
            this.precioFacturado = numeroBoletos * this.PRECIO_BOLETO;
            precioPorHorario = numeroBoletos * this.PRECIO_BOLETO;
        }
        else{
            this.precioFacturado = numeroBoletos * 0.8 * this.PRECIO_BOLETO;
            precioPorHorario = 0.8 * numeroBoletos * this.PRECIO_BOLETO;
        }
       this.consumoAlimentacion = consumoAlimentacion;
       this.precioFacturado += consumoAlimentacion;
       this.sala = "Sala Ejecutiva";
       this.numeroBoletos = numeroBoletos;
    }

    public double getDescuentoCompra() {
        return descuentoCompra;
    }

    @Override
    public void setPrecioFacturado(double descuento) {
        descuentoCompra = descuento;
        this.precioFacturado -= descuento;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nPrecio de los boletos: " + numeroBoletos * precioPorHorario +
                "\nPrecio alimentos: " + consumoAlimentacion + "\nDescuento utilizado: " + descuentoCompra;
    }
}
