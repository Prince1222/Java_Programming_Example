import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CalcDemo extends JFrame{
    JFrame jf;

    JButton b;
    JButton b1;
    JButton b2;
    JTextField t;
    JTextField tf;
    JTextField r;
    JLabel l;
    JLabel l2;
    JLabel l3;
    
    public void eventTest(){
        jf= new JFrame("CALCULATOR");
        jf.setVisible(true);
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = new JButton("ADD");
        b1 = new JButton("SUB");
        b2 = new JButton("CLEAR");
        t = new JTextField();
        tf= new JTextField();
        r= new JTextField();
        
        l= new JLabel("NUMBER 1");
        l.setBounds(100, 80, 100, 20);
        jf.add(l);

        l2 = new JLabel("NUMBER 2");
        l2.setBounds(100,100,100,20);

        l3 = new JLabel("RESULT");
        l3.setBounds(400,100,100,20);


        jf.setLayout(null);

        b.setBounds(200, 150, 100, 20);
        b1.setBounds(300, 150, 100, 20);
        b2.setBounds(400, 150, 100, 20);

        t.setBounds(200, 80, 100, 20);
        tf.setBounds(200,100,100,20);
        r.setBounds(450,100,100,20);
        

        jf.add(b);
        jf.add(b1);
        jf.add(b2);
        jf.add(t);
        jf.add(tf);
        jf.add(r);
        jf.add(l2);
        jf.add(l3);

        inner1 i1 = new inner1();
        b.addActionListener(i1);

        Inner2 i2= new Inner2();
        b1.addActionListener(i2);

        Inner3 i3 = new Inner3();
        b2.addActionListener(i3);
        r.addActionListener(i3);
        t.addActionListener(i3);
        tf.addActionListener(i3); 
    }
    class inner1 implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            double a = Double.parseDouble(t.getText());
            double b = Double.parseDouble(tf.getText());
    
            double result = a + b;
            r.setText("  " + result);
        }
    }
    class Inner2 implements ActionListener{
        @Override
    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(tf.getText());
        double b = Double.parseDouble(t.getText());
        double result = a - b;
        r.setText(" " + result); 
    }
    }
    class Inner3 implements ActionListener{
        @Override
    public void actionPerformed(ActionEvent e) {
        r.setText("");
        tf.setText("");
        t.setText("");
           
    }
    }
    public static void main(String[] args) {
        CalcDemo eh = new CalcDemo();
        eh.eventTest();
    }
    }
