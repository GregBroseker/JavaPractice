public class Main { //Main class that can be used to call and execute other class files
    // (like Person.java) This is useful for encapsulation
    public static void main(String[] args) {
      Person myObj = new Person();
      myObj.setName("Greg");  // error
      System.out.println(myObj.getName()); // error 
    }
  }
  