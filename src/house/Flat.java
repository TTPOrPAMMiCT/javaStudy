package house;

public class Flat {
    private int amountPeople;

    public int getAmountPeople() {
        return amountPeople;
    }

    public void setAmountPeople(int amountPeople) {
        this.amountPeople = amountPeople;
    }

    @Override
    public String toString() {
        return "amount People =" + amountPeople;
    }
}
