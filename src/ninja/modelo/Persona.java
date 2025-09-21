package ninja.modelo;
import ninja.modelo.Caracteristicas.Clan;
/**
 * Clase base para personas
 */
public abstract class Persona {
  protected String nombre;
  protected int edad;
  protected Clan clan;
  protected int habilidad;

  public Persona(String nombre, int edad, Clan clan, int habilidad) {
    this.nombre = nombre;
    this.edad = edad;
    this.clan = clan;
    this.habilidad = habilidad;
  }

  public String getNombre() { 
    return nombre; 
  }
  public int getEdad() { 
    return edad; 
  }
  public Clan getClan() { 
    return clan; 
  }
  public int getNivelHabilidad() { 
    return habilidad; 
  }

  @Override
  public String toString() {
    return String.format("%s (edad=%d, clan=%s, nivel=%d)", nombre, edad, clan, habilidad);
  }
}

