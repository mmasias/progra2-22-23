
class WashingMachineMX3deLuxe extends WashingMachineMX {
    public WashingMachineMX3deLuxe () {
        super();
        _av_program= new WashingProgram[5];
        _av_program[0] = new WashingProgram
                ("Long cycle", 5, 65, 80, true, false);
        _av_program[1] = new WashingProgram
                ("Special cycle", 5, 72, 85, true, true);
        _av_program[2] = new WashingProgram
                ("Short cycle", 3, 45, 60, true, false);
        _av_program[3] = new WashingProgram
                ("Special wool", 3, 40, 60, false, false);
        _av_program[4] = new WashingProgram
                ("Economic", 3, 45, 45, true, false);
        _selector = new TemperatureSelector ();
    }
}