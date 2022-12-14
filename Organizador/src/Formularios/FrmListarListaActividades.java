package Formularios;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class FrmListarListaActividades extends javax.swing.JFrame {

    /** Creates new form FrmListarListaActividades */
    public FrmListarListaActividades() {
        initComponents();
        setLocationRelativeTo(this);
        listarListaActividades();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaAc = new javax.swing.JTable();
        regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        tblListaAc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Porcentaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaAc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblListaAcMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblListaAc);
        if (tblListaAc.getColumnModel().getColumnCount() > 0) {
            tblListaAc.getColumnModel().getColumn(0).setResizable(false);
            tblListaAc.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblListaAc.getColumnModel().getColumn(1).setResizable(false);
            tblListaAc.getColumnModel().getColumn(2).setResizable(false);
            tblListaAc.getColumnModel().getColumn(2).setPreferredWidth(10);
        }

        regresar.setText("Regresar");
        regresar.setBorder(new javax.swing.border.MatteBorder(null));
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTADO DE ACTIVIDADES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 53, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regresar)
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        FrmTarea frm = null;
        try {
            frm = new FrmTarea();
        } catch (ParseException ex) {
            Logger.getLogger(FrmListarListaActividades.class.getName()).log(Level.SEVERE, null, ex);
        }
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_regresarActionPerformed

    private void tblListaAcMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblListaAcMouseClicked
        int seleccionar = tblListaAc.rowAtPoint(evt.getPoint());  
        ListaActividades Transferencia = EstadoGlobal.TransferenciaListadoActividades;
        Transferencia.setIdLista((String) tblListaAc.getValueAt(seleccionar,0));
        Transferencia.setNombreLista(String.valueOf(tblListaAc.getValueAt(seleccionar,1)));
        Transferencia.setPorcentaje(Float.parseFloat(String.valueOf(tblListaAc.getValueAt(seleccionar,2)).substring(0,3)));
        FrmListadoActividades frm = new FrmListadoActividades();
        frm.setVisible(true);
        this.setVisible(false);      
    }//GEN-LAST:event_tblListaAcMouseClicked

    /**
     * @param args the command line arguments
     */
    public void listarListaActividades(){       
        ArrayList<ListaActividades> lista = EstadoGlobal.TransferenciaTarea.leerTareasLista();
        int cantidadTableros = lista.size();
        DefaultTableModel modelo = (DefaultTableModel) tblListaAc.getModel();        
        String[] datos = new String[3];
        for(int i=0;i<cantidadTableros;i++){
            datos[0]= String.valueOf(lista.get(i).getIdLista());
            datos[1]= lista.get(i).getNombreLista();
            datos[2]= String.format("%.02f",lista.get(i).getPorcentaje()) + " %";
            modelo.addRow(datos);            
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
            java.util.logging.Logger.getLogger(FrmListarListaActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListarListaActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListarListaActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListarListaActividades.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListarListaActividades().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton regresar;
    private javax.swing.JTable tblListaAc;
    // End of variables declaration//GEN-END:variables

}
