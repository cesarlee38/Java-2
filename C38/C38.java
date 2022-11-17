import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class C38 extends JFrame implements ActionListener, ChangeListener{

  private JButton b1;
  private JCheckBox cb1, cb2, cb3;

  public C38(){

   setLayout(null);

   b1 = new JButton("Cerrar");
   b1.setBounds(300,100,100,30);
   b1.addActionListener(this);
   add(b1);

   cb1 = new JCheckBox("Inglés");
   cb1.setBounds(10,10,150,30);
   cb1.addChangeListener(this);
   add(cb1);

   cb2 = new JCheckBox("Francés");
   cb2.setBounds(10,50,150,30);
   cb2.addChangeListener(this);
   add(cb2);

   cb3 = new JCheckBox("Alemán");
   cb3.setBounds(10,90,150,30);
   cb3.addChangeListener(this);
   add(cb3);

 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == b1){
    System.exit(0);
  }
 }

  public void stateChanged(ChangeEvent e){
   String cad="";
   if(cb1.isSelected() == true){
    cad = cad + "Inglés-";
  }
   if(cb2.isSelected() == true){
    cad = cad + "Francés-";
  }
   if(cb3.isSelected() == true){
    cad = cad + "Alemán";
  }
   setTitle(cad);
 }

  public static void main(String args[]){

   C38 formulario = new C38();
   formulario.setBounds(0,0,600,600);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}