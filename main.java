import mypackage.*;
public class main
{
    static Finestra finestra;
    static int []x1;
    static int []x2;
    static int []y1;
    static int []y2;
    public static void main()
    {int scelta;
       
        System.out.println("Quante finestre vuoi creare?");
        scelta=Integer.valueOf(Gest_Input.leggi());
        x1=new int[scelta];
        x2=new int[scelta];
        y1=new int[scelta];
        y2=new int[scelta];
        for(int j=0;j<scelta;j++)
        {
            x1[j]=Integer.valueOf(Gest_Input.randomgrand());
            y1[j]=Integer.valueOf(Gest_Input.randomgrand());
            x2[j]=Integer.valueOf(Gest_Input.randomgrand());
            y2[j]=Integer.valueOf(Gest_Input.randomgrand()); 
        }
       finestra= new Finestra(x1,y1,x2,y2,scelta);
    }

   
}
