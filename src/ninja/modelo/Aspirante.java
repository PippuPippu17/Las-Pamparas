package ninja.modelo;
import ninja.modelo.Caracteristicas.Clan;

/**
 * Aspirante (nivel 1-3).
 */
public class Aspirante extends Persona {
    public Aspirante(String nombre, int edad, Clan clan, int habilidad) {
        super(nombre, edad, clan, habilidad);
    }
}

