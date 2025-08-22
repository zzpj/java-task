# 🧠 Zadania programistyczne – Java

---

## 🧩 Zadanie 1: Generyczna implementacja stosu z testami i wzorcem projektowym

### 📋 Treść zadania

Zaimplementuj klasę `Stack<T>` w języku Java, która będzie przechowywać elementy dowolnego typu (`T`). Klasa powinna zawierać następujące metody:

- `void push(T item)` – dodaje element na stos
- `T pop()` – usuwa i zwraca element ze szczytu stosu
- `T peek()` – zwraca element ze szczytu stosu bez usuwania
- `boolean isEmpty()` – sprawdza, czy stos jest pusty
- `int size()` – zwraca liczbę elementów na stosie

Stos może być zaimplementowany:
- 🔹 jako tablica o stałej wielkości (z rzutowaniem typu)
- 🔹 lub jako dynamiczna lista (`ArrayList<T>`)

Wykorzystaj wzorzec _fabryki_ i zaimplementuj klasę `StackFactory`, która będzie odpowiedzialna za tworzenie instancji stosu.

### ✅ Testy jednostkowe
Zaimplementuj testy jednostkowe dla klasy Stack<T> z użyciem JUnit 5. Przykładowe przypadki testowe:
- dodanie i usunięcie elementu
- sprawdzenie poprawności metody `peek()`
- obsługa pustego stosu `assertThrows`
- poprawna liczba elementów po operacjach
- działanie stosu z różnymi typami (`Integer`, `String`, `CustomObject`)

### 🎯 Cel
- Poznaj działanie stosu jako struktury LIFO (Last In, First Out)
- Naucz się implementować generyczne klasy w Javie
- Zastosuj wzorzec projektowy fabryki dla lepszej elastyczności kodu
- Przećwicz pisanie testów jednostkowych i pracę z frameworkiem JUnit



## 🧩 Zadanie 2: Sortowanie elementów na stosie

### 📋 Treść zadania

Korzystając z wcześniej zaimplementowanej klasy `Stack<T>`, napisz metodę:

```java
public static <T> void sortStack(Stack<T> stack, Comparator<T> comparator) {}
```

która:
- pobiera wszystkie elementy ze stosu,
- sortuje je według podanego komparatora (Comparator<T>),
- umieszcza je z powrotem na stosie w kolejności posortowanej (najmniejszy na górze).

### 🎯 Cel
- Zrozumienie, jak manipulować strukturami danych przy użyciu komparatorów
- Praktyka przekształcania stosu w listę i z powrotem
- Utrwalenie pracy z generykami i interfejsem Comparator<T>
- Rozwijanie umiejętności testowania logiki algorytmicznej z użyciem JUnit

### 📌 Wskazówka
Możesz stworzyć klasę pomocniczą `StackUtils`, która będzie zawierać metodę `sortStack`. 

