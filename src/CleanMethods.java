public class CleanMethods { // Main Class name must match file name

    public static void helloWorld() { //Write methods to be called above main method
        System.out.println("Hello World!"); 
    }

    public static void nameMethod(String fname, String lname) {//A method that accepts two parameters, fname and lname
        System.out.println("My name is: " + fname + lname);
    } 

   public static void timeMethod() { //Method showing conditionals, user input coming later
    int time = 7;
        if (time < 10) {
            System.out.println("Good Morning!");
        }
        else if (time > 10 && time < 15) {
            System.out.println("Good Afternoon");
        }
        else {
            System.out.println("Good Night!");
        }
    }

    public static void nalaSimba() {
        for (int i = 0; i < 20; i++) {
            System.out.println("Nala is " + i + " years old in human years, and " + i * 7 + " in dog years!");  //Dog years loop
          }
            String[] simbaTreats = {"wolf bones", "pig ears", "rabbit\'s feet"};
        for (String i : simbaTreats) {
            System.out.println("Simba's favorite treats are: " + i); //for each loop through an array
          }
        } 

    public static void nested2DArrayLoop() {
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

    public static int simpleMath(int x) {
        return x * 2;
    }

    static int plusMethod(int x, int y) { //Method Overloading to be able to add together different data types.
        return x + y;
      }     
    static double plusMethod(double x, double y) {//Can use same method name if declared with different data types.
        return x + y;
      }

    public static int sum(int k) { // Method that adds all numbers within a range through the 'k' variables value
        if (k> 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
    public static int sum2(int start, int end) { //Method that adds together all numbers between a range
        if (end > start) {
            return end + sum2(start, end - 1);
        } else {
            return end;
        }
    }

    public void fullThrottle() {
      System.out.println("The car is going as fast as it can!");
    }
  
    // Create a speed() method and add a parameter
    public void speed(int maxSpeed) {
      System.out.println("Max speed is: " + maxSpeed);
    } 

    public static void main(String[] args) {
        helloWorld();
        nameMethod("Greg", " Broseker"); //pass values to parameters to be used in nameMethod above
        timeMethod();
        nalaSimba();
        nested2DArrayLoop(); //Method that creates a number matrix and iterates through it with a loop within a loop (nested loop)
        int z = simpleMath(28);// create z variable to store value of simpleMath method
        System.out.println("Twice your income is: $" + z);// print z to screen which will carry simpleMath method result as value
        int num1 = plusMethod(24, 6);
        double num2 = plusMethod(6.7, 14.9);
        System.out.println(num1 * num2);//can do math on different data types and log to console but java will not let you create a new variable that has a value resulting from arithmetic between num1 and num2
        int result = sum(10); //assign which number range you want to add together in sum() method
        System.out.println(result);// print sum method result to window
        int result2 = sum2(1, 5);
        System.out.println(result2); 
        CleanMethods myCar = new CleanMethods(); 
        myCar.fullThrottle();      // Call the fullThrottle() method
        myCar.speed(200);
    }
}