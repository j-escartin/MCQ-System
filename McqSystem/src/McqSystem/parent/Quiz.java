package McqSystem.parent;

import java.util.Scanner;

/**
 * created by Acer on September 5, 2022
 **/

public class Quiz implements QuizInterface {
    private static String Name;
    private static String WantToAnswer;
    private String Answer;

    private Scanner input = new Scanner(System.in);

    public void Quiz(){
        settingName();
        choosingSet();
    }

    private void settingName(){
        System.out.print("Please Enter your Name: ");
        String name = input.next();
        this.setName(name);
    }

    private void choosingSet(){
        System.out.println("\nPlease Enter your choice of set: \nA. Java Basics \nB. Control Structures");
        String choiceToAnswer = input.next();
        try{
            if(choiceToAnswer.equals("A") || choiceToAnswer.equals("B")){
                this.setWantToAnswer(choiceToAnswer);
            } else if (choiceToAnswer.equals("A.") || choiceToAnswer.equals("B.")) {
                System.out.println("No period please!");
                choosingSet();
            } else {
                System.out.println("Invalid choice!");
                choosingSet();
            }
        } catch (Exception e){
            System.out.println("Invalid choice!");
            choosingSet();
        }
    }

    @Override
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String getWantToAnswer() {
        return WantToAnswer;
    }

    public void setWantToAnswer(String wantToAnswer) {
        WantToAnswer = wantToAnswer;
    }

    @Override
    public String getAnswer() {
        return Answer;
    }

    @Override
    public void setAnswer(String answer) {
        Answer = answer;
    }

}
