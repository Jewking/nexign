package nexign.get.users;

import java.time.LocalDateTime;
import java.util.ArrayList;

public final class Users {
    public static int userCounter = 0;

    private int id;
    private String name;
    private LocalDateTime dateCreated;

    public Users(String name) {
        this.id = userCounter++;
        this.name = name;
        this.dateCreated = LocalDateTime.now();
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
