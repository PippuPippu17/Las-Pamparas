package pizzeria.robot.state;

import pizzeria.robot.Robot;

/**
 * Estado Preparando: el robot esta cocinando la pizza o armando el helado.
 * No puede atender a otro cliente hasta terminar.
 * 
 * @author Las Pamparas
 */
public class EstadoPreparando implements EstadoRobot {

    @Override
    public void atender(Robot robot) {
        System.out.println("El robot esta ocupado preparando, no puede atender a otro cliente.");
    }

    @Override
    public void preparar(Robot robot) {
        System.out.println("El robot ya esta preparando el pedido...");
    }

    @Override
    public void entregar(Robot robot) {
        System.out.println("El pedido esta listo, el robot espera para entregar.");
        robot.setEstado(new EstadoEntregando());
    }

    @Override
    public void dormir(Robot robot) {
        System.out.println("El robot no puede dormirse mientras prepara un pedido.");
    }
}