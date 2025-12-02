import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ACNEMACAC extends javax.swing.JFrame {

    public ACNEMACAC() {
        setUndecorated(true);
        initComponents();
        inicializarModel1();
        cargarDatosEnTabla1();
    }
    Connection connection;
    PreparedStatement preparedStatement;
    ResultSet resultSet;
    
    private void LimpiarCajas(){
        txtne.setText("");
        txtCliente.setText("");
        txtParte.setText("");
        txtTipo.setText("");
        txtAbogado.setText("");
        txtAutoridad.setText("");
        txtNET.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 0), new java.awt.Dimension(5, 32767));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbACNEMAC = new javax.swing.JTable();
        txtne = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtParte = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtAbogado = new javax.swing.JTextField();
        txtAutoridad = new javax.swing.JTextField();
        txtNET = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1540, 870));
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);

        jPanel2.setBackground(new java.awt.Color(64, 157, 59));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(7, 5, 5, 9, new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 65)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Norte del Estado de Mexico A.C");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 1310, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo/ACNEMAC.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        filler1.setBackground(new java.awt.Color(255, 255, 255));
        filler1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 14));
        filler1.setForeground(new java.awt.Color(0, 204, 204));
        jPanel2.add(filler1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 1540, 20));
        jPanel2.add(filler2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 65)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Abogados Colegiados del");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, 1320, 80));

        tbACNEMAC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NuExIn", "Cliente", "ParteCo", "TipodeJu", "AbogadoRes", "AutoridadTramitando", "NuExTu"
            }
        ));
        jScrollPane1.setViewportView(tbACNEMAC);
        if (tbACNEMAC.getColumnModel().getColumnCount() > 0) {
            tbACNEMAC.getColumnModel().getColumn(6).setResizable(false);
        }

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(552, 230, 970, 620));

        txtne.setFont(new java.awt.Font("SimSun-ExtG", 0, 13)); // NOI18N
        jPanel2.add(txtne, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 90, 30));

        txtCliente.setFont(new java.awt.Font("SimSun-ExtG", 0, 13)); // NOI18N
        jPanel2.add(txtCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 220, 30));

        txtParte.setFont(new java.awt.Font("SimSun-ExtG", 0, 13)); // NOI18N
        jPanel2.add(txtParte, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 220, 30));

        txtTipo.setFont(new java.awt.Font("SimSun-ExtG", 0, 13)); // NOI18N
        jPanel2.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 170, 30));

        txtAbogado.setFont(new java.awt.Font("SimSun-ExtG", 0, 13)); // NOI18N
        jPanel2.add(txtAbogado, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 220, 30));

        txtAutoridad.setFont(new java.awt.Font("SimSun-ExtG", 0, 13)); // NOI18N
        jPanel2.add(txtAutoridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 450, 220, 30));

        txtNET.setFont(new java.awt.Font("SimSun-ExtG", 0, 13)); // NOI18N
        jPanel2.add(txtNET, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 140, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setText("No. Exp. Interno");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 180, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setText("Cliente");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 110, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel13.setText("Parte Contraria");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 180, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel14.setText("Tipo de Juicio");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 170, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel15.setText("Abogado Responsable");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 230, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel16.setText("Autoridad donde se tramita");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 450, 270, 30));

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel17.setText("No. Exp. Tua");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 160, 30));

        jButton1.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 110, 30));

        jButton2.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton2.setText("Buscar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 250, 110, 30));

        jButton3.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton3.setText("Actualizar");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 110, 30));

        jButton4.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton4.setText("Borrar");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 570, 110, 30));

        jButton5.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton5.setText("Salir");
        jButton5.setToolTipText("");
        jButton5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 820, 110, 30));

        jButton6.setFont(new java.awt.Font("SimSun-ExtB", 1, 14)); // NOI18N
        jButton6.setText("Limpiar");
        jButton6.setToolTipText("");
        jButton6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 640, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 867, Short.MAX_VALUE)
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            connection = CONEXION.getConecion ();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO expedientes (no_exp_interno, cliente, parte_contraria, tipo_de_juicio, abogado_responsable, autoridad_donnde_se_tramita, no_exp_jdo_teca_junta_tua) VALUES (?,?,?,?,?,?,?)");
            
            preparedStatement.setString(1, txtne.getText());
            preparedStatement.setString(2, txtCliente.getText());
            preparedStatement.setString(3, txtParte.getText());
            preparedStatement.setString(4, txtTipo.getText());
            preparedStatement.setString(5, txtAbogado.getText());
            preparedStatement.setString(6, txtAutoridad.getText());
            preparedStatement.setString(7, txtNET.getText());
            int res = preparedStatement.executeUpdate();
            if (res > 0)  {
                JOptionPane.showMessageDialog(null, "datos guardados");
                LimpiarCajas();
            }
            else {
                JOptionPane.showMessageDialog(null, "Erro al guardar datos");
            }
            cargarDatosEnTabla1();
        }
        catch (Exception ex) {
            System.out.println (ex) ;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{        
            connection =CONEXION.getConecion();
            preparedStatement=connection.prepareStatement("SELECT no_exp_interno, cliente, parte_contraria, tipo_de_juicio, abogado_responsable, autoridad_donnde_se_tramita, no_exp_jdo_teca_junta_tua FROM expedientes WHERE no_exp_interno=?");
            preparedStatement.setString(1,txtne.getText());
            resultSet=preparedStatement.executeQuery();

            if(resultSet.next()){
                txtCliente.setText(resultSet.getString("cliente"));
                txtParte.setText(resultSet.getString("parte_contraria"));
                txtTipo.setText(resultSet.getString("tipo_de_juicio"));
                txtAbogado.setText(resultSet.getString("abogado_responsable"));
                txtAutoridad.setText(resultSet.getString("autoridad_donnde_se_tramita"));
                txtNET.setText(resultSet.getString("no_exp_jdo_teca_junta_tua"));

            }else{
                int SI =JOptionPane.showConfirmDialog(null,"No existe un registro con esos datos, desea registrarlo");
                if (JOptionPane.OK_OPTION==SI){
                }}
                connection.close();
            } catch (Exception ex){
                System.out.println(ex);
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{        
            connection =CONEXION.getConecion();
            preparedStatement=connection.prepareStatement("SELECT no_exp_interno, cliente, parte_contraria, tipo_de_juicio, abogado_responsable, autoridad_donnde_se_tramita, no_exp_jdo_teca_junta_tua FROM expedientes WHERE no_exp_interno=?");
            preparedStatement.setString(1,txtne.getText());
            resultSet=preparedStatement.executeQuery();

            if(resultSet.next()){
                txtCliente.setText(resultSet.getString("cliente"));
                txtParte.setText(resultSet.getString("parte_contraria"));
                txtTipo.setText(resultSet.getString("tipo_de_juicio"));
                txtAbogado.setText(resultSet.getString("abogado_responsable"));
                txtAutoridad.setText(resultSet.getString("autoridad_donnde_se_tramita"));
                txtNET.setText(resultSet.getString("no_exp_jdo_teca_junta_tua"));

            }else{
                int SI =JOptionPane.showConfirmDialog(null,"No existe un registro con esos datos, desea registrarlo");
                if (JOptionPane.OK_OPTION==SI){
                }}
                connection.close();
            } catch (SQLException ex) {
            Logger.getLogger(ACNEMACAC.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
        connection = CONEXION.getConecion();
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea borrar los registros?", "Confirmar borrado", JOptionPane.YES_NO_OPTION);
    if (confirmacion == JOptionPane.YES_OPTION) {
        preparedStatement = connection.prepareStatement("DELETE FROM expedientes WHERE no_exp_interno=?");
        preparedStatement.setString(1, txtne.getText());
        int res = preparedStatement.executeUpdate();
        if (res > 0) {
            JOptionPane.showMessageDialog(null, "Registros eliminados correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registros para eliminar con esa Referencia.");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Operación cancelada.");
        LimpiarCajas();
    }
        cargarDatosEnTabla1();
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, "Error al procesar la solicitud: " + ex.getMessage());
    System.out.println(ex);
}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            connection=CONEXION.getConecion();
            PreparedStatement preparedStatement=connection.prepareStatement("UPDATE expedientes SET cliente=?,parte_contraria=?,tipo_de_juicio=?,abogado_responsable=?,autoridad_donnde_se_tramita=?,no_exp_jdo_teca_junta_tua=? WHERE no_exp_interno=?");

            preparedStatement.setString(1, txtCliente.getText());
            preparedStatement.setString(2, txtParte.getText());
            preparedStatement.setString(3, txtTipo.getText());
            preparedStatement.setString(4, txtAbogado.getText());
            preparedStatement.setString(5, txtAutoridad.getText());
            preparedStatement.setString(6, txtNET.getText());
            preparedStatement.setString(7, txtne.getText());

            int res=preparedStatement.executeUpdate();
            if (res>0){
                JOptionPane.showMessageDialog(null,"Datos correctamente editados");
                LimpiarCajas();
            }else{
                JOptionPane.showMessageDialog(null,"Error al editar los datos");
            }
            cargarDatosEnTabla1();
        }catch (Exception ex){
            System.out.println (ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        LimpiarCajas();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog(null,"¿Desea salir del programa?","Confirmar salida",JOptionPane.YES_NO_OPTION);
if (confirmacion == JOptionPane.YES_OPTION) {
    JOptionPane.showMessageDialog(null, "Cerrando programa...");
    System.exit(0);
} else {
    JOptionPane.showMessageDialog(null, "Cancelado");
}
    }//GEN-LAST:event_jButton5ActionPerformed

    DefaultTableModel TableModel1;//Tabla Clientes
     private void inicializarModel1(){
        TableModel1 = new DefaultTableModel(new String[]{"NuExIn", "Cliente", "ParteCo", "TipodeJu","AbogadoRes","AutoridadTramitando","NuExTu"}, 0);
         tbACNEMAC.setModel(TableModel1);
         }
     private void cargarDatosEnTabla1() {
         Connection connection = null;
         try{
             connection=CONEXION.getConecion();
             preparedStatement = connection.prepareStatement("SELECT no_exp_interno, cliente, parte_contraria, tipo_de_juicio, abogado_responsable, autoridad_donnde_se_tramita, no_exp_jdo_teca_junta_tua FROM expedientes");
             resultSet = preparedStatement.executeQuery();
             TableModel1.setRowCount(0);
         while (resultSet.next()){
             String NuExIn = resultSet.getString("no_exp_interno");
             String Cliente = resultSet.getString("cliente");
             String ParteCo = resultSet.getString("parte_contraria");
             String TipodeJu = resultSet.getString("tipo_de_juicio");
             String AbogadoRes= resultSet.getString("abogado_responsable");
             String AutoridadTramitando= resultSet.getString("autoridad_donnde_se_tramita");
             String NuExTu= resultSet.getString("no_exp_jdo_teca_junta_tua");
             TableModel1.addRow(new Object[]{NuExIn,Cliente,ParteCo, TipodeJu,AbogadoRes,AutoridadTramitando,NuExTu});
         }
         } catch (Exception ex) {
             System.err.println(ex);
             JOptionPane.showMessageDialog(this,"Error al cargar datos" + ex.getMessage());
         }
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
            java.util.logging.Logger.getLogger(ACNEMACAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ACNEMACAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ACNEMACAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ACNEMACAC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ACNEMACAC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbACNEMAC;
    private javax.swing.JTextField txtAbogado;
    private javax.swing.JTextField txtAutoridad;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtNET;
    private javax.swing.JTextField txtParte;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtne;
    // End of variables declaration//GEN-END:variables
}
