package Formularios;

import static Formularios.GestionOrganizadorTareas.listaTableros;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pablo
 */
public class FrmListarTableros extends javax.swing.JFrame {

    /**
     * Creates new form PruebaMenu
     */
    public FrmListarTableros() {
        initComponents();
        setLocationRelativeTo(this);
        listarTablerosTareas();
    }
    
    
    
     public void listarTablerosTareas(){       
        ArrayList<TableroTareas> lista = GestionOrganizadorTareas.traerTableros();
        int cantidadTableros = lista.size();
        DefaultTableModel modelo = (DefaultTableModel) tblLiTareas.getModel();        
        String[] datos = new String[3];
        for(int i=0;i<cantidadTableros;i++){
            datos[0]= String.valueOf(lista.get(i).getIdentificacion());
            datos[1]= lista.get(i).getNombre();
            datos[2]= String.valueOf(lista.get(i).countTareas());
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblLiTareas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblLiTareas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblLiTareas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre Tablero", "Cantidad Lista Tareas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblLiTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tblLiTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLiTareasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLiTareas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LISTADO DE TABLEROS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 460, 30));

        Regresar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.setBorder(new javax.swing.border.MatteBorder(null));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, -1, -1));

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblLiTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLiTareasMouseClicked
        int seleccionar = tblLiTareas.rowAtPoint(evt.getPoint());  
        TableroTareas Transferencia = EstadoGlobal.TransferenciaTablero;
        Transferencia.setIdentificacion((String) tblLiTareas.getValueAt(seleccionar,0));
        Transferencia.setNombre(String.valueOf(tblLiTareas.getValueAt(seleccionar,1)));
        Transferencia.setTotalTareas(Integer.parseInt(String.valueOf(tblLiTareas.getValueAt(seleccionar,2))));
        Tablero tableroTareas = new Tablero();
        tableroTareas.setVisible(true);
        this.setVisible(false);          

    }//GEN-LAST:event_tblLiTareasMouseClicked

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        Menu frm = new Menu();
        frm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmListarTableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmListarTableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmListarTableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmListarTableros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmListarTableros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLiTareas;
    // End of variables declaration//GEN-END:variables
}