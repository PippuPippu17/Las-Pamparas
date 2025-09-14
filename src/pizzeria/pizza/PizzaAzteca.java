package pizzeria.pizza;

/**
 * Pizza Azteca.
 * Pizza estilo mexicano con chorizo, maiz y jalapenos.
 * 
 * @author Las Pamparas
 */
public class PizzaAzteca extends Pizza {

    public PizzaAzteca(int id, TipoMasa masa) {
        super(id, "Azteca", 
              "Pizza con chorizo, maiz y jalapenos", 
              160.0, false, masa);
    }

    @Override
    protected void colocarQueso() {
        System.out.println("Colocando queso cheddar.");
    }

    @Override
    protected void colocarProteina() {
        System.out.println("Colocando chorizo y granos de maiz.");
    }
}