package Proyecto_Final;

import java.io.FileNotFoundException;
import javax.swing.JOptionPane;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Proyecto extends JFrame {
  
    public String[][] selecciones = null;
    public String[][] resultados = null;
    public String[][] Dash_res = null;
    public String[][] Dash_selecciones = null;
    public String[][] contador = null;
    public String a[] = null; 
    
    private JPanel jPanelLeft;
    
    private JPanel jPanelIconFIFA;
    private JLabel iconFIFA;
     
    private JPanel jPanelMenu;
    
    private JPanel jPanelMenuHome;
    private JLabel btnHome;
    
    private JPanel jPanelMenuSelecciones;
    private JLabel btnSelecciones;
    
    private JPanel jPanelMenuResultados;
    private JLabel btnResultados;
    
    private JPanel jPanelMenuDashboardSel;
    private JLabel btnDashboardSel;
    
    private JPanel jPanelMenuDashboardRes;
    private JLabel btnDashboardRes;
    
    private JPanel jPanelAuditorio;
    private JLabel btnAuditorio;
    
    private JPanel jPanelSesion;
    private JLabel btnSesion;
    
    private boolean haySesion;
    static String opcion = "Mundial";
    static String pass = "key";
    static String numero;
    static String MenuHomeCount;
    static String SeleccionesCount;
    static String ResultadosCount;
    static String DashSelCount;
    static String DashResCount;
    static String AudienciaCount;
    static String SesionCount;
    
    static int ContadorMenuHome = 0;
    static int ContadorSelecciones = 0;
    static int ContadorResultados = 0;
    static int ContadorDashSel = 0;
    static int ContadorDashRes = 0;
    static int ContadorAuditoria = 0;
    static int ContadorSesion = 0 ;
    static int opc = 0;
    public int Count_Table = 0;
    public int count = 5;
    
    private JPanel jPanelRight;
    private JPanel jPanelLabelTop;
    private JLabel jLabelTop;
    private JPanel jPanelMain;
    
    public Proyecto(){
        
        haySesion = false;   
        
        initComponents();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        
        accionSesion();
        
    }
    
    private void initComponents() {

        jPanelLeft = new JPanel();
        
        jPanelIconFIFA = new JPanel();
        iconFIFA = new JLabel();
        jPanelMenu = new JPanel();
        
        jPanelMenuHome = new JPanel();
        btnHome = new JLabel();
        
        jPanelMenuSelecciones = new JPanel();
        btnSelecciones = new JLabel();
        
        jPanelMenuResultados = new JPanel();
        btnResultados = new JLabel();
        
        jPanelMenuDashboardSel = new JPanel();
        btnDashboardSel = new JLabel();
        
        jPanelMenuDashboardRes = new JPanel();
        btnDashboardRes = new JLabel();
        
        jPanelAuditorio = new JPanel();
        btnAuditorio = new JLabel();
        
        jPanelSesion = new JPanel();
        btnSesion = new JLabel();
                
        jPanelRight = new JPanel();
        jPanelLabelTop = new JPanel();
        jPanelMain = new JPanel();
        
        pintarLogo();
        
        pintarMenuHome();
        
        pintarMenuSelecciones();
  
        pintarMenuResultados();
        
        pintarMenuDashboardSel();
        
        pintarMenuDashboardRes();
        
        pintarAuditorio();
        
        pintarSesion();
        
        pintarPanelIzquierdo();
        
        pintarLabelTop();
        
        pintarPanelDerecho();
        
        setTitle("PROYECTO - MUNDIAL");
        pack();
        setVisible(true);
    }
    
    private void pintarLogo() {
        
        jPanelIconFIFA.add(iconFIFA);
        jPanelIconFIFA.setOpaque(false);
        jPanelIconFIFA.setPreferredSize((new java.awt.Dimension(220, 80)));
        jPanelIconFIFA.setMaximumSize(jPanelIconFIFA.getPreferredSize());
        iconFIFA.setIcon(new ImageIcon(getClass().getResource("/resources/Easports_fifa_logo.svg.png")));
        jPanelLeft.add(jPanelIconFIFA, BorderLayout.LINE_START);
        
    }
    
    private void pintarMenuHome() {
        
        btnHome.setIcon(new ImageIcon(getClass().getResource("/resources/icons/home.png")));
        btnHome.setText("Home");
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        
        JLabel vacioHome = new JLabel();
        jPanelMenuHome.setBackground(new java.awt.Color(17, 41, 63));
        jPanelMenuHome.setPreferredSize((new java.awt.Dimension(220, 35)));
        jPanelMenuHome.setLayout(new BorderLayout(15, 0));
        jPanelMenuHome.add(vacioHome, BorderLayout.WEST);
        jPanelMenuHome.add(btnHome, BorderLayout.CENTER);
        jPanelMenu.add(jPanelMenuHome);
        
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContadorMenuHome++;
                MenuHomeCount = String.valueOf(ContadorMenuHome);                
                System.out.println("Home");
                accionHome();
           
            }});}
    
    private void accionHome() {
       
        jLabelTop.setText("HOME");
        
        jPanelMain.removeAll();
        JPanel homePanel = new JPanel();
        JLabel imageHome = new JLabel();
        
        imageHome.setIcon(new ImageIcon(getClass().getResource("/resources/home.jpg")));
        homePanel.add(imageHome);

        jPanelMain.add(homePanel, BorderLayout.CENTER);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }
    
    private void pintarMenuSelecciones() {
        
        btnSelecciones.setIcon(new ImageIcon(getClass().getResource("/resources/icons/selecciones.png")));
        btnSelecciones.setText("Selecciones");
        btnSelecciones.setForeground(new java.awt.Color(255, 255, 255));
        
        JLabel vacioSelecciones = new JLabel();
        
        jPanelMenuSelecciones.setBackground(new java.awt.Color(17, 41, 63));
        jPanelMenuSelecciones.setPreferredSize((new java.awt.Dimension(220, 35)));
        jPanelMenuSelecciones.setLayout(new BorderLayout(15, 0));
        jPanelMenuSelecciones.add(vacioSelecciones, BorderLayout.WEST);
        jPanelMenuSelecciones.add(btnSelecciones, BorderLayout.CENTER);
        jPanelMenu.add(jPanelMenuSelecciones);
        
        btnSelecciones.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelecciones.setText("Selecciones" + " - " + numero);
                System.out.println("Selecciones");
                ContadorSelecciones++;
                SeleccionesCount = String.valueOf(ContadorSelecciones);
                
                Count();
                
                if(ContadorSelecciones == 5){
                    
                    CountTable();
                    
                    btnSelecciones.setVisible(false);
                    return;
                    }
                
                accionSelecciones();
                
            }});}
    
    private void accionSelecciones() {
        
        if(!haySesion){
            
            Sesion();
            return;
        }
        
        jLabelTop.setText("Selecciones");

        if (selecciones == null) {
            
            jPanelMain.removeAll();
            JPanel seleccionesPanel = new JPanel();

            if (selecciones == null) {

                JLabel notSelecciones = new JLabel();
                notSelecciones.setText("Presione el botón para ver la tabla de selecciones \n\n");
                seleccionesPanel.add(notSelecciones);

                JButton cargarFile = new JButton();
                cargarFile.setText("Seleccione el archivo");
                seleccionesPanel.add(cargarFile);
                cargarFile.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        cargarFileSelecciones();
                        
                    }});}

            jPanelMain.add(seleccionesPanel);
            jPanelMain.repaint();
            jPanelMain.revalidate();
        }
        
        else {
            
            pintarTablaSelecciones();
            
        }}
  
    private void pintarMenuResultados() {
        
        btnResultados.setIcon(new ImageIcon(getClass().getResource("/resources/icons/resultados.png")));
        btnResultados.setText("Resultados");
        btnResultados.setForeground(new java.awt.Color(255, 255, 255));
        
        JLabel vacioResultados = new JLabel();
        jPanelMenuResultados.setBackground(new java.awt.Color(17, 41, 63));
        jPanelMenuResultados.setPreferredSize((new java.awt.Dimension(220, 35)));
        jPanelMenuResultados.setLayout(new BorderLayout(15, 0));
        jPanelMenuResultados.add(vacioResultados, BorderLayout.WEST);
        jPanelMenuResultados.add(btnResultados, BorderLayout.CENTER);
        jPanelMenu.add(jPanelMenuResultados);
        
        btnResultados.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResultados.setText("Resultados" + " - " + numero);
                System.out.println("Resultados");
                ContadorResultados++;
                ResultadosCount = String.valueOf(ContadorResultados);
                
                Count();
                
                if(ContadorResultados == 5){
                    
                    CountTable();
                    
                    btnResultados.setVisible(false);
                    return;
                    }
                
                accionResultados();
                
            }});}
    
    private void accionResultados() {
        
        if(!haySesion){
            
            Sesion();
            return;
        }
        
        jLabelTop.setText("Resultados");

        if (resultados == null) {
            jPanelMain.removeAll();
            JPanel resultadosPanel = new JPanel();

            if (resultados == null) {

                JLabel notResultados = new JLabel();
                notResultados.setText("Presione el botón para ver la tabla de resultados \n\n");
                resultadosPanel.add(notResultados);

                JButton cargarFile = new JButton();
                cargarFile.setText("Seleccione el archivo");
                resultadosPanel.add(cargarFile);
                cargarFile.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        cargarFileResultados();
                        
                    }});}

            jPanelMain.add(resultadosPanel);
            jPanelMain.repaint();
            jPanelMain.revalidate();
            
        }
        
        else {
            
            pintarTablaSelecciones();
            
        }}
   
    private void pintarMenuDashboardSel() {
        
        btnDashboardSel.setIcon(new ImageIcon(getClass().getResource("/resources/icons/dashboard_selecciones.png")));
        btnDashboardSel.setText("Dash Selecciones");
        btnDashboardSel.setForeground(new java.awt.Color(255, 255, 255));
        
        JLabel vacioDashboardSelecciones = new JLabel();
        
        jPanelMenuDashboardSel.setBackground(new java.awt.Color(17, 41, 63));
        jPanelMenuDashboardSel.setPreferredSize((new java.awt.Dimension(220, 35)));
        jPanelMenuDashboardSel.setLayout(new BorderLayout(15, 0));
        jPanelMenuDashboardSel.add(vacioDashboardSelecciones, BorderLayout.WEST);
        jPanelMenuDashboardSel.add(btnDashboardSel, BorderLayout.CENTER);
        jPanelMenu.add(jPanelMenuDashboardSel);
        
        btnDashboardSel.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardSel.setText("Dash Selecciones" + " - " + numero);
                System.out.println("Dashboard Selecciones");
                ContadorDashSel++;
                DashSelCount = String.valueOf(ContadorDashSel);
                
                Count();
                
                if(ContadorDashSel == 5){
                    
                    CountTable();
                    
                    btnDashboardSel.setVisible(false);
                    return;
                    }
                
                accionDashboardSel();
                
            }});}
    
    private void accionDashboardSel() {
        
        if(!haySesion){
            
            Sesion();
            return;
        }
        
        jLabelTop.setText("Dashboard Selecciones");
        
        if (a == null) {
            jPanelMain.removeAll();
            JPanel resultadosPanel = new JPanel();

            if (a == null) {

                JLabel notResultados = new JLabel();
                notResultados.setText("Archivos CSV: Primer Punto Selecciones y Dash_Selecciones\n\n");
                resultadosPanel.add(notResultados);

                JButton cargarFile = new JButton();
                cargarFile.setText("Seleccione el archivo");
                resultadosPanel.add(cargarFile);
                cargarFile.addActionListener(new ActionListener() {
                    
                    public void actionPerformed(ActionEvent evt) {
                        cargarFileDashSelecciones();
                        
                }});}
        
            jPanelMain.add(resultadosPanel);
            jPanelMain.repaint();
            jPanelMain.revalidate();       
            
    }}
  
    private void pintarMenuDashboardRes() {
        
        btnDashboardRes.setIcon(new ImageIcon(getClass().getResource("/resources/icons/dashboard_resultados.png")));
        btnDashboardRes.setText("Dash Resultados");
        btnDashboardRes.setForeground(new java.awt.Color(255, 255, 255));
        
        JLabel vacioDashboardResultados = new JLabel();
        jPanelMenuDashboardRes.setBackground(new java.awt.Color(17, 41, 63));
        jPanelMenuDashboardRes.setPreferredSize((new java.awt.Dimension(220, 35)));
        jPanelMenuDashboardRes.setLayout(new BorderLayout(15, 0));
        jPanelMenuDashboardRes.add(vacioDashboardResultados, BorderLayout.WEST);
        jPanelMenuDashboardRes.add(btnDashboardRes, BorderLayout.CENTER);
        jPanelMenu.add(jPanelMenuDashboardRes);
        
        btnDashboardRes.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDashboardRes.setText("Dash Resultados" + " - " + numero);
                System.out.println("Dashboard Resultados");
                ContadorDashRes++;
                DashResCount = String.valueOf(ContadorDashRes);
                
                Count();
                
                if(ContadorDashRes == 5){
                    
                    CountTable();
                    
                    btnDashboardRes.setVisible(false);
                    return;
                    }
                
                accionDashboardRes();
                
            }});}
    
    private void accionDashboardRes() {
        
        if(!haySesion){
            
            Sesion();
            return;
        }
        
        jLabelTop.setText("Dashboard Resultados");
               
        if (Dash_res == null) {
            
            jPanelMain.removeAll();
            
            JPanel resultadosPanel = new JPanel();

            if (Dash_res == null) {

                JLabel notResultados = new JLabel();
                notResultados.setText("Cargue el archivo CSV para ver el Dash_Resultados \n\n");
                resultadosPanel.add(notResultados);

                JButton cargarFile = new JButton();
                cargarFile.setText("Seleccione el archivo");
                resultadosPanel.add(cargarFile);
                cargarFile.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        cargarFileDashResultados();
                        
                    }});}
            
            jPanelMain.add(resultadosPanel);
            jPanelMain.repaint();
            jPanelMain.revalidate();     
            
    }}
        
    private void pintarAuditorio() {
        
        btnAuditorio.setIcon(new ImageIcon(getClass().getResource("/resources/icons/audiencia.png")));
        btnAuditorio.setText("Auditoria");
        btnAuditorio.setForeground(new java.awt.Color(255, 255, 255));
        
        JLabel vacioContador = new JLabel();
        jPanelAuditorio.setBackground(new java.awt.Color(17, 41, 63));
        jPanelAuditorio.setPreferredSize((new java.awt.Dimension(220, 35)));
        jPanelAuditorio.setLayout(new BorderLayout(20, 0));
        jPanelAuditorio.add(vacioContador, BorderLayout.WEST);
        jPanelAuditorio.add(btnAuditorio, BorderLayout.CENTER);
        jPanelMenu.add(jPanelAuditorio);
        
        btnAuditorio.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAuditorio.setText("Auditoria" + " - " + numero);
                System.out.println("Auditoria");
                ContadorAuditoria++;
                AudienciaCount = String.valueOf(ContadorAuditoria);
                
                Count();
                
                accionAuditorio();
                
            }});}
    
    private void accionAuditorio() {
        
        if(!haySesion){
            
            Sesion();
            return;
        }
        
        jLabelTop.setText("Auditoria");

        String[] ColumnNames = {"Apartados", "Usos"};
        contador = new String[7][2];

        contador[0][0] = "Home";
        contador[1][0] = "selecciones";
        contador[2][0] = "Resultados";
        contador[3][0] = "Dash Selecciones";
        contador[4][0] = "Dash Resultados";
        contador[5][0] = "Audiencia";
        contador[6][0] = "Sesión";
        
        contador[0][1] = MenuHomeCount;
        contador[1][1] = SeleccionesCount;
        contador[2][1] = ResultadosCount;
        contador[3][1] = DashSelCount;
        contador[4][1] = DashResCount;
        contador[5][1] = AudienciaCount;
        contador[6][1] = SesionCount;

        JTable table = new JTable(contador, ColumnNames);
        table.setRowHeight(20);

        JPanel contadorPanel = new JPanel();
        
        contadorPanel.setLayout(new BoxLayout(contadorPanel, BoxLayout.Y_AXIS));
        contadorPanel.setPreferredSize((new java.awt.Dimension(550, 450)));
        contadorPanel.setMaximumSize(jPanelRight.getPreferredSize());

        JScrollPane scrollPane = new JScrollPane(table);
        contadorPanel.add(scrollPane);

        jPanelMain.removeAll();
        jPanelMain.add(contadorPanel);
        jPanelMain.repaint();
        jPanelMain.revalidate();
        
    }
    
    private void pintarSesion(){
        
        btnSesion.setIcon(new ImageIcon(getClass().getResource("/resources/icons/audiencia.png")));
        btnSesion.setText("Inicio Sesión");
        btnSesion.setForeground(new java.awt.Color(255, 255, 255));
        
        JLabel vacioContador = new JLabel();
        
        jPanelSesion.setBackground(new java.awt.Color(17, 41, 63));
        jPanelSesion.setPreferredSize((new java.awt.Dimension(220, 35)));
        jPanelSesion.setLayout(new BorderLayout(20, 0));
        jPanelSesion.add(vacioContador, BorderLayout.WEST);
        jPanelSesion.add(btnSesion, BorderLayout.CENTER);
        jPanelMenu.add(jPanelSesion);
        
        btnSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSesion.setText("Sesión" + " - " + numero);
                System.out.println("Sesion");
                ContadorSesion++;
                SesionCount = String.valueOf(ContadorSesion);
                
                Count();
                
                if(ContadorSesion == 5){
                    
                    CountTable();
                    return;
                    }
                
                accionSesion();
                
            }});}
    
    
    
    private void accionSesion(){
        
        jLabelTop.setText("Inicio Sesión");
        
        JTextArea j = new JTextArea();
        
        j.setText("     Explicación:\n\n"
                + "     Iniciar Sesión:\n"
                + "     User: Mundial, Password: key\n\n"
                + " 1 - El repositorio original (ExamenAlgoritmos-master) se clonó y se subió a Git Hub(NO SE MODIFICÓ NADA).\n"
                + "      solo se hizo lo que pidió el profesor.\n"
                + " 2 - Yo opté por implementar la nueva funcion a este código para que se vea más completo.\n"
                + " 3 - Este código va ser el que se va a subir a Git Hub.\n"
                + " 4 - Está Agragado todo lo anterior del parcial(Apartado de Audiencias, nuevos Archivos csv para cargar\n"
                + "      en la tabla de los DashBoards e incluso lo que se pidió para este 3er Parcial.\n"
                + " 5 - Faltan ajustar algunos detalles como los son si en dado caso le dan al botón cancelar o a la (X)\n"
                + "      tengan agregada alguna función.\n"
                + " 6 - No se hizo exactamente lo que se pidió pero se hizo algunas cosas se realizaron algunas cosas\n"
                + "      complejas con otros métodos en resumen: Lo mismo pero Más barato;).\n"
                + " 7 - Autor: Jesús Rodriguez.");
        
        j.setPreferredSize((new java.awt.Dimension(600, 400)));
        
        jPanelMain.removeAll();
        jPanelMain.add(j);
        jPanelMain.repaint();
        jPanelMain.revalidate();
    }
    
    private void CountTable(){
        
        AudienciaCount = String.valueOf(ContadorAuditoria);
        
        if (ContadorAuditoria == 5) {
            
          opc = JOptionPane.showConfirmDialog(null, "Se Alcanzó Máximo de Intentos", "Atención", JOptionPane.DEFAULT_OPTION); 
        }
        
        if (opc == JOptionPane.YES_OPTION) {
            
            //System.exit(WIDTH);
            
            //setVisible(false); TODOS PARA CERRAR LA VENTANA
            
            //dispose();
            
            accionHome();
            
        }}
    
    private void Count(){
         
        /*
        JOptionPane.showMessageDialog(this, "Máximo de Intentos = 5 \n\n"
          + "Intetos Restantes = "+ numero, "Atención", HEIGHT);
        */
        
        count --;
        numero = String.valueOf(count);
        
        if (opcion.equals(opcion) && pass.equals(pass)) {
            
        if (ContadorMenuHome == 5 && ContadorSelecciones == 5 && ContadorResultados == 5 && ContadorDashSel == 5 && ContadorDashRes == 5 && ContadorAuditoria == 5 && ContadorSesion == 5) {
            
            JOptionPane.showMessageDialog(this, "Máximo de Intentos = 5 \n\n"
                    + "Intetos Restantes = "+ numero);
            
        }}}
    
    private void Sesion(){
        
        if(!haySesion){
            
            JOptionPane.showMessageDialog(this, "Inicio de Sesión Requerido");
            opcion = JOptionPane.showInputDialog(this, "Ingrese Usuario");
            pass = JOptionPane.showInputDialog(this, "Ingrese Contraseña");
        }
        
        if(opcion.equalsIgnoreCase("Mundial") && pass.equalsIgnoreCase("key")){
                
            JOptionPane.showMessageDialog(this, "Sesión Iniciada", "Atención", HEIGHT);
            
                haySesion = true;
        }
        
        if(opcion.isEmpty() || pass.isEmpty()){

                JOptionPane.showMessageDialog(this, "LLENE TODOS LOS ESPACIOS");
                
        }
    
        if(!opcion.equalsIgnoreCase(opcion) || !pass.equalsIgnoreCase(pass)){

                JOptionPane.showMessageDialog(this, "Usuario//Contraseña \n\n"
                        + "INCORRECTOS");
                
    }}
    
    private void pintarPanelIzquierdo() {
        
        jPanelMenu.setOpaque(false);
        jPanelLeft.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 3, Color.WHITE));
        jPanelLeft.setLayout(new BoxLayout(jPanelLeft, BoxLayout.Y_AXIS));
        jPanelLeft.setBackground(new java.awt.Color(0, 24, 47));
        
        getContentPane().add(jPanelLeft, java.awt.BorderLayout.LINE_START);
        
        jPanelLeft.add(jPanelMenu);
        jPanelLeft.setPreferredSize((new java.awt.Dimension(220, 540)));
        jPanelLeft.setMaximumSize( jPanelLeft.getPreferredSize());
        
    }

    public void cargarFileSelecciones() {
        
        JFileChooser cargarFile = new JFileChooser();
        cargarFile.showOpenDialog(cargarFile);

        Scanner entrada = null;
        try {

            String ruta = cargarFile.getSelectedFile().getAbsolutePath();
            
            File f = new File(ruta);
            entrada = new Scanner(f);

            selecciones = new String[32][5];
            
            entrada.nextLine();

            int i = 0;
            
            while (entrada.hasNext()) {
                System.out.println(i);
                String line = entrada.nextLine();
                String[] columns = line.split(",");

                for (int j = 0; j < columns.length; j++) {
                    selecciones[i][j] = columns[j];
                }
                
                i++;
            }

            pintarTablaSelecciones();

        } catch (FileNotFoundException e) {
            
            System.out.println(e.getMessage());
            
        } finally {
            
            if (entrada != null) {
                entrada.close();
                
            }}}
    
    public void pintarTablaSelecciones() {

        String[] columnNames = {"ID","Selección", "Continente", "DT", "Nacionalidad DT"};
        JTable table = new JTable(selecciones, columnNames);
        table.setRowHeight(35);
        
        JPanel form = new JPanel();
        form.setLayout(new GridLayout(2, 1, 0, 0));
        
        JPanel seleccionesPanel = new JPanel();
        seleccionesPanel.setLayout(new BoxLayout(seleccionesPanel, BoxLayout.Y_AXIS));
        seleccionesPanel.setPreferredSize((new java.awt.Dimension(550, 420)));
        seleccionesPanel.setMaximumSize( jPanelRight.getPreferredSize());
        
        JScrollPane scrollPane = new JScrollPane(table);
        seleccionesPanel.add(form);
        seleccionesPanel.add(scrollPane);
        
        jPanelMain.removeAll();
        jPanelMain.add(seleccionesPanel, BorderLayout.PAGE_START);
        jPanelMain.repaint();
        jPanelMain.revalidate();
        
    }
    
     public void cargarFileDashSelecciones() {
 
        JFileChooser cargarFile = new JFileChooser();
        cargarFile.showOpenDialog(cargarFile);

        Scanner entrada = null;
        try {
         
            String ruta = cargarFile.getSelectedFile().getAbsolutePath();
            
            File f = new File(ruta);
            entrada = new Scanner(f);

            Dash_selecciones = new String[4][5];
            
            entrada.nextLine();

            int i = 0;
            
            while (entrada.hasNext()) {
                System.out.println(i);
                String line = entrada.nextLine();
                String[] columns = line.split(",");

                for (int j = 0; j < columns.length; j++) {
                    Dash_selecciones[i][j] = columns[j];
                }
                
                i++;
            }

            pintarTablaDashSelecciones();

        } catch (FileNotFoundException e) {
            
            System.out.println(e.getMessage());
        } finally {
            
            if (entrada != null) {
                
                entrada.close();
                
            }}}
     
     public void pintarTablaDashSelecciones() {

        String[] columnNames = {"Partidos Cargados","Promedio Goles/Partido","Partido con Más/Menos Goles","N° Partidos Ganados","N° Partidos Empatados"}; //5
        
        JTable table = new JTable(Dash_selecciones, columnNames);
        table.setRowHeight(35);
        
        JPanel DashSelPanel = new JPanel();
        DashSelPanel.setLayout(new BoxLayout(DashSelPanel, BoxLayout.Y_AXIS));
        DashSelPanel.setPreferredSize((new java.awt.Dimension(550, 420)));
        DashSelPanel.setMaximumSize( jPanelRight.getPreferredSize());
        
        JScrollPane scrollPane = new JScrollPane(table);
        DashSelPanel.add(scrollPane);
        
        jPanelMain.removeAll();
        jPanelMain.add(DashSelPanel);
        jPanelMain.repaint();
        jPanelMain.revalidate();
        
    }
    
    public void cargarFileDashResultados() {

        JFileChooser cargarFile = new JFileChooser();
        cargarFile.showOpenDialog(cargarFile);

        Scanner entrada = null;
        try {
           
            String ruta = cargarFile.getSelectedFile().getAbsolutePath();
            
            File f = new File(ruta);
            entrada = new Scanner(f);

            Dash_res = new String[3][6];
            entrada.nextLine();

            int i = 0;
            
            while (entrada.hasNext()) {
                System.out.println(i);
                String line = entrada.nextLine();
                String[] columns = line.split(",");

                for (int j = 0; j < columns.length; j++) {
                    Dash_res[i][j] = columns[j];
                }
                
                i++;
            }

            pintarTablaDashResultados();

        } catch (FileNotFoundException e) {
            
            System.out.println(e.getMessage());
            
        } finally {
            
            if (entrada != null) {
                
                entrada.close();
                
            }}}
     
    public void pintarTablaDashResultados() {

        String[] columnNames = {"Selecciones con Más Goles", "Selecciones con Menos Goles", "Selección con Más Puntos", "Selección con Menos Puntos", "Continente con Más Goles", "Continente con Menos Goles"}; //6
        
        JTable table = new JTable(Dash_res, columnNames);
        table.setRowHeight(35);
        
        JPanel DashResPanel = new JPanel();
        DashResPanel.setLayout(new BoxLayout(DashResPanel, BoxLayout.Y_AXIS));
        DashResPanel.setPreferredSize((new java.awt.Dimension(550, 420)));
        DashResPanel.setMaximumSize( jPanelRight.getPreferredSize());
        
        JScrollPane scrollPane = new JScrollPane(table);
        DashResPanel.add(scrollPane);
        
        jPanelMain.removeAll();
        jPanelMain.add(DashResPanel, BorderLayout.PAGE_START);
        jPanelMain.repaint();
        jPanelMain.revalidate();
        
    }
    
    public void cargarFileResultados() {

        JFileChooser cargarFile = new JFileChooser();
        cargarFile.showOpenDialog(cargarFile);

        Scanner entrada = null;
        try {
           
            String ruta = cargarFile.getSelectedFile().getAbsolutePath();

            File f = new File(ruta);
            entrada = new Scanner(f);

            resultados = new String[48][7];
            entrada.nextLine();

            int i = 0;
            
            while (entrada.hasNext()) {
                System.out.println(i);
                String line = entrada.nextLine();
                String[] columns = line.split(",");

                for (int j = 0; j < columns.length; j++) {
                    resultados[i][j] = columns[j];
                }
                
                i++;
            }

            pintarTablaResultados();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (entrada != null) {
                entrada.close();
                
            }}}
    
    public void pintarTablaResultados() {

       String[] columnNames = {"Grupo","Local", "Visitante", "Continente L", "Continente V", "Goles L", "Goles V"};
        JTable table = new JTable(resultados, columnNames);
        table.setRowHeight(35);
        
        JPanel seleccionesPanel = new JPanel();
        seleccionesPanel.setLayout(new BoxLayout(seleccionesPanel, BoxLayout.Y_AXIS));
        seleccionesPanel.setPreferredSize((new java.awt.Dimension(550, 420)));
        seleccionesPanel.setMaximumSize( jPanelRight.getPreferredSize());
        
        JScrollPane scrollPane = new JScrollPane(table);
        seleccionesPanel.add(scrollPane);
        
        jPanelMain.removeAll();
        jPanelMain.add(seleccionesPanel, BorderLayout.PAGE_START);
        jPanelMain.repaint();
        jPanelMain.revalidate();
        
    }
    
    private void pintarPanelDerecho() {
        
        jPanelMain.setPreferredSize((new java.awt.Dimension(620, 420)));
        jPanelMain.setMaximumSize(jPanelLabelTop.getPreferredSize());
        
        getContentPane().add(jPanelRight, java.awt.BorderLayout.CENTER);
        jPanelRight.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        jPanelRight.add(jPanelLabelTop, BorderLayout.LINE_START);
        jPanelRight.add(jPanelMain);
        jPanelRight.setPreferredSize((new java.awt.Dimension(620, 540)));
        jPanelRight.setMaximumSize( jPanelRight.getPreferredSize());
        
    }
    
    private void pintarLabelTop() {
        
        jLabelTop = new JLabel();
        jLabelTop.setFont(new java.awt.Font("Liberation Sans", 1, 36));
        jLabelTop.setForeground(new java.awt.Color(241, 241, 241));
        jLabelTop.setText("Home");
        
        JLabel vacioTopLabel = new JLabel();
        jPanelLabelTop.setLayout(new BorderLayout(15, 0));
        jPanelLabelTop.add(vacioTopLabel, BorderLayout.WEST);
        jPanelLabelTop.setBackground(new java.awt.Color(18, 119, 217));
        jPanelLabelTop.add(jLabelTop, BorderLayout.CENTER);
        jPanelLabelTop.setPreferredSize((new java.awt.Dimension(620, 120)));
        jPanelLabelTop.setMaximumSize(jPanelLabelTop.getPreferredSize());
        
    }
  
public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proyecto().setVisible(true);
                
            }});}}