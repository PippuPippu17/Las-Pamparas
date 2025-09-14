package pizzeria.helado;

/**
 * Decorador concreto que agrega manguitos al helado.
 * @author Las Pamparas
 */
public class ConManguitos extends DecoratorHelado {

    public ConManguitos(Helado heladoBase) {
        super(heladoBase, "manguitos", 5.0);
    }
}