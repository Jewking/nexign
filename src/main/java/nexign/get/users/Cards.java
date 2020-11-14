package nexign.get.users;

public final class Cards {
    public static int cardCounter = 0;

    private int id;
    private int money;
    private int limit;
    private boolean done;

    public Cards() {
        this.id = cardCounter++;
        this.money = 0;
        this.limit = 0;
        this.done = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}