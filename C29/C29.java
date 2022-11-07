import javax.swing.*;
import java.awt.event.*;

public class C29 extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JLabel label1;
  private JButton boton1, cerrar;

  public C29(){

   setLayout(null);

   label1 = new JLabel("Usuario:");
   label1.setBounds(10,10,100,30);
   add(label1);

   textfield1 = new JTextField();
   textfield1.setBounds(120,17,150,20);
   add(textfield1);

   boton1 = new JButton("Aceptar");
   boton1.setBounds(10,70,100,30);
   add(boton1);
   boton1.addActionListener(this);

   cerrar = new JButton("Cerrar");
   cerrar.setBounds(150,70,100,30);
   add(cerrar);
   cerrar.addActionListener(this);

 }

  public void actionPerformed(ActionEvent e){

   if(e.getSource() == boton1){
    String texto = textfield1.getText();
    setTitle(texto);
  }
   if(e.getSource() == cerrar){
    System.exit(0);
  }

 }

  public static void main(String args[]){

   C29 formulario = new C29();
   formulario.setBounds(0,0,300,150);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}