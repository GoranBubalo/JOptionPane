import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // JOptionPane = pop up standard dialog box that prompts users for a value
        //               or informs of something.

        // JOptionPane.showMessageDialog(null,"Plain Message", "title", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Information Message", "title", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"Question Message", "title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Warrnig_Message", "title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Information_Message", "title", JOptionPane.ERROR_MESSAGE);

        int answer = JOptionPane.showConfirmDialog(null,"do you even code" ,"This is my title" , JOptionPane.YES_NO_CANCEL_OPTION);
        String name = JOptionPane.showInputDialog("What is your name: ");
        // System.out.println("\n" + name);


        //Add our options for our buttons

        String[] responses = {"No you are awesome! ", "thank you! ", "blush"};

        //Add  Image
        ImageIcon imageIcon = new ImageIcon("Image.png");
        JOptionPane.showOptionDialog(null, "You are a good person", "secret message", JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_CANCEL_OPTION, imageIcon, responses, 0);


    }
}