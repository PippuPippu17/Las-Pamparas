package pizzeria.helado;

/**
 * Interfaz Helado.
 * Representa el componente base en el patron Decorator.
 * 
 * Todo helado debe poder dar una descripcion de lo que contiene
 * y devolver su precio total.
 * 
 * @author Las Pamparas
 */
public interface Helado {

    /**
     * Devuelve la descripcion del helado (sabor y extras).
     * @return descripcion del helado
     */
    String getDescripcion();

    /**
     * Devuelve el precio total del helado (base + ingredientes extra).
     * @return precio del helado
     */
    double getPrecio();
}
