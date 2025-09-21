package ninja.modelo;
import ninja.modelo.Caracteristicas.Clan;
import ninja.modelo.Caracteristicas.Rango;

/**
 * Ninja voluntario (rango y nivel 4-6).
 */
public class Voluntario extends Persona {
  private Rango rango;

  public Voluntario(String nombre, int edad, Clan clan, Rango rango, int habilidad) {
    super(nombre, edad, clan, habilidad);
    this.rango = rango;
  }

  public Rango getRango() { 
    return rango; 
  }

  @Override
  public String toString() {
    return String.format("%s - %s (edad=%d, clan=%s, nivel=%d)", nombre, rango, edad, clan, habilidad);
  }
}

