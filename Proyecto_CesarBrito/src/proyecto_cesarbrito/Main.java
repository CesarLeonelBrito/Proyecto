package proyecto_cesarbrito;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        registros.add(new Registro("cesar", "1234"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jf_registro = new javax.swing.JFrame();
        jToolBar1 = new javax.swing.JToolBar();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        registro_agregar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        registro_modificar = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        maestro_agregar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        maestro_modificar = new javax.swing.JButton();
        jToolBar3 = new javax.swing.JToolBar();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        alumnos_agregar = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        alumnos_modificar = new javax.swing.JButton();
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
        jLabel41 = new javax.swing.JLabel();
        jd_modificar_registro = new javax.swing.JDialog();
        jLabel24 = new javax.swing.JLabel();
        tf_registro_user_m = new javax.swing.JTextField();
        tf_registro_pass_m = new javax.swing.JTextField();
        jb_modificar_registro = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
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
        jLabel45 = new javax.swing.JLabel();
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
        jd_listar_registros = new javax.swing.JDialog();
        jScrollPane5 = new javax.swing.JScrollPane();
        jl_registros = new javax.swing.JList<>();
        jLabel47 = new javax.swing.JLabel();
        jd_listar_alumnos = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_alumnos = new javax.swing.JList<>();
        jLabel48 = new javax.swing.JLabel();
        jd_listar_maestros = new javax.swing.JDialog();
        jScrollPane3 = new javax.swing.JScrollPane();
        jl_maestros = new javax.swing.JList<>();
        jLabel49 = new javax.swing.JLabel();
        popup_registro = new javax.swing.JPopupMenu();
        eliminar_registro = new javax.swing.JMenuItem();
        modificar_registro = new javax.swing.JMenuItem();
        popup_alumno = new javax.swing.JPopupMenu();
        eliminar_alumno = new javax.swing.JMenuItem();
        modificar_alumno = new javax.swing.JMenuItem();
        popup_maestro = new javax.swing.JPopupMenu();
        eliminar_maestro = new javax.swing.JMenuItem();
        modificar_maestro = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_user_login = new javax.swing.JTextField();
        jb_login = new javax.swing.JButton();
        tf_pass_login = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        jf_registro.setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        jf_registro.setTitle("Registro");
        jf_registro.setResizable(false);

        jToolBar1.setRollover(true);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/admin_icono.png"))); // NOI18N
        jLabel5.setText("Registro");
        jToolBar1.add(jLabel5);
        jToolBar1.add(jSeparator1);

        registro_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_usuario.png"))); // NOI18N
        registro_agregar.setFocusable(false);
        registro_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registro_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registro_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_agregarActionPerformed(evt);
            }
        });
        jToolBar1.add(registro_agregar);
        jToolBar1.add(jSeparator4);

        registro_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-editar.png"))); // NOI18N
        registro_modificar.setFocusable(false);
        registro_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registro_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        registro_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registro_modificarActionPerformed(evt);
            }
        });
        jToolBar1.add(registro_modificar);

        jToolBar2.setRollover(true);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/maestro_icono.png"))); // NOI18N
        jLabel6.setText("Maestros");
        jToolBar2.add(jLabel6);
        jToolBar2.add(jSeparator2);

        maestro_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_usuario.png"))); // NOI18N
        maestro_agregar.setFocusable(false);
        maestro_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        maestro_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        maestro_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maestro_agregarActionPerformed(evt);
            }
        });
        jToolBar2.add(maestro_agregar);
        jToolBar2.add(jSeparator5);

        maestro_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-editar.png"))); // NOI18N
        maestro_modificar.setFocusable(false);
        maestro_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        maestro_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        maestro_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maestro_modificarActionPerformed(evt);
            }
        });
        jToolBar2.add(maestro_modificar);

        jToolBar3.setRollover(true);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/estudiante_icono.png"))); // NOI18N
        jLabel7.setText("Alumnos");
        jToolBar3.add(jLabel7);
        jToolBar3.add(jSeparator3);

        alumnos_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/agregar_usuario.png"))); // NOI18N
        alumnos_agregar.setFocusable(false);
        alumnos_agregar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        alumnos_agregar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alumnos_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_agregarActionPerformed(evt);
            }
        });
        jToolBar3.add(alumnos_agregar);
        jToolBar3.add(jSeparator6);

        alumnos_modificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/boton-editar.png"))); // NOI18N
        alumnos_modificar.setFocusable(false);
        alumnos_modificar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        alumnos_modificar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        alumnos_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnos_modificarActionPerformed(evt);
            }
        });
        jToolBar3.add(alumnos_modificar);

        jMenu1.setText("File");

        cerrar_sesion_registro.setText("Cerrar sesión");
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

        javax.swing.GroupLayout jf_registroLayout = new javax.swing.GroupLayout(jf_registro.getContentPane());
        jf_registro.getContentPane().setLayout(jf_registroLayout);
        jf_registroLayout.setHorizontalGroup(
            jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_registroLayout.createSequentialGroup()
                .addGroup(jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 352, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 699, Short.MAX_VALUE))
        );
        jf_registroLayout.setVerticalGroup(
            jf_registroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jf_registroLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jToolBar3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(418, Short.MAX_VALUE))
        );

        jd_crear_registro.setIconImage(null);
        jd_crear_registro.setPreferredSize(new java.awt.Dimension(706, 538));
        jd_crear_registro.setSize(new java.awt.Dimension(706, 538));
        jd_crear_registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setBackground(new java.awt.Color(0, 0, 0));
        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Usuario:");
        jd_crear_registro.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 96, -1, -1));

        jLabel23.setBackground(new java.awt.Color(0, 0, 0));
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Contraseña:");
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

        jLabel41.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Desktop\\9f1ff92dfba0ee46bcb23d4cd219e9d7.jpg")); // NOI18N
        jd_crear_registro.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_modificar_registro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setForeground(new java.awt.Color(0, 0, 0));
        jLabel24.setText("Contraseña:");
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

        jLabel42.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Desktop\\9f1ff92dfba0ee46bcb23d4cd219e9d7.jpg")); // NOI18N
        jd_modificar_registro.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_crear_maestro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setForeground(new java.awt.Color(0, 0, 0));
        jLabel26.setText("Usuario:");
        jd_crear_maestro.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 64, -1, -1));

        jLabel27.setForeground(new java.awt.Color(0, 0, 0));
        jLabel27.setText("Contraseña:");
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

        jLabel43.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Desktop\\9f1ff92dfba0ee46bcb23d4cd219e9d7.jpg")); // NOI18N
        jd_crear_maestro.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

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
        jLabel34.setText("Contraseña:");
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

        jLabel44.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Desktop\\9f1ff92dfba0ee46bcb23d4cd219e9d7.jpg")); // NOI18N
        jd_modificar_maestro.getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_crear_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Usuario:");
        jd_crear_alumno.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 64, -1, -1));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contraseña:");
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

        jLabel45.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Desktop\\9f1ff92dfba0ee46bcb23d4cd219e9d7.jpg")); // NOI18N
        jd_crear_alumno.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_modificar_alumno.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Usuario:");
        jd_modificar_alumno.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 64, -1, -1));

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Contraseña:");
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

        jLabel46.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Desktop\\9f1ff92dfba0ee46bcb23d4cd219e9d7.jpg")); // NOI18N
        jd_modificar_alumno.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 540));

        jd_listar_registros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_registros.setModel(new DefaultListModel());
        jl_registros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_registrosMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jl_registros);

        jd_listar_registros.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 419, 485));

        jLabel47.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Desktop\\9f1ff92dfba0ee46bcb23d4cd219e9d7.jpg")); // NOI18N
        jd_listar_registros.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jd_listar_alumnos.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_alumnos.setModel(new DefaultListModel());
        jl_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_alumnosMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jl_alumnos);

        jd_listar_alumnos.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 419, 485));

        jLabel48.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Desktop\\9f1ff92dfba0ee46bcb23d4cd219e9d7.jpg")); // NOI18N
        jd_listar_alumnos.getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

        jd_listar_maestros.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jl_maestros.setModel(new DefaultListModel());
        jl_maestros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jl_maestrosMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jl_maestros);

        jd_listar_maestros.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 419, 485));

        jLabel49.setIcon(new javax.swing.ImageIcon("C:\\Users\\cesar\\Desktop\\9f1ff92dfba0ee46bcb23d4cd219e9d7.jpg")); // NOI18N
        jd_listar_maestros.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 640));

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LogIn");
        setMinimumSize(new java.awt.Dimension(636, 711));
        setPreferredSize(new java.awt.Dimension(551, 619));
        setResizable(false);
        setSize(new java.awt.Dimension(551, 619));
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/user_icon.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 80, 128, 128);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 350, 110, 30);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Usuario:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 230, 80, 30);

        tf_user_login.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf_user_login);
        tf_user_login.setBounds(110, 280, 410, 40);

        jb_login.setBackground(new java.awt.Color(255, 255, 255));
        jb_login.setForeground(new java.awt.Color(255, 255, 255));
        jb_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/login_button.png"))); // NOI18N
        jb_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_loginActionPerformed(evt);
            }
        });
        getContentPane().add(jb_login);
        jb_login.setBounds(280, 490, 62, 50);

        tf_pass_login.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(tf_pass_login);
        tf_pass_login.setBounds(110, 420, 410, 40);

        jLabel4.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://images.unsplash.com/photo-1540946646613-e038c58270fb?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxleHBsb3JlLWZlZWR8MXx8fGVufDB8fHx8&w=1000&q=80")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 630, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_loginActionPerformed
        // TODO add your handling code here:
        try {
            String user = tf_user_login.getText();
            String pass = tf_pass_login.getText();
            boolean found = false;
            for (int i = 0; i < registros.size(); i++) {
                if (registros.get(i).getUsername().equals(user) && registros.get(i).getPassword().equals(pass)) {
                    jf_registro.pack();
                    jf_registro.setLocationRelativeTo(this);
                    jf_registro.setVisible(true);
                    this.hide();
                    found = true;
                    tf_user_login.setText("");
                    tf_pass_login.setText("");
                }
            }
            for (int i = 0; i < maestros.size(); i++) {
                if (maestros.get(i).getUsername().equals(user) && maestros.get(i).getPassword().equals(pass)) {

                    found = true;
                }
            }
            for (int i = 0; i < alumnos.size(); i++) {
                if (alumnos.get(i).getUsername().equals(user) && alumnos.get(i).getPassword().equals(pass)) {

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
        for (int i = 0; i < registros.size(); i++) {
            modelo.addElement(registros.get(i));
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
        for (int i = 0; i < maestros.size(); i++) {
            modelo.addElement(maestros.get(i));
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
        for (int i = 0; i < alumnos.size(); i++) {
            modelo.addElement(alumnos.get(i));
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
            registros.add(new Registro(username, password));
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
            maestros.add(new Maestro(nombre, username, password, profesion, rol, id, sueldo));
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
            alumnos.add(new Alumno(username, password, nombre, carrers, rol, cuenta, clasesCursadas));
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
            registros.remove(po);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_registroActionPerformed

    private void modificar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_registroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_registros.getSelectedIndex();
            Registro x = registros.get(po);
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
            String username = tf_registro_user_m.getText();
            String password = tf_registro_pass_m.getText();
            registros.get(po).setPassword(password);
            registros.get(po).setUsername(username);
            DefaultListModel modelo = (DefaultListModel) jl_registros.getModel();
            modelo.set(po, registros.get(po));
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
            alumnos.remove(po);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_alumnoActionPerformed

    private void modificar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_alumnoActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_alumnos.getSelectedIndex();
            Alumno x = alumnos.get(po);
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
            String username = tf_alumno_user_m.getText();
            String password = tf_alumno_pass_m.getText();
            String nombre = tf_alumno_nombre_m.getText();
            String carrera = tf_alumno_carrera_m.getText();
            String rol = tf_alumno_rol_m.getText();
            int cuenta = Integer.parseInt(tf_alumno_cuenta_m.getText());
            int clasesCursadas = Integer.parseInt(tf_alumno_clases_m.getText());
            alumnos.get(po).setUsername(username);
            alumnos.get(po).setPassword(password);
            alumnos.get(po).setNombre(nombre);
            alumnos.get(po).setCarrera(carrera);
            alumnos.get(po).setRol(rol);
            alumnos.get(po).setCuenta(cuenta);
            alumnos.get(po).setClasesCursadas(clasesCursadas);
            DefaultListModel modelo = (DefaultListModel) jl_alumnos.getModel();
            modelo.set(po, alumnos.get(po));
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
            maestros.remove(po);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_eliminar_maestroActionPerformed

    private void modificar_maestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_maestroActionPerformed
        // TODO add your handling code here:
        try {
            int po = jl_maestros.getSelectedIndex();
            Maestro x = maestros.get(po);
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
            String username = tf_maestro_user_m.getText();
            String password = tf_maestro_pass_m.getText();
            String nombre = tf_maestro_nombre_m.getText();
            String profesion = tf_maestro_profesion_m.getText();
            String rol = tf_maestro_rol_m.getText();
            int id = Integer.parseInt(tf_maestro_id_m.getText());
            double sueldo = Double.parseDouble(tf_maestro_sueldo_m.getText());
            maestros.get(po).setUsername(username);
            maestros.get(po).setPassword(password);
            maestros.get(po).setNombre(nombre);
            maestros.get(po).setProfesion(profesion);
            maestros.get(po).setRol(rol);
            maestros.get(po).setId(id);
            maestros.get(po).setSueldo(sueldo);
            DefaultListModel modelo = (DefaultListModel) jl_maestros.getModel();
            modelo.set(po, maestros.get(po));
            jl_maestros.setModel(modelo);
            jd_modificar_maestro.hide();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "OCURRIO UN ERROR");
        }
    }//GEN-LAST:event_jb_modificar_maestroActionPerformed

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
    private javax.swing.JButton alumnos_agregar;
    private javax.swing.JButton alumnos_modificar;
    private javax.swing.JMenuItem cerrar_sesion_registro;
    private javax.swing.JMenuItem cerrar_sistema_registro;
    private javax.swing.JMenuItem eliminar_alumno;
    private javax.swing.JMenuItem eliminar_maestro;
    private javax.swing.JMenuItem eliminar_registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JToolBar jToolBar3;
    private javax.swing.JButton jb_crear_alumno;
    private javax.swing.JButton jb_crear_maestro;
    private javax.swing.JButton jb_crear_registro;
    private javax.swing.JButton jb_login;
    private javax.swing.JButton jb_modificar_alumno;
    private javax.swing.JButton jb_modificar_maestro;
    private javax.swing.JButton jb_modificar_registro;
    private javax.swing.JDialog jd_crear_alumno;
    private javax.swing.JDialog jd_crear_maestro;
    private javax.swing.JDialog jd_crear_registro;
    private javax.swing.JDialog jd_listar_alumnos;
    private javax.swing.JDialog jd_listar_maestros;
    private javax.swing.JDialog jd_listar_registros;
    private javax.swing.JDialog jd_modificar_alumno;
    private javax.swing.JDialog jd_modificar_maestro;
    private javax.swing.JDialog jd_modificar_registro;
    private javax.swing.JFrame jf_registro;
    private javax.swing.JList<String> jl_alumnos;
    private javax.swing.JList<String> jl_maestros;
    private javax.swing.JList<String> jl_registros;
    private javax.swing.JButton maestro_agregar;
    private javax.swing.JButton maestro_modificar;
    private javax.swing.JMenuItem modificar_alumno;
    private javax.swing.JMenuItem modificar_maestro;
    private javax.swing.JMenuItem modificar_registro;
    private javax.swing.JPopupMenu popup_alumno;
    private javax.swing.JPopupMenu popup_maestro;
    private javax.swing.JPopupMenu popup_registro;
    private javax.swing.JButton registro_agregar;
    private javax.swing.JButton registro_modificar;
    private javax.swing.JTextField tf_alumno_carrera;
    private javax.swing.JTextField tf_alumno_carrera_m;
    private javax.swing.JFormattedTextField tf_alumno_clases;
    private javax.swing.JFormattedTextField tf_alumno_clases_m;
    private javax.swing.JFormattedTextField tf_alumno_cuenta;
    private javax.swing.JFormattedTextField tf_alumno_cuenta_m;
    private javax.swing.JTextField tf_alumno_nombre;
    private javax.swing.JTextField tf_alumno_nombre_m;
    private javax.swing.JTextField tf_alumno_pass;
    private javax.swing.JTextField tf_alumno_pass_m;
    private javax.swing.JTextField tf_alumno_rol;
    private javax.swing.JTextField tf_alumno_rol_m;
    private javax.swing.JTextField tf_alumno_user;
    private javax.swing.JTextField tf_alumno_user_m;
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
    private javax.swing.JPasswordField tf_pass_login;
    private javax.swing.JTextField tf_registro_pass;
    private javax.swing.JTextField tf_registro_pass_m;
    private javax.swing.JTextField tf_registro_user;
    private javax.swing.JTextField tf_registro_user_m;
    private javax.swing.JTextField tf_user_login;
    // End of variables declaration//GEN-END:variables
    ArrayList<Registro> registros = new ArrayList();
    ArrayList<Maestro> maestros = new ArrayList();
    ArrayList<Alumno> alumnos = new ArrayList();
}
