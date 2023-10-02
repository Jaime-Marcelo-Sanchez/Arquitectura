package Paneles;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import Clases.Crud;
import Clases.Encriptar;
import Clases.RolCrud;
import Clases.Usuarios;
import Clases.Validacion;

public class UserManager extends javax.swing.JFrame {

    RolCrud rolcrud = new RolCrud();
    String[] listRoles = rolcrud.getRoles();
    Encriptar encript = new Encriptar();

    Crud usercrud = new Crud();
    List<Usuarios> listUsuarios;

    Validacion valid = new Validacion();

    int idtext;
    String nombrestext, roltext, usuariotext, clavetext, reclavetext, estadotext;

    int idTabla;
    String nombresTabla, rolTabla, usuarioTabla, claveTabla, estadoTabla;

    String[] estados = { "Normal", "Bloqueado", "Desbloqueado" };

    DefaultTableModel modelo;

    public UserManager() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        actualizarRoles();
        actualizarTabla();
        jcestado.addItem(estados[0]);
        jcestado.addItem(estados[1]);
        jcestado.addItem(estados[2]);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jbnew = new javax.swing.JButton();
        jbsave = new javax.swing.JButton();
        jbedit = new javax.swing.JButton();
        jbban = new javax.swing.JButton();
        jbcancel = new javax.swing.JButton();
        jbleave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldid = new javax.swing.JTextField();
        fieldnames = new javax.swing.JTextField();
        fielduser = new javax.swing.JTextField();
        fieldpassword = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldrepassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jcrole1 = new javax.swing.JComboBox<>();
        jcestado = new javax.swing.JComboBox<>();
        jbbuscar = new javax.swing.JButton();
        jbeliminar = new javax.swing.JButton();
        jbcerrarsesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setText("Gestor de Usuarios");

