package src;

abstract class Forma {

    protected int base;
    protected int altezza;

    public abstract int calcolaArea();

    public Forma(int base, int altezza) {
        this.base = base;
        this.altezza = altezza;
    }
}
