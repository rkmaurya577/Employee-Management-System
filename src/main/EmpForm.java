/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import entity.Employee;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import library.FeedBack;
import library.Validation;

/**
 *
 * @author squad
 */
public class EmpForm extends javax.swing.JFrame {

    private int id;
    private Employee emp;
    /**
     * Creates new form EmpForm
     */
    public EmpForm() {
        initComponents();
        
    }
    
    public EmpForm(int id){
        initComponents();
        this.id=id;
        update();
    }
    private void update()
    {
        try {
            emp=Employee.searchByID(id);
            jTId.setText(""+emp.getId());
            jTId.setEditable(false);
            jTName.setText(emp.getName());
            jTName.setEditable(false);
            jTEmail.setText(emp.getEmail());
            jTEmail.setEditable(false);
            jTPhone.setText(""+emp.getPhone());
            jTPhone.setEditable(false);
            jCGender.setSelectedItem(emp.getGender());
            jCGender.setEditable(false);
            jTDepartment.setText(emp.getDepartmentName());
            jTDepartment.setEditable(false);
            jTProject.setText(emp.getProjectName());
            jTProject.setEditable(false);
            jTDob.setText("03-05-1994");
            jTDob.setEditable(false);
            jTAddress.setText(emp.getAddress());
            jTAddress.setEditable(false);
            jTDoj.setText("05-11-2016");
            jTDoj.setEditable(false);
            jTSalary.setText(""+emp.getSalary());
            jTSalary.setEditable(false);
            jLImage.setIcon(new ImageIcon(scaledImage(emp.getImage(),jLImage.getWidth(),jLImage.getHeight())));
            jLUser.setText(emp.getName());
        } catch (Exception e) {
               System.out.println("Exception : "+e.getMessage());
        }
    }
    
