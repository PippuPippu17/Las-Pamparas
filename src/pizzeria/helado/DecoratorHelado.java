package pizzeria.helado;

/**
 * Clase abstracta DecoratorHelado.
 * Representa la base para los ingredientes extra que se le pueden
 * agregar a un helado. Implementa la interfaz Helado y mantiene
 * una referencia al componente que decora.
 * 
 * Es el decorador abstracto dentro del patron Decorator.
 * 
 * @author Las Pamparas
 */
public abstract class DecoratorHelado implements Helado {

    protected Helado heladoBase;
    protected String nombreIngrediente;
    protected double precioExtra;

    /**
     * Constructor del decorador.
     * 
     * @param heladoBase el helado que se va a decorar
     * @param nombreIngrediente nombre del ingrediente extra
     * @param precioExtra costo adicional del ingrediente extra
     */
    public DecoratorHelado(Helado heladoBase, String nombreIngrediente, double precioExtra) {
        this.heladoBase = heladoBase;
        this.nombreIngrediente = nombreIngrediente;
        this.precioExtra = precioExtra;
    }

    @Override
    public String getDescripcion() {
        return heladoBase.getDescripcion() + ", con " + nombreIngrediente;
    }

    @Override
    public double getPrecio() {
        return heladoBase.getPrecio() + precioExtra;
    }
}