package model.AM;

import model.AM.common.InspectionProcessAM;

import oracle.adf.share.ADFContext;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;
import oracle.jbo.server.ViewLinkImpl;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 10 14:48:01 PKT 2018
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class InspectionProcessAMImpl extends ApplicationModuleImpl implements InspectionProcessAM {
    /**
     * This is the default constructor (do not remove).
     */
    public InspectionProcessAMImpl() {
    }

    public void setSessionValues(String orgId, String userId, String respId,
                                 String respAppl, String mfgOrgId) {
        System.out.println("orgid = "+orgId);
        ADFContext.getCurrent().getSessionScope().put("user_id", userId);
        ADFContext.getCurrent().getSessionScope().put("org_id", orgId);
        ADFContext.getCurrent().getSessionScope().put("resp_id", respId);
        ADFContext.getCurrent().getSessionScope().put("resp_appl_id", respAppl);
        ADFContext.getCurrent().getSessionScope().put("mfg_org_id", mfgOrgId);
        
        /*String   MfgOrgName = null;
                ViewObject mfgVO = this.getDBTransaction().createViewObjectFromQueryStmt("SELECT ORGANIZATION_ID,ORGANIZATION_NAME FROM ORG_ACCESS_V WHERE RESP_APPLICATION_ID = "+respAppl+" AND RESPONSIBILITY_ID = "+respId);
                //        ViewObject mfgVO = this.getDBTransaction().createViewObjectFromQueryStmt("SELECT ORGANIZATION_ID,ORGANIZATION_NAME FROM ORG_ACCESS_V WHERE RESP_APPLICATION_ID = 706 AND RESPONSIBILITY_ID = 51776");
                         if(mfgVO != null){
                             if(mfgVO.getRowCount() == 1){
                                 Row mfgRow = mfgVO.first();
                                 try{
                                     mfgOrgId = mfgRow.getAttribute(0).toString();
                                     ADFContext.getCurrent().getSessionScope().put("mfg_org_id", mfgOrgId);
                                 }catch(Exception e){
                                         ;
                                 }
                                 try{
                                     MfgOrgName = mfgRow.getAttribute(1).toString();
                                     ADFContext.getCurrent().getSessionScope().put("mfg_org_name", MfgOrgName);
                                 }catch(Exception e){
                                         ;
                                 }       
                             }    
                         }*/
                         System.out.println("mfg_org_id = "+mfgOrgId);
                //ADFContext.getCurrent().getSessionScope().put("mfg_org_id", mfgOrgId);
    }


    /**
     * Container's getter for PwcOdmInspPrcGreigeFaultVO1.
     * @return PwcOdmInspPrcGreigeFaultVO1
     */
    public ViewObjectImpl getPwcOdmInspPrcGreigeFaultVO1() {
        return (ViewObjectImpl)findViewObject("PwcOdmInspPrcGreigeFaultVO1");
    }

    /**
     * Container's getter for PwcOdmInspPrcDyeFaultVO1.
     * @return PwcOdmInspPrcDyeFaultVO1
     */
    public ViewObjectImpl getPwcOdmInspPrcDyeFaultVO1() {
        return (ViewObjectImpl)findViewObject("PwcOdmInspPrcDyeFaultVO1");
    }

    /**
     * Container's getter for PwcOdmInspPrcYarnFaultVO1.
     * @return PwcOdmInspPrcYarnFaultVO1
     */
    public ViewObjectImpl getPwcOdmInspPrcYarnFaultVO1() {
        return (ViewObjectImpl)findViewObject("PwcOdmInspPrcYarnFaultVO1");
    }


    /**
     * Container's getter for PwcInspectionProcessHeaderVO1.
     * @return PwcInspectionProcessHeaderVO1
     */
    public ViewObjectImpl getPwcInspectionProcessHeaderVO1() {
        return (ViewObjectImpl)findViewObject("PwcInspectionProcessHeaderVO1");
    }

    /**
     * Container's getter for PwcInspectionProcessLineVO1.
     * @return PwcInspectionProcessLineVO1
     */
    public ViewObjectImpl getPwcInspectionProcessLineVO1() {
        return (ViewObjectImpl)findViewObject("PwcInspectionProcessLineVO1");
    }

    /**
     * Container's getter for PwcInspectionProcessVL.
     * @return PwcInspectionProcessVL
     */
    public ViewLinkImpl getPwcInspectionProcessVL() {
        return (ViewLinkImpl)findViewLink("PwcInspectionProcessVL");
    }

    /**
     * Container's getter for PwcOdmInspPrcDyeFaultVO2.
     * @return PwcOdmInspPrcDyeFaultVO2
     */
    public ViewObjectImpl getPwcOdmInspPrcDyeFaultVO2() {
        return (ViewObjectImpl)findViewObject("PwcOdmInspPrcDyeFaultVO2");
    }

    /**
     * Container's getter for InspPrcLineDyeFaultVL1.
     * @return InspPrcLineDyeFaultVL1
     */
    public ViewLinkImpl getInspPrcLineDyeFaultVL1() {
        return (ViewLinkImpl)findViewLink("InspPrcLineDyeFaultVL1");
    }


    /**
     * Container's getter for PwcOdmInspPrcGreigeFaultVO2.
     * @return PwcOdmInspPrcGreigeFaultVO2
     */
    public ViewObjectImpl getPwcOdmInspPrcGreigeFaultVO2() {
        return (ViewObjectImpl)findViewObject("PwcOdmInspPrcGreigeFaultVO2");
    }

    /**
     * Container's getter for InspPrcLineGreig1.
     * @return InspPrcLineGreig1
     */
    public ViewLinkImpl getInspPrcLineGreig1() {
        return (ViewLinkImpl)findViewLink("InspPrcLineGreig1");
    }

    /**
     * Container's getter for PwcOdmInspPrcYarnFaultVO2.
     * @return PwcOdmInspPrcYarnFaultVO2
     */
    public ViewObjectImpl getPwcOdmInspPrcYarnFaultVO2() {
        return (ViewObjectImpl)findViewObject("PwcOdmInspPrcYarnFaultVO2");
    }

    /**
     * Container's getter for InspPrcLineYarnFaultVL1.
     * @return InspPrcLineYarnFaultVL1
     */
    public ViewLinkImpl getInspPrcLineYarnFaultVL1() {
        return (ViewLinkImpl)findViewLink("InspPrcLineYarnFaultVL1");
    }


    /**
     * Container's getter for PwcOdmInspPrcDyeFaultVO3.
     * @return PwcOdmInspPrcDyeFaultVO3
     */
    public ViewObjectImpl getPwcOdmInspPrcDyeFaultVO3() {
        return (ViewObjectImpl)findViewObject("PwcOdmInspPrcDyeFaultVO3");
    }

    /**
     * Container's getter for PwcOdmInspPrcWeaveFaultVO1.
     * @return PwcOdmInspPrcWeaveFaultVO1
     */
    public ViewObjectImpl getPwcOdmInspPrcWeaveFaultVO1() {
        return (ViewObjectImpl)findViewObject("PwcOdmInspPrcWeaveFaultVO1");
    }

    /**
     * Container's getter for PwcInspPrcWeaveFaultVL.
     * @return PwcInspPrcWeaveFaultVL
     */
    public ViewLinkImpl getPwcInspPrcWeaveFaultVL() {
        return (ViewLinkImpl)findViewLink("PwcInspPrcWeaveFaultVL");
    }

    /**
     * Container's getter for PwcInspectionProcessLineVO2.
     * @return PwcInspectionProcessLineVO2
     */
    public ViewObjectImpl getPwcInspectionProcessLineVO2() {
        return (ViewObjectImpl)findViewObject("PwcInspectionProcessLineVO2");
    }


    /**
     * Container's getter for PwcOdmInspPrcWeaveFaultVO2.
     * @return PwcOdmInspPrcWeaveFaultVO2
     */
    public ViewObjectImpl getPwcOdmInspPrcWeaveFaultVO2() {
        return (ViewObjectImpl)findViewObject("PwcOdmInspPrcWeaveFaultVO2");
    }

    /**
     * Container's getter for PwcInspPrcWeaveFaultVL1.
     * @return PwcInspPrcWeaveFaultVL1
     */
    public ViewLinkImpl getPwcInspPrcWeaveFaultVL1() {
        return (ViewLinkImpl)findViewLink("PwcInspPrcWeaveFaultVL1");
    }

    /**
     * Container's getter for PwcOdmInspPrcWeaveFaultVO3.
     * @return PwcOdmInspPrcWeaveFaultVO3
     */
   /* public ViewObjectImpl getPwcOdmInspPrcWeaveFaultVO1() {
        return (ViewObjectImpl)findViewObject("PwcOdmInspPrcWeaveFaultVO1");
    }*/

    /**
     * Container's getter for PwcOdmInspPrcWeaveFaultVO3.
     * @return PwcOdmInspPrcWeaveFaultVO3
     */
    public ViewObjectImpl getPwcOdmInspPrcWeaveFaultVO3() {
        return (ViewObjectImpl)findViewObject("PwcOdmInspPrcWeaveFaultVO3");
    }
}
