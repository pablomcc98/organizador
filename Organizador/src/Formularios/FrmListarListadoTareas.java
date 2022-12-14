package Formularios;


import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Pablo
 */
public final class FrmListarListadoTareas extends javax.swing.JFrame {    
    /**
     * Creates new form FrmListarListaTareas
     */
    public FrmListarListadoTareas() {
        initComponents();
        setLocationRelativeTo(this);
        listarListadoTareas();
    }
    /**
     * Obtiene la lista de Alumnos y los agrega en la
     * tabla del formulario
     */
    public void listarListadoTareas(){
        ArrayList<ListadoTareas> lista = new ArrayList();
        lista = EstadoGlobal.TransferenciaTablero.leerTareasTablero();
        int cantidadTareas = lista.size();
        DefaultTableModel modelo = (DefaultTableModel) tblListadoTa.getModel();        
        String[] datos = new String[3];
        for(int i=0;i<cantidadTareas;i++){
            datos[0]=String.valueOf(lista.get(i).getIdListadoTareas());
            datos[1]=String.valueOf(lista.get(i).getNombreListado());
            datos[2]=String.valueOf(lista.get(i).getTotalTareas());
            modelo.addRow(datos);            
        }      
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListadoTa = new javax.swing.JTable();
        Regresar = new javax.swing.JButton();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" LISTADO DE TAREAS");

        tblListadoTa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblListadoTa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificaci??n", "Nombre", "Total Tareas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblListadoTa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListadoTaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListadoTa);

        Regresar.setText("Regresar");
        Regresar.setBorder(new javax.swing.border.MatteBorder(null));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                .addGap(114, 114, 114)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1))
                    .addComponent(Regresar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        this.setVisible(false);
        Tablero frm = new Tablero();
        frm.setVisible(true);
    }//GEN-LAST:event_RegresarActionPerformed

    private void tblListadoTaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListadoTaMouseClicked
        int seleccionar = tblListadoTa.rowAtPoint(evt.getPoint());  
        ListadoTareas Transferencia = EstadoGlobal.TransferencialistadoTareas;
        Transferencia.setIdListadoTareas((String) tblListadoTa.getValueAt(seleccionar,0));
        Transferencia.setNombreListado(String.valueOf(tblListadoTa.getValueAt(seleccionar,1)));
        Transferencia.setTotalTareas(Integer.parseInt(String.valueOf(tblListadoTa.getValueAt(seleccionar,2))));
        ListadoTarea listaTarea = new ListadoTarea();
        listaTarea.setVisible(true);
        this.setVisible(false);      
    }//GEN-LAST:event_tblListadoTaMouseClicked

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
            java.util.logging.Logger.getLogger(FrmListarListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListarListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListarListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListarListadoTareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListarListadoTareas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListadoTa;
    // End of variables declaration//GEN-END:variables
}
