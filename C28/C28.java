import javax.swing.*;
import java.awt.event.*;

public class C28 extends JFrame implements ActionListener{

  private JButton boton1, boton2, boton3, cerrar;
  private JLabel label1;

  public C28(){
   setLayout(null);
   boton1 = new JButton("1");
   boton1.setBounds(10,100,90,30);
   add(boton1);
   boton1.addActionListener(this);
   boton2 = new JButton("2");
   boton2.setBounds(110,100,90,30);
   add(boton2);
   boton2.addActionListener(this);
   boton3 = new JButton("3");
   boton3.setBounds(210,100,90,30);
   add(boton3);
   boton3.addActionListener(this);
   cerrar = new JButton("Cerrar");
   cerrar.setBounds(210,10,90,30);
   add(cerrar);
   cerrar.addActionListener(this);
   label1 = new JLabel("Espera...");
   label1.setBounds(10,10,300,30);
   add(label1);
 }

  public void actionPerformed(ActionEvent e){

   if(e.getSource() == boton1){
    label1.setText("Has presionado el botón 1");
  }
   if(e.getSource() == boton2){
    label1.setText("Has presionado el botón 2");
  }
   if(e.getSource() == boton3){
    label1.setText("Has presionado el botón 3");
  }
   if(e.getSource() == cerrar){
    System.exit(0);
  }

 }

  public static void main(String args[]){

   C28 formulario = new C28();
   formulario.setBounds(0,0,350,200);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}