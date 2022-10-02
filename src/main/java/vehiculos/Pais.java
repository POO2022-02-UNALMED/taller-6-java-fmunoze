package vehiculos;
import java.util.*;
public class Pais{

    String nombre;
    int ventas;
    static ArrayList<Pais> paises =new ArrayList<Pais>();

    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this);
    }

    public static Pais paisMasVendedor() {
        Pais masVendedor=paises.get(0);
        for(Pais pais : paises) {
            if(pais.ventas>masVendedor.ventas) {
                masVendedor = pais;
            }
        }
        return masVendedor;
    } 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void aumentarVentas() {
        this.ventas++;
    }
    
}