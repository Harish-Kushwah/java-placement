package oops;

class Animal{
    public int noLegs=4;
    public String type;
    public String sound;
    public Animal(String type){
        this.type = type;
    }
    
}
//single level inheritance
class Dog extends Animal{
    public String nikName;
    public Dog(String nikName,String sound){
        super("Dog");
        this.nikName = nikName;
        super.sound = sound;
    }
    public String getSound(){
        return super.sound;
    }

    public void printDetails(){
        System.out.println("Animal Type : "+ this.type);
        System.out.println("Nik Name : "+ this.nikName);
        System.out.println("Sound : "+ getSound());
    }
}
//single level inheritance
class Cat extends Animal{
    public String nikName;
    public Cat(String nikName,String sound){
        super("Cat");
        this.nikName = nikName;
        super.sound = sound;
    }
    public String getSound(){
        return super.sound;
    }

    public void printDetails(){
        System.out.println("Animal Type : "+ this.type);
        System.out.println("Nik Name : "+ this.nikName);
        System.out.println("Sound : "+ getSound());
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog("Boby", "Bark");
        d1.printDetails();
        Cat c1 = new Cat("Mau", "Maue");
        c1.printDetails();
    }
}
