package pizzeria.helado;

/**
 * Clase HeladoSencillo.
 * Representa un helado basico de un solo sabor (fresa, vainilla o chocolate).
 * 
 * Es el componente concreto en el patron Decorator.
 * A partir de este helado se le pueden agregar ingredientes extra
 * mediante decoradores.
 * 
 * @author Las Pamparas
 */
public class HeladoSencillo implements Helado {

    private SaborHelado sabor;
    private double precioSencillo;

    /**
     * Constructor de HeladoSencillo.
     * 
     * @param sabor sabor del helado (FRESA, VAINILLA, CHOCOLATE)
     * @param precioSencillo precio base del helado
     */
    public HeladoSencillo(SaborHelado sabor, double precioSencillo) {
        this.sabor = sabor;
        this.precioSencillo = precioSencillo;
    }

    @Override
    public String getDescripcion() {
        return "Helado de " + sabor.toString().toLowerCase();
    }

    @Override
    public double getPrecio() {
        return precioSencillo;
    }

    @Override
    public String toString() {
        return getDescripcion() + " con precio: " + getPrecio();
    }
}