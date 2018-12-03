package view.classes;

import java.util.Map;

import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import model.AM.InspectionProcessAMImpl;

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
    private RichOutputText gf_CM_Total_OT;
    private RichOutputText gf_WV_Total_OT;
    private RichOutputText gf_LM_Total_OT;
    private RichOutputText gf_LN_Total_OT;
    private RichOutputText gf_FY_Total_OT;
    private RichOutputText df_OS_Total_OT;
    private RichOutputText df_SV_Total_OT;
    private RichOutputText df_Spot_Total_OT;
    private RichOutputText df_MP_Total_OT;
    private RichOutputText df_DS_Total_OT;
    private RichOutputText df_SM_Total_OT;
    private RichOutputText df_BM_Total_OT;
    private RichOutputText yf_TY_Total_OT;
    private RichOutputText yf_TY1_Total_OT;
    private RichOutputText yf_Slub_Total_OT;
    
    private int count_GF_CM_1 = 0;
    private int count_GF_CM_2 = 0;
    private int count_GF_CM_3 = 0;
    private int count_GF_CM_4 = 0;
    
    private int count_GF_WV_1 = 0;
    private int count_GF_WV_2 = 0;
    private int count_GF_WV_3 = 0;
    private int count_GF_WV_4 = 0;
    
    private int count_GF_LM_1 =0;
    private int count_GF_LM_2 =0;
    private int count_GF_LM_3 =0;
    private int count_GF_LM_4 =0;
    
    private int count_GF_LN_1 = 0;
    private int count_GF_LN_2 = 0;
    private int count_GF_LN_3 = 0;
    private int count_GF_LN_4 = 0;
    
    private int count_GF_FY_1 = 0; 
    private int count_GF_FY_2 = 0;
    private int count_GF_FY_3 = 0;
    private int count_GF_FY_4 = 0;
    
    private int count_DF_OS_1 = 0;
    private int count_DF_OS_2 = 0;
    private int count_DF_OS_3 = 0;
    private int count_DF_OS_4 = 0;
    
    private int count_DF_SV_1 = 0;
    private int count_DF_SV_2 = 0;
    private int count_DF_SV_3 = 0;
    private int count_DF_SV_4 = 0;
    
    private int count_DF_Spot_1 = 0;
    private int count_DF_Spot_2 = 0;
    private int count_DF_Spot_3 = 0;
    private int count_DF_Spot_4 = 0;
    
    private int count_DF_MP_1 = 0;
    private int count_DF_MP_2 = 0;
    private int count_DF_MP_3 = 0;
    private int count_DF_MP_4 = 0;
    
    private int count_DF_DS_1 = 0;
    private int count_DF_DS_2 = 0;
    private int count_DF_DS_3 = 0;
    private int count_DF_DS_4 = 0;
    
    private int count_DF_SM_1 = 0;
    private int count_DF_SM_2 = 0;
    private int count_DF_SM_3 = 0;
    private int count_DF_SM_4 = 0;
    
    private int count_DF_BM_1 = 0;
    private int count_DF_BM_2 = 0;
    private int count_DF_BM_3 = 0;
    private int count_DF_BM_4 = 0;
    
    private int count_YF_TY_1 = 0;
    private int count_YF_TY_2 = 0;
    private int count_YF_TY_3 = 0;
    private int count_YF_TY_4 = 0;

    private int count_YF_TY1_1 = 0;
    private int count_YF_TY1_2 = 0;
    private int count_YF_TY1_3 = 0;
    private int count_YF_TY1_4 = 0;

    private int count_YF_Slub_1 = 0;
    private int count_YF_Slub_2 = 0;
    private int count_YF_Slub_3 = 0;
    private int count_YF_Slub_4 = 0;

    public InspectionProcessBackingBean() {
        super();
    }

    /**                      GREIGE FAULT                          **/

    public void GF_CM_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue()!=null?gf_CM_Total_OT.getValue().toString():"0");
        currValue = currValue+1;
        gf_CM_Total_OT.setValue(currValue);
        count_GF_CM_1++;
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue()!=null?gf_CM_Total_OT.getValue().toString():"0");
        currValue = currValue+2;
        gf_CM_Total_OT.setValue(currValue);
        count_GF_CM_2++;
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue()!=null?gf_CM_Total_OT.getValue().toString():"0");
        currValue = currValue+3;
        gf_CM_Total_OT.setValue(currValue);
        count_GF_CM_3++;
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue()!=null?gf_CM_Total_OT.getValue().toString():"0");
        currValue = currValue+4;
        gf_CM_Total_OT.setValue(currValue);
        count_GF_CM_4++;
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue()!=null?gf_CM_Total_OT.getValue().toString():"0");
        currValue = (currValue-1)<0?0:(currValue-1);
        gf_CM_Total_OT.setValue(currValue);
        if (count_GF_CM_1>0)
            count_GF_CM_1--;
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue()!=null?gf_CM_Total_OT.getValue().toString():"0");
        currValue = (currValue-2)<0?0:(currValue-2);
        gf_CM_Total_OT.setValue(currValue);
        if (count_GF_CM_2>0)
            count_GF_CM_2--;
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue()!=null?gf_CM_Total_OT.getValue().toString():"0");
        currValue = (currValue-3)<0?0:(currValue-3);
        gf_CM_Total_OT.setValue(currValue);
        if (count_GF_CM_3>0)
            count_GF_CM_3--;
        System.out.println("currValue = "+currValue);
    }

    public void GF_CM_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_CM_Total_OT.getValue()!=null?gf_CM_Total_OT.getValue().toString():"0");
        currValue = (currValue-4)<0?0:(currValue-4);
        gf_CM_Total_OT.setValue(currValue);
        if (count_GF_CM_4>0)
            count_GF_CM_4--;
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
        count_GF_WV_1++;
    }

    public void GF_WV_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = currValue+2;
        gf_WV_Total_OT.setValue(currValue);
        count_GF_WV_2++;
    }

    public void GF_WV_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = currValue+3;
        gf_WV_Total_OT.setValue(currValue);
        count_GF_WV_3++;
    }

    public void GF_WV_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = currValue+4;
        gf_WV_Total_OT.setValue(currValue);
        count_GF_WV_4++;
    }

    public void GF_WV_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        gf_WV_Total_OT.setValue(currValue);
        if (count_GF_WV_1>0)
            count_GF_WV_1--;
    }

    public void GF_WV_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        gf_WV_Total_OT.setValue(currValue);
        if (count_GF_WV_2>0)
            count_GF_WV_2--;
    }

    public void GF_WV_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        gf_WV_Total_OT.setValue(currValue);
        if (count_GF_WV_3>0)
            count_GF_WV_3--;
    }

    public void GF_WV_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_WV_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        gf_WV_Total_OT.setValue(currValue);
        if (count_GF_WV_4>0)
            count_GF_WV_4--;
    }

    public void GF_LM_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = currValue+1;
        gf_LM_Total_OT.setValue(currValue);
        count_GF_LM_1++;
    }

    public void GF_LM_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = currValue+2;
        gf_LM_Total_OT.setValue(currValue);
        count_GF_LM_2++;
    }

    public void GF_LM_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = currValue+3;
        gf_LM_Total_OT.setValue(currValue);
        count_GF_LM_3++;
    }
  
    public void GF_LM_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = currValue+4;
        gf_LM_Total_OT.setValue(currValue);
        count_GF_LM_4++;
    }

    public void GF_LM_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        gf_LM_Total_OT.setValue(currValue);
        if (count_GF_LM_1>0)
            count_GF_LM_1--;
    }

    public void GF_LM_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        gf_LM_Total_OT.setValue(currValue);
        if (count_GF_LM_2>0)
            count_GF_LM_2--;
    }

    public void GF_LM_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        gf_LM_Total_OT.setValue(currValue);
        if (count_GF_LM_3>0)
            count_GF_LM_3--;
    }

    public void GF_LM_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LM_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        gf_LM_Total_OT.setValue(currValue);
        if (count_GF_LM_4>0)
            count_GF_LM_4--;
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
        count_GF_LN_1++;
    }

    public void GF_LN_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = currValue+2;
        gf_LN_Total_OT.setValue(currValue);
        count_GF_LN_2++;
    }

    public void GF_LN_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = currValue+3;
        gf_LN_Total_OT.setValue(currValue);
        count_GF_LN_3++;
    }

    public void GF_LN_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = currValue+4;
        gf_LN_Total_OT.setValue(currValue);
        count_GF_LN_4++;
    }

    public void GF_LN_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        gf_LN_Total_OT.setValue(currValue);
        if(count_GF_LN_1>0)
            count_GF_LN_1--;
    }

    public void GF_LN_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        gf_LN_Total_OT.setValue(currValue);
        if(count_GF_LN_2>0)
            count_GF_LN_2--;
    }

    public void GF_LN_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        gf_LN_Total_OT.setValue(currValue);
        if(count_GF_LN_3>0)
            count_GF_LN_3--;
    }

    public void GF_LN_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_LN_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        gf_LN_Total_OT.setValue(currValue);
        if(count_GF_LN_4>0)
            count_GF_LN_4--;
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
        count_GF_FY_1++;
    }

    public void GF_FY_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = currValue+2;
        gf_FY_Total_OT.setValue(currValue);
        count_GF_FY_2++;
    }

    public void GF_FY_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = currValue+3;
        gf_FY_Total_OT.setValue(currValue);
        count_GF_FY_3++;
    }

    public void GF_FY_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = currValue+4;
        gf_FY_Total_OT.setValue(currValue);
        count_GF_FY_4++;
    }

    public void GF_FY_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        gf_FY_Total_OT.setValue(currValue);
        if (count_GF_FY_1>0)
            count_GF_FY_1--;
    }

    public void GF_FY_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        gf_FY_Total_OT.setValue(currValue);
        if (count_GF_FY_2>0)
            count_GF_FY_2--;
    }

    public void GF_FY_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        gf_FY_Total_OT.setValue(currValue);
        if (count_GF_FY_3>0)
            count_GF_FY_3--;
    }

    public void GF_FY_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        gf_FY_Total_OT.setValue(currValue);
        if (count_GF_FY_4>0)
            count_GF_FY_4--;
    }

    public void setGf_FY_Total_OT(RichOutputText gf_FY_Total_OT) {
        this.gf_FY_Total_OT = gf_FY_Total_OT;
    }

    public RichOutputText getGf_FY_Total_OT() {
        return gf_FY_Total_OT;
    }
                
                
    /**                 DYE FAULT                   **/
    public void DF_OS_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_OS_Total_OT.getValue().toString());
        currValue = currValue+1;
        df_OS_Total_OT.setValue(currValue);
        count_DF_OS_1++;
    }

    public void DF_OS_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_OS_Total_OT.getValue().toString());
        currValue = currValue+2;
        df_OS_Total_OT.setValue(currValue);
        count_DF_OS_2++;
    }

    public void DF_OS_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_OS_Total_OT.getValue().toString());
        currValue = currValue+3;
        df_OS_Total_OT.setValue(currValue);
        count_DF_OS_3++;
    }

    public void DF_OS_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_OS_Total_OT.getValue().toString());
        currValue = currValue+4;
        df_OS_Total_OT.setValue(currValue);
        count_DF_OS_4++;
    }

    public void DF_OS_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        gf_FY_Total_OT.setValue(currValue);
        if(count_DF_OS_1 > 0)
            count_DF_OS_1--;
    }

    public void DF_OS_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        gf_FY_Total_OT.setValue(currValue);
        if(count_DF_OS_2 > 0)
            count_DF_OS_2--;
    }

    public void DF_OS_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        gf_FY_Total_OT.setValue(currValue);
        if(count_DF_OS_3 > 0)
            count_DF_OS_3--;
    }

    public void DF_OS_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(gf_FY_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        gf_FY_Total_OT.setValue(currValue);
        if(count_DF_OS_4 > 0)
            count_DF_OS_4--;
    }

    public void setDf_OS_Total_OT(RichOutputText df_OS_Total_OT) {
        this.df_OS_Total_OT = df_OS_Total_OT;
    }

    public RichOutputText getDf_OS_Total_OT() {
        return df_OS_Total_OT;
    }

    public void DF_SV_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SV_Total_OT.getValue().toString());
        currValue = currValue+1;
        df_SV_Total_OT.setValue(currValue);
        count_DF_SV_1++;
    }

    public void DF_SV_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SV_Total_OT.getValue().toString());
        currValue = currValue+2;
        df_SV_Total_OT.setValue(currValue);
        count_DF_SV_2++;
    }

    public void DF_SV_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SV_Total_OT.getValue().toString());
        currValue = currValue+3;
        df_SV_Total_OT.setValue(currValue);
        count_DF_SV_3++;
    }

    public void DF_SV_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SV_Total_OT.getValue().toString());
        currValue = currValue+4;
        df_SV_Total_OT.setValue(currValue);
        count_DF_SV_4++;
    }

    public void DF_SV_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SV_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        df_SV_Total_OT.setValue(currValue);
    }

    public void DF_SV_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SV_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        df_SV_Total_OT.setValue(currValue);
    }

    public void DF_SV_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SV_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        df_SV_Total_OT.setValue(currValue);
    }

    public void DF_SV_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SV_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        df_SV_Total_OT.setValue(currValue);
    }

    public void setDf_SV_Total_OT(RichOutputText df_SV_Total_OT) {
        this.df_SV_Total_OT = df_SV_Total_OT;
    }

    public RichOutputText getDf_SV_Total_OT() {
        return df_SV_Total_OT;
    }

    public void DF_Spot_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_Spot_Total_OT.getValue().toString());
        currValue = currValue+1;
        df_Spot_Total_OT.setValue(currValue);
    }

    public void DF_Spot_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_Spot_Total_OT.getValue().toString());
        currValue = currValue+2;
        df_Spot_Total_OT.setValue(currValue);
    }

    public void DF_Spot_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_Spot_Total_OT.getValue().toString());
        currValue = currValue+3;
        df_Spot_Total_OT.setValue(currValue);
    }

    public void DF_Spot_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_Spot_Total_OT.getValue().toString());
        currValue = currValue+4;
        df_Spot_Total_OT.setValue(currValue);
    }

    public void DF_Spot_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_Spot_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        df_Spot_Total_OT.setValue(currValue);
    }

    public void DF_Spot_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_Spot_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        df_Spot_Total_OT.setValue(currValue);
    }

    public void DF_Spot_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_Spot_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        df_Spot_Total_OT.setValue(currValue);
    }

    public void DF_Spot_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_Spot_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        df_Spot_Total_OT.setValue(currValue);
    }

    public void setDf_Spot_Total_OT(RichOutputText df_Spot_Total_OT) {
        this.df_Spot_Total_OT = df_Spot_Total_OT;
    }

    public RichOutputText getDf_Spot_Total_OT() {
        return df_Spot_Total_OT;
    }

    public void DF_MP_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_MP_Total_OT.getValue().toString());
        currValue = currValue+1;
        df_MP_Total_OT.setValue(currValue);
    }

    public void DF_MP_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_MP_Total_OT.getValue().toString());
        currValue = currValue+2;
        df_MP_Total_OT.setValue(currValue);
    }

    public void DF_MP_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_MP_Total_OT.getValue().toString());
        currValue = currValue+3;
        df_MP_Total_OT.setValue(currValue);
    }

    public void DF_MP_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_MP_Total_OT.getValue().toString());
        currValue = currValue+4;
        df_MP_Total_OT.setValue(currValue);
    }

    public void DF_MP_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_MP_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        df_MP_Total_OT.setValue(currValue);
    }

    public void DF_MP_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_MP_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        df_MP_Total_OT.setValue(currValue);
    }

    public void DF_MP_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_MP_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        df_MP_Total_OT.setValue(currValue);
    }

    public void DF_MP_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_MP_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        df_MP_Total_OT.setValue(currValue);
    }

    public void DF_DS_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_DS_Total_OT.getValue().toString());
        currValue = currValue+1;
        df_DS_Total_OT.setValue(currValue);
    }

    public void DF_DS_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_DS_Total_OT.getValue().toString());
        currValue = currValue+2;
        df_DS_Total_OT.setValue(currValue);
    }

    public void DF_DS_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_DS_Total_OT.getValue().toString());
        currValue = currValue+3;
        df_DS_Total_OT.setValue(currValue);
    }

    public void DF_DS_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_DS_Total_OT.getValue().toString());
        currValue = currValue+4;
        df_DS_Total_OT.setValue(currValue);
    }

    public void DF_DS_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_DS_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        df_DS_Total_OT.setValue(currValue);
    }

    public void DF_DS_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_MP_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        df_MP_Total_OT.setValue(currValue);
    }

    public void DF_DS_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_MP_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        df_MP_Total_OT.setValue(currValue);
    }

    public void DF_DS_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_MP_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        df_MP_Total_OT.setValue(currValue);
    }

    public void setDf_MP_Total_OT(RichOutputText df_DS_Total_OT) {
        this.df_MP_Total_OT = df_DS_Total_OT;
    }

    public RichOutputText getDf_MP_Total_OT() {
        return df_MP_Total_OT;
    }

    public void setDf_DS_Total_OT(RichOutputText df_DS_Total_OT) {
        this.df_DS_Total_OT = df_DS_Total_OT;
    }

    public RichOutputText getDf_DS_Total_OT() {
        return df_DS_Total_OT;
    }

    public void DF_SM_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SM_Total_OT.getValue().toString());
        currValue = currValue+1;
        df_SM_Total_OT.setValue(currValue);
    }

    public void DF_SM_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SM_Total_OT.getValue().toString());
        currValue = currValue+2;
        df_SM_Total_OT.setValue(currValue);
    }

    public void DF_SM_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SM_Total_OT.getValue().toString());
        currValue = currValue+3;
        df_SM_Total_OT.setValue(currValue);
    }

    public void DF_SM_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SM_Total_OT.getValue().toString());
        currValue = currValue+4;
        df_SM_Total_OT.setValue(currValue);
    }

    public void DF_SM_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SM_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        df_SM_Total_OT.setValue(currValue);
    }

    public void DF_SM_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SM_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        df_SM_Total_OT.setValue(currValue);
    }

    public void DF_SM_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SM_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        df_SM_Total_OT.setValue(currValue);
    }

    public void DF_SM_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_SM_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        df_SM_Total_OT.setValue(currValue);
    }

    public void setDf_SM_Total_OT(RichOutputText df_SM_Total_OT) {
        this.df_SM_Total_OT = df_SM_Total_OT;
    }

    public RichOutputText getDf_SM_Total_OT() {
        return df_SM_Total_OT;
    }

    public void DF_BM_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_BM_Total_OT.getValue().toString());
        currValue = currValue+1;
        df_BM_Total_OT.setValue(currValue);
    }

    public void DF_BM_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_BM_Total_OT.getValue().toString());
        currValue = currValue+2;
        df_BM_Total_OT.setValue(currValue);
    }

    public void DF_BM_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_BM_Total_OT.getValue().toString());
        currValue = currValue+3;
        df_BM_Total_OT.setValue(currValue);
    }

    public void DF_BM_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_BM_Total_OT.getValue().toString());
        currValue = currValue+4;
        df_BM_Total_OT.setValue(currValue);
    }

    public void DF_BM_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_BM_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        df_BM_Total_OT.setValue(currValue);
    }

    public void DF_BM_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_BM_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        df_BM_Total_OT.setValue(currValue);
    }

    public void DF_BM_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_BM_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        df_BM_Total_OT.setValue(currValue);
    }

    public void DF_BM_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(df_BM_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        df_BM_Total_OT.setValue(currValue);
    }

    public void setDf_BM_Total_OT(RichOutputText df_BM_Total_OT) {
        this.df_BM_Total_OT = df_BM_Total_OT;
    }

    public RichOutputText getDf_BM_Total_OT() {
        return df_BM_Total_OT;
    }

    public void YF_TY_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY_Total_OT.getValue().toString());
        currValue = currValue+1;
        yf_TY_Total_OT.setValue(currValue);
    }

    public void YF_TY_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY_Total_OT.getValue().toString());
        currValue = currValue+2;
        yf_TY_Total_OT.setValue(currValue);
    }

    public void YF_TY_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY_Total_OT.getValue().toString());
        currValue = currValue+3;
        yf_TY_Total_OT.setValue(currValue);
    }

    public void YF_TY_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY_Total_OT.getValue().toString());
        currValue = currValue+4;
        yf_TY_Total_OT.setValue(currValue);
    }

    public void YF_TY_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        yf_TY_Total_OT.setValue(currValue);
    }

    public void YF_TY_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        yf_TY_Total_OT.setValue(currValue);
    }

    public void YF_TY_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        yf_TY_Total_OT.setValue(currValue);                
    }

    public void YF_TY_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        yf_TY_Total_OT.setValue(currValue);
    }

    public void setYf_TY_Total_OT(RichOutputText yf_TY_Total_OT) {
        this.yf_TY_Total_OT = yf_TY_Total_OT;
    }

    public RichOutputText getYf_TY_Total_OT() {
        return yf_TY_Total_OT;
    }

    public void YF_TY1_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY1_Total_OT.getValue().toString());
        currValue = currValue+1;
        yf_TY1_Total_OT.setValue(currValue);
    }

    public void YF_TY1_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY1_Total_OT.getValue().toString());
        currValue = currValue+2;
        yf_TY1_Total_OT.setValue(currValue);
    }

    public void YF_TY1_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY1_Total_OT.getValue().toString());
        currValue = currValue+3;
        yf_TY1_Total_OT.setValue(currValue);
    }

    public void YF_TY1_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY1_Total_OT.getValue().toString());
        currValue = currValue+4;
        yf_TY1_Total_OT.setValue(currValue);
    }

    public void YF_TY1_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY1_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        yf_TY1_Total_OT.setValue(currValue);
    }

    public void YF_TY1_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY1_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        yf_TY1_Total_OT.setValue(currValue);
    }

    public void YF_TY1_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY1_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        yf_TY1_Total_OT.setValue(currValue);
    }

    public void YF_TY1_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_TY1_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        yf_TY1_Total_OT.setValue(currValue);
    }

    public void YF_Slub_1_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_Slub_Total_OT.getValue().toString());
        currValue = currValue+1;
        yf_Slub_Total_OT.setValue(currValue);
    }

    public void YF_Slub_2_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_Slub_Total_OT.getValue().toString());
        currValue = currValue+2;
        yf_Slub_Total_OT.setValue(currValue);
    }

    public void YF_Slub_3_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_Slub_Total_OT.getValue().toString());
        currValue = currValue+3;
        yf_Slub_Total_OT.setValue(currValue);
    }

    public void YF_Slub_4_Points_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_Slub_Total_OT.getValue().toString());
        currValue = currValue+4;
        yf_Slub_Total_OT.setValue(currValue);
    }

    public void YF_Slub_1_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_Slub_Total_OT.getValue().toString());
        currValue = (currValue-1)<0?0:(currValue-1);
        yf_Slub_Total_OT.setValue(currValue);
    }

    public void YF_Slub_2_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_Slub_Total_OT.getValue().toString());
        currValue = (currValue-2)<0?0:(currValue-2);
        yf_Slub_Total_OT.setValue(currValue);
    }

    public void YF_Slub_3_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_Slub_Total_OT.getValue().toString());
        currValue = (currValue-3)<0?0:(currValue-3);
        yf_Slub_Total_OT.setValue(currValue);
    }

    public void YF_Slub_4_Undo_actionListener(ActionEvent actionEvent) {
        // Add event code here...
        int currValue = Integer.parseInt(yf_Slub_Total_OT.getValue().toString());
        currValue = (currValue-4)<0?0:(currValue-4);
        yf_Slub_Total_OT.setValue(currValue);
    }

    public void setYf_TY1_Total_OT(RichOutputText yf_TY1_Total_OT) {
        this.yf_TY1_Total_OT = yf_TY1_Total_OT;
    }

    public RichOutputText getYf_TY1_Total_OT() {
        return yf_TY1_Total_OT;
    }

    public void setYf_Slub_Total_OT(RichOutputText yf_Slub_Total_OT) {
        this.yf_Slub_Total_OT = yf_Slub_Total_OT;
    }

    public RichOutputText getYf_Slub_Total_OT() {
        return yf_Slub_Total_OT;
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
        ViewObject greigeFaultVO = (ViewObject)am.findViewObject("PwcOdmInspPrcGreigeFaultVO1");
        Row newRow = greigeFaultVO.createRow();
        ViewObject inpectionLineVO = (ViewObject)am.findViewObject("PwcInspectionProcessLineVO1");
        String rollNumber = inpectionLineVO.getCurrentRow().getAttribute("RollNumber").toString();
        newRow.setAttribute("InspPrcRollNumber", rollNumber);
        newRow.setAttribute("CreaseMark1", count_GF_CM_1);
        newRow.setAttribute("CreaseMark2", count_GF_CM_2);
        newRow.setAttribute("CreaseMark3", count_GF_CM_3);
        newRow.setAttribute("CreaseMark4", count_GF_CM_4);
        newRow.setAttribute("CreaseMarkTotal", Integer.parseInt(gf_CM_Total_OT.getValue().toString()));
        newRow.setAttribute("WidthVariation1", count_GF_WV_1);
        newRow.setAttribute("WidthVariation2", count_GF_WV_2);
        newRow.setAttribute("WidthVariation3", count_GF_WV_3);
        newRow.setAttribute("WidthVariation4", count_GF_WV_4);
        newRow.setAttribute("WidthVariationTotal", Integer.parseInt(gf_WV_Total_OT.getValue().toString())) ;
        newRow.setAttribute("LineMark1", count_GF_LM_1);
        newRow.setAttribute("LineMark2", count_GF_LM_2);
        newRow.setAttribute("LineMark3", count_GF_LM_3);
        newRow.setAttribute("LineMark4", count_GF_LM_4);
        newRow.setAttribute("LineMarkTotal",Integer.parseInt(gf_LM_Total_OT.getValue().toString()));
        newRow.setAttribute("LycraNaps1", count_GF_LN_1);
        newRow.setAttribute("LycraNaps2", count_GF_LN_2);
        newRow.setAttribute("LycraNaps3", count_GF_LN_3);
        newRow.setAttribute("LycraNaps4", count_GF_LN_4);
        newRow.setAttribute("LycraNapsTotal", Integer.parseInt(gf_LN_Total_OT.getValue().toString()));
        newRow.setAttribute("FlyYarn1", count_GF_FY_1);
        newRow.setAttribute("FlyYarn2", count_GF_FY_2);
        newRow.setAttribute("FlyYarn3", count_GF_FY_3);
        newRow.setAttribute("FlyYarn4", count_GF_FY_4);
        newRow.setAttribute("FlyYarnTotal",Integer.parseInt(gf_FY_Total_OT.getValue().toString()));
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
        newRow.setAttribute("SlubTotal", yf_Slub_Total_OT.getValue().toString());
        
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
    
    //#{bindings.CreateInsert.execute}

    public void inspectionProcLinesNewAction(ActionEvent actionEvent) {
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
        
    }
}
