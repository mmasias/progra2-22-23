class WashingMachineMX1 extends WashingMachineMX {
    public WashingMachineMX1 () {
        super();
        _av_program= new WashingProgram[3];
        _av_program[0] = new WashingProgram
                ("Large cycle", 5, 65, 80, true, false);
        _av_program[1] = new WashingProgram
                ("Special cycle", 5, 72, 85, true, true);
        _av_program[2] = new WashingProgram
                ("Short cycle", 3, 45, 60, true, false);
    }
}
