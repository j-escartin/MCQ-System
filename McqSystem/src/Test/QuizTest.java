package Test;

import static org.junit.jupiter.api.Assertions.*;

import McqSystem.childrenClassess.ControlStructures;
import McqSystem.childrenClassess.JavaBasics;
import McqSystem.parent.Quiz;
import org.junit.jupiter.api.*;

/**
 * created by Acer on September 6, 2022
 **/

class QuizTest{

    Quiz quiz = new Quiz();

    @Test
    @DisplayName("Checking the Name")
    void nameCheck(){
        quiz.setName("James");
        assertEquals("James", quiz.getName());
    }

    @Test
    @DisplayName("Checking the Set Choices")
    void setQuizCheck(){
        quiz.setWantToAnswer("A");
        assertEquals("A", quiz.getWantToAnswer());
    }

    @Test
    @DisplayName("Testing Answer")
    void answerTesting(){
        quiz.setAnswer("A");
        assertEquals("A", quiz.getAnswer());
    }
}