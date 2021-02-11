package clases;

public class Mascota {

    private String nombre;
    private String tipo;
    private double costo;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double pago(){
        double pago = 0;
        if(getTipo()=="perro")pago = 3500;
        else pago = 4500;
        return pago;
    }
}
