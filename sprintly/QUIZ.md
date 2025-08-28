# Spring i okolice

## Ogólna teoria o Spring

**Czym jest framework Spring?**

Spring to popularny framework Java, który ułatwia tworzenie aplikacji poprzez zarządzanie zależnościami, konfiguracją i obsługą komponentów.

**Jakie są główne moduły Springa?**

Do głównych modułów należą: Spring Core, Spring MVC, Spring Data, Spring Security, Spring Boot.

**Co to jest Inversion of Control (IoC) w Springu?**

IoC to wzorzec, w którym kontrolę nad tworzeniem i zarządzaniem obiektami przejmuje kontener Springa.

**Jak działa Dependency Injection w Springu?**

Spring automatycznie wstrzykuje zależności do komponentów, co upraszcza zarządzanie kodem i testowanie.

**Jakie są zalety korzystania ze Springa?**
- Ułatwia zarządzanie zależnościami
- Wspiera testowanie
- Zapewnia modularność
- Integruje się z wieloma technologiami
- Umożliwia szybkie tworzenie aplikacji webowych

**Jak działa kontener Spring?**
Kontener Spring zarządza cyklem życia i konfiguracją obiektów (beanów), automatycznie je tworzy, wstrzykuje zależności i niszczy.

**Czym różni się Bean od komponentu w Springu?**
Bean to obiekt zarządzany przez kontener Springa, zdefiniowany przez adnotację `@Bean` lub automatycznie wykrywany przez adnotacje takie jak `@Component`, `@Service`, `@Repository`.

**Jakie typy Beanów można definiować w Springu?**
Można definiować beany singleton, prototype, request, session i inne, zależnie od potrzeb aplikacji.
- **singleton**: Tworzony jest tylko jeden egzemplarz beana na cały kontekst Springa (domyślny scope).
- **prototype**: Za każdym razem, gdy bean jest pobierany z kontenera, tworzony jest nowy egzemplarz.
- **request**: Nowy bean jest tworzony dla każdego żądania HTTP (tylko w aplikacjach webowych).
- **session**: Nowy bean jest tworzony dla każdej sesji HTTP (tylko w aplikacjach webowych).

**Jakie są sposoby konfiguracji aplikacji w Springu?**
Konfigurację można wykonać przez pliki XML, klasy Java z adnotacjami (`@Configuration`), pliki properties/yaml oraz programowo.

**Jakie są najważniejsze cechy Spring MVC?**
Spring MVC umożliwia tworzenie aplikacji webowych w architekturze Model-View-Controller, obsługuje routowanie, walidację, binding danych i integrację z widokami.

## Podstawy Spring Boot

**Czym jest Spring Boot?**

Spring Boot to rozszerzenie frameworka Spring, które upraszcza tworzenie aplikacji poprzez automatyczną konfigurację i wbudowany serwer aplikacyjny.

**Jakie są główne zalety Spring Boot?**

- Brak potrzeby ręcznej konfiguracji XML
- Wbudowany serwer (Tomcat, Jetty)
- Startery ułatwiające zależności
- Łatwa integracja z Spring Security, JPA, itd.

**Co to są "startery" w Spring Boot?**

To zestawy zależności, które upraszczają konfigurację np. `spring-boot-starter-web`, `spring-boot-starter-data-jpa`.

**Jak uruchomić aplikację Spring Boot?**

Poprzez klasę z adnotacją `@SpringBootApplication` i metodą `main()`.

**Jakie adnotacje są najczęściej używane w aplikacji Spring Boot?**

Najczęściej używane adnotacje to: `@SpringBootApplication`, `@RestController`, `@Autowired`, `@RequestMapping`.

**Jak działa automatyczna konfiguracja w Spring Boot?**

Spring Boot automatycznie konfiguruje aplikację na podstawie obecnych zależności w projekcie oraz właściwości w plikach konfiguracyjnych, dzięki mechanizmowi `@EnableAutoConfiguration`.

**Jak uruchomić aplikację Spring Boot z poziomu linii poleceń?**

Aplikację można uruchomić poleceniem `mvn spring-boot:run` lub uruchamiając plik JAR: `java -jar nazwa-aplikacji.jar`.

**Co to są Spring Boot Actuatory i do czego służą?**

