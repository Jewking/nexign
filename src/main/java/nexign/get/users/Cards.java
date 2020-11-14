package nexign.get.users;

public final class Cards {
    public static int cardCounter = 0;

    private int id;
    private int ownerId;
    private String number;
    private int money;
    private int limit;
    private boolean done;

    public Cards(int ownerId) {
        this.id = cardCounter++;
        this.ownerId = ownerId;
        this.money = 0;
        this.number = "5500" + String.valueOf(1000 + (Math.random() * 8999)) + String.valueOf(1000 + (Math.random() * 8999)) + String.valueOf(1000 + (Math.random() * 8999));
        this.limit = 0;
        this.done = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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