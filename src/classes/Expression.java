package classes;

/**
 * Created by Łukasz on 2017-06-23.
 */
public interface Expression {
    Money reduce(Bank bank, String to);
    Expression times(int multiplier);
    Expression plus(Expression addend);
}
