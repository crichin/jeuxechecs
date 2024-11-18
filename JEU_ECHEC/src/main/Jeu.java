package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;
import piece.*;


public class Jeu extends JPanel implements Runnable
{
    
    public static final int LARGEUR  = 1000;
    public static final int LONGEUR = 600;
        
    final int FPS = 60;
    Thread threadJeu;
    Plateau plateau = new Plateau();    
    Souri souri = new Souri();
    
    
    //PIECES
    //PIECES
    public static ArrayList<Piece> pieces = new ArrayList<>();
    public static ArrayList<Piece> pieces_backup = new ArrayList<>();
    Piece piece_active;
    
    
    //LES COULEURS
    public static final int BLANC = 0; 
    public static final int NOIR = 1;   
    int couleurActuel = BLANC;
    
    public Jeu()
    {
        setPreferredSize( new Dimension(LARGEUR, LONGEUR));
        setBackground(Color.black);
        
        addMouseMotionListener(souri);
        addMouseListener(souri);
        
        initialisePieces();
        copierPieces(pieces, pieces_backup);
        
    }
    
    
    public void demarre()
    {
        threadJeu = new Thread(this);
        threadJeu.start();
    } 
    
    @Override
    public void run()
    {
        //Boucle du jeu
        double dessineIntervalle = 1000000000/FPS;
        double delta = 0;
        long dernierTemps = System.nanoTime();
        long tempsActuel; 
        
        while(threadJeu != null)
        {
            tempsActuel = System.nanoTime();
            delta += (tempsActuel - dernierTemps)/dessineIntervalle;
            dernierTemps = tempsActuel;
            
            if(delta >= 1)
            {
                update();
                repaint();
                delta--; 
            }
        }
        
    }
    
    
    public void initialisePieces()
    {
        //Les Pieces Blanches
        pieces.add(new Pion    (BLANC, 0, 6) );
        pieces.add(new Pion    (BLANC, 1, 6) );
        pieces.add(new Pion    (BLANC, 2, 6) );
        pieces.add(new Pion    (BLANC, 3, 6) );
        pieces.add(new Pion    (BLANC, 4, 6) );
        pieces.add(new Pion    (BLANC, 5, 6) );
        pieces.add(new Pion    (BLANC, 6, 6) );
        pieces.add(new Pion    (BLANC, 7, 6) ); 
        pieces.add(new Tour    (BLANC, 0, 7) );
        pieces.add(new Cavalier(BLANC, 1, 7) );
        pieces.add(new Four    (BLANC, 2, 7) );
        pieces.add(new Reine   (BLANC, 3, 7) );
        pieces.add(new Roi     (BLANC, 4, 7) );
        pieces.add(new Four    (BLANC, 5, 7) );
        pieces.add(new Cavalier(BLANC, 6, 7) );
        pieces.add(new Tour    (BLANC, 7, 7) );
        
        
        //Les Pieces Noires
        pieces.add(new Pion    (NOIR, 0, 1) );
        pieces.add(new Pion    (NOIR, 1, 1) );
        pieces.add(new Pion    (NOIR, 2, 1) );
        pieces.add(new Pion    (NOIR, 3, 1) );
        pieces.add(new Pion    (NOIR, 4, 1) );
        pieces.add(new Pion    (NOIR, 5, 1) );
        pieces.add(new Pion    (NOIR, 6, 1) );
        pieces.add(new Pion    (NOIR, 7, 1) ); 
        pieces.add(new Tour    (NOIR, 0, 0) ); 
        pieces.add(new Cavalier(NOIR, 1, 0) );
        pieces.add(new Four    (NOIR, 2, 0) );
        pieces.add(new Reine   (NOIR, 3, 0) );
        pieces.add(new Roi     (NOIR, 4, 0) );
        pieces.add(new Four    (NOIR, 5, 0) );
        pieces.add(new Cavalier(NOIR, 6, 0) );
        pieces.add(new Tour    (NOIR, 7, 0) );
        
    }
    
    
    //On utiiisera cette methode pour copier les pieces dans l'ArrayList "pieces" dans
    //pieces_backup pour les situations particulieres...
    private void copierPieces(ArrayList<Piece> source, ArrayList<Piece> cible)
    {
        cible.clear();
        for(int i=0; i < source.size(); i++)
            cible.add(source.get(i));
    }
    
    
    private void update()
    {
        if(souri.appuye)
        {
            if(piece_active == null)
            {
                
            };
        }
        
    }
    
    
    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);

        Graphics2D g2 = (Graphics2D)g;
        
        //Plateau
        plateau.dessine(g2);
        
        //Pieces
        for(Piece p : pieces_backup )
            p.dessine(g2);
    }
    
       
}
