package pizzeria.pizza;

/**
 * Clase abstracta Pizza que define la estructura general para preparar cualquier pizza.
 * 
 * Usa el patron Template Method: el metodo preparar() fija la secuencia de pasos,
 * mientras que las subclases concretas definen los detalles especificos
 * como el tipo de masa, el queso y la proteina.
 * 
 * Todas las pizzas comparten los mismos atributos basicos:
 * id, nombre, descripcion, precio y si es vegetariana o no.
 * 
 * @author Las Pamparas
 */
public abstract class Pizza {

    protected int id;
    protected String nombre;
    protected String descripcion;
    protected double precio;
    protected boolean vegetariana;
    protected TipoMasa masa;

    /**
     * Constructor base de Pizza.
     * 
     * @param id identificador de la pizza
     * @param nombre nombre de la pizza
     * @param descripcion breve descripcion
     * @param precio costo de la pizza
     * @param vegetariana si es vegetariana o no
     * @param masa tipo de masa elegida por el cliente
     */
    public Pizza(int id, String nombre, String descripcion, double precio, boolean vegetariana, TipoMasa masa) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.vegetariana = vegetariana;
        this.masa = masa;
    }

    /**
     * Metodo Template que define los pasos para preparar una pizza.
     * Este flujo no cambia entre pizzas, pero los ingredientes
     * especificos los definen las subclases.
     */
    public final void preparar() {
        prepararMasa();
        aplanarMasa();
        colocarSalsa();
        colocarQueso();
        colocarEspecias();
        colocarProteina();
        hornear();
        esperar();
        sacarDelHorno();
        empaquetar();
    }

    private void prepararMasa() {
        System.out.println("Preparando masa tipo: " + masa);
    }

    private void aplanarMasa() {
        System.out.println("Aplanando la masa...");
    }

    private void colocarSalsa() {
        System.out.println("Colocando salsa de tomate...");
    }

    /**
     * Paso que sera definido en las subclases: que queso lleva la pizza.
     */
    protected abstract void colocarQueso();

    private void colocarEspecias() {
        System.out.println("Agregando especias basicas...");
    }

    /**
     * Paso que sera definido en las subclases: que proteina lleva la pizza.
     */
    protected abstract void colocarProteina();

    private void hornear() {
        System.out.println("Metiendo la pizza al horno...");
    }

    private void esperar() {
        System.out.println("Esperando a que se cocine...");
    }

    private void sacarDelHorno() {
        System.out.println("Sacando la pizza del horno...");
    }

    private void empaquetar() {
        System.out.println("Empaquetando la pizza.");
    }

    /**
     * Devuelve el nombre de la pizza (para ticket).
     * @return nombre de la pizza
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el precio de la pizza (para ticket).
     * @return precio de la pizza
     */
    public double getPrecio() {
        return precio;
    }
}