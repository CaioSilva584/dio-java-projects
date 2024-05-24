package edu.caio.model;

/**
 * SmartTV
 */
public class SmartTv {

    private boolean ligada;
    private int volume;
    private int canal;

    public SmartTv() {
        ligada = false;
        volume = 0;
        canal = 0;
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public void ligarDesligar() {
        ligada = !ligada;
    }

    public void selecionarCanal(int canal) {
        if (canal > 0 && canal <= 300) {
            this.canal = canal;
        }
    }

    public void avancarCanal() {
        if (canal < 300) {
            canal++;
        }
    }

    public void voltarCanal() {
        if (canal > 1) {
            canal--;
        }
    }

    public void aumentarVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void diminuirVolume() {
        if (volume > 0) {
            volume++;
        }
    }
}