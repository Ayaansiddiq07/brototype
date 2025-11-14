
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator{
    public Calculator(){
        JFrame jf=new JFrame("Calculator");
        jf.setSize(420,600);//width and height set of our frame 
        jf.setLocation(300, 50);//set the location of the frame where it should open when we run the program
        jf.setLayout(null);//we are not using any layout manager so we set layout to null
        jf.setVisible(true);//make the frame visible
       
        jf.getContentPane().setBackground( Color.black);


        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//this is for when we click 'x' in frame it will close the program
        
        JLabel displayLabel=new JLabel("hello");
        displayLabel.setBounds(30,80,350,60);
        displayLabel.setBackground(Color.DARK_GRAY);
        displayLabel.setOpaque(true);
        jf.add(displayLabel);
        displayLabel.setFont(new Font("Serif", Font.PLAIN, 35));
        displayLabel.setForeground(Color.lightGray);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        JButton button1=new JButton("%");
        button1.setBounds(30,180,80,50);
        jf.add(button1);
        JButton button2=new JButton("CE");
        button2.setBounds(120,180,80,50);
        jf.add(button2);
        JButton button3=new JButton("C");
        button3.setBounds(210,180,80,50);
        jf.add(button3);
        JButton button4=new JButton("del");
        button4.setBounds(300,180,80,50);
        jf.add(button4);
        JButton button5=new JButton("÷");
        button5.setBounds(300,240,80,50);
        jf.add(button5);
        JButton button6=new JButton("x");
        button6.setBounds(300,300,80,50);
        jf.add(button6);
        JButton button7=new JButton("-");
        button7.setBounds(300,360,80,50);
        jf.add(button7);
        JButton button8=new JButton("+");
        button8.setBounds(300,420,80,50);
        jf.add(button8);
        JButton button9=new JButton("=");
        button9.setBounds(300,480,80,50);
        jf.add(button9);
        JButton button10=new JButton("sqrt");
        button10.setBounds(210,240,80,50);
        jf.add(button10);
        JButton button11=new JButton("9");
        button11.setBounds(210,300,80,50);
        jf.add(button11);
        JButton button12=new JButton("6");
        button12.setBounds(210,360,80,50);
        jf.add(button12);
        JButton button13=new JButton("3");
        button13.setBounds(210,420,80,50);
        jf.add(button13);
        JButton button14=new JButton(".");
        button14.setBounds(210,480,80,50);
        jf.add(button14);
        JButton button15=new JButton("sqr()");
        button15.setBounds(120,240,80,50);
        jf.add(button15);
        JButton button16=new JButton("8");
        button16.setBounds(120,300,80,50);
        jf.add(button16);
        JButton button17=new JButton("5");
        button17.setBounds(120,360,80,50);
        jf.add(button17);
        JButton button18=new JButton("2");
        button18.setBounds(120,420,80,50);
        jf.add(button18);
        JButton button19=new JButton("0");
        button19.setBounds(120,480,80,50);
        jf.add(button19);
        JButton button20=new JButton("1/x");
        button20.setBounds(30,240,80,50);
        jf.add(button20);
        JButton button21=new JButton("7");
        button21.setBounds(30,300,80,50);
        jf.add(button21);
        JButton button22=new JButton("4");
        button22.setBounds(30,360,80,50);
        jf.add(button22);
        JButton button23=new JButton("1");
        button23.setBounds(30,420,80,50);
        jf.add(button23);
        JButton button24=new JButton("+/-");
        button24.setBounds(30,480,80,50);
        jf.add(button24);
        //setting font size of buttons
        button1.setFont(new Font("Arial", Font.PLAIN, 30));
        button2.setFont(new Font("Arial", Font.PLAIN, 30));
        button3.setFont(new Font("Arial", Font.PLAIN, 30));
        button4.setFont(new Font("Arial", Font.PLAIN, 30));
        button5.setFont(new Font("Arial", Font.PLAIN, 30));
        button6.setFont(new Font("Arial", Font.PLAIN, 30));
        button7.setFont(new Font("Arial", Font.PLAIN, 30));
        button8.setFont(new Font("Arial", Font.PLAIN, 30));
        button9.setFont(new Font("Arial", Font.PLAIN, 30));
        button10.setFont(new Font("Arial", Font.PLAIN, 20));
        button11.setFont(new Font("Arial", Font.PLAIN, 30));
        button12.setFont(new Font("Arial", Font.PLAIN, 30));
        button13.setFont(new Font("Arial", Font.PLAIN, 30));
        button14.setFont(new Font("Arial", Font.PLAIN, 30));
        button15.setFont(new Font("Arial", Font.PLAIN, 20));    
        button16.setFont(new Font("Arial", Font.PLAIN, 30));
        button17.setFont(new Font("Arial", Font.PLAIN, 30));
        button18.setFont(new Font("Arial", Font.PLAIN, 30));
        button19.setFont(new Font("Arial", Font.PLAIN, 30));
        button20.setFont(new Font("Arial", Font.PLAIN, 20));
        button21.setFont(new Font("Arial", Font.PLAIN, 30));
        button22.setFont(new Font("Arial", Font.PLAIN, 30));
        button23.setFont(new Font("Arial", Font.PLAIN, 30));
        button24.setFont(new Font("Arial", Font.PLAIN, 20));
    

    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        

    }
}