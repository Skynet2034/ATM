package app.domain;

import java.util.Date;
import java.util.Objects;

public class Account {

    private final String holder;
    private final Date date;
    private final String number;

    public Account(String holder, Date date, String number) {
        this.holder = holder;
        this.date = date;
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public Date getDate() {
        return date;
    }

    public String getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return holder.equals(account.holder) &&
                date.equals(account.date) &&
                number.equals(account.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(holder, date, number);
    }
    public String toString()
    {
        return ("Holder="+holder+" number="+number);
    }
}
