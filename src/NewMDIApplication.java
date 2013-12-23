
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListDataListener;
import javax.swing.table.DefaultTableModel;

public class NewMDIApplication extends javax.swing.JFrame {

    static File kullanicilarFile = new File("src/text/kullacilar.txt");
    static File stokFile = new File("src/text/stok.txt");
    static File turlerFile = new File("src/text/turler.txt");
    static File durumFile = new File("src/text/durum.txt");
    static File tmpFile = new File("src/text/tmp.txt");
    static File girisMesajiFile = new File("src/text/girisMesaji.txt");
    private BufferedReader bufReader;
    private BufferedWriter bufWriter;
    private static int secilenID = -1;
    private static String aranacakDeger;
    private static boolean kayitVarMi=false;   
    
    public NewMDIApplication() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_Arama_Kriter = new javax.swing.ButtonGroup();
        desktopPane = new javax.swing.JDesktopPane();
        jInternalFrame_Stok = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel_SeriNo = new javax.swing.JLabel();
        jLabel_Kullanici = new javax.swing.JLabel();
        jLabel_Durum = new javax.swing.JLabel();
        jLabel_Tarih = new javax.swing.JLabel();
        jLabel_Model = new javax.swing.JLabel();
        jLabel_Tür = new javax.swing.JLabel();
        jLabel_ID1 = new javax.swing.JLabel();
        jLabel_Marka = new javax.swing.JLabel();
        jComboBox_Tur = new javax.swing.JComboBox();
        jTextField_SeriNo = new javax.swing.JTextField();
        jLabelID2 = new javax.swing.JLabel();
        jButton_Kaydet = new javax.swing.JButton();
        jComboBox_Durum = new javax.swing.JComboBox();
        jTextField_Model = new javax.swing.JTextField();
        jTextField_Tarih = new javax.swing.JTextField();
        jTextField_Marka = new javax.swing.JTextField();
        jComboBox_Kullanici = new javax.swing.JComboBox();
        jInternalFrame_Kullanici = new javax.swing.JInternalFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel_TCNo = new javax.swing.JLabel();
        jLabel_Ad = new javax.swing.JLabel();
        jLabel_Soyad = new javax.swing.JLabel();
        TextField_Ad = new javax.swing.JTextField();
        TextField_TCNo1 = new javax.swing.JTextField();
        TextField_Soyad = new javax.swing.JTextField();
        jButton_KullaniciKaydet = new javax.swing.JButton();
        jInternalFrame_StokListele = new javax.swing.JInternalFrame();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jInternalFrame_StokGuncelle = new javax.swing.JInternalFrame();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_StokGuncelle = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_StokGuncelle_Marka = new javax.swing.JTextField();
        jTextField_StokGuncelle_Model = new javax.swing.JTextField();
        jTextField_StokGuncelle_SeriNo = new javax.swing.JTextField();
        jTextField_StokGuncelle_AlinmaTarihi = new javax.swing.JTextField();
        jComboBox_StokGuncelle_Durum = new javax.swing.JComboBox();
        jComboBox_StokGuncelle_Kullanici = new javax.swing.JComboBox();
        jComboBox_StokGuncelle_Tur = new javax.swing.JComboBox();
        jButton_StokGuncelle_Kaydet = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jInternalFrame_Hosgeldiniz = new javax.swing.JInternalFrame();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea_GirisMesaji = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jInternalFrame_GirisMesajiGuncelle = new javax.swing.JInternalFrame();
        jLabel8 = new javax.swing.JLabel();
        jButton_GirisMesajiGuncelle_Kaydet = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea_GirisMesajiGuncelle = new javax.swing.JTextArea();
        jInternalFrame_KullaniciSil = new javax.swing.JInternalFrame();
        jLabel9 = new javax.swing.JLabel();
        jButton_KullaniciSil_Sil = new javax.swing.JButton();
        jLabel_secilenKullanici = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable_KullaciSil_Kullanicilar = new javax.swing.JTable();
        jInternalFrame_KullanıcıBilgileriDuzenle = new javax.swing.JInternalFrame();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_KullaniciBilgileriDuzenle = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jTextField_KullaniciBilgileriGuncelle_Ad = new javax.swing.JTextField();
        jTextField_KullaniciBilgileriGuncelle_Soyad = new javax.swing.JTextField();
        jButton_KullaniciBilgileriGuncelle_Kaydet = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField_KullaniciBilgileriGuncelle_TCNo = new javax.swing.JTextField();
        jInternalFrame_Arama = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton_Urun = new javax.swing.JRadioButton();
        jRadioButton_Kullanici = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        jPanel_Arama = new javax.swing.JPanel();
        jLabel_Arama_AramaMetni = new javax.swing.JLabel();
        jTextField_Arama_Bilgi = new javax.swing.JTextField();
        jButton_Arama_Ara = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable_Arama = new javax.swing.JTable();
        jInternalFrame_Hakkinda = new javax.swing.JInternalFrame();
        jScrollPane13 = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jScrollPane20 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane21 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jLabel26 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        Menu_KullaniciIslemleri = new javax.swing.JMenu();
        jMenuItem_KullaniciEkle = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem_KullaniciSil = new javax.swing.JMenuItem();
        Menu_StokIslemleri = new javax.swing.JMenu();
        jMenuItem_StokEkle = new javax.swing.JMenuItem();
        jMenuItem_StokDuzenle = new javax.swing.JMenuItem();
        jMenuItem_StokListele = new javax.swing.JMenuItem();
        jMenu_Program = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem_Program_Hakkında = new javax.swing.JMenuItem();
        jMenu_Arama = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Stok Takip Programı");

        jInternalFrame_Stok.setTitle("Stok Ekle");
        jInternalFrame_Stok.setVisible(false);

        jLabel_SeriNo.setText("Seri No : ");
        jLabel_SeriNo.setToolTipText("");

        jLabel_Kullanici.setText("Kullanıcı : ");

        jLabel_Durum.setText("Durum :");

        jLabel_Tarih.setText("Tarih : ");
        jLabel_Tarih.setToolTipText("");

        jLabel_Model.setText("Model : ");
        jLabel_Model.setToolTipText("");

        jLabel_Tür.setText("Tür : ");

        jLabel_ID1.setText("ID : ");

        jLabel_Marka.setText("Marka : ");

        jComboBox_Tur.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Monitör", "PC", "Notebook", "Yazıcı", "Yazılım", "Network Cihazları" }));
        jComboBox_Tur.setSelectedIndex(-1);

        jLabelID2.setText(labelIdAta());

