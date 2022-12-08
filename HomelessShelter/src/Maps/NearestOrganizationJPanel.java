/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maps;

import Backend.Ecosystem.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Location.Location;
import Backend.Network.Network;
import Backend.Organization.Counceling;
import Backend.Organization.Organization;
import static Backend.Organization.Organization.Type.Counceling;
import Backend.UserAccount.UserAccount;
import Backend.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dhankuwarsisodiya
 */
public class NearestOrganizationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NearestOrganizationJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Organization organization;
    Organization recieverOrganization;
    WorkRequest workRequest;
    Enterprise enterprise;
    Network network;
    Network senderNetwork;
    EcoSystem business;
    private String orgType;
    //DefaultTableModel model;

    public NearestOrganizationJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, WorkRequest workRequest, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.workRequest = workRequest;
        this.enterprise = enterprise;
        this.network = network;
        this.senderNetwork = network;
        this.business = business;
        populateNetwork();
        this.orgType = "";
        //model = (DefaultTableModel) nearestOrgTable.getModel();
        nearestOrgTable.getTableHeader().setDefaultRenderer(new HeaderColors());
    }

    private void populateNetwork() {
        networkJComboBox.removeAllItems();

        for (Network network : business.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
        networkJComboBox.setSelectedItem(network);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        meals = new javax.swing.JButton();
        Counceling = new javax.swing.JButton();
        hospitals = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        nearestOrgTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Donations = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jobs = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1058, 840));
        setPreferredSize(new java.awt.Dimension(1058, 840));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        meals.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        meals.setForeground(new java.awt.Color(25, 56, 82));
        meals.setText("Meals Near Me");
        meals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealsActionPerformed(evt);
            }
        });
        add(meals, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 310, 200, -1));

        Counceling.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Counceling.setForeground(new java.awt.Color(25, 56, 82));
        Counceling.setText("Counceling Near Me");
        Counceling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CouncelingActionPerformed(evt);
            }
        });
        add(Counceling, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 210, -1));

        hospitals.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        hospitals.setForeground(new java.awt.Color(25, 56, 82));
        hospitals.setText("Hospitals Near Me");
        hospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalsActionPerformed(evt);
            }
        });
        add(hospitals, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 210, -1));

        nearestOrgTable.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        nearestOrgTable.setForeground(new java.awt.Color(25, 56, 82));
        nearestOrgTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Organization Id", "Organization", "Distance"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        nearestOrgTable.setSelectionBackground(new java.awt.Color(56, 90, 174));
        jScrollPane1.setViewportView(nearestOrgTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 657, 104));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(25, 56, 82));
        jButton1.setText("<Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        networkJComboBox.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        networkJComboBox.setForeground(new java.awt.Color(25, 56, 82));
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });
        add(networkJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 133, -1));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(25, 56, 82));
        jLabel1.setText("Select Network");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jButton3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(25, 56, 82));
        jButton3.setText("Place Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, -1, -1));

        Donations.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        Donations.setForeground(new java.awt.Color(25, 56, 82));
        Donations.setText("Donations Near Me");
        Donations.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonationsActionPerformed(evt);
            }
        });
        add(Donations, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 200, -1));

        jButton4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(25, 56, 82));
        jButton4.setText("Another Org");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 210, -1));

        jButton5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(25, 56, 82));
        jButton5.setText("Another Org");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 310, -1, -1));

        jobs.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jobs.setForeground(new java.awt.Color(25, 56, 82));
        jobs.setText("Jobs Near Me");
        jobs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobsActionPerformed(evt);
            }
        });
        add(jobs, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 270, -1, -1));

        jButton7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(25, 56, 82));
        jButton7.setText("View On Map");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 130, -1));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(25, 56, 82));
        jLabel2.setText("FIND NEAREST ORGANIZATION");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/NearestOrganizationMap512x.png"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void CouncelingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CouncelingActionPerformed
        // TODO add your handling code here:
        orgType = "Counceling";
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        System.out.println("network1 ---===--->> " + network);
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            System.out.println("network2 ---===--->> " + network);
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                System.out.println("network3 ---===--->> " + network);
                if (org instanceof Counceling) {
                    recieverOrganization = org;
                    System.out.println("network4 ---===--->> " + network);
                    Location point = new Location();
                    point.setLatitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude());
                    point.setLongitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude());
                    point.setName("p");
                    //if (org.getOrganizationDistanceFromScene(point) < 1) {
                    org.setNearestLocationPoint(org.getOrganizationDistanceFromScene(point));
                    orgList.add(org);
                    /*row[0] = org.getName();
                     row[1] = org.getOrganizationDistanceFromScene(point);
                     model.addRow(row);*/
                    //}
                }
            }

        }

        Collections.sort(orgList, (o1, o2) -> Double.compare(o1.getNearestLocationPoint(), o2.getNearestLocationPoint()));
        if(orgList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Fire Organization found for this network. Please choose the same from other network to place cross network request.");
        }
        for (Organization oo : orgList) {
            row[0] = oo.getOrganizationID();
            row[1] = oo.getName();
            row[2] = oo.getNearestLocationPoint();
            model.addRow(row);
        }


    }//GEN-LAST:event_CouncelingActionPerformed

    private void mealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealsActionPerformed
        // TODO add your handling code here:
        orgType = "Police";
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof PoliceOrganization) {
                    recieverOrganization = org;
                    LocationPoint point = new LocationPoint();
                    point.setLatitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude());
                    point.setLongitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude());
                    point.setName("p");
                    //if (org.getOrganizationDistanceFromScene(point) < 1) {
                    orgList.add(org);
                    org.setNearestLocationPoint(org.getOrganizationDistanceFromScene(point));
                    /*row[0] = org.getOrganizationID();
                    row[1] = org.getName();
                    row[2] = org.getOrganizationDistanceFromScene(point);
                    model.addRow(row);*/
                    //}
                }
            }

        }
        
        Collections.sort(orgList, (o1, o2) -> Double.compare(o1.getNearestLocationPoint(), o2.getNearestLocationPoint()));
        if(orgList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Police Organization found for this network. Please choose the same from other network to place cross network request.");
        }
        for (Organization oo : orgList) {
            row[0] = oo.getOrganizationID();
            row[1] = oo.getName();
            row[2] = oo.getNearestLocationPoint();
            model.addRow(row);
        }
    }//GEN-LAST:event_mealsActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void hospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalsActionPerformed
        // TODO add your handling code here:
        orgType = "Medicine";
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof MedicalOrganization) {
                    recieverOrganization = org;
                    LocationPoint point = new LocationPoint();
                    point.setLatitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude());
                    point.setLongitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude());
                    point.setName("p");
                    //if (org.getOrganizationDistanceFromScene(point) < 1) {
                    orgList.add(org);
                    org.setNearestLocationPoint(org.getOrganizationDistanceFromScene(point));
                    /*row[0] = org.getOrganizationID();
                    row[1] = org.getName();
                    row[2] = org.getOrganizationDistanceFromScene(point);
                    model.addRow(row);*/
                    //}
                }
            }

        }
        Collections.sort(orgList, (o1, o2) -> Double.compare(o1.getNearestLocationPoint(), o2.getNearestLocationPoint()));
        if(orgList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Medical Organization found for this network. Please choose the same from other network to place cross network request.");
        }
        for (Organization oo : orgList) {
            row[0] = oo.getOrganizationID();
            row[1] = oo.getName();
            row[2] = oo.getNearestLocationPoint();
            model.addRow(row);
        }
    }//GEN-LAST:event_hospitalsActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        this.network = (Network) networkJComboBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        //int count = nearestOrgTable.getSelectedRowCount();
        int selectedRow = nearestOrgTable.getSelectedRow();
        
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Select a row!");
        } else {
            int orgId = (int) nearestOrgTable.getValueAt(selectedRow, 0);
            for (WorkRequest wr : account.getWorkQueue().getWorkRequestList()) { 
                if(wr instanceof EmergencyUnitRequest) {
                    if(((EmergencyUnitRequest)wr).getRecieverOrganization().getOrganizationID() ==  orgId && !((EmergencyUnitRequest)wr).getStatus().equals("Completed") && !((EmergencyUnitRequest)wr).getStatus().equals("Cancelled") && !((EmergencyUnitRequest)wr).getStatus().equals("Rejected")) {
                        JOptionPane.showMessageDialog(null, "Request to this organization is already sent!");
                        return;
                    }
                }
            }
            
            /*for (Network n : business.getNetworkList()) {
                for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                        if (org.getOrganizationID() == orgId) {
                            for (WorkRequest wr : org.getWorkQueue().getWorkRequestList()) {
                                if (((EmergencyUnitRequest) wr).getSceneId().equalsIgnoreCase(((EmergencyUnitRequest) workRequest).getSceneId()) && !wr.getStatus().equalsIgnoreCase("Completed")) {
                                    JOptionPane.showMessageDialog(null, "Request to this organization is already set!");
                                    return;
                                }
                            }
                        }
                    }

                }
            }*/
       
            if (orgType.equalsIgnoreCase("Medicine")) {
                String requirements = JOptionPane.showInputDialog(userProcessContainer, "Enter your medical requirements (Pharmaceuticals/ Vaccine)");
                createWorkRequest(orgId, requirements);
            } else {
                createWorkRequest(orgId, null);
            }
            JOptionPane.showMessageDialog(null, "The request has been sent to the selected organization");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        orgType = "NGO";
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof VolunteerNGOOrganization) {
                    recieverOrganization = org;
                    LocationPoint point = new LocationPoint();
                    point.setLatitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude());
                    point.setLongitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude());
                    point.setName("p");
                    //if (org.getOrganizationDistanceFromScene(point) < 1) {
                    orgList.add(org);
                    org.setNearestLocationPoint(org.getOrganizationDistanceFromScene(point));
                    /*row[0] = org.getOrganizationID();
                    row[1] = org.getName();
                    row[2] = org.getOrganizationDistanceFromScene(point);
                    model.addRow(row);*/
                    //}
                }
            }

        }
        Collections.sort(orgList, (o1, o2) -> Double.compare(o1.getNearestLocationPoint(), o2.getNearestLocationPoint()));
        if(orgList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No NGO Organization found for this network. Please choose the same from other network to place cross network request.");
        }
        for (Organization oo : orgList) {
            row[0] = oo.getOrganizationID();
            row[1] = oo.getName();
            row[2] = oo.getNearestLocationPoint();
            model.addRow(row);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void DonationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonationsActionPerformed
        // TODO add your handling code here:
        orgType = "Hospital";
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof VolunteerHospitalOrganization) {
                    recieverOrganization = org;
                    LocationPoint point = new LocationPoint();
                    point.setLatitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude());
                    point.setLongitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude());
                    point.setName("p");
                    //if (org.getOrganizationDistanceFromScene(point) < 1) {
                    orgList.add(org);
                    org.setNearestLocationPoint(org.getOrganizationDistanceFromScene(point));
                    /*row[0] = org.getOrganizationID();
                    row[1] = org.getName();
                    row[2] = org.getOrganizationDistanceFromScene(point);
                    model.addRow(row);*/
                    //}
                }
            }

        }
        Collections.sort(orgList, (o1, o2) -> Double.compare(o1.getNearestLocationPoint(), o2.getNearestLocationPoint()));
        if(orgList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Hospital Organization found for this network. Please choose the same from other network to place cross network request.");
        }
        for (Organization oo : orgList) {
            row[0] = oo.getOrganizationID();
            row[1] = oo.getName();
            row[2] = oo.getNearestLocationPoint();
            model.addRow(row);
        }
    }//GEN-LAST:event_DonationsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        orgType = "Personal";
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof VolunteerPersonalOrganization) {
                    recieverOrganization = org;
                    LocationPoint point = new LocationPoint();
                    point.setLatitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude());
                    point.setLongitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude());
                    point.setName("p");
                    //if (org.getOrganizationDistanceFromScene(point) < 1) {
                    orgList.add(org);
                    org.setNearestLocationPoint(org.getOrganizationDistanceFromScene(point));
                    /*row[0] = org.getOrganizationID();
                    row[1] = org.getName();
                    row[2] = org.getOrganizationDistanceFromScene(point);
                    model.addRow(row);*/
                    //}
                }
            }

        }
        Collections.sort(orgList, (o1, o2) -> Double.compare(o1.getNearestLocationPoint(), o2.getNearestLocationPoint()));
        if(orgList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Personal Organization found for this network. Please choose the same from other network to place cross network request.");
        }
        for (Organization oo : orgList) {
            row[0] = oo.getOrganizationID();
            row[1] = oo.getName();
            row[2] = oo.getNearestLocationPoint();
            model.addRow(row);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jobsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobsActionPerformed
        // TODO add your handling code here:
        orgType = "Company";
        ArrayList<Organization> orgList = new ArrayList<Organization>();
        DefaultTableModel model = (DefaultTableModel) nearestOrgTable.getModel();
        model.setRowCount(0);
        Object[] row = new Object[3];
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                if (org instanceof VolunteerCompanyOrganization) {
                    recieverOrganization = org;
                    LocationPoint point = new LocationPoint();
                    point.setLatitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude());
                    point.setLongitude(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude());
                    point.setName("p");
                    //if (org.getOrganizationDistanceFromScene(point) < 1) {
                    orgList.add(org);
                    org.setNearestLocationPoint(org.getOrganizationDistanceFromScene(point));
                    /*row[0] = org.getOrganizationID();
                    row[1] = org.getName();
                    row[2] = org.getOrganizationDistanceFromScene(point);
                    model.addRow(row);*/
                    //}
                }
            }

        }
        Collections.sort(orgList, (o1, o2) -> Double.compare(o1.getNearestLocationPoint(), o2.getNearestLocationPoint()));
        if(orgList.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Company Organization found for this network. Please choose the same from other network to place cross network request.");
        }
        for (Organization oo : orgList) {
            row[0] = oo.getOrganizationID();
            row[1] = oo.getName();
            row[2] = oo.getNearestLocationPoint();
            model.addRow(row);
        }
    }//GEN-LAST:event_jobsActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        String coordinates = "";
        String allCoordinates = "";
        boolean atleastOneSelected = false;
        coordinates += "['" + ((ReportingAdminSceneRequest) workRequest).getSceneName() + " - Scene'," + ((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude() + ", " + ((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude() + "],\n";
        allCoordinates += "['" + ((ReportingAdminSceneRequest) workRequest).getSceneName() + " - Scene'," + ((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLatitude() + ", " + ((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint().getLongitude() + "],\n";
        for (Enterprise ent : network.getEnterpriseDirectory().getEnterpriseList()) {
            for (Organization org : ent.getOrganizationDirectory().getOrganizationList()) {
                System.out.println(org.getName()+" "+orgType);
                if (org instanceof FireSafetyOrganization && orgType.equalsIgnoreCase("Fire")) {
                    atleastOneSelected = true;
                    coordinates += "['" + org.getName() + " - FireSafety'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                } else if (org instanceof PoliceOrganization && orgType.equalsIgnoreCase("Police")) {
                    atleastOneSelected = true;
                    coordinates += "['" + org.getName() + " - Police'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                } else if (org instanceof MedicalOrganization && orgType.equalsIgnoreCase("Medicine")) {
                    atleastOneSelected = true;
                    coordinates += "['" + org.getName() + " - Medicine'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                } else if (org instanceof VolunteerNGOOrganization && orgType.equalsIgnoreCase("NGO")) {
                    atleastOneSelected = true;
                    coordinates += "['" + org.getName() + " - NGO'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                } else if (org instanceof VolunteerHospitalOrganization && orgType.equalsIgnoreCase("Hospital")) {
                    atleastOneSelected = true;
                    coordinates += "['" + org.getName() + " - Hospital'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                } else if (org instanceof VolunteerCompanyOrganization && orgType.equalsIgnoreCase("Company")) {
                    atleastOneSelected = true;
                    coordinates += "['" + org.getName() + " - Company'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                } else if (org instanceof VolunteerPersonalOrganization && orgType.equalsIgnoreCase("Personal")) {
                    atleastOneSelected = true;
                    coordinates += "['" + org.getName() + " - Personal'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                } else {
                    if (org instanceof FireSafetyOrganization) {
                        allCoordinates += "['" + org.getName() + " - FireSafety'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                    }
                    if (org instanceof PoliceOrganization) {
                        allCoordinates += "['" + org.getName() + " - Police'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                    }
                    if (org instanceof MedicalOrganization) {
                        allCoordinates += "['" + org.getName() + " - Medicine'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                    }
                    if (org instanceof VolunteerNGOOrganization) {
                        allCoordinates += "['" + org.getName() + " - NGO'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                    }
                    if (org instanceof VolunteerHospitalOrganization) {
                        allCoordinates += "['" + org.getName() + " - Hospital'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                    }
                    if (org instanceof VolunteerCompanyOrganization) {
                        allCoordinates += "['" + org.getName() + " - Company'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                    }
                    if (org instanceof VolunteerPersonalOrganization) {
                        allCoordinates += "['" + org.getName() + " - Personal'," + org.getLocationPoint().getLatitude() + ", " + org.getLocationPoint().getLongitude() + "],\n";
                    }
                }
            }
        }
        
        if(!atleastOneSelected){
            coordinates = allCoordinates;
        }
        System.out.println("===---->>> 1coordinates are " + coordinates.substring(0, coordinates.length()-1));
        System.out.println("===---->>> 2coordinates are " + coordinates.substring(0, coordinates.length()-2));
        System.out.println("===---->>> 3coordinates are " + coordinates.substring(0, coordinates.length()-3));
        System.out.println("===---->>> 4coordinates are " + coordinates.substring(0, coordinates.length()-4));
        DistanceMap.openMap(coordinates.substring(0, coordinates.length()-2));
    }//GEN-LAST:event_jButton7ActionPerformed
    
    public void createWorkRequest(int orgId,String requirements){
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                    if (org.getOrganizationID() == orgId) {
                        System.out.println(org);
                        //EmergencyUnitRequest sceneReq = new EmergencyUnitRequest();
//        emergencyRequest.setStatus("Requested");
//        emergencyRequest.setRecieverOrganization(recieverOrganization);
//        emergencyRequest.setSenderOrganization(organization);
//        emergencyRequest.setSenderNetwork(senderNetwork);
//        
//        organization.getWorkQueue().getWorkRequestList().add(emergencyRequest);
//        recieverOrganization.getWorkQueue().getWorkRequestList().add(emergencyRequest);
                        String msg = JOptionPane.showInputDialog("Additional Message");
                        EmergencyUnitRequest sceneReq = new EmergencyUnitRequest();
                        
                        sceneReq.setSceneName(((ReportingAdminSceneRequest) workRequest).getSceneName());
                        sceneReq.setSceneZipcode(((ReportingAdminSceneRequest) workRequest).getSceneZipcode());
                        sceneReq.setNoOfVictims(((ReportingAdminSceneRequest) workRequest).getNoOfVictims());
                        sceneReq.setEstimatedLoss(((ReportingAdminSceneRequest) workRequest).getEstimatedLoss());
                        sceneReq.setSceneLocationPoint(((ReportingAdminSceneRequest) workRequest).getSceneLocationPoint());
                        sceneReq.setStatus("Requested");
                        //sceneReq.setSender(workRequest.getSender());
                        sceneReq.setSender(account);
                        sceneReq.setRequestDate(new Date());
                        sceneReq.setSceneId(((ReportingAdminSceneRequest) workRequest).getSceneId());
                        if(requirements != null){
                            sceneReq.setRequirements(requirements);
                        }
                        sceneReq.setSceneManager(((ReportingAdminSceneRequest) workRequest).getSceneManager());
                        //sceneReq.setMessage(org.getName() + " Requested");
                        sceneReq.setMessage(msg);
                        sceneReq.setSenderNetwork(senderNetwork);
                        sceneReq.setSenderOrganization(organization);
                        sceneReq.setRecieverOrganization(org);
                        sceneReq.setRecieverNetwork(network);
                        //sceneReq.setConsiderInGraph(false);
                        org.getWorkQueue().getWorkRequestList().add(sceneReq);
                        account.getWorkQueue().getWorkRequestList().add(sceneReq);
                    }
                }
            }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Counceling;
    private javax.swing.JButton Donations;
    private javax.swing.JButton hospitals;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jobs;
    private javax.swing.JButton meals;
    private javax.swing.JTable nearestOrgTable;
    private javax.swing.JComboBox networkJComboBox;
    // End of variables declaration//GEN-END:variables
}
