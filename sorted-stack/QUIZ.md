## Podstawy

🧩 Wymień modyfikatory dostępu w Javie wraz z opisem.

✅ Odpowiedź: `public`, `private`, `protected`, brak modyfikatora (domyślny).

🧠 Wyjaśnienie:
* `public`: Element jest dostępny wszędzie, zarówno w tej samej klasie, pakiecie, jak i poza nim.
* `private`: Element jest dostępny tylko w obrębie tej samej klasy.
* `protected`: Element jest dostępny w obrębie tego samego pakietu oraz w klasach dziedziczących.
* Domyślny (brak modyfikatora): Element jest dostępny tylko w obrębie tego samego pakietu.

----
🧩 Co oznacza słowo kluczowe `final` w Javie?

✅ Odpowiedź: Oznacza, że zmienna nie może być zmieniona, metoda nie może być nadpisana, a klasa nie może być dziedziczona. 🧠 Wyjaśnienie: final chroni elementy przed modyfikacją.

Przykładowo:
* `final int x = 5;` wartość x nie może być zmieniona.
* `final void metoda()` nie można nadpisać tej metody w klasie potomnej.
* `final class Klasa` nie można dziedziczyć po tej klasie.

----
🧩 Które słowo kluczowe służy do dziedziczenia klasy/interfejsu?

✅ Odpowiedź: `extends`

🧠 Wyjaśnienie:
- Dla klas: `class Dziecko extends Rodzic` — klasa Dziecko dziedziczy po klasie Rodzic.
- Dla interfejsów: `interface B extends A` — interfejs B rozszerza interfejs A. 
- Dla implementacji interfejsu przez klasę używa się `implements`.

----
🧩 Co to jest konstruktor w Javie?

✅ Odpowiedź: Konstruktor to specjalna metoda wywoływana przy tworzeniu obiektu.

🧠 Wyjaśnienie: Konstruktor ma taką samą nazwę jak klasa i nie posiada typu zwracanego. Służy do inicjalizacji obiektu.

----
🧩 Co oznacza słowo kluczowe `static`?

✅ Odpowiedź: Element należy do klasy, a nie do instancji.

🧠 Wyjaśnienie: `static` oznacza, że pole lub metoda jest współdzielona przez wszystkie obiekty klasy. Można je wywołać bez tworzenia obiektu. Przykład: `Math.pow(2, 3);` — metoda `pow` jest statyczna.

----
🧩 Co to jest enkapsulacja?

✅ Odpowiedź: Ukrywanie danych klasy za pomocą modyfikatorów dostępu.

🧠 Wyjaśnienie: Enkapsulacja chroni dane przed nieautoryzowanym dostępem. Stosuje się modyfikatory jak `private`, a dostęp zapewnia się przez gettery/settery.

----
🧩 Co to jest `enum`? Czy można go rozszerzyć (extends) i czy może implementować interfejs?

✅ Odpowiedź: enum to typ wyliczeniowy, którego nie można rozszerzyć, ale może implementować interfejs.

🧠 Wyjaśnienie:
- enum definiuje stałe wartości, np. DNI.TYGODNIA.
- Nie można użyć extends, bo enum już dziedziczy po klasie `java.lang.Enum`.
- Można użyć implements

----
🧩 Co to znaczy obiekt mutowalny i niemutowalny?

✅ Odpowiedź: Mutowalny obiekt można zmieniać po utworzeniu, niemutowalny — nie.

🧠 Wyjaśnienie:
* Mutowalny: np. `ArrayList`, można dodawać/usuwać elementy.
* Niemutowalny: np. `String`, każda zmiana tworzy nowy obiekt. Niemutowalność zwiększa bezpieczeństwo i przewidywalność kodu.

----
🧩 Co to jest metoda abstrakcyjna?

✅ Odpowiedź: Metoda bez implementacji.

🧠 Wyjaśnienie: Metoda abstrakcyjna jest deklarowana bez ciała, czyli bez kodu wykonawczego. Musi być zaimplementowana przez klasę dziedziczącą.

----
🧩 Które słowo kluczowe służy do deklarowania klasy abstrakcyjnej?

✅ Odpowiedź: `abstract`.

🧠 Wyjaśnienie: Słowo kluczowe `abstract` oznacza, że klasa nie może być instancjonowana bezpośrednio i może zawierać metody abstrakcyjne.

----
🧩 Co to jest polimorfizm?

