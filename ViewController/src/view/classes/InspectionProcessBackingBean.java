package view.classes;

import java.util.Map;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import model.AM.InspectionProcessAMImpl;

import model.AM.client.InspectionProcessAMClient;
import model.AM.common.InspectionProcessAM;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.view.rich.component.rich.output.RichOutputText;

import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ApplicationModuleImpl;

public class InspectionProcessBackingBean {

    public InspectionProcessBackingBean() {
        super();
    }

    public void insertIntoFaultEntries(String faultName, String faultCategory, int points) {
        ApplicationModule am = getApplicationModule();
        ViewObject faultEntriesVO = (ViewObject) am.findViewObject("PwcOdmInspPrcFaultEntriesVO3");
        ViewObject faultTypesVO = (ViewObject) am.findViewObject("PwcInspPrcFaultTypesVO1");
        faultTypesVO.setNamedWhereClauseParam("p_fault_category", faultCategory);
        faultTypesVO.setNamedWhereClauseParam("p_fault_name", faultName);
        faultTypesVO.executeQuery();
        RowSetIterator rsi = faultTypesVO.createRowSetIterator(null);
        Row resultRow = rsi.next();
        if (resultRow!=null)
        {
            int faultTypeId = Integer.parseInt(resultRow.getAttribute(0).toString());
            Row newRow = faultEntriesVO.createRow();
            String faultEntryId = newRow.getAttribute("FaultEntryId").toString();
            newRow.setAttribute("FaultTypeId", faultTypeId);
            newRow.setAttribute("Points", points);
            faultEntriesVO.insertRow(newRow);
        }
        am.getTransaction().commit();
        ViewObject faultsTotalVO = (ViewObject)am.findViewObject("PwcOdmInsPrcFaultsTotalVO3");
        faultsTotalVO.executeQuery();
    }
    
    /**                      YARN FAULT                          **/

