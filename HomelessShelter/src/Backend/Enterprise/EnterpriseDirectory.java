/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author shubhamgoyal
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
        /*Enterprise IOU = new IncidentOperatingUnit("IOU");
        enterpriseList.add(IOU);
        Enterprise FOU = new FundsOperatingUnit("FOU");
        enterpriseList.add(FOU);
        Enterprise VOU = new EmergencyOperatingUnit("VOU");
        enterpriseList.add(VOU);
        Enterprise EOU = new EmergencyOperatingUnit("EOU");
        enterpriseList.add(EOU);*/
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if (type == Enterprise.EnterpriseType.EmergencyOperatingUnit) {
            enterprise = new EmergencyOperatingUnit(name);
            enterpriseList.add(enterprise);
        }/*else if (type == Enterprise.EnterpriseType.FundsOperatingUnit) {
            enterprise = new FundsOperatingUnit(name);
            enterpriseList.add(enterprise);
        }*/else if (type == Enterprise.EnterpriseType.IncidentOperatingUnit) {
            enterprise = new IncidentOperatingUnit(name);
            enterpriseList.add(enterprise);
        }else if (type == Enterprise.EnterpriseType.VoluntaryOperatingUnit) {
            enterprise = new VoluntaryOperatingUnit(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
    
}
