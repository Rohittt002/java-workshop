//WAP for super Keyword
class Parent {
    int x = 10;

    void display() {
        System.out.println("Parent class display method");
    }
}

class Child extends Parent {
    int x = 20;

    void display() {
        System.out.println("Child class display method");
    }

    void showValues() {
        System.out.println("Child x: " + x);
        System.out.println("Parent x: " + super.x);
        super.display();
    }
}