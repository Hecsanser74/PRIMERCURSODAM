package POO.Ejercicio11;

public class Subasta {
    private String diaSubasta;
    private Lote lote;

    //Getters
    public Lote getLote() {
        return lote;
    }

    public String getDiaSubasta() {
        return diaSubasta;
    }

    //Setters
    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public void setDiaSubasta(String diaSubasta) {
        this.diaSubasta = diaSubasta;
    }

    //Constructor
    public Subasta (String diaSubasta, Lote lote){
        this.diaSubasta = diaSubasta;
        this.lote = lote;
    }
}
