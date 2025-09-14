package pizzeria.robot.state;

import pizzeria.robot.Robot;

/**
 * Estado Dormido: el robot esta apagado hasta que lo llame un cliente.
 * Aqui no puede preparar ni entregar nada.
 * 
 * @author Las Pamparas
 */
public class EstadoDormido implements EstadoRobot {

    @Override
    public void atender(Robot robot) {
        System.out.println("El robot se desperto y empieza a atender al cliente.");
        robot.setEstado(new EstadoAtendiendo());
    }

    @Override
    public void preparar(Robot robot) {
        System.out.println("El robot esta dormido, no puede preparar nada.");
    }

    @Override
    public void entregar(Robot robot) {
        System.out.println("El robot esta dormido, no puede entregar nada.");
    }

    @Override
    public void dormir(Robot robot) {
        System.out.println("El robot ya esta dormido.");
    }
}