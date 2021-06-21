package proyecto_cesarbrito;

import java.io.Serializable;

public class Pregunta implements Serializable {

    private String pregunta;

    private static final long SerialVersionUID = 981L;

    public Pregunta() {
    }

    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String toString() {
        return pregunta;
    }

}
