package proyecto_cesarbrito;

import java.io.Serializable;

public class ExamenAlumno implements Serializable {

    private Alumno estudiante;
    private int nota;

    private static final long SerialVersionUID = 981L;

    public ExamenAlumno() {
    }

    public ExamenAlumno(Alumno estudiante, int nota) {
        this.estudiante = estudiante;
        this.nota = nota;
    }

    public Alumno getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Alumno estudiante) {
        this.estudiante = estudiante;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return estudiante + " - " + nota;
    }

}
