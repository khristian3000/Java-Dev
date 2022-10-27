import javax.swing.JOptionPane;

public class UserInput
{
    public static void main (String[] args)
    {
        String userenters;

        userenters= JOptionPane.showInputDialog ("What is your name?");

        JOptionPane.showMessageDialog (null, userenters);

       // System.out.println("You entered" + userenters + ".");
    }

}
