package Main;

import java.util.Optional;

public class Options {

    private  String[]option;
    private String selectoption;
    int maxoptions;

    public Options(String[]Option,int maxoptions){

        this.option=option;
        this.selectoption=null;
        this.maxoptions=maxoptions;
    }
    public void setOption(String[]Option){
        this.option=option;
    }

    public String[] getOption(){
        return option;
    }

    public void setSelectoption(String selectoption){
        this.selectoption=selectoption;
    }

    public String getSelectoption(){
        for(String option:this.option){
            if(option==this.selectoption){

                return option;
            }
        }
        return "no se puede hacer la accion que quieres";
    }

    public void setMaxoptions(int maxoptions){
        this.maxoptions=maxoptions;
    }

    public int getMaxoptions() {
        return maxoptions;
    }
}
