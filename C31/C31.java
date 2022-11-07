import javax.swing.*;
import java.awt.event.*;

public class C31 extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JScrollPane scrollpane1;
  private JTextArea textarea1;
  private JButton cerrar;

  public C31(){

   setLayout(null);
   textfield1 = new JTextField();
   textfield1.setBounds(10,10,200,30);
   add(textfield1);

   textarea1 = new JTextArea();
   scrollpane1 = new JScrollPane(textarea1);
   scrollpane1.setBounds(10,50,400,300);
   add(scrollpane1);

   cerrar = new JButton("Cerrar");
   cerrar.setBounds(250,10,100,30);
   cerrar.addActionListener(this);
   add(cerrar);

 }

  public void actionPerformed(ActionEvent e){

   if(e.getSource() == cerrar){
    System.exit(0);
  }

 }

  public static void main (String args[]){

   C31 formulario = new C31();
   formulario.setBounds(0,0,540,400);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}