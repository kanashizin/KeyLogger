/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package keylogger;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author SadBo
 */
public class Janela extends JFrame implements KeyListener{
    
    private JLabel label;
    
    public Janela(String name){
        super(name);
        
        setLayout(new FlowLayout());
        
        JPanel p = new JPanel();
        label = new JLabel("DIGITE SUA IDADE(APENAS NUMEROS)");
        p.add(label);
        add(p);
        setSize(600, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        addKeyListener(this);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
        System.out.println("Key Typed");
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        System.out.println("Key Pressed");
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
       
        System.out.println("Key Released");
        
    }
    
}
