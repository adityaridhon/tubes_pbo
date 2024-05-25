package Form;

import Config.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class menudatakaryawan extends javax.swing.JPanel {

    private Connection conn;
    
    public menudatakaryawan() {
        initComponents();
        conn = Koneksi.getConnection();
        getData();
        nonActiveBtn();
        activeBtn();
    }
    
    private void getData(){
       DefaultTableModel model = (DefaultTableModel) tabeldata.getModel();
       model.setRowCount(0);
       
       try {
            String sql = "SELECT * FROM pegawai";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt("id");
                String nama = rs.getString("nama");
                String jabatan = rs.getString("jabatan");
                String alamat = rs.getString("alamat");
                String telepon = rs.getString("telepon");
                String email = rs.getString("email");
                
                model.addRow(new Object[]{id, nama, jabatan, alamat, telepon, email});
            }
            
            rs.close();
            st.close();
       } catch (Exception e) {
            Logger.getLogger(menudatakaryawan.class.getName()).log(Level.SEVERE, null, e);
       }
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        tdatakaryawan = new javax.swing.JLabel();
        talamat = new javax.swing.JLabel();
        inputjabatan = new javax.swing.JTextField();
        tnama = new javax.swing.JLabel();
        inputnama = new javax.swing.JTextField();
        tjabatan = new javax.swing.JLabel();
        inputalamat = new javax.swing.JTextField();
        inputemail = new javax.swing.JTextField();
        ttelepon = new javax.swing.JLabel();
        temail = new javax.swing.JLabel();
        inputtelepon = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        btnPerbarui = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();
        btnBatal = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1280, 720));
        setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1280, 720));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setPreferredSize(new java.awt.Dimension(548, 200));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        tdatakaryawan.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        tdatakaryawan.setText("Data Karyawan");

        talamat.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        talamat.setText("Alamat");

        inputjabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputjabatanActionPerformed(evt);
            }
        });

        tnama.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tnama.setText("Nama");

        inputnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnamaActionPerformed(evt);
            }
        });

        tjabatan.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tjabatan.setText("Jabatan");

        inputalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputalamatActionPerformed(evt);
            }
        });

        inputemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputemailActionPerformed(evt);
            }
        });

        ttelepon.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        ttelepon.setText("No. Telepon");

        temail.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        temail.setText("Email");

        inputtelepon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputteleponActionPerformed(evt);
            }
        });

        btnTambah.setText("TAMBAH");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        btnPerbarui.setText("PERBARUI");
        btnPerbarui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerbaruiActionPerformed(evt);
            }
        });

        btnHapus.setText("HAPUS");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tabeldata.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        tabeldata.setForeground(new java.awt.Color(0, 0, 0));
        tabeldata.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "id", "Nama", "Jabatan", "Alamat", "Telepon", "Email"
            }
        ));
        tabeldata.setGridColor(new java.awt.Color(204, 204, 204));
        tabeldata.setMinimumSize(new java.awt.Dimension(0, 0));
        tabeldata.setRowHeight(30);
        tabeldata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabeldataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabeldata);
        if (tabeldata.getColumnModel().getColumnCount() > 0) {
            tabeldata.getColumnModel().getColumn(0).setMaxWidth(20);
            tabeldata.getColumnModel().getColumn(5).setResizable(false);
        }

        btnBatal.setText("BATAL");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 782, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tnama)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(inputtelepon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(inputjabatan, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(talamat, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tjabatan, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ttelepon, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(temail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputnama, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputemail)
                                    .addComponent(inputalamat, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnTambah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnPerbarui)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(tdatakaryawan))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tdatakaryawan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tnama)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(inputnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tjabatan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(talamat)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputalamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addComponent(ttelepon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(inputtelepon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(temail))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah)
                    .addComponent(btnPerbarui)
                    .addComponent(btnHapus)
                    .addComponent(btnBatal))
                .addContainerGap(193, Short.MAX_VALUE))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void inputjabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputjabatanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputjabatanActionPerformed

    private void inputnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputnamaActionPerformed

    private void inputalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputalamatActionPerformed

    private void inputemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputemailActionPerformed

    private void inputteleponActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputteleponActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputteleponActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String nama = inputnama.getText();
        String jabatan  = inputjabatan.getText();
        String alamat = inputalamat.getText();
        String telepon = inputtelepon.getText();
        String email = inputemail.getText();
    
    if (nama.isEmpty() || jabatan.isEmpty() || alamat.isEmpty() || telepon.isEmpty() || email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Semua data harus dilengkapi!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        String sql = "INSERT INTO pegawai (nama, jabatan, alamat, telepon, email) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, nama);
        st.setString(2, jabatan);
        st.setString(3, alamat);
        st.setString(4, telepon);
        st.setString(5, email);
        
        int rowInserted = st.executeUpdate();
        if(rowInserted > 0 ) {
            JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan");
            resetForm();
            getData();
        }
        st.close();
    } catch (Exception e) {
        Logger.getLogger(menudatakaryawan.class.getName()).log(Level.SEVERE, null, e);
    }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnPerbaruiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerbaruiActionPerformed
        int selectedRow = tabeldata.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin di perbarui!", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String id = tabeldata.getValueAt(selectedRow, 0).toString();
        String nama = inputnama.getText();
        String jabatan = inputjabatan.getText();
        String alamat = inputalamat.getText();
        String telepon = inputtelepon.getText();
        String email = inputemail.getText();
        
        if (nama.isEmpty() || jabatan.isEmpty() || alamat.isEmpty() || telepon.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Semua data harus dilengkapi!", "Peringatan", JOptionPane.ERROR_MESSAGE);
        return;
    }
        
        try {
            String sql = "UPDATE pegawai SET nama=?, jabatan=?, alamat=?, telepon=?, email=? WHERE id=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, nama);
            st.setString(2, jabatan);
            st.setString(3, alamat);
            st.setString(4, telepon);
            st.setString(5, email);
            st.setString(6, id);
        
        int rowUpdate = st.executeUpdate();
        if(rowUpdate > 0 ) {
            JOptionPane.showMessageDialog(this, "Data berhasil diperbarui");
            resetForm();
            getData();
        }
        st.close();
        } catch (Exception e) {
            Logger.getLogger(menudatakaryawan.class.getName()).log(Level.SEVERE, null, e);

        }
        
        
    }//GEN-LAST:event_btnPerbaruiActionPerformed

    private void tabeldataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabeldataMouseClicked
        int selectedRow = tabeldata.getSelectedRow();
        
        if(selectedRow != -1) {
            String nama = tabeldata.getValueAt(selectedRow, 1).toString();
            String jabatan = tabeldata.getValueAt(selectedRow, 2).toString();
            String  alamat = tabeldata.getValueAt(selectedRow, 3).toString();
            String telepon = tabeldata.getValueAt(selectedRow, 4).toString();
            String email = tabeldata.getValueAt(selectedRow, 5).toString();
            
            inputnama.setText(nama);
            inputjabatan.setText(jabatan);
            inputalamat.setText(alamat);
            inputtelepon.setText(telepon);
            inputemail.setText(email);
        }
        
        btnTambah.setEnabled(false);
        btnPerbarui.setEnabled(true);
        btnHapus.setEnabled(true);
    }//GEN-LAST:event_tabeldataMouseClicked

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        resetForm();
        activeBtn();
        nonActiveBtn();
    }//GEN-LAST:event_btnBatalActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        int selectedRow = tabeldata.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Pilih baris yang ingin di perbarui!", "Peringatan", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        int confirm = JOptionPane.showConfirmDialog(this, "Apakah yakin ingin menghapus data ini?", "Peringatan", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            String id = tabeldata.getValueAt(selectedRow, 0).toString();
            
            try {
                String sql = "DELETE from pegawai WHERE id=?";
                PreparedStatement st = conn.prepareStatement(sql);
                st.setString(1, id);
                
                int rowDelete = st.executeUpdate();
                if (rowDelete > 0) {
                    JOptionPane.showMessageDialog(this, "Data berhasil di hapus!");
                }
                
                st.close();
                
            } catch (Exception e) {
            }
            
        }
        
        resetForm();
        getData();
        activeBtn();
        nonActiveBtn();
    }//GEN-LAST:event_btnHapusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnPerbarui;
    private javax.swing.JButton btnTambah;
    private javax.swing.JTextField inputalamat;
    private javax.swing.JTextField inputemail;
    private javax.swing.JTextField inputjabatan;
    private javax.swing.JTextField inputnama;
    private javax.swing.JTextField inputtelepon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabeldata;
    private javax.swing.JLabel talamat;
    private javax.swing.JLabel tdatakaryawan;
    private javax.swing.JLabel temail;
    private javax.swing.JLabel tjabatan;
    private javax.swing.JLabel tnama;
    private javax.swing.JLabel ttelepon;
    // End of variables declaration//GEN-END:variables

    private void resetForm() {
        inputnama.setText("");
        inputjabatan.setText("");
        inputalamat.setText("");
        inputtelepon.setText("");
        inputemail.setText("");
    }

    private void nonActiveBtn() {
        btnPerbarui.setEnabled(false);
        btnHapus.setEnabled(false);
    }

    private void activeBtn() {
        btnTambah.setEnabled(true);
        btnBatal.setEnabled(true);
    }
}
