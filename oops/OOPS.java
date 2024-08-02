package oops;

class Pen{
    String color;
    String type; //ballpoint,gel

    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
class Student{
    String name;
    int age;

    Student(){}
    //copy constructor
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printInfo(){
        System.out.println(this.name + this.age);
    }
}
public class OOPS {
    public static void main(String[] args) {
        Pen ballPen = new Pen();
        ballPen.color = "blue";
        ballPen.type = "gel";

        ballPen.write();

        Pen blackPen = new Pen();
        blackPen.color ="black";
        blackPen.type = "ball";
        blackPen.printColor();
        
        Student s2 = new Student();
        s2.name = "Harish";
        s2.age = 21;
        Student s1 = new Student(s2);

        s1.printInfo();
    }    
}