✅ Odpowiedź: Zdolność obiektu do przyjmowania różnych form (np. przeciążanie, nadpisywanie metod).

🧠 Wyjaśnienie: Polimorfizm pozwala na traktowanie obiektów różnych klas jako obiektów jednej wspólnej klasy bazowej. Dzięki temu można wywoływać metody w sposób dynamiczny


## Kolekcje
🧩 Która kolekcja pozwala na dynamiczne zarządzanie tablicą?

✅ ArrayList to najczęściej używana implementacja interfejsu `List`. Umożliwia dynamiczne dodawanie, usuwanie i dostęp do elementów przez indeks.

----
🧩 Jaka jest różnica między `HashSet` a `TreeSet` pod względem przechowywania i kolejności elementów?

✅ `HashSet` nie gwarantuje żadnej kolejności elementów, natomiast `TreeSet` przechowuje je w kolejności naturalnej lub według dostarczonego komparatora. Dodatkowo `TreeSet` jest wolniejszy, ale umożliwia szybkie wyszukiwanie w uporządkowanym zbiorze.

----
🧩 Która kolekcja w Javie pozwala na przechowywanie duplikatów?

✅ `ArrayList` pozwala na przechowywanie duplikatów, ponieważ jest listą. W przeciwieństwie do niej, kolekcje typu `Set` (np. `HashSet`, `TreeSe`t) nie dopuszczają powtórzeń.

----
🧩 Jaką metodą dodaje się element do kolekcji implementującej interfejs Collection?

✅ Do dodawania elementów używa się metody `add()`. Jest ona dostępna w większości kolekcji takich jak `List`, `Set` czy `Queue`.

---
🧩 Która klasa kolekcji w Javie jest domyślnie synchronizowana i bezpieczna dla wielu wątków?

✅ `Vector` jest synchronizowaną wersją listy i zapewnia bezpieczeństwo w środowiskach wielowątkowych. Jednak ze względu na wydajność częściej stosuje się `ArrayList` z ręczną synchronizacją.

---
🧩 Mamy kolekcję mapy, co się dzieje, gdy dochodzi do kolizji (duplikacji) klucza?

✅ Nadpisanie

----
🧩 Która kolekcja zachowuje kolejność dodawania elementów?

✅ `LinkedHashSet` zachowuje kolejność dodawania, co odróżnia ją od `HashSet`. Jest przydatna, gdy ważna jest kolejność przetwarzania danych.

----
🧩 Jaką metodą w interfejsie `Map` pobieramy wartość na podstawie klucza?

✅ Używa się metody `get(key)`, która zwraca wartość przypisaną do danego klucza lub `null`, jeśli klucz nie istnieje. Jest to podstawowa operacja w mapach.

----
🧩 Która z popularnych kolekcji NIE implementuje interfejsu Collection?

✅ `HashMap` implementuje interfejs Map, a nie `Collection`. Pozostałe kolekcje jak `ArrayList`, `LinkedList` czy `HashSet` są częścią interfejsu `Collection`.

----

🧩 Co to jest `ConcurrentHashMap` i czym różni się od HashMap?

✅ `ConcurrentHashMap` to mapa współbieżna, która umożliwia bezpieczny dostęp w środowiskach wielowątkowych. W przeciwieństwie do `HashMap` pozwala na równoczesne odczyty i ograniczone zapisy bez blokowania całej struktury.

----

🧩 Co to są generyki w Javie i jaki problem rozwiązują?

✅ Generyki pozwalają na pisanie klas i metod operujących na różnych typach danych bez utraty bezpieczeństwa typów. Dzięki nim można uniknąć rzutowań i błędów w czasie wykonywania, np. `List<String>` zamiast surowego `List`.

----
🧩 Co oznacza symbol <T> w definicji klasy lub metody?

✅ `<T>` to parametr typu — oznacza, że klasa lub metoda jest generyczna i może działać na dowolnym typie. Przykład: `public class Box<T>` pozwala utworzyć `Box<String>,` `Box<Integer>` itd.



## Strumienie w Javie — pytania z odpowiedziami
🧩 Co to jest Stream w Javie i jakie są jego główne cechy?

✅ Stream to sekwencja danych, która umożliwia przetwarzanie zbiorów w sposób deklaratywny. Strumienie są leniwe, niezmienne i wspierają operacje równoległe.

----
🧩 Jakie są różnice między operacjami pośrednimi a terminalnymi w strumieniach?

