package Model;

public final class Carga extends Veiculo{
    private int cargaMax;
    private int tara;

    public Carga(){
        cargaMax = 0;
        tara = 0;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public final void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public final void setTara(int tara) {
        this.tara = tara;
    }

    public float calcVel (float velocMax){
        return velocMax * 100000;
    }
}
