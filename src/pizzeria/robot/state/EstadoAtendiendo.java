package pizzeria.robot.state;

import pizzeria.robot.Robot;

/**
 * Estado Atendiendo: el robot esta tomando la orden del cliente.
 * Aqui aun no prepara ni entrega, solo recibe la orden.
 * 
 * @author Las Pamparas
 */
public class EstadoAtendiendo implements EstadoRobot {

    @Override
    public void atender(Robot robot) {
        System.out.println("El robot ya esta atendiendo al cliente.");
    }

    @Override
    public void preparar(Robot robot) {
        System.out.println("El robot confirma la orden y empieza a preparar.");
        robot.setEstado(new EstadoPreparando());
    }

    @Override
    public void entregar(Robot robot) {
        System.out.println("No puedes entregar, el robot apenas esta atendiendo.");
    }

    @Override
    public void dormir(Robot robot) {
        System.out.println("El cliente cancelo la orden, el robot vuelve a dormirse.");
        robot.setEstado(new EstadoDormido());
    }
}