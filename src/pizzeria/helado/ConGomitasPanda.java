package pizzeria.helado;

/**
 * Decorador concreto que agrega gomitas de panda al helado.
 * @author Las Pamparas
 */
public class ConGomitasPanda extends DecoratorHelado {

    public ConGomitasPanda(Helado heladoBase) {
        super(heladoBase, "gomitas de panda", 3.5);
    }
}