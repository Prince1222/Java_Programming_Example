import javax.swing.*;
import java.awt.event.*;

 class OddEven extends JFrame implements ActionListener{
    JFrame jf;
    JButton b;
    JTextField tf;
    JTextField t;
    public void eventTest(){
        jf= new JFrame("ODD&EVEN CHECK");
        jf.setVisible(true);
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b = new JButton("CHECK");
        tf = new JTextField();

        t= new JTextField();
        t.setBounds(350, 80, 200, 20);
        jf.add(t);

        jf.setLayout(null);

        b.setBounds(200, 80, 100, 20);
        tf.setBounds(50, 80, 100, 20);
        jf.add(b);
        jf.add(tf);

        b.addActionListener(this);
       
    }
    
    public void actionPerformed(ActionEvent ae) {
        int input = Integer.parseInt(tf.getText());

    if (input % 2 == 0) {
        t.setText("Number is even.");
    } else {
        t.setText(" Number is odd.");
    }
}
    

    public static void main(String[] args) {
        OddEven eh = new OddEven();
        eh.eventTest();
    }
}
