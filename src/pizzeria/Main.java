package pizzeria;

import java.util.Scanner;

import pizzeria.pizza.*;
import pizzeria.helado.*;
import pizzeria.robot.*;
import pizzeria.robot.state.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Robot robot = new Robot();

        System.out.println("=== Bienvenido a El Pequeño Cesarín ===");
        robot.mostrarEstado();

        int opcion = 0;
        // Validar opción principal
        while (true) {
            System.out.println("\n¿Qué deseas ordenar?");
            System.out.println("1. Pizza");
            System.out.println("2. Helado");
            System.out.println("3. Pizza + Helado");
            System.out.print("Elige opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion >= 1 && opcion <= 3) break;
            System.out.println("Opción inválida, intenta de nuevo.");
        }

        double total = 0.0;

        // --- PIZZA ---
        if (opcion == 1 || opcion == 3) {
            int masa = 0;
            while (true) {
                System.out.println("\nElige el tipo de masa:");
                System.out.println("1. Napolitana");
                System.out.println("2. Romana");
                System.out.println("3. Americana");
                System.out.print("Opción: ");
                masa = sc.nextInt();
                sc.nextLine();
                if (masa >= 1 && masa <= 3) break;
                System.out.println("Opción inválida, intenta de nuevo.");
            }

            TipoMasa tipoMasa = (masa == 1) ? TipoMasa.NAPOLITANA :
                                (masa == 2) ? TipoMasa.ROMANA :
                                              TipoMasa.AMERICANA;

            // Elegir una pizza de ejemplo (puedes rotar entre las 5 disponibles)
            Pizza pizza = new PizzaSamurai(1, tipoMasa);

            robot.setEstado(new EstadoPreparando());
            pizza.preparar();
            System.out.println("Ticket Pizza: " + pizza.getNombre() + " | $" + pizza.getPrecio());

            total += pizza.getPrecio();
        }

        // --- HELADO ---
        if (opcion == 2 || opcion == 3) {
            int sabor = 0;
            while (true) {
                System.out.println("\nElige el sabor de helado:");
                System.out.println("1. Fresa");
                System.out.println("2. Vainilla");
                System.out.println("3. Chocolate");
                System.out.print("Opción: ");
                sabor = sc.nextInt();
                sc.nextLine();
                if (sabor >= 1 && sabor <= 3) break;
                System.out.println("Opción inválida, intenta de nuevo.");
            }

            SaborHelado saborHelado = (sabor == 1) ? SaborHelado.FRESA :
                                      (sabor == 2) ? SaborHelado.VAINILLA :
                                                     SaborHelado.CHOCOLATE;

            Helado helado = new HeladoSencillo(saborHelado, 20.0);

            // contadores de toppings
            int cGusano=0, cPanda=0, cAro=0, cChispas=0, cMalva=0, cFresas=0, cMango=0, cKiwis=0;

            while (true) {
                System.out.println("\n¿Quieres agregar un ingrediente extra?");
                System.out.println("1. Gomitas gusano");
                System.out.println("2. Gomitas panda");
                System.out.println("3. Gomitas aro");
                System.out.println("4. Chispas de chocolate");
                System.out.println("5. Malvaviscos");
                System.out.println("6. Fresitas");
                System.out.println("7. Manguitos");
                System.out.println("8. Kiwis");
                System.out.println("9. No agregar más");
                System.out.print("Opción: ");
                int extra = sc.nextInt();
                sc.nextLine();

                if (extra == 9) break;

                switch (extra) {
                    case 1:
                        if (cGusano >= 3) { System.out.println("Ya agregaste 3 de gusano."); break; }
                        helado = new ConGomitasGusano(helado); cGusano++; break;
                    case 2:
                        if (cPanda >= 3) { System.out.println("Ya agregaste 3 de panda."); break; }
                        helado = new ConGomitasPanda(helado); cPanda++; break;
                    case 3:
                        if (cAro >= 3) { System.out.println("Ya agregaste 3 de aro."); break; }
                        helado = new ConGomitasAro(helado); cAro++; break;
                    case 4:
                        if (cChispas >= 3) { System.out.println("Ya agregaste 3 chispas."); break; }
                        helado = new ConChispasChocolate(helado); cChispas++; break;
                    case 5:
                        if (cMalva >= 3) { System.out.println("Ya agregaste 3 malvaviscos."); break; }
                        helado = new ConMalvaviscos(helado); cMalva++; break;
                    case 6:
                        if (cFresas >= 3) { System.out.println("Ya agregaste 3 fresitas."); break; }
                        helado = new ConFresitas(helado); cFresas++; break;
                    case 7:
                        if (cMango >= 3) { System.out.println("Ya agregaste 3 manguitos."); break; }
                        helado = new ConManguitos(helado); cMango++; break;
                    case 8:
                        if (cKiwis >= 3) { System.out.println("Ya agregaste 3 kiwis."); break; }
                        helado = new ConKiwis(helado); cKiwis++; break;
                    default:
                        System.out.println("Ingrediente no válido, no se agregó.");
                }
            }

            robot.setEstado(new EstadoPreparando());
            System.out.println("Ticket Helado: " + helado.getDescripcion() + " | $" + helado.getPrecio());

            total += helado.getPrecio();
        }

        // Entrega final
        System.out.println("\nTOTAL A PAGAR: $" + total);
        robot.setEstado(new EstadoEntregando());
        robot.entregar();

        sc.close();
    }
}