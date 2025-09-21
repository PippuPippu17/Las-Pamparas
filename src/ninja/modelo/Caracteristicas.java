package ninja.modelo;

/**
 * Clase de características de los ninjas:
 * - Clan, Rango, Herramientas
 */
public class Caracteristicas {

  /**
   * Enum de los clanes.
   */
  public static enum Clan {
    FUCHIHA, OSOMAKI, NACA, MORTALIKA, AKIPICHI
  }

  /**
   * Rango de un ninja voluntario.
   */
  public static enum Rango {
    GENIN, CHUNIN, JONIN;
  
    /**
     * Capacidad máxima de aspirantes de un líder dependiendo el rango.
     */
    public int capacidad() {
      switch (this) {
        case GENIN: return 1;
        case CHUNIN: return 2;
        case JONIN: return 3;
        default: return 0;
      }
    }
  }

  /**
   * Herramientas ninja con peso asociado.
   */
  public static enum Tool {
    KUNAI(0.1),
    SHURIKEN(0.2),
    PAPEL_BOMBA(0.3),
    BOMBA_HUMO(0.4),
    BOTIQUIN(0.5);

    private double weight;

    Tool(double weight) {
      this.weight = weight;
    }

    public double getWeight() {
      return weight;
    }
  }
}