    public void YF_Slub_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",1);
    }

    public void YF_Slub_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",2);
    }

    public void YF_Slub_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",3);
    }

    public void YF_Slub_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",4);
    }

    public void YF_Slub_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",-1);
    }

    public void YF_Slub_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",-2);
    }

    public void YF_Slub_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",-3);
    }

    public void YF_Slub_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",-4);
    }

    public void YF_Nep_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",1);
    }

    public void YF_Neps_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",2);
    }

    public void YF_Neps_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",3);
    }

    public void YF_Neps_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",4);
    }

    public void YF_Neps_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",-1);
    }

    public void YF_Neps_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",-2);
    }

    public void YF_Neps_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",-3);
    }

    public void YF_Neps_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",-4);
    }

    public void YF_Foreign_Yarn_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",1);
    }

    public void YF_Foreign_Yarn_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",2);
    }

    public void YF_Foreign_Yarn_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",3);
    }
  
    public void YF_Foreign_Yarn_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",4);
    }

    public void YF_Foreign_Yarn_1_Undo_actionListener(ActionEvent actionEvent) {        
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",-1);
    }

    public void YF_Foreign_Yarn_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",-2);
    }

    public void YF_Foreign_Yarn_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",-3);
    }

    public void YF_Foreign_Yarn_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",-4);
    }

    public void WF_Thick_Thin_End_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",1);
    }

    public void WF_Thick_Thin_End_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",2);
    }

    public void WF_Thick_Thin_End_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",3);
    }

    public void WF_Thick_Thin_End_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",4);
    }

    public void WF_Thick_Thin_End_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",-1);
    }

    public void WF_Thick_Thin_End_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",-2);
    }

    public void WF_Thick_Thin_End_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",-3);
    }

    public void WF_Thick_Thin_End_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",-4);
    }

    public void WF_Thick_Thin_Pick_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",1);
    }

    public void WF_Thick_Thin_Pick_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",2);
    }

    public void WF_Thick_Thin_Pick_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",3);
    }

    public void WF_Thick_Thin_Pick_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",4);
    }

    public void WF_Thick_Thin_Pick_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",-1);
    }
    
    public void WF_Thick_Thin_Pick_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",-2);
    }

    public void WF_Thick_Thin_Pick_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",-3);
    }

    public void WF_Thick_Thin_Pick_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",-4);
    }

    public void WF_Knots_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Knots","Weaving Faults",1);
    }

    public void WF_Knots_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Knots","Weaving Faults",2);
    }

    public void WF_Knots_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Knots","Weaving Faults",3);
    }

    public void WF_Knots_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Knots","Weaving Faults",4);
    }

    public void WF_Knots_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Knots","Weaving Faults",-1);
    }

    public void WF_Knots_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Knots","Weaving Faults",-2);
    }

    public void WF_Knots_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Knots","Weaving Faults",-3);
    }

    public void WF_Knots_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Knots","Weaving Faults",-4);
    }

    public void WF_Mixed_Yarn_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Mixed Yarn","Weaving Faults",1);
    }

    public void WF_Mixed_Yarn_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Mixed Yarn","Weaving Faults",2);
    }

    public void WF_Mixed_Yarn_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Mixed Yarn","Weaving Faults",3);
    }

    public void WF_Mixed_Yarn_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Mixed Yarn","Weaving Faults",4);
    }

    public void WF_Mixed_Yarn_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Mixed Yarn","Weaving Faults",-1);
    }

    public void WF_Mixed_Yarn_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Mixed Yarn","Weaving Faults",-2);
    }

    public void WF_Mixed_Yarn_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Mixed Yarn","Weaving Faults",-3);
    }

    public void WF_Mixed_Yarn_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Mixed Yarn","Weaving Faults",-4);
    }

    public void WF_Double_Yarn_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Double Yarn","Weaving Faults",1);
    }

    public void WF_Double_Yarn_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Double Yarn","Weaving Faults",2);
    }

    public void WF_Double_Yarn_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Double Yarn","Weaving Faults",3);
    }

    public void WF_Double_Yarn_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Double Yarn","Weaving Faults",4);
    }

    public void WF_Double_Yarn_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Double Yarn","Weaving Faults",-1);
    }

    public void WF_Double_Yarn_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Double Yarn","Weaving Faults",-2);
    }

    public void WF_Double_Yarn_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Double Yarn","Weaving Faults",-3);
    }

    public void WF_Double_Yarn_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Double Yarn","Weaving Faults",-4);
    }

    public void WF_Miss_Yarn_Pick_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Yarn/Pick","Weaving Faults",1);
    }

    public void WF_Miss_Yarn_Pick_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Yarn/Pick","Weaving Faults",2);
    }

    public void WF_Miss_Yarn_Pick_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Yarn/Pick","Weaving Faults",3);
    }

    public void WF_Miss_Yarn_Pick_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Yarn/Pick","Weaving Faults",4);
    }

    public void WF_Miss_Yarn_Pick_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Yarn/Pick","Weaving Faults",-1);
    }

    public void WF_Miss_Yarn_Pick_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Yarn/Pick","Weaving Faults",-2);
    }

    public void WF_Miss_Yarn_Pick_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Yarn/Pick","Weaving Faults",-3);
    }

    public void WF_Miss_Yarn_Pick_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Yarn/Pick","Weaving Faults",-4);
    }

    public void WF_Reed_Mark_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Reed Mark","Weaving Faults",1);
    }

    public void WF_Reed_Mark_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Reed Mark","Weaving Faults",2);
    }

    public void WF_Reed_Mark_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Reed Mark","Weaving Faults",3);
    }

    public void WF_Reed_Mark_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Reed Mark","Weaving Faults",4);
    }

    public void WF_Reed_Mark_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Reed Mark","Weaving Faults",-1);
    }

    public void WF_Reed_Mark_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Reed Mark","Weaving Faults",-2);
    }

    public void WF_Reed_Mark_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Reed Mark","Weaving Faults",-3);
    }

    public void WF_Reed_Mark_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Reed Mark","Weaving Faults",-4);
    }
    
    public void WF_Hole_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Hole","Weaving Faults",1);
    }

    public void WF_Hole_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Hole","Weaving Faults",2);
    }

    public void WF_Hole_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Hole","Weaving Faults",3);
    }

    public void WF_Hole_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Hole","Weaving Faults",4);
    }

    public void WF_Hole_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Hole","Weaving Faults",-1);
    }

    public void WF_Hole_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Hole","Weaving Faults",-2);
    }

    public void WF_Hole_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Hole","Weaving Faults",-3);
    }

    public void WF_Hole_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Hole","Weaving Faults",-4);
    }

    public void WF_Stop_Mark_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stop Mark","Weaving Faults",1);
    }

    public void WF_Stop_Mark_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stop Mark","Weaving Faults",2);
    }

    public void WF_Stop_Mark_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stop Mark","Weaving Faults",3);
    }

    public void WF_Stop_Mark_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stop Mark","Weaving Faults",4);
    }

    public void WF_Stop_Mark_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stop Mark","Weaving Faults",-1);
    }

    public void WF_Stop_Mark_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stop Mark","Weaving Faults",-2);
    }

    public void WF_Stop_Mark_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stop Mark","Weaving Faults",-3);
    }

    public void WF_Stop_Mark_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stop Mark","Weaving Faults",-4);
    }

    public void WF_Broken_End_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stop Mark","Weaving Faults",1);
    }

    public void WF_Broken_End_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken End","Weaving Faults",2);
    }

    public void WF_Broken_End_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken End","Weaving Faults",3);
    }

    public void WF_Broken_End_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken End","Weaving Faults",4);
    }

    public void WF_Broken_End_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken End","Weaving Faults",-1);
    }

    public void WF_Broken_End_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken End","Weaving Faults",-2);
    }

    public void WF_Broken_End_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken End","Weaving Faults",-3);
    }

    public void WF_Broken_End_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken End","Weaving Faults",-4);
    }

    public void WF_Broken_Pick_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken Pick","Weaving Faults",1);
    }

    public void WF_Broken_Pick_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken Pick","Weaving Faults",2);
    }

    public void WF_Broken_Pick_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken Pick","Weaving Faults",3);
    }

    public void WF_Broken_Pick_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken Pick","Weaving Faults",4);
    }

    public void WF_Broken_Pick_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken Pick","Weaving Faults",-1);
    }

    public void WF_Broken_Pick_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken Pick","Weaving Faults",-2);
    }

    public void WF_Broken_Pick_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken Pick","Weaving Faults",-3);
    }

    public void WF_Broken_Pick_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Broken Pick","Weaving Faults",-4);
    }

    public void WF_Distortion_Mark_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Distortion Mark","Weaving Faults",1);
    }

    public void WF_Distortion_Mark_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Distortion Mark","Weaving Faults",2);
    }

    public void WF_Distortion_Mark_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Distortion Mark","Weaving Faults",3);
    }

    public void WF_Distortion_Mark_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Distortion Mark","Weaving Faults",4);
    }

    public void WF_Distortion_Mark_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Distortion Mark","Weaving Faults",-1);
    }

    public void WF_Distortion_Mark_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Distortion Mark","Weaving Faults",-2);
    }

    public void WF_Distortion_Mark_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Distortion Mark","Weaving Faults",-3);
    }

    public void WF_Distortion_Mark_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Distortion Mark","Weaving Faults",-4);
    }

    public void DF_Stain_Dirty_Mark_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stain/Dirty Marks","Dyeing Faults",1);
    }
    
    public void DF_Stain_Dirty_Mark_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stain/Dirty Marks","Dyeing Faults",2);
    }
    
    public void DF_Stain_Dirty_Mark_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stain/Dirty Marks","Dyeing Faults",3);
    }
    
    public void DF_Stain_Dirty_Mark_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stain/Dirty Marks","Dyeing Faults",4);
    }
    
    public void DF_Stain_Dirty_Mark_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stain/Dirty Marks","Dyeing Faults",-1);
    }
    
    public void DF_Stain_Dirty_Mark_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stain/Dirty Marks","Dyeing Faults",-2);
    }
    
    public void DF_Stain_Dirty_Mark_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stain/Dirty Marks","Dyeing Faults",-3);
    }
    
    public void DF_Stain_Dirty_Mark_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Stain/Dirty Marks","Dyeing Faults",-4);
    }
    
    public void DF_Crease_Mark_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Crease Mark","Dyeing Faults",1);
    }
    
    public void DF_Crease_Mark_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Crease Mark","Dyeing Faults",2);
    }
    
    public void DF_Crease_Mark_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Crease Mark","Dyeing Faults",3);
    }
    
    public void DF_Crease_Mark_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Crease Mark","Dyeing Faults",4);
    }
    
    public void DF_Crease_Mark_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Crease Mark","Dyeing Faults",-1);
    }
    
    public void DF_Crease_Mark_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Crease Mark","Dyeing Faults",-2);
    }
    
    public void DF_Crease_Mark_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Crease Mark","Dyeing Faults",-3);
    }
    
    public void DF_Crease_Mark_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Crease Mark","Dyeing Faults",-4);
    }
    
    public void DF_Joint_Mark_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Joint Mark","Dyeing Faults",1);
    }
    
    public void DF_Joint_Mark_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Joint Mark","Dyeing Faults",2);
    }
    
    public void DF_Joint_Mark_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Joint Mark","Dyeing Faults",3);
    }
    
    public void DF_Joint_Mark_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Joint Mark","Dyeing Faults",4);
    }
    
    public void DF_Joint_Mark_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Joint Mark","Dyeing Faults",-1);
    }
    
    public void DF_Joint_Mark_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Joint Mark","Dyeing Faults",-2);
    }
    
    public void DF_Joint_Mark_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Joint Mark","Dyeing Faults",-3);
    }
    
    public void DF_Joint_Mark_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Joint Mark","Dyeing Faults",-4);
    }
    
    public void DF_Dye_Resist_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Dye Resist","Dyeing Faults",1);
    }
    
    public void DF_Dye_Resist_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Dye Resist","Dyeing Faults",2);
    }
    
    public void DF_Dye_Resist_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Dye Resist","Dyeing Faults",3);
    }
    
    public void DF_Dye_Resist_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Dye Resist","Dyeing Faults",4);
    }
    
    public void DF_Dye_Resist_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Dye Resist","Dyeing Faults",-1);
    }
    
    public void DF_Dye_Resist_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Dye Resist","Dyeing Faults",-2);
    }
    
    public void DF_Dye_Resist_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Dye Resist","Dyeing Faults",-3);
    }
    
    public void DF_Dye_Resist_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Dye Resist","Dyeing Faults",-4);
    }
    
    public void DF_Shade_Variation_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Shade Variation","Dyeing Faults",1);
    }
    
    public void DF_Shade_Variation_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Shade Variation","Dyeing Faults",2);
    }
    
    public void DF_Shade_Variation_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Shade Variation","Dyeing Faults",3);
    }
    
    public void DF_Shade_Variation_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Shade Variation","Dyeing Faults",4);
    }
    
    public void DF_Shade_Variation_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Shade Variation","Dyeing Faults",-1);
    }
    
    public void DF_Shade_Variation_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Shade Variation","Dyeing Faults",-2);
    }
    
    public void DF_Shade_Variation_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Shade Variation","Dyeing Faults",-3);
    }
    
    public void DF_Shade_Variation_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Shade Variation","Dyeing Faults",-4);
    }
    
    public void DF_Oil_Spot_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Oil Spot","Dyeing Faults",1);
    }
    
    public void DF_Oil_Spot_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Oil Spot","Dyeing Faults",2);
    }
    
    public void DF_Oil_Spot_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Oil Spot","Dyeing Faults",3);
    }
    
    public void DF_Oil_Spot_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Oil Spot","Dyeing Faults",4);
    }
    
    public void DF_Oil_Spot_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Oil Spot","Dyeing Faults",-1);
    }
    
    public void DF_Oil_Spot_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Oil Spot","Dyeing Faults",-2);
    }

    public void DF_Oil_Spot_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Oil Spot","Dyeing Faults",-3);
    }
    
    public void DF_Oil_Spot_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Oil Spot","Dyeing Faults",-4);
    }
    
    public void DF_Drop_Mark_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Drop Mark","Dyeing Faults",1);
    }
    
    public void DF_Drop_Mark_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Drop Mark","Dyeing Faults",2);
    }
    
    public void DF_Drop_Mark_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Drop Mark","Dyeing Faults",3);
    }
    
    public void DF_Drop_Mark_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Drop Mark","Dyeing Faults",4);
    }
    
    public void DF_Drop_Mark_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Drop Mark","Dyeing Faults",-1);
    }

    public void DF_Drop_Mark_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Drop Mark","Dyeing Faults",-2);
    }
    
    public void DF_Drop_Mark_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Drop Mark","Dyeing Faults",-3);
    }
    
    public void DF_Drop_Mark_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Drop Mark","Dyeing Faults",-4);
    }
    
    public void DF_Line_Mark_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Line Mark","Dyeing Faults",1);
    }
    
    public void DF_Line_Mark_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Line Mark","Dyeing Faults",2);
    }
    
    public void DF_Line_Mark_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Line Mark","Dyeing Faults",3);
    }
    
    public void DF_Line_Mark_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Line Mark","Dyeing Faults",4);
    }
    
    public void DF_Line_Mark_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Line Mark","Dyeing Faults",-1);
    }
    
    public void DF_Line_Mark_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Line Mark","Dyeing Faults",-2);
    }
    
    public void DF_Line_Mark_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Line Mark","Dyeing Faults",-3);
    }
    
    public void DF_Line_Mark_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Line Mark","Dyeing Faults",-4);
    }
    
    public void PF_Miss_Print_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Print","Printing Faults",1);
    }
    
    public void PF_Miss_Print_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Print","Printing Faults",2);
    }
    
    public void PF_Miss_Print_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Print","Printing Faults",3);
    }
    
    public void PF_Miss_Print_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Print","Printing Faults",4);
    }
    
    public void PF_Miss_Print_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Print","Printing Faults",-1);
    }
    
    public void PF_Miss_Print_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Print","Printing Faults",-2);
    }
    
    public void PF_Miss_Print_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Print","Printing Faults",-3);
    }
    
    public void PF_Miss_Print_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Miss Print","Printing Faults",-4);
    }
    
    public void PF_Design_Out_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Design Out","Printing Faults",1);
    }
    
    public void PF_Design_Out_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Design Out","Printing Faults",2);
    }
    
    public void PF_Design_Out_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Design Out","Printing Faults",3);
    }
    
    public void PF_Design_Out_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Design Out","Printing Faults",4);
    }
    
    public void PF_Design_Out_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Design Out","Printing Faults",-1);
    }
    
    public void PF_Design_Out_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Design Out","Printing Faults",-2);
    }
    
    public void PF_Design_Out_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Design Out","Printing Faults",-3);
    }
    
    public void PF_Design_Out_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Design Out","Printing Faults",-4);
    }
    
    public void PF_Print_Overlap_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Print Overlap","Printing Faults",1);
    }
    
    public void PF_Print_Overlap_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Print Overlap","Printing Faults",2);
    }
    
    public void PF_Print_Overlap_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Print Overlap","Printing Faults",3);
    }
    
    public void PF_Print_Overlap_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Print Overlap","Printing Faults",4);
    }
    
    public void PF_Print_Overlap_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Print Overlap","Printing Faults",-1);
    }
    
    public void PF_Print_Overlap_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Print Overlap","Printing Faults",-2);
    }
    
    public void PF_Print_Overlap_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Print Overlap","Printing Faults",-3);
    }
    
    public void PF_Print_Overlap_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Print Overlap","Printing Faults",-4);
    }
    
    public static InspectionProcessAMImpl getApplicationModule() {
        FacesContext fctx = FacesContext.getCurrentInstance();
        BindingContext bindingContext = BindingContext.getCurrent();
        DCDataControl dc = bindingContext.findDataControl("InspectionProcessAMDataControl");
        return (InspectionProcessAMImpl)dc.getDataProvider();
        }

    public void saveChanges(ActionEvent actionEvent) {
        ApplicationModuleImpl am = getApplicationModule();     
        ViewObject inspPrcHeaderVO = (ViewObject)am.findViewObject("PwcInspectionProcessHeaderVO1");
        if (inspPrcHeaderVO.getCurrentRow().getAttribute("Attribute1")==null)
        {
            inspPrcHeaderVO.getCurrentRow().setAttribute("Attribute1","Y");
        }
        am.getDBTransaction().commit();
    }
    
    /*****Generic Method to Get BindingContainer**/
    public BindingContainer getBindingsCont() {
     return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    /**
     * Generic Method to execute operation
     * */
    public OperationBinding executeOperation(String operation) {
    OperationBinding createParam = getBindingsCont().getOperationBinding(operation);
    return createParam;
    }
    
    public static void showMessage(String message, int code) {

            FacesMessage.Severity s = null;
            if (code == 112) {
                s = FacesMessage.SEVERITY_ERROR;
            } else if (code == 111) {
                s = FacesMessage.SEVERITY_INFO;
            }

            FacesMessage msg = new FacesMessage(s, message, "");
            FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
