public class SegiTiga <T extends Number>{
    private T alassegitiga;
    private T tinggisegitiga;

    public SegiTiga(T alassegitiga, T tinggisegitiga){
        this.alassegitiga = alassegitiga;
        this.tinggisegitiga = tinggisegitiga;
    }

    public T getAlas(){//metod
        return alassegitiga;
    }

    public T getTinggi(){
        return tinggisegitiga;
    }

    public double ResultAsDouble(){
        double luas = 0.5 * alassegitiga.doubleValue() * tinggisegitiga.doubleValue();
        return luas;
    }

    public int ResultAsInt(){
        int luas1 = (int) (0.5 * alassegitiga.doubleValue() * tinggisegitiga.doubleValue());
        return luas1;
    }



}