✅ Operacje pośrednie (map, filter) zwracają nowy strumień i są leniwe, natomiast operacje terminalne (collect, forEach) kończą przetwarzanie i zwracają wynik lub wykonują akcję.

----
🧩 Jak działa metoda `filter()` w strumieniach i do czego służy?

✅ `filter()` przyjmuje predykat i zwraca strumień zawierający tylko elementy spełniające warunek. Przykład: `stream.filter(x -> x > 10)` zwraca elementy większe niż 10.


## JDK Updates 
🧩 Co to jest `var` i w której wersji Javy został wprowadzony?

✅ `var` to słowo kluczowe wprowadzone w Javie 10, które umożliwia deklarowanie zmiennych lokalnych bez jawnego określania ich typu. Kompilator automatycznie dedukuje typ na podstawie przypisanej wartości, co upraszcza kod i zwiększa jego czytelność.

----
🧩 Co to są rekordy (records) i jakie problemy rozwiązują?

✅ Rekordy, wprowadzone jako funkcja pełna w Javie 16, to specjalny typ klas służący do przechowywania danych. Automatycznie generują konstruktor, metody `equals()`, `hashCode()` i `toString()`, eliminując konieczność pisania powtarzalnego kodu (boilerplate) w klasach DTO.

----
🧩 Jak działa pattern matching w switch i co wprowadza nowego?

✅ Pattern matching dla switch, dostępny od Javy 17 jako podgląd i stabilny w Javie 21, pozwala na bardziej elastyczne i czytelne dopasowywanie typów i warunków w instrukcji switch. Umożliwia np. sprawdzanie typu obiektu i jego rozpakowanie w jednym kroku, co upraszcza kod warunkowy.


## Obsługa wyjątków

🧩 Co to jest wyjątek w Javie i jakie są jego rodzaje?

✅ Odpowiedź: Wyjątek to zdarzenie, które zakłóca normalny przebieg programu. 

🧠 Wyjaśnienie: Wyjątki reprezentują błędy lub sytuacje wyjątkowe, które mogą wystąpić podczas działania programu. W Javie dzielą się na:
- Checked exceptions – muszą być obsłużone lub zadeklarowane (IOException, SQLException).
- Unchecked exceptions – nie wymagają deklaracji (NullPointerException, ArithmeticException).
- Errors – poważne problemy systemowe (OutOfMemoryError, StackOverflowError).

----

🧩 Jakie słowa kluczowe służą do obsługi wyjątków w Javie?

✅ Odpowiedź: try, catch, finally, throw, throws.

🧠 Wyjaśnienie:
* `try` – blok kodu, w którym mogą wystąpić wyjątki.
* `catch` – obsługuje wyjątek, który wystąpił w bloku try.
* `finally` – wykonuje się zawsze, niezależnie od tego, czy wyjątek wystąpił.
* `throw` – służy do ręcznego zgłaszania wyjątku.
* `throws` – deklaruje, że metoda może zgłosić wyjątek.

----

🧩 Kiedy wykonywany jest blok `finally`?

✅ Odpowiedź: Blok finally wykonuje się zawsze — po zakończeniu bloku try, niezależnie od tego, czy wyjątek został zgłoszony, przechwycony, czy nie.

🧠 Wyjaśnienie: Blok finally służy do wykonania kodu sprzątającego, np. zamykania plików, zwalniania zasobów. Wykonuje się, nawet jeśli w bloku try wystąpi wyjątek, lub jeśli w bloku catch wystąpi kolejny wyjątek. Nie zostanie wykonany tylko wtedy, gdy JVM zostanie brutalnie zatrzymana (np. System.exit()).



## CG

🧩 Jak działa garbage collector w javie?

✅ Garbage Collector (GC) w Javie to mechanizm automatycznego zarządzania pamięcią, który usuwa obiekty, do których nie ma już żadnych referencji, czyli nie są już używane przez program. Dzięki temu programista nie musi ręcznie zwalniać pamięci, co zmniejsza ryzyko błędów takich jak wycieki pamięci czy próby dostępu do już usuniętych obiektów.

----
🧩 Jakie algorytmy wykorzystuje Garbage Collector w Javie?

✅ Garbage Collector w Javie może działać według różnych algorytmów, w zależności od wybranego typu GC. Oto najważniejsze z nich:
1. Mark-and-Sweep (Zaznacz i usuń)
   Klasyczny algorytm: GC najpierw „zaznacza” wszystkie obiekty, do których są referencje, a potem „usuwa” te, które nie są zaznaczone. Wadą są fragmentacje pamięci.
