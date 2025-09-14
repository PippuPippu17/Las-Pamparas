package pizzeria.pizza;

/**
 * Pizza Quattro Formaggi Oscura.
 * Pizza de cuatro quesos fuertes, sin proteina (puede ser vegetariana).
 * 
 * @author Las Pamparas
 */
public class PizzaQuattroFormaggiOscura extends Pizza {

    public PizzaQuattroFormaggiOscura(int id, TipoMasa masa) {
        super(id, "Quattro Formaggi Oscura", 
              "Pizza con mezcla de quesos intensos", 
              150.0, true, masa);
    }

    @Override
    protected void colocarQueso() {
        System.out.println("Colocando mozzarella, parmesano, gouda y gorgonzola.");
    }

    @Override
    protected void colocarProteina() {
        System.out.println("No lleva proteina, es casi vegetariana.");
    }
}