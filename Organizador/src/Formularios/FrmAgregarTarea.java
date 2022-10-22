package Formularios;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class FrmAgregarTarea extends javax.swing.JFrame {
    /**
     * Creates new form FrmAgregarCurso
     */
    public FrmAgregarTarea() {
        initComponents();
        setLocationRelativeTo(this);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNomTa = new javax.swing.JTextField();
        Regresar = new javax.swing.JButton();
        Agregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtDescTa = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Inicio = new com.toedter.calendar.JDateChooser();
        Fin = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Nombre de la Tarea:");

        txtNomTa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Descripcion Tarea:");

        txtDescTa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescTaActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha Inicio Tarea");

        jLabel5.setText("Fecha Final Tarea");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Vigencia de La Tarea (opcional)");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NUEVA TAREA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(32, 32, 32)
                                    .addComponent(txtNomTa, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(txtDescTa, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(Agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNomTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescTa, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4)
                        .addComponent(Inicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Regresar)
                    .addComponent(Agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
       ListadoTarea frm = new ListadoTarea();
       frm.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_RegresarActionPerformed
    
    /**
     * Método que agrega un curso a la lista de cursos
     * @param evt 
     */
    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        try{
         SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");
         UUID uuid = UUID.randomUUID();
         ListadoTareas listadoTareas = EstadoGlobal.TransferencialistadoTareas;
         String id = uuid.toString();
         String idLista = EstadoGlobal.TransferencialistadoTareas.getIdListadoTareas();
         Date inicio = Inicio.getDate();
         Date fin = Fin.getDate();
         String nombre = txtNomTa.getText().trim().replaceAll("\\s*\\|\\s*", " pipe operator ");
         String descripcion = txtDescTa.getText().trim().replaceAll("\\s*\\|\\s*", " pipe operator ");
         String fechaInicio = "";
         String fechaFinal = "";
        if (inicio != null && fin != null) {
            fechaInicio = fecha.format(Inicio.getCalendar().getTime());
            fechaFinal = fecha.format(Fin.getCalendar().getTime());
        }           
         if (!nombre.equals("") && !descripcion.equals("") && !nombre.isBlank() && !descripcion.isBlank() && !nombre.isEmpty() && !descripcion.isEmpty()) {
            ArrayList<Tarea> lista = new ArrayList();
            Tarea tarea = new Tarea();            
             if (!fechaInicio.equals("") && !fechaFinal.equals("") && !fechaInicio.isBlank() && !fechaFinal.isBlank() && !fechaInicio.isEmpty() && !fechaFinal.isEmpty()) {                
                 Date dt_1 = fecha.parse(fechaInicio);
                 Date dt_2 = fecha.parse(fechaFinal);
                if (dt_1.compareTo(dt_2) > 0) {  
                    JOptionPane.showMessageDialog(null, "La fecha inicio ocurre luego de la fecha final");
                } // el método compareTo devuelve el valor mayor que 0 si esta Fecha está después del argumento Fecha.  
                else if (dt_1.compareTo(dt_2) < 0) {  
                    tarea.setFechaInicio(fechaInicio);
                    tarea.setFechaFinal(fechaFinal); 
                    tarea.setIdLista(idLista);
                    tarea.setId(id);
                    tarea.setNombre(nombre);
                    tarea.setDescripcion(descripcion);
                    tarea.setVigencia(fechaFinal);
                    lista.add(tarea);
                    listadoTareas.aniadirTareasLista(lista);
                    JOptionPane.showMessageDialog(null, "Tarea creada exitosamente!");
                } // el método compareTo devuelve el valor menor que 0 si esta Fecha es anterior al argumento Fecha; 
                else if (dt_1.compareTo(dt_2) == 0) {  
                     tarea.setFechaInicio(fechaInicio);
                     tarea.setFechaFinal(fechaFinal);
                     tarea.setIdLista(idLista);
                     tarea.setId(id);
                     tarea.setNombre(nombre);
                     tarea.setDescripcion(descripcion);
                      tarea.setVigencia(fechaFinal);
                     lista.add(tarea);
                     listadoTareas.aniadirTareasLista(lista);
                     JOptionPane.showMessageDialog(null, "Tarea creada exitosamente!");
                } // el método compareTo devuelve el valor 0 si el argumento Fecha es igual a la segunda Fecha;
                else {  
                    System.out.println("¡Pareces ser un viajero del tiempo!");
                }
               
             }else{
                tarea.setIdLista(idLista);
                tarea.setId(id);
                tarea.setNombre(nombre);
                tarea.setDescripcion(descripcion);
                tarea.setFechaInicio("sin datos");
                tarea.setFechaFinal("sin datos");
                tarea.setVigenciaToString("sin datos");
                lista.add(tarea);
                listadoTareas.aniadirTareasLista(lista);
                JOptionPane.showMessageDialog(null, "Tarea creada exitosamente!");
             }                      
            txtNomTa.setText("");
            txtDescTa.setText("");
         }else{
            JOptionPane.showMessageDialog(null, "Llene todos los campos");
         }
        }catch(NumberFormatException | HeadlessException ex){
            JOptionPane.showMessageDialog(null, "Error! " + ex);
            txtNomTa.setText("");
            txtDescTa.setText("");
        } catch (ParseException ex) {
            Logger.getLogger(FrmAgregarTarea.class.getName()).log(Level.SEVERE, null, ex);
        }        
       
    }//GEN-LAST:event_AgregarActionPerformed

    private void txtDescTaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescTaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescTaActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAgregarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgregarTarea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgregarTarea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private com.toedter.calendar.JDateChooser Fin;
    private com.toedter.calendar.JDateChooser Inicio;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtDescTa;
    private javax.swing.JTextField txtNomTa;
    // End of variables declaration//GEN-END:variables
}
