package pizzeria.helado;

/**
 * Decorador concreto que agrega gomitas de gusano al helado.
 * @author Las Pamparas
 */
public class ConGomitasGusano extends DecoratorHelado {

    public ConGomitasGusano(Helado heladoBase) {
        super(heladoBase, "gomitas de gusano", 3.5);
    }
}