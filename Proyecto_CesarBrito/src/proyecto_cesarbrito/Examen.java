package proyecto_cesarbrito;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Examen implements Serializable {

    private Date fechaFinal;
    private int duracion;
    private ArrayList preguntas = new ArrayList();
    private ArrayList intentos = new ArrayList();

    private static final long SerialVersionUID = 987L;

}
