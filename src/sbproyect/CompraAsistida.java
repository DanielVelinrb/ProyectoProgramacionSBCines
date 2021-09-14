package sbproyect;

public class CompraAsistida extends Compra{
    protected double consumoAlimentacion;
    
    public CompraAsistida(int horaFuncion, int numeroBoletos, 
            double consumoAlimentacion){
       if(horaFuncion == 0){
            this.precioFacturado = numeroBoletos * 0.8 * this.PRECIO_BOLETO;
        }
        else if(horaFuncion == 2){
            this.precioFacturado = numeroBoletos * 1.2 * this.PRECIO_BOLETO;
        }
        else{
            this.precioFacturado = numeroBoletos * this.PRECIO_BOLETO;
        }
       this.consumoAlimentacion = consumoAlimentacion;
       this.precioFacturado += consumoAlimentacion;
       this.sala = "Sala Asistida";
    }
}
