package nexign.get.users.rest;

import nexign.get.users.Cards;
import nexign.get.users.Users;
import nexign.get.users.exception.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.stream.Stream;

@RestController
@RequestMapping("api")
class UsersRestController {
    protected ArrayList<Users> users = new ArrayList<Users>() {
        {
            add(new Users("Arslan Gareev"));
            add(new Users("Leonid Rakitin"));
            add(new Users("Nastya Lipuchka"));
        }
    };

    protected ArrayList<Cards> cards = new ArrayList<Cards>() {
        {
            add(new Cards(0));
            add(new Cards(0));
            add(new Cards(0));
            add(new Cards(1));
            add(new Cards(1));
            add(new Cards(1));
            add(new Cards(2));
        }
    };

    private Cards getUserCardsID(@PathVariable int id) {
        return cards.stream()
                .filter(card -> card.getOwnerId() == id)
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    private Stream<Cards> getUserCards(@PathVariable int id) {
        return cards.stream()
                .filter(card -> card.getOwnerId() == id);
    }

    private Cards getCardsID(@PathVariable int id) {
        return cards.stream()
                .filter(card -> card.getOwnerId() == id)
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    private Users getUserID(@PathVariable int id) {
        return users.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }
    @GetMapping
    public String list () {
        return "https://github.com/Jewking/get";
    }

    @GetMapping("users")
    public ArrayList<Users> listUsers () {
        return users;
    }

    @GetMapping("cards")
    public ArrayList<Cards> listCards () {
        return cards;
    }

    @GetMapping("users/{id}")
    public Cards getCard(@PathVariable int id) {
        return getCardsID(id);
    }

    @GetMapping("cards/{id}")
    public Users getUser(@PathVariable int id) {
        return getUserID(id);
    }

    @GetMapping("users/{id}/cards")
    public Stream<Cards> getUserAllCards(@PathVariable int id) {
        return getUserCards(id);
    }

    @PostMapping("new/user")
    public boolean add(@RequestBody String name ) {
        return users.add(new Users(name));
    }

    @PostMapping("new/card")
    public boolean addCard(@RequestBody int ownerId ) {
        return cards.add(new Cards(ownerId));
    }

    /*@PutMapping("{id}")
    public Users update(@PathVariable int id, @RequestBody String name) {
        Users userFound = getUserID(id);
        userFound.setName(name);
        return userFound;
    }*/

    @PutMapping("changestatus/{id}")
    public Cards updateCardStatus(@PathVariable int id, @RequestBody boolean status) {
        Cards cardFound = getCardsID(id);
        cardFound.setDone(status);
        return cardFound;
    }

    @PutMapping("limitcard/{id}")
    public Cards updateLimit(@PathVariable int id, @RequestBody int limit) {
        Cards cardFound = getCardsID(id);
        cardFound.setLimit(limit);
        return cardFound;
    }

    @PutMapping("money/{id}")
    public Cards updateMoney(@PathVariable int id, @RequestBody int money) {
        Cards cardFound = getCardsID(id);
        cardFound.setMoney(money);
        return cardFound;
    }

    @DeleteMapping("user/{id}")
    public void deleteUser(@PathVariable int id) {
        Users userFound = getUserID(id);
        users.remove(userFound);
    }

    @DeleteMapping("card/{id}")
    public void deleteCard(@PathVariable int id) {
        Cards cardFound = getCardsID(id);
        cards.remove(cardFound);
    }
}