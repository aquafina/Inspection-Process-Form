package view.classes;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.output.RichOutputText;

public class InspectionProcessBackingBean {
    private RichOutputText gf_CM_Total_OT;

    public InspectionProcessBackingBean() {
        super();
    }

    public void GF_CM_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        String currValue = gf_CM_Total_OT.getValue().toString();
        currValue = (Integer.parseInt(currValue)+1)+"";
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        String currValue = gf_CM_Total_OT.getValue().toString();
        currValue = (Integer.parseInt(currValue)+2)+"";
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        String currValue = gf_CM_Total_OT.getValue().toString();
        currValue = (Integer.parseInt(currValue)+3)+"";
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        String currValue = gf_CM_Total_OT.getValue().toString();
        currValue = (Integer.parseInt(currValue)+4)+"";
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        String currValue = gf_CM_Total_OT.getValue().toString();
        currValue = (Integer.parseInt(currValue)-1)+"";
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
        String currValue = gf_CM_Total_OT.getValue().toString();
        currValue = (Integer.parseInt(currValue)-3)+"";
        gf_CM_Total_OT.setValue(currValue);
        System.out.println("currValue = "+currValue);
    }


    public void setGf_CM_Total_OT(RichOutputText gf_CM_Total_OT) {
        this.gf_CM_Total_OT = gf_CM_Total_OT;
    }

    public RichOutputText getGf_CM_Total_OT() {
        return gf_CM_Total_OT;
    }

    public void GF_CM_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
    }
}
