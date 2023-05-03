package McqSystem.parent;

import McqSystem.childrenClassess.ControlStructures;
import McqSystem.childrenClassess.JavaBasics;

/**
 * created by Acer on September 5, 2022
 **/
public class McqSystem {
    public static void main(String[] args){

        System.out.println("\nWelcome to MCQ System\n");

        Quiz quiz = new Quiz();
        quiz.Quiz();

        JavaBasics javaBasics = new JavaBasics();
        javaBasics.JavaBasics();

        ControlStructures controlStructures = new ControlStructures();
        controlStructures.ControlStructures();

    }
}
