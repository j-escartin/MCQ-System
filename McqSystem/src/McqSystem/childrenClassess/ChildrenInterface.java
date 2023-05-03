package McqSystem.childrenClassess;

/**
 * created by Acer on September 6, 2022
 **/
public interface ChildrenInterface {

    abstract public void storeCsv(); // Read CSV file through Buffered Reader

    abstract public void answerTime(); // For the User to answer the question

    abstract public String displayStatus(); // Return the final status or score of the user

    abstract public String percentageStatus(); // Return the final percentage of the user
}
