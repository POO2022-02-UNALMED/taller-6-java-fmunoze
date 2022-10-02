package vehiculos;
class Camioneta extends Vehiculo{

    boolean volco;
    static int cantidadCamioneta;

    public Camioneta(String placa, int puertas, String nombre, long precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa,puertas,90,nombre,precio,peso,"4X4",fabricante);
        this.volco = volco;
        cantidadCamioneta++;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }

    public static int getCantidadCamioneta() {
        return cantidadCamioneta;
    }
}