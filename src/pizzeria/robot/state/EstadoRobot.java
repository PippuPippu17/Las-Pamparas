package pizzeria.robot.state;

import pizzeria.robot.Robot; // 

/**
 * Interfaz que define los comportamientos generales de un Robot
 * en sus distintos estados.
 * 
 * @author Las Pamparas
 */
public interface EstadoRobot {
    void atender(Robot robot);
    void preparar(Robot robot);
    void entregar(Robot robot);
    void dormir(Robot robot);
}