package com.programandoando.hamp.test;

import com.programandoando.hamp.entities.Liquidation;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class IULiquidation extends javax.swing.JFrame {    
    public IULiquidation() {
        initComponents();
    }
    
    //1.
    public String validates(){
        if(cboCategoria.getSelectedIndex()==-1)
            return "Seleccione categoria del estudiante";
        else if (txtPromedio.getText().equals("") || 
                Double.parseDouble(txtPromedio.getText())<0 ||
                Double.parseDouble(txtPromedio.getText())>20)
            return "Promedio del alumno incorrecto";
        else
            return "";
    }   
    //2.-
    int leerCategoria(){//leer la categoria
        return cboCategoria.getSelectedIndex();
    }    
    double leerPromedio(){//leer el promedio
        return Double.parseDouble(txtPromedio.getText());
    }
    
    //3.-
    void imprimir(double pension,double descuento,double NuevaPension){
        
        //Clase nombreobjeto=new Constructor();
        //Interfaz nombreobjeto=new Constructor();        
        DefaultListModel moR=new DefaultListModel();
        //moR===>NULL.
        
        //Modelo
        moR.addElement("La Pension es:"+ String.format("%.2f", pension));
        moR.addElement("El descuento es:"+ String.format("%.2f", descuento));
        moR.addElement("La Nueva Pension es:"+ String.format("%.2f", NuevaPension));
        
        //Vista
        lstResultado.setModel(moR);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cboCategoria = new javax.swing.JComboBox();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();
        txtPromedio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstResultado = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PENSION DE ESTUDIANTE");

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D" }));

        btnLimpiar.setText("Limpiar");

        btnSalir.setText("Salir");

        btnProcesar.setText("Procesar");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstResultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnLimpiar)
                .addGap(26, 26, 26)
                .addComponent(btnSalir))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnProcesar))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnProcesar))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        // TODO add your handling code here:
        if(validates().equals("")){
            //Crear el objeto de la clase Pension
            Liquidation objP=new Liquidation(leerCategoria(),leerPromedio());
            
            //calculando con los metodos de la clase
            double pension=objP.determineLiquidation();
            double descuento=objP.getDiscount();
            double nuevaPension=objP.determineNewliquidation();
            
            //Reporte
            imprimir(pension, descuento, nuevaPension);            
        }else
            JOptionPane.showMessageDialog(null, "El error esta en "+validates());
        
        
    }//GEN-LAST:event_btnProcesarActionPerformed

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
            java.util.logging.Logger.getLogger(IULiquidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IULiquidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IULiquidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IULiquidation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IULiquidation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox cboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstResultado;
    private javax.swing.JTextField txtPromedio;
    // End of variables declaration//GEN-END:variables
}
