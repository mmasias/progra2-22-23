public class SelectorTemperatura {
    private int _temperatura;
    private final int _maxTemperatura = 90;
    public SelectorTemperatura () {
        _temperatura = 0;
    }
    public void fijarTemperatura (int temp) {
        if ( (temp >= 0) && (temp <= _maxTemperatura) )
            _temperatura = temp;
        else System.err.println("Error: Temperatura incorrecta");
    }
    public int temperatura () {
        return ( _temperatura );
    }
    public int tempMaxima () {
        return ( _maxTemperatura );
    }
    public int consumoElectr () {
        return ( _temperatura * 30 / 100 );
    }

}