Spring Boot Actuator to zestaw narzędzi i endpointów do monitorowania, zarządzania oraz diagnostyki aplikacji. Umożliwia m.in. sprawdzanie stanu zdrowia aplikacji (`/actuator/health`), statystyk, metryk, logów, środowiska, a także zarządzanie konfiguracją w locie.

---
## Konfiguracja i właściwości
**Jak wstrzyknąć wartość z pliku properties?**

Używając `@Value("${nazwa.właściwości}")`

**Jak nadpisać konfigurację domyślną?**

Przez plik `application.properties` lub adnotacje konfiguracyjne.

---
## Dependency Injection i komponenty
**Czym jest `@Component`?**

Oznacza klasę jako komponent Springa, który może być wstrzykiwany.

**Różnica między `@Component`, `@Service`, `@Repository`?**

Wszystkie są komponentami, ale mają semantyczne znaczenie:
- `@Service` dla logiki biznesowej
- `@Repository` dla warstwy danych
- `@Component` ogólna adnotacja

**Jak działa `@Autowired`?**

Automatycznie wstrzykuje zależności do komponentów Springa.

**Jak zdefiniować własny bean?**

Poprzez metodę oznaczoną `@Bean` w klasie z `@Configuration`.

**Jak ograniczyć zakres komponentu?**

Używając `@Scope("prototype")`, `@Scope("singleton")`, itd.

---
## Web i REST
**Jakie są rodzaje zapytań HTTP i do czego służą?**
- **GET**: służy do pobierania danych z serwera, nie modyfikuje zasobów.
- **POST**: służy do tworzenia nowych zasobów na serwerze, np. dodawania nowych rekordów.
- **PUT**: służy do pełnej aktualizacji istniejącego zasobu.
- **PATCH**: służy do częściowej aktualizacji zasobu.
- **DELETE**: służy do usuwania zasobów z serwera.
- **HEAD**: podobne do GET, ale zwraca tylko nagłówki odpowiedzi, bez treści.
- **OPTIONS**: zwraca dostępne metody HTTP dla danego zasobu.

**Co to jest idempotentność zapytań HTTP i które metody są idempotentne?**
Idempotentność oznacza, że wielokrotne wykonanie tego samego żądania daje ten sam efekt co pojedyncze wykonanie. W HTTP idempotentne są metody:
- **GET**: pobiera dane, nie zmienia stanu serwera.
- **PUT**: każda operacja nadpisuje zasób, efekt jest taki sam niezależnie od liczby wywołań.
- **DELETE**: usunięcie zasobu, kolejne wywołania nie zmieniają już stanu.
- **HEAD** i **OPTIONS**: nie zmieniają stanu serwera.
Nieidempotentne są np. **POST** (każde wywołanie może utworzyć nowy zasób) oraz **PATCH** (częściowa modyfikacja może dać różne efekty przy wielokrotnym wywołaniu).

**Jakie są najpopularniejsze kody statusu HTTP i co oznaczają?**
- **200 OK**: żądanie zakończone sukcesem, zwracane przy poprawnym pobraniu lub modyfikacji zasobu.
- **201 Created**: zasób został utworzony, najczęściej po żądaniu POST.
- **204 No Content**: operacja zakończona sukcesem, ale odpowiedź nie zawiera treści (np. po DELETE).
- **400 Bad Request**: żądanie jest niepoprawne, np. brakuje wymaganych danych lub są błędne.
- **401 Unauthorized**: brak autoryzacji, użytkownik nie jest zalogowany lub nie ma uprawnień.
- **403 Forbidden**: użytkownik jest zalogowany, ale nie ma uprawnień do wykonania operacji.
- **404 Not Found**: żądany zasób nie istnieje.
- **409 Conflict**: konflikt danych, np. próba utworzenia zasobu, który już istnieje.
- **500 Internal Server Error**: błąd po stronie serwera.


**Jak stworzyć kontroler REST?**

Używając `@RestController` i `@RequestMapping`.

**Różnica między `@Controller` a `@RestController`?**

`@RestController` = `@Controller` + `@ResponseBody`, czyli zwraca dane, nie widoki.

**Jak obsłużyć parametry w żądaniu GET?**

Przez `@RequestParam` lub `@PathVariable`.


---
## Spring Data JPA
**Czym jest Spring Data JPA?** 