        jbnew.setText("Nuevo");
        jbnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnewActionPerformed(evt);
            }
        });

        jbsave.setText("Guardar");
        jbsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsaveActionPerformed(evt);
            }
        });

        jbedit.setText("Editar");
        jbedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeditActionPerformed(evt);
            }
        });

        jbban.setText("Bloquear");
        jbban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbanActionPerformed(evt);
            }
        });

        jbcancel.setText("Cancelar");
        jbcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcancelActionPerformed(evt);
            }
        });

        jbleave.setText("Salir");
        jbleave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbleaveActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data Base"));

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Id", "Nombres", "Rol", "Usuario", "Contraseña", "Estado"
                }));
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Data"));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Id:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nombres:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Usuario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Contraseña:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Repetir contraseña:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Rol:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Estado:");

        jcrole1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcrole1ActionPerformed(evt);
            }
        });

        jbbuscar.setText("Buscar");
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel6,
                                                                javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fieldpassword, javax.swing.GroupLayout.Alignment.LEADING,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                                        .addComponent(fielduser, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldnames, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldid, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fieldrepassword))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jcrole1, 0, 159, Short.MAX_VALUE)
                                        .addComponent(jcestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                Short.MAX_VALUE))
                                .addGap(66, 66, 66))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(243, 243, 243)
                                .addComponent(jbbuscar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(jbbuscar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(fieldid, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel2)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jcrole1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(fieldnames, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(fielduser, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(fieldpassword,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel8)
                                                        .addComponent(jcestado, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(fieldrepassword, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(46, Short.MAX_VALUE)));

        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        jbcerrarsesion.setText("Cerrar sesion");
        jbcerrarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbcerrarsesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(59, 59, 59)
                                                .addComponent(jbnew)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbsave)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbeliminar)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbedit)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbban)
                                                .addGap(18, 18, 18)
                                                .addComponent(jbcancel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40,
                                                        Short.MAX_VALUE)
                                                .addComponent(jbcerrarsesion))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(jScrollPane1))
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addComponent(jbleave)
                                .addGap(16, 16, 16)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(15, 15, 15)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jbnew)
                                                        .addComponent(jbsave)
                                                        .addComponent(jbedit)
                                                        .addComponent(jbban)
                                                        .addComponent(jbcancel)
                                                        .addComponent(jbleave)
                                                        .addComponent(jbeliminar)
                                                        .addComponent(jbcerrarsesion))))
                                .addGap(18, 18, 18)
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 347,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbcerrarsesionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbcerrarsesionActionPerformed
        // TODO add your handling code here:
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("¿Esta seguro que desea cerrar sesion?" + "\n0. Si"
                + "\n1. No"));

        switch (opcion) {
            case 0:
                new Login().setVisible(true);
                this.setVisible(false);
                break;
            default:
                JOptionPane.showMessageDialog(null, "No se cerro sesion");
                break;
        }
    }// GEN-LAST:event_jbcerrarsesionActionPerformed

    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbbuscarActionPerformed
        // TODO add your handling code here:
        if (!fieldid.getText().trim().equals("")) {
            idtext = Integer.parseInt(fieldid.getText().trim());
            if (usercrud.buscarId(idtext) != null) {

                fieldnames.setText(usercrud.buscarId(idtext).getNombres());
                fieldpassword.setText(encript.desencriptarClave(usercrud.buscarId(idtext).getClave()));
                fieldrepassword.setText(encript.desencriptarClave(usercrud.buscarId(idtext).getClave()));
                fielduser.setText(usercrud.buscarId(idtext).getUsuario());

                jcestado.setSelectedItem(usercrud.buscarId(idtext).getEstado());
                jcrole1.setSelectedItem(usercrud.buscarId(idtext).getRol());

                JOptionPane.showMessageDialog(null, "Usuario encontrado");
            } else {
                JOptionPane.showMessageDialog(null, "No existe un usuario con tal Id");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se ingreso una Id");
        }
    }// GEN-LAST:event_jbbuscarActionPerformed

    private void jcrole1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jcrole1ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jcrole1ActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbeliminarActionPerformed
        // TODO add your handling code here:
        if (!fieldid.getText().trim().equals("")) {
            idtext = Integer.parseInt(fieldid.getText().trim());
            if (usercrud.buscarId(idtext) != null) {
                if (idtext == 1) {
                    JOptionPane.showMessageDialog(null, "No se puede eliminar el Administrador principal");
                } else {
                    int opcion = Integer
                            .parseInt(JOptionPane.showInputDialog("¿Esta seguro que desea eliminar el usuario?"
                                    + "\n0. Si" + "\n1. No"));

                    switch (opcion) {
                        case 0:
                            usercrud.eliminarUsuario(idtext);
                            JOptionPane.showMessageDialog(null, "Usuario eliminado");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "No se elimino el usuario");
                            break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe, no se encuentra su id");
            }
            actualizarTabla();
            clearField();
        } else {
            JOptionPane.showMessageDialog(null, "La casilla de Id esta vacia, es la unica que se evalua");
        }

    }// GEN-LAST:event_jbeliminarActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
        int fila = Tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "No se selecciono una fila");
        } else {
            idTabla = Integer.parseInt((String) Tabla.getValueAt(fila, 0).toString());
            nombresTabla = (String) Tabla.getValueAt(fila, 1);
            rolTabla = (String) Tabla.getValueAt(fila, 2);
            usuarioTabla = (String) Tabla.getValueAt(fila, 3);
            claveTabla = (String) Tabla.getValueAt(fila, 4);
            estadoTabla = (String) Tabla.getValueAt(fila, 5);
            claveTabla = encript.desencriptarClave(claveTabla);

            fieldid.setText("" + idTabla);
            fieldnames.setText(nombresTabla);
            fieldpassword.setText(claveTabla);
            fieldrepassword.setText(claveTabla);
            fielduser.setText(usuarioTabla);
            jcrole1.setSelectedItem(rolTabla);
            jcestado.setSelectedItem(estadoTabla);
        }
    }// GEN-LAST:event_TablaMouseClicked

    private void jbeditActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbeditActionPerformed
        // TODO add your handling code here:
        idtext = Integer.parseInt(fieldid.getText().trim());
        if (!fieldid.getText().trim().equals("") & !fieldnames.getText().trim().equals("")
                & !fieldpassword.getText().trim().equals("") & !fielduser.getText().trim().equals("")) {
            if (usercrud.buscarId(idtext) != null) {
                nombrestext = fieldnames.getText().trim();
                roltext = jcrole1.getSelectedItem().toString();
                usuariotext = fielduser.getText().trim();
                clavetext = fieldpassword.getText().trim();
                reclavetext = fieldrepassword.getText().trim();
                estadotext = jcestado.getSelectedItem().toString();

                if (valid.validarClave(clavetext)) {
                    if (clavetext.equals(reclavetext)) {
                        clavetext = encript.encriptarClave(clavetext);
                        if (usercrud.verificarId(idtext)) {
                            if (idtext == 1) {
                                usercrud.actualizarUsuario(
                                        new Usuarios(idtext, nombrestext, roltext, usuariotext, clavetext, "Normal"));
                                JOptionPane.showMessageDialog(null,
                                        "Administrador principal actualizado, pero no su rol");
                            } else {
                                usercrud.actualizarUsuario(
                                        new Usuarios(idtext, nombrestext, roltext, usuariotext, clavetext, estadotext));
                                JOptionPane.showMessageDialog(null, "Usuario actualizado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El usuario no existe, no se encuentra su id");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Las claves no son iguales");
                    }
                }
                actualizarTabla();
                clearField();
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe, no se encuentra su id");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Una o varias casillas estan vacias");
        }
    }// GEN-LAST:event_jbeditActionPerformed

    private void jbbanActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbbanActionPerformed
        // TODO add your handling code here:
        idtext = Integer.parseInt(fieldid.getText().trim());
        usuariotext = fielduser.getText().trim();
        if (usercrud.leerUsuario(usuariotext) != null || usercrud.buscarId(idtext) != null) {
            int opcion2 = Integer
                    .parseInt(JOptionPane.showInputDialog("¿Esta seguro que desea Bloquear el usuario?"
                            + "\n0. Si" + "\n1. No"));

            switch (opcion2) {
                case 0:
                    usercrud.leerUsuario(usuariotext).setEstado("Bloqueado");
                    JOptionPane.showMessageDialog(null, "Usuario bloqueado");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No se bloqueo el usuario");
                    break;
            }

        } else {
            JOptionPane.showMessageDialog(null, "El usuario no existe, no se encuentra su id o su nombre de usuario");
        }
        actualizarTabla();
        clearField();
    }// GEN-LAST:event_jbbanActionPerformed

    private void jbleaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbleaveActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_jbleaveActionPerformed

    private void jbnewActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbnewActionPerformed
        // TODO add your handling code here:
        clearField();
    }// GEN-LAST:event_jbnewActionPerformed

    private void jbcancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbcancelActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Principal().setVisible(true);
    }// GEN-LAST:event_jbcancelActionPerformed

    private void jcroleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jcroleActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jcroleActionPerformed

    private void jbsaveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbsaveActionPerformed
        // TODO add your handling code here:
        if (!fieldid.getText().trim().equals("") & !fieldnames.getText().trim().equals("")
                & !fieldpassword.getText().trim().equals("") & !fielduser.getText().trim().equals("")) {
            idtext = Integer.parseInt(fieldid.getText().trim());
            nombrestext = fieldnames.getText().trim();
            roltext = jcrole1.getSelectedItem().toString();
            usuariotext = fielduser.getText().trim();
            clavetext = fieldpassword.getText().trim();
            reclavetext = fieldrepassword.getText().trim();
            estadotext = jcestado.getSelectedItem().toString();

            if (valid.validarClave(clavetext)) {
                if (clavetext.equals(reclavetext)) {
                    clavetext = encript.encriptarClave(clavetext);
                    if (!usercrud.verificarId(idtext)) {
                        usercrud.crearUsuario(
                                new Usuarios(idtext, nombrestext, roltext, usuariotext, clavetext, estadotext));
                        JOptionPane.showMessageDialog(null, "Usuario creado");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Las claves no son iguales");
                }
            }
            actualizarTabla();
            clearField();
        } else {
            JOptionPane.showMessageDialog(null, "Una o varias casillas estan vacias");
        }
    }// GEN-LAST:event_jbsaveActionPerformed

    /**
     * @param args the command line arguments
     */
    // public static void main(String args[]) {
    // /* Set the Nimbus look and feel */
    // // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
    // // (optional) ">
    // /*
    // * If Nimbus (introduced in Java SE 6) is not available, stay with the default
    // * look and feel.
    // * For details see
    // * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
    // */
    // try {
    // for (javax.swing.UIManager.LookAndFeelInfo info :
    // javax.swing.UIManager.getInstalledLookAndFeels()) {
    // if ("Nimbus".equals(info.getName())) {
    // javax.swing.UIManager.setLookAndFeel(info.getClassName());
    // break;
    // }
    // }
    // } catch (ClassNotFoundException ex) {
    // java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE,
    // null,
    // ex);
    // } catch (InstantiationException ex) {
    // java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE,
    // null,
    // ex);
    // } catch (IllegalAccessException ex) {
    // java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE,
    // null,
    // ex);
    // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    // java.util.logging.Logger.getLogger(UserManager.class.getName()).log(java.util.logging.Level.SEVERE,
    // null,
    // ex);
    // }
    // // </editor-fold>
    // // </editor-fold>
    // // </editor-fold>
    // // </editor-fold>
    // // </editor-fold>
    // // </editor-fold>
    // // </editor-fold>
    // // </editor-fold>
    // /* Create and display the form */
    // java.awt.EventQueue.invokeLater(new Runnable() {
    // public void run() {
    // new UserManager().setVisible(true);
    // }
    // });
    // }

    public void clearField() {
        fieldid.setText("");
        fieldnames.setText("");
        fieldpassword.setText("");
        fieldrepassword.setText("");
        fielduser.setText("");
    }

    public void actualizarRoles() {
        jcrole1.removeAllItems();
        for (int i = 0; i < rolcrud.getIndice() + 1; i++) {
            jcrole1.addItem(listRoles[i]);
        }
    }

    public void actualizarTabla() {
        modelo = (DefaultTableModel) Tabla.getModel();
        modelo.setRowCount(0);
        Object[] usariocolum = new Object[6];
        listUsuarios = usercrud.getListUsuarios();
        for (Usuarios user : listUsuarios) {
            usariocolum[0] = user.getId();
            usariocolum[1] = user.getNombres();
            usariocolum[2] = user.getRol();
            usariocolum[3] = user.getUsuario();
            usariocolum[4] = user.getClave();
            usariocolum[5] = user.getEstado();
            modelo.addRow(usariocolum);
        }
        Tabla.setModel(modelo);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JTextField fieldid;
    private javax.swing.JTextField fieldnames;
    private javax.swing.JTextField fieldpassword;
    private javax.swing.JTextField fieldrepassword;
    private javax.swing.JTextField fielduser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbban;
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbcancel;
    private javax.swing.JButton jbcerrarsesion;
    private javax.swing.JButton jbedit;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JButton jbleave;
    private javax.swing.JButton jbnew;
    private javax.swing.JButton jbsave;
    private javax.swing.JComboBox<String> jcestado;
    private javax.swing.JComboBox<String> jcrole1;
    // End of variables declaration//GEN-END:variables
}
