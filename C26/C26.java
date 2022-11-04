import javax.swing.*;

public class C26 extends JFrame{

  private JLabel label1;
  private JLabel label2;

  public C26(){

   setLayout(null);
   label1 = new JLabel("Interfaz gráfica");
   label1.setBounds(10,20,300,30);
   add(label1);
   label2 = new JLabel("Versión 1.0");
   label2.setBounds(10,100,100,30);
   add(label2);

 }

  public static void main(String args[]){

   C26 formulario = new C26();
   formulario.setBounds(0,0,300,200);
   formulario.setResizable(false);
   formulario.setVisible(true);
   formulario.setLocationRelativeTo(null);

 }

}