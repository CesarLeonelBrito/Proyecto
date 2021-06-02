package proyecto_cesarbrito;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class administrarMaestros {

    private ArrayList<Maestro> listaMaestros = new ArrayList();
    private File archivo = null;

    public administrarMaestros(String path) {
        archivo = new File(path);
    }

    public ArrayList<Maestro> getListaMaestros() {
        return listaMaestros;
    }

    public void setListaMaestros(ArrayList<Maestro> listaMaestros) {
        this.listaMaestros = listaMaestros;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "" + listaMaestros;
    }

    public void setMaestro(Maestro p) {
        this.listaMaestros.add(p);
    }

    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Maestro t : listaMaestros) {
                bw.write(t.getNombre() + ";");
                bw.write(t.getUsername() + ";");
                bw.write(t.getPassword() + ";");                
                bw.write(t.getProfesion()+ ";");
                bw.write(t.getRol() + ";");
                bw.write(t.getId()+ ";");
                bw.write(t.getSueldo()+ ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaMaestros = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaMaestros.add(new Maestro(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }

}
