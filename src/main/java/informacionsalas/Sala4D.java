package informacionsalas;

public class Sala4D implements Salas{
    @Override
    public String tipoSala() {
        return "Sala 4D";
    }

    @Override
    public int cantidadAsientos() {
        return 100;
    }

    @Override
    public int asientosReservados() {
        return 100;
    }

}
