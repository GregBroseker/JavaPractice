import java.util.*;//Acess scanner class within java.util package imported from JRE

public class Classes { //Create Public Class (must match java file name)
    int modelYear;
    String modelName;
  
    public Classes(int year, String name) { //Create constructor for class (must match class name)
      modelYear = year;
      modelName = name;
    }
  
    public static void main(String[] args) { //Create main method that begins code execution
      Classes myCar = new Classes(2007, "Chrysler 300"); //Declare an object myCar and pass the parameters the constructor needs above
      System.out.println(myCar.modelYear + " " + myCar.modelName); //Access object parameters using dot notation
      try (Scanner userObj = new Scanner(System.in)) { //Create userObject and grant it access to scanner class so it can accept user input
        System.out.println("Enter username: ");
          String userName = userObj.nextLine(); // Create a string variable userName and assign it to the userObject which gets its value from user input
          System.out.println("Username is: " + userName); // printout string variable that contains value from user inputted data captured by the object defined above that had access to the Scanner class
    }
    }
  }