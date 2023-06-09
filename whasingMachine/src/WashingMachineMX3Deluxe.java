public class WashingMachineMX3Deluxe extends WashingMachineMX{
    public WashingMachineMX3Deluxe () {
        super(); //WashingMachineMX
        availablePrograms=new WashingProgram[5];

        availablePrograms[0]=new WashingProgram("largo normal",5,65,80,true,false);
       availablePrograms[1]=new WashingProgram("Largo Especial",5,72,85,true,true);
        availablePrograms[2]=new WashingProgram("Corto normal",3,45,60,true,false);
        availablePrograms[3]=new WashingProgram("Especial Lana",3,40,60,false,false);
        availablePrograms[4]=new WashingProgram("Económico",3,45,45,true,false);
    }

    }

