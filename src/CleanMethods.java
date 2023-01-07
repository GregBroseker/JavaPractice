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
    public static void main(String[] args) {
        helloWorld();
        nameMethod("Greg", " Broseker"); //pass values to parameters to be used in nameMethod above
        timeMethod();
        nalaSimba();
        nested2DArrayLoop();
    }
}