import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class C35 extends JFrame implements ActionListener{

  private JLabel l1,l2,l3;
  private JComboBox cb1,cb2,cb3;
  private JButton b1, b2;

  public C35(){

   setLayout(null);

   l1 = new JLabel("Rojo: ");
   l1.setBounds(10,10,100,10);
   add(l1);

   cb1 = new JComboBox();
   cb1.setBounds(120,10,50,30);
   for(int i = 0; i <= 255; i++){
    cb1.addItem(String.valueOf(i));
  }
   add(cb1);

   l2 = new JLabel("Verde: ");
   l2.setBounds(10,50,100,10);
   add(l2);

   cb2 = new JComboBox();
   cb2.setBounds(120,50,50,30);
   for(int i = 0; i <= 255; i++){
    cb2.addItem(String.valueOf(i));
  }
   add(cb2);

   l3 = new JLabel("Azul: ");
   l3.setBounds(10,90,100,10);
   add(l3);

   cb3 = new JComboBox();
   cb3.setBounds(120,90,50,30);
   for(int i = 0; i <= 255; i++){
    cb3.addItem(String.valueOf(i));
  }
   add(cb3);

   b1 = new JButton("Fijar color");
   b1.setBounds(10,130,100,30);
   b1.addActionListener(this);
   add(b1);

   b2 = new JButton("Cerrar");
   b2.setBounds(10,180,100,30);
   b2.addActionListener(this);
   add(b2);

 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == b2){
    System.exit(0);
  }
   if(e.getSource() == b1){
    String cad1 = cb1.getSelectedItem().toString();
    String cad2 = cb2.getSelectedItem().toString();
    String cad3 = cb3.getSelectedItem().toString();

    int rojo = Integer.parseInt(cad1);
    int verde = Integer.parseInt(cad2);
    int azul = Integer.parseInt(cad3);

    Color color1 = new Color(rojo, verde, azul);
    b1.setBackground(color1);
  }
 }

  public static void main(String args[]){

   C35 formulario = new C35();
   formulario.setBounds(0,0,190,300);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}