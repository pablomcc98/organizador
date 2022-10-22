package Formularios;

import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class FrmTarea extends javax.swing.JFrame {

    /** Creates new form FrmTarea */
    Tarea tarea = new Tarea();
    ListadoTareas lista = new ListadoTareas();
    
    public FrmTarea() throws ParseException {
        initComponents();
        setLocationRelativeTo(this);
        listarComentarios();
        tarea = EstadoGlobal.TransferenciaTarea;
        String fechafinal = tarea.getFechaFinal();       
        if (fechafinal.equals("sin datos")) {
            tarea.setVigenciaToString(fechafinal);
        }else{
            tarea.setVigencia(fechafinal);
        }  
        String vigencia = tarea.getVigencia();
        lista = EstadoGlobal.TransferencialistadoTareas;
        NomTarea.setText(tarea.getNombre());
        DesTarea.setText(tarea.getDescripcion());
        LisTarea.setText(lista.getNombreListado());
        Ven_Ta.setText(tarea.getFechaFinal());
        Est_Ta.setText(tarea.getVigencia());    
        if (vigencia.equals("Vencida")) {
            PanelVencimiento.setBackground(Color.red);
            Est_Ta.setForeground(Color.white);
            Ven_Ta.setForeground(Color.white);
        }else if (vigencia.equals("Por vencer")) {
            PanelVencimiento.setBackground(Color.yellow);
            Est_Ta.setForeground(Color.white);
            Ven_Ta.setForeground(Color.white);
        }else if (vigencia.equals("En tiempo")) {
            Est_Ta.setForeground(Color.white);
            Ven_Ta.setForeground(Color.white);
            PanelVencimiento.setBackground(Color.green);
        }
        
    }
    
    public void listarComentarios(){
        ArrayList<Comentarios> lista = new ArrayList();
        lista = EstadoGlobal.TransferenciaTarea.leerComentariosTarea();
        int cantidadComentarios = lista.size();
        DefaultTableModel modelo = (DefaultTableModel) TablaComentario.getModel();        
        String[] datos = new String[2];
        for(int i=0;i<cantidadComentarios;i++){
            datos[0]=String.valueOf(lista.get(i).getIdComentario());
            datos[1]=String.valueOf(lista.get(i).getComentario());
            modelo.addRow(datos);            
        }      
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        DesTarea = new javax.swing.JLabel();
        PanelVencimiento = new javax.swing.JPanel();
        Ven_Ta = new javax.swing.JLabel();
        Est_Ta = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        LisTarea = new javax.swing.JLabel();
        NomTarea = new javax.swing.JLabel();
        modificar = new javax.swing.JButton();
        EliminarTa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaComentario = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AgregarLisAct = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        ListAc = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btncomentario = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Lista de Tarea:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Nombre de esta tarea: ");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Decripcion de la tarea: ");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Vencimiento de la tarea: ");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Estado de esta tarea:");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        DesTarea.setBackground(new java.awt.Color(0, 0, 0));
        DesTarea.setText("Descripcion ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(DesTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesTarea, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelVencimiento.setBackground(new java.awt.Color(255, 255, 255));

        Ven_Ta.setBackground(new java.awt.Color(0, 0, 0));
        Ven_Ta.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        Ven_Ta.setText("Vencimiento");

        Est_Ta.setBackground(new java.awt.Color(0, 0, 0));
        Est_Ta.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        Est_Ta.setText("Estado");

        javax.swing.GroupLayout PanelVencimientoLayout = new javax.swing.GroupLayout(PanelVencimiento);
        PanelVencimiento.setLayout(PanelVencimientoLayout);
        PanelVencimientoLayout.setHorizontalGroup(
            PanelVencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVencimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ven_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(Est_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        PanelVencimientoLayout.setVerticalGroup(
            PanelVencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVencimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVencimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ven_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Est_Ta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        LisTarea.setBackground(new java.awt.Color(0, 0, 0));
        LisTarea.setText("Listado Tarea");

        NomTarea.setBackground(new java.awt.Color(0, 0, 0));
        NomTarea.setText("Nombre tarea");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LisTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NomTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LisTarea, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(NomTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        modificar.setText("Modificar");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        EliminarTa.setText("Eliminar tarea");
        EliminarTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarTaActionPerformed(evt);
            }
        });

        TablaComentario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Descripcion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaComentario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaComentarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaComentario);
        if (TablaComentario.getColumnModel().getColumnCount() > 0) {
            TablaComentario.getColumnModel().getColumn(0).setResizable(false);
            TablaComentario.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setText("Comentarios:");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DETALLE DE TAREA");

        jLabel6.setText("Ir Agregar Lista de Actividades");

        AgregarLisAct.setText("+");
        AgregarLisAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarLisActActionPerformed(evt);
            }
        });

        jLabel9.setText("Ir Listado de Lista de Actividades");

        ListAc.setText("+");
        ListAc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListAcActionPerformed(evt);
            }
        });

        jLabel10.setText("Ir Agregar Comentario");

        btncomentario.setText("+");
        btncomentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomentarioActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ListAc)
                    .addComponent(btncomentario)
                    .addComponent(AgregarLisAct))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(524, 524, 524))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(569, 569, 569))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(6, 6, 6)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PanelVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EliminarTa, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))
                        .addGap(73, 73, 73))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel6)
                        .addComponent(AgregarLisAct))
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(modificar))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(ListAc))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(btncomentario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarTa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Regresar)))
                .addGap(106, 106, 106))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
          FrmListarTareas frm = null;
        try {
            frm = new FrmListarTareas();
        } catch (ParseException ex) {
            Logger.getLogger(FrmTarea.class.getName()).log(Level.SEVERE, null, ex);
        }
          frm.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
        FrmModificarTarea frm = new FrmModificarTarea();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_modificarActionPerformed

    private void EliminarTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarTaActionPerformed
        String id = EstadoGlobal.TransferenciaTarea.getId();
        EstadoGlobal.TransferencialistadoTareas.eliminarTarea(id);
        ListadoTarea frm = new ListadoTarea();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_EliminarTaActionPerformed

    private void TablaComentarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaComentarioMouseClicked
        int seleccionar = TablaComentario.rowAtPoint(evt.getPoint());  
        Comentarios Transferencia = EstadoGlobal.TransferenciaComentarios;
        Transferencia.setIdComentario((String) TablaComentario.getValueAt(seleccionar,0));
        Transferencia.setComentario(String.valueOf(TablaComentario.getValueAt(seleccionar,1)));
        FrmComentario frm = new FrmComentario();
        frm.setVisible(true);
        this.setVisible(false);      
    }//GEN-LAST:event_TablaComentarioMouseClicked

    private void AgregarLisActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarLisActActionPerformed
          FrmAgregarListaActividades frm = new FrmAgregarListaActividades();
            frm.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_AgregarLisActActionPerformed

    private void ListAcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListAcActionPerformed
       FrmListarListaActividades frm = new FrmListarListaActividades();
            frm.setVisible(true);
            this.setVisible(false);
    }//GEN-LAST:event_ListAcActionPerformed

    private void btncomentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomentarioActionPerformed
        FrmAgregarComentario frm = new FrmAgregarComentario();
        frm.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_btncomentarioActionPerformed

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
            java.util.logging.Logger.getLogger(FrmTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FrmTarea().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(FrmTarea.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarLisAct;
    private javax.swing.JLabel DesTarea;
    private javax.swing.JButton EliminarTa;
    private javax.swing.JLabel Est_Ta;
    private javax.swing.JLabel LisTarea;
    private javax.swing.JButton ListAc;
    private javax.swing.JLabel NomTarea;
    private javax.swing.JPanel PanelVencimiento;
    private javax.swing.JButton Regresar;
    private javax.swing.JTable TablaComentario;
    private javax.swing.JLabel Ven_Ta;
    private javax.swing.JButton btncomentario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    // End of variables declaration//GEN-END:variables

}