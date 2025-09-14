package pizzeria.pizza;

/**
 * Pizza Samurai.
 * Pizza inspirada en sabores japoneses con pollo teriyaki.
 * 
 * @author Las Pamparas
 */
public class PizzaSamurai extends Pizza {

    public PizzaSamurai(int id, TipoMasa masa) {
        super(id, "Samurai", 
              "Pizza con pollo teriyaki y toque de alga nori", 
              170.0, false, masa);
    }

    @Override
    protected void colocarQueso() {
        System.out.println("Colocando mozzarella fresco.");
    }

    @Override
    protected void colocarProteina() {
        System.out.println("Colocando pollo teriyaki y trocitos de alga nori.");
    }
}