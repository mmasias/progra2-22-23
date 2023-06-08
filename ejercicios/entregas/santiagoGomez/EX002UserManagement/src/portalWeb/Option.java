package src.portalWeb;

public class Option {
    private String Option;
    private int MaxOptions;
    private int SelOption;
    private int index;

    public Option(int MaxOptions){
        this.MaxOptions = MaxOptions;
        this.SelOption = 0;
    }

    public String getOption() {
        return Option;
    }

    public void setOption(String Option) {
        this.Option = Option;
    }

    public int getMaxOptions() {
        return MaxOptions;
    }

    public void setMaxOptions(int MaxOptions) {
        this.MaxOptions = MaxOptions;
    }

    public int getSelOption() {
        return SelOption;
    }

    public void setSelOption(int SelOption) {
        this.SelOption = SelOption;
    }
}
