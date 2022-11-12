import javax.swing.*;
import java.awt.event.*;

public class C33 extends JFrame implements ActionListener{

  private JTextField tf1, tf2;
  private JLabel l1, l2, l3;
  private JButton b1, b2;

  public C33(){

   setLayout(null);

   l1 = new JLabel("Valor 1:");
   l1.setBounds(50,5,100,30);
   add(l1);

   l2 = new JLabel("Valor 2:");
   l2.setBounds(50,35,100,30);
   add(l2);

   l3 = new JLabel("Resultado :");
   l3.setBounds(120,80,100,30);
   add(l3);

   tf1 = new JTextField();
   tf1.setBounds(120,10,150,20);
   add(tf1);

   tf2 = new JTextField();
   tf2.setBounds(120,40,150,20);
   add(tf2);

   b1 = new JButton("Sumar");
   b1.setBounds(10,80,100,30);
   b1.addActionListener(this);
   add(b1);

   b2 = new JButton("Cerrar");
   b2.setBounds(250,80,100,30);
   b2.addActionListener(this);
   add(b2);

 }

  public void actionPerformed(ActionEvent e){

   if(e.getSource() == b2){
    System.exit(0);
  }
   if(e.getSource() == b1){
    int v1 = 0, v2 = 0, resultado = 0;
    v1 = Integer.parseInt(tf1.getText());
    v2 = Integer.parseInt(tf2.getText());
    resultado = v1 + v2;
    l3.setText("Resultado :" + resultado);
  }

 }

  public static void main(String args[]){

   C33 formulario = new C33();
   formulario.setBounds(0,0,400,150);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}