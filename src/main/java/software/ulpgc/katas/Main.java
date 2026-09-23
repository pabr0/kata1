package software.ulpgc.katas;

import java.time.LocalDate;

public class Main {
    static void main() {
        Person lucia = new Person("Lucia", LocalDate.of(2005, 5, 12));
        System.out.println(lucia.age());
    }
}
