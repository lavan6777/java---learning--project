import java.util.Scanner;

public class JavaLearningToolkit {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n===== JAVA LEARNING TOOLKIT =====");
            System.out.println("1. Check Even or Odd");
            System.out.println("2. Check Prime Number");
            System.out.println("3. Find Factorial");
            System.out.println("4. Reverse a Number");
            System.out.println("5. Check Palindrome Number");
            System.out.println("6. Calculate Array Sum and Average");
            System.out.println("7. String Operations");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int n = sc.nextInt();

                    if (n % 2 == 0) {
                        System.out.println("Even Number");
                    } else {
                        System.out.println("Odd Number");
                    }
                    break;

                case 2:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();

                    if (num < 2) {
                        System.out.println("Not a Prime Number");
                    } else {
                        boolean prime = true;

                        for (int i = 2; i <= num / i; i++) {
                            if (num % i == 0) {
                                prime = false;
                                break;
                            }
                        }

                        if (prime) {
                            System.out.println("Prime Number");
                        } else {
                            System.out.println("Not a Prime Number");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter a number (0-20): ");
                    int f = sc.nextInt();

                    if (f < 0 || f > 20) {
                        System.out.println("Enter a number between 0 and 20.");
                    } else {
                        long factorial = 1;

                        for (int i = 1; i <= f; i++) {
                            factorial = factorial * i;
                        }

                        System.out.println("Factorial = " + factorial);
                    }
                    break;

                case 4:
                    System.out.print("Enter a number: ");
                    int original = sc.nextInt();
                    int temp = original;
                    long reverse = 0;

                    while (temp != 0) {
                        int digit = temp % 10;
                        reverse = reverse * 10 + digit;
                        temp = temp / 10;
                    }

                    System.out.println("Reverse = " + reverse);
                    break;

                case 5:
                    System.out.print("Enter a number: ");
                    int value = sc.nextInt();
                    int copy = value;
                    long reversed = 0;

                    while (copy != 0) {
                        int digit = copy % 10;
                        reversed = reversed * 10 + digit;
                        copy = copy / 10;
                    }

                    if (value >= 0 && value == reversed) {
                        System.out.println("Palindrome Number");
                    } else {
                        System.out.println("Not a Palindrome Number");
                    }
                    break;

                case 6:
                    System.out.print("Enter array size: ");
                    int size = sc.nextInt();

                    if (size <= 0) {
                        System.out.println("Array size must be positive.");
                        break;
                    }

                    int[] arr = new int[size];
                    long sum = 0;

                    System.out.println("Enter array elements:");

                    for (int i = 0; i < size; i++) {
                        arr[i] = sc.nextInt();
                        sum += arr[i];
                    }

                    System.out.println("Sum = " + sum);
                    System.out.println("Average = " + (double) sum / size);
                    break;

                case 7:
                    sc.nextLine();

                    System.out.print("Enter a sentence: ");
                    String text = sc.nextLine();

                    System.out.println("Uppercase: " + text.toUpperCase());
                    System.out.println("Lowercase: " + text.toLowerCase());
                    System.out.println("Length: " + text.length());

                    String reversedText = new StringBuilder(text)
                            .reverse().toString();

                    System.out.println("Reversed: " + reversedText);
                    break;

                case 8:
                    System.out.println("Thank you for learning Java!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}
