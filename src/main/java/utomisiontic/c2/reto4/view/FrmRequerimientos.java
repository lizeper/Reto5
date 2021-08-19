/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utomisiontic.c2.reto4.view;

import java.awt.Panel;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utomisiontic.c2.reto4.controller.ControllerRequerimientos;
import utomisiontic.c2.reto4.model.vo.Requerimiento_1;
import utomisiontic.c2.reto4.model.vo.Requerimiento_2;
import utomisiontic.c2.reto4.model.vo.Requerimiento_3;

/**
 *
 * @author Liz
 */
public class FrmRequerimientos extends javax.swing.JFrame {

    
    public FrmRequerimientos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRequerimiento1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        miTabla = new javax.swing.JTable();
        btnRequerimiento2 = new javax.swing.JButton();
        jbnRequerimiento3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 485));

        btnRequerimiento1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRequerimiento1.setText("Requerimiento 1");
        btnRequerimiento1.setBorder(new javax.swing.border.MatteBorder(null));
        btnRequerimiento1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento1ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        miTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(miTabla);

        btnRequerimiento2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnRequerimiento2.setText("Requerimiento 2");
        btnRequerimiento2.setBorder(new javax.swing.border.MatteBorder(null));
        btnRequerimiento2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequerimiento2ActionPerformed(evt);
            }
        });

        jbnRequerimiento3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jbnRequerimiento3.setText("Requerimiento 3");
        jbnRequerimiento3.setBorder(new javax.swing.border.MatteBorder(null));
        jbnRequerimiento3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRequerimiento3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CONSORCIO TODOS UNIDOS S.A");

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRequerimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnRequerimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jbnRequerimiento3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(110, 110, 110))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbnRequerimiento3, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnRequerimiento1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRequerimiento2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLimpiar)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequerimiento1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento1ActionPerformed

        String[] columnNombre = {"Fecha", "Id Compra", "Nombre Proveedor", "Pagado"};
        ControllerRequerimientos controlador = new ControllerRequerimientos();

        ArrayList<Requerimiento_1> lista;

        try {
            lista = controlador.ConsultaRequerimiento_1();

            Object[][] datos = new Object[lista.size()][4];
            int index = 0;

            for (Requerimiento_1 r : lista) {
                datos[index][0] = r.getFechaCompra();
                datos[index][1] = r.getCodCompra();
                datos[index][2] = r.getNombreProveedor();
                datos[index][3] = r.getPagado();
                index++;
            }

            DefaultTableModel model = new DefaultTableModel(datos, columnNombre);
            miTabla.setModel(model);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRequerimiento1ActionPerformed

    private void btnRequerimiento2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequerimiento2ActionPerformed
        // TODO add your handling code here:
        new FrmRequerimientosBusqueda().setVisible(true);
        String[] columnNombre = {"Fec. Inicio", "Ciudad", "Constructora", "Nombre Lider",
            "Codigo Tipo", "Estrato"};

        ControllerRequerimientos controlador = new ControllerRequerimientos();

        ArrayList<Requerimiento_2> lista;

        try {
            lista = controlador.consultaRequerimiento_2();

            Object[][] datos = new Object[lista.size()][6];
            int index = 0;

            for (Requerimiento_2 r : lista) {
                datos[index][0] = r.getFecIni();
                datos[index][1] = r.getNombreCiudad();
                datos[index][2] = r.getConstructora();
                datos[index][3] = r.getNombreLider();
                datos[index][4] = r.getCodigoTipo();
                datos[index][5] = r.getEstrato();

                index++;
            }

            DefaultTableModel model = new DefaultTableModel(datos, columnNombre);
            miTabla.setModel(model);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_btnRequerimiento2ActionPerformed

    private void jbnRequerimiento3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRequerimiento3ActionPerformed
       

        String[] columnNombre = {"Abrev."};

        ControllerRequerimientos controlador = new ControllerRequerimientos();

        ArrayList<Requerimiento_3> lista;

        try {
            lista = controlador.consultaRequerimiento_3();

            Object[][] datos = new Object[lista.size()][1];
            int index = 0;

            for (Requerimiento_3 r : lista) {
                datos[index][0] = r.getAbrev();

                index++;
            }

            DefaultTableModel model = new DefaultTableModel(datos, columnNombre);
            miTabla.setModel(model);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_jbnRequerimiento3ActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        DefaultTableModel dm = (DefaultTableModel) miTabla.getModel();
        while (dm.getRowCount() > 0) {
            dm.removeRow(0);
        }
        
        while (miTabla.getColumnCount() > 0) {
            miTabla.removeColumn(miTabla.getColumn(miTabla.getColumnName(0)));
            
            
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
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
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRequerimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRequerimientos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRequerimiento1;
    private javax.swing.JButton btnRequerimiento2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbnRequerimiento3;
    private javax.swing.JTable miTabla;
    // End of variables declaration//GEN-END:variables
}
