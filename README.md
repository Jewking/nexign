# class Users - пользователи
    private int id;                       - первичный идентификатор
    private String name;                  - имя владельца
    private LocalDateTime dateCreated;    - дата создания

## GET
#### api/users
- получение списка всех пользователей
#### api/users/{userId}
- получение всей информации по пользователю

## POST
#### api/new/user
- @RequestBody - String {name}
- создание нового пользователя

## DELETE
#### api/user/{userId}
- удаление пользователя


# class Cards - пластиковые карты
    private int id;           - первичный идентификатор
    private int ownerId;      - владелец
    private String number;    - номера карты
    private int money;        - деньги
    private int limit;        - лимит
    private boolean done;     - выпущена / нет
    
## GET
#### api/cards
- получение списка всех карт
#### api/cards/{cardId}
- получение всей информации по карте

## POST
#### api/new/card
- @RequestBody - int {ownerID}
- создание новой карты

## PUT
#### api/changestatus/{cardId}
- @RequestBody - Bool {status}
- смена статуса карты (готова / нет)
#### api/limitcard/{cardId}
- @RequestBody - int {limit}
- смена лимита карты
#### api/money/{cardId}
- @RequestBody - int {money}
- изменение кол-во денег на карте

## DELETE
#### api/card/{cardId}
- удаление карты


## class History - история транзакций *[in development]*
    private int id;                - первичный идентификатор
    private int cardId;            - идентификатор карты
    private int price;             - цена
    private String name;           - Получатель
    private LocalDateTime date;    - дата транзакции
    
## GET
#### dev
- dev

## POST
#### dev
- dev

## PUT
#### dev
- dev

## DELETE
#### dev
- dev


## class Bonus - история начисления бонусов *[in development]*
    private int id;                - первичный идентификатор
    private int cardId;            - идентификатор карты
    private int amount;            - количество
    private String name;           - за что
    private LocalDateTime date;    - дата получения

## GET
#### dev
- dev

## POST
#### dev
- dev

## PUT
#### dev
- dev

## DELETE
#### dev
- dev