     private Image scaledImage(byte[] img,int width,int height)
    {
        BufferedImage resizedImage=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
        Graphics2D g;
        try
        {
            g=resizedImage.createGraphics();
            g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_BILINEAR);
            
            //convert byte array back to buffered image
            
            ByteArrayInputStream in=new ByteArrayInputStream(img);
            BufferedImage bImage=ImageIO.read(in);
            g.drawImage(bImage,0,0,width,height,null);
            g.dispose();
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,e);
        }
        return resizedImage;
    }
     
    
         
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPDefaultImage = new javax.swing.JPanel();
        jLImage = new javax.swing.JLabel();
        jTId = new javax.swing.JTextField();
        jLID = new javax.swing.JLabel();
        jLFname = new javax.swing.JLabel();
        jTName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTPhone = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jCGender = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jTDepartment = new javax.swing.JTextField();
        jTProject = new javax.swing.JTextField();
        jTDob = new javax.swing.JTextField();
        jTAddress = new javax.swing.JTextField();
        jTDoj = new javax.swing.JTextField();
        jTSalary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLUser = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jBEdit = new javax.swing.JButton();
        jBUpdate = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTFeedback = new javax.swing.JTextArea();
        jBSend = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jCName = new javax.swing.JComboBox<>();
        jBLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(252, 254, 159));

        jPDefaultImage.setBackground(new java.awt.Color(18, 14, 9));

        javax.swing.GroupLayout jPDefaultImageLayout = new javax.swing.GroupLayout(jPDefaultImage);
        jPDefaultImage.setLayout(jPDefaultImageLayout);
        jPDefaultImageLayout.setHorizontalGroup(
            jPDefaultImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefaultImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImage, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPDefaultImageLayout.setVerticalGroup(
            jPDefaultImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPDefaultImageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLImage, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTIdActionPerformed(evt);
            }
        });

        jLID.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLID.setText("Id :-");

        jLFname.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLFname.setText("  Name :-");

        jTName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTNameActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel4.setText("Email :-");

        jTEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTEmailActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel9.setText("Phone :-");

        jTPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTPhoneActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel11.setText("Gender :-");

        jCGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel5.setText("Department :-");

        jTDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDepartmentActionPerformed(evt);
            }
        });

        jTDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDobActionPerformed(evt);
            }
        });

        jTAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTAddressActionPerformed(evt);
            }
        });

        jTDoj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTDojActionPerformed(evt);
            }
        });

        jTSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTSalaryActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel8.setText("  Joining Date :-");

        jLabel10.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel10.setText("Salary :-");

        jLabel7.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel7.setText("Address :-");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel6.setText("DOB :-");

        jLabel16.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel16.setText("Project :-");

        jLabel15.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(13, 14, 23));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("~~~~Employee Details~~~~");

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel1.setText("Welcome");

        jLUser.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLUser.setText("XYZ");

        jPanel2.setBackground(new java.awt.Color(2, 244, 40));

        jBEdit.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jBEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/icons8-Edit File-50.png"))); // NOI18N
        jBEdit.setText("Edit");
        jBEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEditActionPerformed(evt);
            }
        });

        jBUpdate.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jBUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/icons8-Edit File-50.png"))); // NOI18N
        jBUpdate.setText("Update");
        jBUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(jBEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jBEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(124, 107, 186));

        jTFeedback.setColumns(20);
        jTFeedback.setRows(5);
        jScrollPane1.setViewportView(jTFeedback);

        jBSend.setBackground(new java.awt.Color(202, 105, 199));
        jBSend.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jBSend.setText("SEND");
        jBSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSendActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Serif", 3, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(13, 14, 23));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("~~~~FeedBack~~~~");

        jCName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unknown", "Show Identity" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jCName, 0, 140, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBSend, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBSend, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jBLogout.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jBLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/drawable/exit.png"))); // NOI18N
        jBLogout.setText("Logout");
        jBLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPDefaultImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLUser, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLFname, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLID, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTName, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jCGender, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(92, 92, 92)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(80, 80, 80)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addComponent(jLabel16)
                                                            .addComponent(jLabel6)))
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTAddress)
                                                    .addComponent(jTProject)
                                                    .addComponent(jTDob, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTDoj, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jBLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel15)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jPDefaultImage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel1)
                                .addComponent(jLUser))
                            .addComponent(jBLogout))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLID))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel16)
                                .addComponent(jTProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLFname)
                                    .addComponent(jTDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(jTPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTDoj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jTSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(14, 14, 14)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(394, 394, 394))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTSalaryActionPerformed

    private void jTDojActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDojActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDojActionPerformed

    private void jTAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTAddressActionPerformed

    private void jTDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDobActionPerformed

    private void jTDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTDepartmentActionPerformed

    private void jTPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTPhoneActionPerformed

    private void jTEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTEmailActionPerformed

    private void jTNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTNameActionPerformed

    private void jTIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTIdActionPerformed

    private void jBEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEditActionPerformed
        
        jTName.setEditable(true);
        jTEmail.setEditable(true);
        jTPhone.setEditable(true);
    }//GEN-LAST:event_jBEditActionPerformed

    private void jBSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSendActionPerformed
        String message=jTFeedback.getText();
        String check=jCName.getSelectedItem().toString();
        String name=null;
        
        if(check.equals("Unknown"))
            name=check;
        else
            name=emp.getName();
        FeedBack feedback=new FeedBack(name,message);
        feedback.saveFeedBack();
        
    }//GEN-LAST:event_jBSendActionPerformed

    private void jBUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBUpdateActionPerformed

         if(jTId.getText().equals("")&&jTName.getText().equals("")&&jTEmail.getText().equals("")&&jTPhone.getText().equals("")&&jCGender.getSelectedIndex()==0&&jTDepartment.getText().equals("")&&jTProject.getText().equals("")&&jTDob.getText().equals("")&&jTAddress.getText().equals("")&&jTDoj.getText().equals("")&&jTSalary.getText().equals(""))
             JOptionPane.showMessageDialog(null,"Fill The Blank Column","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(!jTId.getText().matches("\\d+"))
             JOptionPane.showMessageDialog(null,"Invalid UserId","ERROR",JOptionPane.ERROR_MESSAGE);
         
         
         else if((!Pattern.matches("^[a-zA-Z]+$",jTName.getText()))||(!Pattern.matches("^[a-zA-Z]+$",jTDepartment.getText()))||(!Pattern.matches("^[a-zA-Z]+$",jTProject.getText())))
             JOptionPane.showMessageDialog(null,"Invalid Name or Department or Project","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(!jTPhone.getText().matches("\\d+"))
             JOptionPane.showMessageDialog(null,"Invalid PhoneNumber","ERROR",JOptionPane.ERROR_MESSAGE);
         
         else if(!jTSalary.getText().matches("\\d+"))  
             JOptionPane.showMessageDialog(null,"Invalid Salary ","ERROR",JOptionPane.ERROR_MESSAGE);
         

         else 
        try {
            Employee emp1=Employee.searchByID(id);
            emp1.setName(jTName.getText());
            emp1.setEmail(jTEmail.getText());
            emp1.setPhone(Integer.parseInt(jTPhone.getText()));
            emp1.updateDB();
        } catch (Exception ex) {
            
            System.out.println("Exception : "+ex.getMessage());
        }
    }//GEN-LAST:event_jBUpdateActionPerformed

    private void jBLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLogoutActionPerformed
        Login login=new Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_jBLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(EmpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEdit;
    private javax.swing.JButton jBLogout;
    private javax.swing.JButton jBSend;
    private javax.swing.JButton jBUpdate;
    private javax.swing.JComboBox<String> jCGender;
    private javax.swing.JComboBox<String> jCName;
    private javax.swing.JLabel jLFname;
    private javax.swing.JLabel jLID;
    private javax.swing.JLabel jLImage;
    private javax.swing.JLabel jLUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPDefaultImage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTAddress;
    private javax.swing.JTextField jTDepartment;
    private javax.swing.JTextField jTDob;
    private javax.swing.JTextField jTDoj;
    private javax.swing.JTextField jTEmail;
    private javax.swing.JTextArea jTFeedback;
    private javax.swing.JTextField jTId;
    private javax.swing.JTextField jTName;
    private javax.swing.JTextField jTPhone;
    private javax.swing.JTextField jTProject;
    private javax.swing.JTextField jTSalary;
    // End of variables declaration//GEN-END:variables
}
