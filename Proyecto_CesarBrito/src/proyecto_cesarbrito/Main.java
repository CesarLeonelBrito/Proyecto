package proyecto_cesarbrito;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_registro = new javax.swing.JFrame();
        jLabel87 = new javax.swing.JLabel();
        registro_agregar = new javax.swing.JButton();
        registro_modificar = new javax.swing.JButton();
        asignar_maestro = new javax.swing.JButton();
        maestro_agregar = new javax.swing.JButton();
        maestro_modificar = new javax.swing.JButton();
        asignar_alumno = new javax.swing.JButton();
        alumnos_agregar = new javax.swing.JButton();
        alumnos_modificar = new javax.swing.JButton();
        clases_agregar = new javax.swing.JButton();
        clases_modificar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cerrar_sesion_registro = new javax.swing.JMenuItem();
        cerrar_sistema_registro = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jd_crear_registro = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        tf_registro_user = new javax.swing.JTextField();
        tf_registro_pass = new javax.swing.JTextField();
        jb_crear_registro = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jd_modificar_registro = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        tf_registro_user_m = new javax.swing.JTextField();
        tf_registro_pass_m = new javax.swing.JTextField();
        jb_modificar_registro = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jd_crear_maestro = new javax.swing.JDialog();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        tf_maestro_user = new javax.swing.JTextField();
        tf_maestro_pass = new javax.swing.JTextField();
        tf_maestro_nombre = new javax.swing.JTextField();
        tf_maestro_profesion = new javax.swing.JTextField();
        tf_maestro_rol = new javax.swing.JTextField();
        tf_maestro_sueldo = new javax.swing.JFormattedTextField();
        tf_maestro_id = new javax.swing.JFormattedTextField();
        jb_crear_maestro = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jd_modificar_maestro = new javax.swing.JDialog();
        tf_maestro_nombre_m = new javax.swing.JTextField();
        tf_maestro_profesion_m = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        tf_maestro_rol_m = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        tf_maestro_sueldo_m = new javax.swing.JFormattedTextField();
        jLabel35 = new javax.swing.JLabel();
        tf_maestro_id_m = new javax.swing.JFormattedTextField();
        jLabel36 = new javax.swing.JLabel();
        jb_modificar_maestro = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        tf_maestro_user_m = new javax.swing.JTextField();
        tf_maestro_pass_m = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jd_crear_alumno = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tf_alumno_user = new javax.swing.JTextField();
        tf_alumno_pass = new javax.swing.JTextField();
        tf_alumno_nombre = new javax.swing.JTextField();
        tf_alumno_carrera = new javax.swing.JTextField();
        tf_alumno_rol = new javax.swing.JTextField();
        tf_alumno_clases = new javax.swing.JFormattedTextField();
        tf_alumno_cuenta = new javax.swing.JFormattedTextField();
        jb_crear_alumno = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        jd_modificar_alumno = new javax.swing.JDialog();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        tf_alumno_user_m = new javax.swing.JTextField();
        tf_alumno_pass_m = new javax.swing.JTextField();
        tf_alumno_nombre_m = new javax.swing.JTextField();
        tf_alumno_carrera_m = new javax.swing.JTextField();
        tf_alumno_rol_m = new javax.swing.JTextField();
        tf_alumno_clases_m = new javax.swing.JFormattedTextField();
        tf_alumno_cuenta_m = new javax.swing.JFormattedTextField();
        jb_modificar_alumno = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jd_listar_registros = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_registros = new javax.swing.JList<>();
        jLabel47 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jd_listar_alumnos = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_alumnos = new javax.swing.JList<>();
        jLabel48 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jd_listar_maestros = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_maestros = new javax.swing.JList<>();
        jLabel49 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        popup_registro = new javax.swing.JPopupMenu();
        eliminar_registro = new javax.swing.JMenuItem();
        modificar_registro = new javax.swing.JMenuItem();
        popup_alumno = new javax.swing.JPopupMenu();
        eliminar_alumno = new javax.swing.JMenuItem();
        modificar_alumno = new javax.swing.JMenuItem();
        popup_maestro = new javax.swing.JPopupMenu();
        eliminar_maestro = new javax.swing.JMenuItem();
        modificar_maestro = new javax.swing.JMenuItem();
        jd_crear_clase = new javax.swing.JDialog();
        jb_crear_clases = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        tf_clase_nombre = new javax.swing.JTextField();
        tf_clase_id = new javax.swing.JFormattedTextField();
        tf_clase_hora = new javax.swing.JSpinner();
        tf_clase_unidades = new javax.swing.JSpinner();
        tf_clase_semestre = new javax.swing.JSpinner();
        tf_clase_periodo = new javax.swing.JSpinner();
        tf_clase_year = new com.toedter.calendar.JYearChooser();
        jLabel72 = new javax.swing.JLabel();
        jd_modificar_clase = new javax.swing.JDialog();
        tf_clase_nombre_m = new javax.swing.JTextField();
        jb_modificar_clases = new javax.swing.JButton();
        tf_clase_id_m = new javax.swing.JFormattedTextField();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        tf_clase_hora_m = new javax.swing.JSpinner();
        jLabel60 = new javax.swing.JLabel();
        tf_clase_unidades_m = new javax.swing.JSpinner();
        jLabel61 = new javax.swing.JLabel();
        tf_clase_semestre_m = new javax.swing.JSpinner();
        jLabel62 = new javax.swing.JLabel();
        tf_clase_periodo_m = new javax.swing.JSpinner();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        tf_clase_year_m = new com.toedter.calendar.JYearChooser();
        jLabel73 = new javax.swing.JLabel();
        jd_listar_clase = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_clases = new javax.swing.JList<>();
        jLabel74 = new javax.swing.JLabel();
        popup_clase = new javax.swing.JPopupMenu();
        eliminar_clase = new javax.swing.JMenuItem();
        modificar_clase = new javax.swing.JMenuItem();
        jd_asignar_maestro = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_verMaestros = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jl_verClases = new javax.swing.JList<>();
        jb_asignar_maestro = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jd_asignar_alumno = new javax.swing.JDialog();
        jScrollPane7 = new javax.swing.JScrollPane();
        jl_verAlumnos = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        jl_verClasesA = new javax.swing.JList<>();
        jb_asignar_alumnos = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jf_alumno = new javax.swing.JFrame();
        jb_alumnos_tareas = new javax.swing.JButton();
        jb_alumnos_examenes = new javax.swing.JButton();
        jb_alumnos_notas = new javax.swing.JButton();
        jb_alumnos_foros = new javax.swing.JButton();
        jLabel88 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        cerrar_sesion_alum = new javax.swing.JMenuItem();
        cerrar_sistema_alum = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jd_entregar_tarea = new javax.swing.JDialog();
        tarea_alum_titulo = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        tarea_alum_desc = new javax.swing.JTextArea();
        examinar_equipo = new javax.swing.JButton();
        jb_entregar_tarea = new javax.swing.JButton();
        label_tarea = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jd_verTareas_alumnos = new javax.swing.JDialog();
        jScrollPane11 = new javax.swing.JScrollPane();
        jl_verMisTareas = new javax.swing.JList<>();
        jb_entregarMiTarea = new javax.swing.JButton();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jd_alumno_foro = new javax.swing.JDialog();
        tf_alumno_foroTitulo = new javax.swing.JTextField();
        jScrollPane13 = new javax.swing.JScrollPane();
        ta_alumno_foroDesc = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        ta_alumnos_aportes = new javax.swing.JTextArea();
        jLabel83 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        ta_alumnos_miAporte = new javax.swing.JTextArea();
        jb_alumno_ingresarAporte = new javax.swing.JButton();
        jLabel96 = new javax.swing.JLabel();
        jd_verMisForos = new javax.swing.JDialog();
        jScrollPane16 = new javax.swing.JScrollPane();
        jl_verMisForos = new javax.swing.JList<>();
        jb_abrirForo = new javax.swing.JButton();
        jLabel98 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jf_maestros = new javax.swing.JFrame();
        jb_maestros_tareas1 = new javax.swing.JButton();
        jb_maestros_examenes1 = new javax.swing.JButton();
        jb_maestros_notas1 = new javax.swing.JButton();
        jb_alumnos_foros1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel90 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        cerrar_sesion_maestro = new javax.swing.JMenuItem();
        cerrar_sistema_maesrto = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jd_asignar_tarea = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tarea_date = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        tarea_hora = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        tarea_titulo = new javax.swing.JTextField();
        Descripcion = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        tarea_descripcion = new javax.swing.JTextArea();
        jb_asignar_tarea = new javax.swing.JButton();
        jLabel99 = new javax.swing.JLabel();
        jd_verClases_maestros = new javax.swing.JDialog();
        jScrollPane12 = new javax.swing.JScrollPane();
        jl_asignar_clases = new javax.swing.JList<>();
        jb_asginat_tarea = new javax.swing.JButton();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jd_verClasesForos_maestros = new javax.swing.JDialog();
        jScrollPane17 = new javax.swing.JScrollPane();
        jl_asignarforos_clases = new javax.swing.JList<>();
        jb_asginar_foro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jd_crearForo = new javax.swing.JDialog();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        tf_crearForo_tit = new javax.swing.JTextField();
        jScrollPane18 = new javax.swing.JScrollPane();
        tf_crearForo_desc = new javax.swing.JTextArea();
        jb_crear_foro = new javax.swing.JButton();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jd_verForos_Maestro = new javax.swing.JDialog();
        jScrollPane20 = new javax.swing.JScrollPane();
        ta_alumno_foroDesc1 = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        ta_alumnos_aportes1 = new javax.swing.JTextArea();
        jLabel86 = new javax.swing.JLabel();
        tf_alumno_foroTitulo1 = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        jd_verForosDeClase = new javax.swing.JDialog();
        jScrollPane19 = new javax.swing.JScrollPane();
        jl_foros = new javax.swing.JList<>();
        jb_abiriForo = new javax.swing.JButton();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jd_verClases_revisarTareas = new javax.swing.JDialog();
        jScrollPane22 = new javax.swing.JScrollPane();
        jl_clases_revisar = new javax.swing.JList<>();
        jb_abrir_clases = new javax.swing.JButton();
        jLabel112 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jd_verTareas_revisarTareas = new javax.swing.JDialog();
        jScrollPane23 = new javax.swing.JScrollPane();
        jl_tareas_revisar = new javax.swing.JList<>();
        jb_abrir_tareas = new javax.swing.JButton();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jd_verTareasdeAlumnos_revisarTareas = new javax.swing.JDialog();
        jScrollPane24 = new javax.swing.JScrollPane();
        jl_intentosA_revisar = new javax.swing.JList<>();
        jb_abrir_tareasdeAlumnos = new javax.swing.JButton();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jd_abrir_tarea = new javax.swing.JDialog();
        jLabel91 = new javax.swing.JLabel();
        tf_alum_revision = new javax.swing.JTextField();
        jb_abrir_archivo_est = new javax.swing.JButton();
        jLabel92 = new javax.swing.JLabel();
        ftf_nota = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jLabel105 = new javax.swing.JLabel();
        notas_maestro = new javax.swing.JDialog();
        jScrollPane25 = new javax.swing.JScrollPane();
        jt_maestros = new javax.swing.JTable();
        jLabel106 = new javax.swing.JLabel();
        notas_estudiante = new javax.swing.JDialog();
        jScrollPane26 = new javax.swing.JScrollPane();
        jt_alumnos = new javax.swing.JTable();
        jLabel107 = new javax.swing.JLabel();
        examenes_maestro_clases = new javax.swing.JDialog();
        jLabel118 = new javax.swing.JLabel();
        jScrollPane27 = new javax.swing.JScrollPane();
        jl_examenes_clases = new javax.swing.JList<>();
        jb_abrir_examenes = new javax.swing.JButton();
        jLabel127 = new javax.swing.JLabel();
        examenes_maestro_examenes = new javax.swing.JDialog();
        jb_crear_examen = new javax.swing.JButton();
        jLabel119 = new javax.swing.JLabel();
        jScrollPane28 = new javax.swing.JScrollPane();
        jl_examenes_examenes = new javax.swing.JList<>();
        jLabel128 = new javax.swing.JLabel();
        popup_examenes = new javax.swing.JPopupMenu();
        eliminar_examen = new javax.swing.JMenuItem();
        jd_crear_examen = new javax.swing.JDialog();
        jb_add_examen = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        examen_titulo = new javax.swing.JTextField();
        examen_fecha = new com.toedter.calendar.JDateChooser();
        examen_hora = new javax.swing.JFormattedTextField();
        examen_duracion = new javax.swing.JFormattedTextField();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel124 = new javax.swing.JLabel();
        pregunta_verdadero = new javax.swing.JTextField();
        rb_verdadero = new javax.swing.JRadioButton();
        rb_falso = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel125 = new javax.swing.JLabel();
        pregunta_seleccion = new javax.swing.JTextField();
        rb_a = new javax.swing.JRadioButton();
        rb_b = new javax.swing.JRadioButton();
        rb_c = new javax.swing.JRadioButton();
        rb_d = new javax.swing.JRadioButton();
        tf_op1 = new javax.swing.JTextField();
        tf_op2 = new javax.swing.JTextField();
        tf_op3 = new javax.swing.JTextField();
        tf_op4 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel129 = new javax.swing.JLabel();
        verdadero_falso = new javax.swing.ButtonGroup();
        seleccion_multiple = new javax.swing.ButtonGroup();
        examenes_alumno_examenes = new javax.swing.JDialog();
        jScrollPane29 = new javax.swing.JScrollPane();
        jl_mis_examenes = new javax.swing.JList<>();
        jb_realizar_examenes = new javax.swing.JButton();
        jLabel126 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        responder_verdadero = new javax.swing.JDialog();
        label_pregunta = new javax.swing.JLabel();
        answer_verd = new javax.swing.JRadioButton();
        answer_falso = new javax.swing.JRadioButton();
        jb_next_verd = new javax.swing.JButton();
        responder_seleccion = new javax.swing.JDialog();
        label_pregunta1 = new javax.swing.JLabel();
        answer_a = new javax.swing.JRadioButton();
        answer_b = new javax.swing.JRadioButton();
        answer_c = new javax.swing.JRadioButton();
        answer_d = new javax.swing.JRadioButton();
        opcion_a = new javax.swing.JLabel();
        opcion_b = new javax.swing.JLabel();
        opcion_c = new javax.swing.JLabel();
        opcion_d = new javax.swing.JLabel();
        jb_next_selecc = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jb_login = new javax.swing.JButton();
        tf_user_login = new javax.swing.JTextField();
        tf_pass_login = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();

        jf_registro.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jf_registro.setTitle("Registro");
        jf_registro.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jf_registro.setResizable(false);
        jf_registro.setSize(new java.awt.Dimension(1920, 1080));
        jf_registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/unitec_logo.png"))); // NOI18N
        jf_registro.getContentPane().add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 860, 310, 110));

        registro_agregar.setBackground(new java.awt.Color(204, 204, 204));
        registro_agregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registro_agregar.setForeground(new java.awt.Color(0, 0, 0));
        registro_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/admin.png"))); // NOI18N
        registro_agregar.setText("Agregar Registro");
        registro_agregar.setFocusable(false);
        registro_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registro_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registro_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_agregarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(registro_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        registro_modificar.setBackground(new java.awt.Color(204, 204, 204));
        registro_modificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        registro_modificar.setForeground(new java.awt.Color(0, 0, 0));
        registro_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        registro_modificar.setText("Listar Registro");
        registro_modificar.setFocusable(false);
        registro_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registro_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registro_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_modificarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(registro_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        asignar_maestro.setBackground(new java.awt.Color(204, 204, 204));
        asignar_maestro.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        asignar_maestro.setForeground(new java.awt.Color(0, 0, 0));
        asignar_maestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/asignar_maestro.png"))); // NOI18N
        asignar_maestro.setText("Asignar Maestro");
        asignar_maestro.setFocusable(false);
        asignar_maestro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        asignar_maestro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        asignar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignar_maestroActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(asignar_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 10, -1, -1));

        maestro_agregar.setBackground(new java.awt.Color(204, 204, 204));
        maestro_agregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        maestro_agregar.setForeground(new java.awt.Color(0, 0, 0));
        maestro_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/maestro.png"))); // NOI18N
        maestro_agregar.setText("Agregar Maestro");
        maestro_agregar.setFocusable(false);
        maestro_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        maestro_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        maestro_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maestro_agregarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(maestro_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, -1, -1));

        maestro_modificar.setBackground(new java.awt.Color(204, 204, 204));
        maestro_modificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        maestro_modificar.setForeground(new java.awt.Color(0, 0, 0));
        maestro_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        maestro_modificar.setText("Listar Maestros");
        maestro_modificar.setFocusable(false);
        maestro_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        maestro_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        maestro_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maestro_modificarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(maestro_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));

        asignar_alumno.setBackground(new java.awt.Color(204, 204, 204));
        asignar_alumno.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        asignar_alumno.setForeground(new java.awt.Color(0, 0, 0));
        asignar_alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/matricular_alumno.png"))); // NOI18N
        asignar_alumno.setText("Matricular Alumno");
        asignar_alumno.setFocusable(false);
        asignar_alumno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        asignar_alumno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        asignar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignar_alumnoActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(asignar_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1620, 330, -1, -1));

        alumnos_agregar.setBackground(new java.awt.Color(204, 204, 204));
        alumnos_agregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        alumnos_agregar.setForeground(new java.awt.Color(0, 0, 0));
        alumnos_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/graduado.png"))); // NOI18N
        alumnos_agregar.setText("Agregar Alumno");
        alumnos_agregar.setFocusable(false);
        alumnos_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        alumnos_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alumnos_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_agregarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(alumnos_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 10, -1, -1));

        alumnos_modificar.setBackground(new java.awt.Color(204, 204, 204));
        alumnos_modificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        alumnos_modificar.setForeground(new java.awt.Color(0, 0, 0));
        alumnos_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        alumnos_modificar.setText("Listar Alumnos");
        alumnos_modificar.setFocusable(false);
        alumnos_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        alumnos_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alumnos_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_modificarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(alumnos_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 320, -1, -1));

        clases_agregar.setBackground(new java.awt.Color(204, 204, 204));
        clases_agregar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        clases_agregar.setForeground(new java.awt.Color(0, 0, 0));
        clases_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/clase.png"))); // NOI18N
        clases_agregar.setText("Agregar Clase");
        clases_agregar.setFocusable(false);
        clases_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clases_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clases_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clases_agregarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(clases_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 10, -1, -1));

        clases_modificar.setBackground(new java.awt.Color(204, 204, 204));
        clases_modificar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        clases_modificar.setForeground(new java.awt.Color(0, 0, 0));
        clases_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/editar.png"))); // NOI18N
        clases_modificar.setText("Listar Clases");
        clases_modificar.setFocusable(false);
        clases_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clases_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clases_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clases_modificarActionPerformed(evt);
            }
        });
        jf_registro.getContentPane().add(clases_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 320, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/frame_wallpapers.jpg"))); // NOI18N
        jf_registro.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, -1, -1));

        jMenu1.setText("Sesi??n");

        cerrar_sesion_registro.setText("Cerrar sesi??n");
        cerrar_sesion_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesion_registroActionPerformed(evt);
            }
        });
        jMenu1.add(cerrar_sesion_registro);

        cerrar_sistema_registro.setText("Cerrar el sistema");
        cerrar_sistema_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sistema_registroActionPerformed(evt);
            }
        });
        jMenu1.add(cerrar_sistema_registro);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        jf_registro.setJMenuBar(jMenuBar1);

        jd_crear_registro.setTitle("Crear Registro");
        jd_crear_registro.setIconImage(null);
        jd_crear_registro.setSize(new java.awt.Dimension(706, 538));
        jd_crear_registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Usuario:");
        jd_crear_registro.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 96, -1, -1));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Contrase??a:");
        jd_crear_registro.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 211, -1, -1));

        tf_registro_user.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_registro.getContentPane().add(tf_registro_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 92, 307, -1));

        tf_registro_pass.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_registro.getContentPane().add(tf_registro_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 207, 307, -1));

        jb_crear_registro.setBackground(new java.awt.Color(255, 255, 255));
        jb_crear_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_crear_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_registroActionPerformed(evt);
            }
        });
        jd_crear_registro.getContentPane().add(jb_crear_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 347, -1, -1));
        jd_crear_registro.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 320, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_crear_registro.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_modificar_registro.setTitle("Modificar Registro");
        jd_modificar_registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Contrase??a:");
        jd_modificar_registro.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 211, -1, -1));

        tf_registro_user_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_registro.getContentPane().add(tf_registro_user_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 92, 307, -1));

        tf_registro_pass_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_registro.getContentPane().add(tf_registro_pass_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(217, 207, 307, -1));

        jb_modificar_registro.setBackground(new java.awt.Color(255, 255, 255));
        jb_modificar_registro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_modificar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_registroActionPerformed(evt);
            }
        });
        jd_modificar_registro.getContentPane().add(jb_modificar_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 347, -1, -1));

        jLabel25.setForeground(new java.awt.Color(0, 0, 0));
        jLabel25.setText("Usuario:");
        jd_modificar_registro.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 96, -1, -1));
        jd_modificar_registro.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_modificar_registro.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_crear_maestro.setTitle("Crear Maestro");
        jd_crear_maestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Usuario:");
        jd_crear_maestro.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 64, -1, -1));

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Contrase??a:");
        jd_crear_maestro.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 106, -1, -1));

        jLabel28.setForeground(new java.awt.Color(0, 0, 0));
        jLabel28.setText("Nombre:");
        jd_crear_maestro.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 148, -1, -1));

        jLabel29.setForeground(new java.awt.Color(0, 0, 0));
        jLabel29.setText("Profesion:");
        jd_crear_maestro.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 190, -1, -1));

        jLabel30.setForeground(new java.awt.Color(0, 0, 0));
        jLabel30.setText("Rol:");
        jd_crear_maestro.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 232, -1, -1));

        jLabel31.setForeground(new java.awt.Color(0, 0, 0));
        jLabel31.setText("ID:");
        jd_crear_maestro.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 274, -1, -1));

        jLabel32.setForeground(new java.awt.Color(0, 0, 0));
        jLabel32.setText("Sueldo:");
        jd_crear_maestro.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 316, -1, -1));

        tf_maestro_user.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_maestro.getContentPane().add(tf_maestro_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 60, 341, -1));

        tf_maestro_pass.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_maestro.getContentPane().add(tf_maestro_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 102, 341, -1));

        tf_maestro_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_maestro.getContentPane().add(tf_maestro_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 144, 341, -1));

        tf_maestro_profesion.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_maestro.getContentPane().add(tf_maestro_profesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 186, 341, -1));

        tf_maestro_rol.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_maestro.getContentPane().add(tf_maestro_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 228, 341, -1));

        tf_maestro_sueldo.setBackground(new java.awt.Color(255, 255, 255));
        tf_maestro_sueldo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_crear_maestro.getContentPane().add(tf_maestro_sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 312, 341, 24));

        tf_maestro_id.setBackground(new java.awt.Color(255, 255, 255));
        tf_maestro_id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_crear_maestro.getContentPane().add(tf_maestro_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 270, 341, 24));

        jb_crear_maestro.setBackground(new java.awt.Color(255, 255, 255));
        jb_crear_maestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_crear_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_maestroActionPerformed(evt);
            }
        });
        jd_crear_maestro.getContentPane().add(jb_crear_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 393, -1, -1));
        jd_crear_maestro.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_crear_maestro.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_modificar_maestro.setTitle("Modificar Maestro");
        jd_modificar_maestro.setSize(new java.awt.Dimension(710, 540));
        jd_modificar_maestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_maestro_nombre_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_maestro.getContentPane().add(tf_maestro_nombre_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 144, 341, -1));

        tf_maestro_profesion_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_maestro.getContentPane().add(tf_maestro_profesion_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 186, 341, -1));

        jLabel33.setForeground(new java.awt.Color(0, 0, 0));
        jLabel33.setText("Usuario:");
        jd_modificar_maestro.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 64, -1, -1));

        tf_maestro_rol_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_maestro.getContentPane().add(tf_maestro_rol_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 228, 341, -1));

        jLabel34.setForeground(new java.awt.Color(0, 0, 0));
        jLabel34.setText("Contrase??a:");
        jd_modificar_maestro.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 106, -1, -1));

        tf_maestro_sueldo_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_maestro_sueldo_m.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_modificar_maestro.getContentPane().add(tf_maestro_sueldo_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 312, 341, 24));

        jLabel35.setForeground(new java.awt.Color(0, 0, 0));
        jLabel35.setText("Nombre:");
        jd_modificar_maestro.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 148, -1, -1));

        tf_maestro_id_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_maestro_id_m.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_modificar_maestro.getContentPane().add(tf_maestro_id_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 270, 341, 24));

        jLabel36.setForeground(new java.awt.Color(0, 0, 0));
        jLabel36.setText("Profesion:");
        jd_modificar_maestro.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(125, 190, -1, -1));

        jb_modificar_maestro.setBackground(new java.awt.Color(255, 255, 255));
        jb_modificar_maestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_modificar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_maestroActionPerformed(evt);
            }
        });
        jd_modificar_maestro.getContentPane().add(jb_modificar_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 393, -1, -1));

        jLabel37.setForeground(new java.awt.Color(0, 0, 0));
        jLabel37.setText("Rol:");
        jd_modificar_maestro.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(162, 232, -1, -1));

        jLabel38.setForeground(new java.awt.Color(0, 0, 0));
        jLabel38.setText("ID:");
        jd_modificar_maestro.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 274, -1, -1));

        jLabel39.setForeground(new java.awt.Color(0, 0, 0));
        jLabel39.setText("Sueldo:");
        jd_modificar_maestro.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(141, 316, -1, -1));

        tf_maestro_user_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_maestro.getContentPane().add(tf_maestro_user_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 60, 341, -1));

        tf_maestro_pass_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_maestro.getContentPane().add(tf_maestro_pass_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 102, 341, -1));
        jd_modificar_maestro.getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_modificar_maestro.getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_crear_alumno.setTitle("Crear Alumno");
        jd_crear_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Usuario:");
        jd_crear_alumno.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 64, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contrase??a:");
        jd_crear_alumno.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 106, -1, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Nombre:");
        jd_crear_alumno.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 148, -1, -1));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Carrera:");
        jd_crear_alumno.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 190, -1, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Rol:");
        jd_crear_alumno.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 232, -1, -1));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Cuenta:");
        jd_crear_alumno.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 274, -1, -1));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Clases Cursadas:");
        jd_crear_alumno.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 316, -1, -1));

        tf_alumno_user.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_alumno.getContentPane().add(tf_alumno_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 60, 341, -1));

        tf_alumno_pass.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_alumno.getContentPane().add(tf_alumno_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 102, 341, -1));

        tf_alumno_nombre.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_alumno.getContentPane().add(tf_alumno_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 144, 341, -1));

        tf_alumno_carrera.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_alumno.getContentPane().add(tf_alumno_carrera, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 186, 341, -1));

        tf_alumno_rol.setBackground(new java.awt.Color(255, 255, 255));
        jd_crear_alumno.getContentPane().add(tf_alumno_rol, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 228, 341, -1));

        tf_alumno_clases.setBackground(new java.awt.Color(255, 255, 255));
        tf_alumno_clases.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_crear_alumno.getContentPane().add(tf_alumno_clases, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 312, 341, 24));

        tf_alumno_cuenta.setBackground(new java.awt.Color(255, 255, 255));
        tf_alumno_cuenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_crear_alumno.getContentPane().add(tf_alumno_cuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 270, 341, 24));

        jb_crear_alumno.setBackground(new java.awt.Color(255, 255, 255));
        jb_crear_alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_crear_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_alumnoActionPerformed(evt);
            }
        });
        jd_crear_alumno.getContentPane().add(jb_crear_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 393, -1, -1));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_crear_alumno.getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_modificar_alumno.setTitle("Modificar Alumno");
        jd_modificar_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Usuario:");
        jd_modificar_alumno.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 64, -1, -1));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Contrase??a:");
        jd_modificar_alumno.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 106, -1, -1));

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Nombre:");
        jd_modificar_alumno.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 148, -1, -1));

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Carrera:");
        jd_modificar_alumno.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 190, -1, -1));

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Rol:");
        jd_modificar_alumno.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 232, -1, -1));

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Cuenta:");
        jd_modificar_alumno.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 274, -1, -1));

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("Clases Cursadas:");
        jd_modificar_alumno.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 316, -1, -1));

        tf_alumno_user_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_alumno.getContentPane().add(tf_alumno_user_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 60, 341, -1));

        tf_alumno_pass_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_alumno.getContentPane().add(tf_alumno_pass_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 102, 341, -1));

        tf_alumno_nombre_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_alumno.getContentPane().add(tf_alumno_nombre_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 144, 341, -1));

        tf_alumno_carrera_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_alumno.getContentPane().add(tf_alumno_carrera_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 186, 341, -1));

        tf_alumno_rol_m.setBackground(new java.awt.Color(255, 255, 255));
        jd_modificar_alumno.getContentPane().add(tf_alumno_rol_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 228, 341, -1));

        tf_alumno_clases_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_alumno_clases_m.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_modificar_alumno.getContentPane().add(tf_alumno_clases_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 312, 341, 24));

        tf_alumno_cuenta_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_alumno_cuenta_m.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##############"))));
        jd_modificar_alumno.getContentPane().add(tf_alumno_cuenta_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 270, 341, 24));

        jb_modificar_alumno.setBackground(new java.awt.Color(255, 255, 255));
        jb_modificar_alumno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_modificar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_alumnoActionPerformed(evt);
            }
        });
        jd_modificar_alumno.getContentPane().add(jb_modificar_alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 393, -1, -1));
        jd_modificar_alumno.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_modificar_alumno.getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_listar_registros.setTitle("Listar Registro");
        jd_listar_registros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_registros.setModel(new DefaultListModel());
        jl_registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_registrosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jl_registros);

        jd_listar_registros.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 419, 485));
        jd_listar_registros.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_listar_registros.getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jd_listar_alumnos.setTitle("Listar Alumnos");
        jd_listar_alumnos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_alumnos.setModel(new DefaultListModel());
        jl_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_alumnosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jl_alumnos);

        jd_listar_alumnos.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 419, 485));
        jd_listar_alumnos.getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_listar_alumnos.getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jd_listar_maestros.setTitle("Listar Maestros");
        jd_listar_maestros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_maestros.setModel(new DefaultListModel());
        jl_maestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_maestrosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jl_maestros);

        jd_listar_maestros.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 419, 485));
        jd_listar_maestros.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_listar_maestros.getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        eliminar_registro.setText("Eliminar");
        eliminar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_registroActionPerformed(evt);
            }
        });
        popup_registro.add(eliminar_registro);

        modificar_registro.setText("Modificar");
        modificar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_registroActionPerformed(evt);
            }
        });
        popup_registro.add(modificar_registro);

        eliminar_alumno.setText("Eliminar");
        eliminar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_alumnoActionPerformed(evt);
            }
        });
        popup_alumno.add(eliminar_alumno);

        modificar_alumno.setText("Modificar");
        modificar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_alumnoActionPerformed(evt);
            }
        });
        popup_alumno.add(modificar_alumno);

        eliminar_maestro.setText("Eliminar");
        eliminar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_maestroActionPerformed(evt);
            }
        });
        popup_maestro.add(eliminar_maestro);

        modificar_maestro.setText("Modificar");
        modificar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_maestroActionPerformed(evt);
            }
        });
        popup_maestro.add(modificar_maestro);

        jd_crear_clase.setTitle("Crear Clase");
        jd_crear_clase.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_crear_clases.setBackground(new java.awt.Color(255, 255, 255));
        jb_crear_clases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_crear_clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_clasesActionPerformed(evt);
            }
        });
        jd_crear_clase.getContentPane().add(jb_crear_clases, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 392, -1, -1));

        jLabel51.setForeground(new java.awt.Color(0, 0, 0));
        jLabel51.setText("Nombre:");
        jd_crear_clase.getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 47, -1, -1));

        jLabel52.setForeground(new java.awt.Color(0, 0, 0));
        jLabel52.setText("ID:");
        jd_crear_clase.getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 89, -1, -1));

        jLabel53.setForeground(new java.awt.Color(0, 0, 0));
        jLabel53.setText("Hora:");
        jd_crear_clase.getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 132, -1, -1));

        jLabel54.setForeground(new java.awt.Color(0, 0, 0));
        jLabel54.setText("Unidades Valorativas:");
        jd_crear_clase.getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 176, -1, -1));

        jLabel55.setForeground(new java.awt.Color(0, 0, 0));
        jLabel55.setText("Semestre:");
        jd_crear_clase.getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 210, -1, -1));

        jLabel56.setForeground(new java.awt.Color(0, 0, 0));
        jLabel56.setText("Periodo:");
        jd_crear_clase.getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 254, -1, -1));

        jLabel57.setForeground(new java.awt.Color(0, 0, 0));
        jLabel57.setText("A??o:");
        jd_crear_clase.getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 293, -1, -1));

        tf_clase_nombre.setBackground(new java.awt.Color(255, 255, 255));
        tf_clase_nombre.setForeground(new java.awt.Color(0, 0, 0));
        jd_crear_clase.getContentPane().add(tf_clase_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 43, 332, -1));

        tf_clase_id.setBackground(new java.awt.Color(255, 255, 255));
        tf_clase_id.setForeground(new java.awt.Color(0, 0, 0));
        tf_clase_id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));
        jd_crear_clase.getContentPane().add(tf_clase_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 85, 332, 24));
        jd_crear_clase.getContentPane().add(tf_clase_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 127, 116, -1));
        jd_crear_clase.getContentPane().add(tf_clase_unidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 171, 116, -1));
        jd_crear_clase.getContentPane().add(tf_clase_semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 205, 116, -1));
        jd_crear_clase.getContentPane().add(tf_clase_periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 249, 116, -1));

        tf_clase_year.setBackground(new java.awt.Color(204, 204, 204));
        jd_crear_clase.getContentPane().add(tf_clase_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 285, 116, -1));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_crear_clase.getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_modificar_clase.setTitle("Modificar Clase");
        jd_modificar_clase.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_clase_nombre_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_clase_nombre_m.setForeground(new java.awt.Color(0, 0, 0));
        jd_modificar_clase.getContentPane().add(tf_clase_nombre_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 43, 332, -1));

        jb_modificar_clases.setBackground(new java.awt.Color(255, 255, 255));
        jb_modificar_clases.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/confirmar.png"))); // NOI18N
        jb_modificar_clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_modificar_clasesActionPerformed(evt);
            }
        });
        jd_modificar_clase.getContentPane().add(jb_modificar_clases, new org.netbeans.lib.awtextra.AbsoluteConstraints(325, 392, -1, -1));

        tf_clase_id_m.setBackground(new java.awt.Color(255, 255, 255));
        tf_clase_id_m.setForeground(new java.awt.Color(0, 0, 0));
        tf_clase_id_m.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("############"))));
        jd_modificar_clase.getContentPane().add(tf_clase_id_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 85, 332, 24));

        jLabel58.setForeground(new java.awt.Color(0, 0, 0));
        jLabel58.setText("Nombre:");
        jd_modificar_clase.getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 47, -1, -1));

        jLabel59.setForeground(new java.awt.Color(0, 0, 0));
        jLabel59.setText("ID:");
        jd_modificar_clase.getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 89, -1, -1));
        jd_modificar_clase.getContentPane().add(tf_clase_hora_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 127, 116, -1));

        jLabel60.setForeground(new java.awt.Color(0, 0, 0));
        jLabel60.setText("Hora:");
        jd_modificar_clase.getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 132, -1, -1));
        jd_modificar_clase.getContentPane().add(tf_clase_unidades_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 171, 116, -1));

        jLabel61.setForeground(new java.awt.Color(0, 0, 0));
        jLabel61.setText("Unidades Valorativas:");
        jd_modificar_clase.getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 176, -1, -1));
        jd_modificar_clase.getContentPane().add(tf_clase_semestre_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 205, 116, -1));

        jLabel62.setForeground(new java.awt.Color(0, 0, 0));
        jLabel62.setText("Semestre:");
        jd_modificar_clase.getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 210, -1, -1));
        jd_modificar_clase.getContentPane().add(tf_clase_periodo_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 249, 116, -1));

        jLabel63.setForeground(new java.awt.Color(0, 0, 0));
        jLabel63.setText("Periodo:");
        jd_modificar_clase.getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(161, 254, -1, -1));

        jLabel64.setForeground(new java.awt.Color(0, 0, 0));
        jLabel64.setText("A??o:");
        jd_modificar_clase.getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 293, -1, -1));

        tf_clase_year_m.setBackground(new java.awt.Color(204, 204, 204));
        jd_modificar_clase.getContentPane().add(tf_clase_year_m, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 285, 116, -1));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_modificar_clase.getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_listar_clase.setTitle("Listar Clases");
        jd_listar_clase.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_clases.setModel(new DefaultListModel());
        jl_clases.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_clasesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jl_clases);

        jd_listar_clase.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 58, 386, 493));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_listar_clase.getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        eliminar_clase.setText("Eliminar");
        eliminar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_claseActionPerformed(evt);
            }
        });
        popup_clase.add(eliminar_clase);

        modificar_clase.setText("Modificar");
        modificar_clase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_claseActionPerformed(evt);
            }
        });
        popup_clase.add(modificar_clase);

        jd_asignar_maestro.setTitle("Asignar Maestro");
        jd_asignar_maestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_verMaestros.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_verMaestros);

        jd_asignar_maestro.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 82, 302, 495));

        jl_verClases.setModel(new DefaultListModel());
        jScrollPane6.setViewportView(jl_verClases);

        jd_asignar_maestro.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 82, 302, 495));

        jb_asignar_maestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/flecha.png"))); // NOI18N
        jb_asignar_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asignar_maestroActionPerformed(evt);
            }
        });
        jd_asignar_maestro.getContentPane().add(jb_asignar_maestro, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 325, 137, 59));

        jLabel65.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(0, 0, 0));
        jLabel65.setText("Seleccione el maestro que desea asignar:");
        jd_asignar_maestro.getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 360, -1));

        jLabel66.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(0, 0, 0));
        jLabel66.setText("Seleccione la clase que lo desea asignar:");
        jd_asignar_maestro.getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 50, 360, -1));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_asignar_maestro.getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 630));

        jd_asignar_alumno.setTitle("Asignar Alumno");
        jd_asignar_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_verAlumnos.setModel(new DefaultListModel());
        jScrollPane7.setViewportView(jl_verAlumnos);

        jd_asignar_alumno.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(41, 110, 334, 479));

        jl_verClasesA.setModel(new DefaultListModel());
        jScrollPane8.setViewportView(jl_verClasesA);

        jd_asignar_alumno.getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 110, 330, 479));

        jb_asignar_alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/flecha.png"))); // NOI18N
        jb_asignar_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asignar_alumnosActionPerformed(evt);
            }
        });
        jd_asignar_alumno.getContentPane().add(jb_asignar_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 265, 125, 59));

        jLabel76.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(0, 0, 0));
        jLabel76.setText("Seleccione el estudiante que desea matricular:");
        jd_asignar_alumno.getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel77.setFont(new java.awt.Font("Dialog", 3, 18)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(0, 0, 0));
        jLabel77.setText("Seleccione la clase que lo desea matricular:");
        jd_asignar_alumno.getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/jd_background.jpg"))); // NOI18N
        jd_asignar_alumno.getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 630));

        jf_alumno.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jf_alumno.setTitle("Alumno");
        jf_alumno.setSize(new java.awt.Dimension(1920, 1080));
        jf_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_alumnos_tareas.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_alumnos_tareas.setForeground(new java.awt.Color(0, 0, 0));
        jb_alumnos_tareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tareas.png"))); // NOI18N
        jb_alumnos_tareas.setText("Tareas");
        jb_alumnos_tareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alumnos_tareasActionPerformed(evt);
            }
        });
        jf_alumno.getContentPane().add(jb_alumnos_tareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jb_alumnos_examenes.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_alumnos_examenes.setForeground(new java.awt.Color(0, 0, 0));
        jb_alumnos_examenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/examenes.png"))); // NOI18N
        jb_alumnos_examenes.setText("Examenes");
        jb_alumnos_examenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alumnos_examenesActionPerformed(evt);
            }
        });
        jf_alumno.getContentPane().add(jb_alumnos_examenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        jb_alumnos_notas.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_alumnos_notas.setForeground(new java.awt.Color(0, 0, 0));
        jb_alumnos_notas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grado.png"))); // NOI18N
        jb_alumnos_notas.setText("Notas");
        jb_alumnos_notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alumnos_notasActionPerformed(evt);
            }
        });
        jf_alumno.getContentPane().add(jb_alumnos_notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 120, -1, -1));

        jb_alumnos_foros.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_alumnos_foros.setForeground(new java.awt.Color(0, 0, 0));
        jb_alumnos_foros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/foro.png"))); // NOI18N
        jb_alumnos_foros.setText("Foros");
        jb_alumnos_foros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alumnos_forosActionPerformed(evt);
            }
        });
        jf_alumno.getContentPane().add(jb_alumnos_foros, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 120, -1, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/unitec_logo.png"))); // NOI18N
        jf_alumno.getContentPane().add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 820, 310, 110));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/frame_wallpapers.jpg"))); // NOI18N
        jf_alumno.getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/unitec_logo.png"))); // NOI18N
        jf_alumno.getContentPane().add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 860, 310, 110));

        jMenu5.setText("Sesi??n");

        cerrar_sesion_alum.setText("Cerrar sesi??n");
        cerrar_sesion_alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesion_alumActionPerformed(evt);
            }
        });
        jMenu5.add(cerrar_sesion_alum);

        cerrar_sistema_alum.setText("Cerrar el sistema");
        cerrar_sistema_alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sistema_alumActionPerformed(evt);
            }
        });
        jMenu5.add(cerrar_sistema_alum);

        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jf_alumno.setJMenuBar(jMenuBar3);

        jd_entregar_tarea.setTitle("Entregar Tarea");
        jd_entregar_tarea.setMinimumSize(new java.awt.Dimension(1166, 792));
        jd_entregar_tarea.setSize(new java.awt.Dimension(1166, 792));
        jd_entregar_tarea.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tarea_alum_titulo.setEditable(false);
        jd_entregar_tarea.getContentPane().add(tarea_alum_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 49, 721, 36));

        tarea_alum_desc.setEditable(false);
        tarea_alum_desc.setColumns(20);
        tarea_alum_desc.setRows(5);
        jScrollPane10.setViewportView(tarea_alum_desc);

        jd_entregar_tarea.getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 140, 721, 314));

        examinar_equipo.setText("Examinar mi Equipo");
        examinar_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                examinar_equipoActionPerformed(evt);
            }
        });
        jd_entregar_tarea.getContentPane().add(examinar_equipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 521, 223, 54));

        jb_entregar_tarea.setText("Entregar");
        jb_entregar_tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_entregar_tareaActionPerformed(evt);
            }
        });
        jd_entregar_tarea.getContentPane().add(jb_entregar_tarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 659, 721, 56));

        label_tarea.setForeground(new java.awt.Color(0, 0, 0));
        label_tarea.setText("Tarea");
        jd_entregar_tarea.getContentPane().add(label_tarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 540, 568, -1));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_entregar_tarea.getContentPane().add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 820));

        jd_verTareas_alumnos.setTitle("Ver Tareas");
        jd_verTareas_alumnos.setBounds(new java.awt.Rectangle(1053, 703, 703, 703));
        jd_verTareas_alumnos.setMinimumSize(new java.awt.Dimension(1053, 703));
        jd_verTareas_alumnos.setSize(new java.awt.Dimension(1053, 703));
        jd_verTareas_alumnos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_verMisTareas.setModel(new DefaultListModel());
        jScrollPane11.setViewportView(jl_verMisTareas);

        jd_verTareas_alumnos.getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 74, 915, 504));

        jb_entregarMiTarea.setText("Entregar Tarea");
        jb_entregarMiTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_entregarMiTareaActionPerformed(evt);
            }
        });
        jd_verTareas_alumnos.getContentPane().add(jb_entregarMiTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 612, 915, -1));

        jLabel94.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(0, 0, 0));
        jLabel94.setText("Mis Tareas");
        jd_verTareas_alumnos.getContentPane().add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(383, 6, -1, -1));

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_verTareas_alumnos.getContentPane().add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 700));

        jd_alumno_foro.setTitle("Foro");
        jd_alumno_foro.setMinimumSize(new java.awt.Dimension(1261, 806));
        jd_alumno_foro.setSize(new java.awt.Dimension(1261, 806));
        jd_alumno_foro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_alumno_foroTitulo.setEditable(false);
        tf_alumno_foroTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jd_alumno_foro.getContentPane().add(tf_alumno_foroTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1235, 41));

        ta_alumno_foroDesc.setEditable(false);
        ta_alumno_foroDesc.setColumns(20);
        ta_alumno_foroDesc.setRows(5);
        jScrollPane13.setViewportView(ta_alumno_foroDesc);

        jd_alumno_foro.getContentPane().add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 1235, -1));

        ta_alumnos_aportes.setEditable(false);
        ta_alumnos_aportes.setColumns(20);
        ta_alumnos_aportes.setRows(5);
        jScrollPane14.setViewportView(ta_alumnos_aportes);

        jd_alumno_foro.getContentPane().add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 216, 1235, 357));

        jLabel83.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(0, 0, 0));
        jLabel83.setText("Aportes");
        jd_alumno_foro.getContentPane().add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 166, -1, -1));

        ta_alumnos_miAporte.setColumns(20);
        ta_alumnos_miAporte.setRows(5);
        jScrollPane15.setViewportView(ta_alumnos_miAporte);

        jd_alumno_foro.getContentPane().add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 600, 1235, 104));

        jb_alumno_ingresarAporte.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jb_alumno_ingresarAporte.setText("Ingresar Aporte");
        jb_alumno_ingresarAporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alumno_ingresarAporteActionPerformed(evt);
            }
        });
        jd_alumno_foro.getContentPane().add(jb_alumno_ingresarAporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 722, 1235, 54));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_alumno_foro.getContentPane().add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 810));

        jd_verMisForos.setTitle("Mis Foros");
        jd_verMisForos.setMinimumSize(new java.awt.Dimension(1047, 691));
        jd_verMisForos.setSize(new java.awt.Dimension(1047, 691));
        jd_verMisForos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_verMisForos.setModel(new DefaultListModel());
        jScrollPane16.setViewportView(jl_verMisForos);

        jd_verMisForos.getContentPane().add(jScrollPane16, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 69, 915, 504));

        jb_abrirForo.setText("Abrir Foro");
        jb_abrirForo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_abrirForoActionPerformed(evt);
            }
        });
        jd_verMisForos.getContentPane().add(jb_abrirForo, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 607, 915, -1));

        jLabel98.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(0, 0, 0));
        jLabel98.setText("Mis Foros");
        jd_verMisForos.getContentPane().add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_verMisForos.getContentPane().add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 690));

        jf_maestros.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jf_maestros.setTitle("Maestros");
        jf_maestros.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jf_maestros.setSize(new java.awt.Dimension(1920, 1080));
        jf_maestros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_maestros_tareas1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_maestros_tareas1.setForeground(new java.awt.Color(0, 0, 0));
        jb_maestros_tareas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/tareas.png"))); // NOI18N
        jb_maestros_tareas1.setText("Tareas");
        jb_maestros_tareas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_maestros_tareas1ActionPerformed(evt);
            }
        });
        jf_maestros.getContentPane().add(jb_maestros_tareas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jb_maestros_examenes1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_maestros_examenes1.setForeground(new java.awt.Color(0, 0, 0));
        jb_maestros_examenes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/examenes.png"))); // NOI18N
        jb_maestros_examenes1.setText("Examenes");
        jb_maestros_examenes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_maestros_examenes1ActionPerformed(evt);
            }
        });
        jf_maestros.getContentPane().add(jb_maestros_examenes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 470, -1, -1));

        jb_maestros_notas1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_maestros_notas1.setForeground(new java.awt.Color(0, 0, 0));
        jb_maestros_notas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/grado.png"))); // NOI18N
        jb_maestros_notas1.setText("Notas");
        jb_maestros_notas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_maestros_notas1ActionPerformed(evt);
            }
        });
        jf_maestros.getContentPane().add(jb_maestros_notas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1510, 120, -1, -1));

        jb_alumnos_foros1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jb_alumnos_foros1.setForeground(new java.awt.Color(0, 0, 0));
        jb_alumnos_foros1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/foro.png"))); // NOI18N
        jb_alumnos_foros1.setText("Foros");
        jb_alumnos_foros1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_alumnos_foros1ActionPerformed(evt);
            }
        });
        jf_maestros.getContentPane().add(jb_alumnos_foros1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 450, -1));

        jButton6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/revisar.png"))); // NOI18N
        jButton6.setText("Revisar Tareas");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jf_maestros.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/unitec_logo.png"))); // NOI18N
        jf_maestros.getContentPane().add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 820, 310, 110));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/frame_wallpapers.jpg"))); // NOI18N
        jf_maestros.getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu7.setText("Sesi??n");

        cerrar_sesion_maestro.setText("Cerrar sesi??n");
        cerrar_sesion_maestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sesion_maestroActionPerformed(evt);
            }
        });
        jMenu7.add(cerrar_sesion_maestro);

        cerrar_sistema_maesrto.setText("Cerrar el sistema");
        cerrar_sistema_maesrto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrar_sistema_maesrtoActionPerformed(evt);
            }
        });
        jMenu7.add(cerrar_sistema_maesrto);

        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jf_maestros.setJMenuBar(jMenuBar4);

        jd_asignar_tarea.setTitle("Asignar Tarea");
        jd_asignar_tarea.setMinimumSize(new java.awt.Dimension(1166, 792));
        jd_asignar_tarea.setSize(new java.awt.Dimension(1166, 792));
        jd_asignar_tarea.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Asignar Nueva Tarea");
        jd_asignar_tarea.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 51, -1, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Fecha Final:");
        jd_asignar_tarea.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 167, -1, -1));
        jd_asignar_tarea.getContentPane().add(tarea_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 158, 538, 39));

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Hora Final:");
        jd_asignar_tarea.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 251, -1, -1));
        jd_asignar_tarea.getContentPane().add(tarea_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 239, 538, 40));

        jLabel82.setForeground(new java.awt.Color(0, 0, 0));
        jLabel82.setText("Titulo de Tarea:");
        jd_asignar_tarea.getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 335, -1, -1));
        jd_asignar_tarea.getContentPane().add(tarea_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 323, 538, 40));

        Descripcion.setForeground(new java.awt.Color(0, 0, 0));
        Descripcion.setText("Descripcion:");
        jd_asignar_tarea.getContentPane().add(Descripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 413, -1, -1));

        tarea_descripcion.setColumns(20);
        tarea_descripcion.setRows(5);
        jScrollPane9.setViewportView(tarea_descripcion);

        jd_asignar_tarea.getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 401, 538, 228));

        jb_asignar_tarea.setText("Asignar");
        jb_asignar_tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asignar_tareaActionPerformed(evt);
            }
        });
        jd_asignar_tarea.getContentPane().add(jb_asignar_tarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 668, 627, 56));

        jLabel99.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_asignar_tarea.getContentPane().add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 790));

        jd_verClases_maestros.setTitle("Listar Clases");
        jd_verClases_maestros.setMinimumSize(new java.awt.Dimension(1053, 703));
        jd_verClases_maestros.setSize(new java.awt.Dimension(1053, 703));
        jd_verClases_maestros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_asignar_clases.setModel(new DefaultListModel());
        jScrollPane12.setViewportView(jl_asignar_clases);

        jd_verClases_maestros.getContentPane().add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 69, 915, 504));

        jb_asginat_tarea.setText("Asignar Tarea");
        jb_asginat_tarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asginat_tareaActionPerformed(evt);
            }
        });
        jd_verClases_maestros.getContentPane().add(jb_asginat_tarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 607, 915, -1));

        jLabel108.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(0, 0, 0));
        jLabel108.setText("Mis Clases");
        jd_verClases_maestros.getContentPane().add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, -1, -1));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_verClases_maestros.getContentPane().add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 710));

        jd_verClasesForos_maestros.setTitle("Listar Clases");
        jd_verClasesForos_maestros.setMinimumSize(new java.awt.Dimension(1053, 703));
        jd_verClasesForos_maestros.setSize(new java.awt.Dimension(1053, 703));
        jd_verClasesForos_maestros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_asignarforos_clases.setModel(new DefaultListModel());
        jScrollPane17.setViewportView(jl_asignarforos_clases);

        jd_verClasesForos_maestros.getContentPane().add(jScrollPane17, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 74, 915, 504));

        jb_asginar_foro.setText("Asignar Foro");
        jb_asginar_foro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_asginar_foroActionPerformed(evt);
            }
        });
        jd_verClasesForos_maestros.getContentPane().add(jb_asginar_foro, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 653, 915, -1));

        jButton1.setText("Ver Foros");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jd_verClasesForos_maestros.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 596, 915, -1));

        jLabel102.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(0, 0, 0));
        jLabel102.setText("Mis Clases");
        jd_verClasesForos_maestros.getContentPane().add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_verClasesForos_maestros.getContentPane().add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 710));

        jd_crearForo.setTitle("Crear Foro");
        jd_crearForo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel84.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(0, 0, 0));
        jLabel84.setText("Titulo:");
        jd_crearForo.getContentPane().add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 164, -1, -1));

        jLabel85.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(0, 0, 0));
        jLabel85.setText("Descripcion:");
        jd_crearForo.getContentPane().add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 257, -1, -1));
        jd_crearForo.getContentPane().add(tf_crearForo_tit, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 156, 590, 45));

        tf_crearForo_desc.setColumns(20);
        tf_crearForo_desc.setRows(5);
        jScrollPane18.setViewportView(tf_crearForo_desc);

        jd_crearForo.getContentPane().add(jScrollPane18, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 240, 590, 253));

        jb_crear_foro.setText("Crear Foro");
        jb_crear_foro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_foroActionPerformed(evt);
            }
        });
        jd_crearForo.getContentPane().add(jb_crear_foro, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 552, 598, 54));

        jLabel100.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(0, 0, 0));
        jLabel100.setText("Crear Foro");
        jd_crearForo.getContentPane().add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 36, -1, -1));

        jLabel101.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_crearForo.getContentPane().add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 670));

        jd_verForos_Maestro.setTitle("Foro");
        jd_verForos_Maestro.setMinimumSize(new java.awt.Dimension(1261, 806));
        jd_verForos_Maestro.setSize(new java.awt.Dimension(1261, 806));
        jd_verForos_Maestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ta_alumno_foroDesc1.setEditable(false);
        ta_alumno_foroDesc1.setColumns(20);
        ta_alumno_foroDesc1.setRows(5);
        jScrollPane20.setViewportView(ta_alumno_foroDesc1);

        jd_verForos_Maestro.getContentPane().add(jScrollPane20, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 1235, -1));

        ta_alumnos_aportes1.setEditable(false);
        ta_alumnos_aportes1.setColumns(20);
        ta_alumnos_aportes1.setRows(5);
        jScrollPane21.setViewportView(ta_alumnos_aportes1);

        jd_verForos_Maestro.getContentPane().add(jScrollPane21, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 216, 1235, 584));

        jLabel86.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(0, 0, 0));
        jLabel86.setText("Aportes");
        jd_verForos_Maestro.getContentPane().add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 166, -1, -1));

        tf_alumno_foroTitulo1.setEditable(false);
        tf_alumno_foroTitulo1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jd_verForos_Maestro.getContentPane().add(tf_alumno_foroTitulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1235, 41));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_verForos_Maestro.getContentPane().add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1260, 810));

        jd_verForosDeClase.setTitle("Foros de la clase");
        jd_verForosDeClase.setMinimumSize(new java.awt.Dimension(1053, 703));
        jd_verForosDeClase.setSize(new java.awt.Dimension(1053, 703));
        jd_verForosDeClase.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_foros.setModel(new DefaultListModel());
        jScrollPane19.setViewportView(jl_foros);

        jd_verForosDeClase.getContentPane().add(jScrollPane19, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 74, 915, 504));

        jb_abiriForo.setText("Abrir Foro");
        jb_abiriForo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_abiriForoActionPerformed(evt);
            }
        });
        jd_verForosDeClase.getContentPane().add(jb_abiriForo, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 612, 915, -1));

        jLabel110.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(0, 0, 0));
        jLabel110.setText("Foros de la Clase");
        jd_verForosDeClase.getContentPane().add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(349, 6, -1, -1));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_verForosDeClase.getContentPane().add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 710));

        jd_verClases_revisarTareas.setTitle("Listar Clases");
        jd_verClases_revisarTareas.setMinimumSize(new java.awt.Dimension(1053, 703));
        jd_verClases_revisarTareas.setSize(new java.awt.Dimension(1053, 703));
        jd_verClases_revisarTareas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_clases_revisar.setModel(new DefaultListModel());
        jScrollPane22.setViewportView(jl_clases_revisar);

        jd_verClases_revisarTareas.getContentPane().add(jScrollPane22, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 74, 915, 504));

        jb_abrir_clases.setText("Abrir Clase");
        jb_abrir_clases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_abrir_clasesActionPerformed(evt);
            }
        });
        jd_verClases_revisarTareas.getContentPane().add(jb_abrir_clases, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 612, 915, -1));

        jLabel112.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(0, 0, 0));
        jLabel112.setText("Mis Clases");
        jd_verClases_revisarTareas.getContentPane().add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 6, -1, -1));

        jLabel113.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_verClases_revisarTareas.getContentPane().add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 710));

        jd_verTareas_revisarTareas.setTitle("Listar Tareas");
        jd_verTareas_revisarTareas.setMinimumSize(new java.awt.Dimension(1053, 703));
        jd_verTareas_revisarTareas.setSize(new java.awt.Dimension(1053, 703));
        jd_verTareas_revisarTareas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_tareas_revisar.setModel(new DefaultListModel());
        jScrollPane23.setViewportView(jl_tareas_revisar);

        jd_verTareas_revisarTareas.getContentPane().add(jScrollPane23, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 74, 915, 504));

        jb_abrir_tareas.setText("Ver intentos de Alumnos");
        jb_abrir_tareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_abrir_tareasActionPerformed(evt);
            }
        });
        jd_verTareas_revisarTareas.getContentPane().add(jb_abrir_tareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 612, 915, -1));

        jLabel114.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(0, 0, 0));
        jLabel114.setText("Tareas de la Clase");
        jd_verTareas_revisarTareas.getContentPane().add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 6, -1, -1));

        jLabel115.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_verTareas_revisarTareas.getContentPane().add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 710));

        jd_verTareasdeAlumnos_revisarTareas.setTitle("Intentos de los Alumnos");
        jd_verTareasdeAlumnos_revisarTareas.setMinimumSize(new java.awt.Dimension(1053, 703));
        jd_verTareasdeAlumnos_revisarTareas.setSize(new java.awt.Dimension(1053, 703));
        jd_verTareasdeAlumnos_revisarTareas.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_intentosA_revisar.setModel(new DefaultListModel());
        jScrollPane24.setViewportView(jl_intentosA_revisar);

        jd_verTareasdeAlumnos_revisarTareas.getContentPane().add(jScrollPane24, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 69, 915, 504));

        jb_abrir_tareasdeAlumnos.setText("Abrir");
        jb_abrir_tareasdeAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_abrir_tareasdeAlumnosActionPerformed(evt);
            }
        });
        jd_verTareasdeAlumnos_revisarTareas.getContentPane().add(jb_abrir_tareasdeAlumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 607, 915, -1));

        jLabel116.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(0, 0, 0));
        jLabel116.setText("Intentos de los Alumnos");
        jd_verTareasdeAlumnos_revisarTareas.getContentPane().add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, -1, -1));

        jLabel117.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_verTareasdeAlumnos_revisarTareas.getContentPane().add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 710));

        jd_abrir_tarea.setTitle("Ver Intento");
        jd_abrir_tarea.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel91.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(0, 0, 0));
        jLabel91.setText("Alumno:");
        jd_abrir_tarea.getContentPane().add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 23, 97, 28));

        tf_alum_revision.setEditable(false);
        jd_abrir_tarea.getContentPane().add(tf_alum_revision, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 18, 534, 42));

        jb_abrir_archivo_est.setText("Abrir Intento");
        jb_abrir_archivo_est.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_abrir_archivo_estActionPerformed(evt);
            }
        });
        jd_abrir_tarea.getContentPane().add(jb_abrir_archivo_est, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 134, 241, 79));

        jLabel92.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(0, 0, 0));
        jLabel92.setText("Nota:");
        jd_abrir_tarea.getContentPane().add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 276, 97, 28));

        ftf_nota.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###"))));
        jd_abrir_tarea.getContentPane().add(ftf_nota, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 270, 534, 45));

        jButton2.setText("Guardar Nota");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jd_abrir_tarea.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 333, 637, 42));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_abrir_tarea.getContentPane().add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));

        notas_maestro.setTitle("Cuador de Notas");
        notas_maestro.setMinimumSize(new java.awt.Dimension(1143, 714));
        notas_maestro.setSize(new java.awt.Dimension(1143, 714));
        notas_maestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt_maestros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clase", "Numero de Cuenta", "Nombre", "Asignacion", "Tipo", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane25.setViewportView(jt_maestros);
        if (jt_maestros.getColumnModel().getColumnCount() > 0) {
            jt_maestros.getColumnModel().getColumn(0).setResizable(false);
            jt_maestros.getColumnModel().getColumn(1).setResizable(false);
            jt_maestros.getColumnModel().getColumn(2).setResizable(false);
            jt_maestros.getColumnModel().getColumn(3).setResizable(false);
            jt_maestros.getColumnModel().getColumn(4).setResizable(false);
            jt_maestros.getColumnModel().getColumn(5).setResizable(false);
        }

        notas_maestro.getContentPane().add(jScrollPane25, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1131, 702));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        notas_maestro.getContentPane().add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 720));

        notas_estudiante.setTitle("Cuadro de Notas");
        notas_estudiante.setMinimumSize(new java.awt.Dimension(1143, 714));
        notas_estudiante.setSize(new java.awt.Dimension(1143, 714));
        notas_estudiante.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt_alumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clase", "Numero de Cuenta", "Nombre", "Asignacion", "Tipo", "Nota"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane26.setViewportView(jt_alumnos);
        if (jt_alumnos.getColumnModel().getColumnCount() > 0) {
            jt_alumnos.getColumnModel().getColumn(0).setResizable(false);
            jt_alumnos.getColumnModel().getColumn(1).setResizable(false);
            jt_alumnos.getColumnModel().getColumn(2).setResizable(false);
            jt_alumnos.getColumnModel().getColumn(3).setResizable(false);
            jt_alumnos.getColumnModel().getColumn(4).setResizable(false);
            jt_alumnos.getColumnModel().getColumn(5).setResizable(false);
        }

        notas_estudiante.getContentPane().add(jScrollPane26, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 1131, 702));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        notas_estudiante.getContentPane().add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 720));

        examenes_maestro_clases.setTitle("Mis Clases");
        examenes_maestro_clases.setMinimumSize(new java.awt.Dimension(978, 686));
        examenes_maestro_clases.setPreferredSize(new java.awt.Dimension(978, 686));
        examenes_maestro_clases.setSize(new java.awt.Dimension(978, 686));
        examenes_maestro_clases.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel118.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(0, 0, 0));
        jLabel118.setText("Mis Clases");
        examenes_maestro_clases.getContentPane().add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(361, 6, -1, -1));

        jl_examenes_clases.setModel(new DefaultListModel());
        jScrollPane27.setViewportView(jl_examenes_clases);

        examenes_maestro_clases.getContentPane().add(jScrollPane27, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 80, 780, 491));

        jb_abrir_examenes.setText("Abrir Clase");
        jb_abrir_examenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_abrir_examenesActionPerformed(evt);
            }
        });
        examenes_maestro_clases.getContentPane().add(jb_abrir_examenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 589, 780, -1));

        jLabel127.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        examenes_maestro_clases.getContentPane().add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 690));

        examenes_maestro_examenes.setTitle("Examenes de la Clase");
        examenes_maestro_examenes.setMinimumSize(new java.awt.Dimension(978, 735));
        examenes_maestro_examenes.setSize(new java.awt.Dimension(978, 735));
        examenes_maestro_examenes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_crear_examen.setText("Crear Examen");
        jb_crear_examen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crear_examenActionPerformed(evt);
            }
        });
        examenes_maestro_examenes.getContentPane().add(jb_crear_examen, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 589, 780, -1));

        jLabel119.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(0, 0, 0));
        jLabel119.setText("Examenes de la Clase");
        examenes_maestro_examenes.getContentPane().add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(232, 6, -1, -1));

        jl_examenes_examenes.setModel(new DefaultListModel());
        jl_examenes_examenes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_examenes_examenesMouseClicked(evt);
            }
        });
        jScrollPane28.setViewportView(jl_examenes_examenes);

        examenes_maestro_examenes.getContentPane().add(jScrollPane28, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 80, 780, 491));

        jLabel128.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        examenes_maestro_examenes.getContentPane().add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 740));

        eliminar_examen.setText("Eliminar");
        eliminar_examen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_examenActionPerformed(evt);
            }
        });
        popup_examenes.add(eliminar_examen);

        jd_crear_examen.setTitle("Crear Examen");
        jd_crear_examen.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_add_examen.setText("Crear Examen");
        jb_add_examen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_add_examenActionPerformed(evt);
            }
        });
        jd_crear_examen.getContentPane().add(jb_add_examen, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 584, 1184, 50));

        jLabel120.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(0, 0, 0));
        jLabel120.setText("Titulo:");

        jLabel121.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(0, 0, 0));
        jLabel121.setText("Fecha Final:");

        jLabel122.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(0, 0, 0));
        jLabel122.setText("Hora:");

        jLabel123.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(0, 0, 0));
        jLabel123.setText("Duracion:");

        examen_hora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##################"))));

        examen_duracion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##################"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel123)
                    .addComponent(jLabel122)
                    .addComponent(jLabel121)
                    .addComponent(jLabel120))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(examen_titulo)
                    .addComponent(examen_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 752, Short.MAX_VALUE)
                    .addComponent(examen_duracion)
                    .addComponent(examen_hora))
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel120)
                    .addComponent(examen_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(examen_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel121)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(examen_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(examen_duracion, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos Basicos", jPanel1);

        jLabel124.setText("Pregunta:");

        verdadero_falso.add(rb_verdadero);
        rb_verdadero.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rb_verdadero.setText("Verdadero");

        verdadero_falso.add(rb_falso);
        rb_falso.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rb_falso.setText("Falso");

        jButton3.setText("Agregar Pregunta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel124)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pregunta_verdadero))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(rb_verdadero, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(350, 350, 350)
                        .addComponent(rb_falso, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 295, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(pregunta_verdadero, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_verdadero)
                    .addComponent(rb_falso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Verdadero y Falso", jPanel4);

        jLabel125.setText("Pregunta:");

        seleccion_multiple.add(rb_a);
        rb_a.setText("a)");

        seleccion_multiple.add(rb_b);
        rb_b.setText("b)");

        seleccion_multiple.add(rb_c);
        rb_c.setText("c)");

        seleccion_multiple.add(rb_d);
        rb_d.setText("d)");

        jButton4.setText("Agregar Pregunta");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rb_d)
                            .addComponent(rb_c)
                            .addComponent(rb_b)
                            .addComponent(rb_a)
                            .addComponent(jLabel125))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pregunta_seleccion, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                            .addComponent(tf_op1)
                            .addComponent(tf_op2)
                            .addComponent(tf_op3)
                            .addComponent(tf_op4)))
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel125)
                    .addComponent(pregunta_seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_a)
                    .addComponent(tf_op1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_b)
                    .addComponent(tf_op2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_c)
                    .addComponent(tf_op3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rb_d)
                    .addComponent(tf_op4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Seleccion Multiple", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Preguntas", jPanel3);

        jd_crear_examen.getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 26, -1, -1));

        jLabel129.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        jd_crear_examen.getContentPane().add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 670));

        examenes_alumno_examenes.setTitle("Examenes para Realizar");
        examenes_alumno_examenes.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_mis_examenes.setModel(new DefaultListModel());
        jScrollPane29.setViewportView(jl_mis_examenes);

        examenes_alumno_examenes.getContentPane().add(jScrollPane29, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 80, 780, 491));

        jb_realizar_examenes.setText("Realizar Examen");
        jb_realizar_examenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_realizar_examenesActionPerformed(evt);
            }
        });
        examenes_alumno_examenes.getContentPane().add(jb_realizar_examenes, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 589, 780, -1));

        jLabel126.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(0, 0, 0));
        jLabel126.setText("Examenes para Realizar");
        examenes_alumno_examenes.getContentPane().add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 6, -1, -1));

        jLabel130.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/other_jd_background.jpg"))); // NOI18N
        examenes_alumno_examenes.getContentPane().add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 700));

        responder_verdadero.setTitle("Pregunta Verdadero o Falso");

        label_pregunta.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label_pregunta.setText("verd_pregunta");

        buttonGroup1.add(answer_verd);
        answer_verd.setText("Verdadero");

        buttonGroup1.add(answer_falso);
        answer_falso.setText("Falso");

        jb_next_verd.setText(">");
        jb_next_verd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_next_verdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout responder_verdaderoLayout = new javax.swing.GroupLayout(responder_verdadero.getContentPane());
        responder_verdadero.getContentPane().setLayout(responder_verdaderoLayout);
        responder_verdaderoLayout.setHorizontalGroup(
            responder_verdaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(responder_verdaderoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(responder_verdaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answer_falso)
                    .addComponent(answer_verd)
                    .addComponent(label_pregunta))
                .addContainerGap(873, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, responder_verdaderoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_next_verd, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        responder_verdaderoLayout.setVerticalGroup(
            responder_verdaderoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(responder_verdaderoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label_pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(answer_verd)
                .addGap(78, 78, 78)
                .addComponent(answer_falso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jb_next_verd, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        responder_seleccion.setTitle("Pregunta de Seleccion");

        label_pregunta1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label_pregunta1.setText("verd_pregunta");

        buttonGroup2.add(answer_a);
        answer_a.setText("a)");

        buttonGroup2.add(answer_b);
        answer_b.setText("b)");

        buttonGroup2.add(answer_c);
        answer_c.setText("c)");

        buttonGroup2.add(answer_d);
        answer_d.setText("d)");

        opcion_a.setText("opcion a");

        opcion_b.setText("opcion b");

        opcion_c.setText("opcion c");

        opcion_d.setText("opcion d");

        jb_next_selecc.setText(">");
        jb_next_selecc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_next_seleccActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout responder_seleccionLayout = new javax.swing.GroupLayout(responder_seleccion.getContentPane());
        responder_seleccion.getContentPane().setLayout(responder_seleccionLayout);
        responder_seleccionLayout.setHorizontalGroup(
            responder_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(responder_seleccionLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(responder_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(responder_seleccionLayout.createSequentialGroup()
                        .addComponent(answer_d)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcion_d, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(responder_seleccionLayout.createSequentialGroup()
                        .addComponent(answer_c)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcion_c, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(responder_seleccionLayout.createSequentialGroup()
                        .addComponent(answer_b)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcion_b, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(responder_seleccionLayout.createSequentialGroup()
                        .addComponent(answer_a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(opcion_a, javax.swing.GroupLayout.PREFERRED_SIZE, 788, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_pregunta1))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, responder_seleccionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_next_selecc, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        responder_seleccionLayout.setVerticalGroup(
            responder_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(responder_seleccionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label_pregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(responder_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer_a)
                    .addComponent(opcion_a))
                .addGap(18, 18, 18)
                .addGroup(responder_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer_b)
                    .addComponent(opcion_b))
                .addGap(18, 18, 18)
                .addGroup(responder_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer_c)
                    .addComponent(opcion_c))
                .addGap(18, 18, 18)
                .addGroup(responder_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(answer_d)
                    .addComponent(opcion_d))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jb_next_selecc, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn");
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(137, 159, 165));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jb_login.setBackground(new java.awt.Color(255, 255, 255));
        jb_login.setForeground(new java.awt.Color(0, 0, 0));
        jb_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login_button.png"))); // NOI18N
        jb_login.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jb_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_loginActionPerformed(evt);
            }
        });
        jPanel2.add(jb_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 258, 480, 50));

        tf_user_login.setBackground(new java.awt.Color(255, 255, 255));
        tf_user_login.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        tf_user_login.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tf_user_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 480, 40));

        tf_pass_login.setBackground(new java.awt.Color(255, 255, 255));
        tf_pass_login.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        tf_pass_login.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2.add(tf_pass_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 480, 40));

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CONTRASE??A:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, -1));

        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("USUARIO:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 110, 500, 330));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto_cesarbrito/registro_background.png"))); // NOI18N
        getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_loginActionPerformed
        // TODO add your handling code here:
        try {
            String user = tf_user_login.getText();
            String pass = tf_pass_login.getText();
            boolean found = false;
            administrarRegistros ap = new administrarRegistros("./registro.txt");
            ap.cargarArchivo();
            for (int i = 0; i < ap.getListaRegistros().size(); i++) {

                if (ap.getListaRegistros().get(i).getUsername().equals(user) && ap.getListaRegistros().get(i).getPassword().equals(pass)) {
                    jf_registro.pack();
                    jf_registro.setLocationRelativeTo(this);
                    jf_registro.setExtendedState(MAXIMIZED_BOTH);
                    jf_registro.setVisible(true);
                    this.hide();
                    found = true;
                    tf_user_login.setText("");
                    tf_pass_login.setText("");
                }
            }
            administrarMaestros ap1 = new administrarMaestros("./maestros.cbm");
            ap1.cargarArchivo();
            for (int i = 0; i < ap1.getListaMaestros().size(); i++) {
                if (ap1.getListaMaestros().get(i).getUsername().equals(user) && ap1.getListaMaestros().get(i).getPassword().equals(pass)) {
                    maestroAsig = ap1.getListaMaestros().get(i);
                    indexMaestro = i;
                    jf_maestros.pack();
                    jf_maestros.setLocationRelativeTo(this);
                    jf_maestros.setExtendedState(MAXIMIZED_BOTH);
                    jf_maestros.setVisible(true);
                    this.hide();
                    found = true;
                    tf_user_login.setText("");
                    tf_pass_login.setText("");
                    found = true;
                }
            }
            administrarAlumnos ap2 = new administrarAlumnos("./alumnos.cbm");
            ap2.cargarArchivo();
            for (int i = 0; i < ap2.getListaAlumnos().size(); i++) {
                if (ap2.getListaAlumnos().get(i).getUsername().equals(user) && ap2.getListaAlumnos().get(i).getPassword().equals(pass)) {
                    estudianteAsig = ap2.getListaAlumnos().get(i);
                    indexEstudiante = i;
                    jf_alumno.pack();
                    jf_alumno.setLocationRelativeTo(this);
                    jf_alumno.setExtendedState(MAXIMIZED_BOTH);
                    jf_alumno.setVisible(true);
                    this.hide();
                    found = true;
                    tf_user_login.setText("");
                    tf_pass_login.setText("");
                    found = true;
                }
            }
            if (found == false) {
                JOptionPane.showMessageDialog(this, "USUARIO NO ENCONTRADO");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_loginActionPerformed

    private void cerrar_sesion_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesion_registroActionPerformed
        // TODO add your handling code here:        
        int response = JOptionPane.showConfirmDialog(this.getFrames()[0], "Seguro que desea Salirse?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.OK_OPTION) {
            jf_registro.dispose();
            this.setVisible(true);
        }
    }//GEN-LAST:event_cerrar_sesion_registroActionPerformed

    private void cerrar_sistema_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sistema_registroActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrar_sistema_registroActionPerformed

    private void registro_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registro_agregarActionPerformed
        // TODO add your handling code here:
        jd_crear_registro.setModal(true);
        jd_crear_registro.pack();
        jd_crear_registro.setLocationRelativeTo(this);
        jd_crear_registro.setVisible(true);
    }//GEN-LAST:event_registro_agregarActionPerformed

    private void maestro_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maestro_agregarActionPerformed
        // TODO add your handling code here:
        jd_crear_maestro.setModal(true);
        jd_crear_maestro.pack();
        jd_crear_maestro.setLocationRelativeTo(this);
        jd_crear_maestro.setVisible(true);
    }//GEN-LAST:event_maestro_agregarActionPerformed

    private void alumnos_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnos_agregarActionPerformed
        // TODO add your handling code here:
        jd_crear_alumno.setModal(true);
        jd_crear_alumno.pack();
        jd_crear_alumno.setLocationRelativeTo(this);
        jd_crear_alumno.setVisible(true);
    }//GEN-LAST:event_alumnos_agregarActionPerformed

    private void registro_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registro_modificarActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_registros.getModel();
        modelo.removeAllElements();
        administrarRegistros ap = new administrarRegistros("./registro.txt");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaRegistros().size(); i++) {
            modelo.addElement(ap.getListaRegistros().get(i));
        }
        jl_registros.setModel(modelo);

        jd_listar_registros.setModal(true);
        jd_listar_registros.pack();
        jd_listar_registros.setLocationRelativeTo(this);
        jd_listar_registros.setVisible(true);
    }//GEN-LAST:event_registro_modificarActionPerformed

    private void maestro_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maestro_modificarActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_maestros.getModel();
        modelo.removeAllElements();
        administrarMaestros ap = new administrarMaestros("./maestros.cbm");
        ap.cargarArchivo();

        for (int i = 0; i < ap.getListaMaestros().size(); i++) {
            modelo.addElement(ap.getListaMaestros().get(i));
        }
        jl_maestros.setModel(modelo);
        jd_listar_maestros.setModal(true);
        jd_listar_maestros.pack();
        jd_listar_maestros.setLocationRelativeTo(this);
        jd_listar_maestros.setVisible(true);
    }//GEN-LAST:event_maestro_modificarActionPerformed

    private void alumnos_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnos_modificarActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_alumnos.getModel();
        modelo.removeAllElements();
        administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaAlumnos().size(); i++) {
            modelo.addElement(ap.getListaAlumnos().get(i));
        }
        jl_alumnos.setModel(modelo);

        jd_listar_alumnos.setModal(true);
        jd_listar_alumnos.pack();
        jd_listar_alumnos.setLocationRelativeTo(this);
        jd_listar_alumnos.setVisible(true);
    }//GEN-LAST:event_alumnos_modificarActionPerformed

    private void jb_crear_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_registroActionPerformed
        // TODO add your handling code here:
        try {
            String username = tf_registro_user.getText();
            String password = tf_registro_pass.getText();
            Registro p = new Registro(username, password);
            administrarRegistros ap = new administrarRegistros("./registro.txt");
            ap.cargarArchivo();
            ap.getListaRegistros().add(p);
            ap.escribirArchivo();
            tf_registro_user.setText("");
            tf_registro_pass.setText("");
            jd_crear_registro.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_crear_registroActionPerformed

    private void jb_crear_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_maestroActionPerformed
        // TODO add your handling code here:
        try {
            String username = tf_maestro_user.getText();
            String password = tf_maestro_pass.getText();
            String nombre = tf_maestro_nombre.getText();
            String profesion = tf_maestro_profesion.getText();
            String rol = tf_maestro_rol.getText();
            int id = Integer.parseInt(tf_maestro_id.getText());
            double sueldo = Double.parseDouble(tf_maestro_sueldo.getText());
            Maestro p = new Maestro(nombre, username, password, profesion, rol, id, sueldo);
            administrarMaestros ap = new administrarMaestros("./maestros.cbm");
            ap.cargarArchivo();
            ap.setMaestro(p);
            ap.escribirArchivo();
            tf_maestro_user.setText("");
            tf_maestro_pass.setText("");
            tf_maestro_nombre.setText("");
            tf_maestro_profesion.setText("");
            tf_maestro_rol.setText("");
            tf_maestro_id.setText("");
            tf_maestro_sueldo.setText("");
            jd_crear_maestro.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_crear_maestroActionPerformed

    private void jb_crear_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_alumnoActionPerformed
        // TODO add your handling code here:
        try {
            String username = tf_alumno_user.getText();
            String password = tf_alumno_pass.getText();
            String nombre = tf_alumno_nombre.getText();
            String carrers = tf_alumno_carrera.getText();
            String rol = tf_alumno_rol.getText();
            int cuenta = Integer.parseInt(tf_alumno_cuenta.getText());
            int clasesCursadas = Integer.parseInt(tf_alumno_clases.getText());
            Alumno p = new Alumno(username, password, nombre, carrers, rol, cuenta, clasesCursadas);
            administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
            ap.cargarArchivo();
            ap.setAlumno(p);
            ap.escribirArchivo();
            tf_alumno_user.setText("");
            tf_alumno_pass.setText("");
            tf_alumno_nombre.setText("");
            tf_alumno_carrera.setText("");
            tf_alumno_rol.setText("");
            tf_alumno_cuenta.setText("");
            tf_alumno_clases.setText("");
            jd_crear_alumno.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_crear_alumnoActionPerformed

    private void jl_registrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_registrosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_registros.getSelectedIndex() >= 0) {
                popup_registro.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_registrosMouseClicked

    private void eliminar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_registroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_registros.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) jl_registros.getModel();
            modelo.remove(po);
            jl_registros.setModel(modelo);
            administrarRegistros ap = new administrarRegistros("./registro.txt");
            ap.cargarArchivo();
            ap.getListaRegistros().remove(po);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_registroActionPerformed

    private void modificar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_registroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_registros.getSelectedIndex();
            administrarRegistros ap = new administrarRegistros("./registro.txt");
            ap.cargarArchivo();
            Registro x = ap.getListaRegistros().get(po);
            tf_registro_user_m.setText(x.getUsername());
            tf_registro_pass_m.setText(x.getPassword());
            jd_modificar_registro.setModal(true);
            jd_modificar_registro.pack();
            jd_modificar_registro.setLocationRelativeTo(this);
            jd_modificar_registro.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificar_registroActionPerformed

    private void jb_modificar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_registroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_registros.getSelectedIndex();
            administrarRegistros ap = new administrarRegistros("./registro.txt");
            ap.cargarArchivo();
            String username = tf_registro_user_m.getText();
            String password = tf_registro_pass_m.getText();
            ap.getListaRegistros().get(po).setPassword(password);
            ap.getListaRegistros().get(po).setUsername(username);
            ap.escribirArchivo();
            DefaultListModel modelo = (DefaultListModel) jl_registros.getModel();
            modelo.set(po, ap.getListaRegistros().get(po));
            jl_registros.setModel(modelo);
            jd_modificar_registro.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_registroActionPerformed

    private void jl_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_alumnosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_alumnos.getSelectedIndex() >= 0) {
                popup_alumno.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_alumnosMouseClicked

    private void eliminar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_alumnoActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_alumnos.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) jl_alumnos.getModel();
            modelo.remove(po);
            jl_alumnos.setModel(modelo);
            administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
            ap.cargarArchivo();
            ap.getListaAlumnos().remove(po);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_alumnoActionPerformed

    private void modificar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_alumnoActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_alumnos.getSelectedIndex();
            administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
            ap.cargarArchivo();
            Alumno x = ap.getListaAlumnos().get(po);
            tf_alumno_user_m.setText(x.getUsername());
            tf_alumno_pass_m.setText(x.getPassword());
            tf_alumno_nombre_m.setText(x.getNombre());
            tf_alumno_carrera_m.setText(x.getCarrera());
            tf_alumno_rol_m.setText(x.getRol());
            tf_alumno_cuenta_m.setText(String.valueOf(x.getCuenta()));
            tf_alumno_clases_m.setText(String.valueOf(x.getClasesCursadas()));
            jd_modificar_alumno.setModal(true);
            jd_modificar_alumno.pack();
            jd_modificar_alumno.setLocationRelativeTo(this);
            jd_modificar_alumno.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificar_alumnoActionPerformed

    private void jb_modificar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_alumnoActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_alumnos.getSelectedIndex();
            administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
            ap.cargarArchivo();
            String username = tf_alumno_user_m.getText();
            String password = tf_alumno_pass_m.getText();
            String nombre = tf_alumno_nombre_m.getText();
            String carrera = tf_alumno_carrera_m.getText();
            String rol = tf_alumno_rol_m.getText();
            int cuenta = Integer.parseInt(tf_alumno_cuenta_m.getText());
            int clasesCursadas = Integer.parseInt(tf_alumno_clases_m.getText());
            ap.getListaAlumnos().get(po).setUsername(username);
            ap.getListaAlumnos().get(po).setPassword(password);
            ap.getListaAlumnos().get(po).setNombre(nombre);
            ap.getListaAlumnos().get(po).setCarrera(carrera);
            ap.getListaAlumnos().get(po).setRol(rol);
            ap.getListaAlumnos().get(po).setCuenta(cuenta);
            ap.getListaAlumnos().get(po).setClasesCursadas(clasesCursadas);
            ap.escribirArchivo();
            DefaultListModel modelo = (DefaultListModel) jl_alumnos.getModel();
            modelo.set(po, ap.getListaAlumnos().get(po));
            jl_alumnos.setModel(modelo);
            jd_modificar_alumno.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_alumnoActionPerformed

    private void jl_maestrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_maestrosMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_maestros.getSelectedIndex() >= 0) {
                popup_maestro.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_maestrosMouseClicked

    private void eliminar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_maestroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_maestros.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) jl_maestros.getModel();
            modelo.remove(po);
            jl_maestros.setModel(modelo);
            administrarMaestros ap = new administrarMaestros("./maestros.cbm");
            ap.cargarArchivo();
            ap.getListaMaestros().remove(po);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_maestroActionPerformed

    private void modificar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_maestroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_maestros.getSelectedIndex();
            administrarMaestros ap = new administrarMaestros("./maestros.cbm");
            ap.cargarArchivo();
            Maestro x = ap.getListaMaestros().get(po);
            tf_maestro_user_m.setText(x.getUsername());
            tf_maestro_pass_m.setText(x.getPassword());
            tf_maestro_nombre_m.setText(x.getNombre());
            tf_maestro_profesion_m.setText(x.getProfesion());
            tf_maestro_rol_m.setText(x.getRol());
            tf_maestro_id_m.setText(String.valueOf(x.getId()));
            tf_maestro_sueldo_m.setText(String.valueOf(x.getSueldo()));
            jd_modificar_maestro.setModal(true);
            jd_modificar_maestro.pack();
            jd_modificar_maestro.setLocationRelativeTo(this);
            jd_modificar_maestro.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificar_maestroActionPerformed

    private void jb_modificar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_maestroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_maestros.getSelectedIndex();
            administrarMaestros ap = new administrarMaestros("./maestros.cbm");
            ap.cargarArchivo();
            String username = tf_maestro_user_m.getText();
            String password = tf_maestro_pass_m.getText();
            String nombre = tf_maestro_nombre_m.getText();
            String profesion = tf_maestro_profesion_m.getText();
            String rol = tf_maestro_rol_m.getText();
            int id = Integer.parseInt(tf_maestro_id_m.getText());
            double sueldo = Double.parseDouble(tf_maestro_sueldo_m.getText());
            ap.getListaMaestros().get(po).setUsername(username);
            ap.getListaMaestros().get(po).setPassword(password);
            ap.getListaMaestros().get(po).setNombre(nombre);
            ap.getListaMaestros().get(po).setProfesion(profesion);
            ap.getListaMaestros().get(po).setRol(rol);
            ap.getListaMaestros().get(po).setId(id);
            ap.getListaMaestros().get(po).setSueldo(sueldo);
            ap.escribirArchivo();
            DefaultListModel modelo = (DefaultListModel) jl_maestros.getModel();
            modelo.set(po, ap.getListaMaestros().get(po));
            jl_maestros.setModel(modelo);
            jd_modificar_maestro.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_maestroActionPerformed

    private void clases_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clases_agregarActionPerformed
        // TODO add your handling code here:
        jd_crear_clase.setModal(true);
        jd_crear_clase.pack();
        jd_crear_clase.setLocationRelativeTo(this);
        jd_crear_clase.setVisible(true);
    }//GEN-LAST:event_clases_agregarActionPerformed

    private void clases_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clases_modificarActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_clases.getModel();
        modelo.removeAllElements();
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            modelo.addElement(ap.getListaClases().get(i));
        }
        jl_clases.setModel(modelo);

        jd_listar_clase.setModal(true);
        jd_listar_clase.pack();
        jd_listar_clase.setLocationRelativeTo(this);
        jd_listar_clase.setVisible(true);
    }//GEN-LAST:event_clases_modificarActionPerformed

    private void jb_crear_clasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_clasesActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = tf_clase_nombre.getText();
            int id = Integer.parseInt(tf_clase_id.getText());
            int hora = (int) tf_clase_hora.getValue();
            int unidades = (int) tf_clase_unidades.getValue();
            int semestre = (int) tf_clase_semestre.getValue();
            int periodo = (int) tf_clase_periodo.getValue();
            int year = tf_clase_year.getYear();
            Maestro maestro = null;
            Clase p = new Clase(nombre, id, hora, unidades, semestre, periodo, year, maestro);
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            ap.setClase(p);
            ap.escribirArchivo();
            tf_clase_nombre.setText("");
            tf_clase_id.setText("");
            tf_clase_hora.setValue(0);
            tf_clase_unidades.setValue(0);
            tf_clase_semestre.setValue(0);
            tf_clase_periodo.setValue(0);
            tf_clase_year.setYear(2021);
            jd_crear_clase.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_crear_clasesActionPerformed

    private void jb_modificar_clasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_modificar_clasesActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_clases.getSelectedIndex();
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            String nombre = tf_clase_nombre_m.getText();
            int id = Integer.parseInt(tf_clase_id_m.getText());
            int hora = (int) tf_clase_hora_m.getValue();
            int unidades = (int) tf_clase_unidades_m.getValue();
            int semestre = (int) tf_clase_semestre_m.getValue();
            int periodo = (int) tf_clase_periodo_m.getValue();
            int year = tf_clase_year_m.getYear();
            ap.getListaClases().get(po).setHora(hora);
            ap.getListaClases().get(po).setId(id);
            ap.getListaClases().get(po).setNombre(nombre);
            ap.getListaClases().get(po).setPeriodo(periodo);
            ap.getListaClases().get(po).setSemestre(semestre);
            ap.getListaClases().get(po).setUnidades(unidades);
            ap.getListaClases().get(po).setYear(year);
            ap.escribirArchivo();
            //
            DefaultListModel modelo = (DefaultListModel) jl_clases.getModel();
            modelo.set(po, ap.getListaClases().get(po));
            jl_clases.setModel(modelo);
            jd_modificar_clase.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_clasesActionPerformed

    private void jl_clasesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_clasesMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_clases.getSelectedIndex() >= 0) {
                popup_clase.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_clasesMouseClicked

    private void eliminar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_claseActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_clases.getSelectedIndex();
            DefaultListModel modelo = (DefaultListModel) jl_clases.getModel();
            modelo.remove(po);
            jl_clases.setModel(modelo);
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            ap.getListaClases().remove(po);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_claseActionPerformed

    private void modificar_claseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_claseActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_clases.getSelectedIndex();
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            Clase x = ap.getListaClases().get(po);
            tf_clase_nombre_m.setText(x.getNombre());
            tf_clase_id_m.setText(String.valueOf(x.getId()));
            tf_clase_hora_m.setValue(x.getHora());
            tf_clase_unidades_m.setValue(x.getUnidades());
            tf_clase_semestre_m.setValue(x.getSemestre());
            tf_clase_periodo_m.setValue(x.getPeriodo());
            tf_clase_year_m.setYear(x.getYear());

            jd_modificar_clase.setModal(true);
            jd_modificar_clase.pack();
            jd_modificar_clase.setLocationRelativeTo(this);
            jd_modificar_clase.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_modificar_claseActionPerformed

    private void asignar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignar_maestroActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_verMaestros.getModel();
        modelo.removeAllElements();
        administrarMaestros ap = new administrarMaestros("./maestros.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaMaestros().size(); i++) {
            modelo.addElement(ap.getListaMaestros().get(i));
        }
        jl_verMaestros.setModel(modelo);

        DefaultListModel modelo1 = (DefaultListModel) jl_verClases.getModel();
        modelo1.removeAllElements();
        administrarClases ap1 = new administrarClases("./clases.cbm");
        ap1.cargarArchivo();
        for (int i = 0; i < ap1.getListaClases().size(); i++) {
            modelo1.addElement(ap1.getListaClases().get(i));
        }
        jl_verClases.setModel(modelo1);

        jd_asignar_maestro.setModal(true);
        jd_asignar_maestro.pack();
        jd_asignar_maestro.setLocationRelativeTo(this);
        jd_asignar_maestro.setVisible(true);
    }//GEN-LAST:event_asignar_maestroActionPerformed

    private void asignar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignar_alumnoActionPerformed
        // TODO add your handling code here:
        DefaultListModel modelo = (DefaultListModel) jl_verAlumnos.getModel();
        modelo.removeAllElements();
        administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
        ap.cargarArchivo();
        for (int i = 0; i < ap.getListaAlumnos().size(); i++) {
            modelo.addElement(ap.getListaAlumnos().get(i));
        }
        jl_verAlumnos.setModel(modelo);

        DefaultListModel modelo1 = (DefaultListModel) jl_verClasesA.getModel();
        modelo1.removeAllElements();
        administrarClases ap1 = new administrarClases("./clases.cbm");
        ap1.cargarArchivo();
        for (int i = 0; i < ap1.getListaClases().size(); i++) {
            modelo1.addElement(ap1.getListaClases().get(i));
        }
        jl_verClasesA.setModel(modelo1);

        jd_asignar_alumno.setModal(true);
        jd_asignar_alumno.pack();
        jd_asignar_alumno.setLocationRelativeTo(this);
        jd_asignar_alumno.setVisible(true);
    }//GEN-LAST:event_asignar_alumnoActionPerformed

    private void jb_asignar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asignar_maestroActionPerformed
        // TODO add your handling code here:
        try {
            if (jl_verMaestros.getSelectedIndex() >= 0 && jl_verClases.getSelectedIndex() >= 0) {
                administrarMaestros ap = new administrarMaestros("./maestros.cbm");
                ap.cargarArchivo();
                administrarClases ap1 = new administrarClases("./clases.cbm");
                ap1.cargarArchivo();
                int po = jl_verMaestros.getSelectedIndex();
                int po2 = jl_verClases.getSelectedIndex();

                Maestro x = ap.getListaMaestros().get(po);
                ap1.getListaClases().get(po2).setMaestro(x);
                JOptionPane.showMessageDialog(this, "SE HA ASIGNADO EXITOSAMENTE");

                ap1.escribirArchivo();
                DefaultListModel modelo = (DefaultListModel) jl_verClases.getModel();
                modelo.set(po2, ap1.getListaClases().get(po2));
                jl_verClases.setModel(modelo);
                //System.out.println(ap1.getListaClases());
            } else {
                JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR DE AMBOS LADOS");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_asignar_maestroActionPerformed

    private void jb_asignar_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asignar_alumnosActionPerformed
        // TODO add your handling code here:
        try {
            if (jl_verAlumnos.getSelectedIndex() >= 0 && jl_verClasesA.getSelectedIndex() >= 0) {
                administrarAlumnos ap = new administrarAlumnos("./alumnos.cbm");
                ap.cargarArchivo();
                administrarClases ap1 = new administrarClases("./clases.cbm");
                ap1.cargarArchivo();
                int po = jl_verAlumnos.getSelectedIndex();
                int po2 = jl_verClasesA.getSelectedIndex();
                boolean found = false;
                for (int i = 0; i < ap1.getListaClases().get(po2).getAlumnos().size(); i++) {
                    if (ap1.getListaClases().get(po2).getAlumnos().get(i).getNombre().equals(ap.getListaAlumnos().get(po).getNombre())
                            && ap1.getListaClases().get(po2).getAlumnos().get(i).getUsername().equals(ap.getListaAlumnos().get(po).getUsername())
                            && ap1.getListaClases().get(po2).getAlumnos().get(i).getPassword().equals(ap.getListaAlumnos().get(po).getPassword())) {
                        found = true;
                    }
                }
                if (found == true) {
                    JOptionPane.showMessageDialog(this, "YA ESTA ASIGNADO A ESTA CLASE");
                } else {
                    ap1.getListaClases().get(po2).getAlumnos().add(ap.getListaAlumnos().get(po));
                    JOptionPane.showMessageDialog(this, "SE HA ASIGNADO EXITOSAMENTE");
                }
                ap1.escribirArchivo();
                DefaultListModel modelo = (DefaultListModel) jl_verClasesA.getModel();
                modelo.set(po2, ap1.getListaClases().get(po2));
                jl_verClasesA.setModel(modelo);
                //System.out.println(ap1.getListaClases());
            } else {
                JOptionPane.showMessageDialog(this, "DEBE SELECCIONAR DE AMBOS LADOS");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_asignar_alumnosActionPerformed

    private void cerrar_sesion_alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesion_alumActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this.getFrames()[0], "Seguro que desea Salirse?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.OK_OPTION) {
            jf_alumno.dispose();
            this.setVisible(true);
        }
    }//GEN-LAST:event_cerrar_sesion_alumActionPerformed

    private void cerrar_sistema_alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sistema_alumActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrar_sistema_alumActionPerformed

    private void cerrar_sesion_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sesion_maestroActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this.getFrames()[0], "Seguro que desea Salirse?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.OK_OPTION) {
            jf_maestros.dispose();
            this.setVisible(true);
        }
    }//GEN-LAST:event_cerrar_sesion_maestroActionPerformed

    private void cerrar_sistema_maesrtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrar_sistema_maesrtoActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_cerrar_sistema_maesrtoActionPerformed

    private void jb_alumnos_tareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alumnos_tareasActionPerformed
        // TODO add your handling code here:
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        boolean found = false;
        DefaultListModel modelo = (DefaultListModel) jl_verMisTareas.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            boolean esta = false;
            for (int j = 0; j < ap.getListaClases().get(i).getAlumnos().size(); j++) {
                if (ap.getListaClases().get(i).getAlumnos().get(j).getUsername().equals(estudianteAsig.getUsername())) {
                    esta = true;
                }
            }
            if (esta) {
                esta = false;
                for (int j = 0; j < ap.getListaClases().get(i).getTareas().size(); j++) {
                    for (int k = 0; k < ap.getListaClases().get(i).getTareas().get(j).getTareasAlumnos().size(); k++) {
                        if (ap.getListaClases().get(i).getTareas().get(j).getTareasAlumnos().get(k).getEstudiante().getUsername().equals(estudianteAsig.getUsername())) {
                            found = true;
                        }
                    }
                    Date fecha = new Date();
                    if (found == false && fecha.before(ap.getListaClases().get(i).getTareas().get(j).getFechaFinal())) {
                        modelo.addElement(ap.getListaClases().get(i).getTareas().get(j));
                    }
                    found = false;
                }
            }
        }
        jl_verMisTareas.setModel(modelo);

        jd_verTareas_alumnos.setModal(true);
        jd_verTareas_alumnos.pack();
        jd_verTareas_alumnos.setLocationRelativeTo(this);
        jd_verTareas_alumnos.setVisible(true);
    }//GEN-LAST:event_jb_alumnos_tareasActionPerformed

    private void jb_maestros_tareas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_maestros_tareas1ActionPerformed
        // TODO add your handling code here:
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        DefaultListModel modelo = (DefaultListModel) jl_asignar_clases.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            if (ap.getListaClases().get(i).getMaestro() != null) {
                if (ap.getListaClases().get(i).getMaestro().getUsername().equals(maestroAsig.getUsername())) {
                    modelo.addElement(ap.getListaClases().get(i));
                }
            }
        }
        jl_asignar_clases.setModel(modelo);
        jd_verClases_maestros.setModal(true);
        jd_verClases_maestros.pack();
        jd_verClases_maestros.setLocationRelativeTo(this);
        jd_verClases_maestros.setVisible(true);
    }//GEN-LAST:event_jb_maestros_tareas1ActionPerformed

    private void jb_asginat_tareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asginat_tareaActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_asignar_clases.getSelectedIndex() >= 0) {
                int po = jl_asignar_clases.getSelectedIndex();
                DefaultListModel modelo = (DefaultListModel) jl_asignar_clases.getModel();
                Clase x = (Clase) modelo.getElementAt(po);
                String nombre = x.getNombre();
                for (int i = 0; i < ap.getListaClases().size(); i++) {
                    if (ap.getListaClases().get(i).getNombre().equals(nombre)) {
                        poClase = i;
                    }
                }
                jl_asignar_clases.setModel(modelo);
                jd_asignar_tarea.setModal(true);
                jd_asignar_tarea.pack();
                jd_asignar_tarea.setLocationRelativeTo(this);
                jd_asignar_tarea.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_asginat_tareaActionPerformed

    private void jb_asignar_tareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asignar_tareaActionPerformed
        // TODO add your handling code here:
        try {
            Date fecha = tarea_date.getDate();
            fecha.setHours(Integer.parseInt(tarea_hora.getText()));
            String titulo = tarea_titulo.getText();
            String desc = tarea_descripcion.getText();
            Tarea x = new Tarea(fecha, titulo, desc);
            tarea_date.setDate(new Date());
            tarea_hora.setText("");
            tarea_titulo.setText("");
            tarea_descripcion.setText("");
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            ap.getListaClases().get(poClase).getTareas().add(x);
            ap.escribirArchivo();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_asignar_tareaActionPerformed

    private void examinar_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_examinar_equipoActionPerformed
        // TODO add your handling code here:
        try {
            JFileChooser fc = new JFileChooser();
            File archivo = null;
            FileFilter filtro = new FileNameExtensionFilter("Tarea", "pdf", "jpeg", "png", "docx", "txt");
            fc.setFileFilter(filtro);
            int op = fc.showOpenDialog(null);
            if (op == JFileChooser.APPROVE_OPTION) {
                archivo = fc.getSelectedFile();
            }
            label_tarea.setText(archivo.getAbsolutePath());
            archivoSeleccionado = archivo;
        } catch (Exception e) {

        }
    }//GEN-LAST:event_examinar_equipoActionPerformed

    private void jb_entregar_tareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entregar_tareaActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            TareaAlumno x = new TareaAlumno(estudianteAsig, 0, archivoSeleccionado);
            ap.getListaClases().get(poClaseE).getTareas().get(poTareaE).getTareasAlumnos().add(x);
            ap.escribirArchivo();
            boolean found = false;
            DefaultListModel modelo = (DefaultListModel) jl_verMisTareas.getModel();
            modelo.removeAllElements();
            for (int i = 0; i < ap.getListaClases().size(); i++) {
                boolean esta = false;
                for (int j = 0; j < ap.getListaClases().get(i).getAlumnos().size(); j++) {
                    if (ap.getListaClases().get(i).getAlumnos().get(j).getUsername().equals(estudianteAsig.getUsername())) {
                        esta = true;
                    }
                }
                if (esta) {
                    esta = false;
                    for (int j = 0; j < ap.getListaClases().get(i).getTareas().size(); j++) {
                        for (int k = 0; k < ap.getListaClases().get(i).getTareas().get(j).getTareasAlumnos().size(); k++) {
                            if (ap.getListaClases().get(i).getTareas().get(j).getTareasAlumnos().get(k).getEstudiante().getUsername().equals(estudianteAsig.getUsername())) {
                                found = true;
                            }
                        }
                        Date fecha = new Date();
                        if (found == false && fecha.before(ap.getListaClases().get(i).getTareas().get(j).getFechaFinal())) {
                            modelo.addElement(ap.getListaClases().get(i).getTareas().get(j));
                        }
                        found = false;
                    }
                }
            }
            jl_verMisTareas.setModel(modelo);
            jd_entregar_tarea.hide();
            JOptionPane.showMessageDialog(this, "SE MANDO EXITOSAMENTE");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jb_entregar_tareaActionPerformed

    private void jb_entregarMiTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_entregarMiTareaActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_verMisTareas.getSelectedIndex() >= 0) {
                int po = jl_verMisTareas.getSelectedIndex();
                DefaultListModel modelo = (DefaultListModel) jl_verMisTareas.getModel();
                Tarea x = (Tarea) modelo.getElementAt(po);
                String nombre = x.getTitulo();
                for (int i = 0; i < ap.getListaClases().size(); i++) {
                    for (int j = 0; j < ap.getListaClases().get(i).getTareas().size(); j++) {
                        if (ap.getListaClases().get(i).getTareas().get(j).getTitulo().equals(nombre)) {
                            poClaseE = i;
                            poTareaE = j;
                        }
                    }
                }
                tarea_alum_titulo.setText(ap.getListaClases().get(poClaseE).getTareas().get(poTareaE).getTitulo());
                tarea_alum_desc.setText(ap.getListaClases().get(poClaseE).getTareas().get(poTareaE).getDescripcion());
                jd_entregar_tarea.setModal(true);
                jd_entregar_tarea.pack();
                jd_entregar_tarea.setLocationRelativeTo(this);
                jd_entregar_tarea.setVisible(true);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jb_entregarMiTareaActionPerformed

    private void jb_alumnos_forosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alumnos_forosActionPerformed
        // TODO add your handling code here:
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        DefaultListModel modelo = (DefaultListModel) jl_verMisForos.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            boolean esta = false;
            for (int j = 0; j < ap.getListaClases().get(i).getAlumnos().size(); j++) {
                if (ap.getListaClases().get(i).getAlumnos().get(j).getUsername().equals(estudianteAsig.getUsername())) {
                    esta = true;
                }
            }
            if (esta) {
                for (int j = 0; j < ap.getListaClases().get(i).getForos().size(); j++) {
                    //System.out.println(ap.getListaClases().get(i).getForos().get(j));
                    modelo.addElement(ap.getListaClases().get(i).getForos().get(j));
                }
                esta = false;
            }
        }
        jl_verMisForos.setModel(modelo);

        jd_verMisForos.setModal(true);
        jd_verMisForos.pack();
        jd_verMisForos.setLocationRelativeTo(this);
        jd_verMisForos.setVisible(true);
    }//GEN-LAST:event_jb_alumnos_forosActionPerformed

    private void jb_abrirForoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_abrirForoActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_verMisForos.getSelectedIndex() >= 0) {
                int po = jl_verMisForos.getSelectedIndex();
                DefaultListModel modelo = (DefaultListModel) jl_verMisForos.getModel();
                Foro x = (Foro) modelo.getElementAt(po);
                String nombre = x.getTitulo();
                int aux = 0;
                for (int i = 0; i < ap.getListaClases().size(); i++) {
                    for (int j = 0; j < ap.getListaClases().get(i).getForos().size(); j++) {
                        if (ap.getListaClases().get(i).getForos().get(j).getTitulo().equals(nombre)) {
                            poClaseF = i;
                            poForoF = j;
                            aux = 1;
                            break;
                        }
                    }
                    if (aux == 1) {
                        break;
                    }
                }
                String tit = ap.getListaClases().get(poClaseF).getForos().get(poForoF).getTitulo();
                String desc = ap.getListaClases().get(poClaseF).getForos().get(poForoF).getDescripcion();
                tf_alumno_foroTitulo.setText(tit);
                ta_alumno_foroDesc.setText(desc);
                ta_alumnos_aportes.setText("");
                for (int i = 0; i < ap.getListaClases().get(poClaseF).getForos().get(poForoF).getAportes().size(); i++) {
                    ta_alumnos_aportes.append(ap.getListaClases().get(poClaseF).getForos().get(poForoF).getAportes().get(i));
                    ta_alumnos_aportes.append("\n");
                    ta_alumnos_aportes.append("\n");
                }
                jd_alumno_foro.setModal(true);
                jd_alumno_foro.pack();
                jd_alumno_foro.setLocationRelativeTo(this);
                jd_alumno_foro.setVisible(true);
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jb_abrirForoActionPerformed

    private void jb_alumno_ingresarAporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alumno_ingresarAporteActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            String aporte = estudianteAsig.toString() + " : ";
            aporte += ta_alumnos_miAporte.getText();
            ta_alumnos_aportes.append(aporte);
            ta_alumnos_aportes.append("\n");
            ta_alumnos_aportes.append("\n");
            ap.getListaClases().get(poClaseF).getForos().get(poForoF).getAportes().add(aporte);
            ap.escribirArchivo();
            ta_alumnos_miAporte.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_alumno_ingresarAporteActionPerformed

    private void jb_alumnos_foros1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alumnos_foros1ActionPerformed
        // TODO add your handling code here:
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        DefaultListModel modelo = (DefaultListModel) jl_asignarforos_clases.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            if (ap.getListaClases().get(i).getMaestro() != null) {
                if (ap.getListaClases().get(i).getMaestro().getUsername().equals(maestroAsig.getUsername())) {
                    modelo.addElement(ap.getListaClases().get(i));
                }
            }
        }
        jl_asignarforos_clases.setModel(modelo);
        jd_verClasesForos_maestros.setModal(true);
        jd_verClasesForos_maestros.pack();
        jd_verClasesForos_maestros.setLocationRelativeTo(this);
        jd_verClasesForos_maestros.setVisible(true);
    }//GEN-LAST:event_jb_alumnos_foros1ActionPerformed

    private void jb_crear_foroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_foroActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            String titulo = tf_crearForo_tit.getText();
            String descripcion = tf_crearForo_desc.getText();
            Foro x = new Foro(titulo, descripcion);
            ap.getListaClases().get(poClaseFM).getForos().add(x);
            ap.escribirArchivo();
            tf_crearForo_tit.setText("");
            tf_crearForo_desc.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_crear_foroActionPerformed

    private void jb_asginar_foroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_asginar_foroActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_asignarforos_clases.getSelectedIndex() >= 0) {
                int po = jl_asignarforos_clases.getSelectedIndex();
                DefaultListModel modelo = (DefaultListModel) jl_asignarforos_clases.getModel();
                Clase x = (Clase) modelo.getElementAt(po);
                String nombre = x.getNombre();
                for (int i = 0; i < ap.getListaClases().size(); i++) {
                    if (ap.getListaClases().get(i).getNombre().equals(nombre)) {
                        poClaseFM = i;
                    }
                }
                jd_crearForo.setModal(true);
                jd_crearForo.pack();
                jd_crearForo.setLocationRelativeTo(this);
                jd_crearForo.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_asginar_foroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_asignarforos_clases.getSelectedIndex() >= 0) {
                int po = jl_asignarforos_clases.getSelectedIndex();
                DefaultListModel modelo = (DefaultListModel) jl_asignarforos_clases.getModel();
                Clase x = (Clase) modelo.getElementAt(po);
                String nombre = x.getNombre();
                for (int i = 0; i < ap.getListaClases().size(); i++) {
                    if (ap.getListaClases().get(i).equals(nombre)) {
                        poClaseFM = i;
                    }
                }
                DefaultListModel modelo1 = (DefaultListModel) jl_foros.getModel();
                modelo1.removeAllElements();
                for (int i = 0; i < ap.getListaClases().get(poClaseFM).getForos().size(); i++) {
                    modelo1.addElement(ap.getListaClases().get(poClaseFM).getForos().get(i));
                }
                jl_foros.setModel(modelo1);
                jd_verForosDeClase.setModal(true);
                jd_verForosDeClase.pack();
                jd_verForosDeClase.setLocationRelativeTo(this);
                jd_verForosDeClase.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jb_abiriForoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_abiriForoActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_foros.getSelectedIndex() >= 0) {
                int po = jl_foros.getSelectedIndex();
                String tit = ap.getListaClases().get(poClaseFM).getForos().get(po).getTitulo();
                String desc = ap.getListaClases().get(poClaseFM).getForos().get(po).getDescripcion();
                tf_alumno_foroTitulo1.setText(tit);
                ta_alumno_foroDesc1.setText(desc);
                ta_alumnos_aportes1.setText("");
                for (int i = 0; i < ap.getListaClases().get(poClaseF).getForos().get(po).getAportes().size(); i++) {
                    ta_alumnos_aportes1.append(ap.getListaClases().get(poClaseF).getForos().get(po).getAportes().get(i));
                    ta_alumnos_aportes1.append("\n");
                    ta_alumnos_aportes1.append("\n");
                }
                jd_verForos_Maestro.setModal(true);
                jd_verForos_Maestro.pack();
                jd_verForos_Maestro.setLocationRelativeTo(this);
                jd_verForos_Maestro.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_abiriForoActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        DefaultListModel modelo = (DefaultListModel) jl_clases_revisar.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            if (ap.getListaClases().get(i).getMaestro() != null) {
                if (ap.getListaClases().get(i).getMaestro().getUsername().equals(maestroAsig.getUsername())) {
                    modelo.addElement(ap.getListaClases().get(i));
                }
            }
        }
        jl_clases_revisar.setModel(modelo);
        jd_verClases_revisarTareas.setModal(true);
        jd_verClases_revisarTareas.pack();
        jd_verClases_revisarTareas.setLocationRelativeTo(this);
        jd_verClases_revisarTareas.setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jb_abrir_clasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_abrir_clasesActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_clases_revisar.getSelectedIndex() >= 0) {
                int po = jl_clases_revisar.getSelectedIndex();
                DefaultListModel modelo = (DefaultListModel) jl_clases_revisar.getModel();
                Clase x = (Clase) modelo.getElementAt(po);
                String nombre = x.getNombre();
                for (int i = 0; i < ap.getListaClases().size(); i++) {
                    if (ap.getListaClases().get(i).getNombre().equals(nombre)) {
                        poClaseT2 = i;
                    }
                }
                //System.out.println(ap.getListaClases().get(poClaseT2).getTareas());
                DefaultListModel modelo1 = (DefaultListModel) jl_tareas_revisar.getModel();
                modelo1.removeAllElements();
                for (int i = 0; i < ap.getListaClases().get(poClaseT2).getTareas().size(); i++) {
                    modelo1.addElement(ap.getListaClases().get(poClaseT2).getTareas().get(i));
                }
                jl_tareas_revisar.setModel(modelo1);
                jd_verTareas_revisarTareas.setModal(true);
                jd_verTareas_revisarTareas.pack();
                jd_verTareas_revisarTareas.setLocationRelativeTo(this);
                jd_verTareas_revisarTareas.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_abrir_clasesActionPerformed

    private void jb_abrir_tareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_abrir_tareasActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_tareas_revisar.getSelectedIndex() >= 0) {
                poTarea = jl_tareas_revisar.getSelectedIndex();
                DefaultListModel modelo1 = (DefaultListModel) jl_intentosA_revisar.getModel();
                modelo1.removeAllElements();
                for (int i = 0; i < ap.getListaClases().get(poClaseT2).getTareas().get(poTarea).getTareasAlumnos().size(); i++) {
                    modelo1.addElement(ap.getListaClases().get(poClaseT2).getTareas().get(poTarea).getTareasAlumnos().get(i));
                }
                jl_intentosA_revisar.setModel(modelo1);
                jd_verTareasdeAlumnos_revisarTareas.setModal(true);
                jd_verTareasdeAlumnos_revisarTareas.pack();
                jd_verTareasdeAlumnos_revisarTareas.setLocationRelativeTo(this);
                jd_verTareasdeAlumnos_revisarTareas.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_abrir_tareasActionPerformed

    private void jb_abrir_tareasdeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_abrir_tareasdeAlumnosActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_intentosA_revisar.getSelectedIndex() >= 0) {
                poIntentoAlumno = jl_intentosA_revisar.getSelectedIndex();
                tf_alum_revision.setText(ap.getListaClases().get(poClaseT2).getTareas().get(poTarea).getTareasAlumnos().get(poIntentoAlumno).getEstudiante().toString());
                jd_abrir_tarea.setModal(true);
                jd_abrir_tarea.pack();
                jd_abrir_tarea.setLocationRelativeTo(this);
                jd_abrir_tarea.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_abrir_tareasdeAlumnosActionPerformed

    private void jb_abrir_archivo_estActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_abrir_archivo_estActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            File archivo = ap.getListaClases().get(poClaseT2).getTareas().get(poTarea).getTareasAlumnos().get(poIntentoAlumno).getArchivo();
            Desktop desktop = Desktop.getDesktop();
            desktop.open(archivo);
        } catch (IOException e) {
        }
    }//GEN-LAST:event_jb_abrir_archivo_estActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            int nota = Integer.parseInt(ftf_nota.getText());
            ap.getListaClases().get(poClaseT2).getTareas().get(poTarea).getTareasAlumnos().get(poIntentoAlumno).setNota(nota);
            ap.escribirArchivo();
            ftf_nota.setText("");
            DefaultListModel modelo = (DefaultListModel) jl_intentosA_revisar.getModel();
            modelo.setElementAt(ap.getListaClases().get(poClaseT2).getTareas().get(poTarea).getTareasAlumnos().get(poIntentoAlumno), poIntentoAlumno);
            jl_intentosA_revisar.setModel(modelo);
            //System.out.println(ap.getListaClases().get(poClaseT2).getTareas().get(poTarea).getTareasAlumnos());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jb_maestros_notas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_maestros_notas1ActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            DefaultTableModel modelo = (DefaultTableModel) jt_maestros.getModel();
            modelo.setRowCount(0);
            for (int i = 0; i < ap.getListaClases().size(); i++) {
                String clase = ap.getListaClases().get(i).getNombre();
                if (ap.getListaClases().get(i).getMaestro() != null) {
                    if (ap.getListaClases().get(i).getMaestro().getUsername().equals(maestroAsig.getUsername())) {
                        for (int j = 0; j < ap.getListaClases().get(i).getTareas().size(); j++) {
                            for (int k = 0; k < ap.getListaClases().get(i).getAlumnos().size(); k++) {
                                Alumno x = ap.getListaClases().get(i).getAlumnos().get(k);
                                boolean found = false;
                                for (int l = 0; l < ap.getListaClases().get(i).getTareas().get(j).getTareasAlumnos().size(); l++) {
                                    if (ap.getListaClases().get(i).getTareas().get(j).getTareasAlumnos().get(l).getEstudiante().getUsername().equals(x.getUsername())) {
                                        Object[] nuevo = {clase, x.getCuenta(), x.getNombre(), ap.getListaClases().get(i).getTareas().get(j), "Tarea",
                                            ap.getListaClases().get(i).getTareas().get(j).getTareasAlumnos().get(l).getNota()};
                                        modelo.addRow(nuevo);
                                        found = true;
                                    }
                                }
                                if (found == false) {
                                    Object[] nuevo = {clase, x.getCuenta(), x.getNombre(), ap.getListaClases().get(i).getTareas().get(j), "Tarea", "No Entregada"};
                                    modelo.addRow(nuevo);
                                }
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < ap.getListaClases().size(); i++) {
                String clase = ap.getListaClases().get(i).getNombre();
                if (ap.getListaClases().get(i).getMaestro() != null) {
                    if (ap.getListaClases().get(i).getMaestro().getUsername().equals(maestroAsig.getUsername())) {
                        for (int j = 0; j < ap.getListaClases().get(i).getExamenes().size(); j++) {
                            for (int k = 0; k < ap.getListaClases().get(i).getAlumnos().size(); k++) {
                                Alumno x = ap.getListaClases().get(i).getAlumnos().get(k);
                                boolean found = false;
                                for (int l = 0; l < ap.getListaClases().get(i).getExamenes().get(j).getExamenesAlumnos().size(); l++) {
                                    if (ap.getListaClases().get(i).getExamenes().get(j).getExamenesAlumnos().get(l).getEstudiante().getUsername().equals(x.getUsername())) {
                                        Object[] nuevo = {clase, x.getCuenta(), x.getNombre(), ap.getListaClases().get(i).getExamenes().get(j), "Examen",
                                            ap.getListaClases().get(i).getExamenes().get(j).getExamenesAlumnos().get(l).getNota()};
                                        modelo.addRow(nuevo);
                                        found = true;
                                    }
                                }
                                if (found == false) {
                                    Object[] nuevo = {clase, x.getCuenta(), x.getNombre(), ap.getListaClases().get(i).getExamenes().get(j), "Examen", "No Realizado"};
                                    modelo.addRow(nuevo);
                                }
                            }
                        }
                    }
                }
            }
            jt_maestros.setModel(modelo);
            notas_maestro.setModal(true);
            notas_maestro.pack();
            notas_maestro.setLocationRelativeTo(this);
            notas_maestro.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_maestros_notas1ActionPerformed

    private void jb_alumnos_notasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alumnos_notasActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            DefaultTableModel modelo = (DefaultTableModel) jt_alumnos.getModel();
            modelo.setRowCount(0);
            for (int i = 0; i < ap.getListaClases().size(); i++) {
                String clase = ap.getListaClases().get(i).getNombre();
                for (int j = 0; j < ap.getListaClases().get(i).getAlumnos().size(); j++) {
                    if (ap.getListaClases().get(i).getAlumnos().get(j).getUsername().equals(estudianteAsig.getUsername())) {
                        for (int k = 0; k < ap.getListaClases().get(i).getTareas().size(); k++) {
                            boolean found = false;
                            for (int l = 0; l < ap.getListaClases().get(i).getTareas().get(k).getTareasAlumnos().size(); l++) {
                                if (ap.getListaClases().get(i).getTareas().get(k).getTareasAlumnos().get(l).getEstudiante().getUsername().equals(estudianteAsig.getUsername())) {
                                    Object[] nuevo = {clase, estudianteAsig.getCuenta(), estudianteAsig.getNombre(), ap.getListaClases().get(i).getTareas().get(k), "Tarea",
                                        ap.getListaClases().get(i).getTareas().get(k).getTareasAlumnos().get(l).getNota()};
                                    modelo.addRow(nuevo);
                                    found = true;
                                }
                            }
                            if (found == false) {
                                Object[] nuevo = {clase, estudianteAsig.getCuenta(), estudianteAsig.getNombre(), ap.getListaClases().get(i).getTareas().get(k), "Tarea", "No entregada"};
                                modelo.addRow(nuevo);
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < ap.getListaClases().size(); i++) {
                String clase = ap.getListaClases().get(i).getNombre();
                for (int j = 0; j < ap.getListaClases().get(i).getAlumnos().size(); j++) {
                    if (ap.getListaClases().get(i).getAlumnos().get(j).getUsername().equals(estudianteAsig.getUsername())) {
                        for (int k = 0; k < ap.getListaClases().get(i).getExamenes().size(); k++) {
                            boolean found = false;
                            for (int l = 0; l < ap.getListaClases().get(i).getExamenes().get(k).getExamenesAlumnos().size(); l++) {
                                if (ap.getListaClases().get(i).getExamenes().get(k).getExamenesAlumnos().get(l).getEstudiante().getUsername().equals(estudianteAsig.getUsername())) {
                                    Object[] nuevo = {clase, estudianteAsig.getCuenta(), estudianteAsig.getNombre(), ap.getListaClases().get(i).getExamenes().get(k), "Examen",
                                        ap.getListaClases().get(i).getExamenes().get(k).getExamenesAlumnos().get(l).getNota()};
                                    modelo.addRow(nuevo);
                                    found = true;
                                }
                            }
                            if (found == false) {
                                Object[] nuevo = {clase, estudianteAsig.getCuenta(), estudianteAsig.getNombre(), ap.getListaClases().get(i).getExamenes().get(k), "Examen", "No Realizado"};
                                modelo.addRow(nuevo);
                            }
                        }
                    }
                }
            }
            jt_alumnos.setModel(modelo);
            notas_estudiante.setModal(true);
            notas_estudiante.pack();
            notas_estudiante.setLocationRelativeTo(this);
            notas_estudiante.setVisible(true);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_alumnos_notasActionPerformed

    private void jb_maestros_examenes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_maestros_examenes1ActionPerformed
        // TODO add your handling code here:
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        DefaultListModel modelo = (DefaultListModel) jl_examenes_clases.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            if (ap.getListaClases().get(i).getMaestro() != null) {
                if (ap.getListaClases().get(i).getMaestro().getUsername().equals(maestroAsig.getUsername())) {
                    modelo.addElement(ap.getListaClases().get(i));
                }
            }
        }
        jl_examenes_clases.setModel(modelo);
        examenes_maestro_clases.setModal(true);
        examenes_maestro_clases.pack();
        examenes_maestro_clases.setLocationRelativeTo(this);
        examenes_maestro_clases.setVisible(true);
    }//GEN-LAST:event_jb_maestros_examenes1ActionPerformed

    private void jb_abrir_examenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_abrir_examenesActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_examenes_clases.getSelectedIndex() >= 0) {
                int po = jl_examenes_clases.getSelectedIndex();
                DefaultListModel modelo = (DefaultListModel) jl_examenes_clases.getModel();
                Clase x = (Clase) modelo.getElementAt(po);
                String nombre = x.getNombre();
                for (int i = 0; i < ap.getListaClases().size(); i++) {
                    if (ap.getListaClases().get(i).getNombre().equals(nombre)) {
                        poExamClase = i;
                    }
                }
                DefaultListModel modelo1 = (DefaultListModel) jl_examenes_examenes.getModel();
                modelo1.removeAllElements();
                for (int i = 0; i < ap.getListaClases().get(poExamClase).getExamenes().size(); i++) {
                    modelo1.addElement(ap.getListaClases().get(poExamClase).getExamenes().get(i));
                }
                jl_examenes_examenes.setModel(modelo1);
                examenes_maestro_examenes.setModal(true);
                examenes_maestro_examenes.pack();
                examenes_maestro_examenes.setLocationRelativeTo(this);
                examenes_maestro_examenes.setVisible(true);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_abrir_examenesActionPerformed

    private void eliminar_examenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_examenActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            ap.getListaClases().get(poExamClase).getExamenes().remove(poElimMod);
            ap.escribirArchivo();
            DefaultListModel modelo = (DefaultListModel) jl_examenes_examenes.getModel();
            modelo.remove(poElimMod);
            jl_examenes_examenes.setModel(modelo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_eliminar_examenActionPerformed

    private void jl_examenes_examenesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jl_examenes_examenesMouseClicked
        // TODO add your handling code here:
        if (evt.isMetaDown()) {
            if (jl_examenes_examenes.getSelectedIndex() >= 0) {
                poElimMod = jl_examenes_examenes.getSelectedIndex();
                popup_examenes.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_jl_examenes_examenesMouseClicked

    private void jb_add_examenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_add_examenActionPerformed
        // TODO add your handling code here:
        try {
            String titulo = examen_titulo.getText();
            Date fechaFinal = examen_fecha.getDate();
            int hora = Integer.parseInt(examen_hora.getText());
            fechaFinal.setHours(hora);
            int duracion = Integer.parseInt(examen_duracion.getText());
            Examen nuevo = new Examen(fechaFinal, duracion, titulo);
            for (int i = 0; i < preguntas.size(); i++) {
                nuevo.getPreguntas().add(preguntas.get(i));
            }
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            ap.getListaClases().get(poExamClase).getExamenes().add(nuevo);
            ap.escribirArchivo();
            preguntas.clear();

            examen_titulo.setText("");
            examen_fecha.setDate(new Date());
            examen_hora.setText("");
            examen_duracion.setText("");
            DefaultListModel modelo1 = (DefaultListModel) jl_examenes_examenes.getModel();
            modelo1.removeAllElements();
            for (int i = 0; i < ap.getListaClases().get(poExamClase).getExamenes().size(); i++) {
                modelo1.addElement(ap.getListaClases().get(poExamClase).getExamenes().get(i));
            }
            jl_examenes_examenes.setModel(modelo1);
            //System.out.println(ap.getListaClases().get(0).getExamenes().get(0).getPreguntas());
            jd_crear_examen.hide();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jb_add_examenActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try {
            String titulo = pregunta_verdadero.getText();
            if (rb_verdadero.isSelected()) {
                boolean answer = true;
                VerdaderoFalso preg = new VerdaderoFalso(answer, titulo);
                preguntas.add(preg);
            } else if (rb_falso.isSelected()) {
                boolean answer = false;
                VerdaderoFalso preg = new VerdaderoFalso(answer, titulo);
                preguntas.add(preg);
            }
            //System.out.println(preguntas);
            pregunta_verdadero.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try {
            String titulo = pregunta_seleccion.getText();
            String op1 = tf_op1.getText();
            String op2 = tf_op2.getText();
            String op3 = tf_op3.getText();
            String op4 = tf_op4.getText();
            if (rb_a.isSelected()) {
                int answer = 1;
                rb_a.setSelected(false);
                SeleccionMultiple nuevo = new SeleccionMultiple(op1, op2, op3, op4, answer, titulo);
                preguntas.add(nuevo);
            } else if (rb_b.isSelected()) {
                int answer = 2;
                rb_b.setSelected(false);
                SeleccionMultiple nuevo = new SeleccionMultiple(op1, op2, op3, op4, answer, titulo);
                preguntas.add(nuevo);
            } else if (rb_c.isSelected()) {
                int answer = 3;
                rb_c.setSelected(false);
                SeleccionMultiple nuevo = new SeleccionMultiple(op1, op2, op3, op4, answer, titulo);
                preguntas.add(nuevo);
            } else if (rb_d.isSelected()) {
                int answer = 4;
                rb_d.setSelected(false);
                SeleccionMultiple nuevo = new SeleccionMultiple(op1, op2, op3, op4, answer, titulo);
                preguntas.add(nuevo);
            }
            pregunta_seleccion.setText("");
            tf_op1.setText("");
            tf_op2.setText("");
            tf_op3.setText("");
            tf_op4.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jb_crear_examenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crear_examenActionPerformed
        // TODO add your handling code here:
        jd_crear_examen.setModal(true);
        jd_crear_examen.pack();
        jd_crear_examen.setLocationRelativeTo(this);
        jd_crear_examen.setVisible(true);
    }//GEN-LAST:event_jb_crear_examenActionPerformed

    private void jb_realizar_examenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_realizar_examenesActionPerformed
        // TODO add your handling code here:
        try {
            administrarClases ap = new administrarClases("./clases.cbm");
            ap.cargarArchivo();
            if (jl_mis_examenes.getSelectedIndex() >= 0) {
                preguntas.clear();
                contPreg = 0;
                correctas = 0;
                int po = jl_mis_examenes.getSelectedIndex();
                DefaultListModel modelo = (DefaultListModel) jl_mis_examenes.getModel();
                Examen x = (Examen) modelo.getElementAt(po);
                String nombre = x.getTitulo();
                int aux = 0;
                for (int i = 0; i < ap.getListaClases().size(); i++) {
                    for (int j = 0; j < ap.getListaClases().get(i).getExamenes().size(); j++) {
                        if (ap.getListaClases().get(i).getExamenes().get(j).getTitulo().equals(nombre)) {
                            claseExam = i;
                            examExam = j;
                            aux = 1;
                            break;
                        }
                    }
                    if (aux == 1) {
                        break;
                    }
                }
                preguntas.addAll(ap.getListaClases().get(claseExam).getExamenes().get(examExam).getPreguntas());
                //System.out.println(preguntas);
                if (preguntas.get(contPreg) instanceof SeleccionMultiple) {
                    label_pregunta1.setText(preguntas.get(contPreg).getPregunta());
                    opcion_a.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion1());
                    opcion_b.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion2());
                    opcion_c.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion3());
                    opcion_d.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion4());
                    responder_seleccion.setModal(true);
                    responder_seleccion.pack();
                    responder_seleccion.setLocationRelativeTo(this);
                    responder_seleccion.setVisible(true);
                } else if (preguntas.get(contPreg) instanceof VerdaderoFalso) {
                    label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                    responder_verdadero.setModal(true);
                    responder_verdadero.pack();
                    responder_verdadero.setLocationRelativeTo(this);
                    responder_verdadero.setVisible(true);
                }

            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jb_realizar_examenesActionPerformed

    private void jb_alumnos_examenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_alumnos_examenesActionPerformed
        // TODO add your handling code here:
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        boolean found = false;
        DefaultListModel modelo = (DefaultListModel) jl_mis_examenes.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            boolean esta = false;
            for (int j = 0; j < ap.getListaClases().get(i).getAlumnos().size(); j++) {
                if (ap.getListaClases().get(i).getAlumnos().get(j).getUsername().equals(estudianteAsig.getUsername())) {
                    esta = true;
                }
            }
            if (esta) {
                esta = false;
                for (int j = 0; j < ap.getListaClases().get(i).getExamenes().size(); j++) {
                    for (int k = 0; k < ap.getListaClases().get(i).getExamenes().get(j).getExamenesAlumnos().size(); k++) {
                        if (ap.getListaClases().get(i).getExamenes().get(j).getExamenesAlumnos().get(k).getEstudiante().getUsername().equals(estudianteAsig.getUsername())) {
                            found = true;
                        }
                    }
                    Date fecha = new Date();
                    if (found == false && fecha.before(ap.getListaClases().get(i).getExamenes().get(j).getFechaFinal())) {
                        modelo.addElement(ap.getListaClases().get(i).getExamenes().get(j));
                    }
                    found = false;
                }
            }
        }
        jl_mis_examenes.setModel(modelo);

        examenes_alumno_examenes.setModal(true);
        examenes_alumno_examenes.pack();
        examenes_alumno_examenes.setLocationRelativeTo(this);
        examenes_alumno_examenes.setVisible(true);
    }//GEN-LAST:event_jb_alumnos_examenesActionPerformed

    private void jb_next_verdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_next_verdActionPerformed
        // TODO add your handling code here:
        try {
            if (contPreg == preguntas.size() - 1) {
                if (answer_verd.isSelected() && ((VerdaderoFalso) preguntas.get(contPreg)).isOpcion() == true) {
                    correctas += 1;
                    int nota = (correctas * 100) / preguntas.size();
                    ExamenAlumno x = new ExamenAlumno(estudianteAsig, nota);
                    administrarClases ap = new administrarClases("./clases.cbm");
                    ap.cargarArchivo();
                    ap.getListaClases().get(claseExam).getExamenes().get(examExam).getExamenesAlumnos().add(x);
                    ap.escribirArchivo();
                    //System.out.println(ap.getListaClases().get(claseExam).getExamenes().get(examExam).getExamenesAlumnos());
                    reiniciarExamenes();
                    answer_verd.setSelected(false);
                    answer_falso.setSelected(false);
                    responder_verdadero.hide();

                } else if (answer_falso.isSelected() && ((VerdaderoFalso) preguntas.get(contPreg)).isOpcion() == false) {
                    correctas += 1;
                    int nota = (correctas * 100) / preguntas.size();
                    ExamenAlumno x = new ExamenAlumno(estudianteAsig, nota);
                    administrarClases ap = new administrarClases("./clases.cbm");
                    ap.cargarArchivo();
                    ap.getListaClases().get(claseExam).getExamenes().get(examExam).getExamenesAlumnos().add(x);
                    ap.escribirArchivo();
                    //System.out.println(ap.getListaClases().get(claseExam).getExamenes().get(examExam).getExamenesAlumnos());
                    reiniciarExamenes();
                    answer_verd.setSelected(false);
                    answer_falso.setSelected(false);
                    responder_verdadero.hide();
                } else if ((answer_falso.isSelected() && ((VerdaderoFalso) preguntas.get(contPreg)).isOpcion() == true)
                        || (answer_verd.isSelected() && ((VerdaderoFalso) preguntas.get(contPreg)).isOpcion() == false)) {
                    int nota = (correctas * 100) / preguntas.size();
                    ExamenAlumno x = new ExamenAlumno(estudianteAsig, nota);
                    administrarClases ap = new administrarClases("./clases.cbm");
                    ap.cargarArchivo();
                    ap.getListaClases().get(claseExam).getExamenes().get(examExam).getExamenesAlumnos().add(x);
                    ap.escribirArchivo();
                    //System.out.println(ap.getListaClases().get(claseExam).getExamenes().get(examExam).getExamenesAlumnos());
                    reiniciarExamenes();
                    answer_verd.setSelected(false);
                    answer_falso.setSelected(false);
                    responder_verdadero.hide();
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una opcion");
                }
            } else {
                if (answer_verd.isSelected() && ((VerdaderoFalso) preguntas.get(contPreg)).isOpcion() == true) {
                    correctas += 1;
                    contPreg += 1;
                    if (preguntas.get(contPreg) instanceof SeleccionMultiple) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta1.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta1.setText(preguntas.get(contPreg).getPregunta());
                        }
                        opcion_a.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion1());
                        opcion_b.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion2());
                        opcion_c.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion3());
                        opcion_d.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion4());
                        responder_verdadero.hide();
                        responder_seleccion.setModal(true);
                        responder_seleccion.pack();
                        responder_seleccion.setLocationRelativeTo(this);
                        responder_seleccion.setVisible(true);
                    } else if (preguntas.get(contPreg) instanceof VerdaderoFalso) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                        }
                        answer_verd.setSelected(false);
                        answer_falso.setSelected(false);
                        responder_verdadero.hide();
                        responder_verdadero.setModal(true);
                        responder_verdadero.pack();
                        responder_verdadero.setLocationRelativeTo(this);
                        responder_verdadero.setVisible(true);
                    }
                } else if (answer_falso.isSelected() && ((VerdaderoFalso) preguntas.get(contPreg)).isOpcion() == false) {
                    correctas += 1;
                    contPreg += 1;
                    if (preguntas.get(contPreg) instanceof SeleccionMultiple) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta1.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta1.setText(preguntas.get(contPreg).getPregunta());
                        }
                        opcion_a.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion1());
                        opcion_b.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion2());
                        opcion_c.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion3());
                        opcion_d.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion4());
                        responder_verdadero.hide();
                        responder_seleccion.setModal(true);
                        responder_seleccion.pack();
                        responder_seleccion.setLocationRelativeTo(this);
                        responder_seleccion.setVisible(true);
                    } else if (preguntas.get(contPreg) instanceof VerdaderoFalso) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                        }
                        // label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                        answer_verd.setSelected(false);
                        answer_falso.setSelected(false);
                        responder_verdadero.hide();
                        responder_verdadero.setModal(true);
                        responder_verdadero.pack();
                        responder_verdadero.setLocationRelativeTo(this);
                        responder_verdadero.setVisible(true);
                    }
                } else if ((answer_falso.isSelected() && ((VerdaderoFalso) preguntas.get(contPreg)).isOpcion() == true)
                        || (answer_verd.isSelected() && ((VerdaderoFalso) preguntas.get(contPreg)).isOpcion() == false)) {
                    contPreg += 1;
                    if (preguntas.get(contPreg) instanceof SeleccionMultiple) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta1.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta1.setText(preguntas.get(contPreg).getPregunta());
                        }
                        opcion_a.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion1());
                        opcion_b.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion2());
                        opcion_c.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion3());
                        opcion_d.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion4());
                        answer_verd.setSelected(false);
                        answer_falso.setSelected(false);
                        responder_verdadero.hide();
                        responder_seleccion.setModal(true);
                        responder_seleccion.pack();
                        responder_seleccion.setLocationRelativeTo(this);
                        responder_seleccion.setVisible(true);
                    } else if (preguntas.get(contPreg) instanceof VerdaderoFalso) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                        }
                        //label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                        answer_verd.setSelected(false);
                        answer_falso.setSelected(false);
                        responder_verdadero.hide();
                        responder_verdadero.setModal(true);
                        responder_verdadero.pack();
                        responder_verdadero.setLocationRelativeTo(this);
                        responder_verdadero.setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una opcion");
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jb_next_verdActionPerformed

    private void jb_next_seleccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_next_seleccActionPerformed
        // TODO add your handling code here:
        try {
            if (contPreg == preguntas.size() - 1) {
                if (answer_a.isSelected() && ((SeleccionMultiple) preguntas.get(contPreg)).getCorrecta() == 1) {
                    correctas += 1;
                    int nota = (correctas * 100) / preguntas.size();
                    ExamenAlumno x = new ExamenAlumno(estudianteAsig, nota);
                    administrarClases ap = new administrarClases("./clases.cbm");
                    ap.cargarArchivo();
                    ap.getListaClases().get(claseExam).getExamenes().get(examExam).getExamenesAlumnos().add(x);
                    ap.escribirArchivo();
                    reiniciarExamenes();
                    answer_a.setSelected(false);
                    answer_b.setSelected(false);
                    answer_c.setSelected(false);
                    answer_d.setSelected(false);
                    responder_seleccion.hide();
                } else if (answer_b.isSelected() && ((SeleccionMultiple) preguntas.get(contPreg)).getCorrecta() == 2) {
                    correctas += 1;
                    int nota = (correctas * 100) / preguntas.size();
                    ExamenAlumno x = new ExamenAlumno(estudianteAsig, nota);
                    administrarClases ap = new administrarClases("./clases.cbm");
                    ap.cargarArchivo();
                    ap.getListaClases().get(claseExam).getExamenes().get(examExam).getExamenesAlumnos().add(x);
                    ap.escribirArchivo();
                    reiniciarExamenes();
                    answer_a.setSelected(false);
                    answer_b.setSelected(false);
                    answer_c.setSelected(false);
                    answer_d.setSelected(false);
                    responder_seleccion.hide();
                } else if (answer_c.isSelected() && ((SeleccionMultiple) preguntas.get(contPreg)).getCorrecta() == 3) {
                    correctas += 1;
                    int nota = (correctas * 100) / preguntas.size();
                    ExamenAlumno x = new ExamenAlumno(estudianteAsig, nota);
                    administrarClases ap = new administrarClases("./clases.cbm");
                    ap.cargarArchivo();
                    ap.getListaClases().get(claseExam).getExamenes().get(examExam).getExamenesAlumnos().add(x);
                    ap.escribirArchivo();
                    reiniciarExamenes();
                    answer_a.setSelected(false);
                    answer_b.setSelected(false);
                    answer_c.setSelected(false);
                    answer_d.setSelected(false);
                    responder_seleccion.hide();
                } else if (answer_d.isSelected() && ((SeleccionMultiple) preguntas.get(contPreg)).getCorrecta() == 4) {
                    correctas += 1;
                    int nota = (correctas * 100) / preguntas.size();
                    ExamenAlumno x = new ExamenAlumno(estudianteAsig, nota);
                    administrarClases ap = new administrarClases("./clases.cbm");
                    ap.cargarArchivo();
                    ap.getListaClases().get(claseExam).getExamenes().get(examExam).getExamenesAlumnos().add(x);
                    ap.escribirArchivo();
                    reiniciarExamenes();
                    answer_a.setSelected(false);
                    answer_b.setSelected(false);
                    answer_c.setSelected(false);
                    answer_d.setSelected(false);
                    responder_seleccion.hide();
                } else if (answer_a.isSelected() == false && answer_b.isSelected() == false && answer_c.isSelected() == false && answer_d.isSelected() == false) {
                    int nota = (correctas * 100) / preguntas.size();
                    ExamenAlumno x = new ExamenAlumno(estudianteAsig, nota);
                    administrarClases ap = new administrarClases("./clases.cbm");
                    ap.cargarArchivo();
                    ap.getListaClases().get(claseExam).getExamenes().get(examExam).getExamenesAlumnos().add(x);
                    ap.escribirArchivo();
                    reiniciarExamenes();
                    answer_a.setSelected(false);
                    answer_b.setSelected(false);
                    answer_c.setSelected(false);
                    answer_d.setSelected(false);
                    responder_seleccion.hide();
                } else {
                    JOptionPane.showMessageDialog(null, "Seleccione una opcion");
                }
            } else {
                if (answer_a.isSelected() && ((SeleccionMultiple) preguntas.get(contPreg)).getCorrecta() == 1) {
                    correctas += 1;
                    contPreg += 1;
                    if (preguntas.get(contPreg) instanceof SeleccionMultiple) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta1.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta1.setText(preguntas.get(contPreg).getPregunta());
                        }
                        opcion_a.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion1());
                        opcion_b.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion2());
                        opcion_c.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion3());
                        opcion_d.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion4());
                        responder_seleccion.hide();
                        responder_seleccion.setModal(true);
                        responder_seleccion.pack();
                        responder_seleccion.setLocationRelativeTo(this);
                        responder_seleccion.setVisible(true);
                    } else if (preguntas.get(contPreg) instanceof VerdaderoFalso) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                        }
                        answer_verd.setSelected(false);
                        answer_falso.setSelected(false);
                        responder_seleccion.hide();
                        responder_verdadero.setModal(true);
                        responder_verdadero.pack();
                        responder_verdadero.setLocationRelativeTo(this);
                        responder_verdadero.setVisible(true);
                    }
                } else if (answer_b.isSelected() && ((SeleccionMultiple) preguntas.get(contPreg)).getCorrecta() == 2) {
                    correctas += 1;
                    contPreg += 1;
                    if (preguntas.get(contPreg) instanceof SeleccionMultiple) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta1.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta1.setText(preguntas.get(contPreg).getPregunta());
                        }
                        opcion_a.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion1());
                        opcion_b.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion2());
                        opcion_c.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion3());
                        opcion_d.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion4());
                        responder_seleccion.hide();
                        responder_seleccion.setModal(true);
                        responder_seleccion.pack();
                        responder_seleccion.setLocationRelativeTo(this);
                        responder_seleccion.setVisible(true);
                    } else if (preguntas.get(contPreg) instanceof VerdaderoFalso) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                        }
                        answer_verd.setSelected(false);
                        answer_falso.setSelected(false);
                        responder_seleccion.hide();
                        responder_verdadero.setModal(true);
                        responder_verdadero.pack();
                        responder_verdadero.setLocationRelativeTo(this);
                        responder_verdadero.setVisible(true);
                    }
                } else if (answer_c.isSelected() && ((SeleccionMultiple) preguntas.get(contPreg)).getCorrecta() == 3) {
                    correctas += 1;
                    contPreg += 1;
                    if (preguntas.get(contPreg) instanceof SeleccionMultiple) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta1.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta1.setText(preguntas.get(contPreg).getPregunta());
                        }
                        opcion_a.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion1());
                        opcion_b.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion2());
                        opcion_c.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion3());
                        opcion_d.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion4());
                        responder_seleccion.hide();
                        responder_seleccion.setModal(true);
                        responder_seleccion.pack();
                        responder_seleccion.setLocationRelativeTo(this);
                        responder_seleccion.setVisible(true);
                    } else if (preguntas.get(contPreg) instanceof VerdaderoFalso) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                        }
                        answer_verd.setSelected(false);
                        answer_falso.setSelected(false);
                        responder_seleccion.hide();
                        responder_verdadero.setModal(true);
                        responder_verdadero.pack();
                        responder_verdadero.setLocationRelativeTo(this);
                        responder_verdadero.setVisible(true);
                    }
                } else if (answer_d.isSelected() && ((SeleccionMultiple) preguntas.get(contPreg)).getCorrecta() == 4) {
                    correctas += 1;
                    contPreg += 1;
                    if (preguntas.get(contPreg) instanceof SeleccionMultiple) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta1.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta1.setText(preguntas.get(contPreg).getPregunta());
                        }
                        opcion_a.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion1());
                        opcion_b.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion2());
                        opcion_c.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion3());
                        opcion_d.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion4());
                        responder_seleccion.hide();
                        responder_seleccion.setModal(true);
                        responder_seleccion.pack();
                        responder_seleccion.setLocationRelativeTo(this);
                        responder_seleccion.setVisible(true);
                    } else if (preguntas.get(contPreg) instanceof VerdaderoFalso) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                        }
                        answer_verd.setSelected(false);
                        answer_falso.setSelected(false);
                        responder_seleccion.hide();
                        responder_verdadero.setModal(true);
                        responder_verdadero.pack();
                        responder_verdadero.setLocationRelativeTo(this);
                        responder_verdadero.setVisible(true);
                    }
                } else if (answer_a.isSelected() == false && answer_b.isSelected() == false && answer_c.isSelected() == false && answer_d.isSelected() == false) {
                    contPreg += 1;
                    if (preguntas.get(contPreg) instanceof SeleccionMultiple) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta1.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta1.setText(preguntas.get(contPreg).getPregunta());
                        }
                        opcion_a.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion1());
                        opcion_b.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion2());
                        opcion_c.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion3());
                        opcion_d.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion4());
                        responder_seleccion.hide();
                        responder_seleccion.setModal(true);
                        responder_seleccion.pack();
                        responder_seleccion.setLocationRelativeTo(this);
                        responder_seleccion.setVisible(true);
                    } else if (preguntas.get(contPreg) instanceof VerdaderoFalso) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                        }
                        answer_verd.setSelected(false);
                        answer_falso.setSelected(false);
                        responder_seleccion.hide();
                        responder_verdadero.setModal(true);
                        responder_verdadero.pack();
                        responder_verdadero.setLocationRelativeTo(this);
                        responder_verdadero.setVisible(true);
                    }
                } else {
                    contPreg += 1;
                    if (preguntas.get(contPreg) instanceof SeleccionMultiple) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta1.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta1.setText(preguntas.get(contPreg).getPregunta());
                        }
                        opcion_a.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion1());
                        opcion_b.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion2());
                        opcion_c.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion3());
                        opcion_d.setText(((SeleccionMultiple) preguntas.get(contPreg)).getOpcion4());
                        responder_seleccion.hide();
                        responder_seleccion.setModal(true);
                        responder_seleccion.pack();
                        responder_seleccion.setLocationRelativeTo(this);
                        responder_seleccion.setVisible(true);
                    } else if (preguntas.get(contPreg) instanceof VerdaderoFalso) {
                        if (contPreg == preguntas.size() - 1) {
                            label_pregunta.setText("ULTIMA PREGUNTA:" + preguntas.get(contPreg).getPregunta());
                        } else {
                            label_pregunta.setText(preguntas.get(contPreg).getPregunta());
                        }
                        answer_verd.setSelected(false);
                        answer_falso.setSelected(false);
                        responder_seleccion.hide();
                        responder_verdadero.setModal(true);
                        responder_verdadero.pack();
                        responder_verdadero.setLocationRelativeTo(this);
                        responder_verdadero.setVisible(true);
                    }
                }
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_jb_next_seleccActionPerformed

    public void reiniciarExamenes() {
        administrarClases ap = new administrarClases("./clases.cbm");
        ap.cargarArchivo();
        boolean found = false;
        DefaultListModel modelo = (DefaultListModel) jl_mis_examenes.getModel();
        modelo.removeAllElements();
        for (int i = 0; i < ap.getListaClases().size(); i++) {
            boolean esta = false;
            for (int j = 0; j < ap.getListaClases().get(i).getAlumnos().size(); j++) {
                if (ap.getListaClases().get(i).getAlumnos().get(j).getUsername().equals(estudianteAsig.getUsername())) {
                    esta = true;
                }
            }
            if (esta) {
                esta = false;
                for (int j = 0; j < ap.getListaClases().get(i).getExamenes().size(); j++) {
                    for (int k = 0; k < ap.getListaClases().get(i).getExamenes().get(j).getExamenesAlumnos().size(); k++) {
                        if (ap.getListaClases().get(i).getExamenes().get(j).getExamenesAlumnos().get(k).getEstudiante().getUsername().equals(estudianteAsig.getUsername())) {
                            found = true;
                        }
                    }
                    Date fecha = new Date();
                    if (found == false && fecha.before(ap.getListaClases().get(i).getExamenes().get(j).getFechaFinal())) {
                        modelo.addElement(ap.getListaClases().get(i).getExamenes().get(j));
                    }
                    found = false;
                }
            }
        }
        jl_mis_examenes.setModel(modelo);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Descripcion;
    private javax.swing.JButton alumnos_agregar;
    private javax.swing.JButton alumnos_modificar;
    private javax.swing.JRadioButton answer_a;
    private javax.swing.JRadioButton answer_b;
    private javax.swing.JRadioButton answer_c;
    private javax.swing.JRadioButton answer_d;
    private javax.swing.JRadioButton answer_falso;
    private javax.swing.JRadioButton answer_verd;
    private javax.swing.JButton asignar_alumno;
    private javax.swing.JButton asignar_maestro;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JMenuItem cerrar_sesion_alum;
    private javax.swing.JMenuItem cerrar_sesion_maestro;
    private javax.swing.JMenuItem cerrar_sesion_registro;
    private javax.swing.JMenuItem cerrar_sistema_alum;
    private javax.swing.JMenuItem cerrar_sistema_maesrto;
    private javax.swing.JMenuItem cerrar_sistema_registro;
    private javax.swing.JButton clases_agregar;
    private javax.swing.JButton clases_modificar;
    private javax.swing.JMenuItem eliminar_alumno;
    private javax.swing.JMenuItem eliminar_clase;
    private javax.swing.JMenuItem eliminar_examen;
    private javax.swing.JMenuItem eliminar_maestro;
    private javax.swing.JMenuItem eliminar_registro;
    private javax.swing.JFormattedTextField examen_duracion;
    private com.toedter.calendar.JDateChooser examen_fecha;
    private javax.swing.JFormattedTextField examen_hora;
    private javax.swing.JTextField examen_titulo;
    private javax.swing.JDialog examenes_alumno_examenes;
    private javax.swing.JDialog examenes_maestro_clases;
    private javax.swing.JDialog examenes_maestro_examenes;
    private javax.swing.JButton examinar_equipo;
    private javax.swing.JFormattedTextField ftf_nota;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane26;
    private javax.swing.JScrollPane jScrollPane27;
    private javax.swing.JScrollPane jScrollPane28;
    private javax.swing.JScrollPane jScrollPane29;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JButton jb_abiriForo;
    private javax.swing.JButton jb_abrirForo;
    private javax.swing.JButton jb_abrir_archivo_est;
    private javax.swing.JButton jb_abrir_clases;
    private javax.swing.JButton jb_abrir_examenes;
    private javax.swing.JButton jb_abrir_tareas;
    private javax.swing.JButton jb_abrir_tareasdeAlumnos;
    private javax.swing.JButton jb_add_examen;
    private javax.swing.JButton jb_alumno_ingresarAporte;
    private javax.swing.JButton jb_alumnos_examenes;
    private javax.swing.JButton jb_alumnos_foros;
    private javax.swing.JButton jb_alumnos_foros1;
    private javax.swing.JButton jb_alumnos_notas;
    private javax.swing.JButton jb_alumnos_tareas;
    private javax.swing.JButton jb_asginar_foro;
    private javax.swing.JButton jb_asginat_tarea;
    private javax.swing.JButton jb_asignar_alumnos;
    private javax.swing.JButton jb_asignar_maestro;
    private javax.swing.JButton jb_asignar_tarea;
    private javax.swing.JButton jb_crear_alumno;
    private javax.swing.JButton jb_crear_clases;
    private javax.swing.JButton jb_crear_examen;
    private javax.swing.JButton jb_crear_foro;
    private javax.swing.JButton jb_crear_maestro;
    private javax.swing.JButton jb_crear_registro;
    private javax.swing.JButton jb_entregarMiTarea;
    private javax.swing.JButton jb_entregar_tarea;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_maestros_examenes1;
    private javax.swing.JButton jb_maestros_notas1;
    private javax.swing.JButton jb_maestros_tareas1;
    private javax.swing.JButton jb_modificar_alumno;
    private javax.swing.JButton jb_modificar_clases;
    private javax.swing.JButton jb_modificar_maestro;
    private javax.swing.JButton jb_modificar_registro;
    private javax.swing.JButton jb_next_selecc;
    private javax.swing.JButton jb_next_verd;
    private javax.swing.JButton jb_realizar_examenes;
    private javax.swing.JDialog jd_abrir_tarea;
    private javax.swing.JDialog jd_alumno_foro;
    private javax.swing.JDialog jd_asignar_alumno;
    private javax.swing.JDialog jd_asignar_maestro;
    private javax.swing.JDialog jd_asignar_tarea;
    private javax.swing.JDialog jd_crearForo;
    private javax.swing.JDialog jd_crear_alumno;
    private javax.swing.JDialog jd_crear_clase;
    private javax.swing.JDialog jd_crear_examen;
    private javax.swing.JDialog jd_crear_maestro;
    private javax.swing.JDialog jd_crear_registro;
    private javax.swing.JDialog jd_entregar_tarea;
    private javax.swing.JDialog jd_listar_alumnos;
    private javax.swing.JDialog jd_listar_clase;
    private javax.swing.JDialog jd_listar_maestros;
    private javax.swing.JDialog jd_listar_registros;
    private javax.swing.JDialog jd_modificar_alumno;
    private javax.swing.JDialog jd_modificar_clase;
    private javax.swing.JDialog jd_modificar_maestro;
    private javax.swing.JDialog jd_modificar_registro;
    private javax.swing.JDialog jd_verClasesForos_maestros;
    private javax.swing.JDialog jd_verClases_maestros;
    private javax.swing.JDialog jd_verClases_revisarTareas;
    private javax.swing.JDialog jd_verForosDeClase;
    private javax.swing.JDialog jd_verForos_Maestro;
    private javax.swing.JDialog jd_verMisForos;
    private javax.swing.JDialog jd_verTareas_alumnos;
    private javax.swing.JDialog jd_verTareas_revisarTareas;
    private javax.swing.JDialog jd_verTareasdeAlumnos_revisarTareas;
    private javax.swing.JFrame jf_alumno;
    private javax.swing.JFrame jf_maestros;
    private javax.swing.JFrame jf_registro;
    private javax.swing.JList<String> jl_alumnos;
    private javax.swing.JList<String> jl_asignar_clases;
    private javax.swing.JList<String> jl_asignarforos_clases;
    private javax.swing.JList<String> jl_clases;
    private javax.swing.JList<String> jl_clases_revisar;
    private javax.swing.JList<String> jl_examenes_clases;
    private javax.swing.JList<String> jl_examenes_examenes;
    private javax.swing.JList<String> jl_foros;
    private javax.swing.JList<String> jl_intentosA_revisar;
    private javax.swing.JList<String> jl_maestros;
    private javax.swing.JList<String> jl_mis_examenes;
    private javax.swing.JList<String> jl_registros;
    private javax.swing.JList<String> jl_tareas_revisar;
    private javax.swing.JList<String> jl_verAlumnos;
    private javax.swing.JList<String> jl_verClases;
    private javax.swing.JList<String> jl_verClasesA;
    private javax.swing.JList<String> jl_verMaestros;
    private javax.swing.JList<String> jl_verMisForos;
    private javax.swing.JList<String> jl_verMisTareas;
    private javax.swing.JTable jt_alumnos;
    private javax.swing.JTable jt_maestros;
    private javax.swing.JLabel label_pregunta;
    private javax.swing.JLabel label_pregunta1;
    private javax.swing.JLabel label_tarea;
    private javax.swing.JButton maestro_agregar;
    private javax.swing.JButton maestro_modificar;
    private javax.swing.JMenuItem modificar_alumno;
    private javax.swing.JMenuItem modificar_clase;
    private javax.swing.JMenuItem modificar_maestro;
    private javax.swing.JMenuItem modificar_registro;
    private javax.swing.JDialog notas_estudiante;
    private javax.swing.JDialog notas_maestro;
    private javax.swing.JLabel opcion_a;
    private javax.swing.JLabel opcion_b;
    private javax.swing.JLabel opcion_c;
    private javax.swing.JLabel opcion_d;
    private javax.swing.JPopupMenu popup_alumno;
    private javax.swing.JPopupMenu popup_clase;
    private javax.swing.JPopupMenu popup_examenes;
    private javax.swing.JPopupMenu popup_maestro;
    private javax.swing.JPopupMenu popup_registro;
    private javax.swing.JTextField pregunta_seleccion;
    private javax.swing.JTextField pregunta_verdadero;
    private javax.swing.JRadioButton rb_a;
    private javax.swing.JRadioButton rb_b;
    private javax.swing.JRadioButton rb_c;
    private javax.swing.JRadioButton rb_d;
    private javax.swing.JRadioButton rb_falso;
    private javax.swing.JRadioButton rb_verdadero;
    private javax.swing.JButton registro_agregar;
    private javax.swing.JButton registro_modificar;
    private javax.swing.JDialog responder_seleccion;
    private javax.swing.JDialog responder_verdadero;
    private javax.swing.ButtonGroup seleccion_multiple;
    private javax.swing.JTextArea ta_alumno_foroDesc;
    private javax.swing.JTextArea ta_alumno_foroDesc1;
    private javax.swing.JTextArea ta_alumnos_aportes;
    private javax.swing.JTextArea ta_alumnos_aportes1;
    private javax.swing.JTextArea ta_alumnos_miAporte;
    private javax.swing.JTextArea tarea_alum_desc;
    private javax.swing.JTextField tarea_alum_titulo;
    private com.toedter.calendar.JDateChooser tarea_date;
    private javax.swing.JTextArea tarea_descripcion;
    private javax.swing.JTextField tarea_hora;
    private javax.swing.JTextField tarea_titulo;
    private javax.swing.JTextField tf_alum_revision;
    private javax.swing.JTextField tf_alumno_carrera;
    private javax.swing.JTextField tf_alumno_carrera_m;
    private javax.swing.JFormattedTextField tf_alumno_clases;
    private javax.swing.JFormattedTextField tf_alumno_clases_m;
    private javax.swing.JFormattedTextField tf_alumno_cuenta;
    private javax.swing.JFormattedTextField tf_alumno_cuenta_m;
    private javax.swing.JTextField tf_alumno_foroTitulo;
    private javax.swing.JTextField tf_alumno_foroTitulo1;
    private javax.swing.JTextField tf_alumno_nombre;
    private javax.swing.JTextField tf_alumno_nombre_m;
    private javax.swing.JTextField tf_alumno_pass;
    private javax.swing.JTextField tf_alumno_pass_m;
    private javax.swing.JTextField tf_alumno_rol;
    private javax.swing.JTextField tf_alumno_rol_m;
    private javax.swing.JTextField tf_alumno_user;
    private javax.swing.JTextField tf_alumno_user_m;
    private javax.swing.JSpinner tf_clase_hora;
    private javax.swing.JSpinner tf_clase_hora_m;
    private javax.swing.JFormattedTextField tf_clase_id;
    private javax.swing.JFormattedTextField tf_clase_id_m;
    private javax.swing.JTextField tf_clase_nombre;
    private javax.swing.JTextField tf_clase_nombre_m;
    private javax.swing.JSpinner tf_clase_periodo;
    private javax.swing.JSpinner tf_clase_periodo_m;
    private javax.swing.JSpinner tf_clase_semestre;
    private javax.swing.JSpinner tf_clase_semestre_m;
    private javax.swing.JSpinner tf_clase_unidades;
    private javax.swing.JSpinner tf_clase_unidades_m;
    private com.toedter.calendar.JYearChooser tf_clase_year;
    private com.toedter.calendar.JYearChooser tf_clase_year_m;
    private javax.swing.JTextArea tf_crearForo_desc;
    private javax.swing.JTextField tf_crearForo_tit;
    private javax.swing.JFormattedTextField tf_maestro_id;
    private javax.swing.JFormattedTextField tf_maestro_id_m;
    private javax.swing.JTextField tf_maestro_nombre;
    private javax.swing.JTextField tf_maestro_nombre_m;
    private javax.swing.JTextField tf_maestro_pass;
    private javax.swing.JTextField tf_maestro_pass_m;
    private javax.swing.JTextField tf_maestro_profesion;
    private javax.swing.JTextField tf_maestro_profesion_m;
    private javax.swing.JTextField tf_maestro_rol;
    private javax.swing.JTextField tf_maestro_rol_m;
    private javax.swing.JFormattedTextField tf_maestro_sueldo;
    private javax.swing.JFormattedTextField tf_maestro_sueldo_m;
    private javax.swing.JTextField tf_maestro_user;
    private javax.swing.JTextField tf_maestro_user_m;
    private javax.swing.JTextField tf_op1;
    private javax.swing.JTextField tf_op2;
    private javax.swing.JTextField tf_op3;
    private javax.swing.JTextField tf_op4;
    private javax.swing.JPasswordField tf_pass_login;
    private javax.swing.JTextField tf_registro_pass;
    private javax.swing.JTextField tf_registro_pass_m;
    private javax.swing.JTextField tf_registro_user;
    private javax.swing.JTextField tf_registro_user_m;
    private javax.swing.JTextField tf_user_login;
    private javax.swing.ButtonGroup verdadero_falso;
    // End of variables declaration//GEN-END:variables
    Alumno estudianteAsig;
    int indexEstudiante;
    Maestro maestroAsig;
    int indexMaestro;
    // para tareas
    int poClase;
    int poClaseE;
    int poTareaE;
    File archivoSeleccionado;

    int poClaseT2;
    int poTarea;
    int poIntentoAlumno;
    // para foros
    int poClaseF;
    int poForoF;
    int poClaseFM;
    int poForoFM;
    // para examenes
    int poExamClase;
    int poElimMod;
    int claseExam;
    int examExam;
    ArrayList<Pregunta> preguntas = new ArrayList();
    int contPreg;
    int correctas;
}
