import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class C39 extends JFrame implements ActionListener, ChangeListener{

  private JButton b1;
  private JCheckBox cb1;
  private JLabel l1;

  public C39(){

   setLayout(null);

   b1 = new JButton("Cerrar");
   b1.setBounds(10,100,100,30);
   b1.addActionListener(this);
   b1.setEnabled(false);
   add(b1);

   l1 = new JLabel("Aceptar terminos y condiciones");
   l1.setBounds(10,10,400,30);
   add(l1);

   cb1 = new JCheckBox("Acepto");
   cb1.setBounds(10,50,100,30);
   cb1.addChangeListener(this);
   add(cb1);

 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == b1){
    System.exit(0);
  }
 }

  public void stateChanged(ChangeEvent e){
   if(cb1.isSelected() == true){
    b1.setEnabled(true);
  }
   else{
   b1.setEnabled(false); 
  }
 }

  public static void main(String args[]){

   C39 formulario = new C39();
   formulario.setBounds(0,0,400,400);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}