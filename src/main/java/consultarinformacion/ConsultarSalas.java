package consultarinformacion;

import informacionsalas.Sala2D;
import informacionsalas.Sala3D;
import informacionsalas.Sala4D;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class ConsultarSalas implements OperacionesConsulta{

    private static Logger log = Logger.getLogger(ConsultarSalas.class);

    @Override
    public void consultarDisponibilidad() {
        log.debug("Se ha iniciado el proceso de consulta");
        Scanner sc = new Scanner(System.in);
        Sala2D sala2D = new Sala2D();
        Sala3D sala3D = new Sala3D();
        Sala4D sala4D = new Sala4D();
        String noDisponibilidad = "No hay disponibilidad para esa cantidad de personas";
        int opcion;
        boolean salir = false;

        while (!salir) {
            System.out.println("Elige el número de la sala donde deseas ver la película");
            System.out.println("1. Sala 2D");
            System.out.println("2. Sala 3D");
            System.out.println("3. Sala 4D");
            System.out.println("4. Salir");
            opcion = sc.nextInt();
            log.info("Se ha escogido la opción " + opcion);

            if (opcion == 0) {
                log.warn("No existe la opción cero");
            }

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el número de personas que va a ver la película en 2D");
                    opcion = sc.nextInt();
                    log.debug("Se ha ingresado a los datos de la Sala 2D");
                    if (opcion <= 20) {
                        if (opcion <= (sala2D.cantidadAsientos() - sala2D.asientosReservados())) {
                            System.out.println("Has reservado " + opcion + " puestos en la sala 2D");
                            log.info("Se han reservado " + opcion + " en la sala 2D");
                        } else {
                            System.out.println(noDisponibilidad);
                            log.error("No se han podido reservar los asientos en la sala 2D por falta de disponibilidad");
                        }
                    } else {
                        log.warn("No se permiten reservar más de 20 personas");
                    }
                    salir = true;
                    break;
                case 2:
                    System.out.println("Ingrese el número de personas que va a ver la película en 3D");
                    opcion = sc.nextInt();
                    log.debug("Se ha ingresado a los datos de la Sala 3D");
                    if (opcion <= 20) {
                        if (opcion <= (sala3D.cantidadAsientos() - sala3D.asientosReservados())) {
                            System.out.println("Has reservado " + opcion + " puestos en la sala 3D");
                            log.info("Se han reservado " + opcion + " en la sala 3D");
                        } else {
                            System.out.println(noDisponibilidad);
                            log.error("No se han podido reservar los asientos en la sala 3D por falta de disponibilidad");
                        }
                    } else {
                        log.warn("No se permiten reservar más de 15 personas");
                    }
                    salir = true;
                    break;
                case 3:
                    System.out.println("Ingrese el número de personas que va a ver la película en 4D");
                    opcion = sc.nextInt();
                    log.debug("Se ha ingresado a los datos de la Sala 4D");
                    if (opcion <= 20) {
                        if (opcion <= (sala4D.cantidadAsientos() - sala4D.asientosReservados())) {
                            System.out.println("Has reservado " + opcion + " puestos en la sala 4D");
                            log.info("Se han reservado " + opcion + " en la sala 4D");
                        } else {
                            System.out.println(noDisponibilidad);
                            log.error("No se han podido reservar los asientos en la sala 4D por falta de disponibilidad");
                        }
                    } else {
                        log.warn("No se permiten reservar más de 10 personas");
                    }
                    salir = true;
                    break;
                case 4:
                    log.info("Se ha decidido salir del programa");
                    salir = true;
                    break;
                default:
                    log.fatal("Se ha ingresado una opción no valida");
                    System.out.println("No ha ingresado una opción valida");
            }
        }
    }
}
