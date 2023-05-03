package McqSystem.parent;

/**
 * created by Acer on September 5, 2022
 **/
public interface QuizInterface {

    public void setName(String name); // for the user to input an answer

    public String getName(); // for the system to get the answer of the user

    public void setWantToAnswer(String wantToAnswer); // user choosing between the set of Multiple choice question

    public String getWantToAnswer(); // system getting the chosen set of Multiple choice question of the user

    public void setAnswer(String answer); // The user input his or her answer to the console

    public String getAnswer(); // Get the answer of the user

}