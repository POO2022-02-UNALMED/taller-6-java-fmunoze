package vehiculos;

class Automovil extends Vehiculo{

    int puestos;
    static int cantidadAutomovil;

    public Automovil(String placa,String nombre, long precio, int peso, Fabricante fabricante, int puestos) {
        super(placa,4,100,nombre,precio,peso,"FWD",fabricante);
        this.puestos = puestos;
        cantidadAutomovil++;
    }

    public int getPuestos() {
        return puestos;
    }

    public void setPuestos(int puestos) {
        this.puestos = puestos;
    }

    public static int getCantidadAutomovil() {
        return cantidadAutomovil;
    }
}