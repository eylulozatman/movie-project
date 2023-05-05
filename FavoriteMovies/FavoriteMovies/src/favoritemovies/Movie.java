/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package favoritemovies;

import java.util.ArrayList;

/**
 *
 * @author erman
 */
public class Movie 
{
    private String movieId;
    private String title;
    private String year;
    private String lenght;
    private String genre;
    private String studioName;
    private String prodcerName;
    private String shortDescription;
    private double avgRating;
    private String  numWatched;
    private int numofrate;

    public int getNumofrate() {
        return numofrate;
    }

    public void setNumofrate(int numofrate) {
        this.numofrate = numofrate;
    }

    public int getStaradded() {
        return staradded;
    }

    public void setStaradded(int staradded) {
        this.staradded = staradded;
    }
    private int staradded;
    
    public Movie(ArrayList<String> info)
    {
        this.movieId = info.get(0);
        this.title = info.get(1);
        this.year = info.get(2);
        this.lenght = info.get(3);
        this.genre = info.get(4);
        this.studioName = info.get(5);
        this.prodcerName = info.get(6);
        this.shortDescription = info.get(7);
        this.numWatched = info.get(8);
        this.avgRating = getAvgRating();
        this.staradded = 0;
        this.numofrate = 0;
       
        
    }
    public Movie(double avgRating)
    {
        this.avgRating = 0;
    }
    

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public void setNumWatched(String numWatched) {
        this.numWatched = numWatched;
    }

    public String getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getLenght() {
        return lenght;
    }

    public String getGenre() {
        return genre;
    }

    public String getStudioName() {
        return studioName;
    }

    public String getProdcerName() {
        return prodcerName;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public String getNumWatched() {
        return numWatched;
    }

    

    
    
}
