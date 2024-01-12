package com.nextstep.demo.basic;
//Base class
class Animal {
 void eat() {
     System.out.println("Animal is eating");
 }
}

//class inheriting from Animal
class Mammal extends Animal {
 void run() {
     System.out.println("Mammal is running");
 }
}

//Derived class inheriting from Mammal
class Dog extends Mammal {
 void bark() {
     System.out.println("Dog is barking");
 }
}

public class MultilevelInheritanceExample {
 public static void main(String[] args) {
     
     Dog dog = new Dog();
     dog.eat();  
     dog.run();  
     dog.bark(); 
 }
}
