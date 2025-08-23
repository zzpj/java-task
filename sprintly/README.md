# Spring

## Zadanie 1 🚀

Zaimplementuj funkcjonalność, która zwraca wszystkich użytkowników z bazy danych w formie mapy, gdzie kluczem jest rola użytkownika (np. "USER", "ADMIN"), a wartością lista użytkowników przypisanych do danej roli.

Przykład zwracanej struktury:

```
{
  "USER": [User, User, ...],
  "ADMIN": [User, ...]
}
```

### 🔒 Wskazówka:
W podanej strukturze pamiętaj, aby nie publikować wrażliwych danych np. haseł użytkowników, 
dlatego mapuj encję `User` na `UserMapResponse`. 

## Zadanie 2 🚀

Stwórz endpoint umożliwiający utworzenie nowego projektu. Dostęp do tej funkcjonalności powinien mieć wyłącznie użytkownik posiadający rolę `ADMIN` 👮‍♂️.

🛡️ Wymagania:
- Jeśli użytkownik nie posiada odpowiedniej roli, zwróć status HTTP 403 Forbidden 🚫 (stwórz własny wyjątek).
- Pamiętaj o dobrych praktykach związanych z bezpieczeństwem i walidacją danych wejściowych.
- Tworzony projekt nie musi posiadać żadnych zadań (tasks)

Przykład:
- Użytkownik z rolą `ADMIN` wysyła żądanie utworzenia projektu i projekt zostaje utworzony ze statusem HTTP 201 Created ✅.
- Użytkownik bez roli `ADMIN` wysyła żądanie utworzenia projektu i odpowiedź HTTP 403 Forbidden 🚫.

## Zadanie 3 🚀

Zaimplementuj endpoint, który pozwala na zmianę statusu zadania (task) w projekcie, ale tylko osobie przypisanej do tego zadania (assignee) 🧑‍💻.

TODO: security, walidacja danych