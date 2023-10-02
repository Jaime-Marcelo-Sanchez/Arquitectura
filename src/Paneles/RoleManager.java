
package Paneles;

import Clases.RolCrud;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class RoleManager extends javax.swing.JFrame {

    private RolCrud rolop = new RolCrud();

    String rol;
    int indice;

    public RoleManager() {
        initComponents();
        this.setLocationRelativeTo(null);
        rellenarArea();
        textarea.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        bsalir = new javax.swing.JButton();
        bregresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        indicerol = new javax.swing.JTextField();
        fieldrol = new javax.swing.JTextField();
        bcrear = new javax.swing.JButton();
        beditar = new javax.swing.JButton();
        beliminar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jbcerrarsesion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                .addContainerGap()));

        bsalir.setText("Salir");
        bsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bsalirActionPerformed(evt);
            }
        });

        bregresar.setText("Regresar");
        bregresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bregresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Indice:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Rol:");

        indicerol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

            }
        });

        bcrear.setText("Crear");
        bcrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcrearActionPerformed(evt);
            }
        });

        beditar.setText("Editar");
        beditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beditarActionPerformed(evt);
            }
        });

        beliminar.setText("Eliminar");
        beliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beliminarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Gestor de Roles");

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
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(bcrear)
                                                .addGap(40, 40, 40)
                                                .addComponent(beditar)
                                                .addGap(53, 53, 53)
                                                .addComponent(beliminar)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(indicerol,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                158, Short.MAX_VALUE)
                                                                        .addComponent(fieldrol)))
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        110, Short.MAX_VALUE)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                layout.createSequentialGroup()
                                                                        .addComponent(jPanel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(57, 57, 57))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addComponent(jbcerrarsesion,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 116,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(bregresar)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(bsalir)
                                                                .addGap(65, 65, 65)))))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bsalir)
                                        .addComponent(bregresar)
                                        .addComponent(jbcerrarsesion))
                                .addGap(29, 29, 29)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(21, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3)
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(indicerol, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(fieldrol, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(bcrear)
                                        .addComponent(beditar)
                                        .addComponent(beliminar))
                                .addGap(70, 70, 70)));

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

    private void bcrearActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bcrearActionPerformed
        // TODO add your handling code here:
        rol = fieldrol.getText().trim();
        if (rol.equals("")) {
            JOptionPane.showMessageDialog(null, "El nombre del rol está vacio");
        } else {
            rolop.crearRol(rol);
            indicerol.setText("");
            fieldrol.setText("");
            JOptionPane.showMessageDialog(null, "Se creó el rol");
        }
        rellenarArea();

    }// GEN-LAST:event_bcrearActionPerformed

    private void beditarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_beditarActionPerformed
        // TODO add your handling code here:
        indice = Integer.parseInt(indicerol.getText().trim());
        rol = fieldrol.getText().trim();
        if (rol.equals("")) {
            JOptionPane.showMessageDialog(null, "El nombre del rol está vacio");
        } else {
            int opcioneditar = Integer
                    .parseInt(JOptionPane.showInputDialog("¿Esta seguro que editar el Rol?" + "\n0. Si"
                            + "\n1. No"));

            switch (opcioneditar) {
                case 0:
                    rolop.actualizarRol(indice, rol);
                    indicerol.setText("");
                    fieldrol.setText("");
                    JOptionPane.showMessageDialog(null, "Se editó el rol");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No se editó el rol");
                    break;
            }
        }
        rellenarArea();
    }// GEN-LAST:event_beditarActionPerformed

    private void beliminarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_beliminarActionPerformed
        // TODO add your handling code here:
        indice = Integer.parseInt(indicerol.getText().trim());
        if (rolop.leerRol(indice) != null) {
            int opcion = Integer
                    .parseInt(JOptionPane.showInputDialog("¿Está seguro de eliminar el rol? \n 0. Si \n 1. No"));
            switch (opcion) {
                case 0:
                    rolop.eliminarRol(indice);
                    JOptionPane.showMessageDialog(null, "Se eliminó el rol");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "No se eliminó el rol");
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "No existe el rol");
        }

        indicerol.setText("");
        fieldrol.setText("");
        rellenarArea();
    }// GEN-LAST:event_beliminarActionPerformed

    private void bregresarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bregresarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new Principal().setVisible(true);
    }// GEN-LAST:event_bregresarActionPerformed

    private void bsalirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_bsalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }// GEN-LAST:event_bsalirActionPerformed

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
    // java.util.logging.Logger.getLogger(RoleManager.class.getName()).log(java.util.logging.Level.SEVERE,
    // null,
    // ex);
    // } catch (InstantiationException ex) {
    // java.util.logging.Logger.getLogger(RoleManager.class.getName()).log(java.util.logging.Level.SEVERE,
    // null,
    // ex);
    // } catch (IllegalAccessException ex) {
    // java.util.logging.Logger.getLogger(RoleManager.class.getName()).log(java.util.logging.Level.SEVERE,
    // null,
    // ex);
    // } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    // java.util.logging.Logger.getLogger(RoleManager.class.getName()).log(java.util.logging.Level.SEVERE,
    // null,
    // ex);
    // }
    // // </editor-fold>

    // /* Create and display the form */
    // java.awt.EventQueue.invokeLater(new Runnable() {
    // public void run() {
    // new RoleManager().setVisible(true);
    // }
    // });
    // }

    private void rellenarArea() {
        textarea.setText("");
        for (int i = 0; i < rolop.getRoles().length; i++) {
            if (rolop.getRoles()[i] != null) {
                textarea.append(i + ". " + rolop.getRoles()[i] + "\n");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bcrear;
    private javax.swing.JButton beditar;
    private javax.swing.JButton beliminar;
    private javax.swing.JButton bregresar;
    private javax.swing.JButton bsalir;
    private javax.swing.JTextField fieldrol;
    private javax.swing.JTextField indicerol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbcerrarsesion;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
}
