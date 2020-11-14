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
        this.number = setRandomCardNumber();
        this.limit = 0;
        this.done = false;
    }

    private static String setRandomCardNumber() {
        String cardNumber = "5500";
        for (int i = 0; i < 3; i++) {
            cardNumber += String.valueOf((int) (1000 + (Math.random() * 8999)));
        }
        return cardNumber;
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