public class Usuario {
    public static void main(String [] args) {
        SmartTV smartTv = new SmartTV();

        System.out.println("Está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal atual? " + smartTv.canal);
        System.out.println("Qual o volume atual? " + smartTv.volume);

        System.out.println("ESTADO:");
        smartTv.alterarEstado();
        System.out.println("Está ligada? " + smartTv.ligada);
        smartTv.alterarEstado();
        System.out.println("Está ligada? " + smartTv.ligada);

        System.out.println("VOLUME:");
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        System.out.println("Volume atual: " + smartTv.volume);

        System.out.println("CANAL:");
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
        System.out.println("Canal atual: " + smartTv.canal);
        smartTv.alterarCanal(54);
        System.out.println("Canal atual: " + smartTv.canal);
    }
}
