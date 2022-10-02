package vehiculos;

class Camion extends Vehiculo{

    int ejes;
    static int cantidadCamion;

    public Camion(String placa, String nombre, long precio, int peso,Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        cantidadCamion++;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public static int getCantidadCamion() {
        return cantidadCamion;
    }
}