public interface Observador {

  /**
   * Notifica al cliente con un mensaje de un servicio.
   * @param servicio Servicio emisor de la notificacion.
   * @param mensaje  Contenido textual de la notificacion.
   */
  public void actualizar(Servicio servicio, String mensaje);
}

