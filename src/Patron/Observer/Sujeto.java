
import java.util.LinkedList;

public abstract class Sujeto implements Servicio{

  LinkedList<Cliente> subs = new LinkedList<Cliente>();

  @Override
  public void suscribirCliente(Cliente cliente){
    if (!subs.contains(cliente)){
      subs.add(cliente);
    }
  }

  @Override
  public void cancelarSuscripcion(Cliente cliente){
    subs.remove(cliente);
  }

  public void notificarCadaCliente(String msj){
    for(Cliente cl : subs){
      cl.actualizar(this, msj);
    }
  }

  public void notificarUnCliente(Cliente cliente, String msj){
    cliente.actualizar(this, msj);
  }
}
