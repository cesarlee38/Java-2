import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class C37 extends JFrame implements ActionListener{

  private JMenuBar mb;
  private JMenu m1, sm1, sm2;
  private JMenuItem mi1, mi2, mi3, mi4;
  private JButton b1;

  public C37(){

   setLayout(null);

   mb = new JMenuBar();
   setJMenuBar(mb);

   m1 = new JMenu("Opciones");
   mb.add(m1);

   sm1 = new JMenu("Tamaño de la ventana");
   m1.add(sm1);

   sm2 = new JMenu("Color de fondo");
   m1.add(sm2);

   mi1 = new JMenuItem("300*200");
   sm1.add(mi1);
   mi1.addActionListener(this);

   mi2 = new JMenuItem("640*480");
   sm1.add(mi2);
   mi2.addActionListener(this);

   mi3 = new JMenuItem("Rojo");
   sm2.add(mi3);
   mi3.addActionListener(this);

   mi4 = new JMenuItem("Verde");
   sm2.add(mi4);
   mi4.addActionListener(this);

   b1 = new JButton("Cerrar");
   b1.setBounds(100,100,100,30);
   b1.addActionListener(this);
   add(b1);

 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == b1){
    System.exit(0);
  }
   if(e.getSource() == mi1){
    setSize(300,200);
  }
   if(e.getSource() == mi2){
    setSize(640,480);
  }
   if(e.getSource() == mi3){
    getContentPane().setBackground(new Color(255,0,0));
  }
   if(e.getSource() == mi4){
    getContentPane().setBackground(new Color(0,255,0));
  }
 }

  public static void main(String args[]){

   C37 formulario = new C37();
   formulario.setBounds(0,0,300,200);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}