/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package videogamscoreapp;

import java.io.FileNotFoundException;

/**
 *
 * @author 2533063 Kirill Savin
 */
public class VideoGamScoreApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        ScoreBoard sb = new ScoreBoard();
        sb.loadScores("C:\\Users\\2533063\\OneDrive - Champlain Regional College\\Documents\\NetBeansProjects\\VideoGamScoreApp\\src\\videogamscoreapp\\scores.txt");
//        while(true){
//            ScoreBoard score = new ScoreBoard();
//            int choice = -1;
//            Student std = Student.fromDataLine("S200 , Chad Thundercock , 120 , 95 , 88 , 77 , 130 , 90 , 100 , 85 , 93 , 110");
//            System.out.println(std.toString());
//            do{
//                printMenu();
//                choice = Utilities.getUserChoice("Enter your choice: ");
//            } while(choice>8 || choice<0);
//
//            switch (choice){
//                case(0):
//                    System.exit(0);
//                    break;
//                case(1):
//                    handleListGames();
//                    break;
//                case(2):
//                    handleListStudents();
//                    break;
//                case(3):
//                    handleStudentReport();
//                    break;
//                case(4):
//                    handleTopNforAgame();
//                    break;
//                case(5):
//                    handleUpdateStudentScore();
//                    break;
//                case(6):
//                    handleGameStats();
//                    break;
//                case(7):
//                    handleAddNewStudent();
//                    break;
//                case(8):
//                    handeSaveData();
//                    break;
//            }
//        }
//    }
//    
    
//    public static void printMenu(){
//        System.out.println("""
//                           ==== Video Game Scoreboard ====
//                           1) List games
//                           2) List students
//                           3) Show a student's report
//                           4) Show top N for a game
//                           5) Update a student's score
//                           6) Game stats (min/max/avg)
//                           7) Add a new student
//                           8) Save data
//                           0) Exit
//                           """);
//    }
//    
//    public static void handleListGames(ScoreBoard sc){
//        System.out.println("Handling your choice...");
//        sc.listGames();
//    }
//    public static void handleListStudents(){
//        System.out.println("Handling your choice...");
//    }
//    public static void handleStudentReport(){
//        System.out.println("Handling your choice...");
//    }
//    public static void handleTopNforAgame(){
//        System.out.println("Handling your choice...");
//    }
//    public static void handleUpdateStudentScore(){
//        System.out.println("Handling your choice...");
//    }
//    public static void handleGameStats(){
//        System.out.println("Handling your choice...");
//    }
//    public static void handleAddNewStudent(){
//        System.out.println("Handling your choice...");
//    }
//    public static void handeSaveData(){
//        System.out.println("Handling your choice...");
    }
}
