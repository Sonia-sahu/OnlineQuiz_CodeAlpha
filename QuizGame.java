import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Java Quiz Game!");

        int score = 0;
        int totalQuestions = 10; // Adjust the number of questions as needed

        // Question 1
        System.out.println("\nQuestion 1: Who invented Java Programming?");
        System.out.println("a) Guido van Rossum\nb) James Gosling\nc) Dennis Ritchie\nd) Bjarne Stroustrup");
        String answer1 = scanner.nextLine().trim().toLowerCase();

        if (answer1.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b)");
        }

        // Question 2
        System.out.println("\nQuestion 2: Which statement is true about Java?");
        System.out.println("a) Java is a sequence-dependent programming language\nb) Java is a code dependent programming language\nc) Java is a platform-dependent programming language\nd) Java is a platform independent programming language");
        String answer2 = scanner.nextLine().trim().toLowerCase();

        if (answer2.equals("d")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is d)");
        }

        // Question 3
        System.out.println("\nQuestion 3: How many continents are there?");
        System.out.println("a) 5\nb) 6\nc) 7\nd) 8");
        String answer3 = scanner.nextLine().trim().toLowerCase();

        if (answer3.equals("c")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is c) 7");
        }
        
        // Question 4
        System.out.println("\nQuestion 4: What is the capital of Spain?");
        System.out.println("a) Paris\nb) Madrid\nc) Rome\nd) Berlin");
        String answer4 = scanner.nextLine().trim().toLowerCase();

        if (answer4.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) Madrid");
        }
        
        // Question 5
        System.out.println("\nQuestion 5: What is the largest planet in our solar system?");
        System.out.println("a) Earth\nb) Jupiter\nc) Saturn\nd) Mars");
        String answer5 = scanner.nextLine().trim().toLowerCase();

        if (answer5.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) Jupiter");
        }
        
        // Question 6
        System.out.println("\nQuestion 6: Which country is famous for the Great Wall?");
        System.out.println("a) Japan\nb) China\nc) India\nd) Brazil");
        String answer6 = scanner.nextLine().trim().toLowerCase();

        if (answer6.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) China");
        }
        
        // Question 7
        System.out.println("\nQuestion 7: What is the chemical symbol for water?");
        System.out.println("a) O2\nb) CO2\nc) H2O\nd) H2SO4");
        String answer7 = scanner.nextLine().trim().toLowerCase();

        if (answer7.equals("c")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is c) H2O");
        }
        
        // Question 8
        System.out.println("\nQuestion 8: Who wrote the play 'Romeo and Juliet'?");
        System.out.println("a) William Shakespeare\nb) Charles Dickens\nc) Jane Austen\nd) Leo Tolstoy");
        String answer8 = scanner.nextLine().trim().toLowerCase();

        if (answer8.equals("a")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is a) William Shakespeare");
        }
        
        // Question 9
        System.out.println("\nQuestion 9: What is the largest mammal?");
        System.out.println("a) Elephant\nb) Blue Whale\nc) Lion\nd) Giraffe");
        String answer9 = scanner.nextLine().trim().toLowerCase();

        if (answer9.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) Blue Whale");
        }
        
        // Question 10
        System.out.println("\nQuestion 10: Who is known as the 'Father of Computers'?");
        System.out.println("a) Alan Turing\nb) Charles Babbage\nc) Bill Gates\nd) Steve Jobs");
        String answer10 = scanner.nextLine().trim().toLowerCase();

        if (answer10.equals("b")) {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is b) Charles Babbage");
        }

        // Display final score
        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + "/" + totalQuestions);

        scanner.close();
    }
}
