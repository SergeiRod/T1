package Lesson8.HomeWork8;

public enum CarCondition {
    EXCELLENT(3),
    GOOD(2),
    BAD(1);

    CarCondition(int rate) {
        this.rate = rate;
    }

    private int rate;

    public int getRate() {
        return rate;
    }
}
