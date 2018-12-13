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
    }
    
    /**                      YARN FAULT                          **/

    public void YF_Slub_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",1);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Slub1 = "+yarnFaultVOCurrRow.getAttribute("Slub1"));
        count_YF_Slub_1 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Slub1")!=null?yarnFaultVOCurrRow.getAttribute("Slub1").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("SlubTotal")!=null?yarnFaultVOCurrRow.getAttribute("SlubTotal").toString():"0");
        currTotalValue = currTotalValue+1;
        count_YF_Slub_1  = count_YF_Slub_1 + 1;
        yarnFaultVOCurrRow.setAttribute("Slub1",count_YF_Slub_1);
        yarnFaultVOCurrRow.setAttribute("SlubTotal",currTotalValue);*/
    }

    public void YF_Slub_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",2);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Slub2 = "+yarnFaultVOCurrRow.getAttribute("Slub2"));
        count_YF_Slub_2 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Slub2")!=null?yarnFaultVOCurrRow.getAttribute("Slub2").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("SlubTotal")!=null?yarnFaultVOCurrRow.getAttribute("SlubTotal").toString():"0");
        currTotalValue = currTotalValue+2;
        count_YF_Slub_2  = count_YF_Slub_2 + 1;
        yarnFaultVOCurrRow.setAttribute("Slub2",count_YF_Slub_2);
        yarnFaultVOCurrRow.setAttribute("SlubTotal",currTotalValue);*/
    }

    public void YF_Slub_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",3);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Slub3 = "+yarnFaultVOCurrRow.getAttribute("Slub3"));
        count_YF_Slub_3 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Slub3")!=null?yarnFaultVOCurrRow.getAttribute("Slub3").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("SlubTotal")!=null?yarnFaultVOCurrRow.getAttribute("SlubTotal").toString():"0");
        currTotalValue = currTotalValue+3;
        count_YF_Slub_3 = count_YF_Slub_3 + 1;
        yarnFaultVOCurrRow.setAttribute("Slub3",count_YF_Slub_3);
        yarnFaultVOCurrRow.setAttribute("SlubTotal",currTotalValue);*/
    }

    public void YF_Slub_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",4);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Slub4 = "+yarnFaultVOCurrRow.getAttribute("Slub4"));
        count_YF_Slub_4 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Slub4")!=null?yarnFaultVOCurrRow.getAttribute("Slub4").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("SlubTotal")!=null?yarnFaultVOCurrRow.getAttribute("SlubTotal").toString():"0");
        currTotalValue = currTotalValue+4;
        count_YF_Slub_4 = count_YF_Slub_4 + 1;
        yarnFaultVOCurrRow.setAttribute("Slub4",count_YF_Slub_4);
        yarnFaultVOCurrRow.setAttribute("SlubTotal",currTotalValue);*/
    }

    public void YF_Slub_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",-1);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Slub1 = "+yarnFaultVOCurrRow.getAttribute("Slub1"));
        count_YF_Slub_1 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Slub1")!=null?yarnFaultVOCurrRow.getAttribute("Slub1").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("SlubTotal")!=null?yarnFaultVOCurrRow.getAttribute("SlubTotal").toString():"0");
        if (count_YF_Slub_1 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 1;
            count_YF_Slub_1 = count_YF_Slub_1 - 1;
            yarnFaultVOCurrRow.setAttribute("Slub1",count_YF_Slub_1);
            yarnFaultVOCurrRow.setAttribute("SlubTotal",currTotalValue);
        }*/
    }

    public void YF_Slub_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",-2);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Slub2 = "+yarnFaultVOCurrRow.getAttribute("Slub2"));
        count_YF_Slub_2 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Slub2")!=null?yarnFaultVOCurrRow.getAttribute("Slub2").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("SlubTotal")!=null?yarnFaultVOCurrRow.getAttribute("SlubTotal").toString():"0");
        if (count_YF_Slub_2 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 2;
            count_YF_Slub_2 = count_YF_Slub_2 - 1;
            yarnFaultVOCurrRow.setAttribute("Slub2",count_YF_Slub_2);
            yarnFaultVOCurrRow.setAttribute("SlubTotal",currTotalValue);
        }*/
    }

    public void YF_Slub_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",-3);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Slub3 = "+yarnFaultVOCurrRow.getAttribute("Slub3"));
        count_YF_Slub_3 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Slub3")!=null?yarnFaultVOCurrRow.getAttribute("Slub3").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("SlubTotal")!=null?yarnFaultVOCurrRow.getAttribute("SlubTotal").toString():"0");
        if (count_YF_Slub_3 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 3;
            count_YF_Slub_3 = count_YF_Slub_3 - 1;
            yarnFaultVOCurrRow.setAttribute("Slub3",count_YF_Slub_3);
            yarnFaultVOCurrRow.setAttribute("SlubTotal",currTotalValue);
        }*/
    }

    public void YF_Slub_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Slubs","Yarn Faults",-4);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Slub4 = "+yarnFaultVOCurrRow.getAttribute("Slub4"));
        count_YF_Slub_4 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Slub4")!=null?yarnFaultVOCurrRow.getAttribute("Slub4").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("SlubTotal")!=null?yarnFaultVOCurrRow.getAttribute("SlubTotal").toString():"0");
        if (count_YF_Slub_4 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 4;
            count_YF_Slub_4 = count_YF_Slub_4 - 1;
            yarnFaultVOCurrRow.setAttribute("Slub4",count_YF_Slub_4);
            yarnFaultVOCurrRow.setAttribute("SlubTotal",currTotalValue);
        }*/
    }

    public void YF_Nep_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",1);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Neps1 = "+yarnFaultVOCurrRow.getAttribute("Neps1"));
        count_YF_Neps_1 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Neps1")!=null?yarnFaultVOCurrRow.getAttribute("Neps1").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("NepsTotal")!=null?yarnFaultVOCurrRow.getAttribute("NepsTotal").toString():"0");
        currTotalValue = currTotalValue + 1;
        count_YF_Neps_1 = count_YF_Neps_1 + 1;
        yarnFaultVOCurrRow.setAttribute("Neps1",count_YF_Neps_1);
        yarnFaultVOCurrRow.setAttribute("NepsTotal",currTotalValue);*/
    }

    public void YF_Neps_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",2);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Neps2 = "+yarnFaultVOCurrRow.getAttribute("Neps2"));
        count_YF_Neps_2 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Neps2")!=null?yarnFaultVOCurrRow.getAttribute("Neps2").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("NepsTotal")!=null?yarnFaultVOCurrRow.getAttribute("NepsTotal").toString():"0");
        currTotalValue = currTotalValue + 2;
        count_YF_Neps_2 = count_YF_Neps_2 + 1;
        yarnFaultVOCurrRow.setAttribute("Neps2",count_YF_Neps_2);
        yarnFaultVOCurrRow.setAttribute("NepsTotal",currTotalValue);*/
    }

    public void YF_Neps_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",3);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Neps3 = "+yarnFaultVOCurrRow.getAttribute("Neps3"));
        count_YF_Neps_3 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Neps3")!=null?yarnFaultVOCurrRow.getAttribute("Neps3").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("NepsTotal")!=null?yarnFaultVOCurrRow.getAttribute("NepsTotal").toString():"0");
        currTotalValue = currTotalValue + 3;
        count_YF_Neps_3 = count_YF_Neps_3 + 1;
        yarnFaultVOCurrRow.setAttribute("Neps3",count_YF_Neps_3);
        yarnFaultVOCurrRow.setAttribute("NepsTotal",currTotalValue);*/
    }

    public void YF_Neps_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",4);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Neps4 = "+yarnFaultVOCurrRow.getAttribute("Neps4"));
        count_YF_Neps_4 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Neps4")!=null?yarnFaultVOCurrRow.getAttribute("Neps4").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("NepsTotal")!=null?yarnFaultVOCurrRow.getAttribute("NepsTotal").toString():"0");
        currTotalValue = currTotalValue + 4;
        count_YF_Neps_4 = count_YF_Neps_4 + 1;
        yarnFaultVOCurrRow.setAttribute("Neps4",count_YF_Neps_4);
        yarnFaultVOCurrRow.setAttribute("NepsTotal",currTotalValue);*/
    }

    public void YF_Neps_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",-1);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Neps1 = "+yarnFaultVOCurrRow.getAttribute("Neps1"));
        count_YF_Neps_1 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Neps1")!=null?yarnFaultVOCurrRow.getAttribute("Neps1").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("NepsTotal")!=null?yarnFaultVOCurrRow.getAttribute("NepsTotal").toString():"0");
        if (count_YF_Neps_1 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 1;
            count_YF_Neps_1 = count_YF_Neps_1 - 1;
            yarnFaultVOCurrRow.setAttribute("Neps1",count_YF_Neps_1);
            yarnFaultVOCurrRow.setAttribute("NepsTotal",currTotalValue);
        }*/
    }

    public void YF_Neps_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",-2);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        count_YF_Neps_2 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Neps2")!=null?yarnFaultVOCurrRow.getAttribute("Neps2").toString():"0");
        System.out.println("Neps2 = "+count_YF_Neps_2);
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("NepsTotal")!=null?yarnFaultVOCurrRow.getAttribute("NepsTotal").toString():"0");
        if (count_YF_Neps_2 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 2;
            count_YF_Neps_2 = count_YF_Neps_2 - 1;
            yarnFaultVOCurrRow.setAttribute("Neps2",count_YF_Neps_2);
            yarnFaultVOCurrRow.setAttribute("NepsTotal",currTotalValue);
        }*/
    }

    public void YF_Neps_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",-3);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Neps3 = "+yarnFaultVOCurrRow.getAttribute("Neps3"));
        count_YF_Neps_3 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Neps3")!=null?yarnFaultVOCurrRow.getAttribute("Neps3").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("NepsTotal")!=null?yarnFaultVOCurrRow.getAttribute("NepsTotal").toString():"0");
        if (count_YF_Neps_3 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 3;
            count_YF_Neps_3 = count_YF_Neps_3 - 1;
            yarnFaultVOCurrRow.setAttribute("Neps3",count_YF_Neps_3);
            yarnFaultVOCurrRow.setAttribute("NepsTotal",currTotalValue);
        }*/
    }

    public void YF_Neps_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Neps","Yarn Faults",-4);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("Neps4 = "+yarnFaultVOCurrRow.getAttribute("Neps4"));
        count_YF_Neps_4 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("Neps4")!=null?yarnFaultVOCurrRow.getAttribute("Neps4").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("NepsTotal")!=null?yarnFaultVOCurrRow.getAttribute("NepsTotal").toString():"0");
        if (count_YF_Neps_4 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 4;
            count_YF_Neps_4 = count_YF_Neps_4 - 1;
            yarnFaultVOCurrRow.setAttribute("Neps4",count_YF_Neps_4);
            yarnFaultVOCurrRow.setAttribute("NepsTotal",currTotalValue);
        }*/
    }

    public void YF_Foreign_Yarn_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",1);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("ForeignYarn1 = "+yarnFaultVOCurrRow.getAttribute("ForeignYarn1"));
        count_YF_Foreign_Yarn_1 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarn1")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarn1").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal").toString():"0");
        currTotalValue = currTotalValue + 1;
        count_YF_Foreign_Yarn_1 = count_YF_Foreign_Yarn_1 + 1;
        yarnFaultVOCurrRow.setAttribute("ForeignYarn1",count_YF_Foreign_Yarn_1);
        yarnFaultVOCurrRow.setAttribute("ForeignYarnTotal",currTotalValue);*/
    }

    public void YF_Foreign_Yarn_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",2);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("ForeignYarn2 = "+yarnFaultVOCurrRow.getAttribute("ForeignYarn2"));
        count_YF_Foreign_Yarn_2 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarn2")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarn2").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal").toString():"0");
        currTotalValue = currTotalValue + 2;
        count_YF_Foreign_Yarn_2 = count_YF_Foreign_Yarn_2 + 1;
        yarnFaultVOCurrRow.setAttribute("ForeignYarn2",count_YF_Foreign_Yarn_2);
        yarnFaultVOCurrRow.setAttribute("ForeignYarnTotal",currTotalValue);*/
    }

    public void YF_Foreign_Yarn_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",3);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("ForeignYarn3 = "+yarnFaultVOCurrRow.getAttribute("ForeignYarn3"));
        count_YF_Foreign_Yarn_3 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarn3")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarn3").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal").toString():"0");
        currTotalValue = currTotalValue + 3;
        count_YF_Foreign_Yarn_3 = count_YF_Foreign_Yarn_3 + 1;
        yarnFaultVOCurrRow.setAttribute("ForeignYarn3",count_YF_Foreign_Yarn_3);
        yarnFaultVOCurrRow.setAttribute("ForeignYarnTotal",currTotalValue);*/
    }
  
    public void YF_Foreign_Yarn_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",4);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("ForeignYarn4 = "+yarnFaultVOCurrRow.getAttribute("ForeignYarn4"));
        count_YF_Foreign_Yarn_4 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarn4")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarn4").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal").toString():"0");
        currTotalValue = currTotalValue + 4;
        count_YF_Foreign_Yarn_4 = count_YF_Foreign_Yarn_4 + 1;
        yarnFaultVOCurrRow.setAttribute("ForeignYarn4",count_YF_Foreign_Yarn_4);
        yarnFaultVOCurrRow.setAttribute("ForeignYarnTotal",currTotalValue);*/
    }

    public void YF_Foreign_Yarn_1_Undo_actionListener(ActionEvent actionEvent) {        
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",-1);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("ForeignYarn1 = "+yarnFaultVOCurrRow.getAttribute("ForeignYarn1"));
        count_YF_Foreign_Yarn_1 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarn1")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarn1").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal").toString():"0");
        if (count_YF_Foreign_Yarn_1 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 1;
            count_YF_Foreign_Yarn_1 = count_YF_Foreign_Yarn_1 - 1;
            yarnFaultVOCurrRow.setAttribute("ForeignYarn1",count_YF_Foreign_Yarn_1);
            yarnFaultVOCurrRow.setAttribute("ForeignYarnTotal",currTotalValue);
        }*/
    }

    public void YF_Foreign_Yarn_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",-2);
       /* yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("ForeignYarn2 = "+yarnFaultVOCurrRow.getAttribute("ForeignYarn2"));
        count_YF_Foreign_Yarn_2 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarn2")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarn2").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal").toString():"0");
        if (count_YF_Foreign_Yarn_2 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 2;
            count_YF_Foreign_Yarn_2 = count_YF_Foreign_Yarn_2 - 1;
            yarnFaultVOCurrRow.setAttribute("ForeignYarn2",count_YF_Foreign_Yarn_2);
            yarnFaultVOCurrRow.setAttribute("ForeignYarnTotal",currTotalValue);
        }*/
    }

    public void YF_Foreign_Yarn_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",-3);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("ForeignYarn3 = "+yarnFaultVOCurrRow.getAttribute("ForeignYarn3"));
        count_YF_Foreign_Yarn_3 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarn3")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarn3").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal").toString():"0");
        if (count_YF_Foreign_Yarn_3 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 3;
            count_YF_Foreign_Yarn_3 = count_YF_Foreign_Yarn_3 - 1;
            yarnFaultVOCurrRow.setAttribute("ForeignYarn3",count_YF_Foreign_Yarn_3);
            yarnFaultVOCurrRow.setAttribute("ForeignYarnTotal",currTotalValue);
        }*/
    }

    public void YF_Foreign_Yarn_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Foreign Yarn","Yarn Faults",-4);
        /*yarnFaultVOCurrRow = yarnFaultVO.getCurrentRow();
        if (yarnFaultVOCurrRow==null)
            yarnFaultVOCurrRow = yarnFaultVO.createRow();
        System.out.println("ForeignYarn4 = "+yarnFaultVOCurrRow.getAttribute("ForeignYarn4"));
        count_YF_Foreign_Yarn_4 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarn4")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarn4").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal")!=null?yarnFaultVOCurrRow.getAttribute("ForeignYarnTotal").toString():"0");
        if (count_YF_Foreign_Yarn_4 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 4;
            count_YF_Foreign_Yarn_4 = count_YF_Foreign_Yarn_4 - 1;
            yarnFaultVOCurrRow.setAttribute("ForeignYarn4",count_YF_Foreign_Yarn_4);
            yarnFaultVOCurrRow.setAttribute("ForeignYarnTotal",currTotalValue);
        }*/
    }

    public void WF_Thick_Thin_End_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",1);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
        {
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
            System.out.println("row is null ");
        }
        System.out.println("ThickThinEnd1 = "+weaveFaultVOCurrRow.getAttribute("ThickThinEnd1"));
        count_YF_Foreign_Yarn_1 = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ThickThinEnd1")!=null?yarnFaultVOCurrRow.getAttribute("ThickThinEnd1").toString():"0");
        int currTotalValue = Integer.parseInt(yarnFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?yarnFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        currTotalValue = currTotalValue + 1;
        count_YF_Foreign_Yarn_1 = count_YF_Foreign_Yarn_1 + 1;
        yarnFaultVOCurrRow.setAttribute("ThickThinEnd1",count_YF_Foreign_Yarn_1);
        yarnFaultVOCurrRow.setAttribute("ThickThinEndTotal",currTotalValue);*/
    }

    public void WF_Thick_Thin_End_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",2);
    /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
    if (weaveFaultVOCurrRow==null)
        weaveFaultVOCurrRow = weaveFaultVO.createRow();
    System.out.println("weave_Thick_Thin_End_2 = "+weaveFaultVOCurrRow.getAttribute("ThickThinEnd2"));
    count_WF_Thick_Thin_End_2 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEnd2")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEnd2").toString():"0");
    int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
    currTotalValue = currTotalValue + 2;
    count_WF_Thick_Thin_End_2 = count_WF_Thick_Thin_End_2 + 1;
    weaveFaultVOCurrRow.setAttribute("ThickThinEnd2",count_WF_Thick_Thin_End_2 );
    weaveFaultVOCurrRow.setAttribute("ThickThinEndTotal",currTotalValue);*/
    }

    public void WF_Thick_Thin_End_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",3);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_End_3 = "+weaveFaultVOCurrRow.getAttribute("ThickThinEnd3"));
        count_WF_Thick_Thin_End_3 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEnd3")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEnd3").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        currTotalValue = currTotalValue + 3;
        count_WF_Thick_Thin_End_3 = count_WF_Thick_Thin_End_3 + 1;
        weaveFaultVOCurrRow.setAttribute("ThickThinEnd3",count_WF_Thick_Thin_End_3 );
        weaveFaultVOCurrRow.setAttribute("ThickThinEndTotal",currTotalValue);*/
    }

    public void WF_Thick_Thin_End_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",4);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_End_4 = "+weaveFaultVOCurrRow.getAttribute("ThickThinEnd4"));
        count_WF_Thick_Thin_End_4 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEnd4")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEnd4").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        currTotalValue = currTotalValue + 4;
        count_WF_Thick_Thin_End_4 = count_WF_Thick_Thin_End_4 + 1;
        weaveFaultVOCurrRow.setAttribute("ThickThinEnd4",count_WF_Thick_Thin_End_4 );
        weaveFaultVOCurrRow.setAttribute("ThickThinEndTotal",currTotalValue);*/
    }

    public void WF_Thick_Thin_End_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",-1);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_End_1 = "+weaveFaultVOCurrRow.getAttribute("ThickThinEnd1"));
        count_WF_Thick_Thin_End_1 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEnd1")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEnd1").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        if (count_WF_Thick_Thin_End_1 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 1;
            count_WF_Thick_Thin_End_1 = count_WF_Thick_Thin_End_1 - 1;
            weaveFaultVOCurrRow.setAttribute("ThickThinEnd1",count_WF_Thick_Thin_End_1 );
            weaveFaultVOCurrRow.setAttribute("ThickThinEndTotal",currTotalValue);
        }*/
    }

    public void WF_Thick_Thin_End_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",-2);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_End_2 = "+weaveFaultVOCurrRow.getAttribute("ThickThinEnd2"));
        count_WF_Thick_Thin_End_2 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEnd2")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEnd2").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        if (count_WF_Thick_Thin_End_2 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 2;
            count_WF_Thick_Thin_End_2 = count_WF_Thick_Thin_End_2 - 1;
            weaveFaultVOCurrRow.setAttribute("ThickThinEnd2",count_WF_Thick_Thin_End_2 );
            weaveFaultVOCurrRow.setAttribute("ThickThinEndTotal",currTotalValue);
        }*/
    }

    public void WF_Thick_Thin_End_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",-3);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_End_3 = "+weaveFaultVOCurrRow.getAttribute("ThickThinEnd3"));
        count_WF_Thick_Thin_End_3 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEnd3")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEnd3").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        if (count_WF_Thick_Thin_End_3 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 3;
            count_WF_Thick_Thin_End_3 = count_WF_Thick_Thin_End_3 - 1;
            weaveFaultVOCurrRow.setAttribute("ThickThinEnd3",count_WF_Thick_Thin_End_3 );
            weaveFaultVOCurrRow.setAttribute("ThickThinEndTotal",currTotalValue);
        }*/
    }

    public void WF_Thick_Thin_End_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin End","Weaving Faults",-4);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_End_4 = "+weaveFaultVOCurrRow.getAttribute("ThickThinEnd4"));
        count_WF_Thick_Thin_End_4 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEnd4")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEnd4").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        if (count_WF_Thick_Thin_End_4 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 4;
            count_WF_Thick_Thin_End_4 = count_WF_Thick_Thin_End_4 - 1;
            weaveFaultVOCurrRow.setAttribute("ThickThinEnd4",count_WF_Thick_Thin_End_4 );
            weaveFaultVOCurrRow.setAttribute("ThickThinEndTotal",currTotalValue);
        }*/
    }

    public void WF_Thick_Thin_Pick_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",1);
    /*    weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_Pick_1 = "+weaveFaultVOCurrRow.getAttribute("ThickThinPick1"));
        count_WF_Thick_Thin_Pick_1 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinPick1")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinPick1").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        currTotalValue = currTotalValue + 1;
        count_WF_Thick_Thin_Pick_1 = count_WF_Thick_Thin_Pick_1 + 1;
        weaveFaultVOCurrRow.setAttribute("ThickThinPick1",count_WF_Thick_Thin_Pick_1);
        weaveFaultVOCurrRow.setAttribute("ThickThinPickTotal",currTotalValue);*/
    }

    public void WF_Thick_Thin_Pick_2_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",2);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_Pick_2 = "+weaveFaultVOCurrRow.getAttribute("ThickThinPick2"));
        count_WF_Thick_Thin_Pick_2 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinPick2")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinPick2").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        currTotalValue = currTotalValue + 2;
        count_WF_Thick_Thin_Pick_2 = count_WF_Thick_Thin_Pick_2 + 1;
        weaveFaultVOCurrRow.setAttribute("ThickThinPick2",count_WF_Thick_Thin_Pick_2);
        weaveFaultVOCurrRow.setAttribute("ThickThinPickTotal",currTotalValue);*/
    }

    public void WF_Thick_Thin_Pick_3_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",3);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_Pick_3 = "+weaveFaultVOCurrRow.getAttribute("ThickThinPick3"));
        count_WF_Thick_Thin_Pick_3 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinPick3")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinPick3").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        currTotalValue = currTotalValue + 3;
        count_WF_Thick_Thin_Pick_3 = count_WF_Thick_Thin_Pick_3 + 1;
        weaveFaultVOCurrRow.setAttribute("ThickThinPick3",count_WF_Thick_Thin_Pick_3);
        weaveFaultVOCurrRow.setAttribute("ThickThinPickTotal",currTotalValue);*/
    }

    public void WF_Thick_Thin_Pick_4_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",4);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_Pick_4 = "+weaveFaultVOCurrRow.getAttribute("ThickThinPick4"));
        count_WF_Thick_Thin_Pick_4 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinPick4")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinPick4").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        currTotalValue = currTotalValue + 4;
        count_WF_Thick_Thin_Pick_4 = count_WF_Thick_Thin_Pick_4 + 1;
        weaveFaultVOCurrRow.setAttribute("ThickThinPick4",count_WF_Thick_Thin_Pick_4);
        weaveFaultVOCurrRow.setAttribute("ThickThinPickTotal",currTotalValue);*/
    }

    public void WF_Thick_Thin_Pick_1_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",-1);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_Pick_1 = "+weaveFaultVOCurrRow.getAttribute("ThickThinPick1"));
        count_WF_Thick_Thin_Pick_1 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinPick1")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinPick1").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        if (count_WF_Thick_Thin_Pick_1 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 1;
            count_WF_Thick_Thin_Pick_1 = count_WF_Thick_Thin_Pick_1 - 1;
            weaveFaultVOCurrRow.setAttribute("ThickThinPick1",count_WF_Thick_Thin_Pick_1);
            weaveFaultVOCurrRow.setAttribute("ThickThinPickTotal",currTotalValue);
        }*/
    }
    
    public void WF_Thick_Thin_Pick_2_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",-2);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_Pick_2 = "+weaveFaultVOCurrRow.getAttribute("ThickThinPick2"));
        count_WF_Thick_Thin_Pick_2 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinPick2")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinPick2").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        if (count_WF_Thick_Thin_Pick_2 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 2;
            count_WF_Thick_Thin_Pick_2 = count_WF_Thick_Thin_Pick_2 - 1;
            weaveFaultVOCurrRow.setAttribute("ThickThinPick2",count_WF_Thick_Thin_Pick_2);
            weaveFaultVOCurrRow.setAttribute("ThickThinPickTotal",currTotalValue);
        }*/
    }

    public void WF_Thick_Thin_Pick_3_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",-3);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_Pick_3 = "+weaveFaultVOCurrRow.getAttribute("ThickThinPick3"));
        count_WF_Thick_Thin_Pick_3 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinPick3")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinPick3").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        if (count_WF_Thick_Thin_Pick_3 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 3;
            count_WF_Thick_Thin_Pick_3 = count_WF_Thick_Thin_Pick_3 - 1;
            weaveFaultVOCurrRow.setAttribute("ThickThinPick3",count_WF_Thick_Thin_Pick_3);
            weaveFaultVOCurrRow.setAttribute("ThickThinPickTotal",currTotalValue);
        }*/
    }

    public void WF_Thick_Thin_Pick_4_Undo_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Thick/Thin Pick","Weaving Faults",-4);
        /*weaveFaultVOCurrRow = weaveFaultVO.getCurrentRow();
        if (weaveFaultVOCurrRow==null)
            weaveFaultVOCurrRow = weaveFaultVO.createRow();
        System.out.println("weave_Thick_Thin_Pick_4 = "+weaveFaultVOCurrRow.getAttribute("ThickThinPick4"));
        count_WF_Thick_Thin_Pick_4 = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinPick4")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinPick4").toString():"0");
        int currTotalValue = Integer.parseInt(weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal")!=null?weaveFaultVOCurrRow.getAttribute("ThickThinEndTotal").toString():"0");
        if (count_WF_Thick_Thin_Pick_4 > 0 && currTotalValue > 0)
        {
            currTotalValue = currTotalValue - 4;
            count_WF_Thick_Thin_Pick_4 = count_WF_Thick_Thin_Pick_4 - 1;
            weaveFaultVOCurrRow.setAttribute("ThickThinPick4",count_WF_Thick_Thin_Pick_4);
            weaveFaultVOCurrRow.setAttribute("ThickThinPickTotal",currTotalValue);
        }*/
    }

                
                
    
    public void WF_Knots_1_Points_actionListener(ActionEvent actionEvent) {
        insertIntoFaultEntries("Knots","Weaving Faults",1);
        /*int currValue = Integer.parseInt(df_OS_Total_OT.getValue().toString());
        currValue = currValue+1;
        df_OS_Total_OT.setValue(currValue);
        count_DF_OS_1++;*/
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
        // Add event code here...
        ApplicationModuleImpl am = getApplicationModule();
//        ViewObject greigeFaultVO = (ViewObject)am.findViewObject("PwcOdmInspPrcGreigeFaultVO2");
        //greigeFaultVO.getCurrentRow().setAttribute("CreaseMarkTotal", Integer.parseInt(gf_CM_Total_OT.getValue().toString()));
        /*Row currGreigeFaultRow = greigeFaultVO.getCurrentRow();
        if (currGreigeFaultRow==null) {
            currGreigeFaultRow = greigeFaultVO.createRow();
        }*/
        /*Row newRow = greigeFaultVO.createRow();
        ViewObject inpectionLineVO = (ViewObject)am.findViewObject("PwcInspectionProcessLineVO1");
        String rollNumber = inpectionLineVO.getCurrentRow().getAttribute("RollNumber").toString();
        currGreigeFaultRow.setAttribute("InspPrcRollNumber", rollNumber);*/
//        showMessage(count_GF_CM_1+"", 112);
        /*currGreigeFaultRow.setAttribute("CreaseMark1", count_GF_CM_1);
        currGreigeFaultRow.setAttribute("CreaseMark2", count_GF_CM_2);
        currGreigeFaultRow.setAttribute("CreaseMark3", count_GF_CM_3);
        currGreigeFaultRow.setAttribute("CreaseMark4", count_GF_CM_4);
        currGreigeFaultRow.setAttribute("CreaseMarkTotal", Integer.parseInt(gf_CM_Total_OT.getValue().toString()));
        /*currGreigeFaultRow.setAttribute("WidthVariation1", count_GF_WV_1);
        currGreigeFaultRow.setAttribute("WidthVariation2", count_GF_WV_2);
        currGreigeFaultRow.setAttribute("WidthVariation3", count_GF_WV_3);
        currGreigeFaultRow.setAttribute("WidthVariation4", count_GF_WV_4);
        currGreigeFaultRow.setAttribute("WidthVariationTotal", Integer.parseInt(gf_WV_Total_OT.getValue().toString())) ;
        currGreigeFaultRow.setAttribute("LineMark1", count_GF_LM_1);
        currGreigeFaultRow.setAttribute("LineMark2", count_GF_LM_2);
        currGreigeFaultRow.setAttribute("LineMark3", count_GF_LM_3);
        currGreigeFaultRow.setAttribute("LineMark4", count_GF_LM_4);
        currGreigeFaultRow.setAttribute("LineMarkTotal",Integer.parseInt(gf_LM_Total_OT.getValue().toString()));
        currGreigeFaultRow.setAttribute("LycraNaps1", count_GF_LN_1);
        currGreigeFaultRow.setAttribute("LycraNaps2", count_GF_LN_2);
        currGreigeFaultRow.setAttribute("LycraNaps3", count_GF_LN_3);
        currGreigeFaultRow.setAttribute("LycraNaps4", count_GF_LN_4);
        currGreigeFaultRow.setAttribute("LycraNapsTotal", Integer.parseInt(gf_LN_Total_OT.getValue().toString()));
        currGreigeFaultRow.setAttribute("FlyYarn1", count_GF_FY_1);
        currGreigeFaultRow.setAttribute("FlyYarn2", count_GF_FY_2);
        currGreigeFaultRow.setAttribute("FlyYarn3", count_GF_FY_3);
        currGreigeFaultRow.setAttribute("FlyYarn4", count_GF_FY_4);
        currGreigeFaultRow.setAttribute("FlyYarnTotal",Integer.parseInt(gf_FY_Total_OT.getValue().toString()));
        ViewObject dyeFaultVO = (ViewObject)am.findViewObject("PwcOdmInspPrcDyeFaultVO1");
        newRow = dyeFaultVO.createRow();
        newRow.setAttribute("InspPrcRollNumber", rollNumber);
        newRow.setAttribute("OffShade1", count_DF_OS_1);
        newRow.setAttribute("OffShade2", count_DF_OS_2);
        newRow.setAttribute("OffShade3", count_DF_OS_3);
        newRow.setAttribute("OffShade4", count_DF_OS_4);
        newRow.setAttribute("OffShadeTotal",Integer.parseInt(df_OS_Total_OT.getValue().toString()));
        newRow.setAttribute("ShadeVariation1", count_DF_SV_1);
        newRow.setAttribute("ShadeVariation2", count_DF_SV_2);
        newRow.setAttribute("ShadeVariation3", count_DF_SV_3);
        newRow.setAttribute("ShadeVariation4", count_DF_SV_4);
        newRow.setAttribute("ShadeVariationTotal",Integer.parseInt(df_SV_Total_OT.getValue().toString()));
        newRow.setAttribute("Spot1", count_DF_Spot_1);
        newRow.setAttribute("Spot2", count_DF_Spot_2);
        newRow.setAttribute("Spot3", count_DF_Spot_3);
        newRow.setAttribute("Spot4", count_DF_Spot_4);
        newRow.setAttribute("SpotTotal",Integer.parseInt(df_Spot_Total_OT.getValue().toString()));
        newRow.setAttribute("MissPrint1", count_DF_MP_1);
        newRow.setAttribute("MissPrint2", count_DF_MP_2);
        newRow.setAttribute("MissPrint3", count_DF_MP_3);
        newRow.setAttribute("MissPrint4", count_DF_MP_4);
        newRow.setAttribute("MissPrintTotal",Integer.parseInt(df_MP_Total_OT.getValue().toString()));
        newRow.setAttribute("DyeStain1", count_DF_DS_1);
        newRow.setAttribute("DyeStain2", count_DF_DS_2);
        newRow.setAttribute("DyeStain3", count_DF_DS_3);
        newRow.setAttribute("DyeStain4", count_DF_DS_4);
        newRow.setAttribute("DyeStainTotal",Integer.parseInt(df_DS_Total_OT.getValue().toString()));
        newRow.setAttribute("StopMark1", count_DF_SM_1);
        newRow.setAttribute("StopMark2", count_DF_SM_2);
        newRow.setAttribute("StopMark3", count_DF_SM_3);
        newRow.setAttribute("StopMark4", count_DF_SM_4);
        newRow.setAttribute("StopMarkTotal",Integer.parseInt(df_SM_Total_OT.getValue().toString()));
        newRow.setAttribute("BarMark1", count_DF_BM_1);
        newRow.setAttribute("BarMark2", count_DF_BM_2);
        newRow.setAttribute("BarMark3", count_DF_BM_3);
        newRow.setAttribute("BarMark4", count_DF_BM_4);
        newRow.setAttribute("BarMarkTotal",Integer.parseInt(df_BM_Total_OT.getValue().toString()));
        ViewObject yarnFaultVO = (ViewObject)am.findViewObject("PwcOdmInspPrcYarnFaultVO1");
        newRow = yarnFaultVO.createRow();
        newRow.setAttribute("InspPrcRollNumber", rollNumber);
        newRow.setAttribute("ThickYarn1", count_YF_TY_1);
        newRow.setAttribute("ThickYarn2", count_YF_TY_2);
        newRow.setAttribute("ThickYarn3", count_YF_TY_3);
        newRow.setAttribute("ThickYarn4", count_YF_TY_4);
        newRow.setAttribute("ThickYarnTotal",Integer.parseInt(yf_TY_Total_OT.getValue().toString()));
        newRow.setAttribute("ThinkYarn1", count_YF_TY1_1);
        newRow.setAttribute("ThinkYarn2", count_YF_TY1_2);
        newRow.setAttribute("ThinkYarn3", count_YF_TY1_3);
        newRow.setAttribute("ThinkYarn4", count_YF_TY1_4);
        newRow.setAttribute("ThinkYarnTotal",Integer.parseInt(yf_TY1_Total_OT.getValue().toString()));
        newRow.setAttribute("Slub1", count_YF_Slub_1);
        newRow.setAttribute("Slub2", count_YF_Slub_2);
        newRow.setAttribute("Slub3", count_YF_Slub_3);
        newRow.setAttribute("Slub4", count_YF_Slub_4);
        newRow.setAttribute("SlubTotal", yf_Slub_Total_OT.getValue().toString());*/
        
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

    
    //#{bindings.CreateInsert.execute}

    /*public void inspectionProcLinesNewAction(ActionEvent actionEvent) {
        // Add event code here...
        gf_CM_Total_OT.setValue(0);
        gf_WV_Total_OT.setValue(0);
        gf_LM_Total_OT.setValue(0);
        gf_LN_Total_OT.setValue(0);
        gf_FY_Total_OT.setValue(0);
        df_OS_Total_OT.setValue(0);
        df_SV_Total_OT.setValue(0);
        df_Spot_Total_OT.setValue(0);
        df_MP_Total_OT.setValue(0);
        df_DS_Total_OT.setValue(0);
        df_SM_Total_OT.setValue(0);
        df_BM_Total_OT.setValue(0);
        yf_TY_Total_OT.setValue(0);
        yf_TY1_Total_OT.setValue(0);
        yf_Slub_Total_OT.setValue(0);
        BindingContainer bindings = getBindingsCont();
        OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert");
        operationBinding.execute();

    }*/

    public void addNewLine(ActionEvent actionEvent) {
        ApplicationModuleImpl am = getApplicationModule();
        BindingContainer bindings = BindingContext.getCurrent().getCurrentBindingsEntry();
        oracle.binding.OperationBinding operationBinding = bindings.getOperationBinding("CreateInsert2");
        if (operationBinding.getResult() != null) {
                Boolean result = (Boolean) operationBinding.getResult();
                operationBinding.execute();
        }
        else System.out.println("ob is null");
        
    }
}