2. Copying (Kopiowanie)
   Używany w młodej generacji (Young Generation).Obiekty są kopiowane między obszarami pamięci (np. z Eden do Survivor).Zaleta: szybkie czyszczenie i brak fragmentacji.
3. Mark-Compact (Zaznacz i skompaktuj)
   Po zaznaczeniu żywych obiektów, GC przesuwa je w jedno miejsce, eliminując fragmentację. Używany w starszej generacji (Old Generation).
4. Generational GC (Pokolenia)
   JVM dzieli stertę na pokolenia: Young, Old i czasem Permanent/Metaspace.Młode obiekty są zbierane częściej, starsze rzadziej.Optymalizuje wydajność, bo większość obiektów szybko „umiera”.
5. G1 (Garbage First)
   Dzieli stertę na regiony i zbiera te, które dają największy zysk.


## Wzorce

🧩 Który wzorzec projektowy umożliwia tworzenie obiektów bez ujawniania ich konkretnych klas?

✅ Odpowiedź: Factory Method 

🧠 Wyjaśnienie: Factory Method pozwala na tworzenie obiektów poprzez delegowanie procesu tworzenia do podklas. Dzięki temu kod klienta nie musi znać dokładnej klasy obiektu, który zostanie utworzony.

-----

🧩 Który wzorzec projektowy zapewnia, że dana klasa ma tylko jedną instancję?

✅ Odpowiedź: Singleton 

🧠 Wyjaśnienie: Singleton gwarantuje, że dana klasa ma tylko jedną instancję i zapewnia globalny punkt dostępu do niej. Jest często używany do zarządzania zasobami, np. połączeniami z bazą danych.

-----

🧩 Który wzorzec projektowy pozwala na wybór algorytmu w czasie działania programu?

✅ Odpowiedź: Strategy 

🧠 Wyjaśnienie: Wzorzec Strategii umożliwia dynamiczne wybieranie algorytmu w czasie działania programu. Klient definiuje interfejs strategii, a konkretne algorytmy są implementowane jako klasy, które można wymieniać w zależności od potrzeb.


## Architektura
🧩 Co to jest wzorzec architektoniczny MVC?

✅ Odpowiedź: MVC (Model-View-Controller) to wzorzec architektoniczny, który dzieli aplikację na trzy główne komponenty: Model, Widok i Kontroler. 

🧠 Wyjaśnienie: Wzorzec MVC pomaga w organizacji kodu poprzez separację odpowiedzialności:
Model zarządza danymi i logiką biznesową.
Widok (View) odpowiada za prezentację danych użytkownikowi.
Kontroler (Controller) obsługuje interakcje użytkownika i aktualizuje Model oraz Widok. Przykład: W aplikacji webowej Model może reprezentować dane użytkownika, Widok generować stronę HTML, a Kontroler obsługiwać żądania HTTP.

-----

🧩 Na czym polega zasada KISS w architekturze oprogramowania?

✅ Odpowiedź: KISS (Keep It Simple, Stupid) to zasada projektowania, która zachęca do tworzenia prostych i łatwych do zrozumienia rozwiązań. 

🧠 Wyjaśnienie: Zasada KISS podkreśla, że systemy i rozwiązania powinny być tak proste, jak to możliwe, aby ułatwić ich zrozumienie, utrzymanie i rozwój. Nadmierna złożoność prowadzi do błędów i trudności w zarządzaniu kodem. Przykład: Zamiast tworzyć skomplikowane algorytmy, warto używać prostych i sprawdzonych rozwiązań, które spełniają wymagania.



## Wielowątkowość

🧩 Co to jest wątek w programowaniu?

✅ Odpowiedź: Wątek to najmniejsza jednostka przetwarzania w programie, która może być wykonywana niezależnie. 

🧠 Wyjaśnienie: Wątek jest częścią procesu, która dzieli z nim zasoby, takie jak pamięć i pliki. W Javie wątki można tworzyć za pomocą klasy Thread lub implementując interfejs Runnable.

-----

🧩 Jakie są główne problemy związane z wielowątkowością?

✅ Odpowiedź: Problemy takie jak wyścigi danych, zakleszczenia (deadlock) i niespójność danych. 

