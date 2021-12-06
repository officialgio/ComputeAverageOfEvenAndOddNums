public class AddNumbers {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int sumOdd = 0, countOdd = 0, sumEven = 0, countEven = 0;
      int intValue;
    
    while (true) { // infinite loop
    System.out.print("Enter a positive integer, 0 to exit: ");
    intValue = input.nextInt();

        if (intValue > 0) {
          if (intValue % 2 == 0) { sumEven += intValue; countEven++; } // entered even number
          else {sumOdd += intValue; countOdd++; } // entered odd number
        }
        else if (intValue < 0) {
          System.out.println("Invalid input. Try again. ");
        }
        else {
           break; // terminate the loops containing the break keyword
        }
      }
      System.out.println("The sum of the " + countEven + " entered positive even integers is " + sumEven);
      System.out.println("The sum of the " + countOdd + " entered positive odd integers is " + sumOdd);
    }
}
