import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the Batting Average Calculator! ");

        //Ask user to enter number of times at bat
        System.out.println("Enter number of times at bat: ");

        //get user input - number of times at bat (at-bats)
        int atBats = scan.nextInt();

        //ask user for the number of bases earned
        System.out.println("Enter number of bases earned the 1st time at bat: ");
        double[] atBatsArray = new double[atBats];



        //get user input - number of bases earned
        for (int i = 0; i < atBats; i++) {
            atBatsArray[i] = scan.nextInt();
            System.out.println("Result for the 2nd time at bat");
            scan.nextInt();
            System.out.println("Result for the 3rd time at bat");
            scan.nextInt();
            System.out.println("Result for the 4th time at bat");
            scan.nextInt();
            System.out.println("Result for the 5th time at bat");
        }

        //stub out: implement method and insert code

        //Display batting average - create a method - to create a variable you need datatype - calculate avg
        double batAvg = calculateBatAverage(atBatsArray);          //Calling the method
        System.out.printf("batting average is: %.3f", batAvg);

        //Display slugging percentage
        double slugPercent = calculateSlugPercent(atBatsArray);
        System.out.println("slugging percentage is " + slugPercent);

    }

    /*
    //This method calculates the slug percent. Slugging percentage is the total
    //Slugging percentage is the total number of bases
    //divided by the total number of at-bats.
     */
    public static double calculateSlugPercent(double[] atBatsArray) {
        double total = 0;
        for (int i = 0; i < atBatsArray.length; i++) {
            if (atBatsArray[i] > 0) {
                double bases = +i;
                total = bases / atBatsArray.length;
            }   return total;
        } return 0.0;
    }

    /*
    //This method calculates batting avg.
    //Batting average is total number of at-bats for which the
    //player earned at least one base
    //divided by the total numbers at-bats.
     */
    public static double calculateBatAverage(double[] atBatsArray) {
        double total = 0;
        for (int i = 0; i < atBatsArray.length; i++) {
            if (atBatsArray[i] > 0) {
                double sum = +i;
                total = sum / atBatsArray.length;
                return total;

            }

        }return total;
    }
}