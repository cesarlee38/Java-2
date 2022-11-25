import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Principal extends JFrame implements ActionListener{

  private JMenuBar mb;
  private JMenu mOpciones, mCalcular, mAcercaDe, mColorFondo;
  private JMenuItem miCalculo, miRojo, miNegro, miMorado, miElCreador, miSalir, miNuevo;
  private JLabel lLogo, lBienvenido, lTitle, lNombre, lApellidoPaterno, lApellidoMaterno,
                 lDepartamento, lAntiguedad, lResultado, lFooter;
  private JTextField tfNombreTrabajador, tfApellidoPaterno, tfApellidoMaterno;
  private JComboBox cbDepartamento, cbAntiguedad;
  private JScrollPane sp1;
  private JTextArea ta1;

  public Principal(){

   setLayout(null);
   setTitle("Pantalla Principal");
   getContentPane().setBackground(new Color(255,0,0));
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

   mb = new JMenuBar();
   mb.setBackground(new Color(255,0,0));
   setJMenuBar(mb);

   mOpciones = new JMenu("Opciones");
   mOpciones.setBackground(new Color(255,0,0));
   mOpciones.setFont(new Font("Andale Mono", 1, 14));
   mOpciones.setForeground(new Color(255,255,255));
   mb.add(mOpciones);

   mCalcular = new JMenu("Calcular");
   mCalcular.setBackground(new Color(255,0,0));
   mCalcular.setFont(new Font("Andale Mono", 1, 14));
   mCalcular.setForeground(new Color(255,255,255));
   mb.add(mCalcular);

   mAcercaDe = new JMenu("Acerca de");
   mAcercaDe.setBackground(new Color(255,0,0));
   mAcercaDe.setFont(new Font("Andale Mono", 1, 14));
   mAcercaDe.setForeground(new Color(255,255,255));
   mb.add(mAcercaDe);

   mColorFondo = new JMenu("Color de fondo");
   mColorFondo.setFont(new Font("Andale Mono", 1, 14));
   mColorFondo.setForeground(new Color(255,0,0));
   mOpciones.add(mColorFondo);

   miCalculo = new JMenuItem("Vacaciones");
   miCalculo.setFont(new Font("Andale Mono", 1, 14));
   miCalculo.setForeground(new Color(255,0,0));
   mCalcular.add(miCalculo);
   miCalculo.addActionListener(this);

   miRojo = new JMenuItem("Rojo");
   miRojo.setFont(new Font("Andale Mono", 1, 14));
   miRojo.setForeground(new Color(255,0,0));
   mColorFondo.add(miRojo);
   miRojo.addActionListener(this);

   miNegro = new JMenuItem("Negro");
   miNegro.setFont(new Font("Andale Mono", 1, 14));
   miNegro.setForeground(new Color(255,0,0));
   mColorFondo.add(miNegro);
   miNegro.addActionListener(this);

   miMorado = new JMenuItem("Morado");
   miMorado.setFont(new Font("Andale Mono", 1, 14));
   miMorado.setForeground(new Color(255,0,0));
   mColorFondo.add(miMorado);
   miMorado.addActionListener(this);

   miNuevo = new JMenuItem("Nuevo");
   miNuevo.setFont(new Font("Andale Mono", 1, 14));
   miNuevo.setForeground(new Color(255,0,0));
   mOpciones.add(miNuevo);
   miNuevo.addActionListener(this);

   miElCreador = new JMenuItem("El creador");
   miElCreador.setFont(new Font("Andale Mono", 1, 14));
   miElCreador.setForeground(new Color(255,0,0));
   mAcercaDe.add(miElCreador);
   miElCreador.addActionListener(this);

   miSalir = new JMenuItem("Salir");
   miSalir.setFont(new Font("Andale Mono", 1, 14));
   miSalir.setForeground(new Color(255,0,0));
   mOpciones.add(miSalir);
   miSalir.addActionListener(this);

   ImageIcon image = new ImageIcon("images/logo-coca.png");
   lLogo = new JLabel(image);
   lLogo.setBounds(5,5,250,100);
   add(lLogo);

   lBienvenido = new JLabel("Bienvenido");
   lBienvenido.setBounds(280,30,300,50);
   lBienvenido.setFont(new Font("Andale Mono", 1, 32));
   lBienvenido.setForeground(new Color(255,255,255));
   add(lBienvenido);

   lTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
   lTitle.setBounds(45,140,900,25);
   lTitle.setFont(new Font("Andale Mono", 0, 24));
   lTitle.setForeground(new Color(255,255,255));
   add(lTitle);

   lNombre = new JLabel("Nombre completo:");
   lNombre.setBounds(25,188,180,25);
   lNombre.setFont(new Font("Andale Mono", 1, 12));
   lNombre.setForeground(new Color(255, 255, 255));
   add(lNombre);

   tfNombreTrabajador = new JTextField();
   tfNombreTrabajador.setBounds(25,213,150,25);
   tfNombreTrabajador.setBackground(new java.awt.Color(224, 224, 224));
   tfNombreTrabajador.setFont(new java.awt.Font("Andale Mono", 1, 14));
   tfNombreTrabajador.setForeground(new java.awt.Color(255, 0, 0));
   add(tfNombreTrabajador);

   lApellidoPaterno = new JLabel("Apellido Paterno:");
   lApellidoPaterno.setBounds(25,248,180,25);
   lApellidoPaterno.setFont(new Font("Andale Mono", 1, 12));
   lApellidoPaterno.setForeground(new Color(255, 255, 255));
   add(lApellidoPaterno);

   tfApellidoPaterno = new JTextField();
   tfApellidoPaterno.setBounds(25,273,150,25);
   tfApellidoPaterno.setBackground(new java.awt.Color(224, 224, 224));
   tfApellidoPaterno.setFont(new java.awt.Font("Andale Mono", 1, 14));
   tfApellidoPaterno.setForeground(new java.awt.Color(255, 0, 0));
   add(tfApellidoPaterno);

   lApellidoMaterno = new JLabel("Apellido Materno:");
   lApellidoMaterno.setBounds(25,308,180,25);
   lApellidoMaterno.setFont(new Font("Andale Mono", 1, 12));
   lApellidoMaterno.setForeground(new Color(255, 255, 255));
   add(lApellidoMaterno);

   tfApellidoMaterno = new JTextField();
   tfApellidoMaterno.setBounds(25,334,150,25);
   tfApellidoMaterno.setBackground(new java.awt.Color(224, 224, 224));
   tfApellidoMaterno.setFont(new java.awt.Font("Andale Mono", 1, 14));
   tfApellidoMaterno.setForeground(new java.awt.Color(255, 0, 0));
   add(tfApellidoMaterno);

   lDepartamento = new JLabel("Selecciona el Departamento:");
   lDepartamento.setBounds(220,188,180,25);
   lDepartamento.setFont(new Font("Andale Mono", 1, 12));
   lDepartamento.setForeground(new Color(255, 255, 255));
   add(lDepartamento);

   cbDepartamento = new JComboBox();
   cbDepartamento.setBounds(220,213,220,25);
   cbDepartamento.setBackground(new java.awt.Color(224, 224, 224));
   cbDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
   cbDepartamento.setForeground(new java.awt.Color(255, 0, 0));
   add(cbDepartamento);
   cbDepartamento.addItem("");
   cbDepartamento.addItem("Atención al Cliente");
   cbDepartamento.addItem("Departamento de Logística");
   cbDepartamento.addItem("Departamento de Gerencia");

   lAntiguedad = new JLabel("Selecciona la Antigüedad:");
   lAntiguedad.setBounds(220,248,180,25);
   lAntiguedad.setFont(new Font("Andale Mono", 1, 12));
   lAntiguedad.setForeground(new Color(255, 255, 255));
   add(lAntiguedad);

   cbAntiguedad = new JComboBox();
   cbAntiguedad.setBounds(220,273,220,25);
   cbAntiguedad.setBackground(new java.awt.Color(224, 224, 224));
   cbAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
   cbAntiguedad.setForeground(new java.awt.Color(255, 0, 0));
   add(cbAntiguedad);
   cbAntiguedad.addItem("");
   cbAntiguedad.addItem("1 año de servicio");
   cbAntiguedad.addItem("2 a 6 años de servicio");
   cbAntiguedad.addItem("7 años o más de servicio");

   lResultado = new JLabel("Resultado del Cálculo:");
   lResultado.setBounds(220,307,180,25);
   lResultado.setFont(new Font("Andale Mono", 1, 12));
   lResultado.setForeground(new Color(255, 255, 255));
   add(lResultado);

   ta1 = new JTextArea();
   ta1.setEditable(false);
   ta1.setBackground(new Color(224, 224, 224));
   ta1.setFont(new Font("Andale Mono", 1, 11));
   ta1.setForeground(new Color(255, 0, 0));
   ta1.setText("\n   Aquí aparece el resultado del cálculo de las vacaciones.");
   sp1 = new JScrollPane(ta1);
   sp1.setBounds(220,333,385,90);
   add(sp1);

   lFooter = new JLabel("©2017 The Coca-Cola Company | Todos los derechos reservados");
   lFooter.setBounds(135,445,500,30);
   lFooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
   lFooter.setForeground(new java.awt.Color(255, 255, 255));
   add(lFooter);

 }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == miCalculo){
  }
   if(e.getSource() == miRojo){
  }
   if(e.getSource() == miNegro){
  }
   if(e.getSource() == miMorado){
  }
   if(e.getSource() == miNuevo){
  }
   if(e.getSource() == miSalir){
    System.exit(0);
  }
   if(e.getSource() == miElCreador){
  }
 }

  public static void main(String args[]){

   Principal formulario = new Principal();
   formulario.setBounds(0,0,640,535);
   formulario.setVisible(true);
   formulario.setResizable(false);
   formulario.setLocationRelativeTo(null);

 }

}