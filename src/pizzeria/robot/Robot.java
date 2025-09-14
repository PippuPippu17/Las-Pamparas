package pizzeria.robot;

import pizzeria.robot.state.EstadoRobot;
import pizzeria.robot.state.EstadoDormido;

/**
 * Clase Robot que simula un trabajador automatico en la pizzeria.
 * El Robot usa el patron State para cambiar su comportamiento segun lo que este haciendo.
 * 
 * Por ejemplo: si esta dormido no puede preparar nada, 
 * si esta atendiendo solo recibe ordenes, etc.
 * 
 * @author Las Pamparas
 */
public class Robot {

    // Estado actual del robot (puede ser Dormido, Atendiendo, Preparando o Entregando)
    private EstadoRobot estadoActual;

    /**
     * Constructor por defecto.
     * Al crear un robot nuevo, siempre empieza dormido.
     */
    public Robot() {
        this.estadoActual = new EstadoDormido();
    }

    /**
     * Constructor que permite crear un robot en un estado inicial especifico.
     * 
     * @param estadoInicial estado en el que comienza el robot
     */
    public Robot(EstadoRobot estadoInicial) {
        this.estadoActual = estadoInicial;
    }

    /**
     * Permite cambiar el estado del robot.
     * @param nuevoEstado el estado al que se va a mover el robot
     */
    public void setEstado(EstadoRobot nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    /**
     * Muestra el estado actual del robot.
     */
    public void mostrarEstado() {
        System.out.println("El robot esta en estado: " + estadoActual.getClass().getSimpleName());
    }

    /**
     * Intenta atender a un cliente en el estado actual.
     */
    public void atender() {
        estadoActual.atender(this);
    }

    /**
     * Intenta preparar un producto en el estado actual.
     */
    public void preparar() {
        estadoActual.preparar(this);
    }

    /**
     * Intenta entregar un pedido en el estado actual.
     */
    public void entregar() {
        estadoActual.entregar(this);
    }

    /**
     * El robot intenta dormirse (solo si es valido segun el estado).
     */
    public void dormir() {
        estadoActual.dormir(this);
    }
}