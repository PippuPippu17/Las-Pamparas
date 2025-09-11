package pizzeria.helado;

public class DecoratorHelado implements Helado {
  private ExtraIngredienteHelado extraIngrediente;
  private double extraPrecio;
  protected Helado wrap;
  
  public DecoratorHelado(Helado wrap, ExtraIngredienteHelado extraIngrediente, double precio){
    this.wrap = wrap;
    this.extraIngrediente = extraIngrediente;
    this.extraPrecio = precio;
  }

  @Override 
  public String getDescripcion(){
    return wrap.getDescripcion().toString() + " , con ingrediente extra: " + extraIngrediente.toString();
  }

  @Override 
  public double getPrecio(){
  return wrap.getPrecio() + extraPrecio;
  }

  @Override
  public String toString() {
    return "Helado de " + getDescripcion() + " con precio: " + getPrecio();
  }
}

