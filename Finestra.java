import mypackage.*;
import java.awt.*;
import javax.swing.*;
public class Finestra extends JFrame
{
    private JFrame frame;
    private Container container;
    private JPanel panel;
    
    public Finestra(int[] x1,int[] y1,int[] x2,int[] y2,int scelta)
    {
        int r,g,b;
        for(int j=0;j<scelta;j++)
        {
             
            
            frame=new JFrame("Sfondo allucinogeno");
            //container=frame.getContentPane(); 
            frame.setBounds(x1[j],y1[j],x2[j],y2[j]);//sostituisce size e location
           // frame.setSize(500,380);
            //frame.setLocation(500,200);
            panel=new JPanel();
            r=Gest_Input.randomcolore();
            g=Gest_Input.randomcolore();
            b=Gest_Input.randomcolore();
            Color colore=new Color(r,g,b);
            panel.setBackground(colore);
            frame.add(panel);
            frame.show();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
    }
    
    
}
