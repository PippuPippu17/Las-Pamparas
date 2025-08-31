public interface Servicio {

  /**
   * @return nombre  del servicio, por ejemplo "Memeflix")
   */
  String getNombre();

  /**
   * Suscribe a un cliente (comienza a recibir notificaciones)
   */
  public void suscribirCliente(Cliente cliente);

  /**
   * Cancela la suscripcion de un cliente
   */
  public void cancelarSuscripcion(Cliente cliente);

  /**
   * Cobrar medinte Strategy y notifica
   * @param mes numero del mes, del 1 al 12
   */
  public void cobro(int mes);
}

