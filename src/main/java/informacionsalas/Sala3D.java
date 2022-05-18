package informacionsalas;

public class Sala3D implements Salas {
    @Override
    public String tipoSala() {
        return "Sala 3D";
    }

    @Override
    public int cantidadAsientos() {
        return 150;
    }

    @Override
    public int asientosReservados() {
        return 145;
    }
}

