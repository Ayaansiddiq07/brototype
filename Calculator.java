
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator{
    public Calculator(){
        JFrame jf=new JFrame("Calculator");
        jf.setSize(400,600);//width and height set of our frame 
        jf.setLocation(300, 50);//set the location of the frame where it should open when we run the program
        jf.setLayout(null);//we are not using any layout manager so we set layout to null
        jf.setVisible(true);//make the frame visible
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this is for when we click 'x' in frame it will close the program
        
        JLabel displayLabel=new JLabel("hello");
        displayLabel.setBounds(30,40,340,40);
        displayLabel.setBackground(Color.DARK_GRAY);
        displayLabel.setOpaque(true);
        jf.add(displayLabel);


    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        

    }
}