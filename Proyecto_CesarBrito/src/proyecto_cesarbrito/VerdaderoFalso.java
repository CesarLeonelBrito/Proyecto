package proyecto_cesarbrito;

public class VerdaderoFalso extends Pregunta {

    private boolean opcion;

    public VerdaderoFalso() {
        super();
    }

    public VerdaderoFalso(boolean opcion, String pregunta) {
        super(pregunta);
        this.opcion = opcion;
    }

    public boolean isOpcion() {
        return opcion;
    }

    public void setOpcion(boolean opcion) {
        this.opcion = opcion;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
