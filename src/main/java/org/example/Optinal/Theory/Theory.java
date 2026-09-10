package org.example.Optinal.Theory;

import java.util.Optional;

public class Theory {
    public static void main(String[] args) {
        createOptional();
        demonstrateGetValues();
        demonstrateMappingChain();
        demonstrateFiltering();
    }

    static void createOptional() {
        System.out.println("CREATING");

        Optional<String> emptyOpt = Optional.empty();
        System.out.println("Empty: " + emptyOpt.isPresent());

        Optional<String> ofOpt = Optional.of("Direct Value"); // NullPointerException
        System.out.println("Of: " + ofOpt.get()); // NoSuchElementException

        String nullableValue = null;
        Optional<String> nullableOpt = Optional.ofNullable(nullableValue);
        System.out.println("OfNullable (null): " + nullableOpt.isPresent());
        System.out.println();
    }

    static void demonstrateGetValues() {
        System.out.println("GET VALUES");

        Optional<String> cat = Optional.ofNullable(null);

        System.out.println("orElse: " + cat.orElse("Dead Cat"));

        System.out.println("orElseGet: " + cat.orElseGet(() -> "Dead Cat from Supplier"));

        Optional.of("Lucky").ifPresent(name -> System.out.println("Cat name: " + name));

        try {
            cat.orElseThrow(() -> new IllegalArgumentException("Can't found the cat!"));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println();
    }

    static void demonstrateMappingChain() {
        System.out.println("Computer -> Soundcard -> USB");

        Computer fullComputer = new Computer(new SoundCard(new USB("3.0")));
        String fullVersion = getUsbVersion(Optional.of(fullComputer));
        System.out.println("Version: " + fullVersion); // 3.0

        Computer brokenComputer = new Computer(null);
        String brokenVersion = getUsbVersion(Optional.of(brokenComputer));
        System.out.println("Version: " + brokenVersion); // UNKNOWN

        String emptyVersion = getUsbVersion(Optional.empty());
        System.out.println("Version: " + emptyVersion); // UNKNOWN
        System.out.println();
    }

    // flatMap if getter returns Optional (avoid Optional<Optional<T>>)
    // map if getter return primitive/object
    static String getUsbVersion(Optional<Computer> computer) {
        return computer
                .flatMap(Computer::getSoundcard)
                .flatMap(SoundCard::getUSB)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
    }

    static void demonstrateFiltering() {
        System.out.println("FILTERING");

        Modem validModem = new Modem(12.5);
        Modem cheapModem = new Modem(5.0);
        Modem nullModem = null;

        System.out.println("Price range [10, 15]: " + checkPrice(validModem));
        System.out.println("Price range [10, 15]: " + checkPrice(cheapModem));
        System.out.println("Null: " + checkPrice(nullModem));
    }

    static boolean checkPrice(Modem modem) {
        return Optional.ofNullable(modem)
                .map(Modem::getPrice)
                .filter(p -> p >= 10)
                .filter(p -> p <= 15)
                .isPresent();
    }
}
