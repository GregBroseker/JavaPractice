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
    }
  }