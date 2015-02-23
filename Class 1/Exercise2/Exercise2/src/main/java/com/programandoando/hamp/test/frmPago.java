package com.programandoando.hamp.test;
import javax.swing.DefaultListModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import com.programandoando.hamp.entities.Planilla;
/*HAMP*/

public class frmPago extends javax.swing.JFrame {
    DefaultListModel moEmpleado,moPagoHora,moBonificacion,moSueldo,moEstadisticas;
    Planilla objP;
    
    public frmPago() {
        initComponents();
        llenaCargo();
        llenaModalidad();
        cargaModelos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        txtHoras = new javax.swing.JTextField();
        cboModalidad = new javax.swing.JComboBox();
        cboCargo = new javax.swing.JComboBox();
        btnEstadisticas = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnProcesar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEmpleado = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstPagoxHora = new javax.swing.JList();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstBonificacion = new javax.swing.JList();
        jScrollPane4 = new javax.swing.JScrollPane();
        lstSueldo = new javax.swing.JList();
        jScrollPane5 = new javax.swing.JScrollPane();
        lstEstadisticas = new javax.swing.JList();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("PAGO DE EMPLEADOS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 20, 210, 21);

        txtEmpleado.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Nombres y Apellidos del empleado"));
        getContentPane().add(txtEmpleado);
        txtEmpleado.setBounds(20, 50, 380, 60);

        txtHoras.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        txtHoras.setBorder(javax.swing.BorderFactory.createTitledBorder("Horas Trabajadas"));
        getContentPane().add(txtHoras);
        txtHoras.setBounds(410, 50, 150, 60);

        cboModalidad.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cboModalidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Modalidad de empleo"));
        getContentPane().add(cboModalidad);
        cboModalidad.setBounds(410, 110, 150, 60);

        cboCargo.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        cboCargo.setBorder(javax.swing.BorderFactory.createTitledBorder("Cargo"));
        getContentPane().add(cboCargo);
        cboCargo.setBounds(20, 110, 380, 60);

        btnEstadisticas.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnEstadisticas.setText("ESTADISTICAS");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        getContentPane().add(btnEstadisticas);
        btnEstadisticas.setBounds(410, 180, 150, 40);

        btnLimpiar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar);
        btnLimpiar.setBounds(20, 180, 130, 40);

        btnProcesar.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        btnProcesar.setText("PROCESAR");
        btnProcesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarActionPerformed(evt);
            }
        });
        getContentPane().add(btnProcesar);
        btnProcesar.setBounds(160, 180, 130, 40);

        lstEmpleado.setBorder(javax.swing.BorderFactory.createTitledBorder("Empleado"));
        jScrollPane1.setViewportView(lstEmpleado);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 210, 190);

        lstPagoxHora.setBorder(javax.swing.BorderFactory.createTitledBorder("PH"));
        jScrollPane2.setViewportView(lstPagoxHora);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(240, 230, 80, 190);

        lstBonificacion.setBorder(javax.swing.BorderFactory.createTitledBorder("Bonificacion"));
        jScrollPane3.setViewportView(lstBonificacion);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(330, 230, 80, 190);

        lstSueldo.setBorder(javax.swing.BorderFactory.createTitledBorder("Sueldo Neto"));
        jScrollPane4.setViewportView(lstSueldo);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(420, 230, 140, 190);

        lstEstadisticas.setBorder(javax.swing.BorderFactory.createTitledBorder("Estadisticas"));
        jScrollPane5.setViewportView(lstEstadisticas);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(20, 430, 540, 200);

        setSize(new java.awt.Dimension(599, 685));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        imprimeEstadisticas();
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtEmpleado.setText("");
        txtHoras.setText("");
        cboCargo.setSelectedIndex(-1);
        cboModalidad.setSelectedIndex(-1);
        txtEmpleado.requestFocus();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnProcesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarActionPerformed
        if (valida().equals("")){
            objP = new Planilla(getHoras(),getCargo(),getModalidad());

            moEmpleado.addElement(getEmpleado());
            moPagoHora.addElement(objP.asignaPagoxHora());
            double bruto = objP.calculaBruto();
            moBonificacion.addElement(objP.asignaBonificacion(bruto));
            moSueldo.addElement(objP.calculaSueldo());
        } else
        JOptionPane.showMessageDialog(null,"El error esta en "+valida());
    }//GEN-LAST:event_btnProcesarActionPerformed

    //1
    void llenaCargo(){
        cboCargo.addItem("Gerente");
        cboCargo.addItem("Administrativo");
        cboCargo.addItem("Jefe");
        cboCargo.addItem("Operario");
    }
    //2
    void llenaModalidad(){
        cboModalidad.addItem("Tiempo Completo");
        cboModalidad.addItem("Tiempo Parcial");
    }
    
    //3
    String getEmpleado(){
        return txtEmpleado.getText();
    }
    
    //4
    int getHoras(){
        return Integer.parseInt(txtHoras.getText());
    }

    //5
    int getCargo(){
        return cboCargo.getSelectedIndex();
    }
    
    //6
    int getModalidad(){
        return cboModalidad.getSelectedIndex();
    }
   
    //7
    void cargaModelos(){
        moEmpleado=new DefaultListModel();
        moPagoHora=new DefaultListModel();
        moBonificacion=new DefaultListModel();
        moSueldo=new DefaultListModel();
        moEstadisticas=new DefaultListModel();
        
        lstEmpleado.setModel(moEmpleado);
        lstPagoxHora.setModel(moPagoHora);
        lstBonificacion.setModel(moBonificacion);
        lstSueldo.setModel(moSueldo);
        lstEstadisticas.setModel(moEstadisticas);
    }
    
     void imprimeEstadisticas(){
        moEstadisticas.clear();
        moEstadisticas.addElement("El Total de Empleados es: "+Planilla.getTotal());
        moEstadisticas.addElement("---------------------------------------------------------------------");
        moEstadisticas.addElement("El Total de Gerente es: "+Planilla.getTotalGerentes());
        moEstadisticas.addElement("El Total de Administrativos es: "+Planilla.getTotalAdministrativo());
        moEstadisticas.addElement("El Total de Jefes es: "+Planilla.getTotalJefes());
        moEstadisticas.addElement("El Total de Operario es: "+Planilla.getTotalOperario());
        moEstadisticas.addElement("---------------------------------------------------------------------");
        moEstadisticas.addElement("Cantidad de empleados que ganan menos a $1200: "+Planilla.getTotalmenor1200());
        moEstadisticas.addElement("Cantidad de empleados que ganan entre $1200 y $2500: "+Planilla.getTotalEntre1200y2500());
        moEstadisticas.addElement("Cantidad de empleados que ganan mas de $2500: "+Planilla.getTotalmas2500());
    }
    
    String valida(){
        if (txtEmpleado.getText().equals(""))
            return "Nombre del Empleado";
        else if(txtHoras.getText().equals("")||Integer.parseInt(txtHoras.getText())<0)
            return "Horas de trabajo";
        else if (cboCargo.getSelectedIndex()==-1)
            return "Cargo del empleado";
        else if (cboModalidad.getSelectedIndex()==-1)
            return "Modalidad del empleado";
        else
            return "";
    }
    
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
            java.util.logging.Logger.getLogger(frmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPago().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEstadisticas;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnProcesar;
    private javax.swing.JComboBox cboCargo;
    private javax.swing.JComboBox cboModalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList lstBonificacion;
    private javax.swing.JList lstEmpleado;
    private javax.swing.JList lstEstadisticas;
    private javax.swing.JList lstPagoxHora;
    private javax.swing.JList lstSueldo;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtHoras;
    // End of variables declaration//GEN-END:variables
}
