package Main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Gökçe
 */
public class GirisEkrani extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public GirisEkrani() {
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

        sifre_alani = new javax.swing.JPasswordField();
        kayit_btn = new javax.swing.JButton();
        giris_btn = new javax.swing.JButton();
        tcText = new javax.swing.JTextField();
        sifreText = new javax.swing.JTextField();
        tc_alani = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        kayit_btn.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        kayit_btn.setText("KAYIT OL");

        giris_btn.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        giris_btn.setText("GİRİŞ YAP");

        tcText.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        tcText.setText("T.C. KİMLİK NO:");

        sifreText.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        sifreText.setText("Şifre:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Zehra\\OneDrive\\Resimler\\Ekran Görüntüleri\\2022-12-10.png")); // NOI18N
        jLabel1.setText("SDDSFSF");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 660, 667);
        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(250, 420, 210, 130);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giris_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kayit_btn;
    private javax.swing.JTextField sifreText;
    private javax.swing.JPasswordField sifre_alani;
    private javax.swing.JTextField tcText;
    private javax.swing.JTextField tc_alani;
    // End of variables declaration//GEN-END:variables
}
