package com.kremogen;

public abstract class Dog {
    private String name;

    public String getName() {return name;}

    public Dog(String name){
        this.name = name;
    }

    public abstract void displayInfo();
}

class Breed extends Dog{
    private String breedName;

    public Breed(String name, String breedName){
        super(name);
        this.breedName = breedName;
    }

    public void displayInfo(){
        System.out.println("Имя собаки: " + super.getName() + "\nНазвание породы: " + breedName);
    }
}
