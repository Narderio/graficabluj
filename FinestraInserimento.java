import java.awt.*;
import javax.swing.*;
public class FinestraInserimento extends JFrame
{
    private Container container;
    private JPanel panel;
    private JLabel etichettanome, etichettacognome, etichettanumero,etichettalogin;
    private JButton accedi,recuperapassword,registrati;
    public FinestraInserimento() 
    {
        super("Registrazione");
        setSize(600,500);
        setLocation(500,500);
        setResizable(true);
        container=getContentPane();
        panel=new JPanel();
        
        //panel.setBackground(Color.black);
        panel.setLayout(null);
        etichettalogin=new JLabel("Login");
        etichettanome=new JLabel("Nome");
        JTextField nome=new JTextField("Inserisci nome");
        etichettacognome=new JLabel("Cognome");
        JTextField cognome=new JTextField("Inserisci cognome");
        etichettanumero=new JLabel("Numero");
        JTextField numero=new JTextField("Inserisci numero");
        accedi=new JButton("Accedi");
        recuperapassword=new JButton("Recupera password");
        registrati=new JButton("Registrati");
        
        /*Color peach=new Color(255,203,164);
        l1.setBackground(peach);
        l1.setOpaque(true);*/
        
        panel.add(etichettalogin);
        panel.add(etichettanome);
        panel.add(nome);
        panel.add(etichettacognome);
        panel.add(cognome);
        panel.add(etichettanumero);
        panel.add(numero);
        panel.add(accedi);
        panel.add(recuperapassword);
        panel.add(registrati);
        
        etichettalogin.setBounds(300,10,100,20);
        etichettanome.setBounds(110,30,100,50);
        etichettacognome.setBounds(90,100,100,50);
        etichettanumero.setBounds(100,170,50,50);
        nome.setBounds(150,30,400,50);
        cognome.setBounds(150,100,400,50);
        numero.setBounds(150,170,400,50);
        accedi.setBounds(150,240,400,100);
        recuperapassword.setBounds(150,350,200,50);
        registrati.setBounds(360,350,190,50);
        
        container.add(panel);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public static void main(String [] args) 
    {
        FinestraInserimento o = new FinestraInserimento(); 
    }
}