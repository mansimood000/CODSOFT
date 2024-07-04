import java.util.*;
import javax.swing.JOptionPane;
public class GuessNumber 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int myNumber=(int)(Math.random()*100);
        int userNumber=0;

        do{
            userNumber=Integer.parseInt(JOptionPane.showInputDialog("Guess my Number (1-00): "));

            if(userNumber==myNumber)
            {
                JOptionPane.showMessageDialog(null, "WOHOO!!! ...CORRECT NUMBER"+'\n'+"My number was: "+myNumber);
                break;
            }
            else if(userNumber>myNumber)
            {
                JOptionPane.showMessageDialog(null, "Your number is too large");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Your number is too small");
            }

        }
        while(userNumber >= 0);

        JOptionPane.showMessageDialog(null, "Yep"+'\n'+"My number was:" +myNumber);
    }
}
