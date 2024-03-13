/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkg4;

import java.awt.Image;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author juanj
 */
public class frmMonth extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public frmMonth() {
        initComponents();
        jDateChooser1.getDateEditor().setEnabled(false);   // para que no lo pueda editar
        //BtACalendar.setIcon(ponerIcono("/imagenes/calendario1c.gif", BtACalendar));
       // BtMostrar.setIcon(ponerIcono("/imagenes/calendario3.gif", BtMostrar));
    }
    // HCEMOS UN METODO PARA TODOS LOS BOTONES
    public Icon ponerIcono(String url, JButton boton){
        ImageIcon icono= new ImageIcon(getClass().getResource(url));
        int ancho = boton.getWidth();
        int alto = boton.getHeight();
        ImageIcon iconobtn = new ImageIcon(icono.getImage().getScaledInstance(ancho,alto, Image.SCALE_DEFAULT));
        return iconobtn;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDayChooser1 = new com.toedter.calendar.JDayChooser();
        lblMuestra = new javax.swing.JLabel();
        BtMostrar = new javax.swing.JButton();
        BtEligedia = new javax.swing.JButton();
        txtCampo = new javax.swing.JTextField();
        BtACalendar = new javax.swing.JButton();
        jCalendar1 = new com.toedter.calendar.JCalendar();
        pnlSexo = new javax.swing.JPanel();
        rbFem = new javax.swing.JRadioButton();
        rbMasc = new javax.swing.JRadioButton();
        rbNobin = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        lblMuestra.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMuestra.setText("jLabel1");

        BtMostrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario2-unscreen (1).gif"))); // NOI18N
        BtMostrar.setText("Mostrar Fecha");
        BtMostrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtMostrar.setContentAreaFilled(false);
        BtMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtMostrarActionPerformed(evt);
            }
        });

        BtEligedia.setText("Elige día");
        BtEligedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEligediaActionPerformed(evt);
            }
        });

        BtACalendar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario1c-unscreen.gif"))); // NOI18N
        BtACalendar.setText("Pasar a JCalendar");
        BtACalendar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtACalendar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        BtACalendar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtACalendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtACalendarActionPerformed(evt);
            }
        });

        pnlSexo.setBorder(javax.swing.BorderFactory.createTitledBorder("Orientacion sexual"));

        buttonGroup1.add(rbFem);
        rbFem.setText("Femenino");
        rbFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbMasc);
        rbMasc.setText("Maculino");
        rbMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMascActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbNobin);
        rbNobin.setText("No binario");

        javax.swing.GroupLayout pnlSexoLayout = new javax.swing.GroupLayout(pnlSexo);
        pnlSexo.setLayout(pnlSexoLayout);
        pnlSexoLayout.setHorizontalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSexoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(rbMasc)
                .addGap(18, 18, 18)
                .addComponent(rbFem)
                .addGap(30, 30, 30)
                .addComponent(rbNobin)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        pnlSexoLayout.setVerticalGroup(
            pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSexoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlSexoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbFem)
                    .addComponent(rbMasc)
                    .addComponent(rbNobin))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BtEligedia, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(229, 229, 229)
                                .addComponent(txtCampo))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtACalendar)
                                .addGap(0, 23, Short.MAX_VALUE)))
                        .addContainerGap(12, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 26, Short.MAX_VALUE)
                .addComponent(jDayChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtEligedia)
                .addGap(18, 18, 18)
                .addComponent(jCalendar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(lblMuestra))
                    .addComponent(BtACalendar))
                .addGap(39, 39, 39)
                .addComponent(txtCampo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(BtMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(pnlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtMostrarActionPerformed
        // pasamos fecha de calendar a MySQL
        Date fecha = jDateChooser1.getDate();
        JOptionPane.showMessageDialog(null, "La fecha es : " +fecha);
        long d = fecha.getTime();
        java.sql.Date fechaSql = new java.sql.Date(d);
        lblMuestra.setText(String.valueOf(fechaSql));
    }//GEN-LAST:event_BtMostrarActionPerformed

    private void BtACalendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtACalendarActionPerformed
        // ASI CONVERTIMOS UNA FECHA SQL a formato Calendar
       SimpleDateFormat forma = new SimpleDateFormat("dd/MM/yyyy");
        //SimpleDateFormat forma = new SimpleDateFormat("yyyy-MM-dd");  // el formato
        Date fechaTxt;        // guardara la fecha que venga de SQL
        try {
            fechaTxt = forma.parse(txtCampo.getText());   // aplico formato calendar 2020-03-01
            jDateChooser1.setDate(fechaTxt);    // se la asigno
        } catch (ParseException ex) {
            Logger.getLogger(frmMonth.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_BtACalendarActionPerformed

    private void BtEligediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEligediaActionPerformed
        // TODO add your handling code here:
        System.out.println(jDayChooser1.getDay()); 
        JOptionPane.showMessageDialog(null, "Se eligió el día : " +jDayChooser1.getDay());
    }//GEN-LAST:event_BtEligediaActionPerformed

    private void rbMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMascActionPerformed
        // TODO add your handling code here:
        lblMuestra.setText(rbMasc.getText());
    }//GEN-LAST:event_rbMascActionPerformed

    private void rbFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemActionPerformed
        // TODO add your handling code here:
         lblMuestra.setText(rbFem.getText());
    }//GEN-LAST:event_rbFemActionPerformed

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
            java.util.logging.Logger.getLogger(frmMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMonth.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMonth().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtACalendar;
    private javax.swing.JButton BtEligedia;
    private javax.swing.JButton BtMostrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDayChooser jDayChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMuestra;
    private javax.swing.JPanel pnlSexo;
    private javax.swing.JRadioButton rbFem;
    private javax.swing.JRadioButton rbMasc;
    private javax.swing.JRadioButton rbNobin;
    private javax.swing.JTextField txtCampo;
    // End of variables declaration//GEN-END:variables
}
