import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JTextField tf1;
  private JLabel l1, l2, l3, l4;
  private JButton b1;

  public Bienvenida(){

   setLayout(null);
   setTitle("Bienvenida");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

   ImageIcon image = new ImageIcon("images/logo-coca.png");
   l1 = new JLabel(image);
   l1.setBounds(25,15,300,150);
   add(l1);

   l2 = new JLabel("Sistema de Control Vocacional");
   l2.setBounds(35,135,300,30);
   l2.setFont(new Font("Andale Mono", 3, 18));
   l2.setForeground(new Color(255,255,255));
   add(l2);

   l3 = new JLabel("Ingrese su nombre");
   l3.setBounds(45,212,200,30);
   l3.setFont(new Font("Andale Mono", 1, 12));
   l3.setForeground(new Color(255,255,255));
   add(l3);

   l4 = new JLabel("©2017 The Coca-Cola Company");
   l4.setBounds(85,375,300,30);
   l4.setFont(new Font("Andale Mono", 1, 12));
   l4.setForeground(new Color(255,255,255));
   add(l4);

   tf1 = new JTextField();
   tf1.setBounds(45,240,255,25);
   tf1.setBackground(new Color(224,224,224));
   tf1.setFont(new Font("Andale Mono", 1, 14));
   tf1.setForeground(new Color(255,0,0));
   add(tf1);

   b1 = new JButton("Ingresar");
   b1.setBounds(125,280,100,30);
   b1.addActionListener(this);
   b1.setBackground(new Color(255,255,255));
   b1.setFont(new Font("Andale Mono", 1, 14));
   b1.setForeground(new Color(255,0,0));
   add(b1);

 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == b1){
    System.exit(0);
  }
 }

  public static void main(String args[]){

   Bienvenida formulario = new Bienvenida();
   formulario.setBounds(0,0,350,450);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}