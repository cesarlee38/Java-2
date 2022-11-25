import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{

  private JLabel l1, l2;
  private JCheckBox cb1;
  private JButton b1, b2;
  private JScrollPane sp1;
  private JTextArea ta1;
  private String nombre = "";

  public Licencia(){

   setLayout(null);
   setTitle("Licencia");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
   Bienvenida formulario = new Bienvenida(); //no importa que sea un nuevo objeto porque la varable es estatica, entonces no se "resetea"
   nombre = formulario.nombre;

   l1 = new JLabel("TÉRMINOS Y CONDICIONES");
   l1.setBounds(215,5,200,30);
   l1.setFont(new Font("Andale Mono", 1, 14));
   l1.setForeground(new Color(0, 0, 0));
   add(l1);

   ta1 = new JTextArea();
   ta1.setEditable(false);
   ta1.setFont(new Font("Andale Mono", 0, 9));
   ta1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
                "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                "\n          http://www.youtube.com/ernestoperezm");
   sp1 = new JScrollPane(ta1);
   sp1.setBounds(10,40,575,200);
   add(sp1);

   cb1 = new JCheckBox("Yo " + nombre + " Acepto");
   cb1.setBounds(10,250,300,30);
   cb1.addChangeListener(this);
   add(cb1);

   b1 = new JButton("Continuar");
   b1.setBounds(10,290,100,30);
   b1.addActionListener(this);
   b1.setEnabled(false);
   add(b1);

   b2 = new JButton("No Acepto");
   b2.setBounds(120,290,100,30);
   b2.addActionListener(this);
   b2.setEnabled(true);
   add(b2);

   ImageIcon image = new ImageIcon("images/coca-cola.png");
   l2 = new JLabel(image);
   l2.setBounds(315,135,300,300);
   add(l2);

 }

  public void stateChanged(ChangeEvent e){
   if(cb1.isSelected() == true){
    b1.setEnabled(true);
    b2.setEnabled(false);
  } else {
    b1.setEnabled(false);
    b2.setEnabled(true);
  }
 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == b1){
    Principal formulario = new Principal();
    formulario.setBounds(0,0,640,535);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
    //this.setVisible(false);
  }
   if(e.getSource() == b2){
    Bienvenida formulario = new Bienvenida();
    formulario.setBounds(0,0,350,450);
    formulario.setVisible(true);
    formulario.setResizable(false);
    formulario.setLocationRelativeTo(null);
    //this.setVisible(false);
  }
 }

  public static void main(String args[]){

   Licencia formulario = new Licencia();
   formulario.setBounds(0,0,610,370);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}