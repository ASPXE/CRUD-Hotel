/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.SubMenusPrincipales;

import com.project.SubMenusSecundarios.Administradores.ActualizarAdministrador;
import com.project.SubMenusSecundarios.Administradores.EliminarAdministrador;
import com.project.SubMenusSecundarios.Administradores.IngresarAdministrador;
import com.project.SubMenusSecundarios.Administradores.VerAdministrador;

/**
 *
 * @author aspxe
 */
public class MenuPrincipalAdministradores extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipalAdministradores
     */
    public MenuPrincipalAdministradores() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnIngresarAdmin = new javax.swing.JButton();
        btnActualizarAdmin = new javax.swing.JButton();
        btnVerAdmins = new javax.swing.JButton();
        btnEliminarAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal Administradores");
        setLocation(new java.awt.Point(600, 300));
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(10, 10));
        setPreferredSize(new java.awt.Dimension(400, 400));
        getContentPane().setLayout(null);

        btnIngresarAdmin.setText("Ingresar nuevo administrador");
        btnIngresarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresarAdmin);
        btnIngresarAdmin.setBounds(70, 40, 230, 24);

        btnActualizarAdmin.setText("Actualizar informacion de un administrador");
        btnActualizarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizarAdmin);
        btnActualizarAdmin.setBounds(30, 110, 320, 24);

        btnVerAdmins.setText("Ver lista de usuarios administradores");
        btnVerAdmins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerAdminsActionPerformed(evt);
            }
        });
        getContentPane().add(btnVerAdmins);
        btnVerAdmins.setBounds(50, 190, 280, 24);

        btnEliminarAdmin.setText("Eliminar un administrador");
        btnEliminarAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAdminActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarAdmin);
        btnEliminarAdmin.setBounds(80, 260, 210, 24);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarAdminActionPerformed
        IngresarAdministrador ia = new IngresarAdministrador();
        ia.setVisible(true);
        
    }//GEN-LAST:event_btnIngresarAdminActionPerformed

    private void btnActualizarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarAdminActionPerformed
        ActualizarAdministrador aa = new ActualizarAdministrador();
        aa.setVisible(true);
        
    }//GEN-LAST:event_btnActualizarAdminActionPerformed

    private void btnVerAdminsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerAdminsActionPerformed
        VerAdministrador va = new VerAdministrador();
        va.setVisible(true);
        
    }//GEN-LAST:event_btnVerAdminsActionPerformed

    private void btnEliminarAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAdminActionPerformed
        EliminarAdministrador ea = new EliminarAdministrador();
        ea.setVisible(true);
        
    }//GEN-LAST:event_btnEliminarAdminActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipalAdministradores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipalAdministradores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarAdmin;
    private javax.swing.JButton btnEliminarAdmin;
    private javax.swing.JButton btnIngresarAdmin;
    private javax.swing.JButton btnVerAdmins;
    // End of variables declaration//GEN-END:variables
}
