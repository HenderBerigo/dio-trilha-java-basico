public class Main {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? : " + smartTv.ligada);
        smartTv.ligar();
        smartTv.ligar();

        // System.out.println("Desligando a TV");
        // smartTv.desligar();
        // System.out.println("Desligando a TV");
        // smartTv.desligar();
        // System.out.println("TV ligada? : " + smartTv.ligada);

        System.out.println("Volume atual? : " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual? : " + smartTv.canal);
        smartTv.mudarCanal("mais");
        smartTv.mudarCanal("mais");
        smartTv.mudarCanal("menos");
        smartTv.trocarCanal(13);

    }
}
