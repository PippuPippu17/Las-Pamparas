package pizzeria.helado;

public class HeladoSencillo implements Helado{

  private SaborHelado sabor;
  private double precioSencillo;

  public HeladoSencillo(SaborHelado sabor, double precioSencillo){
    this.sabor = sabor;
    this.precioSencillo = precioSencillo;
  }

  @Override
  public String getDescripcion(){
    return sabor.toString();
  }

  @Override
  public double getPrecio(){
    return precioSencillo;
  }

  @Override
  public String toString() {
    return "Helado de  " + getDescripcion() + " con precio: " + getPrecio();
  }
}
