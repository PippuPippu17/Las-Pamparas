package ninja.patrones;

import java.util.Iterator;
import java.util.NoSuchElementException;
import ninja.modelo.Voluntario;

/**
 * Iterador para  array ninja
 */
public class IteratorNinja implements Iterator<Voluntario> {
  private final Voluntario[] arr;
  private final int size;
  private int posicion = 0;

  public IteratorNinja(Voluntario[] arr, int size) {
  this.arr = arr;
    this.size = size;
  }

  @Override
  public boolean hasNext() {
    return posicion < size && arr[posicion] != null;
  }

  @Override
  public Voluntario next() {
    if (!hasNext()) throw new NoSuchElementException();
    return arr[posicion++];
  }
}

