class Vehicle { //Parent Class
    protected String brand = "Audi"; // protected gives child class access
    public void honk() { //method child class inherits
      System.out.println("Tuut, tuut!");
    }
  }
  
  class Car extends Vehicle { //Child class
    private String modelName = "R8"; //variable local to the child class
    public static void main(String[] args) {// main method that executes code
      Car myFastCar = new Car(); //create object within child class
      myFastCar.honk();//call method from parent class to be used with object created in child class
      System.out.println(myFastCar.brand + " " + myFastCar.modelName); //access parent class attribute with child class object
    }
  }
  