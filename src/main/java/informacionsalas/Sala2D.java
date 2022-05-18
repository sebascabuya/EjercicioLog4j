package informacionsalas;

public class Sala2D implements Salas{
    @Override
    public String tipoSala() {
        return "Sala 2D";
    }

    @Override
    public int cantidadAsientos() {
        return 200;
    }

    @Override
    public int asientosReservados() {
        return 146;
    }
}
