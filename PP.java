
package pp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class PP extends JFrame implements ActionListener{
  
        public static JTextField t1;
        public static JButton b1;
    public static void main(String[] args) {
JFrame frame= new JFrame();	
		frame.setTitle("Welecome");
		frame.setSize(600, 400);
		frame.setLocation(200, 200);
                
                 t1 = new JTextField();
                t1.setBounds(50, 50, 150, 20);
                b1 = new JButton("Click here");
                b1.setBounds(50, 50, 150, 20);
                frame.add(b1);
                frame.add(t1);
                
                
                frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
                
                
    }
    public  void actionPerformed(ActionEvent e){  
            t1.setText("Welcome to Javatpoint.");  
            b1.addActionListener(this);
}  
    
}
