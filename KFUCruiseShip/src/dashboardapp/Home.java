
package dashboardapp;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JOptionPane ;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class Home extends javax.swing.JFrame {
     //private  double payments ;
    private double price;
    private Connection con; 
    private String db_url = "jdbc:mysql://localhost:3306/kfu";
    
    private String db_username = "root";
    private String db_password = "12345";
    
    private int des ;
    private int pack ;
    private int ticket = 0 ;
    private double pricePerNight ;
    
    private List<Object[]> searchResults = new ArrayList<>();  // List to store all records from the database as Object[] arrays
    private int currentEntryIndex = 0;   

    
   
    public Home() {
        initComponents();
        try {
            // Initialize the database connection in the constructor
            con = DriverManager.getConnection(db_url, db_username, db_password);
        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        }
        this.setLocationRelativeTo(null);
        login.setVisible(true);
        signup.setVisible(false);  // Hides the signup panel if needed
        HomePanel.setVisible(false); // Hides the home panel if needed
        jPanel1.setVisible(false);
   
        SelectionPanel.setVisible(false);
        Records.setVisible(false);
        BookingInfo.setVisible(false);
        ContactInfo.setVisible(false);
        Billpanel.setVisible(false);
        signup.setVisible(false);
        login.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Button1 = new javax.swing.JPanel();
        Indicator1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Button2 = new javax.swing.JPanel();
        Indicator2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Button3 = new javax.swing.JPanel();
        Indicator3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Button4 = new javax.swing.JPanel();
        Indicator4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Button5 = new javax.swing.JPanel();
        Indicator5 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        Button8 = new javax.swing.JPanel();
        Indicator8 = new javax.swing.JPanel();
        Button7 = new javax.swing.JPanel();
        Indicator7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        Button9 = new javax.swing.JPanel();
        Indicator9 = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_close = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        SelectionPanel = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        btn_close2 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel27 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel28 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel34 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jPanel29 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jPanel33 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel35 = new javax.swing.JPanel();
        jButton21 = new javax.swing.JButton();
        jPanel31 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jPanel37 = new javax.swing.JPanel();
        jButton23 = new javax.swing.JButton();
        jPanel32 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jPanel36 = new javax.swing.JPanel();
        jButton22 = new javax.swing.JButton();
        Records = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        btn_close3 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel68 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jTextField18 = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();
        jButton26 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jTextField19 = new javax.swing.JTextField();
        jButton28 = new javax.swing.JButton();
        BookingInfo = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        btn_close4 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jPanel41 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        JRBDeluxe = new javax.swing.JRadioButton();
        jLabel63 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        JRBStandard = new javax.swing.JRadioButton();
        jLabel65 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        JRBLuxury = new javax.swing.JRadioButton();
        ContactInfo = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        btn_close6 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel41 = new javax.swing.JLabel();
        JRBCash = new javax.swing.JRadioButton();
        JRBCard = new javax.swing.JRadioButton();
        SubmitButton = new javax.swing.JButton();
        Billpanel = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        totalAmountLabel = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        login = new javax.swing.JPanel();
        Right = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        left = new javax.swing.JPanel();
        btn_close1 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton3 = new javax.swing.JButton();
        jLabel52 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        signup = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        btn_close5 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel56 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel58 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setLocationByPlatform(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Button1.setBackground(new java.awt.Color(255, 255, 255));
        Button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button1MouseExited(evt);
            }
        });

        Indicator1.setBackground(new java.awt.Color(185, 218, 235));
        Indicator1.setOpaque(false);

        javax.swing.GroupLayout Indicator1Layout = new javax.swing.GroupLayout(Indicator1);
        Indicator1.setLayout(Indicator1Layout);
        Indicator1Layout.setHorizontalGroup(
            Indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator1Layout.setVerticalGroup(
            Indicator1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(49, 133, 179));
        jLabel1.setText("Home ");

        javax.swing.GroupLayout Button1Layout = new javax.swing.GroupLayout(Button1);
        Button1.setLayout(Button1Layout);
        Button1Layout.setHorizontalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button1Layout.createSequentialGroup()
                .addComponent(Indicator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Button1Layout.setVerticalGroup(
            Button1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 175, 232, -1));

        Button2.setBackground(new java.awt.Color(255, 255, 255));
        Button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button2MouseExited(evt);
            }
        });

        Indicator2.setBackground(new java.awt.Color(185, 218, 235));
        Indicator2.setOpaque(false);

        javax.swing.GroupLayout Indicator2Layout = new javax.swing.GroupLayout(Indicator2);
        Indicator2.setLayout(Indicator2Layout);
        Indicator2Layout.setHorizontalGroup(
            Indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator2Layout.setVerticalGroup(
            Indicator2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(49, 133, 179));
        jLabel2.setText("Booking");

        javax.swing.GroupLayout Button2Layout = new javax.swing.GroupLayout(Button2);
        Button2.setLayout(Button2Layout);
        Button2Layout.setHorizontalGroup(
            Button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button2Layout.createSequentialGroup()
                .addComponent(Indicator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Button2Layout.setVerticalGroup(
            Button2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 227, 232, -1));

        Button3.setBackground(new java.awt.Color(255, 255, 255));
        Button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button3MouseExited(evt);
            }
        });

        Indicator3.setBackground(new java.awt.Color(185, 218, 235));
        Indicator3.setOpaque(false);

        javax.swing.GroupLayout Indicator3Layout = new javax.swing.GroupLayout(Indicator3);
        Indicator3.setLayout(Indicator3Layout);
        Indicator3Layout.setHorizontalGroup(
            Indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator3Layout.setVerticalGroup(
            Indicator3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 133, 179));
        jLabel3.setText("Booking Records");

        javax.swing.GroupLayout Button3Layout = new javax.swing.GroupLayout(Button3);
        Button3.setLayout(Button3Layout);
        Button3Layout.setHorizontalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button3Layout.createSequentialGroup()
                .addComponent(Indicator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Button3Layout.setVerticalGroup(
            Button3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(Button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 279, 232, -1));

        Button4.setBackground(new java.awt.Color(255, 255, 255));
        Button4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button4MouseExited(evt);
            }
        });

        Indicator4.setBackground(new java.awt.Color(185, 218, 235));
        Indicator4.setOpaque(false);

        javax.swing.GroupLayout Indicator4Layout = new javax.swing.GroupLayout(Indicator4);
        Indicator4.setLayout(Indicator4Layout);
        Indicator4Layout.setHorizontalGroup(
            Indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator4Layout.setVerticalGroup(
            Indicator4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(49, 133, 179));
        jLabel4.setText("Booking info");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        Button5.setBackground(new java.awt.Color(255, 255, 255));
        Button5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button5MouseExited(evt);
            }
        });

        Indicator5.setBackground(new java.awt.Color(185, 218, 235));
        Indicator5.setOpaque(false);

        javax.swing.GroupLayout Indicator5Layout = new javax.swing.GroupLayout(Indicator5);
        Indicator5.setLayout(Indicator5Layout);
        Indicator5Layout.setHorizontalGroup(
            Indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator5Layout.setVerticalGroup(
            Indicator5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button5Layout = new javax.swing.GroupLayout(Button5);
        Button5.setLayout(Button5Layout);
        Button5Layout.setHorizontalGroup(
            Button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button5Layout.createSequentialGroup()
                .addComponent(Indicator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button5Layout.setVerticalGroup(
            Button5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button4Layout = new javax.swing.GroupLayout(Button4);
        Button4.setLayout(Button4Layout);
        Button4Layout.setHorizontalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button4Layout.createSequentialGroup()
                .addComponent(Indicator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Button4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Button4Layout.setVerticalGroup(
            Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Button4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Button4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Button5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(Button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 232, -1));
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 39, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardapp/images/LOGO.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 57, 100, 100));

        jPanel14.setBackground(new java.awt.Color(185, 218, 235));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, -1));

        jPanel13.setBackground(new java.awt.Color(117, 182, 217));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 100, 40));

        Button8.setBackground(new java.awt.Color(255, 255, 255));
        Button8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button8MouseExited(evt);
            }
        });

        Indicator8.setBackground(new java.awt.Color(185, 218, 235));
        Indicator8.setOpaque(false);

        javax.swing.GroupLayout Indicator8Layout = new javax.swing.GroupLayout(Indicator8);
        Indicator8.setLayout(Indicator8Layout);
        Indicator8Layout.setHorizontalGroup(
            Indicator8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator8Layout.setVerticalGroup(
            Indicator8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button8Layout = new javax.swing.GroupLayout(Button8);
        Button8.setLayout(Button8Layout);
        Button8Layout.setHorizontalGroup(
            Button8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button8Layout.createSequentialGroup()
                .addComponent(Indicator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Button8Layout.setVerticalGroup(
            Button8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Button8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 232, -1));

        Button7.setBackground(new java.awt.Color(255, 255, 255));
        Button7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button7MouseExited(evt);
            }
        });

        Indicator7.setBackground(new java.awt.Color(185, 218, 235));
        Indicator7.setOpaque(false);

        javax.swing.GroupLayout Indicator7Layout = new javax.swing.GroupLayout(Indicator7);
        Indicator7.setLayout(Indicator7Layout);
        Indicator7Layout.setHorizontalGroup(
            Indicator7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator7Layout.setVerticalGroup(
            Indicator7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(49, 133, 179));
        jLabel27.setText("LogOut");

        Button9.setBackground(new java.awt.Color(255, 255, 255));
        Button9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Button9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Button9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Button9MouseExited(evt);
            }
        });

        Indicator9.setBackground(new java.awt.Color(185, 218, 235));
        Indicator9.setOpaque(false);

        javax.swing.GroupLayout Indicator9Layout = new javax.swing.GroupLayout(Indicator9);
        Indicator9.setLayout(Indicator9Layout);
        Indicator9Layout.setHorizontalGroup(
            Indicator9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        Indicator9Layout.setVerticalGroup(
            Indicator9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button9Layout = new javax.swing.GroupLayout(Button9);
        Button9.setLayout(Button9Layout);
        Button9Layout.setHorizontalGroup(
            Button9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button9Layout.createSequentialGroup()
                .addComponent(Indicator9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 224, Short.MAX_VALUE))
        );
        Button9Layout.setVerticalGroup(
            Button9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Button7Layout = new javax.swing.GroupLayout(Button7);
        Button7.setLayout(Button7Layout);
        Button7Layout.setHorizontalGroup(
            Button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button7Layout.createSequentialGroup()
                .addComponent(Indicator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel27)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Button7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Button7Layout.setVerticalGroup(
            Button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Indicator7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(Button7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Button7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Button9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel1.add(Button7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 232, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 530));

        HomePanel.setBackground(new java.awt.Color(247, 247, 247));
        HomePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HomePanelMouseDragged(evt);
            }
        });
        HomePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HomePanelMousePressed(evt);
            }
        });
        HomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(49, 133, 179));
        jLabel5.setText("Welcome back To KFU cruise system ..");
        HomePanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 490, 37));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(49, 133, 179));
        jLabel8.setText("360/144");

        jLabel6.setForeground(new java.awt.Color(49, 133, 179));
        jLabel6.setText("per person");

        jPanel11.setBackground(new java.awt.Color(185, 218, 235));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        HomePanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 150, 140, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(49, 133, 179));
        jLabel7.setText("Capacity");
        HomePanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 80, 41));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(49, 133, 179));
        jLabel9.setText("24   ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 22, -1, -1));

        jPanel10.setBackground(new java.awt.Color(185, 218, 235));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 10));

        jLabel26.setForeground(new java.awt.Color(49, 133, 179));
        jLabel26.setText("Day");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 95, 24));

        HomePanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 130, 90));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(49, 133, 179));
        jLabel10.setText("Time Left");
        HomePanel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 124, 41));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(49, 133, 179));
        jLabel11.setText("$88000");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 21, 110, -1));

        jPanel12.setBackground(new java.awt.Color(185, 218, 235));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 10));

        jLabel13.setForeground(new java.awt.Color(49, 133, 179));
        jLabel13.setText("Saudi Riyal");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 95, 24));

        HomePanel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 130, 90));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(49, 133, 179));
        jLabel12.setText("Payments");
        HomePanel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 124, 40));

        btn_close.setBackground(new java.awt.Color(96, 83, 150));
        btn_close.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setText("X");
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
        });
        HomePanel.add(btn_close, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 20, 30));

        jPanel6.setBackground(new java.awt.Color(247, 247, 247));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(49, 133, 179));
        jLabel14.setText("Hissah");

        jLabel15.setForeground(new java.awt.Color(96, 83, 150));
        jLabel15.setText("<html> Breakfast with black coffee </html>");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(49, 133, 179));
        jLabel17.setText("Latifah");

        jLabel18.setForeground(new java.awt.Color(96, 83, 150));
        jLabel18.setText("<html>\nPancakes with maple syrup and a latte.\n</html>");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(49, 133, 179));
        jLabel22.setText("Sara");

        jLabel23.setForeground(new java.awt.Color(96, 83, 150));
        jLabel23.setText("<html>Yoga, snorkeling, and dance class. </html>");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(49, 133, 179));
        jLabel24.setText("Majd");

        jLabel25.setForeground(new java.awt.Color(96, 83, 150));
        jLabel25.setText("<html>Cinema ticket for the Harry Potter movie. </html>");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        HomePanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, 350));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(49, 133, 179));
        jLabel16.setText("Recent mail");
        HomePanel.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 130, 100, -1));

        jPanel8.setBackground(new java.awt.Color(117, 182, 217));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        HomePanel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 180, -1));

        jButton18.setBackground(new java.awt.Color(185, 218, 235));
        jButton18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton18.setForeground(new java.awt.Color(49, 133, 179));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardapp/images/Jeddah.jpg"))); // NOI18N
        jButton18.setText("Jeddah");
        jButton18.setBorderPainted(false);
        jButton18.setFocusPainted(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.setIconTextGap(1);
        jButton18.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        HomePanel.add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 130, 150));

        jButton19.setBackground(new java.awt.Color(185, 218, 235));
        jButton19.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton19.setForeground(new java.awt.Color(49, 133, 179));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardapp/images/Bahrain.jpg"))); // NOI18N
        jButton19.setText("Bahrain");
        jButton19.setBorderPainted(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setIconTextGap(1);
        jButton19.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        HomePanel.add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, 130, 150));

        jButton20.setBackground(new java.awt.Color(185, 218, 235));
        jButton20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton20.setForeground(new java.awt.Color(49, 133, 179));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardapp/images/India.jpg"))); // NOI18N
        jButton20.setText("India");
        jButton20.setBorderPainted(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.setIconTextGap(1);
        jButton20.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        HomePanel.add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 130, 150));

        getContentPane().add(HomePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 780, 530));

        btn_close2.setBackground(new java.awt.Color(96, 83, 150));
        btn_close2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close2.setForeground(new java.awt.Color(255, 255, 255));
        btn_close2.setText("X");
        btn_close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close2MouseClicked(evt);
            }
        });

        jPanel25.setBackground(new java.awt.Color(117, 182, 217));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(49, 133, 179));
        jLabel34.setText("Cruise Trips Available");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(24, 65, 88));
        jLabel35.setText("Saudi Arabia, Jedddah");

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(154, 201, 228));
        jButton2.setText("More Info");
        jButton2.setToolTipText("Details about the trip. i.g. time, date... etc.");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel27.setBackground(new java.awt.Color(117, 182, 217));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton1.setBackground(new java.awt.Color(187, 219, 236));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Book Trip");
        jButton1.setToolTipText("Continues to booking information page");
        jButton1.setBorderPainted(false);
        jButton1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton1MouseWheelMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(19, 19, 19))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel26Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addComponent(jPanel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(24, 65, 88));
        jLabel36.setText("UAE, Abu Dhabi");

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(154, 201, 228));
        jButton4.setText("More Info");
        jButton4.setToolTipText("Details about the trip. i.g. time, date... etc.");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel34.setBackground(new java.awt.Color(117, 182, 217));

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton17.setBackground(new java.awt.Color(187, 219, 236));
        jButton17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("Book Trip");
        jButton17.setToolTipText("Continues to booking information page");
        jButton17.setBorderPainted(false);
        jButton17.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton17MouseWheelMoved(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4)
                .addGap(20, 20, 20))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel28Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addComponent(jPanel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(24, 65, 88));
        jLabel37.setText("Bahrain, Manama");

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(154, 201, 228));
        jButton6.setText("More Info");
        jButton6.setToolTipText("Details about the trip. i.g. time, date... etc.");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jPanel33.setBackground(new java.awt.Color(117, 182, 217));

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton16.setBackground(new java.awt.Color(187, 219, 236));
        jButton16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Book Trip");
        jButton16.setToolTipText("Continues to booking information page");
        jButton16.setBorderPainted(false);
        jButton16.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton16MouseWheelMoved(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addComponent(jPanel33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel37)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton6)
                .addGap(19, 19, 19))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel29Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addComponent(jPanel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(24, 65, 88));
        jLabel38.setText("UK, London");

        jButton8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(154, 201, 228));
        jButton8.setText("More Info");
        jButton8.setToolTipText("Details about the trip. i.g. time, date... etc.");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jPanel35.setBackground(new java.awt.Color(117, 182, 217));

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton21.setBackground(new java.awt.Color(187, 219, 236));
        jButton21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setText("Book Trip");
        jButton21.setToolTipText("Continues to booking information page");
        jButton21.setBorderPainted(false);
        jButton21.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton21MouseWheelMoved(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addComponent(jPanel35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel38)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton8)
                .addGap(21, 21, 21))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel30Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addComponent(jPanel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(24, 65, 88));
        jLabel39.setText("USA, New York");

        jButton12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(154, 201, 228));
        jButton12.setText("More Info");
        jButton12.setToolTipText("Details about the trip. i.g. time, date... etc.");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jPanel37.setBackground(new java.awt.Color(117, 182, 217));

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton23.setBackground(new java.awt.Color(187, 219, 236));
        jButton23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setText("Book Trip");
        jButton23.setToolTipText("Continues to booking information page");
        jButton23.setBorderPainted(false);
        jButton23.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton23MouseWheelMoved(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addComponent(jPanel37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel39)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton12)
                .addGap(20, 20, 20))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel31Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addComponent(jPanel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(24, 65, 88));
        jLabel40.setText("India, Mumbai");

        jButton14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(154, 201, 228));
        jButton14.setText("More Info");
        jButton14.setToolTipText("Details about the trip. i.g. time, date... etc.");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jPanel36.setBackground(new java.awt.Color(117, 182, 217));

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton22.setBackground(new java.awt.Color(187, 219, 236));
        jButton22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setText("Book Trip");
        jButton22.setToolTipText("Continues to booking information page");
        jButton22.setBorderPainted(false);
        jButton22.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                jButton22MouseWheelMoved(evt);
            }
        });
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel32Layout.createSequentialGroup()
                .addComponent(jPanel36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel40)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton14)
                .addGap(21, 21, 21))
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel32Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addGroup(jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
            .addComponent(jPanel36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1730, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btn_close2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addGap(0, 105, Short.MAX_VALUE)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_close2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout SelectionPanelLayout = new javax.swing.GroupLayout(SelectionPanel);
        SelectionPanel.setLayout(SelectionPanelLayout);
        SelectionPanelLayout.setHorizontalGroup(
            SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SelectionPanelLayout.setVerticalGroup(
            SelectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SelectionPanelLayout.createSequentialGroup()
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(SelectionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, 530));

        Records.setBackground(new java.awt.Color(247, 247, 247));
        Records.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                RecordsMouseDragged(evt);
            }
        });
        Records.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                RecordsMousePressed(evt);
            }
        });
        Records.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(49, 133, 179));
        jLabel19.setText("KFU Cruise Records ..");
        Records.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 490, 37));

        jPanel42.setBackground(new java.awt.Color(117, 182, 217));

        btn_close3.setBackground(new java.awt.Color(96, 83, 150));
        btn_close3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close3.setForeground(new java.awt.Color(255, 255, 255));
        btn_close3.setText("X");
        btn_close3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel42Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close3)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addComponent(btn_close3)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Records.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 180, -1));

        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });
        Records.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 260, 20));

        jLabel68.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(47, 128, 171));
        jLabel68.setText("Destination");
        Records.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        Records.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 90, 30, 20));

        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        Records.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 260, 20));

        jTextField13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField13ActionPerformed(evt);
            }
        });
        Records.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 260, 20));

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });
        Records.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 260, 20));

        jTextField15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField15ActionPerformed(evt);
            }
        });
        Records.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 260, 20));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(117, 182, 217));
        jLabel69.setText("of");
        Records.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        jLabel70.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(47, 128, 171));
        jLabel70.setText("First Name");
        Records.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel71.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(47, 128, 171));
        jLabel71.setText("Last Name");
        Records.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel72.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(47, 128, 171));
        jLabel72.setText("Email");
        Records.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel73.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(47, 128, 171));
        jLabel73.setText("Phone");
        Records.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        Records.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 260, 20));

        jLabel74.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(47, 128, 171));
        jLabel74.setText("Package");
        Records.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jButton15.setBackground(new java.awt.Color(117, 182, 217));
        jButton15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("Next");
        jButton15.setToolTipText("");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        Records.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 100, 20));

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });
        Records.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 30, 20));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(47, 128, 171));
        jLabel75.setText("Ticket ID");
        Records.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        jButton26.setBackground(new java.awt.Color(117, 182, 217));
        jButton26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setText("Previous");
        jButton26.setToolTipText("");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        Records.add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 100, 20));

        jPanel19.setBackground(new java.awt.Color(231, 242, 248));

        jLabel76.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(117, 182, 217));
        jLabel76.setText("Find an Entry by Last Name");

        jLabel77.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(47, 128, 171));
        jLabel77.setText("Last Name");

        jTextField17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField17ActionPerformed(evt);
            }
        });

        jButton25.setBackground(new java.awt.Color(117, 182, 217));
        jButton25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setText("Find");
        jButton25.setToolTipText("");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel77)
                        .addComponent(jLabel76)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel76)
                .addGap(18, 18, 18)
                .addComponent(jLabel77)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Records.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, 230, 160));

        jButton27.setBackground(new java.awt.Color(117, 182, 217));
        jButton27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setText("Browse All Entries");
        jButton27.setToolTipText("");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        Records.add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 230, 20));

        jTextField19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField19ActionPerformed(evt);
            }
        });
        Records.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 260, 20));

        jButton28.setBackground(new java.awt.Color(117, 182, 217));
        jButton28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setText("Delete the record");
        jButton28.setToolTipText("");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        Records.add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 230, 20));

        getContentPane().add(Records, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 780, 530));

        BookingInfo.setBackground(new java.awt.Color(247, 247, 247));
        BookingInfo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BookingInfoMouseDragged(evt);
            }
        });
        BookingInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BookingInfoMousePressed(evt);
            }
        });
        BookingInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(49, 133, 179));
        jLabel59.setText("Booking Info");
        BookingInfo.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 490, 37));

        btn_close4.setBackground(new java.awt.Color(96, 83, 150));
        btn_close4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close4.setForeground(new java.awt.Color(255, 255, 255));
        btn_close4.setText("X");
        btn_close4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close4MouseClicked(evt);
            }
        });
        BookingInfo.add(btn_close4, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 20, 30));

        jPanel43.setBackground(new java.awt.Color(117, 182, 217));

        javax.swing.GroupLayout jPanel43Layout = new javax.swing.GroupLayout(jPanel43);
        jPanel43.setLayout(jPanel43Layout);
        jPanel43Layout.setHorizontalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel43Layout.setVerticalGroup(
            jPanel43Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BookingInfo.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 180, -1));

        jPanel40.setBackground(new java.awt.Color(185, 218, 235));

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));

        jLabel61.setForeground(new java.awt.Color(96, 83, 150));
        jLabel61.setText("Description: A spacious room with a king-sized bed, sea view, and upgraded breakfast options.");

        jLabel62.setForeground(new java.awt.Color(96, 83, 150));
        jLabel62.setText("Price: $150 per night");

        buttonGroup1.add(JRBDeluxe);
        JRBDeluxe.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JRBDeluxe.setForeground(new java.awt.Color(49, 133, 179));
        JRBDeluxe.setText("Deluxe Room with View");
        JRBDeluxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBDeluxejRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel41Layout = new javax.swing.GroupLayout(jPanel41);
        jPanel41.setLayout(jPanel41Layout);
        jPanel41Layout.setHorizontalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel41Layout.createSequentialGroup()
                        .addComponent(JRBDeluxe)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel41Layout.setVerticalGroup(
            jPanel41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRBDeluxe)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel62)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Package Selection");

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));

        jLabel64.setForeground(new java.awt.Color(96, 83, 150));
        jLabel64.setText("Description: A cozy room with a queen-sized bed and a basic breakfast.");

        buttonGroup1.add(JRBStandard);
        JRBStandard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JRBStandard.setForeground(new java.awt.Color(49, 133, 179));
        JRBStandard.setText("Standard Room");
        JRBStandard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBStandardActionPerformed(evt);
            }
        });

        jLabel65.setForeground(new java.awt.Color(96, 83, 150));
        jLabel65.setText("Price: $100 per night");

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel64, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(JRBStandard)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRBStandard)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel64)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel65)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel45.setBackground(new java.awt.Color(255, 255, 255));

        jLabel66.setForeground(new java.awt.Color(96, 83, 150));
        jLabel66.setText("Description: A premium suite with a king-sized bed, sea view, complimentary breakfast, and entertainment package.");

        jLabel67.setForeground(new java.awt.Color(96, 83, 150));
        jLabel67.setText("Price: $500 per night");

        buttonGroup1.add(JRBLuxury);
        JRBLuxury.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JRBLuxury.setForeground(new java.awt.Color(49, 133, 179));
        JRBLuxury.setText("Luxury Suite");
        JRBLuxury.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBLuxuryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel45Layout.createSequentialGroup()
                        .addComponent(JRBLuxury)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel45Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JRBLuxury)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel67)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jLabel63)
                        .addGap(507, 507, 507))
                    .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel45, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jPanel41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel63)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BookingInfo.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 660, 330));

        getContentPane().add(BookingInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 780, 530));

        ContactInfo.setBackground(new java.awt.Color(247, 247, 247));
        ContactInfo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                ContactInfoMouseDragged(evt);
            }
        });
        ContactInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ContactInfoMousePressed(evt);
            }
        });
        ContactInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(49, 133, 179));
        jLabel60.setText("KFU Cruise Records ..");
        ContactInfo.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 490, 37));

        btn_close6.setBackground(new java.awt.Color(96, 83, 150));
        btn_close6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close6.setForeground(new java.awt.Color(255, 255, 255));
        btn_close6.setText("X");
        btn_close6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close6MouseClicked(evt);
            }
        });
        ContactInfo.add(btn_close6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 20, 30));

        jPanel44.setBackground(new java.awt.Color(117, 182, 217));

        javax.swing.GroupLayout jPanel44Layout = new javax.swing.GroupLayout(jPanel44);
        jPanel44.setLayout(jPanel44Layout);
        jPanel44Layout.setHorizontalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel44Layout.setVerticalGroup(
            jPanel44Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        ContactInfo.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 180, -1));

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(49, 133, 179));
        jLabel28.setText("First Name :");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(49, 133, 179));
        jLabel29.setText("Last Name :");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(49, 133, 179));
        jLabel30.setText("Email :");

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(49, 133, 179));
        jLabel31.setText("Phone Number :");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(49, 133, 179));
        jLabel32.setText("No. of Adults :");

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(49, 133, 179));
        jLabel33.setText("No. of Kids :");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel41.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(49, 133, 179));
        jLabel41.setText("Payment Method :");

        buttonGroup2.add(JRBCash);
        JRBCash.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JRBCash.setForeground(new java.awt.Color(49, 133, 179));
        JRBCash.setText("Cash");
        JRBCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBCashActionPerformed(evt);
            }
        });

        buttonGroup2.add(JRBCard);
        JRBCard.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        JRBCard.setForeground(new java.awt.Color(49, 133, 179));
        JRBCard.setText("Card");
        JRBCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRBCardActionPerformed(evt);
            }
        });

        SubmitButton.setBackground(new java.awt.Color(49, 133, 179));
        SubmitButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setText("Submit");
        SubmitButton.setBorderPainted(false);
        SubmitButton.setHideActionText(true);
        SubmitButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        Billpanel.setBackground(new java.awt.Color(225, 231, 235));

        jPanel18.setBackground(new java.awt.Color(185, 218, 235));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(49, 133, 179));
        jLabel42.setText("Bill Summary");

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(49, 133, 179));
        jLabel43.setText("Price");

        priceLabel.setText("jLabel13");

        jLabel44.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(49, 133, 179));
        jLabel44.setText("Total Amount");

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(49, 133, 179));
        jLabel45.setText("VAT");

        jLabel46.setText("15%");

        totalAmountLabel.setText("jLabel16");

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(49, 133, 179));
        jLabel47.setText("---------------------------------------------------");

        javax.swing.GroupLayout BillpanelLayout = new javax.swing.GroupLayout(Billpanel);
        Billpanel.setLayout(BillpanelLayout);
        BillpanelLayout.setHorizontalGroup(
            BillpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BillpanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(BillpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BillpanelLayout.createSequentialGroup()
                        .addComponent(jLabel42)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(BillpanelLayout.createSequentialGroup()
                        .addGroup(BillpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(BillpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(totalAmountLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(priceLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(23, 23, 23))
                    .addGroup(BillpanelLayout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BillpanelLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BillpanelLayout.setVerticalGroup(
            BillpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BillpanelLayout.createSequentialGroup()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel42)
                .addGap(32, 32, 32)
                .addGroup(BillpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(priceLabel))
                .addGap(18, 18, 18)
                .addGroup(BillpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel47)
                .addGap(28, 28, 28)
                .addGroup(BillpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(totalAmountLabel))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30)
                    .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel31)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addGap(124, 124, 124)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addComponent(jLabel32)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createSequentialGroup()
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel33)
                                .addComponent(jLabel41))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                                    .addComponent(JRBCash)
                                    .addGap(68, 68, 68)
                                    .addComponent(JRBCard))
                                .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(Billpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel32))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel33)))
                    .addComponent(Billpanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(JRBCard)
                    .addComponent(JRBCash)
                    .addComponent(SubmitButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ContactInfo.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 690, 340));

        getContentPane().add(ContactInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 780, 530));

        login.setBackground(new java.awt.Color(247, 248, 248));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        login.setPreferredSize(new java.awt.Dimension(1010, 550));
        login.setLayout(null);

        Right.setBackground(new java.awt.Color(255, 255, 255));
        Right.setName(""); // NOI18N
        Right.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardapp/images/CRuise.jpg"))); // NOI18N

        javax.swing.GroupLayout RightLayout = new javax.swing.GroupLayout(Right);
        Right.setLayout(RightLayout);
        RightLayout.setHorizontalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RightLayout.createSequentialGroup()
                .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        RightLayout.setVerticalGroup(
            RightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        login.add(Right);
        Right.setBounds(0, 0, 510, 550);

        left.setBackground(new java.awt.Color(119, 179, 199));
        left.setMinimumSize(new java.awt.Dimension(400, 500));

        btn_close1.setBackground(new java.awt.Color(96, 83, 150));
        btn_close1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close1.setForeground(new java.awt.Color(255, 255, 255));
        btn_close1.setText("X");
        btn_close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close1MouseClicked(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("LOGIN");

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Username");

        jTextField5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(51, 51, 51));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("Password");

        jPasswordField1.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(59, 135, 160));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("login");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setText("I don’t hava an account");

        jButton5.setBackground(new java.awt.Color(247, 243, 243));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(2, 67, 132));
        jButton5.setText("Sign up");
        jButton5.setPreferredSize(new java.awt.Dimension(72, 27));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftLayout = new javax.swing.GroupLayout(left);
        left.setLayout(leftLayout);
        leftLayout.setHorizontalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel49))
                    .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField5)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField1)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(leftLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(124, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close1)
                .addContainerGap())
        );
        leftLayout.setVerticalGroup(
            leftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftLayout.createSequentialGroup()
                .addComponent(btn_close1)
                .addGap(12, 12, 12)
                .addComponent(jLabel49)
                .addGap(67, 67, 67)
                .addComponent(jLabel50)
                .addGap(18, 18, 18)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel51)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jButton3)
                .addGap(53, 53, 53)
                .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        login.add(left);
        left.setBounds(510, 0, 500, 550);

        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        signup.setBackground(new java.awt.Color(255, 255, 255));
        signup.setPreferredSize(new java.awt.Dimension(1010, 550));
        signup.setLayout(null);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dashboardapp/images/CRuise.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        signup.add(jPanel21);
        jPanel21.setBounds(0, 0, 510, 550);

        jPanel22.setBackground(new java.awt.Color(119, 179, 199));
        jPanel22.setPreferredSize(new java.awt.Dimension(500, 550));

        btn_close5.setBackground(new java.awt.Color(96, 83, 150));
        btn_close5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btn_close5.setForeground(new java.awt.Color(255, 255, 255));
        btn_close5.setText("X");
        btn_close5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_close5MouseClicked(evt);
            }
        });

        jLabel54.setBackground(new java.awt.Color(255, 255, 255));
        jLabel54.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("SIGN UP");

        jLabel55.setBackground(new java.awt.Color(204, 204, 204));
        jLabel55.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Username");

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(51, 51, 51));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jLabel56.setBackground(new java.awt.Color(204, 204, 204));
        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("Email");

        jTextField9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(51, 51, 51));
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jLabel57.setBackground(new java.awt.Color(204, 204, 204));
        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Password");

        jPasswordField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(51, 51, 51));
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("I’ve an account");

        jButton7.setBackground(new java.awt.Color(59, 135, 160));
        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Sign Up");
        jButton7.setBorderPainted(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(247, 243, 243));
        jButton11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(2, 67, 132));
        jButton11.setText("Login");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel58, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(146, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_close5)
                .addGap(17, 17, 17))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addComponent(btn_close5)
                .addGap(15, 15, 15)
                .addComponent(jLabel54, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel56, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel57, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel58)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        signup.add(jPanel22);
        jPanel22.setBounds(510, 0, 510, 590);

        getContentPane().add(signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void Button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseClicked
        // TODO add your handling code here:
        onClick(Button1);
        onLeaveClick(Button2);
        onLeaveClick(Button3);
        onLeaveClick(Button4);
        
        //indicators
        Indicator1.setOpaque(true);
        Indicator2.setOpaque(false);
        Indicator3.setOpaque(false);
        Indicator4.setOpaque(false);
        
        HomePanel.setVisible(true);
        SelectionPanel.setVisible(false);
        Records.setVisible(false);
        BookingInfo.setVisible(false);
        ContactInfo.setVisible(false);
        
    }//GEN-LAST:event_Button1MouseClicked

    private void Button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseClicked
        // TODO add your handling code here:
        onClick(Button2);
         onLeaveClick(Button1);
        onLeaveClick(Button3);
        onLeaveClick(Button4);
        
         //indicators
        Indicator1.setOpaque(false);
        Indicator2.setOpaque(true);
        Indicator3.setOpaque(false);
        Indicator4.setOpaque(false);
        
        HomePanel.setVisible(false);
        SelectionPanel.setVisible(true);
        Records.setVisible(false);
        BookingInfo.setVisible(false);
        ContactInfo.setVisible(false);
        
    }//GEN-LAST:event_Button2MouseClicked

    private void Button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseClicked
        // TODO add your handling code here:
        onClick(Button3);
         onLeaveClick(Button2);
        onLeaveClick(Button1);
        onLeaveClick(Button4);
        
         //indicators
        Indicator1.setOpaque(false);
        Indicator2.setOpaque(false);
        Indicator3.setOpaque(true);
        Indicator4.setOpaque(false);
        
        HomePanel.setVisible(false);
        SelectionPanel.setVisible(false);
        Records.setVisible(true);
        BookingInfo.setVisible(false);
        ContactInfo.setVisible(false);
        
    }//GEN-LAST:event_Button3MouseClicked

    private void Button4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseClicked
        // TODO add your handling code here:
        onClick(Button4);
         onLeaveClick(Button2);
        onLeaveClick(Button3);
        onLeaveClick(Button1);
         //indicators
        Indicator1.setOpaque(false);
        Indicator2.setOpaque(false);
        Indicator3.setOpaque(false);
        Indicator4.setOpaque(true);
        
        HomePanel.setVisible(false);
        SelectionPanel.setVisible(false);
        Records.setVisible(false);
        BookingInfo.setVisible(true);
        ContactInfo.setVisible(false);
    }//GEN-LAST:event_Button4MouseClicked

    private void Button1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseEntered
        // TODO add your handling code here:
 
    }//GEN-LAST:event_Button1MouseEntered

    private void Button2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseEntered
        // TODO add your handling code here:
         
    }//GEN-LAST:event_Button2MouseEntered

    private void Button3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseEntered
        // TODO add your handling code here:
     
    }//GEN-LAST:event_Button3MouseEntered

    private void Button4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseEntered
        // TODO add your handling code here:]
         
    }//GEN-LAST:event_Button4MouseEntered

    private void Button1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button1MouseExited

    private void Button2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button2MouseExited

    private void Button3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button3MouseExited

    private void Button4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button4MouseExited

    private void HomePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMousePressed
        // TODO add your handling code here:
          xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_HomePanelMousePressed

    private void HomePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomePanelMouseDragged
        // TODO add your handling code here:
         int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_HomePanelMouseDragged

    private void Button5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseClicked

    private void Button5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseEntered

    private void Button5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button5MouseExited

    private void Button8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button8MouseClicked

    private void Button8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button8MouseEntered

    private void Button8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button8MouseExited

    private void Button9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseClicked

    private void Button9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseEntered

    private void Button9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button9MouseExited

    private void Button7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseClicked
        // TODO add your handling code here:
        jPanel1.setVisible(false);
        HomePanel.setVisible(false);
        login.setVisible(true);
   
        SelectionPanel.setVisible(false);
        Records.setVisible(false);
        BookingInfo.setVisible(false);
        ContactInfo.setVisible(false);
        Billpanel.setVisible(false);
    }//GEN-LAST:event_Button7MouseClicked

    private void Button7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_Button7MouseEntered

    private void Button7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Button7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Button7MouseExited

    private void btn_close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_close2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Launching Time: 9:30 am\n"
            + "Date: 13 November 2024", "Saudi Arabia, Jeddah Trip details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Launching Time: 12:30 pm\n"
            + "Date: 2 December 2024", "UAE, Abu Dhabi Trip details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Launching Time: 10:30 am\n"
            + "Date: 13 December 2024", "Bahrain, Manama Trip details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Launching Time: 9:30 am\n"
            + "Date: 29 January 2025", "UK, London Trip details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Launching Time: 10:00 am\n"
            + "Date: 27 February 2025", "USA, New York Trip details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Launching Time: 8:45 am\n"
            + "Date: 5 February 2025", "India, Mumbai Trip details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        HomePanel.setVisible(true);
        SelectionPanel.setVisible(false);
        
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked

    }//GEN-LAST:event_jLabel4MouseClicked

    private void btn_close3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close3MouseClicked
        // TODO add your handling code here:
        System.exit(0);

    }//GEN-LAST:event_btn_close3MouseClicked

    private void RecordsMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordsMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_RecordsMouseDragged

    private void RecordsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecordsMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecordsMousePressed

    private void btn_close4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close4MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_close4MouseClicked

    public void setPrice(double price) {

    this.price = price;
    // Calculate total amount with 15% VAT
    double vatRate = 0.15;
    double totalAmountWithVAT = price + (price * vatRate);
    priceLabel.setText("per night: $" + price);
    totalAmountLabel.setText("(with 15% VAT): $" + String.format("%.2f", totalAmountWithVAT));
    }
    
    private void JRBDeluxejRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBDeluxejRadioButton3ActionPerformed
        // TODO add your handling code here:
        if (JRBDeluxe.isSelected()) { 
             pricePerNight = 150.0;

            setPrice(pricePerNight);
            
            ContactInfo.setVisible(true);
            HomePanel.setVisible(false);
            SelectionPanel.setVisible(false);
            Records.setVisible(false);
            BookingInfo.setVisible(false);
            
            JRBDeluxe.setSelected(false);
            // Make the panel visible
            
            pack = 2 ;
        }
    }//GEN-LAST:event_JRBDeluxejRadioButton3ActionPerformed

    private void JRBStandardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBStandardActionPerformed
        // TODO add your handling code here:
        if (JRBStandard.isSelected()) { 
             pricePerNight = 100.0;

            setPrice(pricePerNight);
            
            ContactInfo.setVisible(true);
            HomePanel.setVisible(false);
            SelectionPanel.setVisible(false);
            Records.setVisible(false);
            BookingInfo.setVisible(false);
            
            JRBStandard.setSelected(false);
            // Make the panel visible
            
            pack = 1 ;
        
        }
    }//GEN-LAST:event_JRBStandardActionPerformed

    private void JRBLuxuryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBLuxuryActionPerformed
        // TODO add your handling code here:
        if (JRBLuxury.isSelected()) {
             pricePerNight = 500.0;

            setPrice(pricePerNight);
            
            ContactInfo.setVisible(true);
            HomePanel.setVisible(false);
            SelectionPanel.setVisible(false);
            Records.setVisible(false);
            BookingInfo.setVisible(false);
            
            JRBLuxury.setSelected(false);
            // Make the panel visible
            
            pack = 3 ;
        }
    }//GEN-LAST:event_JRBLuxuryActionPerformed

    private void BookingInfoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingInfoMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_BookingInfoMouseDragged

    private void BookingInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingInfoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_BookingInfoMousePressed

    private void btn_close6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_close6MouseClicked

    private void ContactInfoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactInfoMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactInfoMouseDragged

    private void ContactInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContactInfoMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContactInfoMousePressed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Launching Time: 9:30 am\n"
            + "Date: 13 November 2024", "Saudi Arabia, Jeddah Trip details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Launching Time: 10:30 am\n"
            + "Date: 13 December 2024", "Bahrain, Manama Trip details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Launching Time: 8:45 am\n"
            + "Date: 5 February 2025", "India, Mumbai Trip details", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
     
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
         
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void JRBCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBCashActionPerformed
        if (JRBCash.isSelected()) {
            Billpanel.setVisible(true);
          
        } else {
            Billpanel.setVisible(false); 
            
        }
    }//GEN-LAST:event_JRBCashActionPerformed

    private void JRBCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRBCardActionPerformed
        // TODO add your handling code here:
        if (JRBCard.isSelected()) {
            Billpanel.setVisible(true);  
             
        } else {
            Billpanel.setVisible(false); 
            
        }
    }//GEN-LAST:event_JRBCardActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
    
     String fnam=jTextField1.getText();
     String Lname =jTextField2.getText();
     String Email = jTextField3.getText();
     String Phone =jTextField4.getText();
     int numofdult = Integer.parseInt(jTextField7.getText()) ;
     int numofkid = Integer.parseInt(jTextField8.getText());
   
     //ticket++ ;
     int PackID = pack ;
     int destination = des ;
     
     String payment = "Cash";
     
      if (JRBCard.isSelected()) {
           payment="Card";  
        } 
      
      
       if(fnam.isEmpty() || Lname.isEmpty() ||  Email.isEmpty() || Phone.isEmpty() || jTextField7.getText().isEmpty() || jTextField8.getText().isEmpty())
       {
        JOptionPane.showMessageDialog(rootPane, "Please fill in all the fields!", "Error", JOptionPane.ERROR_MESSAGE);
       }
       else if (!Email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {  // Validate email format
       JOptionPane.showMessageDialog(rootPane, "Invalid email format! Ensure it includes '@' and ends with '.com' or similar.", "Error", JOptionPane.ERROR_MESSAGE);
       }
    
       
       else 
       {
       
        String sql = String.format("INSERT INTO bookingInfo( packageID, tripID, FName, LName, Email, Phone, Adults, Kids, Payment, Price) VALUES( '%d', '%d', '%s', '%s', '%s', '%s', '%d', '%d', '%s', '%f' );",
             PackID, destination, fnam, Lname, Email, Phone, numofdult, numofkid, payment, pricePerNight );

        try {
            Statement s = con.createStatement();
            s.executeUpdate(sql);  
            JOptionPane.showMessageDialog(rootPane, "Record Successfully register!");
            //payments=payments+pricePerNight;
            //jLabel11.setText(Double.toString(payments));
            HomePanel.setVisible(true);
            jPanel1.setVisible(true);
            ContactInfo.setVisible(false);
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField7.setText("");
            jTextField8.setText("");
            
           
            
        } catch(SQLException sqlException) {
            System.out.println("lohinpage erro"+sqlException.getLocalizedMessage()); 
        }
       
        
    }//GEN-LAST:event_SubmitButtonActionPerformed
    }
    private void jButton1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton1MouseWheelMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton1MouseWheelMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        BookingInfo.setVisible(true);
        SelectionPanel.setVisible(false);
        
        des = 966 ;
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton16MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton16MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16MouseWheelMoved

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
         BookingInfo.setVisible(true);
        SelectionPanel.setVisible(false);
        
        des = 973 ;
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton17MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17MouseWheelMoved

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
         BookingInfo.setVisible(true);
        SelectionPanel.setVisible(false);
        
        des = 971 ;
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton21MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton21MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21MouseWheelMoved

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
         BookingInfo.setVisible(true);
        SelectionPanel.setVisible(false);
        
        des = 44 ;
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton22MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22MouseWheelMoved

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
         BookingInfo.setVisible(true);
        SelectionPanel.setVisible(false);
        
        des = 91 ;
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_jButton23MouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23MouseWheelMoved

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        BookingInfo.setVisible(true);
        SelectionPanel.setVisible(false);
        
        des = 1 ;
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        signup.setVisible(true);
        login.setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        login.setVisible(true);
        signup.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    String username = jTextField6.getText();
    String email = jTextField9.getText();
    String password = jPasswordField2.getText();
    
    
    if(username.isEmpty() || email.isEmpty() || password.isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "Please fill in all the fields!", "Error", JOptionPane.ERROR_MESSAGE);
    } 
    
    else if (password.length() < 8) {  // Check password length
    JOptionPane.showMessageDialog(rootPane, "Password must be at least 8 characters long!", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    else if (!email.matches("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {  // Validate email format
    JOptionPane.showMessageDialog(rootPane, "Invalid email format! Ensure it includes '@' and ends with '.com' or similar.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    else {
       
        String sql = String.format("INSERT INTO users(username, email, pass) VALUES('%s', '%s', '%s');", username, email, password);

        try {
            Statement s = con.createStatement();
            s.executeUpdate(sql);  
            JOptionPane.showMessageDialog(rootPane, "SIGN-UP Successfully!");
            
            jTextField6.setText("");
            jTextField9.setText("");
            jPasswordField2.setText("");
            
            signup.setVisible(false);  
            login.setVisible(true);   
        } catch(SQLException sqlException) {
            System.out.println("loginpage error"+sqlException.getLocalizedMessage()); 
        }
    }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (evt.getSource()==jButton3){
            String username= jTextField5.getText();
            String password= jPasswordField1.getText();
            boolean loginSuccess = false;
            
            String sql= "SELECT username, pass FROM KFU.users;";
            try{
                Statement s = con.createStatement();
                ResultSet resultset = s.executeQuery(sql);
                
                while (resultset.next()) {
            if (username.equals(resultset.getObject(1)) && password.equals(resultset.getObject(2))) {
                loginSuccess = true;
                break;
            }
        }
        
        if (loginSuccess) {
            
            HomePanel.setVisible(true);
            jPanel1.setVisible(true);
            login.setVisible(false);
            
            jTextField5.setText("");
            jPasswordField1.setText("");
            
        } else {
            
            JOptionPane.showMessageDialog(this, "Invalid username or password!", "Login Failed", JOptionPane.ERROR_MESSAGE);
        }
            }
            catch(SQLException sqlException){
                System.out.println("signup erro"+sqlException.getLocalizedMessage());
            }
        
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_close1MouseClicked

    private void btn_close5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_close5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_close5MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed

    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jTextField13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField13ActionPerformed

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextField15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField15ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        //next button
        if (!searchResults.isEmpty()) {
        currentEntryIndex++;

        // Wrap to first record if index exceeds total entries
        if (currentEntryIndex >= searchResults.size()) {
            currentEntryIndex = 0;
        }
        
        displayRecord(searchResults.get(currentEntryIndex));
        jTextField11.setText(String.valueOf(searchResults.size()));    // Display total number of records
        jTextField18.setText(String.valueOf(currentEntryIndex + 1));  // Display current record number 
    }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField17ActionPerformed

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        //the find button
        String lastNameToSearch = jTextField17.getText(); // Get last name input from the admin
        
        if (lastNameToSearch.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a last name to search.");
        return;
    }

    try {
        // Query to find a record matching the last name (joining two tables)
        String query = "SELECT b.ticketID, b.FName, b.LName, b.Email, b.Phone, b.PackageID, s.countryName " +
               "FROM bookinginfo b " +
               "JOIN selection s ON b.TripID = s.countryID " +
               "WHERE b.LName = ?";
        
        PreparedStatement ps = con.prepareStatement(query);
        ps.setString(1, lastNameToSearch);

        ResultSet rs = ps.executeQuery();

        // If a record is found, update the text fields
        if (rs.next()) {
            jTextField19.setText(rs.getString("ticketID"));    // Ticket ID
            jTextField12.setText(rs.getString("FName"));       // First Name
            jTextField13.setText(rs.getString("LName"));       // Last Name
            jTextField14.setText(rs.getString("Email"));       // Email
            jTextField15.setText(rs.getString("Phone"));       // Phone
            jTextField16.setText(rs.getString("PackageID"));   // Package ID
            jTextField10.setText(rs.getString("countryName")); // Country Name
        } else {
            JOptionPane.showMessageDialog(null, "No records found for the last name: " + lastNameToSearch);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        //prev button
        
        if (!searchResults.isEmpty()) {
        currentEntryIndex--;

        // if index is negative which means that we have arrive to first record it will wrap to the last record
        if (currentEntryIndex < 0) {
            currentEntryIndex = searchResults.size() - 1;
        }

        // Display the previous record
        displayRecord(searchResults.get(currentEntryIndex));
        
        jTextField11.setText(String.valueOf(searchResults.size()));    // Display total number of records
        jTextField18.setText(String.valueOf(currentEntryIndex + 1));  // Display current record number

       }
    }//GEN-LAST:event_jButton26ActionPerformed

    // to updates the text fields with the current record details
    private void displayRecord(Object[] record) {
        
    jTextField19.setText((String) record[0]);  // Ticket ID
    jTextField12.setText((String) record[1]);  // First Name
    jTextField13.setText((String) record[2]);  // Last Name
    jTextField14.setText((String) record[3]);  // Email
    jTextField15.setText((String) record[4]);  // Phone
    jTextField16.setText((String) record[5]);  // Package
    jTextField10.setText((String) record[6]);  // Destination (country name)
    }

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        //button for browsing the records  
        
        try {
        searchResults.clear(); // Clear previous results
        
        String query = "SELECT b.ticketID, b.FName, b.LName, b.Email, b.Phone, b.PackageID, s.countryName " +
                       "FROM bookinginfo b " +
                       "JOIN selection s ON b.TripID = s.countryID";

        PreparedStatement ps = con.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        // Process each record and store it in the searchResults list
        while (rs.next()) {
            Object[] record = new Object[7];
            record[0] = rs.getString("ticketID");
            record[1] = rs.getString("FName");
            record[2] = rs.getString("LName");
            record[3] = rs.getString("Email");
            record[4] = rs.getString("Phone");
            record[5] = rs.getString("PackageID");
            record[6] = rs.getString("countryName");

            searchResults.add(record);
        }

        // Display the first record if available
        if (!searchResults.isEmpty()) {
            currentEntryIndex = 0;
            displayRecord(searchResults.get(currentEntryIndex));
        } else {
            JOptionPane.showMessageDialog(null, "No records found.");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    }//GEN-LAST:event_jButton27ActionPerformed

    private void jTextField19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField19ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        // delete record button
        
        String lastNameToDelete = jTextField17.getText();

        if (lastNameToDelete.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please enter a last name to delete the record for.");
        return;
        }

        try {
        int confirmation = JOptionPane.showConfirmDialog(null, 
                "Are you sure you want to delete the record for '" + lastNameToDelete + "'?", 
                "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        
        if (confirmation == JOptionPane.YES_OPTION) {
            
            String query = "DELETE FROM bookinginfo WHERE LName = ?";

            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, lastNameToDelete);

            // Execute the delete query
            int rowsAffected = ps.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Record deleted successfully.");
                
                // Clear the text fields after deletion
                jTextField19.setText(""); // Ticket ID
                jTextField12.setText(""); // First Name
                jTextField13.setText(""); // Last Name
                jTextField14.setText(""); // Email
                jTextField15.setText(""); // Phone
                jTextField16.setText(""); // Package ID
                jTextField10.setText(""); // Country Name
                jTextField17.setText(""); // Last Name Search Field
            } else {
                JOptionPane.showMessageDialog(null, "No record found with the given last name: " + lastNameToDelete);
            }
        }
        
        } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error while deleting the record.");
        }
    
    }//GEN-LAST:event_jButton28ActionPerformed

    int xx ,xy;
    
       
    //bad idea
    
    
    private void onClick(JPanel panel)
    {
        panel.setBackground(new Color(185,218,235));
    }
    
     private void onLeaveClick(JPanel panel)
    {
        panel.setBackground(Color.white);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            if ("Windows".equals(info.getName())) {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            }
        }
    } catch (Exception ex) {
        java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            System.out.println("ain erro");
    }

    // Show login screen first
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            Home home = new Home();
            home.setVisible(true); // Make the frame visible
            home.login.setVisible(true);  // Ensure the login panel is visible first
            home.signup.setVisible(false); // Hide the signup panel if you don't want it visible initially
            home.HomePanel.setVisible(false); // Hide the home panel initially
        }
    });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Billpanel;
    private javax.swing.JPanel BookingInfo;
    private javax.swing.JPanel Button1;
    private javax.swing.JPanel Button2;
    private javax.swing.JPanel Button3;
    private javax.swing.JPanel Button4;
    private javax.swing.JPanel Button5;
    private javax.swing.JPanel Button7;
    private javax.swing.JPanel Button8;
    private javax.swing.JPanel Button9;
    private javax.swing.JPanel ContactInfo;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JPanel Indicator1;
    private javax.swing.JPanel Indicator2;
    private javax.swing.JPanel Indicator3;
    private javax.swing.JPanel Indicator4;
    private javax.swing.JPanel Indicator5;
    private javax.swing.JPanel Indicator7;
    private javax.swing.JPanel Indicator8;
    private javax.swing.JPanel Indicator9;
    private javax.swing.JRadioButton JRBCard;
    private javax.swing.JRadioButton JRBCash;
    private javax.swing.JRadioButton JRBDeluxe;
    private javax.swing.JRadioButton JRBLuxury;
    private javax.swing.JRadioButton JRBStandard;
    private javax.swing.JPanel Records;
    private javax.swing.JPanel Right;
    private javax.swing.JPanel SelectionPanel;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_close1;
    private javax.swing.JLabel btn_close2;
    private javax.swing.JLabel btn_close3;
    private javax.swing.JLabel btn_close4;
    private javax.swing.JLabel btn_close5;
    private javax.swing.JLabel btn_close6;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel left;
    private javax.swing.JPanel login;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JPanel signup;
    private javax.swing.JLabel totalAmountLabel;
    // End of variables declaration//GEN-END:variables
}
