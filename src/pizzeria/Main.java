package pizzeria;

import pizzeria.helado.*;
import pizzeria.helado.SaborHelado;

public class Main {
  public static void main(String[] args) {

    Helado baseHelado = new HeladoSencillo(SaborHelado.CHOCOLATE, 5000.23);
    Helado conExtras = new DecoratorHelado(baseHelado, ExtraIngredienteHelado.CHISPAS_CHOCOLATE, 21.0);
    System.out.println(conExtras);
   }
}

