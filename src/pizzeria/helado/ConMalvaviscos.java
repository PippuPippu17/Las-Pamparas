package pizzeria.helado;

/**
 * Decorador concreto que agrega malvaviscos al helado.
 * @author Las Pamparas
 */
public class ConMalvaviscos extends DecoratorHelado {

    public ConMalvaviscos(Helado heladoBase) {
        super(heladoBase, "malvaviscos", 4.5);
    }
}