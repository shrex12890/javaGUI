/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package firstgui;
import java.awt.BorderLayout;
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
    private JButton button;
    private JLabel label;
    private JPanel panel;
            
    public FirstGui(){
        frame =  new JFrame();
        
        button = new JButton("click me");
        button.addActionListener(this);
        
        
        label = new JLabel("number of clicks : 0");
        
        
        
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
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
    
    public void actionPerformed(ActionEvent e)
    {
        count++;
        label.setText("number of clicks : "+ count);
    }
    
}
