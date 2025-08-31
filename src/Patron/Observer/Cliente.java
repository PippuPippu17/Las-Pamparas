
import java.util.LinkedList;

public class Cliente implements Observador {

  final String nombre;
  public int ahorro;
  LinkedList<Servicio> suscripciones;

  public Cliente(String nombre, int ahorroInicial){
    this.nombre = nombre;
    this.ahorro = ahorroInicial;
    this.suscripciones = new LinkedList<>();
  }

  public String getNombreCliente(){
    return nombre;
  }

  public int getAhorro(){
    return ahorro;
  }

 
  public void suscribir(Servicio servicio){
    if (!suscripciones.contains(servicio)){
      suscripciones.add(servicio);
    }
  }

  public void cancelar(Servicio servicio){
    if (suscripciones.remove(servicio)){
      servicio.cancelarSuscripcion(this);
    }
  }

  public int quitarDinero(int costo){
    if (costo <= ahorro){
      return ahorro -= costo;
    }
    return ahorro;

  }

  @Override
  public void actualizar(Servicio servicio, String msj) {
    System.out.println("no se");
  }
}
