
import java.util.Scanner;

public class QuestionsService {

    Question[] questions = new Question[10];
    String selection[] = new String[10];

    public QuestionsService() {
        questions[0] = new Question(1, "Why do Java programmers wear glasses?", "Because they don't C#", "Because they wear contacts", "To look smart", "Glasses are cool", "Because they don't C#");
        questions[1] = new Question(2, "What is the object-oriented way to become wealthy?", "Inheritance", "Polymorphism", "Encapsulation", "Abstraction", "Inheritance");
        questions[2] = new Question(3, "How many programmers does it take to change a lightbulb?", "None, it's a hardware problem", "One", "Two", "A whole team", "None, it's a hardware problem");
        questions[3] = new Question(4, "Why did the JavaScript developer walk out of the restaurant?", "The menu was unhandled", "They didn't like the environment", "They couldn't 'callback' the waiter", "The food was stale", "They couldn't 'callback' the waiter");
        questions[4] = new Question(5, "What is a python developer's favorite snake?", "The Anaconda", "The Cobra", "The Viper", "The Solid Snake", "The Anaconda");
        questions[5] = new Question(6, "Why do programmers prefer dark mode?", "Because light attracts bugs", "It saves battery", "It looks cool", "It helps them sleep", "Because light attracts bugs");
        questions[6] = new Question(7, "What is a programmer's favorite hangout place?", "The Foo Bar", "The Space Bar", "The Control Bar", "The Escape Bar", "The Foo Bar");
        questions[7] = new Question(8, "Why was the statement upset?", "It lost its semicolon", "It was false", "It was poorly formatted", "It had a syntax error", "It lost its semicolon");
        questions[8] = new Question(9, "What do you call a programmer from Finland?", "Nerdic", "Nokia", "Norse", "Linux", "Nerdic");
        questions[9] = new Question(10, "Why did the HTML file go to therapy?", "It had too many open tags", "It lacked style", "It was broken", "It felt deprecated", "It had too many open tags");

    }

    public void playQuiz() {

        int i = 0;

        for (Question q : questions) {
            System.out.println();

            System.out.println("Question no. : " + q.getQuestionId());
            System.out.println(q.getQuestion());
            System.out.println("Press 1 : " + q.getOpt1());
            System.out.println("Press 2 : " + q.getOpt2());
            System.out.println("Press 3 : " + q.getOpt3());
            System.out.println("Press 4 : " + q.getOpt4());
            System.out.println();

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your answer : ");
            selection[i] = sc.nextLine();

            i++;

        }
        printScore();

    }

    public void printScore() {
        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            Question que = questions[i];
            String actualAnswer = que.getAnswer();
            String userAnswerText = getUserAnswerText(que, selection[i]);

            if (actualAnswer.equals(userAnswerText)) {
                score++;
            }

        }
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("     Your Final Score is : " + score);
        System.out.println("----------------------------------");
        System.out.println();

        printMistakes(score, questions, selection);
    }

    private void printMistakes(int score, Question[] questions, String[] selection) {

        if (score != questions.length) {

            System.out.println();
            System.out.println("    Your mistakes         ");

            for (int i = 0; i < questions.length; i++) {
                String userAnswerText = getUserAnswerText(questions[i], selection[i]);
                if (!questions[i].getAnswer().equals(userAnswerText)) {

                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("You got mistake in que no. " + (i + 1));
                    System.out.println("Question : " + questions[i].getQuestion());
                    System.out.println("Your Answer : " + userAnswerText);
                    System.out.println("Correct Answer : " + questions[i].getAnswer());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println();

                }
            }
        } else {
            System.out.println("You got all the answers correct");
            System.out.println("Congratulations Yohooooo! ");
        }

    }

    private String getUserAnswerText(Question que, String userChoice) {
        if (userChoice == null) {
            return "";
        }
        switch (userChoice) {
            case "1":
                return que.getOpt1();
            case "2":
                return que.getOpt2();
            case "3":
                return que.getOpt3();
            case "4":
                return que.getOpt4();
            default:
                return userChoice;
        }
    }

}
