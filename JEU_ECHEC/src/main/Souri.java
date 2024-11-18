package main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Souri extends MouseAdapter
{
    public int x,y;
    public boolean appuye;
    
    
    @Override
    public void mousePressed(MouseEvent e)
    {
        appuye = true;
    };
    
    @Override
    public void mouseReleased(MouseEvent e)
    {
        appuye = false;
    };
    
    
    @Override
    public void mouseDragged(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
    };
    
    
    @Override
    public void mouseMoved(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
    };
}
