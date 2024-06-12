package org.utils

interface Animal {
    void eat()
}

interface Mammal extends Animal {
    void walk()
}

class Dog implements Mammal {
    void eat() {
        println("Dog is eating.")
    }

    void walk() {
        println("Dog is walking.")
    }
}