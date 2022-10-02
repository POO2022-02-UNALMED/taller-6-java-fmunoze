package vehiculos;
import java.util.*;
public class Fabricante{

    String nombre;
    Pais pais;    
    int ventas;
    static ArrayList<Fabricante> fabricantes =new ArrayList<Fabricante>();

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante masVendedor=fabricantes.get(0);
        for(Fabricante fabrica : fabricantes) {
            if(fabrica.ventas>masVendedor.ventas) {
                masVendedor = fabrica;
            }
        }
        return masVendedor;
    }
    public void aumentarVentas() {
        this.ventas++;
        pais.aumentarVentas();
    } 


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
}