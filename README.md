# Документация [v 1.1]

## USERS
    private int id;                       - идентификатор
    private String name;                  - имя владельца
    private LocalDateTime dateCreated;    - дата создания

## CARDS
    private int id;           - идентификатор
    private int ownerId;      - владелец
    private String number;    - номера карты
    private int money;        - деньги
    private int limit;        - лимит
    private boolean done;     - выпущена / нет
    
    
## get
### api/users
- получение списка всех пользователей
### api/cards
- получение списка всех карт
### api/users/{userId}
- получение всей информации по пользователю
### api/cards/{cardId}
- получение всей информации по карте

## post
### api/new/user
- @RequestBody - String {name}
- создание нового пользователя
### api/new/card
- @RequestBody - int {ownerID}
- создание новой карты

## put
### api/changestatus/{cardId}
- @RequestBody - Bool {status}
- смена статуса карты (готова / нет)
### api/limitcard/{cardId}
- @RequestBody - int {limit}
- смена лимита карты
### api/money/{cardId}
- @RequestBody - int {money}
- изменение кол-во денег на карте

## delete
### api/user/{userId}
- удаление пользователя
### api/card/{cardId}
- удаление карты
