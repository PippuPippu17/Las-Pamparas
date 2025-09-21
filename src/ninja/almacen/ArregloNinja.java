package ninja.almacen;

import ninja.modelo.Voluntario;
import ninja.patrones.IteratorNinja;

import java.util.Iterator;
/**
 * Arreglo de ninjas voluntarios.
 */
public class ArregloNinja implements Iterable<Voluntario>{
  private Voluntario[] arr;
  private int tam = 0;

  public ArregloNinja(int capacidad) {
    arr = new Voluntario[capacidad];
  }

  public void add(Voluntario n) {
    if (tam >= arr.length) {
      throw new IllegalStateException("Array lleno");
    }
    arr[tam++] = n;
  }

  public int size() { 
    return tam; 
  }

  public Voluntario get(int i) {
    return arr[i];
  }

  public Iterator<Voluntario> iterator() {
    return new IteratorNinja(arr, tam);
  }
}

