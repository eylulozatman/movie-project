/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package favoritemovies;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author erman
 */
public class addMovie extends javax.swing.JFrame {

    
    
     
             
   ArrayList<Movie>all_movies;
    fileReader fr;
    
    public addMovie( ArrayList<Movie> all_movies ) 
    {
            fr = new fileReader();
            this.all_movies = all_movies;
           initComponents();
    }
    
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        titletxt = new javax.swing.JTextField();
        yeartxt = new javax.swing.JTextField();
        lenghttxt = new javax.swing.JTextField();
        genretxt = new javax.swing.JTextField();
        studiotxt = new javax.swing.JTextField();
        protxt = new javax.swing.JTextField();
        shorttxt = new javax.swing.JTextField();
        nowtxt = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("add movie");
        setBackground(new java.awt.Color(153, 153, 153));
        setBounds(new java.awt.Rectangle(400, 300, 344, 456));
        setLocation(new java.awt.Point(50, 20));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        jLabel1.setBackground(new java.awt.Color(102, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 255));
        jLabel1.setText("movie title");

        jLabel2.setBackground(new java.awt.Color(102, 51, 255));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 255));
        jLabel2.setText("year");

        jLabel3.setBackground(new java.awt.Color(102, 51, 255));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 255));
        jLabel3.setText("lenght(min)");

        jLabel4.setBackground(new java.awt.Color(102, 51, 255));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 255));
        jLabel4.setText("genre");

        jLabel5.setBackground(new java.awt.Color(102, 51, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("studio name");

        jLabel6.setBackground(new java.awt.Color(102, 51, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("producer name");

        jLabel7.setBackground(new java.awt.Color(102, 51, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 255));
        jLabel7.setText("short description");

        jLabel8.setBackground(new java.awt.Color(102, 51, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 255));
        jLabel8.setText("number of watched");

        titletxt.setBackground(new java.awt.Color(204, 204, 255));
        titletxt.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        titletxt.setMinimumSize(new java.awt.Dimension(90, 29));
        titletxt.setPreferredSize(new java.awt.Dimension(200, 30));

        yeartxt.setBackground(new java.awt.Color(204, 204, 255));
        yeartxt.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        yeartxt.setMinimumSize(new java.awt.Dimension(90, 29));
        yeartxt.setPreferredSize(new java.awt.Dimension(200, 30));

        lenghttxt.setBackground(new java.awt.Color(204, 204, 255));
        lenghttxt.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        lenghttxt.setMinimumSize(new java.awt.Dimension(90, 29));
        lenghttxt.setPreferredSize(new java.awt.Dimension(200, 30));

        genretxt.setBackground(new java.awt.Color(204, 204, 255));
        genretxt.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        genretxt.setMinimumSize(new java.awt.Dimension(90, 29));
        genretxt.setPreferredSize(new java.awt.Dimension(200, 30));

        studiotxt.setBackground(new java.awt.Color(204, 204, 255));
        studiotxt.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        studiotxt.setMinimumSize(new java.awt.Dimension(90, 29));
        studiotxt.setPreferredSize(new java.awt.Dimension(200, 30));

        protxt.setBackground(new java.awt.Color(204, 204, 255));
        protxt.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        protxt.setMinimumSize(new java.awt.Dimension(90, 29));
        protxt.setPreferredSize(new java.awt.Dimension(200, 30));

        shorttxt.setBackground(new java.awt.Color(204, 204, 255));
        shorttxt.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        shorttxt.setMinimumSize(new java.awt.Dimension(90, 29));
        shorttxt.setPreferredSize(new java.awt.Dimension(200, 30));

        nowtxt.setBackground(new java.awt.Color(204, 204, 255));
        nowtxt.setFont(new java.awt.Font("Sitka Text", 0, 18)); // NOI18N
        nowtxt.setMinimumSize(new java.awt.Dimension(90, 29));
        nowtxt.setPreferredSize(new java.awt.Dimension(200, 30));

        addbutton.setBackground(new java.awt.Color(204, 204, 255));
        addbutton.setFont(new java.awt.Font("Tw Cen MT", 1, 12)); // NOI18N
        addbutton.setForeground(new java.awt.Color(102, 102, 255));
        addbutton.setText("add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(shorttxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                            .addComponent(yeartxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                            .addComponent(lenghttxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(genretxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(studiotxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titletxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(protxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nowtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(titletxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(yeartxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lenghttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(genretxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(studiotxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(protxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shorttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nowtxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(addbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
       
       
        ArrayList<String> movie_info = new ArrayList<>();
       
        String id;
        if(all_movies.isEmpty())
        {
              id = "1";
        }
        else
        {
           
            id = Integer.toString((all_movies.size())+1);
        }
       
            movie_info.add(id);
            movie_info.add(titletxt.getText());
            movie_info.add(yeartxt.getText());
            movie_info.add(lenghttxt.getText());
            movie_info.add(genretxt.getText());
            movie_info.add(studiotxt.getText());
            movie_info.add(protxt.getText());
            movie_info.add(shorttxt.getText());
            movie_info.add(nowtxt.getText());
       
          if(!all_movies.isEmpty()) 
          {
               for(int i = 0; i < all_movies.size(); i++)
               {   
                 
                   if( all_movies.get(i).getTitle().equals(movie_info.get(1)) && all_movies.get(i).getYear().equals(movie_info.get(2)))
                   {
                       JOptionPane.showMessageDialog(this, "this movie already in the list");
                       break;
                   }
                   else{
                          Movie mv = new Movie(movie_info);

                          String moviestr =  mv.getMovieId() + " " + mv.getTitle() + " " + mv.getYear() + " " + mv.getLenght()+
                                  " " + mv.getGenre()+ " "+ mv.getStudioName()+" "+mv.getProdcerName()+" "+mv.getShortDescription()+
                                  " "+mv.getNumWatched()+ "\n";
                             all_movies.add(mv);
                             fr.writeMovies(moviestr);
                              JOptionPane.showMessageDialog(this, """
                                                      movie successfully added
                                                      movie Id:""" + mv.getMovieId());
                             break;
                        
                   }
               }
               
               
             
          }
          else
          {
              Movie mv = new Movie(movie_info);

                          String moviestr =  mv.getMovieId() + " " + mv.getTitle() + " " + mv.getYear() + " " + mv.getLenght()+
                                  " " + mv.getGenre()+ " "+ mv.getStudioName()+" "+mv.getProdcerName()+" "+mv.getShortDescription()+
                                  " "+mv.getNumWatched()+ "\n";
                             all_movies.add(mv);
                             fr.writeMovies(moviestr);
                              JOptionPane.showMessageDialog(this, """
                                                      movie successfully added
                                                      movie Id:""" + mv.getMovieId());
                           
          }
            
             
               this.dispose();
               funcScreen fc = new funcScreen();
               fc.setVisible(true);
                       
               
                
    }//GEN-LAST:event_addbuttonActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JTextField genretxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField lenghttxt;
    private javax.swing.JTextField nowtxt;
    private javax.swing.JTextField protxt;
    private javax.swing.JTextField shorttxt;
    private javax.swing.JTextField studiotxt;
    private javax.swing.JTextField titletxt;
    private javax.swing.JTextField yeartxt;
    // End of variables declaration//GEN-END:variables

   
}
