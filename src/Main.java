public class Main { //Main class that can be used to call and execute other class files
    // (like Person.java, and Animal.java) This is useful for encapsulation
    public static void main(String[] args) { //main method that can be used to execute multiple class files
      Person myObj = new Person(); //create object made from Person class file
      myObj.setName("Greg");  //get and set methods are used to access private variable in Person class file
      System.out.println(myObj.getName());  //get and set methods are used to access private variable in Person class file
      Animal myAnimal = new Animal(); //create object made from Animal class file
      Animal myPig = new Pig(); //create a "child object" made from extending the Animal class.
      Animal myDog = new Dog(); //create a "child object" made from extending the Animal class.
      myAnimal.animalSound(); //call method from parent class and use on parent object
      myPig.animalSound(); //call method from child class and use on child object
      myDog.animalSound(); //call method from child class and use on child object
      OuterClass myOuter = new OuterClass(); //Create OuterClass object
      OuterClass.InnerClass myInner = myOuter.new InnerClass(); //Create Innerclass Object
      System.out.println(myInner.y + myOuter.x); //Sum inner and outer objects
      System.out.println(myInner.myInnerMethod());//access outer class variable value from within inner class
    }
  }
  