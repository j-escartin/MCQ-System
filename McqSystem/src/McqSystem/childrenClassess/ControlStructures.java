package McqSystem.childrenClassess;

import McqSystem.parent.Quiz;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * created by Acer on September 5, 2022
 **/
public class ControlStructures extends Quiz implements ChildrenInterface{

    private Scanner input = new Scanner(System.in);
    private String path = "D:\\2022 Files\\College\\Module 2\\Assessment\\BDSE13-PFS-0622_JamesVincentEscartin" +
            "\\BDSE13-PFS-James_Vincent_Escartin_SC\\ControlStructures\\ControlStructures.csv";
    private String[][] twoDimenValues = new String[11][11];
    private static int i =0;
    private static int correctAnswer=0;
    private static int a = 1;

    public void ControlStructures(){
        if (getWantToAnswer().equals("B")){
            System.out.println("\nYou have chosen Java Basics!");
            storeCsv();
            answerTime();
            System.out.println(displayStatus());
            System.out.println(percentageStatus());
        }
    }

    public void storeCsv(){
        try{
            File myCsv = new File(path);
            Scanner myReader = new Scanner(myCsv);

            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                String[] storeData = data.split(",");

                for(int j=0; j<storeData.length;j++){
                    this.twoDimenValues[i][j] = storeData[j];
                }
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File can't be found");
            e.printStackTrace();
        }
    }

    public void answerTime() {
        for (; a < twoDimenValues.length; a++) {
            System.out.println(a + ". " + twoDimenValues[a][1]);
            System.out.println("A. " + twoDimenValues[a][2] + "\nB. " + twoDimenValues[a][3] + "\nC. "
                    + twoDimenValues[a][4] + "\nD. " + twoDimenValues[a][5]);
            try {
                String answerChosen = input.nextLine();
                setAnswer(answerChosen);
                if (getAnswer().equals("A") || getAnswer().equals("B") || getAnswer().equals("C") || getAnswer().equals("D")) {
                    if (getAnswer().equals(twoDimenValues[a][6])) {
                        correctAnswer++;
                        System.out.println("You're answer is correct, Hooray!\n");
                    } else {
                        System.out.println("Wrong Answer. The correct answer is " + twoDimenValues[a][6] + ". " + twoDimenValues[a][7] + "\n");
                    }
                } else if (getAnswer().equals("A.") || getAnswer().equals("B.") || getAnswer().equals("C.") || getAnswer().equals("D.")) {
                    System.out.println("No Period Please!\n");
                    a--;
                } else if (getAnswer().equals("a") || getAnswer().equals("b") || getAnswer().equals("c") || getAnswer().equals("d")) {
                    System.out.println("Capital Only\n");
                    a--;
                }else if (getAnswer().equals("a.") || getAnswer().equals("b.") || getAnswer().equals("c.") || getAnswer().equals("d.")) {
                    System.out.println("Capital and No Period Only\n");
                    a--;
                }  else {
                    System.out.println("Invalid Answer! Choose the Letter of the correct Answer!\n");
                    a--;
                }
            } catch (Exception e) {
                System.out.println("Invalid Answer! Choose the Letter of the correct Answer!\n");
            }
        }
    }

    @Override
    public String displayStatus() {
        return this.getName() + ", you answered " + correctAnswer + " Questions Right, "
                + (10-correctAnswer) + " Questions Wrong for a total of 10 Questions.";
    }

    @Override
    public String percentageStatus() {
        int percent = correctAnswer*10;
        return "You scored " + percent + "%";
    }
}
