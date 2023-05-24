package org.example;

public class PersonBuilder {
    private String name;
    private String surname;
    private int age = -1;
    private String city;
    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age <0 || age >150) {
            throw new IllegalArgumentException(
                    "Недопустимый возраст, можно от 0 до 150"
            );
        }
        this.age = age;
        return this;
    }
    public PersonBuilder setCity (String city) {
        this.city = city;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException(
                    "Имя и/или фамилия являются обязательными полями");
        }
        Person person;
        if (age == -1) {
        person = new Person(name, surname);
        } else {
        person = new Person(name, surname, age);
        }
        if (city != null) {
            person.setCity(city);
        }
        return person;
        }

}
