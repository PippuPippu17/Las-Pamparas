package pizzeria.robot.state;

import pizzeria.robot.Robot;

/**
 * Estado Entregando: el robot ya termino la preparacion y entrega el pedido al cliente.
 * Luego de esto vuelve a dormirse.
 * 
 * @author Las Pamparas
 */
public class EstadoEntregando implements EstadoRobot {

    @Override
    public void atender(Robot robot) {
        System.out.println("El robot esta entregando, no puede atender a otro cliente.");
    }

    @Override
    public void preparar(Robot robot) {
        System.out.println("El robot ya preparo el pedido, solo falta entregarlo.");
    }

    @Override
    public void entregar(Robot robot) {
        System.out.println("El robot entrego el pedido y el ticket al cliente.");
        robot.setEstado(new EstadoDormido());
    }

    @Override
    public void dormir(Robot robot) {
        System.out.println("El robot no puede dormirse hasta entregar el pedido.");
    }
}