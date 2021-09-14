package sbproyect;

public class CompraNormal extends Compra{  
    public CompraNormal(int horaFuncion, int numeroBoletos){
        if(horaFuncion == 0){
            this.precioFacturado = numeroBoletos * 0.8 * this.PRECIO_BOLETO;
        }
        else if(horaFuncion == 2){
            this.precioFacturado = numeroBoletos * 1.2 * this.PRECIO_BOLETO;
        }
        else{
            this.precioFacturado = numeroBoletos * this.PRECIO_BOLETO;
        }
        this.sala = "Sala Normal";
    }
}
