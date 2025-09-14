package pizzeria.helado;

/**
 * Decorador concreto que agrega kiwis al helado.
 * @author Las Pamparas
 */
public class ConKiwis extends DecoratorHelado {

    public ConKiwis(Helado heladoBase) {
        super(heladoBase, "kiwis", 6.0);
    }
}