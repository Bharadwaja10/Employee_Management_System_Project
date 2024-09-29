package Employee_Management_System;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class FrontEnd extends JFrame implements ActionListener{
    FrontEnd(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);//there will be a default layout by the awt so we need to make it null the set layout to edit

        //Heading for the Interface
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 60);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.RED);
        add(heading);//add() works with the components (here Jlabel heading is a component)

        //Adding image in the interface
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Images/front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);//To add image in the frame we need to use Jlabel
        image.setBounds(50, 100, 1050, 500);
        add(image);

        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 300, 70);
        clickhere.setBackground(Color.BLACK);
        clickhere.setForeground(Color.WHITE);
        clickhere.addActionListener(this);
        image.add(clickhere);

        setSize(1170,650);
        setVisible(true);
        setLocation(150,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

    }

    //It is a abstract method in the interface ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();        
    }

    public static void main(String[] args) throws Exception {
        new FrontEnd();
    }
    
}