        jButton_Kaydet.setText("Kaydet");
        jButton_Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KaydetActionPerformed(evt);
            }
        });

        jComboBox_Durum.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "İyi", "Çalışır Durumda", "Kötü", "Hurda" }));
        jComboBox_Durum.setSelectedIndex(-1);

        jComboBox_Kullanici.setModel(comboBoxItemAta());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Marka)
                            .addComponent(jLabel_Tür)
                            .addComponent(jLabel_ID1)
                            .addComponent(jLabel_Model)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel_Durum)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel_SeriNo)
                                    .addComponent(jLabel_Tarih)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_Kullanici)
                                .addGap(6, 6, 6)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelID2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Marka)
                    .addComponent(jComboBox_Tur, 0, 138, Short.MAX_VALUE)
                    .addComponent(jTextField_SeriNo)
                    .addComponent(jTextField_Tarih, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_Model, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox_Durum, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox_Kullanici, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton_Kaydet)
                        .addGap(30, 30, 30)))
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelID2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Tur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Tür))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Marka))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Model))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_SeriNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_SeriNo))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Tarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Tarih))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Durum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Durum))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox_Kullanici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Kullanici))
                        .addGap(9, 9, 9)
                        .addComponent(jButton_Kaydet))
                    .addComponent(jLabel_ID1))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame_StokLayout = new javax.swing.GroupLayout(jInternalFrame_Stok.getContentPane());
        jInternalFrame_Stok.getContentPane().setLayout(jInternalFrame_StokLayout);
        jInternalFrame_StokLayout.setHorizontalGroup(
            jInternalFrame_StokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_StokLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame_StokLayout.setVerticalGroup(
            jInternalFrame_StokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame_StokLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jInternalFrame_Stok.setBounds(200, 60, 330, 350);
        desktopPane.add(jInternalFrame_Stok, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame_Kullanici.setTitle("Kullanıcı Bilgileri");
        jInternalFrame_Kullanici.setVisible(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("KULLANICI BİLGİLERİNİ GİRİNİZ");

        jLabel_TCNo.setText("TC NO :");

        jLabel_Ad.setText("AD : ");

        jLabel_Soyad.setText("SOYAD :");

        jButton_KullaniciKaydet.setText("Kaydet");
        jButton_KullaniciKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KullaniciKaydetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame_KullaniciLayout = new javax.swing.GroupLayout(jInternalFrame_Kullanici.getContentPane());
        jInternalFrame_Kullanici.getContentPane().setLayout(jInternalFrame_KullaniciLayout);
        jInternalFrame_KullaniciLayout.setHorizontalGroup(
            jInternalFrame_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_KullaniciLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_KullaniciKaydet)
                    .addGroup(jInternalFrame_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jInternalFrame_KullaniciLayout.createSequentialGroup()
                            .addComponent(jLabel_TCNo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextField_TCNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame_KullaniciLayout.createSequentialGroup()
                            .addComponent(jLabel_Soyad)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TextField_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jInternalFrame_KullaniciLayout.createSequentialGroup()
                            .addComponent(jLabel_Ad)
                            .addGap(82, 82, 82)
                            .addComponent(TextField_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame_KullaniciLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame_KullaniciLayout.setVerticalGroup(
            jInternalFrame_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_KullaniciLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jInternalFrame_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextField_TCNo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_TCNo))
                .addGap(9, 9, 9)
                .addGroup(jInternalFrame_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Ad)
                    .addComponent(TextField_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jInternalFrame_KullaniciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextField_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Soyad))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_KullaniciKaydet)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jInternalFrame_Kullanici.setBounds(150, 70, 280, 240);
        desktopPane.add(jInternalFrame_Kullanici, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame_StokListele.setTitle("Stok Listesi");
        jInternalFrame_StokListele.setVisible(false);

        jTable1.setModel(tabloAta());
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jInternalFrame_StokListeleLayout = new javax.swing.GroupLayout(jInternalFrame_StokListele.getContentPane());
        jInternalFrame_StokListele.getContentPane().setLayout(jInternalFrame_StokListeleLayout);
        jInternalFrame_StokListeleLayout.setHorizontalGroup(
            jInternalFrame_StokListeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame_StokListeleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 934, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame_StokListeleLayout.setVerticalGroup(
            jInternalFrame_StokListeleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_StokListeleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                .addContainerGap())
        );

        jInternalFrame_StokListele.setBounds(0, 0, 970, 530);
        desktopPane.add(jInternalFrame_StokListele, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame_StokGuncelle.setTitle("Stok Güncelle");
        jInternalFrame_StokGuncelle.setPreferredSize(new java.awt.Dimension(1000, 538));
        jInternalFrame_StokGuncelle.setVisible(false);

        jTable_StokGuncelle.setModel(tabloAta());
        jTable_StokGuncelle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_StokGuncelleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_StokGuncelleMouseClicked(evt);
            }
        });
        jTable_StokGuncelle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTable_StokGuncelleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_StokGuncelle);

        jLabel3.setText("              TÜR                   MARKA                       MODEL                  SERİ NO                   ALINMA TARİHİ                  DURUM                          KULLANICI                ");

        jComboBox_StokGuncelle_Durum.setModel(comboBoxTurDurumAta());

        jComboBox_StokGuncelle_Kullanici.setModel(comboBoxItemAta() );

        jComboBox_StokGuncelle_Tur.setModel(comboBoxTurItemAta());

        jButton_StokGuncelle_Kaydet.setText("Kaydet");
        jButton_StokGuncelle_Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_StokGuncelle_KaydetActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Kayıtları Aşağıdan Düzenleyerek \"Kaydet\" Butonuna Tıklayınız");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 772, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jComboBox_StokGuncelle_Tur, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_StokGuncelle_Marka, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_StokGuncelle_Model, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField_StokGuncelle_SeriNo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jTextField_StokGuncelle_AlinmaTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox_StokGuncelle_Durum, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox_StokGuncelle_Kullanici, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_StokGuncelle_Kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(78, 78, 78))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_StokGuncelle_Model, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_StokGuncelle_SeriNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_StokGuncelle_AlinmaTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_StokGuncelle_Durum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_StokGuncelle_Kullanici, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox_StokGuncelle_Tur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_StokGuncelle_Marka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton_StokGuncelle_Kaydet)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 153));
        jLabel4.setText("Düzenlemek İstediğiniz Kayıda Tıklayınız");

        javax.swing.GroupLayout jInternalFrame_StokGuncelleLayout = new javax.swing.GroupLayout(jInternalFrame_StokGuncelle.getContentPane());
        jInternalFrame_StokGuncelle.getContentPane().setLayout(jInternalFrame_StokGuncelleLayout);
        jInternalFrame_StokGuncelleLayout.setHorizontalGroup(
            jInternalFrame_StokGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_StokGuncelleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame_StokGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 860, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(114, Short.MAX_VALUE))
        );
        jInternalFrame_StokGuncelleLayout.setVerticalGroup(
            jInternalFrame_StokGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_StokGuncelleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jInternalFrame_StokGuncelle.setBounds(10, 0, 920, 530);
        desktopPane.add(jInternalFrame_StokGuncelle, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame_Hosgeldiniz.setTitle("Hoşgeldiniz");
        jInternalFrame_Hosgeldiniz.setVisible(true);

        jLabel5.setFont(new java.awt.Font("Castellar", 2, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("HOSGELDINIZ");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 8)); // NOI18N
        jLabel6.setText("Burak BEYKURT 2013");

        jTextArea_GirisMesaji.setEditable(false);
        jTextArea_GirisMesaji.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea_GirisMesaji.setColumns(20);
        jTextArea_GirisMesaji.setFont(new java.awt.Font("Nyala", 3, 24)); // NOI18N
        jTextArea_GirisMesaji.setForeground(new java.awt.Color(51, 102, 0));
        jTextArea_GirisMesaji.setRows(5);
        jTextArea_GirisMesaji.setText(girisMesajiGoruntule());
        jScrollPane4.setViewportView(jTextArea_GirisMesaji);

        jLabel7.setForeground(new java.awt.Color(51, 102, 0));
        jLabel7.setText("Program Destek : burakbeykurt@gmail.com");

        javax.swing.GroupLayout jInternalFrame_HosgeldinizLayout = new javax.swing.GroupLayout(jInternalFrame_Hosgeldiniz.getContentPane());
        jInternalFrame_Hosgeldiniz.getContentPane().setLayout(jInternalFrame_HosgeldinizLayout);
        jInternalFrame_HosgeldinizLayout.setHorizontalGroup(
            jInternalFrame_HosgeldinizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_HosgeldinizLayout.createSequentialGroup()
                .addGroup(jInternalFrame_HosgeldinizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame_HosgeldinizLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jInternalFrame_HosgeldinizLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane4)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame_HosgeldinizLayout.createSequentialGroup()
                .addGap(0, 137, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jInternalFrame_HosgeldinizLayout.setVerticalGroup(
            jInternalFrame_HosgeldinizLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_HosgeldinizLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap())
        );

        jInternalFrame_Hosgeldiniz.setBounds(260, 60, 590, 390);
        desktopPane.add(jInternalFrame_Hosgeldiniz, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame_GirisMesajiGuncelle.setTitle("Giris Mesajı Güncelle");
        jInternalFrame_GirisMesajiGuncelle.setVisible(false);

        jLabel8.setText("Mesajı Güncelledikten Sonra \"Kaydet\" Butonuna Basmalısınız");

        jButton_GirisMesajiGuncelle_Kaydet.setText("Kaydet");
        jButton_GirisMesajiGuncelle_Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_GirisMesajiGuncelle_KaydetActionPerformed(evt);
            }
        });

        jTextArea_GirisMesajiGuncelle.setColumns(20);
        jTextArea_GirisMesajiGuncelle.setRows(5);
        jTextArea_GirisMesajiGuncelle.setText(girisMesajiGoruntule());
        jScrollPane3.setViewportView(jTextArea_GirisMesajiGuncelle);

        javax.swing.GroupLayout jInternalFrame_GirisMesajiGuncelleLayout = new javax.swing.GroupLayout(jInternalFrame_GirisMesajiGuncelle.getContentPane());
        jInternalFrame_GirisMesajiGuncelle.getContentPane().setLayout(jInternalFrame_GirisMesajiGuncelleLayout);
        jInternalFrame_GirisMesajiGuncelleLayout.setHorizontalGroup(
            jInternalFrame_GirisMesajiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_GirisMesajiGuncelleLayout.createSequentialGroup()
                .addGroup(jInternalFrame_GirisMesajiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jInternalFrame_GirisMesajiGuncelleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame_GirisMesajiGuncelleLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jInternalFrame_GirisMesajiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_GirisMesajiGuncelle_Kaydet)
                            .addGroup(jInternalFrame_GirisMesajiGuncelleLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jInternalFrame_GirisMesajiGuncelleLayout.setVerticalGroup(
            jInternalFrame_GirisMesajiGuncelleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_GirisMesajiGuncelleLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_GirisMesajiGuncelle_Kaydet)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jInternalFrame_GirisMesajiGuncelle.setBounds(200, 10, 447, 330);
        desktopPane.add(jInternalFrame_GirisMesajiGuncelle, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame_KullaniciSil.setTitle("Kullanıcı Silme Bölümü");
        jInternalFrame_KullaniciSil.setVisible(false);
        jInternalFrame_KullaniciSil.getContentPane().setLayout(null);

        jLabel9.setText("Silmek istedğiniz Kullanıcıyı Seçiniz");
        jInternalFrame_KullaniciSil.getContentPane().add(jLabel9);
        jLabel9.setBounds(23, 11, 301, 14);

        jButton_KullaniciSil_Sil.setText("Sil");
        jButton_KullaniciSil_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KullaniciSil_SilActionPerformed(evt);
            }
        });
        jInternalFrame_KullaniciSil.getContentPane().add(jButton_KullaniciSil_Sil);
        jButton_KullaniciSil_Sil.setBounds(330, 280, 43, 23);

        jLabel_secilenKullanici.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jInternalFrame_KullaniciSil.getContentPane().add(jLabel_secilenKullanici);
        jLabel_secilenKullanici.setBounds(482, 43, 231, 23);

        jTable_KullaciSil_Kullanicilar.setModel(tabloAtaKullanici());
        jTable_KullaciSil_Kullanicilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_KullaciSil_KullanicilarMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(jTable_KullaciSil_Kullanicilar);

        jInternalFrame_KullaniciSil.getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(20, 30, 382, 236);

        jInternalFrame_KullaniciSil.setBounds(20, 10, 440, 340);
        desktopPane.add(jInternalFrame_KullaniciSil, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame_KullanıcıBilgileriDuzenle.setTitle("Kullanıcı Bilgileri Düzenle");
        jInternalFrame_KullanıcıBilgileriDuzenle.setVisible(false);

        jTable_KullaniciBilgileriDuzenle.setModel(tabloAtaKullanici());
        jTable_KullaniciBilgileriDuzenle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_KullaniciBilgileriDuzenleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_KullaniciBilgileriDuzenleMouseClicked(evt);
            }
        });
        jTable_KullaniciBilgileriDuzenle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTable_KullaniciBilgileriDuzenleMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable_KullaniciBilgileriDuzenle);

        jLabel10.setText("Güncellemek İstediğiniz Kullanıcıyı Tablodan Seçiniz");

        jLabel11.setText("               TC NO                                                  AD                                                SOYAD");

        jButton_KullaniciBilgileriGuncelle_Kaydet.setText("Kaydet");
        jButton_KullaniciBilgileriGuncelle_Kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_KullaniciBilgileriGuncelle_KaydetActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 153));
        jLabel12.setText("Kayıtları Aşağıdan Düzenleyerek \"Kaydet\" Butonuna Tıklayınız");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton_KullaniciBilgileriGuncelle_Kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jTextField_KullaniciBilgileriGuncelle_TCNo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jTextField_KullaniciBilgileriGuncelle_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(jTextField_KullaniciBilgileriGuncelle_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_KullaniciBilgileriGuncelle_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_KullaniciBilgileriGuncelle_Soyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_KullaniciBilgileriGuncelle_TCNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_KullaniciBilgileriGuncelle_Kaydet)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jInternalFrame_KullanıcıBilgileriDuzenleLayout = new javax.swing.GroupLayout(jInternalFrame_KullanıcıBilgileriDuzenle.getContentPane());
        jInternalFrame_KullanıcıBilgileriDuzenle.getContentPane().setLayout(jInternalFrame_KullanıcıBilgileriDuzenleLayout);
        jInternalFrame_KullanıcıBilgileriDuzenleLayout.setHorizontalGroup(
            jInternalFrame_KullanıcıBilgileriDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_KullanıcıBilgileriDuzenleLayout.createSequentialGroup()
                .addGroup(jInternalFrame_KullanıcıBilgileriDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jInternalFrame_KullanıcıBilgileriDuzenleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jInternalFrame_KullanıcıBilgileriDuzenleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6))
                    .addGroup(jInternalFrame_KullanıcıBilgileriDuzenleLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jInternalFrame_KullanıcıBilgileriDuzenleLayout.setVerticalGroup(
            jInternalFrame_KullanıcıBilgileriDuzenleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_KullanıcıBilgileriDuzenleLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jInternalFrame_KullanıcıBilgileriDuzenle.setBounds(60, 30, 587, 432);
        desktopPane.add(jInternalFrame_KullanıcıBilgileriDuzenle, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame_Arama.setTitle("Arama");
        jInternalFrame_Arama.setVisible(false);

        buttonGroup_Arama_Kriter.add(jRadioButton_Urun);
        jRadioButton_Urun.setText("Ürün");
        jRadioButton_Urun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_UrunActionPerformed(evt);
            }
        });

        buttonGroup_Arama_Kriter.add(jRadioButton_Kullanici);
        jRadioButton_Kullanici.setText("Kullanıcı");
        jRadioButton_Kullanici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_KullaniciActionPerformed(evt);
            }
        });

        jLabel13.setText("Lütfen Arama Yapmak İstediğiniz Kısmı Seçiniz :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jRadioButton_Kullanici)
                        .addGap(39, 39, 39)
                        .addComponent(jRadioButton_Urun))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton_Kullanici)
                    .addComponent(jRadioButton_Urun))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton_Arama_Ara.setText("Ara");
        jButton_Arama_Ara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Arama_AraActionPerformed(evt);
            }
        });

        jTable_Arama.setModel(tabloAtaArananKullanici());
        jScrollPane7.setViewportView(jTable_Arama);

        javax.swing.GroupLayout jPanel_AramaLayout = new javax.swing.GroupLayout(jPanel_Arama);
        jPanel_Arama.setLayout(jPanel_AramaLayout);
        jPanel_AramaLayout.setHorizontalGroup(
            jPanel_AramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AramaLayout.createSequentialGroup()
                .addGroup(jPanel_AramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel_AramaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7))
                    .addGroup(jPanel_AramaLayout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jTextField_Arama_Bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel_AramaLayout.createSequentialGroup()
                .addGap(311, 311, 311)
                .addComponent(jButton_Arama_Ara, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_AramaLayout.createSequentialGroup()
                .addGap(0, 66, Short.MAX_VALUE)
                .addComponent(jLabel_Arama_AramaMetni, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel_AramaLayout.setVerticalGroup(
            jPanel_AramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AramaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Arama_AramaMetni)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField_Arama_Bilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Arama_Ara)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jInternalFrame_AramaLayout = new javax.swing.GroupLayout(jInternalFrame_Arama.getContentPane());
        jInternalFrame_Arama.getContentPane().setLayout(jInternalFrame_AramaLayout);
        jInternalFrame_AramaLayout.setHorizontalGroup(
            jInternalFrame_AramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_AramaLayout.createSequentialGroup()
                .addComponent(jPanel_Arama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame_AramaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(190, 190, 190))
        );
        jInternalFrame_AramaLayout.setVerticalGroup(
            jInternalFrame_AramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_AramaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_Arama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jInternalFrame_Arama.setBounds(50, 30, 785, 477);
        desktopPane.add(jInternalFrame_Arama, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jInternalFrame_Hakkinda.setTitle("Hakkında");
        jInternalFrame_Hakkinda.setPreferredSize(new java.awt.Dimension(874, 1515));
        jInternalFrame_Hakkinda.setVisible(false);

        jScrollPane13.setWheelScrollingEnabled(false);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("\t         MENÜ\n\t1 - Kullanıcı İşlemleri\n\t\ta - Kullanıcı Ekle\n\t\tb - Kullanıcı Düzenle\n\t\tc - Kullanıcı Sil\n\t2 - Stok İşlemleri\n\t\ta - Stok Ekle\n\t\tb - Stok Güncelle\n\t\tc - Stok Listele\n\t3 - Program\n\t\ta - Giriş Mesajı Güncelle\n\t\tb - Hakkında\n\t4 - Arama\n\t\ta - Ara\n\t\t\t\t");
        jScrollPane8.setViewportView(jTextArea1);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/KullanıcıEkle.png"))); // NOI18N

        jTextArea5.setEditable(false);
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea5.setRows(5);
        jTextArea5.setText("1 - Kullanıcı İşlemleri\n  a - Kullanıcı Ekle\n\tBu kısımda sistemimize dahil etmek istediğimiz kullanıcıların TC No\n\tAd ve Soyad bilgileri ile sisteme kaydını gerçekleştirebilirsiniz.");
        jScrollPane14.setViewportView(jTextArea5);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menü.png"))); // NOI18N

        jTextArea6.setEditable(false);
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea6.setRows(5);
        jTextArea6.setText(" b - Kullanıcı Düzenle\n\tBu kısımda kullanıcınızla ilgili TC No, Ad veya Soyad alanlarında herhangi bir \n\thata tespit ettiğinizde tablodan seçerek düzenleme yapabilirsiniz.");
        jScrollPane15.setViewportView(jTextArea6);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/KullanıcıDüzenle.png"))); // NOI18N

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jTextArea7.setRows(5);
        jTextArea7.setText(" c - Kullanıcı Sil\n\tSistemle ile bağlantısı kalmayan çalışanların kayıtlarını buradan silebilirsiniz.");
        jScrollPane16.setViewportView(jTextArea7);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/KullanıcıSil.png"))); // NOI18N

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea8.setRows(5);
        jTextArea8.setText("2 - Stok İşlemleri\n  a - Stok Ekle\n\tBu kısımda sisteme eklenecek yeni ürünü \n\t\t-Marka   -Model   -Seri No   -Tarih   -Durum   -Kullanıcı Bilgileri\n\talanlarını doldurarak ekleyebilirsiniz.\n\t\t\t\t");
        jScrollPane17.setViewportView(jTextArea8);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/StokEkle.png"))); // NOI18N

        jTextArea9.setEditable(false);
        jTextArea9.setColumns(20);
        jTextArea9.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea9.setRows(5);
        jTextArea9.setText("b - Stok Güncelle\n\tBu Kısımda sistemde bulunan stok kayıtlarındaki alanlarda herhangi bir \n\tdeğişiklik yapma ihtiyacında istenilen kayıt tablodan seçilerek alt tarafa \n\tgelen bilgileri düzelterek kaydedebilirsiniz.");
        jScrollPane18.setViewportView(jTextArea9);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/StokGüncelle.png"))); // NOI18N

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/GirisMesajiGuncelle.png"))); // NOI18N

        jTextArea10.setEditable(false);
        jTextArea10.setColumns(20);
        jTextArea10.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea10.setRows(5);
        jTextArea10.setText("3 - Program\n  a - Giriş Mesajı Güncelle\n\tBu kısımda program açılışındaki mesajı güncelleyebilirsiniz.");
        jScrollPane19.setViewportView(jTextArea10);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/StokListele.png"))); // NOI18N

        jTextArea11.setEditable(false);
        jTextArea11.setColumns(20);
        jTextArea11.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea11.setRows(5);
        jTextArea11.setText("c - Stok Listele\n\tBu kısımda sistemde kayıtlı tüm stoğun ekranda listeleyebilirsiniz.");
        jScrollPane20.setViewportView(jTextArea11);

        jTextArea12.setEditable(false);
        jTextArea12.setColumns(20);
        jTextArea12.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea12.setRows(5);
        jTextArea12.setText("4 - Arama\n \tBu kısımda kayıtlı olan kullanıcı yada ürünleri herhangi bir kriter ile \n\taratabilirsiniz.");
        jScrollPane21.setViewportView(jTextArea12);

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Arama.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel23))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel19))
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel20))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel21))
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jLabel22))
                            .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(376, 376, 376)
                        .addComponent(jLabel15))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel25))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(319, 319, 319)
                        .addComponent(jLabel24))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel26)))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel22)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel26)
                .addContainerGap(1475, Short.MAX_VALUE))
        );

        jScrollPane13.setViewportView(jPanel6);

        javax.swing.GroupLayout jInternalFrame_HakkindaLayout = new javax.swing.GroupLayout(jInternalFrame_Hakkinda.getContentPane());
        jInternalFrame_Hakkinda.getContentPane().setLayout(jInternalFrame_HakkindaLayout);
        jInternalFrame_HakkindaLayout.setHorizontalGroup(
            jInternalFrame_HakkindaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_HakkindaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 1004, Short.MAX_VALUE)
                .addContainerGap())
        );
        jInternalFrame_HakkindaLayout.setVerticalGroup(
            jInternalFrame_HakkindaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame_HakkindaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jInternalFrame_Hakkinda.setBounds(10, 10, 1040, 560);
        desktopPane.add(jInternalFrame_Hakkinda, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Menu_KullaniciIslemleri.setMnemonic('f');
        Menu_KullaniciIslemleri.setText("Kullanıcı İşlemleri");
        Menu_KullaniciIslemleri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menu_KullaniciIslemleriActionPerformed(evt);
            }
        });

        jMenuItem_KullaniciEkle.setMnemonic('o');
        jMenuItem_KullaniciEkle.setText("Kullanıcı Ekle");
        jMenuItem_KullaniciEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KullaniciEkleActionPerformed(evt);
            }
        });
        Menu_KullaniciIslemleri.add(jMenuItem_KullaniciEkle);

        jMenuItem1.setText("Kullanıcı Düzenle");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Menu_KullaniciIslemleri.add(jMenuItem1);

        jMenuItem_KullaniciSil.setText("Kullanıcı Sil");
        jMenuItem_KullaniciSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_KullaniciSilActionPerformed(evt);
            }
        });
        Menu_KullaniciIslemleri.add(jMenuItem_KullaniciSil);

        menuBar.add(Menu_KullaniciIslemleri);

        Menu_StokIslemleri.setText("Stok İşlemleri");

        jMenuItem_StokEkle.setMnemonic('s');
        jMenuItem_StokEkle.setText("Stok Ekle");
        jMenuItem_StokEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_StokEkleActionPerformed(evt);
            }
        });
        Menu_StokIslemleri.add(jMenuItem_StokEkle);

        jMenuItem_StokDuzenle.setText("Stok Güncelle");
        jMenuItem_StokDuzenle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_StokDuzenleActionPerformed(evt);
            }
        });
        Menu_StokIslemleri.add(jMenuItem_StokDuzenle);

        jMenuItem_StokListele.setText("Stok Listele");
        jMenuItem_StokListele.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_StokListeleActionPerformed(evt);
            }
        });
        Menu_StokIslemleri.add(jMenuItem_StokListele);

        menuBar.add(Menu_StokIslemleri);

        jMenu_Program.setText("Program");

        jMenuItem2.setText("Giriş Mesajı Güncelle");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu_Program.add(jMenuItem2);

        jMenuItem_Program_Hakkında.setText("Hakkında");
        jMenuItem_Program_Hakkında.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_Program_HakkındaActionPerformed(evt);
            }
        });
        jMenu_Program.add(jMenuItem_Program_Hakkında);

        menuBar.add(jMenu_Program);

        jMenu_Arama.setText("Arama");
        jMenu_Arama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu_AramaActionPerformed(evt);
            }
        });

        jMenuItem3.setText("Ara");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu_Arama.add(jMenuItem3);

        menuBar.add(jMenu_Arama);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem_KullaniciEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KullaniciEkleActionPerformed
        visibleAyarla( jInternalFrame_Kullanici);
    }//GEN-LAST:event_jMenuItem_KullaniciEkleActionPerformed

    private DefaultTableModel tabloAta()
    {
        DefaultTableModel tablo = new DefaultTableModel()
        { 
		public boolean isCellEditable(int row, int column)
		{  
	          return false;  
		}
	};
        
        tablo.addColumn("ID");
        tablo.addColumn("TÜR");
        tablo.addColumn("MARKA");
        tablo.addColumn("MODEL");
        tablo.addColumn("SERİ NO");
        tablo.addColumn("ALINMA TARİH");
        tablo.addColumn("DURUM");
        tablo.addColumn("KULLANICI");
        
        try
        {
            BufferedReader bufReader = dosyaOku(stokFile);
            String sCurrentLine;
            
            while ((sCurrentLine = bufReader.readLine()) != null) 
            {
                Vector vectorBilgiler=new Vector(8);
                String[] parcalar = sCurrentLine.split(" & ");
                vectorBilgiler.add(parcalar[0]); 
                vectorBilgiler.add(parcalar[1]); 
                vectorBilgiler.add(parcalar[2]);
                vectorBilgiler.add(parcalar[3]); 
                vectorBilgiler.add(parcalar[4]);
                vectorBilgiler.add(parcalar[5]);
                vectorBilgiler.add(parcalar[6]); 
                vectorBilgiler.add(parcalar[7]);
                tablo.addRow(vectorBilgiler);
            }
            bufReader.close();
        
        }catch(Exception Hata){}
        
        return tablo;
    }
    
    private DefaultTableModel tabloAtaArananUrun()
    {
        DefaultTableModel tablo = new DefaultTableModel()
            {   public boolean isCellEditable(int row, int column)  {  return false;  }     };
        
        tablo.addColumn("ID");
        tablo.addColumn("TÜR");
        tablo.addColumn("MARKA");
        tablo.addColumn("MODEL");
        tablo.addColumn("SERİ NO");
        tablo.addColumn("ALINMA TARİH");
        tablo.addColumn("DURUM");
        tablo.addColumn("KULLANICI");
        
        try
        {
            BufferedReader bufReader = dosyaOku(stokFile);
            String sCurrentLine;
            
            while ((sCurrentLine = bufReader.readLine()) != null) 
            {
                String[] parcalar = sCurrentLine.split(" & ");
                if(parcalar[1].equalsIgnoreCase(aranacakDeger) || 
                   parcalar[2].equalsIgnoreCase(aranacakDeger) ||
                   parcalar[3].equalsIgnoreCase(aranacakDeger) ||
                   parcalar[4].equalsIgnoreCase(aranacakDeger) ||
                   parcalar[5].equalsIgnoreCase(aranacakDeger) ||
                   parcalar[6].equalsIgnoreCase(aranacakDeger) ||
                   parcalar[7].equalsIgnoreCase(aranacakDeger))
                {
                    Vector vectorBilgiler=new Vector(8);
                    vectorBilgiler.add(parcalar[0]); 
                    vectorBilgiler.add(parcalar[1]); 
                    vectorBilgiler.add(parcalar[2]);
                    vectorBilgiler.add(parcalar[3]); 
                    vectorBilgiler.add(parcalar[4]);
                    vectorBilgiler.add(parcalar[5]);
                    vectorBilgiler.add(parcalar[6]); 
                    vectorBilgiler.add(parcalar[7]);
                    tablo.addRow(vectorBilgiler);
                    kayitVarMi=true;
                }
            }
            bufReader.close();
        
        }catch(Exception Hata){}
        
        return tablo;
    }
    
    private DefaultTableModel tabloAtaArananKullanici()
    {
        DefaultTableModel tablo = new DefaultTableModel()
        { public boolean isCellEditable(int row, int column){  return false;  } };
        tablo.addColumn("ID");
        tablo.addColumn("TC NO");
        tablo.addColumn("AD");
        tablo.addColumn("SOYAD");
        
        try
        {
            BufferedReader bufReader = dosyaOku(kullanicilarFile);
            String sCurrentLine;
            while ((sCurrentLine = bufReader.readLine()) != null) 
            {
                String[] parcalar = sCurrentLine.split(" & ");
                if(parcalar[1].equalsIgnoreCase(aranacakDeger) || 
                   parcalar[2].equalsIgnoreCase(aranacakDeger) ||
                   parcalar[3].equalsIgnoreCase(aranacakDeger))
                {
                    Vector vectorBilgiler=new Vector(4);
                    vectorBilgiler.add(parcalar[0]); 
                    vectorBilgiler.add(parcalar[1]); 
                    vectorBilgiler.add(parcalar[2]);
                    vectorBilgiler.add(parcalar[3]); 
                    tablo.addRow(vectorBilgiler);
                    kayitVarMi=true;
                }
            }
            
            bufReader.close();
        
        }catch(Exception Hata){}
        
        return tablo;
    }
    
    private DefaultTableModel tabloAtaKullanici()
    {
        DefaultTableModel tablo = new DefaultTableModel()
        { 
		public boolean isCellEditable(int row, int column)
		{  
	          return false;  
		}
	};
        tablo.addColumn("ID");
        tablo.addColumn("TC NO");
        tablo.addColumn("AD");
        tablo.addColumn("SOYAD");
        
        try
        {
            BufferedReader bufReader = dosyaOku(kullanicilarFile);
            
            String sCurrentLine;
            
            while ((sCurrentLine = bufReader.readLine()) != null) 
            {
                Vector vectorBilgiler=new Vector(4);
                String[] parcalar = sCurrentLine.split(" & ");
                vectorBilgiler.add(parcalar[0]); 
                vectorBilgiler.add(parcalar[1]); 
                vectorBilgiler.add(parcalar[2]);
                vectorBilgiler.add(parcalar[3]); 
                
                tablo.addRow(vectorBilgiler);
            }
            bufReader.close();
        
        }catch(Exception Hata){}
        
        return tablo;
    }
    private DefaultComboBoxModel comboBoxAta(File file,int index)
    {
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        try 
        {   
            BufferedReader bufReader = dosyaOku(file);
            String sCurrentLine;
            String bilgiler;
            while ((sCurrentLine = bufReader.readLine()) != null) {
                String[] parcalar = sCurrentLine.split(" & ");
                model.addElement(parcalar[index]);
            }
            bufReader.close();
        } catch (Exception hata) { }
        return model;
    }
    private DefaultComboBoxModel comboBoxTurDurumAta()
    {
         
        DefaultComboBoxModel modelKullanici = comboBoxAta(durumFile,1);
        return modelKullanici;
    }
    private DefaultComboBoxModel comboBoxTurItemAta(){
         
        DefaultComboBoxModel modelKullanici = comboBoxAta(turlerFile,1);
        return modelKullanici;
    }
    private DefaultComboBoxModel comboBoxItemAta() 
    {
        DefaultComboBoxModel modelKullanici = comboBoxAta(kullanicilarFile,1);
        return modelKullanici;
    }

    private BufferedWriter dosyaYaz(File file)
    {
        try
        {
            OutputStream yaz = new FileOutputStream(file);
            OutputStreamWriter out = new OutputStreamWriter(yaz,"Cp1254");
            bufWriter = new BufferedWriter(out);
        }catch(Exception hata){}
        return bufWriter;
    }
    private BufferedReader dosyaOku(File file)
    {
        try
        {
            InputStream oku = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(oku, "Cp1254");
            bufReader = new BufferedReader(isr);
        }catch(Exception hata){}
        return bufReader;
    }
    private String labelIdAta() {
        int id = 0;
        try 
        {
            //InputStream okuStok = new FileInputStream(stokFile);
            //InputStreamReader isrStok = new InputStreamReader(okuStok, "Cp1254");
            //BufferedReader bufReaderStok = new BufferedReader(isrStok);
            BufferedReader bufReaderStok = dosyaOku(stokFile);
            String sCurrentLine;
            String ID = null;
            while ((sCurrentLine = bufReaderStok.readLine()) != null) {
                String[] parcalar = sCurrentLine.split(" & ");
                ID = parcalar[0];
            }

            bufReaderStok.close();
            id = Integer.parseInt(ID);
            id++;
        } catch (Exception hata) { }
        return String.valueOf(id);
    }

    private void jButton_KullaniciKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KullaniciKaydetActionPerformed
        try {
            OutputStream yazKullanicilar = new FileOutputStream(kullanicilarFile, true);
            OutputStreamWriter outKullanicilar = new OutputStreamWriter(yazKullanicilar, "Cp1254");
            BufferedWriter bufWriterKullanicilar = new BufferedWriter(outKullanicilar);

            String bilgiler = TextField_TCNo1.getText() + " & " + TextField_Ad.getText() + " & " + TextField_Soyad.getText();
            bufWriterKullanicilar.write(bilgiler);
            bufWriterKullanicilar.newLine();

            JOptionPane.showMessageDialog(null, "Kullanıcı Kayıt Başarılı", "Teşekkürler", JOptionPane.PLAIN_MESSAGE);
            bufWriterKullanicilar.close();

            TextField_TCNo1.setText("");
            TextField_Ad.setText("");
            TextField_Soyad.setText("");
        } catch (Exception hata) {
            JOptionPane.showMessageDialog(null, "Dosya Açma Hatası!", "HATA", JOptionPane.PLAIN_MESSAGE);
             guncelle();
        }


    }//GEN-LAST:event_jButton_KullaniciKaydetActionPerformed

    private void Menu_KullaniciIslemleriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menu_KullaniciIslemleriActionPerformed
    }//GEN-LAST:event_Menu_KullaniciIslemleriActionPerformed

    private void jMenuItem_StokListeleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_StokListeleActionPerformed
       visibleAyarla(jInternalFrame_StokListele);
    }//GEN-LAST:event_jMenuItem_StokListeleActionPerformed

    private void jButton_KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KaydetActionPerformed
        try {
            OutputStream yazStok = new FileOutputStream(stokFile, true);
            OutputStreamWriter outStok = new OutputStreamWriter(yazStok, "Cp1254");
            BufferedWriter bufWriterStok = new BufferedWriter(outStok);

            String bilgiler = jLabelID2.getText() + " & " + jComboBox_Tur.getSelectedItem() + " & " + jTextField_Marka.getText() + " & " + jTextField_Model.getText() + " & " + jTextField_SeriNo.getText()
            + " & " + jTextField_Tarih.getText() + " & " + jComboBox_Durum.getSelectedItem()+ " & " + jComboBox_Kullanici.getSelectedItem();
            bufWriterStok.write(bilgiler);
            bufWriterStok.newLine();

            JOptionPane.showMessageDialog(null, "Stok Kayıt Başarılı", "Teşekkürler", JOptionPane.PLAIN_MESSAGE);
            bufWriterStok.close();

            jLabelID2.setText("");
            jTextField_Marka.setText("");
            jTextField_SeriNo.setText("");
            jTextField_Model.setText("");
            jTextField_Tarih.setText("");
            jComboBox_Tur.setSelectedIndex(-1);
            jComboBox_Kullanici.setSelectedIndex(-1);
            jComboBox_Durum.setSelectedIndex(-1);
            jLabelID2.setText( labelIdAta() );
            guncelle();
        } catch (Exception hata) {
            JOptionPane.showMessageDialog(null, "Dosya Açma Hatası!", "HATA", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_jButton_KaydetActionPerformed

    private void jMenuItem_StokEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_StokEkleActionPerformed
        visibleAyarla(jInternalFrame_Stok);
    }//GEN-LAST:event_jMenuItem_StokEkleActionPerformed

    private void jMenuItem_StokDuzenleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_StokDuzenleActionPerformed
        visibleAyarla(jInternalFrame_StokGuncelle);
    }//GEN-LAST:event_jMenuItem_StokDuzenleActionPerformed

    private void visibleAyarla(javax.swing.JInternalFrame internalFrame)
    {
        jInternalFrame_StokGuncelle.setVisible(false);
        jInternalFrame_StokListele.setVisible(false);
        jInternalFrame_Kullanici.setVisible(false);
        jInternalFrame_Stok.setVisible(false);  
        jInternalFrame_Hosgeldiniz.setVisible(false);
        jInternalFrame_GirisMesajiGuncelle.setVisible(false);
        jInternalFrame_KullaniciSil.setVisible(false);
        jInternalFrame_KullanıcıBilgileriDuzenle.setVisible(false);
        jInternalFrame_Arama.setVisible(false);
        jInternalFrame_Hakkinda.setVisible(false);
        internalFrame.setVisible(true);
    }
    private int ID_Ara(File file,String string)
    {
        int ID=0;
        try
        {
            BufferedReader bufReaderStok = dosyaOku(file);
            String sCurrentLine;
            while ((sCurrentLine = bufReaderStok.readLine()) != null) 
            {
                String[] parcalar = sCurrentLine.split(" & ");
                if(parcalar[1].equalsIgnoreCase(string))
                    ID = Integer.parseInt(parcalar[0])-1;
            }
            bufReaderStok.close();
        }
        catch(Exception hata){}
            
        return ID;
    }
    
    
    
    private void jTable_StokGuncelleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_StokGuncelleMouseClicked
        secilenID = jTable_StokGuncelle.getSelectedRow();
        secilenID=secilenID+1;
        
        try
        {
            BufferedReader bufReaderStok = dosyaOku(stokFile);
            String sCurrentLine;
            while ((sCurrentLine = bufReaderStok.readLine()) != null)
            {
                String[] parcalar = sCurrentLine.split(" & ");
                if(parcalar[0].equalsIgnoreCase(String.valueOf(secilenID)))
                {
                   int turID = ID_Ara(turlerFile,parcalar[1]);
                    jComboBox_StokGuncelle_Tur.setSelectedIndex(turID);
                    jTextField_StokGuncelle_Marka.setText(parcalar[2]);
                    jTextField_StokGuncelle_Model.setText(parcalar[3]);
                    jTextField_StokGuncelle_SeriNo.setText(parcalar[4]);
                    jTextField_StokGuncelle_AlinmaTarihi.setText(parcalar[5]);
                    int durumID = ID_Ara(durumFile,parcalar[6]);
                    jComboBox_StokGuncelle_Durum.setSelectedIndex(durumID);
                    int kullanicilarID = ID_Ara(kullanicilarFile,parcalar[7]);
                    jComboBox_StokGuncelle_Kullanici.setSelectedIndex(kullanicilarID);
                }
            }
            bufReaderStok.close();
            secilenID = -1;
        }catch(Exception hata){}
        
    }//GEN-LAST:event_jTable_StokGuncelleMouseClicked

    private void jButton_StokGuncelle_KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_StokGuncelle_KaydetActionPerformed
        String sCurrentLine; 
        try
         {
            BufferedWriter bufWriterTmp = dosyaYaz(tmpFile); 
            BufferedReader bufReaderStok = dosyaOku(stokFile);
        
            while ((sCurrentLine = bufReaderStok.readLine()) != null)
            {
		String[] parcalar = sCurrentLine.split(" & ");
                if(parcalar[0].equalsIgnoreCase( String.valueOf(secilenID) ))
		{
                    String duzenlenenBilgi = secilenID+" & "+
                    jComboBox_StokGuncelle_Tur.getSelectedItem()+" & "+
                    jTextField_StokGuncelle_Marka.getText()+" & "+
                    jTextField_StokGuncelle_Model.getText()+" & "+
                    jTextField_StokGuncelle_SeriNo.getText()+" & "+
                    jTextField_StokGuncelle_AlinmaTarihi.getText()+" & "+
                    jComboBox_StokGuncelle_Durum.getSelectedItem()+" & "+
                    jComboBox_StokGuncelle_Kullanici.getSelectedItem();
                    sCurrentLine = duzenlenenBilgi;
                }
                bufWriterTmp.write(sCurrentLine);
		bufWriterTmp.newLine();
            }
             bufWriterTmp.close();
             bufReaderStok.close();
             stokFile.delete();
	     tmpFile.renameTo(stokFile);
             JOptionPane.showMessageDialog(null, "Stok Güncellenmeniz Gerçekleştirildi.", "Başarılı", JOptionPane.PLAIN_MESSAGE);
             guncelle();
             
         }catch(Exception hata){}        
        
    }//GEN-LAST:event_jButton_StokGuncelle_KaydetActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        //visibleAyarla(jInternalFrame_Hosgeldiniz);
        //jTextArea_GirisMesaji.setEditable(true);
        visibleAyarla(jInternalFrame_GirisMesajiGuncelle);
       // jTextArea_GirisMesajiGuncelle.setText(jTextArea_GirisMesaji.getText());     
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton_GirisMesajiGuncelle_KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_GirisMesajiGuncelle_KaydetActionPerformed
        jTextArea_GirisMesaji.setText(jTextArea_GirisMesajiGuncelle.getText());
        visibleAyarla( jInternalFrame_Hosgeldiniz);
       
       String sCurrentLine; 
       String mesaj= null;
       try
       {
            BufferedWriter bufWriter = dosyaYaz(girisMesajiFile);
            mesaj = jTextArea_GirisMesajiGuncelle.getText();
            bufWriter.write(mesaj);
            bufWriter.close();
       }catch(Exception hata){}  
    }//GEN-LAST:event_jButton_GirisMesajiGuncelle_KaydetActionPerformed

    private void jMenuItem_KullaniciSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_KullaniciSilActionPerformed
        visibleAyarla( jInternalFrame_KullaniciSil);
    }//GEN-LAST:event_jMenuItem_KullaniciSilActionPerformed

    private void jButton_KullaniciSil_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KullaniciSil_SilActionPerformed

        if(secilenID==-1)
            JOptionPane.showMessageDialog(null, "Lütfen Bir Kayıt Seçiniz", "Teşekkürler", JOptionPane.PLAIN_MESSAGE);
        else
        {
            String sCurrentLine; 
            try
             {
                BufferedWriter bufWriterTmp = dosyaYaz(tmpFile); 
                BufferedReader bufReader = dosyaOku(kullanicilarFile);

                while ((sCurrentLine = bufReader.readLine()) != null)
                {
                    String[] parcalar = sCurrentLine.split(" & ");
                    if(parcalar[0].equalsIgnoreCase( String.valueOf(secilenID) ))
                    {
                            
                    }
                    else
                    {
                        bufWriterTmp.write(sCurrentLine);
                        bufWriterTmp.newLine();
                    }
                }
                 bufWriterTmp.close();
                 bufReader.close();
                 kullanicilarFile.delete();
                 tmpFile.renameTo(kullanicilarFile);
                 JOptionPane.showMessageDialog(null, "Kullanici Silme İşleminiz Gerçekleştirildi.", "Başarılı", JOptionPane.PLAIN_MESSAGE);
                 guncelle();
             }catch(Exception hata){}        
           }
    }//GEN-LAST:event_jButton_KullaniciSil_SilActionPerformed
    
    private void guncelle()
    {
        jTable1.setModel(tabloAta());
        jTable_StokGuncelle.setModel(tabloAta());
        jTable_KullaciSil_Kullanicilar.setModel(tabloAtaKullanici());
        jTable_KullaniciBilgileriDuzenle.setModel(tabloAtaKullanici());
        jComboBox_Kullanici.setModel(comboBoxItemAta());
        jComboBox_StokGuncelle_Kullanici.setModel(comboBoxItemAta());
        
    }
    private void jTable_KullaciSil_KullanicilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_KullaciSil_KullanicilarMouseClicked
        
        secilenID = jTable_KullaciSil_Kullanicilar.getSelectedRow();
        secilenID=secilenID+1; 
    }//GEN-LAST:event_jTable_KullaciSil_KullanicilarMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        visibleAyarla(jInternalFrame_KullanıcıBilgileriDuzenle);
        
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton_KullaniciBilgileriGuncelle_KaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_KullaniciBilgileriGuncelle_KaydetActionPerformed
        String sCurrentLine; 
        try
         {
            BufferedWriter bufWriterTmp = dosyaYaz(tmpFile); 
            BufferedReader bufReader = dosyaOku(kullanicilarFile);
        
            while ((sCurrentLine = bufReader.readLine()) != null)
            {
		String[] parcalar = sCurrentLine.split(" & ");
                if(parcalar[0].equalsIgnoreCase( String.valueOf(secilenID) ))
		{
                    String duzenlenenBilgi = secilenID+" & "+
                    jTextField_KullaniciBilgileriGuncelle_TCNo.getText()+" & "+
                    jTextField_KullaniciBilgileriGuncelle_Ad.getText()+" & "+
                    jTextField_KullaniciBilgileriGuncelle_Soyad.getText();
                    sCurrentLine = duzenlenenBilgi;
                }
                bufWriterTmp.write(sCurrentLine);
		bufWriterTmp.newLine();
            }
             bufWriterTmp.close();
             bufReader.close();
             kullanicilarFile.delete();
	     tmpFile.renameTo(kullanicilarFile);
             JOptionPane.showMessageDialog(null, "Kullanıcı Güncellenmeniz Gerçekleştirildi.", "Başarılı", JOptionPane.PLAIN_MESSAGE);
             guncelle();
             secilenID=-1;
             jTextField_KullaniciBilgileriGuncelle_TCNo.setText("");
             jTextField_KullaniciBilgileriGuncelle_Ad.setText("");
             jTextField_KullaniciBilgileriGuncelle_Soyad.setText("");
         }catch(Exception hata){}     
    }//GEN-LAST:event_jButton_KullaniciBilgileriGuncelle_KaydetActionPerformed

    private void jTable_KullaniciBilgileriDuzenleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_KullaniciBilgileriDuzenleMouseClicked
        secilenID = jTable_KullaniciBilgileriDuzenle.getSelectedRow();
        secilenID=secilenID+1;
        try
        {
            BufferedReader bufReaderStok = dosyaOku(kullanicilarFile);
            String sCurrentLine;
            while ((sCurrentLine = bufReaderStok.readLine()) != null)
            {
                String[] parcalar = sCurrentLine.split(" & ");
                if(parcalar[0].equalsIgnoreCase(String.valueOf(secilenID)))
                {
                   jTextField_KullaniciBilgileriGuncelle_TCNo.setText(parcalar[1]);
                   jTextField_KullaniciBilgileriGuncelle_Ad.setText(parcalar[2]);
                   jTextField_KullaniciBilgileriGuncelle_Soyad.setText(parcalar[3]);
                }
            }
            bufReaderStok.close();
        }catch(Exception hata){}  
    }//GEN-LAST:event_jTable_KullaniciBilgileriDuzenleMouseClicked

    private void jRadioButton_KullaniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_KullaniciActionPerformed
        jPanel_Arama.setVisible(true);
        jTable_Arama.setModel(tabloAtaArananKullanici());
        jLabel_Arama_AramaMetni.setText("Aramak İstediğiniz Kullanıcının TC No'sunu veya Adını veya Soyadını Giriniz");
    }//GEN-LAST:event_jRadioButton_KullaniciActionPerformed

    private void jRadioButton_UrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_UrunActionPerformed
        jPanel_Arama.setVisible(true);
        jTable_Arama.setModel(tabloAtaArananUrun());
        jLabel_Arama_AramaMetni.setText("Aramak İstediğiniz Ürünün Herhangi Bir Bilgisini Giriniz (Tür-Marka-Model-Seri No-Durum-Kullanıcı TC No)");
    
    }//GEN-LAST:event_jRadioButton_UrunActionPerformed

    private void jMenu_AramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu_AramaActionPerformed
        jPanel_Arama.setVisible(false);
        visibleAyarla(jInternalFrame_Arama);
    }//GEN-LAST:event_jMenu_AramaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       jPanel_Arama.setVisible(false);
        visibleAyarla(jInternalFrame_Arama);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton_Arama_AraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Arama_AraActionPerformed
      aranacakDeger = (jTextField_Arama_Bilgi.getText()).trim();
      if(jRadioButton_Kullanici.isSelected())
          jTable_Arama.setModel(tabloAtaArananKullanici());
      if(jRadioButton_Urun.isSelected())
          jTable_Arama.setModel(tabloAtaArananUrun());
      if(!kayitVarMi)
      {
          JOptionPane.showMessageDialog(null, "Aradığınız Kriterlere Uygun Kayıt Bulunamadı", "Kayıt Bulunamadı", JOptionPane.PLAIN_MESSAGE);
      }
       kayitVarMi=false;
       aranacakDeger=null;
    }//GEN-LAST:event_jButton_Arama_AraActionPerformed

    private void jMenuItem_Program_HakkındaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_Program_HakkındaActionPerformed
        visibleAyarla(jInternalFrame_Hakkinda);
    }//GEN-LAST:event_jMenuItem_Program_HakkındaActionPerformed
    private String girisMesajiGoruntule()
    {
       String sCurrentLine;
        String mesaj = null;
        try
        {
            BufferedReader bufReader = dosyaOku(girisMesajiFile);
            while ((sCurrentLine = bufReader.readLine()) != null)
            {
                if(mesaj==null)
                    mesaj = sCurrentLine;
                else
                    mesaj += sCurrentLine;
               mesaj = mesaj+"\n";
            }
        }catch(Exception hata){}
        return mesaj;
    }
    
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewMDIApplication.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewMDIApplication().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu_KullaniciIslemleri;
    private javax.swing.JMenu Menu_StokIslemleri;
    private javax.swing.JTextField TextField_Ad;
    private javax.swing.JTextField TextField_Soyad;
    private javax.swing.JTextField TextField_TCNo1;
    private javax.swing.ButtonGroup buttonGroup_Arama_Kriter;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton jButton_Arama_Ara;
    private javax.swing.JButton jButton_GirisMesajiGuncelle_Kaydet;
    private javax.swing.JButton jButton_Kaydet;
    private javax.swing.JButton jButton_KullaniciBilgileriGuncelle_Kaydet;
    private javax.swing.JButton jButton_KullaniciKaydet;
    private javax.swing.JButton jButton_KullaniciSil_Sil;
    private javax.swing.JButton jButton_StokGuncelle_Kaydet;
    private javax.swing.JComboBox jComboBox_Durum;
    private javax.swing.JComboBox jComboBox_Kullanici;
    private javax.swing.JComboBox jComboBox_StokGuncelle_Durum;
    private javax.swing.JComboBox jComboBox_StokGuncelle_Kullanici;
    private javax.swing.JComboBox jComboBox_StokGuncelle_Tur;
    private javax.swing.JComboBox jComboBox_Tur;
    private javax.swing.JInternalFrame jInternalFrame_Arama;
    private javax.swing.JInternalFrame jInternalFrame_GirisMesajiGuncelle;
    private javax.swing.JInternalFrame jInternalFrame_Hakkinda;
    private javax.swing.JInternalFrame jInternalFrame_Hosgeldiniz;
    private javax.swing.JInternalFrame jInternalFrame_Kullanici;
    private javax.swing.JInternalFrame jInternalFrame_KullaniciSil;
    private javax.swing.JInternalFrame jInternalFrame_KullanıcıBilgileriDuzenle;
    private javax.swing.JInternalFrame jInternalFrame_Stok;
    private javax.swing.JInternalFrame jInternalFrame_StokGuncelle;
    private javax.swing.JInternalFrame jInternalFrame_StokListele;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelID2;
    private javax.swing.JLabel jLabel_Ad;
    private javax.swing.JLabel jLabel_Arama_AramaMetni;
    private javax.swing.JLabel jLabel_Durum;
    private javax.swing.JLabel jLabel_ID1;
    private javax.swing.JLabel jLabel_Kullanici;
    private javax.swing.JLabel jLabel_Marka;
    private javax.swing.JLabel jLabel_Model;
    private javax.swing.JLabel jLabel_SeriNo;
    private javax.swing.JLabel jLabel_Soyad;
    private javax.swing.JLabel jLabel_TCNo;
    private javax.swing.JLabel jLabel_Tarih;
    private javax.swing.JLabel jLabel_Tür;
    private javax.swing.JLabel jLabel_secilenKullanici;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem_KullaniciEkle;
    private javax.swing.JMenuItem jMenuItem_KullaniciSil;
    private javax.swing.JMenuItem jMenuItem_Program_Hakkında;
    private javax.swing.JMenuItem jMenuItem_StokDuzenle;
    private javax.swing.JMenuItem jMenuItem_StokEkle;
    private javax.swing.JMenuItem jMenuItem_StokListele;
    private javax.swing.JMenu jMenu_Arama;
    private javax.swing.JMenu jMenu_Program;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel_Arama;
    private javax.swing.JRadioButton jRadioButton_Kullanici;
    private javax.swing.JRadioButton jRadioButton_Urun;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable_Arama;
    private javax.swing.JTable jTable_KullaciSil_Kullanicilar;
    private javax.swing.JTable jTable_KullaniciBilgileriDuzenle;
    private javax.swing.JTable jTable_StokGuncelle;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextArea jTextArea_GirisMesaji;
    private javax.swing.JTextArea jTextArea_GirisMesajiGuncelle;
    private javax.swing.JTextField jTextField_Arama_Bilgi;
    private javax.swing.JTextField jTextField_KullaniciBilgileriGuncelle_Ad;
    private javax.swing.JTextField jTextField_KullaniciBilgileriGuncelle_Soyad;
    private javax.swing.JTextField jTextField_KullaniciBilgileriGuncelle_TCNo;
    private javax.swing.JTextField jTextField_Marka;
    private javax.swing.JTextField jTextField_Model;
    private javax.swing.JTextField jTextField_SeriNo;
    private javax.swing.JTextField jTextField_StokGuncelle_AlinmaTarihi;
    private javax.swing.JTextField jTextField_StokGuncelle_Marka;
    private javax.swing.JTextField jTextField_StokGuncelle_Model;
    private javax.swing.JTextField jTextField_StokGuncelle_SeriNo;
    private javax.swing.JTextField jTextField_Tarih;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}
