import java.util.*;

public class BookManager {

    public static void main(String[] args) {
        List<String> listaKsiazek = new ArrayList<>();
        listaKsiazek.add("Władca Pierścieni");
        listaKsiazek.add("Harry Potter");
        listaKsiazek.add("Hobbit");
        listaKsiazek.add("Wiedźmin");
        listaKsiazek.add("1984");

        Set<String> zbiórAutorow = new HashSet<>();
        zbiórAutorow.add("J.R.R. Tolkien");
        zbiórAutorow.add("J.K. Rowling");
        zbiórAutorow.add("Andrzej Sapkowski");
        zbiórAutorow.add("George Orwell");
        zbiórAutorow.add("J.R.R. Tolkien");

        // Map - HashMap do mapowania książek na autorów
        Map<String, String> ksiazkiAutorzy = new HashMap<>();
        ksiazkiAutorzy.put("Władca Pierścieni", "J.R.R. Tolkien");
        ksiazkiAutorzy.put("Harry Potter", "J.K. Rowling");
        ksiazkiAutorzy.put("Hobbit", "J.R.R. Tolkien");
        ksiazkiAutorzy.put("Wiedźmin", "Andrzej Sapkowski");
        ksiazkiAutorzy.put("1984", "George Orwell");

        System.out.println("=== SYSTEM ZARZĄDZANIA KSIĄŻKAMI ===\n");

        System.out.println("1. Lista książek (Iterator):");
        Iterator<String> iterator = listaKsiazek.iterator();
        int licznik = 1;
        while (iterator.hasNext()) {
            String ksiazka = iterator.next();
            System.out.println("   " + licznik + ". " + ksiazka);
            licznik++;
        }

        System.out.println("\n2. Zbiór autorów (for-each):");
        for (String autor : zbiórAutorow) {
            System.out.println("   - " + autor);
        }

        System.out.println("\n3. Książki i ich autorzy (keySet Iterator):");
        Iterator<String> kluczeIterator = ksiazkiAutorzy.keySet().iterator();
        while (kluczeIterator.hasNext()) {
            String tytul = kluczeIterator.next();
            String autor = ksiazkiAutorzy.get(tytul);
            System.out.println("   \"" + tytul + "\" - " + autor);
        }

        System.out.println("\n4. Pary klucz-wartość (entrySet):");
        for (Map.Entry<String, String> wpis : ksiazkiAutorzy.entrySet()) {
            System.out.println("   Tytuł: " + wpis.getKey() +
                    " | Autor: " + wpis.getValue());
        }

        System.out.println("\n5. Statystyki:");
        System.out.println("   Liczba książek: " + listaKsiazek.size());
        System.out.println("   Liczba unikalnych autorów: " + zbiórAutorow.size());
        System.out.println("   Liczba par książka-autor: " + ksiazkiAutorzy.size());


        System.out.println("\n6. Wyszukiwanie:");
        String szukanaKsiazka = "Hobbit";
        if (listaKsiazek.contains(szukanaKsiazka)) {
            System.out.println("   Książka \"" + szukanaKsiazka + "\" jest na liście!");
        }

        String szukanyAutor = "J.K. Rowling";
        if (zbiórAutorow.contains(szukanyAutor)) {
            System.out.println("   Autor \"" + szukanyAutor + "\" jest w zbiorze!");
        }

        System.out.println("\n7. Usuwanie książki \"1984\":");
        Iterator<String> usuwajacyIterator = listaKsiazek.iterator();
        while (usuwajacyIterator.hasNext()) {
            String ksiazka = usuwajacyIterator.next();
            if (ksiazka.equals("1984")) {
                usuwajacyIterator.remove();
                System.out.println("   Usunięto książkę: " + ksiazka);
            }
        }

        System.out.println("\n8. Zaktualizowana lista książek:");
        for (String ksiazka : listaKsiazek) {
            System.out.println("   - " + ksiazka);
        }


        System.out.println("\n9. Dodawanie nowych elementów:");
        listaKsiazek.add("Dune");
        zbiórAutorow.add("Frank Herbert");
        ksiazkiAutorzy.put("Dune", "Frank Herbert");
        System.out.println("   Dodano nową książkę: Dune");

        System.out.println("\n10. Podsumowanie finalne:");
        System.out.println("    Wszystkie książki:");
        listaKsiazek.forEach(k -> System.out.println("      * " + k));
    }
}