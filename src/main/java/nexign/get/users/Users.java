package nexign.get.users;

import java.time.LocalDateTime;

public final class Users {
    public static int userCounter = 0;
    public static int cardCounter = 0;

    private int id;
    private String name;
    private LocalDateTime dateCreated;

    public Users(String name) {
        this.id = userCounter++;
        this.name = name;
        this.dateCreated = LocalDateTime.now();
    }

    public class Card {
        private int id;
        private int money;
        private int limit;
        private boolean done;

        public Card() {
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

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
