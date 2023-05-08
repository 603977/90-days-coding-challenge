class Animal {
  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}
class Cat extends Animal {
  public void display() {
    System.out.println("My name is " + name);
  }
}
class InheritanceEx{
  public static void main(String[] args) {
    Cat pussy = new Cat();
    pussy.name = "Charlie";
    pussy.display();
    pussy.eat();

  }
}