Abstrakcja nad JPA, upraszczająca dostęp do bazy danych.

**Jak stworzyć repozytorium?**

Interfejs rozszerzający `JpaRepository`.

**Jak wykonywać zapytania niestandardowe?**

Przez adnotację `@Query` lub metody oparte na nazwach.

**Jak działa lazy loading?**

Dane są ładowane dopiero przy dostępie do pola, np. relacji.

**Jak działa mechanizm CrudRepository i czym różni się od JpaRepository?**
CrudRepository udostępnia podstawowe operacje CRUD. JpaRepository rozszerza go o dodatkowe metody, np. paginację i sortowanie.

**Jak skonfigurować połączenie z bazą danych w Spring Boot?**
Połączenie z bazą danych można skonfigurować na kilka sposobów:
- Poprzez wpisanie parametrów w pliku `application.properties`, np.:
  `spring.datasource.url=jdbc:mysql://localhost:3306/db`
  `spring.datasource.username=...`
  `spring.datasource.password=...`
- W pliku `application.yml` (alternatywa dla properties):
  ```yaml
  spring:
    datasource:
      url: jdbc:mysql://localhost:3306/db
      username: ...
      password: ...
  ```
- Przez zmienne środowiskowe (np. w chmurze lub kontenerach):
  Można ustawić zmienne środowiskowe, które zostaną odczytane przez Spring Boot, np. `SPRING_DATASOURCE_URL`.
- Programowo, np. przez klasę konfiguracyjną z beanem `DataSource`:
  ```java
  @Bean
  public DataSource dataSource() {
      return DataSourceBuilder.create()
          .url("jdbc:mysql://localhost:3306/db")
          .username("...")
          .password("...")
          .build();
  }
  ```

**Co to jest encja w JPA i jak ją definiować?**
Encja to klasa oznaczona adnotacją `@Entity`, która odwzorowuje tabelę w bazie danych.

**Jak obsłużyć relacje między encjami (OneToMany, ManyToOne, ManyToMany)?**
Relacje definiuje się przez odpowiednie adnotacje na polach encji, np. `@OneToMany`, `@ManyToOne`, `@ManyToMany`.
- **@OneToMany**: relacja jeden-do-wielu, np. jeden użytkownik ma wiele zadań. W encji właściciela relacji (np. User) dodajemy pole typu lista i adnotację `@OneToMany(mappedBy = "user")`.
- **@ManyToOne**: relacja wiele-do-jednego, np. wiele zadań należy do jednego użytkownika. W encji zależnej (np. Task) dodajemy pole do właściciela i adnotację `@ManyToOne`.
- **@ManyToMany**: relacja wiele-do-wielu, np. użytkownicy mogą mieć wiele projektów, a projekty wielu użytkowników. W obu encjach dodajemy pole typu lista i adnotację `@ManyToMany`, często z tabelą pośredniczącą przez `@JoinTable`.

**Jak działa audytowanie danych w Spring Data JPA?**
Można użyć adnotacji takich jak `@CreatedDate`, `@LastModifiedDate` oraz włączyć audytowanie przez `@EnableJpaAuditing`.

**Jak paginować wyniki zapytań?**
Poprzez przekazanie obiektu `Pageable` do metod repozytorium, np. `findAll(Pageable pageable)`.

**Jak obsłużyć transakcje w Spring Data JPA?**
Za pomocą adnotacji `@Transactional` na metodach lub klasach serwisowych.

---
## Bezpieczeństwo i inne
**Jak dodać Spring Security?**

Dodając zależność `spring-boot-starter-security` i konfigurując klasę `SecurityConfig`.

**Jak obsłużyć wyjątki globalnie?**

Przez `@ControllerAdvice` i `@ExceptionHandler`.

---
## Hibernate

**Czym jest Hibernate?**

Hibernate to popularny framework ORM dla Javy, który umożliwia mapowanie obiektów na tabele w relacyjnej bazie danych.

**Jakie są główne zalety korzystania z Hibernate?**
- Automatyczne mapowanie obiektów na tabele
- Obsługa transakcji
- Cache'owanie danych
- Wsparcie dla relacji i dziedziczenia
- Ułatwione zarządzanie migracjami schematu


**Jak zdefiniować klucz główny w encji Hibernate?**

