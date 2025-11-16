import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener {

    JFrame jf;
    JLabel displayLabel;
    String expression = "";

    public Calculator() {

        jf = new JFrame("Calculator");
        jf.setSize(350, 550);
        jf.setLayout(null);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        displayLabel = new JLabel("0");
        displayLabel.setBounds(20, 20, 300, 70);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setFont(new Font("Consolas", Font.BOLD, 36));
        displayLabel.setOpaque(true);
        displayLabel.setBackground(Color.BLACK);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 8, 8));
        panel.setBounds(20, 110, 300, 380);
        jf.add(panel);

        String[] buttons = {
                "C", "DEL", "%", "/",
                "7", "8", "9", "*",
                "4", "5", "6", "-",
                "1", "2", "3", "+",
                "+/-", "0", ".", "="
        };

        for (String b : buttons) {
            JButton btn = new JButton(b);
            btn.setFont(new Font("Segoe UI", Font.BOLD, 20));
            btn.addActionListener(this);
            panel.add(btn);
        }

        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String cmd = ((JButton) e.getSource()).getText();

        if (cmd.matches("[0-9]")) {
            expression += cmd;
            displayLabel.setText(expression);
            return;
        }

        if ("+-*/%".contains(cmd)) {
            expression += cmd;
            displayLabel.setText(expression);
            return;
        }

        if (cmd.equals(".")) {
            expression += ".";
            displayLabel.setText(expression);
            return;
        }

        if (cmd.equals("C")) {
            expression = "";
            displayLabel.setText("0");
            return;
        }

        if (cmd.equals("DEL")) {
            if (expression.length() > 0)
                expression = expression.substring(0, expression.length() - 1);

            displayLabel.setText(expression.isEmpty() ? "0" : expression);
            return;
        }

        if (cmd.equals("+/-")) {
            if (expression.startsWith("-"))
                expression = expression.substring(1);
            else
                expression = "-" + expression;

            displayLabel.setText(expression);
            return;
        }

        if (cmd.equals("=")) {
            try {
                double result = evaluate(expression);
                expression = (result % 1 == 0) ? String.valueOf((int) result) : String.valueOf(result);
                displayLabel.setText(expression);
            } catch (Exception ex) {
                displayLabel.setText("Error");
                expression = "";
            }
        }
    }

    //expression evaluator
    private double evaluate(String exp) {
        return new Object() {
            int pos = -1, ch;

            void nextChar() { ch = (++pos < exp.length()) ? exp.charAt(pos) : -1; }

            boolean eat(int charToEat) {
                while (ch == ' ') nextChar();
                if (ch == charToEat) { nextChar(); return true; }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                return x;
            }

            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (eat('+')) x += parseTerm();
                    else if (eat('-')) x -= parseTerm();
                    else return x;
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (eat('*')) x *= parseFactor();
                    else if (eat('/')) x /= parseFactor();
                    else if (eat('%')) x %= parseFactor();
                    else return x;
                }
            }

            double parseFactor() {
                if (eat('+')) return parseFactor();
                if (eat('-')) return -parseFactor();

                double x;
                int startPos = this.pos;

                if ((ch >= '0' && ch <= '9') || ch == '.') {
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();
                    x = Double.parseDouble(exp.substring(startPos, this.pos));
                } else {
                    throw new RuntimeException("Error");
                }
                return x;
            }
        }.parse();
    }
   

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
    }
}
