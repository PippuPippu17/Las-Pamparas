package pizzeria.pizza;

/**
 * Pizza Del Mar Profundo.
 * Pizza con mariscos como camaron o calamar, sabor fresco.
 * 
 * @author Las Pamparas
 */
public class PizzaDelMarProfundo extends Pizza {

    public PizzaDelMarProfundo(int id, TipoMasa masa) {
        super(id, "Del Mar Profundo", 
              "Pizza con camaron y calamar con toque de limon", 
              180.0, false, masa);
    }

    @Override
    protected void colocarQueso() {
        System.out.println("Colocando queso gouda.");
    }

    @Override
    protected void colocarProteina() {
        System.out.println("Colocando camaron y calamar.");
    }
}