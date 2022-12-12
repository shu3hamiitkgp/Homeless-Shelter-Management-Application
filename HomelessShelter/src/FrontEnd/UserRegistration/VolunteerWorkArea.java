/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package FrontEnd.UserRegistration;

import Backend.Ecosystem.EcoSystem;
import Backend.Enterprise.Enterprise;
import Backend.Network.Network;
import Backend.Organization.Organization;
import Backend.UserAccount.UserAccount;
import FrontEnd.ShelterNGO.NGOAdminManageResident;
import FrontEnd.ShelterNGO.NGOAdminWorkRequest;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author shubhamgoyal
 */
public class VolunteerWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerWorkArea
     */
    
    JPanel userProcessContainer;
    Enterprise enterprise;
    Network network;
    Organization organization;
    EcoSystem system;
    UserAccount account;
    public VolunteerWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.network = network;
        this.system = system;
//        populateAlerts();
        manageResident();
    }
    

    
      private void manageResident(){
//        manageScenePanel.setBackground(new Color(236,113,107));
//        manageRequestPanel.setBackground(new Color(215,81,81));
        NGOAdminManageResident manageResident = new NGOAdminManageResident( rightPanel,  enterprise,  system,  organization,  network, account);
        rightPanel.add("ManageResidentJPanel", manageResident);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }
        
//        private void manageVolu(){
////        manageScenePanel.setBackground(new Color(236,113,107));
////        manageRequestPanel.setBackground(new Color(215,81,81));
////        GovtShelterManageVolu manageScene = new GovtShelterManageVolu( rightPanel,  enterprise,  system,  organization,  network, account);
//        rightPanel.add("ManageHospitalSceneJPanel", manageScene);
//        CardLayout layout = (CardLayout) rightPanel.getLayout();
//        layout.next(rightPanel);
//    }
    
        private void manageRequest(){
//        manageRequestPanel.setBackground(new Color(236,113,107));
//        manageScenePanel.setBackground(new Color(215,81,81));
        NGOAdminWorkRequest manageIndividualWorkRequest = new NGOAdminWorkRequest( rightPanel,  account,  organization,  enterprise,  network,  system);
        rightPanel.add("IndividualAdminWorkAreaJPanel", manageIndividualWorkRequest);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.next(rightPanel);
    }
    
    public VolunteerWorkArea() {
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

        jPanel1 = new javax.swing.JPanel();
        lblManageResidents = new javax.swing.JLabel();
        lblManageVolu = new javax.swing.JLabel();
        rightPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        lblManageResidents.setText("Create New Profile");
        lblManageResidents.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageResidentsMousePressed(evt);
            }
        });

        lblManageVolu.setText("Shelter Allocation");
        lblManageVolu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblManageVoluMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblManageResidents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblManageVolu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblManageResidents, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblManageVolu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(790, Short.MAX_VALUE))
        );

        jLabel1.setText("Welcome to the Homeless Shelter database, please select option on the left");

        javax.swing.GroupLayout rightPanelLayout = new javax.swing.GroupLayout(rightPanel);
        rightPanel.setLayout(rightPanelLayout);
        rightPanelLayout.setHorizontalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(403, Short.MAX_VALUE))
        );
        rightPanelLayout.setVerticalGroup(
            rightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightPanelLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(rightPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lblManageResidentsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageResidentsMousePressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_lblManageResidentsMousePressed

    private void lblManageVoluMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblManageVoluMousePressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_lblManageVoluMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblManageResidents;
    private javax.swing.JLabel lblManageVolu;
    private javax.swing.JPanel rightPanel;
    // End of variables declaration//GEN-END:variables
}
