package proyecto_cesarbrito;

public class SeleccionMultiple extends Pregunta {

    private String opcion1;
    private String opcion2;
    private String opcion3;
    private String opcion4;
    private int correcta;

    public SeleccionMultiple() {
        super();
    }

    public SeleccionMultiple(String opcion1, String opcion2, String opcion3, String opcion4, int correcta, String pregunta) {
        super(pregunta);
        this.opcion1 = opcion1;
        this.opcion2 = opcion2;
        this.opcion3 = opcion3;
        this.opcion4 = opcion4;
        this.correcta = correcta;
    }

    public String getOpcion1() {
        return opcion1;
    }

    public void setOpcion1(String opcion1) {
        this.opcion1 = opcion1;
    }

    public String getOpcion2() {
        return opcion2;
    }

    public void setOpcion2(String opcion2) {
        this.opcion2 = opcion2;
    }

    public String getOpcion3() {
        return opcion3;
    }

    public void setOpcion3(String opcion3) {
        this.opcion3 = opcion3;
    }

    public String getOpcion4() {
        return opcion4;
    }

    public void setOpcion4(String opcion4) {
        this.opcion4 = opcion4;
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
