import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class C40 extends JFrame implements ActionListener, ChangeListener{

  private JButton b1;
  private JRadioButton r1, r2, r3;
  private ButtonGroup bg;

  public C40(){

   setLayout(null);

   b1 = new JButton("Cerrar");
   b1.setBounds(10,170,100,30);
   b1.addActionListener(this);
   add(b1);

   bg = new ButtonGroup();

   r1 =  new JRadioButton("640*480");
   r1.setBounds(10,20,100,30);
   r1.addChangeListener(this);
   add(r1);
   bg.add(r1);

   r2 =  new JRadioButton("800*600");
   r2.setBounds(10,70,100,30);
   r2.addChangeListener(this);
   add(r2);
   bg.add(r2);

   r3 =  new JRadioButton("1024*768");
   r3.setBounds(10,120,100,30);
   r3.addChangeListener(this);
   add(r3);
   bg.add(r3);

 }

  public void stateChanged(ChangeEvent e){
   if(r1.isSelected()){
    setSize(640,480);
  }
   if(r2.isSelected()){
    setSize(800,600);
  }
   if(r3.isSelected()){
    setSize(1024,768);
  }
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == b1){
    System.exit(0);
  }
 }

  public static void main(String args[]){

   C40 formulario = new C40();
   formulario.setBounds(0,0,350,230);
   formulario.setVisible(true);
   formulario.setResizable(false);

 }

}