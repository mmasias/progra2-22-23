public class Option {
    public String optionList[];
    public int maxOptions;
    public int realOptions;

    public Option(int maxOptions) {
        this.maxOptions = maxOptions;
        optionList=new String[maxOptions];
        realOptions=0;
    }

    public String[] getOptionList() {
        return optionList;
    }

    public void setOptionList(String[] optionList) {
        this.optionList = optionList;
    }

    public int getMaxOptions() {
        return maxOptions;
    }

    public void setMaxOptions(int maxOptions) {
        this.maxOptions = maxOptions;
    }

    public int getRealOptions() {
        return realOptions;
    }

    public void setRealOptions(int realOptions) {
        this.realOptions = realOptions;
    }
    public void newOptionsMenu(String newOptions){

        if (realOptions<maxOptions){
            this.optionList[realOptions]=newOptions;
            realOptions++;

        }

    }
    public void showMenu(){
        for (int i = 0; i < realOptions; i++) {
            System.out.println(this.optionList[i]);
        }
    }

}


