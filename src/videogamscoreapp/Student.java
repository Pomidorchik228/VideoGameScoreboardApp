/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videogamscoreapp;

/**
 *
 * @author 2533063
 */
public class Student {
    private String id;
    private String name;
    private int[] scores;
    
    public Student(){
        this.id = "";
        this.name = "";
        this.scores = new int[10];
        for(int i=0;i<scores.length;i++)
            scores[i] = 0;
    }
    public Student(String id, String name, int[] sc){
        this.id = id;
        this.name = name;
        this.scores = new int[10];
        for(int i=0;i<scores.length;i++)
            scores[i] = sc[i];
    }
    
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int[] getScores(){
        return this.scores;
    }
    
    public void setId(String id){
        this.id = id;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setScores(int[] array){
        this.scores = array;
    }
    
    public int getTotal(){
        int total = 0;
        for (int i = 0; i<this.getScores().length; i++){
            total += this.getScores()[i];
        }
        return total;
    }
    
    public double getAverage(){
        double avg;
        avg = 1.0*this.getTotal() / this.getScores().length;
        return avg;
    }
    
    public static String toDataLine(Student ts){
        String line = "";
        line += ts.getId()+" , "+ts.getName();
        for (int i=0; i<ts.getScores().length; i++)
            line += String.format(" , %d", ts.getScores()[i]);
        return line;
    }
    
    public static Student fromDataLine(String line){
        Student x;
        int[] array = new int[10];
        String[] parts = line.split(" , ");
        for (int i=0; i<array.length; i++){
            array[i] = Integer.parseInt(parts[i+2]);
        }
        x = new Student(parts[0], parts[1], array);
        return x;
    }
    
    public String toString(){
        String result = "";
        result += this.getId()+" - "+ this.getName()+", Scores:";
        for (int i=0; i<this.getScores().length; i++){
            if (i<this.getScores().length-1)
                result += " "+this.getScores()[i]+",";
            else
                result += " "+this.getScores()[i];
        }
        return result;
    }
    
    public boolean equals(Student st){
        boolean b = true;
        b = st.getId().equalsIgnoreCase(this.getId())&&
                st.getName().equalsIgnoreCase(this.getName());
        for(int i=0;i<st.getScores().length; i++){
            if(st.getScores()[i]!=this.getScores()[i]){
                b = false;
                break;
            }
        }
        return b;
    }
}