🧠 Wyjaśnienie: W wielowątkowości wątki mogą współdzielić zasoby, co prowadzi do problemów, jeśli dostęp do tych zasobów nie jest odpowiednio synchronizowany. Wyścigi danych występują, gdy wątki jednocześnie modyfikują dane, a zakleszczenia, gdy wątki czekają na siebie nawzajem, blokując się w nieskończoność.

----

🧩 Jakie metody w Javie służą do synchronizacji wątków?

✅ Odpowiedź: Metody takie jak synchronized, wait(), notify() i notifyAll(). 

🧠 Wyjaśnienie: Słowo kluczowe synchronized zapewnia, że tylko jeden wątek może uzyskać dostęp do krytycznej sekcji kodu w danym czasie. 
Metody wait(), notify() i notifyAll() pozwalają na komunikację między wątkami, umożliwiając im czekanie i powiadamianie się nawzajem o zmianach stanu.

## SQL

🧩 Co to jest INNER JOIN w SQL?

✅ Odpowiedź: INNER JOIN zwraca tylko te rekordy, które mają dopasowanie w obu tabelach. 

🧠 Wyjaśnienie: INNER JOIN łączy wiersze z dwóch tabel na podstawie warunku określonego w klauzuli ON. Na przykład: SELECT * FROM users INNER JOIN orders ON users.id = orders.user_id; zwraca tylko te wiersze, gdzie users.id odpowiada orders.user_id.

----

🧩 Czym różni się LEFT JOIN od RIGHT JOIN?

✅ Odpowiedź: LEFT JOIN zwraca wszystkie rekordy z lewej tabeli i dopasowane rekordy z prawej tabeli, a RIGHT JOIN działa odwrotnie. 

🧠 Wyjaśnienie: LEFT JOIN zwraca wszystkie wiersze z lewej tabeli, nawet jeśli nie ma dopasowania w prawej tabeli, wypełniając brakujące wartości jako NULL. RIGHT JOIN działa analogicznie, ale zwraca wszystkie wiersze z prawej tabeli. Na przykład: SELECT * FROM users LEFT JOIN orders ON users.id = orders.user_id; zwraca wszystkich użytkowników, nawet jeśli nie mają zamówień.

----

🧩 Co to jest UNION w SQL?

✅ Odpowiedź: UNION łączy wyniki co najmniej dwóch zapytań SQL w jeden zestaw wyników, eliminując duplikaty. 

🧠 Wyjaśnienie: UNION służy do łączenia wyników z różnych zapytań SQL, pod warunkiem, że liczba i typy kolumn w obu zapytaniach są zgodne. Na przykład: SELECT name FROM users UNION SELECT name FROM customers; zwraca unikalne imiona zarówno z tabeli users, jak i customers. Aby zachować duplikaty, można użyć UNION ALL.

----

🧩 Co to jest FULL OUTER JOIN w SQL?

✅ Odpowiedź: FULL OUTER JOIN zwraca wszystkie rekordy z obu tabel, niezależnie od dopasowania. 

🧠 Wyjaśnienie: FULL OUTER JOIN łączy wyniki z INNER JOIN, LEFT JOIN i RIGHT JOIN, zwracając wszystkie wiersze z obu tabel, a brakujące wartości wypełnia jako NULL. Na przykład: SELECT * FROM users FULL OUTER JOIN orders ON users.id = orders.user_id; zwraca wszystkich użytkowników i wszystkie zamówienia, nawet jeśli nie są ze sobą powiązane.

----

🧩 Jakie polecenie SQL służy do pobierania danych z tabeli?

✅ Odpowiedź: SELECT. 

🧠 Wyjaśnienie: Polecenie SELECT jest używane do pobierania danych z jednej lub więcej tabel w bazie danych. Na przykład: SELECT * FROM users; pobiera wszystkie dane z tabeli users.

----

🧩 Jakie polecenie SQL służy do dodawania nowych rekordów do tabeli?
✅ Odpowiedź: INSERT INTO. 

🧠 Wyjaśnienie: Polecenie INSERT INTO pozwala na dodanie nowych rekordów do tabeli. Na przykład: INSERT INTO users (name, age) VALUES ('John', 30); dodaje nowy rekord z imieniem „John” i wiekiem 30.

----

🧩 Jakie polecenie SQL usuwa tabelę z bazy danych?

✅ Odpowiedź: DROP TABLE. 

🧠 Wyjaśnienie: Polecenie DROP TABLE usuwa tabelę z bazy danych wraz z całą jej zawartością. Na przykład: DROP TABLE users; usuwa tabelę users.

----
