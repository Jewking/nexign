package nexign.get.users.rest;

import nexign.get.users.Cards;
import nexign.get.users.Users;
import nexign.get.users.exception.NotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/cards")
public class CardsRestController {
    private ArrayList<Cards> cards = new ArrayList<Cards>() {
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

    private Cards getCardsID(@PathVariable int id) {
        return cards.stream()
                .filter(card -> card.getOwnerId() == id)
                .findFirst()
                .orElseThrow(NotFoundException::new);
    }

    @GetMapping
    public ArrayList<Cards> list () {
        return cards;
    }

    @GetMapping("{id}")
    public Cards getUserCards(@PathVariable int id) {
        return getCardsID(id);
    }

    @PostMapping
    public boolean add(@RequestBody int ownerId ) {
        return cards.add(new Cards(ownerId));
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        Cards cardFound = getCardsID(id);
        cards.remove(cardFound);
    }

}