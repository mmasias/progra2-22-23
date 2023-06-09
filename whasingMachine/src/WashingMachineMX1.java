
public class WashingMachineMX1 extends WashingMachineMX {
    public WashingMachineMX1(){
        super();
        availablePrograms=new WashingProgram[3];

        availablePrograms[0]=new WashingProgram("largo normal",5,72,80,true,false);
        availablePrograms[1]=new WashingProgram("Corto normal",3,45,60,true,false);
        availablePrograms[2]=new WashingProgram("Económico",3,45,45,true,false);
    }
}
