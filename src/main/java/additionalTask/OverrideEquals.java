package additionalTask;

import java.util.Objects;

public class OverrideEquals {


    Money income = new Money(55, "USD");
    Money expenses = new Money(55, "USD");
    boolean balanced = income.equals(expenses);

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Money))
            return false;
        Money other = (Money) o;
        boolean currencyCodeEquals = (this.currencyCode == null && other.currencyCode == null)
                || (this.currencyCode != null && this.currencyCode.equals(other.currencyCode));
        return this.amount == other.amount && currencyCodeEquals;
    }

    class Money {
        int amount;
        String currencyCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
