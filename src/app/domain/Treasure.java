package app.domain;

public class Treasure {

    private Nominal nominal;
    private int amount;

    public Treasure(Nominal nominal, int amount) {
        this.nominal = nominal;
        this.amount = amount;
    }

    public Treasure(){}

    public Nominal getNominal() {
        return nominal;
    }

    public void setNominal(Nominal nominal) {
        this.nominal = nominal;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }


}
