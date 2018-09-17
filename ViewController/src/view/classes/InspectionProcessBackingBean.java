package view.classes;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

public class InspectionProcessBackingBean {
    private RichOutputText gf_CM_Total_OT;
    private RichOutputText gf_WV_Total_OT;
    private RichOutputText gf_LM_Total_OT;
    private RichOutputText gf_LN_Total_OT;
    private RichOutputText gf_FY_Total_OT;

    public InspectionProcessBackingBean() {
        super();
    }

    public void GF_CM_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue().toString());
        currValue = currValue+1;
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue().toString());
        currValue = currValue+2;
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue().toString());
        currValue = currValue+3;
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue().toString());
        currValue = currValue+4;
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        String currValue = gf_CM_Total_OT.getValue().toString();
        currValue = (Integer.parseInt(currValue)-2)+"";
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        gf_CM_Total_OT.setValue(currValue);
    }

    public void setGf_CM_Total_OT(RichOutputText gf_CM_Total_OT) {
        this.gf_CM_Total_OT = gf_CM_Total_OT;
    }

    public RichOutputText getGf_CM_Total_OT() {
        return gf_CM_Total_OT;
    }

    public void setGt_WV_Total_OT(RichOutputText gt_WV_Total_OT) {
        this.gf_WV_Total_OT = gt_WV_Total_OT;
    }

    public RichOutputText getGt_WV_Total_OT() {
        return gf_WV_Total_OT;
    }

    public void GF_WV_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = currValue+1;
        gf_WV_Total_OT.setValue(currValue);
    }

    public void GF_WV_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = currValue+2;
        gf_WV_Total_OT.setValue(currValue);
    }

    public void GF_WV_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = currValue+3;
        gf_WV_Total_OT.setValue(currValue);
    }

    public void GF_WV_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = currValue+4;
        gf_WV_Total_OT.setValue(currValue);
    }

    public void GF_WV_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        gf_WV_Total_OT.setValue(currValue);
    }

    public void GF_WV_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        gf_WV_Total_OT.setValue(currValue);
    }

    public void GF_WV_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        gf_WV_Total_OT.setValue(currValue);
    }

    public void GF_WV_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        gf_WV_Total_OT.setValue(currValue);
    }

    public void GF_LM_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = currValue+1;
        gf_LM_Total_OT.setValue(currValue);
    }

    public void GF_LM_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = currValue+2;
        gf_LM_Total_OT.setValue(currValue);
    }

    public void GF_LM_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = currValue+3;
        gf_LM_Total_OT.setValue(currValue);
    }
  
    public void GF_LM_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = currValue+4;
        gf_LM_Total_OT.setValue(currValue);
    }

    public void GF_LM_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        gf_LM_Total_OT.setValue(currValue);
    }

    public void GF_LM_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        gf_LM_Total_OT.setValue(currValue);
    }

    public void GF_LM_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        gf_LM_Total_OT.setValue(currValue);
    }

    public void GF_LM_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        gf_LM_Total_OT.setValue(currValue);
    }

    public void setGf_LM_Total_OT(RichOutputText gf_LM_Total_OT) {
        this.gf_LM_Total_OT = gf_LM_Total_OT;
    }

    public RichOutputText getGf_LM_Total_OT() {
        return gf_LM_Total_OT;
    }

    public void GF_LN_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = currValue+1;
        gf_LN_Total_OT.setValue(currValue);
    }

    public void GF_LN_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = currValue+2;
        gf_LN_Total_OT.setValue(currValue);
    }

    public void GF_LN_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = currValue+3;
        gf_LN_Total_OT.setValue(currValue);
    }

    public void GF_LN_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = currValue+4;
        gf_LN_Total_OT.setValue(currValue);
    }

    public void GF_LN_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        gf_LN_Total_OT.setValue(currValue);
    }

    public void GF_LN_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        gf_LN_Total_OT.setValue(currValue);
    }

    public void GF_LN_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        gf_LN_Total_OT.setValue(currValue);
    }

    public void GF_LN_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        gf_LN_Total_OT.setValue(currValue);
    }

    public void setGf_LN_Total_OT(RichOutputText gf_LN_Total_OT) {
        this.gf_LN_Total_OT = gf_LN_Total_OT;
    }

    public RichOutputText getGf_LN_Total_OT() {
        return gf_LN_Total_OT;
    }

    public void GF_FY_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = currValue+1;
        gf_FY_Total_OT.setValue(currValue);
    }

    public void GF_FY_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = currValue+2;
        gf_FY_Total_OT.setValue(currValue);
    }

    public void GF_FY_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = currValue+3;
        gf_FY_Total_OT.setValue(currValue);
    }

    public void GF_FY_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = currValue+4;
        gf_FY_Total_OT.setValue(currValue);
    }

    public void GF_FY_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        gf_FY_Total_OT.setValue(currValue);
    }

    public void GF_FY_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        gf_FY_Total_OT.setValue(currValue);
    }

    public void GF_FY_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        gf_FY_Total_OT.setValue(currValue);
    }

    public void GF_FY_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        gf_FY_Total_OT.setValue(currValue);
    }

    public void setGf_FY_Total_OT(RichOutputText gf_FY_Total_OT) {
        this.gf_FY_Total_OT = gf_FY_Total_OT;
    }

    public RichOutputText getGf_FY_Total_OT() {
        return gf_FY_Total_OT;
    }
}
