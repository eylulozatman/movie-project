/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package favoritemovies;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class fileReader 
{
     private static final String USERNAME_PATH = "C:\\Users\\DELL\\Masaüstü\\usernames.txt";
     private static final String MOVIES_PATH = "C:\\Users\\DELL\\Masaüstü\\\\movies.txt";
     private static final String STARS_PATH = "C:\\Users\\DELL\\Masaüstü\\\\stars.txt";
      private static final String RATINGS_PATH = "C:\\Users\\DELL\\Masaüstü\\ratings.txt";
   
    public ArrayList<String> load_usernames() {
        ArrayList<String> usernames = new ArrayList<>();
      
        java.io.File file = new java.io.File(USERNAME_PATH);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                usernames.add(line);
            }
            scanner.close();
          
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return usernames;
    }
    
     public ArrayList<String> load_movies()  // read every line and push them in an array
     {
         
        ArrayList<String> listOfLines = null;
        try (BufferedReader bufReader = new BufferedReader(new FileReader(MOVIES_PATH))) {
            listOfLines = new ArrayList<>();
            String line = bufReader.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = bufReader.readLine();
            }
        } catch (Exception ex) {
            Logger.getLogger(fileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listOfLines;
    }
      
     public ArrayList<Movie> load_allmovies() // read lines one by one, split each line into wordspush them in an array.
                                               //Each information line is our movie's parameter.
    {
         
       ArrayList<Movie>all_movies = new ArrayList();
      try {
           
            ArrayList<String> fLine = load_movies();
            
            for (String str : fLine) {
                String[] f = str.split(" ");
                List<String> movieInfo = new ArrayList<>();
                Collections.addAll(movieInfo, f);
                Movie m = new Movie((ArrayList<String>) movieInfo);
                all_movies.add(m);
               
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(funcScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        return all_movies;
    }
   
    
   public void writeMovies(String movies)
    {    
        File file = new File(MOVIES_PATH);
        try
        {
            if(!file.exists())
            {
                file.createNewFile();
            }
            Files.write(Paths.get(MOVIES_PATH), (movies.getBytes()), StandardOpenOption.APPEND);
            
        }
        catch (IOException ex) {
                Logger.getLogger(fileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
   
   public ArrayList<String> load_stars() {
        ArrayList<String> stars = new ArrayList<>();
      
        java.io.File file = new java.io.File(STARS_PATH);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                stars.add(line);
            }
            scanner.close();
          
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return stars;
    }
   
     public ArrayList<Star> load_allstars() // read lines one by one, split each line into wordspush them in an array.
                                               //Each information line is our movie's parameter.
    {
         
       ArrayList<Star> all_stars = new ArrayList();
      try {
           //  all_movies = new ArrayList();
            ArrayList<String> fLine = load_stars();
            
            for (String str : fLine) {
                String[] f = str.split(" ");
                List<String> starInfo = new ArrayList<>();
                Collections.addAll(starInfo, f);
                Star s = new Star(starInfo.get(0),starInfo.get(1),starInfo.get(2),starInfo.get(3));
                all_stars.add(s);
               
            }
            
            
        } catch (Exception ex) {
            Logger.getLogger(funcScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
     
        return all_stars;
    }
   
   
   
   public void writeStars(String star)
    {    
        File file = new File(STARS_PATH);
        try
        {
            if(!file.exists())
            {
                file.createNewFile();
            }
            Files.write(Paths.get(STARS_PATH), (star.getBytes()), StandardOpenOption.APPEND);
            
        }
        catch (IOException ex) {
                Logger.getLogger(fileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
    /*public ArrayList<Rating> load_ratings() {
        ArrayList<Rating> ratings = new ArrayList<>();
      
        java.io.File file = new java.io.File(RATINGS_PATH);
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                ratings.add(line);
            }
            scanner.close();
          
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
        return ratings;
    }
   */
   
   
   
   public void writeRatings(String rating)
    {    
        File file = new File(RATINGS_PATH);
        try
        {
            if(!file.exists())
            {
                file.createNewFile();
            }
            Files.write(Paths.get(RATINGS_PATH), (rating.getBytes()), StandardOpenOption.APPEND);
            
        }
        catch (IOException ex) {
                Logger.getLogger(fileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
   
    public static void clearFiles() throws FileNotFoundException 
 {     
       
     try (PrintWriter writer = new PrintWriter(MOVIES_PATH)) {
         writer. print("");
     }
           
     try (PrintWriter writer1 = new PrintWriter(STARS_PATH)) {
         writer1. print("");
     }
                   
     try (PrintWriter writer2 = new PrintWriter(RATINGS_PATH)) {
         writer2. print("");
     }
           
 }

   
   
   
  
   
 
}

   
   
    

