import javax.swing.*;
import java.awt.event.*;

public class C34 extends JFrame implements ItemListener, ActionListener{

  private JComboBox cb1;
  private JButton b1;

  public C34(){

   setLayout(null);

   cb1 = new JComboBox();
   cb1.setBounds(10,10,80,20);
   add(cb1);

   cb1.addItem("rojo");
   cb1.addItem("verde");
   cb1.addItem("azul");
   cb1.addItem("amarillo");
   cb1.addItem("negro");
   cb1.addItemListener(this);

   b1 = new JButton("Cerrar");
   b1.setBounds(10,50,100,30);
   b1.addActionListener(this);
   add(b1);

 }

  public void itemStateChanged(ItemEvent e){
   if(e.getSource() == cb1){
    String seleccion = cb1.getSelectedItem().toString();
    setTitle(seleccion);
  }
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == b1){
    System.exit(0);
  }
 }

  public static void main(String args[]){

   C34 formulario = new C34();
   formulario.setBounds(0,0,300,150);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}