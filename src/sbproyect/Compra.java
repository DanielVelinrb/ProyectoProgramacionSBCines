package sbproyect;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Compra implements Serializable{
    protected final int PRECIO_BOLETO = 6;
    protected String sala;
    protected int horaFuncion;
    protected int numeroBoletos;
    protected double precioFacturado;
    protected double precioPorHorario;
   
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
    
     protected void escrituraDatos(LinkedList<Compra> compras){
        ObjectOutputStream os = null;
        
        try{
            FileOutputStream file = new FileOutputStream("compras.ser");    
            os = new ObjectOutputStream(file);
            for(Compra c : compras){
                os.writeObject(c);
            }
        }
        catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error al crear el archivo",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        catch(IOException ioe){
            ioe.getStackTrace();
        }
        finally{
            try{
                os.close();
            }
            catch(IOException ioe){
                ioe.getStackTrace();
            }
            catch(NullPointerException npe){
                JOptionPane.showMessageDialog(null, "Error al cerrar el archivo",
                        "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void setPrecioFacturado(double precioFacturado) {
        this.precioFacturado = precioFacturado;
    }
    
}
