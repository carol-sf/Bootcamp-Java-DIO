public class SmartTV {
    boolean ligada = false;
    int canal = 25;
    int volume = 32;

    // public void ligarTV() {
    //     this.ligada = true;
    // }
    // public void desligarTV() {
    //     this.ligada = false;
    // }

    // public int mudarVolumeTV(int volumeAtual, String opcao) {
    //     int novoVolume = volumeAtual;
    //     if(opcao == "aumentar") {
    //         novoVolume++;
    //     } else {
    //         novoVolume--;
    //     }
    //     return novoVolume;
    // }

    // public int mudarCanalTV(int canalAtual, String opcao) {
    //     int novoCanal = canalAtual;
    //     if(opcao == "proximo") {
    //         novoCanal++;
    //     } else {
    //         novoCanal--;
    //     }
    //     return novoCanal;
    // }

    public void alterarEstado() {
        this.ligada = !ligada;
    }
    
    public void aumentarVolume() {
        this.volume++;
    }

    public void diminuirVolume() {
        this.volume--;
    }

    public void aumentarCanal() {
        this.canal++;
    }

    public void diminuirCanal() {
        this.canal--;
    }

    public void alterarCanal(int novoCanal) {
        this.canal = novoCanal;
    }
}
