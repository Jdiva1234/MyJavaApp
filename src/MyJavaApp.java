import java.util.Scanner;
import java.util.Random;


public class MyJavaApp {
    public int doSomething(int n) {
        if(n > 15) {
            if(n > 30)
                return 30;
            else
                return 22;
        } else {
            if(n < 5)
                return 0;
            else
                return 10;
        }
    }
    public static void main( String[] args ) {

        MyJavaApp myApp = new MyJavaApp();
        System.out.println( myApp.doSomething(9));


        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int num1;
        int num2;
        String op;
        String question;
        String farewellMessage;
        int userAnswer;
        int correctAnswer;

        System.out.print("Please enter your name: ");
        String userName = scan.nextLine();

        String weclomeMessage = "Hello, " + userName + "! Welcome to the math quiz. You will be provided with 5 questions, and each carries one mark. Good luck!";
        System.out.println(weclomeMessage);

        // Make 5 questions.

        // Question 1
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = " + ";
        question = "What is " + num1 + op + num2 + " ?";
        System.out.println(question);
        // Input for Question 1
        System.out.print("Ans: ");
        userAnswer = scan.nextInt();
        // Compute correct answer for Question 1
        correctAnswer = num1 + num2;
        System.out.println("the correct answer is " + correctAnswer);


        // Question 2
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = " - ";
        question = "What is " + num1 + op + num2 + " ?";
        System.out.println(question);
        // Input for Question 2
        System.out.print("Ans: ");
        userAnswer = scan.nextInt();
        // Compute correct answer for Question 2
        correctAnswer = num1 - num2;
        System.out.println("the correct answer is " + correctAnswer);



        // Question 3
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = " / ";
        question = "What is " + num1 + op + num2 + " ?";
        System.out.println(question);
        // Input for Question 3
        System.out.print("Ans: ");
        userAnswer = scan.nextInt();
        // Compute correct answer for Question 3
        correctAnswer = num1 / num2;
        System.out.println("the correct answer is " + correctAnswer);



        // Question 4
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = " * ";
        question = "What is " + num1 + op + num2 + " ?";
        System.out.println(question);
        // Input for Question 4
        System.out.print("Ans: ");
        userAnswer = scan.nextInt();
        // Compute correct answer for Question 4
        correctAnswer = num1 * num2;
        System.out.println("the correct answer is " + correctAnswer);



        // Question 5
        num1 = random.nextInt(10) + 1;
        num2 = random.nextInt(10) + 1;
        op = " + ";
        question = "What is " + num1 + op + num2 + " ?";
        System.out.println(question);
        // Input for Question 5
        System.out.print("Ans: ");
        userAnswer = scan.nextInt();
        // Compute correct answer for Question 5
        correctAnswer = num1 + num2;
        System.out.println("the correct answer is " + correctAnswer);



        farewellMessage = "Thanks for taking the quiz, " + userName + ". You will get your result soon.";
        System.out.println(farewellMessage);

    }


}