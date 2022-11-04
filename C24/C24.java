import javax.swing.*;

public class C24 extends JFrame{

  private JLabel label1;

  public C24(){

   setLayout(null);
   label1 = new JLabel("Hola mundo!");
   label1.setBounds(10,20,200,300);
   add(label1);

 }

  public static void main(String args[]){

   C24 formulario1 = new C24();
   formulario1.setBounds(0,0,400,300);
   formulario1.setVisible(true);
   formulario1.setLocationRelativeTo(null);

 }

}