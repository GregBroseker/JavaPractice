class Animal { //parent class
    public void animalSound() {
      System.out.println("The animal makes a sound");
    }
  }
  
  class Pig extends Animal { // children
    public void animalSound() {
      System.out.println("The pig says: oink");
    }
  }
  
  class Dog extends Animal { // children
    public void animalSound() {
      System.out.println("The dog says: woof woof");
    }
  }