/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;


import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Gökçe
 */
 class Hasta{
    private final String name;
    private final String tcno;
    private final String parola;

    public Hasta(String name, String tcno, String parola) {
        this.name = name;
        this.tcno = tcno;
        this.parola = parola;
    }

    

    @Override
    public String toString() {
        return "İsim: "+name+"T.C. Kimlik No: "+tcno; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
public class HastaGiris extends javax.swing.JFrame {

    /**
     * Creates new form HastaGiris
     */
    public HastaGiris() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tc_panel = new javax.swing.JPanel();
        randevu_btn = new javax.swing.JButton();
        hastaliklarim_btn = new javax.swing.JButton();
        ilac_btn = new javax.swing.JButton();
        giris_Panel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tc_panel.setBackground(new java.awt.Color(0, 51, 51));

        randevu_btn.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        randevu_btn.setText("RANDEVU AL");
        randevu_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randevu_btnActionPerformed(evt);
            }
        });

        hastaliklarim_btn.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        hastaliklarim_btn.setText("HASTALIK GEÇMİŞİM");
        hastaliklarim_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hastaliklarim_btnActionPerformed(evt);
            }
        });

        ilac_btn.setFont(new java.awt.Font("Georgia", 3, 24)); // NOI18N
        ilac_btn.setText("İLAÇLARIM");
        ilac_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ilac_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tc_panelLayout = new javax.swing.GroupLayout(tc_panel);
        tc_panel.setLayout(tc_panelLayout);
        tc_panelLayout.setHorizontalGroup(
            tc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tc_panelLayout.createSequentialGroup()
                .addContainerGap(161, Short.MAX_VALUE)
                .addGroup(tc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tc_panelLayout.createSequentialGroup()
                        .addComponent(ilac_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tc_panelLayout.createSequentialGroup()
                        .addGroup(tc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hastaliklarim_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(randevu_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139))))
        );
        tc_panelLayout.setVerticalGroup(
            tc_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tc_panelLayout.createSequentialGroup()
                .addContainerGap(57, Short.MAX_VALUE)
                .addComponent(randevu_btn)
                .addGap(29, 29, 29)
                .addComponent(hastaliklarim_btn)
                .addGap(26, 26, 26)
                .addComponent(ilac_btn)
                .addGap(38, 38, 38))
        );

        giris_Panel.setBackground(new java.awt.Color(0, 102, 102));

        jButton1.setFont(new java.awt.Font("Georgia", 3, 18)); // NOI18N
        jButton1.setText("ÇIKIŞ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout giris_PanelLayout = new javax.swing.GroupLayout(giris_Panel);
        giris_Panel.setLayout(giris_PanelLayout);
        giris_PanelLayout.setHorizontalGroup(
            giris_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(giris_PanelLayout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        giris_PanelLayout.setVerticalGroup(
            giris_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(giris_PanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tc_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(giris_Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tc_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(giris_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        HastaneOtomasyonu geri1 = new HastaneOtomasyonu();
        geri1.show();
        dispose();
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void randevu_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randevu_btnActionPerformed
        
        Randevu randevu = new Randevu();
        randevu.show();
        dispose();
        

    }//GEN-LAST:event_randevu_btnActionPerformed

    private void hastaliklarim_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hastaliklarim_btnActionPerformed
       HastalikGecmisi_ hg = new HastalikGecmisi_();
       hg.show();
       dispose();
    }//GEN-LAST:event_hastaliklarim_btnActionPerformed

    private void ilac_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ilac_btnActionPerformed
        Ilaclarim ilac = new Ilaclarim();
        ilac.show();
        dispose();
    }//GEN-LAST:event_ilac_btnActionPerformed

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
            java.util.logging.Logger.getLogger(HastaGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HastaGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HastaGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HastaGiris.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /*Set<Hasta> hashset = new HashSet<Hasta>();
        
        Hasta hasta1 = new Hasta("Elon Musk","12345678910","123");
        Hasta hasta2 = new Hasta("Bill Gates","12345678911","1234");
        Hasta hasta3 = new Hasta("Jeff Bezos","12345678912","12345");
        Hasta hasta4 = new Hasta("Mark Zuckerberg","12345678913","123456");
        
        hashset.add(hasta1);
        hashset.add(hasta2);
        hashset.add(hasta3);
        hashset.add(hasta4);
*/
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HastaGiris().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel giris_Panel;
    private javax.swing.JButton hastaliklarim_btn;
    private javax.swing.JButton ilac_btn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton randevu_btn;
    private javax.swing.JPanel tc_panel;
    // End of variables declaration//GEN-END:variables
}
