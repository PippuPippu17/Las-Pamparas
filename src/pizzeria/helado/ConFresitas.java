package pizzeria.helado;

/**
 * Decorador concreto que agrega fresitas al helado.
 * @author Las Pamparas
 */
public class ConFresitas extends DecoratorHelado {

    public ConFresitas(Helado heladoBase) {
        super(heladoBase, "fresitas", 4.0);
    }
}