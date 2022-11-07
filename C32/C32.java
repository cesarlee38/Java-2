import javax.swing.*;
import java.awt.event.*;

public class C32 extends JFrame implements ActionListener{

  private JTextField textfield;
  private JButton boton1, cerrar;
  private JTextArea textarea;
  private JScrollPane scrollpane;
  private String texto = "";

  public C32(){

   setLayout(null);

   textfield = new JTextField("");
   textfield.setBounds(10,10,200,30);
   add(textfield);

   boton1 = new JButton("Agregar");
   boton1.setBounds(250,10,100,30);
   add(boton1);
   boton1.addActionListener(this);

   textarea = new JTextArea("");
   scrollpane = new JScrollPane(textarea);
   scrollpane.setBounds(10,50,400,300);
   add(scrollpane);

   cerrar = new JButton("Cerrar");
   cerrar.setBounds(350,10,100,30);
   add(cerrar);
   cerrar.addActionListener(this);

 }

  public void actionPerformed(ActionEvent e){

   if(e.getSource() == boton1){
    texto+= textfield.getText() + "\n";
    textarea.setText(texto);
    textfield.setText("");
  }
   if(e.getSource() == cerrar){
    System.exit(0);
  }

 }

  public static void main(String args[]){

   C32 formulario = new C32();
   formulario.setBounds(0,0,540,400);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}