Poprzez adnotację `@Id` na polu klasy, opcjonalnie z `@GeneratedValue` dla automatycznego generowania wartości.


**Co to jest sesja Hibernate?**

Sesja (`Session`) to obiekt zarządzający operacjami na encjach i komunikacją z bazą danych.

**Jakie są stany encji w Hibernate?**

Encje mogą być w stanach: transient (nowa, niezarządzana), persistent (zarządzana przez sesję), detached (oddzielona od sesji, ale nadal istniejąca w bazie), removed (do usunięcia).

**Jak działa mechanizm kaskadowania w Hibernate?**

Kaskadowanie pozwala na automatyczne wykonywanie operacji na powiązanych encjach. Ustawia się je przez adnotacje, np. `@OneToMany(cascade = CascadeType.ALL)`.

**Czym różni się get() od load() in Hibernate?**

`get()` natychmiast pobiera obiekt z bazy (lub zwraca null, jeśli nie istnieje). `load()` zwraca proxy i pobiera dane dopiero przy dostępie do pól; jeśli obiekt nie istnieje, rzuca wyjątek.

**Co się stanie, jeśli usuniesz encję będącą po stronie "many" w relacji OneToMany bez odpowiedniej kaskady?**

Encja zostanie usunięta tylko z kolekcji w encji "one", ale nie z bazy danych. Może to prowadzić do niespójności danych.

**Jak działa mechanizm dirty checking?**

Hibernate automatycznie wykrywa zmiany w obiektach zarządzanych przez sesję i synchronizuje je z bazą podczas flush/commit.

**Jak rozwiązać problem N+1 select?**

Można użyć fetch join w HQL, adnotacji `@EntityGraph`, batch fetching lub zmienić strategię pobierania na EAGER.

**Co to jest proxy w Hibernate i kiedy może powodować LazyInitializationException?**

Proxy to obiekt zastępczy tworzony przez Hibernate dla lazy loading. LazyInitializationException występuje, gdy próbujemy uzyskać dostęp do niezainicjalizowanego proxy poza sesją.

**Jak działa first-level cache i kiedy jest czyszczona?**

First-level cache to pamięć podręczna sesji Hibernate. Jest czyszczona po zamknięciu sesji lub wywołaniu clear/evict.

**Jak działa second-level cache i jak ją skonfigurować?**

Second-level cache przechowuje dane między sesjami. Konfiguracja wymaga dodania odpowiedniego providera (np. EhCache) i adnotacji `@Cache` na encjach.

**Jakie są różnice między flush a commit?**

`flush` synchronizuje stan encji z bazą, ale nie zatwierdza transakcji. `commit` zatwierdza transakcję i zapisuje zmiany na stałe.

**Jak działa optimistic locking i jak go zaimplementować?**

Optymistyczna blokada polega na użyciu pola wersji (np. `@Version`). Przy próbie zapisu Hibernate sprawdza wersję i rzuca wyjątek przy konflikcie.

**Jakie są konsekwencje ustawienia hbm2ddl.auto=update na produkcji?**

Może prowadzić do niekontrolowanych zmian w schemacie bazy, utraty danych lub błędów migracji. Zalecane tylko w fazie developmentu.

**Jakie są różnice między adnotacjami JPA a Hibernate?**

Adnotacje JPA są standardowe i przenośne, Hibernate oferuje dodatkowe, specyficzne funkcje (np. `@Type`, `@Cache`).

**Jak zmapować dziedziczenie w Hibernate?**

Można użyć strategii: `SINGLE_TABLE`, `JOINED`, `TABLE_PER_CLASS` poprzez adnotację `@Inheritance`.

**Jak obsłużyć relację ManyToMany z dodatkowymi polami w tabeli pośredniczącej?**

Tworzy się osobną encję dla tabeli pośredniczącej i mapuje relacje jako dwa `@ManyToOne`.

**Jak działa @Transactional w Spring i jak współpracuje z Hibernate?**
`
@Transactional` zarządza transakcjami na poziomie Springa, automatycznie otwiera, zatwierdza lub wycofuje transakcje Hibernate.

**Jakie są skutki uboczne używania fetch = FetchType.EAGER?**

Może prowadzić do pobierania dużej ilości danych, problemów z wydajnością i cyklicznych zależności.
