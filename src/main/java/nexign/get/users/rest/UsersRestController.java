package nexign.get.users.rest;

import nexign.get.users.Users.Card;
import nexign.get.users.Users;
import nexign.get.users.exception.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api")
class UsersRestController {
    private ArrayList<Users> users = new ArrayList<Users>() {
        {
            add(new Users("Arslan Gareev"));
            add(new Users("Leonid Rakitin"));
            add(new Users("Nastya Lipuchka"));
        }
    };

    private Users getUserID(@PathVariable int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    private Users getUserCardsID(@PathVariable int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }
    @GetMapping
    public ArrayList<Users> list () {
        return users;
    }

    @GetMapping("{id}")
    public Users getId(@PathVariable int id) {
        return getUserID(id);
    }

    @GetMapping("cards/{id}")
    public Users getUserCards(@PathVariable int id) {
        return getUserCardsID(id);
    }

    @PostMapping
    public String add(@RequestBody String name ) {
        users.add(new Users(name));
        return name;
    }

    @PutMapping("{id}")
    public Users update(@PathVariable int id, @RequestBody String name) {
        Users userFound = getUserID(id);
        userFound.setName(name);
        return userFound;
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        Users userFound = getUserID(id);
        users.remove(userFound);
    }
}