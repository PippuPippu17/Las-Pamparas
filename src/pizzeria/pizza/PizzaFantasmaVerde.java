package pizzeria.pizza;

/**
 * Pizza Fantasma Verde.
 * Pizza vegetariana con tofu, espinaca y pesto.
 * 
 * @author Las Pamparas
 */
public class PizzaFantasmaVerde extends Pizza {

    public PizzaFantasmaVerde(int id, TipoMasa masa) {
        super(id, "Fantasma Verde", 
              "Pizza con tofu, espinaca y salsa pesto", 
              155.0, true, masa);
    }

    @Override
    protected void colocarQueso() {
        System.out.println("Colocando queso vegano especial.");
    }

    @Override
    protected void colocarProteina() {
        System.out.println("Colocando tofu marinado.");
    }
}