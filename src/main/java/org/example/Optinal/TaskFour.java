package org.example.Optinal;

import java.util.Optional;
import java.util.zip.ZipEntry;

public class TaskFour {
    static void main() {
        City city = new City("22sa");
        Address address = new Address(city);
        User user = new User(null);
        System.out.println(extractZipCode(user));
    }

    public static String extractZipCode(User user) {
        return Optional.ofNullable(user).flatMap(User::getAddress).flatMap(Address::getCity).flatMap(City::getZipCode).orElse("00000");

    }
}

class City {
    private String zipCode;

    public City(String zipCode) {
        this.zipCode = zipCode;
    }

    public Optional<String> getZipCode() {
        return
                Optional.ofNullable(zipCode);
    }
}

class Address {
    private City city;

    public Address(City city) {
        this.city = city;
    }

    public Optional<City> getCity() {
        return
                Optional.ofNullable(city);
    }
}

class User {
    private Address address;

    public User(Address address) {
        this.address = address;
    }

    public Optional<Address> getAddress() {
        return
                Optional.ofNullable(address);
    }
}