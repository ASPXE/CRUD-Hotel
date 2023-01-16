/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.project.SubMenusSecundarios.Habitacion;

import com.project.Clases.Habitacion;
import com.project.DAO.HabitacionDAO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aspxe
 */
public class IngresarHabitacion extends javax.swing.JFrame {

    /**
     * Creates new form IngresarHabitacion
     */
    public IngresarHabitacion() {
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

        lblCategoria = new javax.swing.JLabel();
        lblPrecioPorNoche = new javax.swing.JLabel();
        lblArea = new javax.swing.JLabel();
        lblNumeroCamas = new javax.swing.JLabel();
        txtCategoria = new javax.swing.JTextField();
        txtPrecioPorNoche = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtNumeroCamas = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ingresar habitacion");
        setMaximumSize(new java.awt.Dimension(400, 400));
        setMinimumSize(new java.awt.Dimension(10, 10));
        setPreferredSize(new java.awt.Dimension(400, 400));

        lblCategoria.setText("Categoria");

        lblPrecioPorNoche.setText("Precio por noche");

        lblArea.setText("Area en M2");

        lblNumeroCamas.setText("Numero de camas");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNumeroCamas)
                            .addComponent(lblArea)
                            .addComponent(lblCategoria)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtArea, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPrecioPorNoche, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCategoria, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPrecioPorNoche, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtNumeroCamas, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(btnIngresar)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblCategoria)
                .addGap(18, 18, 18)
                .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPrecioPorNoche)
                .addGap(18, 18, 18)
                .addComponent(txtPrecioPorNoche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblArea)
                .addGap(18, 18, 18)
                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNumeroCamas)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroCamas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresar)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        int categoria = 0, numeroCamas = 0;
        double precioPorNoche = 0, sizeM2 = 0;
        
        if(txtCategoria.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Categoria no ingresada", "Informacon faltante", JOptionPane.ERROR_MESSAGE);
        }else{
            categoria = Integer.parseInt(txtCategoria.getText());
        }
        if(txtNumeroCamas.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Numero de camas no ingresado", "Informacon faltante", JOptionPane.ERROR_MESSAGE);
        }else{
            numeroCamas = Integer.parseInt(txtNumeroCamas.getText());
        }
        if(txtPrecioPorNoche.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Precio por noche no ingresado", "Informacon faltante", JOptionPane.ERROR_MESSAGE);
        }else{
            precioPorNoche = Double.parseDouble(txtPrecioPorNoche.getText());
        }
        if(txtArea.getText().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Area en M2 no ingresada", "Informacon faltante", JOptionPane.ERROR_MESSAGE);
        }else{
            sizeM2 = Double.parseDouble(txtArea.getText());
        }
        
        HabitacionDAO hd = new HabitacionDAO();
        Habitacion h = new Habitacion();
        
        h.setCategoria(categoria);
        h.setNumeroCamas(numeroCamas);
        h.setPrecioPorNoche(precioPorNoche);
        h.setSizeM2(sizeM2);
        
        try {
            hd.insertar(h);
            JOptionPane.showMessageDialog(rootPane, "Habitacion registrada exitosamente", "Registro insertado", JOptionPane.INFORMATION_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(IngresarHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(IngresarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarHabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarHabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblNumeroCamas;
    private javax.swing.JLabel lblPrecioPorNoche;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtCategoria;
    private javax.swing.JTextField txtNumeroCamas;
    private javax.swing.JTextField txtPrecioPorNoche;
    // End of variables declaration//GEN-END:variables
}
