package pizzeria.helado;

/**
 * Decorador concreto que agrega chispas de chocolate al helado.
 * @author Las Pamparas
 */
public class ConChispasChocolate extends DecoratorHelado {

    public ConChispasChocolate(Helado heladoBase) {
        super(heladoBase, "chispas de chocolate", 4.0);
    }
}