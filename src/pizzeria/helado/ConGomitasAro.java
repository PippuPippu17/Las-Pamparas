package pizzeria.helado;

/**
 * Decorador concreto que agrega gomitas de aro al helado.
 * @author Las Pamparas
 */
public class ConGomitasAro extends DecoratorHelado {

    public ConGomitasAro(Helado heladoBase) {
        super(heladoBase, "gomitas de aro", 3.5);
    }
}