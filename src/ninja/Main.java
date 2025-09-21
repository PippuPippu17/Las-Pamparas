
package ninja;

import ninja.modelo.*;
import ninja.modelo.Caracteristicas.*;
import ninja.almacen.ArregloNinja;

public class Main {
  public static void main(String[] args) {
    // Crear arreglo de voluntarios
    ArregloNinja voluntarios = new ArregloNinja(5);

    voluntarios.add(new Voluntario("Kakashi", 43, Clan.FUCHIHA, Rango.JONIN, 6));
    voluntarios.add(new Voluntario("Iruka", 23, Clan.OSOMAKI, Rango.CHUNIN, 5));
    voluntarios.add(new Voluntario("Konohamaru", 10, Clan.NACA, Rango.GENIN, 4));

    System.out.println("Voluntarios");
    for (Voluntario v : voluntarios) {
      System.out.println(v);
    }

    // Crear aspirante
    Aspirante a1 = new Aspirante("AspiranteA1", 12, Clan.OSOMAKI, 3);
    System.out.println("\nAspirante ejemplo");
    System.out.println(a1);
  }
}

