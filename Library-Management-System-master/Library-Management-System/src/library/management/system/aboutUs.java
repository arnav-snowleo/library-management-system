package library.management.system;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("About Us - AMIT DEVRAJ || ARNAV SATRUSAL || SHAKTI PANI");
            setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ram\\Desktop\\rohit.jpg"));
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 500);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            


            JLabel l3 = new JLabel("IIIT BHUBANESWAR");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(70, 40, 350, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("LIBRARY");
            l4.setForeground(new Color(30, 144, 255));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.BOLD, 25 ));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("MANAGEMENT SYSTEM");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(70, 140, 650, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By :  ");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 30));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JLabel l7 = new JLabel("AMIT DEVRAJ || B119009");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 34);
            contentPane.add(l7);

            JLabel l8 = new JLabel("ARNAV SATRUSAL || B119012");
            l8.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l8.setBounds(70, 290, 600, 34);
            contentPane.add(l8);

            JLabel l9 = new JLabel("SHAKTI PRASANNA PANI|| B119051");
            l9.setFont(new Font("Trebuchet MS", Font.BOLD , 20));
            l9.setBounds(70, 320, 600, 34);
            contentPane.add(l9);         
                
            contentPane.setBackground(Color.WHITE);
	}
        

}

