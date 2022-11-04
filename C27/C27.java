import javax.swing.*;
import java.awt.event.*;

public class C27 extends JFrame implements ActionListener{

  private JButton boton1;

  public C27(){

   setLayout(null);
   boton1 = new JButton("Cerrar");
   boton1.setBounds(300,250,100,30);
   add(boton1);
   boton1.addActionListener(this);

 }

  public void actionPerformed(ActionEvent e){

   if(e.getSource() == boton1){
    System.exit(0);
  }

 }

  public static void main(String args[]){

   C27 formulario = new C27();
   formulario.setBounds(0,0,450,350);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}