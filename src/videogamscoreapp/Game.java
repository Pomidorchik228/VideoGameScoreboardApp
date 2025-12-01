/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package videogamscoreapp;

/**
 *
 * @author 2533063
 */
public class Game {
    private int id;
    private String title;
    private String genre;
    private String publisher;
    
    public Game(){
        this.id = 0;
        this.genre = "";
        this.title = "";
        this.publisher = "";
    }
    public Game(int id, String genre, String title, String pub){
        this.id = id;
        this.genre = genre;
        this.title = title;
        this.publisher = pub;
    }
    
    public int getId(){
        return this.id;
    }
    public String getTitle(){
        return this.title;
    }
    public String getGenre(){
        return this.genre;
    }
    public String getPublisher(){
        return this.publisher;
    }
    
    public void setId(int id){
         this.id = id;
    }
    public void setTitle(String tit){
         this.title = tit;
    }
    public void setGenre(String gen){
         this.genre = gen;
    }
    public void setPublisher(String pub){
         this.publisher = pub;
    }
    
    
    public static String toDataLine(Game g){
        String str = "";
        str+= g.getId()+","+g.getTitle()+","+g.getGenre()+","+g.getPublisher();
        return str;
    }
    
    public static Game fromDataLine(String line){
        Game x;
        String[] parts = line.split(",");
        x = new Game(Integer.parseInt(parts[0]), parts[1], parts[2], parts[3]);
        return x;
    }
    public String toString(){
        String result = "";
        result = String.format("%5d - %20s %20s %20s", this.getId(), this.getTitle(), this.getGenre(), this.getPublisher());
        return result;
    }
    public boolean equals(Game paramObject){
        boolean result = false;
        result = paramObject.getTitle().equalsIgnoreCase(this.getTitle())&&
                paramObject.getGenre().equalsIgnoreCase(this.getGenre())&&
                paramObject.getPublisher().equalsIgnoreCase(this.getPublisher());
        return result;
    }
}
