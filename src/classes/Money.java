package classes;

/**
 * Created by Łukasz on 2017-06-22.
 */
public class Money implements Expression {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public Expression times(int multiplier){
        return new Money(amount * multiplier, currency);
    }

    public Expression plus(Expression addend){
        return new Sum(this, addend);
    }

    public String currency(){
        return currency;
    }

    public Money reduce(Bank bank, String to){
        int rate = bank.rate(currency, to);
        return new Money(amount / rate, to);
    }

    public String toString(){
        return amount + " " + currency;
    }

    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }
}
