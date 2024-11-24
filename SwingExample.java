import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SwingExample extends JFrame{
    JFrame jf;

    JButton b1;
    JButton b2;
    JButton b3;
    JTextField tt;
    JTextField tf1;
    JTextField tf2;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    
    public void eventTest(){
        jf= new JFrame("CALCULATOR");
        jf.setVisible(true);
        jf.setSize(500, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b1= new JButton("add");
        b2 = new JButton("sub");
        b3 = new JButton("clear");
        tt = new JTextField();
        tf1= new JTextField();
        tf2= new JTextField();
        
        l1= new JLabel("Variable 1");
        l1.setBounds(50, 50, 100, 20);
        jf.add(l1);

        l2 = new JLabel("Varaible 2");
        l2.setBounds(150,50,100,20);

        l3 = new JLabel("RESULT");
        l3.setBounds(400,100,100,20);


        jf.setLayout(null);

        b1.setBounds(150, 150, 100, 20);
        b2.setBounds(150, 150, 100, 20);
        b3.setBounds(400, 150, 100, 20);

        tt.setBounds(200, 80, 100, 20);
        tf1.setBounds(200,100,100,20);
        tf2.setBounds(450,100,100,20);
        

        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(tt);
        jf.add(tf1);
        jf.add(tf2);
        jf.add(l2);
        jf.add(l3);

        inner1 i1 = new inner1();
        b1.addActionListener(i1);

        Inner2 i2= new Inner2();
        b1.addActionListener(i2);

        Inner3 i3 = new Inner3();
        b2.addActionListener(i3);
        tf2.addActionListener(i3);
        tt.addActionListener(i3);
        tf1.addActionListener(i3); 
    }
    class inner1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double a = Double.parseDouble(tt.getText());
            double b = Double.parseDouble(tf1.getText());
    
            double result = a + b;
            tf2.setText("  " + result);
        }
    }
    class Inner2 implements ActionListener{
        @Override
    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(tf1.getText());
        double b = Double.parseDouble(tt.getText());
        double result = a - b;
        tf2.setText(" " + result); 
    }
    }
    class Inner3 implements ActionListener{
        @Override
    public void actionPerformed(ActionEvent e) {
        tf2.setText("");
        tf1.setText("");
        tt.setText("");
           
    }
    }
    public static void main(String[] args) {
        SwingExample se = new SwingExample();
        se.eventTest();
    }
    }

