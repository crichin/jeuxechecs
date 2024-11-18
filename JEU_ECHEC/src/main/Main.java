package main;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) 
    {
        JFrame fenetre = new JFrame("Echec");
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(false);
        
        //Ajoutons Le Jeu dans la fenetre...
        Jeu jeu =  new Jeu();
        fenetre.add(jeu);
        fenetre.pack();
        
        fenetre.setLocationRelativeTo(null);
        fenetre.setVisible(true);
        
        jeu.demarre();
        
        System.out.print("I am at the duration : 27:57 in the tutorial video"); 
    }
}
