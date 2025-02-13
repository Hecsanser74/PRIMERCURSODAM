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

    public void setDiaSubasta(String diaSubasta){ this.diaSubasta = diaSubasta; }

    //Metodo
    public void cerrarSubasta() {
        if (lote.getPujador() != null) {
            System.out.println("Lote " + lote.getNumero() + " adjudicado a " + lote.getPujador().getNombre() + " por " + lote.getPujaMaxima() + "€");
        } else {
            System.out.println("Lote " + lote.getNumero() + " no adjudicado");
        }
    }

    //Constructor
    public Subasta (String diaSubasta, Lote lote){
        this.diaSubasta = diaSubasta;
        this.lote = lote;
    }
}
