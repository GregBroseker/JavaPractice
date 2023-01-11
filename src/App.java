public class App {//High level public class must match .java file name

  public static void testMethod() { //Write methods above main method
    System.out.println("Is it working?");
  }

  public static void nameMethod(String fname, String lname) {
    System.out.println(fname + lname);
   } 

    public static void main(String[] args) {// main method that accepts 2 parameters
    testMethod(); //Call testMethod above to print to screen. If you don't call the outside method from inside of the main method it doesn't run.
    nameMethod("Greg", " Broseker"); // call nameMethod and print name to screen.
    System.out.println("Hello World!");//print Hello World to console

      int time = 20;//declare variable as int data type
      if (time < 18) {//establish condition asking if time variable is less than 18
        System.out.println("Good day.");//if true prints Good day.
      } else {
        System.out.println("Good evening.");//else executes when false and prints Good evening instead.
      }
      System.out.println("New Commit");
      System.out.println("Desktop Commit");   
      System.out.println("ITS FINALLY WORKING MY COMPUTERS AND GITHUB ARE SYNCED");
      System.out.println("one last time"); //setting up git repositories

      for (int i = 0; i < 20; i++) {
        System.out.println("Nala is " + i + " years old in human years, and " + i * 7 + " in dog years!");  //Dog years loop
      }
      String[] simbaTreats = {"wolf bones", "pig ears", "rabbit\'s feet"};
      for (String i : simbaTreats) {
        System.out.println("Simba's favorite treats are: " + i); //for each loop through an array
      }
      int [][] numberGrid = { // 2 dimensional array. first square bracket is row identifier or array identifier when used with nested loop. 2nd Square bracket is for columns or individual element in each array when used with a nested loop
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {0}
      };
      for (int i = 0; i < numberGrid.length; i++) { // i is outer loop counter that counts how many arrays are in 2D array.
        for (int j = 0; j < numberGrid[i].length; j++) { //j loops completely before i loops again. this is how it counts each individual element in each array. and this is what makes i the array identifier and j the element within the array identifier.
          //(everytime j increments to the length of the array (numberGrid[i]), that its on, it resets to 0 and 1st loop (i) increases again.)
          System.out.print(numberGrid[i][j]);// i says which row (array) we're on, and j points to the element inside of said array.
        }
        System.out.println();//new cursor line after every completion of inner loop
      }
    }
  }