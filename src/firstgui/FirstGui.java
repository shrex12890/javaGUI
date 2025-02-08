/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstgui;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;

public class FirstGui implements ActionListener {

    int count = 0;
    private JFrame frame;
    private JButton button1,button2,button3;
    private JLabel label;
    private JPanel panel;
            
    public FirstGui(){
        frame =  new JFrame();
        
        button1 = new JButton("add");
        button1.addActionListener(this);
        
        button2 = new JButton("reset");
        button2.addActionListener(this);
        
        button3 = new JButton("sub");
        button3.addActionListener(this);
        
        label = new JLabel("number of clicks : 0");
        
        
        
        panel = new JPanel();
        panel.setBackground(Color.yellow);
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button1);
        panel.add(button3);
        panel.add(button2);
        panel.add(label);
        
        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("first GUI");
        frame.pack();
        frame.setVisible(true);
    } 
    
    public static void main(String[] args) {
       new FirstGui();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            add(e);
        } else if (e.getSource() == button2) {
            reset(e);
        }
        else if (e.getSource() == button3) {
            sub(e);
        }
}

    
    
    public void add(ActionEvent e)
    {
        count++;
        label.setText("number of clicks : "+ count);
    }
    
    public void reset(ActionEvent e)
    {
        count = 0;
        label.setText("number of clicks : "+ count);
    }
    
    public void sub(ActionEvent e)
    {
        count--;
        label.setText("number of clicks : "+ count);
    }
}
