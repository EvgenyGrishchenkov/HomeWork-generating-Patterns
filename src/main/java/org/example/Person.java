package org.example;

import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String city;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public boolean hasAge(int age) {
        return age != -1;
    }

    public boolean hasCity(String city) {
        if (city != null) {
            return true;
        } else return false;
    }

    public String getName(String name) {
        return name;
    }

    public String getSurname(String surname) {
        return surname;
    }

    public OptionalInt getAge() {
        return hasAge(age) ? OptionalInt.of(age) : OptionalInt.empty();
    }

    public String getCity(String city) {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void happyBirthday(int age) {
        this.age = age + 1;
    }

    @Override
    public String toString() {
        return "Имя: " + name + "\n" +
                "Фамилия: " + surname + "\n" +
                "Возраст: " + age + "\n" +
                "Город: " + city + "\n";
    }

    @Override
    public int hashCode() {
        int result = name == null ? 0 : name.hashCode();
        return result;
    }

    public PersonBuilder newChildBuilder() {
        getSurname();
        getAge();
        getCity();
        return newChildBuilder();

    }
}
