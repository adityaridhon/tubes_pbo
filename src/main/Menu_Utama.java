/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.awt.Color;

/**
 *
 * @author LENOVO
 */
public class Menu_Utama extends javax.swing.JFrame {

   int xx, xy;
   
    public Menu_Utama() {
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

        pn_kiri = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pn_btndatakaryawan = new javax.swing.JPanel();
        pn_line = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_datakaryawan = new javax.swing.JLabel();
        pn_btndatagajikaryawan = new javax.swing.JPanel();
        pn_line1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btn_gajikaryawan = new javax.swing.JLabel();
        pn_btndatajadwalkaryawan = new javax.swing.JPanel();
        pn_line2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        btn_jadwalkaryawan = new javax.swing.JLabel();
        pn_btnexit = new javax.swing.JPanel();
        pn_line3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JLabel();
        pn_btnpelaporan = new javax.swing.JPanel();
        pn_line4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btn_pelaporan = new javax.swing.JLabel();
        pn_kanan = new javax.swing.JPanel();
        pn_title = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pn_dasar = new javax.swing.JPanel();
        pn_utama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        pn_kiri.setBackground(new java.awt.Color(255, 255, 255));
        pn_kiri.setPreferredSize(new java.awt.Dimension(200, 600));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/title simpeg 2 (1).png"))); // NOI18N

        pn_btndatakaryawan.setBackground(new java.awt.Color(255, 255, 255));

        pn_line.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_lineLayout = new javax.swing.GroupLayout(pn_line);
        pn_line.setLayout(pn_lineLayout);
        pn_lineLayout.setHorizontalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pn_lineLayout.setVerticalGroup(
            pn_lineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Data Transfer.png"))); // NOI18N

        btn_datakaryawan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_datakaryawan.setForeground(new java.awt.Color(102, 102, 102));
        btn_datakaryawan.setText("Data Karyawan");
        btn_datakaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_datakaryawanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_datakaryawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_datakaryawanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btndatakaryawanLayout = new javax.swing.GroupLayout(pn_btndatakaryawan);
        pn_btndatakaryawan.setLayout(pn_btndatakaryawanLayout);
        pn_btndatakaryawanLayout.setHorizontalGroup(
            pn_btndatakaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btndatakaryawanLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btn_datakaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btndatakaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btndatakaryawanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        pn_btndatakaryawanLayout.setVerticalGroup(
            pn_btndatakaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btndatakaryawanLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_btndatakaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_datakaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btndatakaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btndatakaryawanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );

        pn_btndatagajikaryawan.setBackground(new java.awt.Color(255, 255, 255));

        pn_line1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line1Layout = new javax.swing.GroupLayout(pn_line1);
        pn_line1.setLayout(pn_line1Layout);
        pn_line1Layout.setHorizontalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pn_line1Layout.setVerticalGroup(
            pn_line1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Coins.png"))); // NOI18N

        btn_gajikaryawan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_gajikaryawan.setForeground(new java.awt.Color(102, 102, 102));
        btn_gajikaryawan.setText("Gaji Karyawan");
        btn_gajikaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_gajikaryawanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_gajikaryawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_gajikaryawanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btndatagajikaryawanLayout = new javax.swing.GroupLayout(pn_btndatagajikaryawan);
        pn_btndatagajikaryawan.setLayout(pn_btndatagajikaryawanLayout);
        pn_btndatagajikaryawanLayout.setHorizontalGroup(
            pn_btndatagajikaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btndatagajikaryawanLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btn_gajikaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btndatagajikaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btndatagajikaryawanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        pn_btndatagajikaryawanLayout.setVerticalGroup(
            pn_btndatagajikaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btndatagajikaryawanLayout.createSequentialGroup()
                .addGroup(pn_btndatagajikaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_btndatagajikaryawanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_gajikaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_btndatagajikaryawanLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btndatagajikaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btndatagajikaryawanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );

        pn_btndatajadwalkaryawan.setBackground(new java.awt.Color(255, 255, 255));

        pn_line2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line2Layout = new javax.swing.GroupLayout(pn_line2);
        pn_line2.setLayout(pn_line2Layout);
        pn_line2Layout.setHorizontalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pn_line2Layout.setVerticalGroup(
            pn_line2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Time Span.png"))); // NOI18N

        btn_jadwalkaryawan.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_jadwalkaryawan.setForeground(new java.awt.Color(102, 102, 102));
        btn_jadwalkaryawan.setText("Jadwal Karyawan");
        btn_jadwalkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_jadwalkaryawanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_jadwalkaryawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_jadwalkaryawanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btndatajadwalkaryawanLayout = new javax.swing.GroupLayout(pn_btndatajadwalkaryawan);
        pn_btndatajadwalkaryawan.setLayout(pn_btndatajadwalkaryawanLayout);
        pn_btndatajadwalkaryawanLayout.setHorizontalGroup(
            pn_btndatajadwalkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btndatajadwalkaryawanLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btn_jadwalkaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btndatajadwalkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btndatajadwalkaryawanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        pn_btndatajadwalkaryawanLayout.setVerticalGroup(
            pn_btndatajadwalkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btndatajadwalkaryawanLayout.createSequentialGroup()
                .addGroup(pn_btndatajadwalkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_btndatajadwalkaryawanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_jadwalkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_btndatajadwalkaryawanLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btndatajadwalkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btndatajadwalkaryawanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );

        pn_btnexit.setBackground(new java.awt.Color(255, 255, 255));

        pn_line3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line3Layout = new javax.swing.GroupLayout(pn_line3);
        pn_line3.setLayout(pn_line3Layout);
        pn_line3Layout.setHorizontalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pn_line3Layout.setVerticalGroup(
            pn_line3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Emergency Exit.png"))); // NOI18N

        btn_exit.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(102, 102, 102));
        btn_exit.setText("Keluar");
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnexitLayout = new javax.swing.GroupLayout(pn_btnexit);
        pn_btnexit.setLayout(pn_btnexitLayout);
        pn_btnexitLayout.setHorizontalGroup(
            pn_btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnexitLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(btn_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnexitLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        pn_btnexitLayout.setVerticalGroup(
            pn_btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnexitLayout.createSequentialGroup()
                .addGroup(pn_btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_btnexitLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_btnexitLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnexitLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );

        pn_btnpelaporan.setBackground(new java.awt.Color(255, 255, 255));

        pn_line4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pn_line4Layout = new javax.swing.GroupLayout(pn_line4);
        pn_line4.setLayout(pn_line4Layout);
        pn_line4Layout.setHorizontalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        pn_line4Layout.setVerticalGroup(
            pn_line4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Graph Report.png"))); // NOI18N

        btn_pelaporan.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        btn_pelaporan.setForeground(new java.awt.Color(102, 102, 102));
        btn_pelaporan.setText("Pelaporan & Analisis");
        btn_pelaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pelaporanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_pelaporanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_pelaporanMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pn_btnpelaporanLayout = new javax.swing.GroupLayout(pn_btnpelaporan);
        pn_btnpelaporan.setLayout(pn_btnpelaporanLayout);
        pn_btnpelaporanLayout.setHorizontalGroup(
            pn_btnpelaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnpelaporanLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btn_pelaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pn_btnpelaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnpelaporanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(172, Short.MAX_VALUE)))
        );
        pn_btnpelaporanLayout.setVerticalGroup(
            pn_btnpelaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_btnpelaporanLayout.createSequentialGroup()
                .addGroup(pn_btnpelaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_btnpelaporanLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_pelaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_btnpelaporanLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pn_btnpelaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pn_btnpelaporanLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pn_line4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(71, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pn_kiriLayout = new javax.swing.GroupLayout(pn_kiri);
        pn_kiri.setLayout(pn_kiriLayout);
        pn_kiriLayout.setHorizontalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_kiriLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pn_btndatakaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btndatagajikaryawan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btndatajadwalkaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pn_btnpelaporan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pn_kiriLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pn_kiriLayout.setVerticalGroup(
            pn_kiriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_kiriLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(pn_btndatakaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(pn_btndatagajikaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(pn_btndatajadwalkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(pn_btnpelaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(pn_btnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pn_kiri, java.awt.BorderLayout.LINE_START);

        pn_kanan.setBackground(new java.awt.Color(255, 255, 255));
        pn_kanan.setLayout(new java.awt.BorderLayout());

        pn_title.setBackground(new java.awt.Color(0, 204, 204));
        pn_title.setPreferredSize(new java.awt.Dimension(600, 70));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        jLabel2.setText("Sistem Informasi Kepegawaian");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/People_1.png"))); // NOI18N

        javax.swing.GroupLayout pn_titleLayout = new javax.swing.GroupLayout(pn_title);
        pn_title.setLayout(pn_titleLayout);
        pn_titleLayout.setHorizontalGroup(
            pn_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_titleLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        pn_titleLayout.setVerticalGroup(
            pn_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_titleLayout.createSequentialGroup()
                .addGroup(pn_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_titleLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2))
                    .addGroup(pn_titleLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel3)))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pn_kanan.add(pn_title, java.awt.BorderLayout.PAGE_START);

        pn_dasar.setBackground(new java.awt.Color(204, 204, 204));

        pn_utama.setBackground(new java.awt.Color(255, 255, 255));
        pn_utama.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout pn_dasarLayout = new javax.swing.GroupLayout(pn_dasar);
        pn_dasar.setLayout(pn_dasarLayout);
        pn_dasarLayout.setHorizontalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        pn_dasarLayout.setVerticalGroup(
            pn_dasarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_dasarLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pn_utama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pn_kanan.add(pn_dasar, java.awt.BorderLayout.CENTER);

        getContentPane().add(pn_kanan, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_datakaryawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datakaryawanMouseEntered
       pn_btndatakaryawan.setBackground(new Color(250, 250, 250));
       pn_line.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_datakaryawanMouseEntered

    private void btn_datakaryawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datakaryawanMouseExited
      pn_btndatakaryawan.setBackground(new Color(250, 250, 250));
      pn_line.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_datakaryawanMouseExited

    private void btn_datakaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_datakaryawanMouseClicked
       pn_btndatakaryawan.setBackground(new Color(240, 240, 240));
       pn_line.setBackground(new Color(0, 102, 153));
       
       pn_utama.removeAll();
       pn_utama.add(new menudatakaryawan());
       pn_utama.repaint();
       pn_utama.revalidate();
    }//GEN-LAST:event_btn_datakaryawanMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
       xx = evt.getX();
       xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
     int x = evt.getXOnScreen();
     int y = evt.getYOnScreen();
     this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void btn_gajikaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gajikaryawanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gajikaryawanMouseClicked

    private void btn_gajikaryawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gajikaryawanMouseEntered
       pn_btndatagajikaryawan.setBackground(new Color(250, 250, 250));
       pn_line1.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_gajikaryawanMouseEntered

    private void btn_gajikaryawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_gajikaryawanMouseExited
      pn_btndatagajikaryawan.setBackground(new Color(250, 250, 250));
      pn_line1.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_gajikaryawanMouseExited

    private void btn_jadwalkaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jadwalkaryawanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_jadwalkaryawanMouseClicked

    private void btn_jadwalkaryawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jadwalkaryawanMouseEntered
       pn_btndatajadwalkaryawan.setBackground(new Color(250, 250, 250));
       pn_line2.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_jadwalkaryawanMouseEntered

    private void btn_jadwalkaryawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_jadwalkaryawanMouseExited
      pn_btndatajadwalkaryawan.setBackground(new Color(250, 250, 250));
      pn_line2.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_jadwalkaryawanMouseExited

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
       pn_btnexit.setBackground(new Color(240, 240, 240));
       pn_line3.setBackground(new Color(0, 102, 153));
       
        dispose(); 
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
       pn_btnexit.setBackground(new Color(250, 250, 250));
       pn_line3.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
      pn_btnexit.setBackground(new Color(250, 250, 250));
      pn_line3.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_exitMouseExited

    private void btn_pelaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pelaporanMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_pelaporanMouseClicked

    private void btn_pelaporanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pelaporanMouseEntered
       pn_btnpelaporan.setBackground(new Color(250, 250, 250));
       pn_line4.setBackground(new Color(0, 102, 153));
    }//GEN-LAST:event_btn_pelaporanMouseEntered

    private void btn_pelaporanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pelaporanMouseExited
      pn_btnpelaporan.setBackground(new Color(250, 250, 250));
      pn_line4.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_btn_pelaporanMouseExited

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
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu_Utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu_Utama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_datakaryawan;
    private javax.swing.JLabel btn_exit;
    private javax.swing.JLabel btn_gajikaryawan;
    private javax.swing.JLabel btn_jadwalkaryawan;
    private javax.swing.JLabel btn_pelaporan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pn_btndatagajikaryawan;
    private javax.swing.JPanel pn_btndatajadwalkaryawan;
    private javax.swing.JPanel pn_btndatakaryawan;
    private javax.swing.JPanel pn_btnexit;
    private javax.swing.JPanel pn_btnpelaporan;
    private javax.swing.JPanel pn_dasar;
    private javax.swing.JPanel pn_kanan;
    private javax.swing.JPanel pn_kiri;
    private javax.swing.JPanel pn_line;
    private javax.swing.JPanel pn_line1;
    private javax.swing.JPanel pn_line2;
    private javax.swing.JPanel pn_line3;
    private javax.swing.JPanel pn_line4;
    private javax.swing.JPanel pn_title;
    private javax.swing.JPanel pn_utama;
    // End of variables declaration//GEN-END:variables
}
