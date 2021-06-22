package proyecto_cesarbrito;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Examen implements Serializable {

    private Date fechaFinal;
    private int duracion;
    private String titulo;
    private ArrayList<Pregunta> preguntas = new ArrayList();
    private ArrayList<ExamenAlumno> examenesAlumnos = new ArrayList();

    private static final long SerialVersionUID = 987L;

    public Examen() {
    }

    public Examen(Date fechaFinal, int duracion, String titulo) {
        this.fechaFinal = fechaFinal;
        this.duracion = duracion;
        this.titulo = titulo;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Pregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Pregunta> preguntas) {
        this.preguntas = preguntas;
    }

    public ArrayList<ExamenAlumno> getExamenesAlumnos() {
        return examenesAlumnos;
    }

    public void setExamenesAlumnos(ArrayList<ExamenAlumno> examenesAlumnos) {
        this.examenesAlumnos = examenesAlumnos;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
        return titulo + " - " + sdf.format(fechaFinal);
    }

}
