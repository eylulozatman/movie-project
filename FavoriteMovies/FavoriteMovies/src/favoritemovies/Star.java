/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package favoritemovies;

/**
 *
 * @author DELL
 */
public class Star 
{
    private String movieId;
    private String movieTitle;
    private String movieYear;
    private String nameSurname;
   
    
 

    public Star(String movieId, String movieTitle, String movieYear, String nameSurname) {
        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieYear = movieYear;
        this.nameSurname = nameSurname;
        
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String movieYear) {
        this.movieYear = movieYear;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
   
}
