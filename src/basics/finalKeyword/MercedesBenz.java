package basics.finalKeyword;

public class MercedesBenz {

    public enum Models{
        S550,
        S63_AMG_GTS,
        C63_AMG,
        C300,
        E300_4_MATIC
    }

    Models model;

    public MercedesBenz(Models model) {
        this.model = model;
    }

}
