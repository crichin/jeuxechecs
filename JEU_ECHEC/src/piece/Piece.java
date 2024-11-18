package piece;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import main.Plateau;

public class Piece 
{
    public BufferedImage image;
    public int x,y;
    public int colonne, ligne, preColonne, preLigne;
    public int couleur;
    
    public Piece(int couleur, int colonne, int ligne)
    {
        this.couleur = couleur;
        this.colonne = colonne;
        this.ligne = ligne;
        x = trouveX(colonne);
        y = trouveY(ligne);
        preColonne = colonne;
        preLigne = ligne;   
    }
    
    
    public BufferedImage trouveImage(String cheminImage)
    {
        BufferedImage image = null;
        
        try
        {
            image = ImageIO.read(getClass().getResourceAsStream(cheminImage + ".png"));
        }catch(IOException e)
        {
            e.printStackTrace(); 
        }
        
        return image;
    }
    
    public int trouveX(int colonne)
    {
        return colonne*Plateau.TAILLE_CARRE; 
        
    }
    
    public int trouveY(int ligne)
    {
        return ligne*Plateau.TAILLE_CARRE; 
        
    }
    
    
    public void dessine(Graphics2D g2)
    {
        g2.drawImage(image, x, y, Plateau.TAILLE_CARRE, Plateau.TAILLE_CARRE, null );
    }
    
}
