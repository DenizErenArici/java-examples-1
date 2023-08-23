import java.util.Scanner;
import java.util.Random;
public class ExampleSolutions{
    public static void main(String[] args){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter a wanted question.");
        int questions = input.nextInt();
        if(questions<4 || questions>9){
            System.out.println("Invalid question number.");
        }
        switch (questions) {
            case 4:
                double width = 4.5;
                double height = 7.9;
                double area1 = width * height;
                System.out.println("Area of rectangle is" + area1);
                break;
            case 5:
                int sideLength = input.nextInt();
                double area2 = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);
                System.out.println("Area of hexagon is" + area2);
                break;
            case 6:
                System.out.println("Enter the distance");
                double distance = input.nextDouble();
                double gallonQuantity = distance / 25.5;
                double price = gallonQuantity * 3.55;
                double priceLira = price * 18.59;
                priceLira = (int) priceLira;
                System.out.println(priceLira);
                break;
            case 7:
                Random random = new Random();
                int die = (int) (1 + (Math.random() * ((6 - 1) + 1)));
                int Jake = random.nextInt(die);
                int Mike = random.nextInt(die);
                if (Jake == Mike) {
                    System.out.println("They are equal and " + Jake);
                } else {
                    System.out.println("Jake's number is:" + Jake);
                    System.out.println("Mike's number is:" + Mike);
                }
                break;
            case 8:
                System.out.println("Enter a number between -5 - 5");
                int number = input.nextInt();
                while (number < -5 || number > 5) {
                    System.out.println("Not in range.Please enter again");
                    number = input.nextInt();
                }
                if (number % 2 != 0 || number < 0) {
                    number = number * -1;
                    double rootNumber = Math.sqrt(number);
                    rootNumber = rootNumber * -1;
                    System.out.println(rootNumber);
                } else {
                    System.out.println(number);
                }
                break;
            case 9:
                int positives = 0;
                int negatives = 0;
                System.out.print("Please enter your number:");
                int number1 = input.nextInt();
                while (number1 != 0) {
                    if (number1 > 0) {
                        positives += number1;
                        if (number1 % 2 == 0) {
                            positives = positives / 2;
                        } else if (number1 % 2 != 0) {
                            positives = (positives * 3) + 1;
                        }
                    }
                    if (number1 < 0) {
                        negatives += number1;
                        if (number1 % 2 == 0) {
                            negatives = negatives * 2;
                        } else if (number1 % 2 != 0) {
                            negatives = (negatives / 3) - 1;
                        }
                    }

                    System.out.print("Please enter your number:");
                    number1 = input.nextInt();
                }
                if (number1 == 0) {
                    System.out.println(positives / negatives);
                }

        }
    }
}

