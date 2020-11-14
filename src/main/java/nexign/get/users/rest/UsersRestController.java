package nexign.get.users.rest;

import nexign.get.users.Users;
import nexign.get.users.exception.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/users")
class UsersRestController {
    protected ArrayList<Users> users = new ArrayList<Users>() {
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

    @GetMapping
    public ArrayList<Users> list () {
        return users;
    }

    @GetMapping("{id}")
    public Users getId(@PathVariable int id) {
        return getUserID(id);
    }

    @PostMapping
    public boolean add(@RequestBody String name ) {
        return users.add(new Users(name));
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