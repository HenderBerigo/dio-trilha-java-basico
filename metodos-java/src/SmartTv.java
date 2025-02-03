public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar() {
        if (ligada) {
            System.out.println("TV já ligada");

        } else {
            ligada = true;
            System.out.println("Ligando a TV");
        }
    }

    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println("Desligada a TV");
        } else {
            System.out.println("TV já desligada");
        }
    }

    public void aumentarVolume() {
        if (ligada) {
            volume++;
            System.out.println("Aumentando o volume para: " + volume);
        } else {
            System.out.println("TV desligada");
        }
    }

    public void diminuirVolume() {
        if (ligada) {
            volume--;
            System.out.println("Diminuindo o volume para: " + volume);
        } else {
            System.out.println("TV desligada");
        }
    }

    public void trocarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Trocando o canal para: " + canal);
    }

    public void mudarCanal(String mudar) {
        if (ligada) {
            if (mudar == "mais") {
                canal++;
                System.out.println("Mudando o canal para +: " + canal);
            } else {
                canal--;
                System.out.println("Mudando o canal para -: " + canal);
            }
        } else {
            System.out.println("TV desligada");
        }
    }

    // public boolean verificarTv(){
    // if(!ligada){
    // ligada = false;
    // }
    // }
}
