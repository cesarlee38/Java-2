import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class C36 extends JFrame implements ActionListener{

  private JButton b1;
  private JMenuBar mb;
  private JMenu m1;
  private JMenuItem mi1, mi2, mi3;

  public C36(){

   setLayout(null);

   mb = new JMenuBar();
   setJMenuBar(mb);

   m1 = new JMenu("Opciones");
   mb.add(m1);

   mi1 = new JMenuItem("Rojo");
   mi1.addActionListener(this);
   m1.add(mi1);

   mi2 = new JMenuItem("Verde");
   mi2.addActionListener(this);
   m1.add(mi2);

   mi3 = new JMenuItem("Azul");
   mi3.addActionListener(this);
   m1.add(mi3);

   b1 = new JButton("Cerrar");
   b1.setBounds(200,200,100,30);
   b1.addActionListener(this);
   add(b1);

 }

  public void actionPerformed(ActionEvent e){
   Container fondo = this.getContentPane();

   if(e.getSource() == b1){
    System.exit(0);
  }
   if(e.getSource() == mi1){
    fondo.setBackground(new Color(255,0,0));
  }
   if(e.getSource() == mi2){
    fondo.setBackground(new Color(0,255,0));
  }
   if(e.getSource() == mi3){
    fondo.setBackground(new Color(0,0,255));
  }
 }

  public static void main(String args[]){

   C36 formulario = new C36();
   formulario.setBounds(0,0,400,300);
   formulario.setVisible(true);
   formulario.setLocationRelativeTo(null);

 }

}