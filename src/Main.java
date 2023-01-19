import java.util.ArrayList; // import ArrayList class which is an array that is modifiable. Regular arrays in java are not.
import java.util.Collections; 
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.File; 
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main extends Thread { //Main class that can be used to call and execute other class files
    // (like Person.java, and Animal.java) This is useful for encapsulation
    public static int amount = 0; // variable that entire class 'Main' has access to. Since 'Main' extends, or inherits 'Thread', the 'Thread' class has access to this variable as well.

    static void checkAge(int age) {
      if (age < 21) {
        throw new ArithmeticException("Access denied - You must be at least 21 years old."); // 'throw' keyword is to create custom error based on exception type (ArithmeticException)
      }
      else {
        System.out.println("Access granted - You are old enough!");
      }
    }

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
      ArrayList<String> cars = new ArrayList<String>(); //create array called cars from ArrayList class and let it accept strings as parameters.
      cars.add("Porsche"); // invoke add method from ArrayList class on 'cars' array to add elements into the array
      cars.add("BMW");
      cars.add("Benz");
      cars.add("Lambo");
      System.out.println(cars); //Priint out the entire cars array
      System.out.println(cars.get(1)); //print out the 2nd index of the cars array (java indexes are zero based)
      Collections.sort(cars); //call sort method from Collections class on array 'cars'. sort is alphabetical/numerical based on parameter type

    for (int i = 0; i < cars.size(); i++) { // Loop through cars array
      System.out.println(cars.get(i)); //print out each element 
    }
    for (String i : cars) {
      System.out.println(i); //for each style loop through cars array
    }

    HashMap<String, Integer> people = new HashMap<String, Integer>(); // Create hashmap object 'people' (key, value)
    people.put("Grace", 18);
    people.put("Jesus", 33);
    people.put("Mary", 38);
    for (String i : people.keySet()) { //Loop through keys and store in 'i'
      System.out.println("Name: " + i + " Age: " + people.get(i)); // print out 'i' (key), and use get method to print out value of 'i' key
    }

    HashSet<Integer> numbers = new HashSet<Integer>();
    numbers.add(3);
    numbers.add(6); // add values to Hash set
    numbers.add(9);
    for(int i = 1; i <= 10; i++) {
      if(numbers.contains(i)) { //'contains' method checks elements of hash set against loop counter. If loop counter 'i' matches with an element in the hash set,
        System.out.println(i + " was found in the set."); // print there was a match
      } else {
        System.out.println(i + " was not found in the set."); //if i did not match an element, print there was no match.
      }
    }

    ArrayList<Integer> numbers2 = new ArrayList<Integer>(); //create 'numbers2' array in ArrayList class and give it integer values
    numbers2.add(28);
    numbers2.add(8);
    numbers2.add(27);
    numbers2.add(46);

    Iterator<Integer> it = numbers2.iterator(); //create iterator 'it' from Iterator class that caaepts integer values from numbers2 array
    while(it.hasNext()) { //while 'it' iterator has a next value in 'numbers2' array, 
      Integer i = it.next(); //create while loop counter 'i', give it an integer data type, and assign the value as the iterator value, which is retrieved from the 'numbers2' array created from the ArrayList class
      if(i < 25) { 
        it.remove(); // remove values less than 10 from the iterator, which also removes it from the numbers2 array, since the iterator's values were assigned to 'numbers2' values
      }
    }

    System.out.println(numbers2); //prints out the updated numbers2 array with values less than 10 removed.
    // wrapper objects created from Wrapper class are used so primitive data type variables like 'int' can be used directly as objects, instead of just attributes of a class/method
    Integer myInt = 2500; //create myInt object with wrapper class 'Integer'
    String myString = myInt.toString(); //create myString object with wrapper class 'String', assign it as myInt object value, use toString() method from Wrapper class 'String' to convert myInt object into a string object
    System.out.println(myString.length()); 
    //print out character length of myString object, which used to be an integer
    // This concept could be good for parsing, working with different data types interchangeably, or modifying a value while keeping it the same in the original object

    try { //try code, if successful, execute and do not move to catch.
      int[] myNumbers = {3, 6, 9};
      System.out.println(myNumbers[2]);
    } catch (Exception e) { // if try section fails, execute catch section (to handle whatever error was found in try section)
      System.out.println("Something went wrong.");
    } finally { // finally will execute no matter what, after either try or catch finishes.
      System.out.println("The 'try catch' is finished.");
    }

    checkAge(25); //pass value into checkAge method above. Depending on value, user defined error (throw) will occur. This can be useful for granting or denying access based on given values or user input.

    Pattern pattern = Pattern.compile("CPR", Pattern.CASE_INSENSITIVE); //create 'pattern' variable in 'Pattern' class. call compile method from Pattern class, pass 'CPR' as value into compile method,
    // and make the 'pattern' variable case insensitive. (2nd parameter is optional)
    Matcher matcher = pattern.matcher("Visit CPR"); //create 'matcher' variable in Matcher class. assign it 'pattern' variable value, and call matcher method and pass it a value. ('Visit CPR')
    boolean matchFound = matcher.find(); //create boolean (True/False) variable 'matchFound', and assign it as matcher variable value. call find method on 'matchfound'. 
    // Find method checks to see if compile methods value  is found within the matcher methods value.

    if(matchFound) { //if a matchFound value == matcher value && a matcher value == pattern value,
      System.out.println("Match found");
    } else { //if not,
      System.out.println("Match not found");
    }

    //Using isAlive method from Thread class to avoid overwriting variables in Main class as thread runs. (Thread runs, isAlive() waits until Thread runs and updates to let Main run)
    Main thread = new Main(); //create 'thread' object in Main class
    thread.start(); //call 'start' method from 'Thread' class on 'thread' object in 'Main' class
    // Wait for the thread to finish
    while(thread.isAlive()) {
    System.out.println("Waiting...");
  }

  // Update amount and print its value
  System.out.println("Main: " + amount); //prints value of amount after thread runs
  amount++;
  System.out.println("Main: " + amount); // prints value of amount after main method increments in line above

  try {
    File myFile = new File("filename.txt");
    if (myFile.createNewFile()) {
      System.out.println("File created: " + myFile.getName()); // how to create a file
    } else {
      System.out.println("File already exists.");
    }
  } catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }

  // File myFile = new File("C:\\Users\\MyName\\filename.txt"); (create to directory)
  try {
    FileWriter myWriter = new FileWriter("filename.txt");
    myWriter.write("Files in Java might be tricky, but it is fun enough!");
    myWriter.close();
    System.out.println("Successfully wrote to the file.");
  } catch (IOException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }

  try {
    File myFile = new File("filename.txt");
    Scanner myReader = new Scanner(myFile);
    while (myReader.hasNextLine()) {
      String data = myReader.nextLine();
      System.out.println(data);
    }
    myReader.close();
  } catch (FileNotFoundException e) {
    System.out.println("An error occurred.");
    e.printStackTrace();
  }
  
  File myFile = new File("filename.txt");
    if (myFile.exists()) {
      System.out.println("File name: " + myFile.getName());
      System.out.println("Absolute path: " + myFile.getAbsolutePath());
      System.out.println("Writeable: " + myFile.canWrite());
      System.out.println("Readable " + myFile.canRead());
      System.out.println("File size in bytes " + myFile.length());
    } else {
      System.out.println("The file does not exist.");
    } 
    if (myFile.delete()) { 
      System.out.println("Deleted the file: " + myFile.getName());
    } else {
      System.out.println("Failed to delete the file.");
    }
  }

  public void run() {// 'run' is method in Thread class
    amount++; //increase 'Main' class variable 'amount' by 1 from the thread
  }
  }
  