/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package favoritemovies;

/**
 *
 * @author DELL
 */
public class Rating {
    
    private String movieId;
    private String NameSurname;
    private String relation;
    private int rating;
   

    public Rating(String movieId, String NameSurname, String relation, int rating) {
        this.movieId = movieId;
        this.NameSurname = NameSurname;
        this.relation = relation;
        this.rating = rating;
        this.rating = 0;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getNameSurname() {
        return NameSurname;
    }

    public void setNameSurname(String NameSurname) {
        this.NameSurname = NameSurname;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
     
    
    
    
}
