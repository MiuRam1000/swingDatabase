/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Andrianantenaina
 */
import java.sql.*;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dashboard extends javax.swing.JFrame {
    public Connection conn;
    public static final String DB_URL = "jdbc:mysql://localhost:3306/SWING";
    public static final String users = "root";
    public static final String password = "";

    /**
     * Creates new form dashboard
     */
    public dashboard() {
        initComponents();
        setTitle("Dashboard");
        
         jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
         public void mouseClicked(java.awt.event.MouseEvent evt) {
             jTable1MouseClicked(evt);
    }   
});
         try {
        connectionDB(); 
        refreshTable();
       
        
    } 
        catch (ClassNotFoundException | SQLException e) {
        JOptionPane.showMessageDialog(this, "Erreur de connexion : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
    }
}
  
    
    private void connectionDB() throws ClassNotFoundException, SQLException {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        this.conn = DriverManager.getConnection(DB_URL, users, password); // Utilisez this.conn
        JOptionPane.showMessageDialog(this, "Connexion à la base de données réussie !", "Succès", JOptionPane.INFORMATION_MESSAGE);
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Échec de la connexion : " + e.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
        throw e; // Propage l'exception pour la gérer ailleurs si nécessaire
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("CREATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 120, 40));

        jButton2.setText("EDIT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 540, 120, 40));

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 540, 110, 40));

        jTextField1.setText("jTextField1");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 240, -1));

        jTextField2.setText("jTextField2");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 240, -1));

        jTextField3.setText("jTextField3");
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 240, -1));

        jTextField4.setText("jTextField4");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 240, -1));

        jPasswordField1.setText("jPasswordField1");
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 240, -1));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel1.setText("Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        jLabel3.setText("Email");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel4.setText("Birthday");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel5.setText("Password");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 420, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Email", "Birthday"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 480, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
        String ID = jTextField1.getText();
        String name = jTextField2.getText();
        String email = jTextField3.getText();
        String birth = jTextField4.getText();
        String password = new String(jPasswordField1.getPassword());
        
        if(name.isEmpty() || email.isEmpty() || birth.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tous les champs doivent être remplis");
            return;
        }
        
        String sql = "INSERT INTO USERS VALUES (" + ID + ", '" + name + "', '" + email + "', '" + birth + "', '" + password + "')";
        
        Statement stmt = conn.createStatement();
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(this, "Étudiant ajouté avec succès !");
        
        stmt.close();
        refreshTable(); // Rafraîchit le tableau après l'insertion
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "L'ID doit être un nombre");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erreur base de données: " + e.getMessage());
         }
    }//GEN-LAST:event_jButton1ActionPerformed
// methode de mise à jour
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow =  jTable1.getSelectedRow();
        
        if(selectedRow == -1){
             JOptionPane.showMessageDialog(this, "Veuillez sélectionner un étudiant à modifier");
             return;
        }
        
        try{
             int id = Integer.parseInt(jTable1.getValueAt(selectedRow, 0).toString()); // récupération de l'id de la ligne selectionnée
             
              String newName = jTextField2.getText();
              String newEmail = jTextField3.getText();
              String newBirthday = jTextField4.getText();
              String newPassword = new String(jPasswordField1.getPassword());
              
               if(newName.isEmpty() || newEmail.isEmpty() || newBirthday.isEmpty() || newPassword.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Tous les champs doivent être remplis");
                return;
            }
                String sql = "UPDATE USERS SET Name=?, Email=?, Birthday=?, Password=? WHERE ID=?";
                
                // preparation de mysql
                 PreparedStatement pstmt = conn.prepareStatement(sql);
                 pstmt.setString(1, newName);
                 pstmt.setString(2, newEmail);
                 pstmt.setString(3, newBirthday);
                 pstmt.setString(4, newPassword);
                 pstmt.setInt(5, id);
                 
                 // le mise à jour
                 int Updated = pstmt.executeUpdate();
        
                if(Updated > 0) {
                    JOptionPane.showMessageDialog(this, "Étudiant mis à jour avec succès !");
                    refreshTable(); // Rafraîchir le tableau
        }
        
                 
                 pstmt.close();
     }
        catch(SQLException e){
                JOptionPane.showMessageDialog(this, "Erreur de base de données: " + e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int row = jTable1.getSelectedRow();
         if (row >= 0) {
        // Remplit les champs avec les valeurs de la ligne sélectionnée
        jTextField1.setText(jTable1.getValueAt(row, 0).toString()); // ID
        jTextField2.setText(jTable1.getValueAt(row, 1).toString()); // Name
        jTextField3.setText(jTable1.getValueAt(row, 2).toString()); // Email
        jTextField4.setText(jTable1.getValueAt(row, 3).toString()); // Birthday
    } // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int rowSelected = jTable1.getSelectedRow();        // TODO add your handling code here:
          if(rowSelected == -1){
             JOptionPane.showMessageDialog(this, "Veuillez sélectionner un étudiant à modifier");
             return;
        }
          try{
               int id = Integer.parseInt(jTable1.getValueAt(rowSelected, 0).toString());
               
               int confirmation = JOptionPane.showConfirmDialog(this,"Voulez vous vraiment supprimer cet etudiant?","Confirmation",JOptionPane.YES_NO_OPTION);
               
               if (confirmation  == JOptionPane.YES_OPTION){
                   String sql = "DELETE FROM USERS WHERE ID = " + id;
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate(sql);
                    
                    JOptionPane.showMessageDialog(this, "Étudiant supprimé avec succès!");
                    refreshTable();
                    
                    stmt.close();
                    
               }
              
          }
           catch (Exception e){
                JOptionPane.showMessageDialog(this, "Erreur: " + e.getMessage());
           }
         
    }//GEN-LAST:event_jButton3ActionPerformed
       
          
//}
    public void refreshTable() {
        try {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Vide le tableau existant

        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT ID, Name, Email, Birthday FROM USERS");

        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getInt("ID"),
                rs.getString("Name"),
                rs.getString("Email"),
                rs.getString("Birthday")
            });
        }

        rs.close();
        stmt.close();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erreur de rafraîchissement: " + e.getMessage());
    }
}
       
    
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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
