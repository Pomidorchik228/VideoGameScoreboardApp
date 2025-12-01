/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videogamscoreapp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 2533063 Kirill Savin
 */
public class ScoreBoard {
    private final int MAX_STUDENTS = 100;
    private int studentCount;
    private Game[] games;
    private Student[] students;
    
    // inner class
    class Stats{
        public int min;
        public int max;
        public double avg;
    }
    
    public ScoreBoard(){
        this.studentCount = 20;
        this.games = new Game[10];
        this.students = new Student[this.MAX_STUDENTS];
    }
    public ScoreBoard(int sc, Game[] g, Student[] s){
        this.studentCount = sc;
        this.games = new Game[10];
        for (int i =0; i<g.length; i++){
            this.games[i] = g[i];
        }
        this.students = new Student[this.MAX_STUDENTS];
        for (int i =0; i<s.length; i++){
            this.students[i] = s[i];
        }
    }
    
    public void setGames(Game[] g){
        for (int i =0; i<g.length; i++){
            this.games[i] = g[i];
        }
    }
    public void setStudents(Student[] s){
        for (int i =0; i<s.length; i++){
            this.students[i] = s[i];
        }
    }
    public void setStudentCount(int sc){
        this.studentCount = sc;
    }
    
    public void loadGames(String filename) throws FileNotFoundException{
        File fileObj = new File(filename);
        Scanner s = new Scanner(fileObj);
        int count = 0;
        while (s.hasNext()&&count<this.games.length){
            String line = s.nextLine();
            this.games[count] = Game.fromDataLine(line);
            count++;
        }
        s.close();
    }
    public void loadScores(String filename) throws FileNotFoundException{
        File fileObj = new File(filename);
        Scanner s = new Scanner(fileObj);
        int c = 0;
        while (s.hasNext()){
            String line = s.nextLine();
            this.students[c] = Student.fromDataLine(line);
            c++;
        }
        this.studentCount = c;
        s.close();
    }
    
    public void saveGames(String filename) throws IOException{
        PrintWriter pw = new PrintWriter(filename);
        for (int i = 0; i<this.games.length; i++){
            pw.println(this.games[i]);
        }
        pw.close();
    }
    public void saveScores(String filename) throws IOException{
        PrintWriter pw = new PrintWriter(filename);
        for (int i = 0; i<this.students.length; i++){
            pw.println(this.students[i]);
        }
        pw.close();
    }
    public void listGames(){
        for (Game g : this.games){
            System.out.println(g);
        }
    }
    public void listStudents(){
        for (int i=0; i<=this.studentCount; i++){
            Student g = this.students[i];
            System.out.println(g);
        }
    }
    public Student findStudentById(String id){
        Student s = null;
        for(int i=0; i<this.studentCount; i++){
            Student stest = this.students[i];
            if (id.equals(stest.getId())){
                s = stest;
                break;
            }
        }
        
        return s;
    }
    
    public int findGameByIndex(int index){
        int s = -1;
        for(int i=0; i<this.studentCount; i++){
            Game stest = this.games[i];
            if (index == stest.getId()){
                s = i;
                break;
            }
        }
        
        return s;
    }
    public void updateScore(String studentId, int gameId, int newScore){
        Student foundStudent = this.findStudentById(studentId);
        if (foundStudent == null)
            System.out.println("Student with that id was not found");
        else{
            int[] scores = foundStudent.getScores();
            scores[gameId] = newScore;
        }
    }
    
    public Stats computeStatsForGame(int gameIndex){
        Stats stats;
        for(int i=0; i<this.studentCount; i++){
            Student s = this.students[i];
            int[] allHisScores = s.getScores();
            int score = allHisScores[gameIndex];
        }
        
        
        return stats;
    }
}
