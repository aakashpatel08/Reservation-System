package System;

import java.awt.Frame;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Aakash
 */
public class ReservationData extends javax.swing.JFrame {

    /**
     * Creates new form ReservationData
     */
    public ReservationData() {
        initComponents();
        //Set window to full screen
        Toolkit tk = Toolkit.getDefaultToolkit();
        /*int xSize = (int) tk.getScreenSize().getWidth();
        int ySize = (int) tk.getScreenSize().getHeight();
        this.setSize(xSize, ySize);*/
        this.setExtendedState(Frame.MAXIMIZED_BOTH);
        this.pack();
        DefaultTableModel model = (DefaultTableModel) tblReservation.getModel();
        try {
            String sql="Select * from AAKASH.CUSTOMER";
            Connection con= (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Reservations","aakash","patel");
            JOptionPane.showMessageDialog(null, "Access Granted!", "Connection Successful", JOptionPane.ERROR_MESSAGE);
            Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next())
            {
                int id= Integer.parseInt(rs.getString("ID"));
                int room = Integer.parseInt(rs.getString("ROOM"));
                String name = rs.getString("NAME");
                String street= rs.getString("STREET");
                String city = rs.getString("CITY");
                String state = rs.getString("STATE");
                int zip = Integer.parseInt(rs.getString("ZIPCODE"));
                String phone= rs.getString("PHONENUMBER");
                String idnumber = rs.getString("IDNUMBER");
                String credit= rs.getString("CREDITCARDNUMBER");
                String expiration = rs.getString("EXPIRATIONDATE");
                String cvc = rs.getString("CVCNUMBER");
                String checkin= rs.getString("CHECKIN");
                String checkout= rs.getString("CHECKOUT");
                String rate = rs.getString("RATE");
                model.addRow(new Object []{
                    id, room, name,street, city, state, zip, phone, idnumber, credit, expiration, cvc, checkin, checkout, rate
                });
            }
        }
        catch(Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        Update_table();
    }  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReservation = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        txtRoom = new javax.swing.JFormattedTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        lblStreet = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblCheckout = new javax.swing.JLabel();
        jDateCheckinDate = new com.toedter.calendar.JDateChooser();
        lblCheckin = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        jDateCheckoutDate = new com.toedter.calendar.JDateChooser();
        txtCreditCardNumber = new javax.swing.JTextField();
        lblExpirationDate = new javax.swing.JLabel();
        lblRoom = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JFormattedTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblCreditCardNumber = new javax.swing.JLabel();
        lblRate = new javax.swing.JLabel();
        lblIdNumber = new javax.swing.JLabel();
        lblCVCNumber = new javax.swing.JLabel();
        txtIdNumber = new javax.swing.JTextField();
        txtCVCNumber = new javax.swing.JTextField();
        txtStreet = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        jDateExpirationDate = new com.toedter.calendar.JDateChooser();
        txtRate = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Reservations");
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        setSize(new java.awt.Dimension(100, 100));

        btnSave.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aakash\\Desktop\\Reservation System Images\\Save.gif")); // NOI18N
        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aakash\\Desktop\\Reservation System Images\\Update.png")); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aakash\\Desktop\\Reservation System Images\\Clear.png")); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aakash\\Desktop\\Reservation System Images\\Delete.png")); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        tblReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15"
            }
        ));
        tblReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReservationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReservation);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Details", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(153, 0, 0))); // NOI18N

        try {
            txtRoom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblPhoneNumber.setText("Phone Number");

        lblStreet.setText("Street");

        lblCity.setText("City");

        lblCheckout.setText("Checkout");

        jDateCheckinDate.setDateFormatString("yyyy-MM-dd");

        lblCheckin.setText("Checkin");

        lblState.setText("State");

        jDateCheckoutDate.setDateFormatString("yyyy-MM-dd");

        lblExpirationDate.setText("Expiration Date");

        lblRoom.setText("Room");

        try {
            txtPhoneNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(###)###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblName.setText("Name");

        lblCreditCardNumber.setText("Credit Card Number");

        lblRate.setText("Rate");

        lblIdNumber.setText("Id Number");

        lblCVCNumber.setText("CVC Number");

        lblZipCode.setText("Zip Code");

        jDateExpirationDate.setDateFormatString("yyyy-MM-dd");

        lblID.setText("ID");

        txtID.setEditable(false);
        txtID.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCity)
                            .addComponent(lblState)
                            .addComponent(lblZipCode)
                            .addComponent(lblPhoneNumber)
                            .addComponent(lblIdNumber)
                            .addComponent(lblCreditCardNumber)
                            .addComponent(lblExpirationDate)
                            .addComponent(lblCVCNumber)
                            .addComponent(lblCheckin)
                            .addComponent(lblCheckout)
                            .addComponent(lblRate)
                            .addComponent(lblStreet))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateCheckinDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCVCNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtZipCode, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCreditCardNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRoom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStreet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateExpirationDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateCheckoutDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(43, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblID)
                            .addComponent(lblRoom))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRoom)
                    .addComponent(txtRoom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblStreet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblState))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipCode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtIdNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCreditCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCreditCardNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateExpirationDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExpirationDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCVCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCVCNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateCheckinDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheckin))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateCheckoutDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheckout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRate))
                .addContainerGap())
        );

        lblSearch.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aakash\\Desktop\\Reservation System Images\\Search.png")); // NOI18N
        lblSearch.setText("Search");

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDelete)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1197, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnClear)
                    .addComponent(btnDelete)
                    .addComponent(btnSave)
                    .addComponent(lblSearch)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Update_table(){
        try{
        String query = "select * from AAKASH.CUSTOMER";
        Connection con= (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Reservations","aakash","patel");
        PreparedStatement pst = con.prepareStatement(query);
        ResultSet rs = pst.executeQuery();
        tblReservation.setModel(DbUtils.resultSetToTableModel(rs));
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblReservation.getModel();
        //if(!txtName.getText().trim().equals("")) {
            /*model.addRow(new Object[]{txtId.getText(), txtName.getText(),txtAddress.getText(), txtPhone.getText(),  
                txtCreditCardNumber.getText(), jDateCheckinDate.getDate(), jDateCheckoutDate.getDate()});*/
        //}else {
          //  lblMessage.setText("Name should not be left blank");
        //}
        
        try{                      
            String query = "insert into AAKASH.CUSTOMER(ROOM, NAME, STREET, CITY, STATE, ZIPCODE, PHONENUMBER, IDNUMBER,"
                    + "CREDITCARDNUMBER, EXPIRATIONDATE, CVCNUMBER, CHECKIN, CHECKOUT, RATE) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            Connection con= (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Reservations","aakash","patel");
            PreparedStatement pst = con.prepareStatement(query);
            
            pst.setString(1, txtRoom.getText());
            pst.setString(2, txtName.getText());
            pst.setString(3, txtStreet.getText());
            pst.setString(4, txtCity.getText());
            pst.setString(5, txtState.getText());
            pst.setString(6, txtZipCode.getText());
            pst.setString(7, txtPhoneNumber.getText());
            pst.setString(8, txtIdNumber.getText());
            pst.setString(9, txtCreditCardNumber.getText());
            pst.setString(10, ((JTextField)jDateExpirationDate.getDateEditor().getUiComponent()).getText());
            pst.setString(11, txtCVCNumber.getText());
            pst.setString(12, ((JTextField)jDateCheckinDate.getDateEditor().getUiComponent()).getText());
            pst.setString(13, ((JTextField)jDateCheckoutDate.getDateEditor().getUiComponent()).getText());  
            pst.setDouble(14, Double.parseDouble(txtRate.getText()));
            
            pst.execute();            
            JOptionPane.showMessageDialog(this, "Reservation Saved!", "Saved", JOptionPane.ERROR_MESSAGE);            
            pst.close();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        Update_table();
        
        
                                           
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        //lblMessage.setText("");
        //DefaultTableModel model = (DefaultTableModel) tblReservation.getModel();       
        
        try{
            Connection con= (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Reservations","aakash","patel");
            
            int ID = Integer.parseInt(txtID.getText());
            int room = Integer.parseInt(txtRoom.getText());
            String name = txtName.getText();
            String street = txtStreet.getText();
            String city = txtCity.getText();
            String state = txtState.getText();
            int zip = Integer.parseInt(txtZipCode.getText());
            String phone = txtPhoneNumber.getText();
            String idnumber = txtIdNumber.getText();
            String credit = txtCreditCardNumber.getText();
            Date expirationdate = jDateExpirationDate.getDate();
            String modifiedexpdate = new SimpleDateFormat("yyyy-MM-dd").format(expirationdate);
            System.out.println(expirationdate);
            String cvc = txtCVCNumber.getText();
            Date checkindate = jDateCheckinDate.getDate();
            String modifiedcheckindate = new SimpleDateFormat("yyyy-MM-dd").format(checkindate);
            Date checkoutdate = jDateCheckoutDate.getDate();
            String modifiedcheckoutdate = new SimpleDateFormat("yyyy-MM-dd").format(checkoutdate);
            double rate = Double.parseDouble(txtRate.getText());
            String df = new DecimalFormat("#.##").format(rate);
            //System.out.println(df);


            String updatequery = "update AAKASH.CUSTOMER set ROOM="+room+", NAME='"+name+"', STREET='"+street+"', CITY='"+city+"', "
                    + "STATE='"+state+"', ZIPCODE="+zip+", PHONENUMBER='"+phone+"', IDNUMBER='"+idnumber+"',"
                    + " CREDITCARDNUMBER='"+credit+"', EXPIRATIONDATE='"+modifiedexpdate+"', CVCNUMBER='"+cvc+"',"
                    + "CHECKIN='"+modifiedcheckindate+"', CHECKOUT='"+modifiedcheckoutdate+"', RATE= "+df+" WHERE ID="+ID+"";
            
            PreparedStatement pst = con.prepareStatement(updatequery);
            /*Statement stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(updatequery);
            int id= Integer.parseInt(rs.getString("ID"));*/
            
            //String val5 = jDateCheckinDate.getDateEditor().getUiComponent().getText();         

            pst.execute();
            //System.out.println("Checkin Date Is: " + modifiedcheckindate);
            //System.out.println("Checkout Date Is: " + modifiedcheckoutdate);
            JDialog dialog = new JOptionPane("Reservation Updated!").createDialog("Updated");  
            dialog.setAlwaysOnTop(true);  
            dialog.setVisible(true);              
            pst.close();            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        Update_table();        
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReservationMouseClicked
        DefaultTableModel model = (DefaultTableModel) tblReservation.getModel();
        
        txtID.setText(model.getValueAt(tblReservation.getSelectedRow(), 0).toString());
        txtRoom.setText(model.getValueAt(tblReservation.getSelectedRow(), 1).toString());
        txtName.setText(model.getValueAt(tblReservation.getSelectedRow(), 2).toString());
        txtStreet.setText(model.getValueAt(tblReservation.getSelectedRow(), 3).toString());
        txtCity.setText(model.getValueAt(tblReservation.getSelectedRow(), 4).toString());
        txtState.setText(model.getValueAt(tblReservation.getSelectedRow(), 5).toString());
        txtZipCode.setText(model.getValueAt(tblReservation.getSelectedRow(), 6).toString());
        txtPhoneNumber.setText(model.getValueAt(tblReservation.getSelectedRow(), 7).toString());
        txtIdNumber.setText(model.getValueAt(tblReservation.getSelectedRow(), 8).toString());
        txtCreditCardNumber.setText(model.getValueAt(tblReservation.getSelectedRow(), 9).toString());
        //jDateExpirationDate.setText(model.getValueAt(tblReservation.getSelectedRow(), 6).toString());
        txtCVCNumber.setText(model.getValueAt(tblReservation.getSelectedRow(), 11).toString());
        txtRate.setText(model.getValueAt(tblReservation.getSelectedRow(), 14).toString());
        //txtState.setText(model.getValueAt(tblReservation.getSelectedRow(), 6).toString());

        //jDateCheckinDate.setDateFormatString(model.getValueAt(tblReservations.getSelectedRow(), 5).toString());
        //jDateCheckoutDate.setDateFormatString(model.getValueAt(tblReservations.getSelectedRow(), 6).toString());
        try{
            int index = tblReservation.getSelectedRow();
            Date expirationdate = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(index, 10));
            Date checkindate = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(index, 12));
            Date checkoutdate = new SimpleDateFormat("yyyy-MM-dd").parse((String)model.getValueAt(index, 13));
            jDateExpirationDate.setDate(expirationdate);
            jDateCheckinDate.setDate(checkindate);
            jDateCheckoutDate.setDate(checkoutdate);
        } catch (ParseException ex) {
            Logger.getLogger(ReservationData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tblReservationMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        JFrame dummyFrame = null;
        if (dummyFrame == null) 
        {
            dummyFrame = new JFrame();
        }
        dummyFrame.setVisible(false);
        dummyFrame.setLocation(650, 300);
        dummyFrame.setAlwaysOnTop(true);
        int delete = JOptionPane.showConfirmDialog(dummyFrame, "Do you really want to delete?","Delete",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (delete == 0){
            try{           
                String query = "delete from AAKASH.CUSTOMER where ID = ?";
                Connection con= (Connection) DriverManager.getConnection("jdbc:derby://localhost:1527/Reservations","aakash","patel");
                PreparedStatement pst = con.prepareStatement(query);

                pst.setString(1, txtID.getText());
                pst.execute();
                JDialog dialog = new JOptionPane("Reservation Deleted!").createDialog("Deleted");
                dialog.setAlwaysOnTop(true);  
                dialog.setVisible(true);
                pst.close();
                dummyFrame.dispose();
            }catch(SQLException ex){
                Logger.getLogger(ReservationData.class.getName()).log(Level.SEVERE,null, ex);
            }
        }
        Update_table();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtID.setText("");
        txtRoom.setText("");
        txtName.setText("");
        txtStreet.setText("");
        txtCity.setText("");
        txtState.setText("");
        txtZipCode.setText("");
        txtPhoneNumber.setText("");
        txtIdNumber.setText("");
        txtCreditCardNumber.setText("");
        jDateExpirationDate.setCalendar(null);
        txtCVCNumber.setText("");
        jDateCheckinDate.setCalendar(null);
        jDateCheckoutDate.setCalendar(null);
        txtRate.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel table = (DefaultTableModel) tblReservation.getModel();
        String search = txtSearch.getText();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<>(table);
        tblReservation.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_txtSearchKeyReleased

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
            java.util.logging.Logger.getLogger(ReservationData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReservationData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReservationData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReservationData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReservationData().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser jDateCheckinDate;
    private com.toedter.calendar.JDateChooser jDateCheckoutDate;
    private com.toedter.calendar.JDateChooser jDateExpirationDate;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCVCNumber;
    private javax.swing.JLabel lblCheckin;
    private javax.swing.JLabel lblCheckout;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCreditCardNumber;
    private javax.swing.JLabel lblExpirationDate;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIdNumber;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRate;
    private javax.swing.JLabel lblRoom;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreet;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTable tblReservation;
    private javax.swing.JTextField txtCVCNumber;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCreditCardNumber;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIdNumber;
    private javax.swing.JTextField txtName;
    private javax.swing.JFormattedTextField txtPhoneNumber;
    private javax.swing.JTextField txtRate;
    private javax.swing.JFormattedTextField txtRoom;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZipCode;
    // End of variables declaration//GEN-END:variables
}
