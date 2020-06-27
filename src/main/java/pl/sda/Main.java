package pl.sda;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Aplikacja sprawdzająca czy użytkownik ma dług w systemie.
        1. Utwórz wyjątek unchecked i nazwij go UserDataNotCorrectException
           * zwracana wiadomość powinna brzmieć "Provided user data is incorrect"
        2. Zwróć wyjątek w miejscach w których okazuje się, że wprowadzone dane są niepoprawne
        3. Utwórz wyjątek unchecked i nazwij go UserNotFoundException
           * zwracana wiadomość powinna brzmieć "User not found in database"
        4. Przejdź po wszystkich użytkownikach w pętli i sprawdź czy jest taki, który nazywa się Jacek Placek.
           * Jeśli go nie ma zwróć wyjątek z 3.
        5. Jeśli znalazł się taki użytkownik sprawdź czy jego debt jest równy zero
           * Jeśli nie jest równy 0 wypisz - "Sorry, you still have debt in our system"
           * Jeśli jest równy 0 wypisz - "No debt in our system"
        6. Dlaczego w 5. nie zwróciliśmy wyjątku?
        7. Zamiast mieć na sztywno dodany jeden element listy przeczytaj listę użytkowników z pliku
           a. Plik jest w formacie <imie>;<nazwisko>;<zaleglość> - nazywa się db.txt
           b. Utwórz klasę PersonReader
             * powinna mieć pole (ustawiane za pomocą konstruktora) typu Path o nazwie databasePath
             * powinna mieć metodę List<Person> readDatabase(); w niej zaimplementuj b1 lub b2 - c
           b1. Odczytaj plik ze ścieżki podanej w polu używając Files.readAllLines() - pamiętaj o poprawnej obsłudze wyjątków
           LUB
           b2. Odczytaj plik ze ścieżki podanej w polu używając Files.newBufferedReader() - pamiętaj o poprawnej obsłudze wyjątków (tutaj polecam try-with-resources)
           Podpowiedź: ełz eizdęb ein zet eineżułsbo tsaimotan dekcehcnu jelad ćicuzr i dekcehcnu w noitpecxe net ćawoparwo ęjuregus
           c. Przeiteruj przez wszystkie linijki pliku i dodawaj nową osobę w oparciu o kolejną linijkę
           d. W klasie Main utwórz pole typu PersonReader o nazwie personReader i zainicjalizuj od razu w taki sposób, aby ścieżką było "db.txt"
           e. W metodzie main do zmiennej customers przypisz rezultat personReader.readDatabase().
        8. Podmień ścieżkę pliku z db.txt na otherDb.txt, sprawdź jak działa. Czy powinniśmy to jakoś obsłużyć?
           Odpowiedź: .uktąjyw z sipo yrbod ocąjazcratsyw "einlśymod" ymśilatsod elosnok aN .ynozdokzsu tsej kilp eż ,myt z ćiborz cin ymeżom ein ,eiN
         */


        List<Person> customers = new LinkedList<>();
        customers.add(new Person("Jacek", "Placek", BigDecimal.valueOf(100)));

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String surname = scanner.nextLine();
        if (!name.matches("\\w+")) {
            //tutaj wyrzuc wyjatek o niepoprawnych danych osobowych
        }
        if (!surname.matches("\\w+")) {
            //tutaj wyrzuc wyjatek o niepoprawnych danych osobowych
        }

    }
}
