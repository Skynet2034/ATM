package app.domain;

public enum Nominal {

    N10(10),
    N50(50),
    N100(100),
    N500(500),
    N200(200),
    N1000(1000),
    N2000(2000),
    N5000(5000);

    private final int value;

    Nominal(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

}
