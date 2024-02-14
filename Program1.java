class Program1 extends ConsoleProgram {

  /**
  * A program that takes two sides of a right-angle triangle from the user 
  * and calculates the hypotenuse
  * @author: P. Yip
  */
  
  public void run() {
    // Declare variables
    double dblSideA;
    double dblSideB;
    double dblHypotenuse; 
    
    // Get lengths of side A and side B frmo user 
    dblSideA = readDouble("Enter the length of Side A: ");
    dblSideB = readDouble("Enter the length of Side B: ");

    // Calculate Hypotenuse: c = sqrt (a^2 + b ^2)
    dblHypotenuse = Math.sqrt(Math.pow(dblSideA, 2) + Math.pow(dblSideB, 2));

    //Output results
    System.out.println("The hypotenuseof this right-angle triangle is " + dblHypotenuse);
  }
}
