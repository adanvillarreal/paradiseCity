package Interfaz;

import javax.swing.*;
import java.awt.*;

public class interfazPrincipal extends JFrame{
    private JPanel pnPanel0;
    private JTabbedPane tbpTabbedPane0;

    private JPanel pnPanel1;
    private JLabel lbLbDiasMedicamento;
    private JTextField tfTfDiasMedicamento;
    private JTable tbTbNotif;

    private JPanel pnPanel2;
    private JLabel lbLbDiaReporte;
    private JTextField tfText1;
    private JButton btBtDiaAnterior;
    private JButton btBtDiaSiguiente;
    private JTable tbTable1;


    private JPanel pnTabAlta;

    private JPanel pnAltaMasiva;
    private ButtonGroup rbgPanel16;
    private JToggleButton tbtBtnAltaMasiva;

    private JPanel pnAltaIndividual;
    private ButtonGroup rbgAltaIndividual;
    private JLabel lbLbNombreAltaR;
    private JLabel lbLbCuartoAltaR;
    private JLabel lbLbCamaAltaR;
    private JLabel lbLbCondicionesAltaR;
    private JLabel lbLbEdadAltaR;
    private JLabel lbLbFamiliarAltaR;
    private JLabel lbLbTelefonoAltaR;
    private JToggleButton tbtBtnAnadirFam;
    private JTextField tfTfNombreAltaR;
    private JTextField tfTfCuartoAltaR;
    private JTextField tfTfCamaAltaR;
    private JTextField tfTfEdadAltaR;
    private JTextField tfTfCondicionesAltaR;
    private JTextField tfTfFamiliarAltaR;
    private JTextField tfTfTelefonoAltaR;

    public interfazPrincipal(){
        this.initialize();
        this.setSize(600,400);
        this.pack();
        this.setVisible(true);
    }

    private void initialize() {
        pnPanel0 = new JPanel();
        GridBagLayout gbPanel0 = new GridBagLayout();
        GridBagConstraints gbcPanel0 = new GridBagConstraints();
        pnPanel0.setLayout(gbPanel0);

        tbpTabbedPane0 = new JTabbedPane();

        pnPanel1 = new JPanel();
        GridBagLayout gbPanel1 = new GridBagLayout();
        GridBagConstraints gbcPanel1 = new GridBagConstraints();
        pnPanel1.setLayout(gbPanel1);

        lbLbDiasMedicamento = new JLabel( "Días para que se acabe el medicamento: "  );
        gbcPanel1.gridx = 1;
        gbcPanel1.gridy = 0;
        gbcPanel1.gridwidth = 1;
        gbcPanel1.gridheight = 1;
        gbcPanel1.fill = GridBagConstraints.VERTICAL;
        gbcPanel1.weightx = 1;
        gbcPanel1.weighty = 0;
        gbcPanel1.anchor = GridBagConstraints.EAST;
        gbcPanel1.insets = new Insets( 30,30,0,0 );
        gbPanel1.setConstraints( lbLbDiasMedicamento, gbcPanel1 );
        pnPanel1.add( lbLbDiasMedicamento );


        tfTfDiasMedicamento = new JTextField();
        tfTfDiasMedicamento.setColumns(5);
        gbcPanel1.gridx = 2;
        gbcPanel1.gridy = 0;
        gbcPanel1.gridwidth = 1;
        gbcPanel1.gridheight = 1;
        gbcPanel1.fill = GridBagConstraints.NONE;
        gbcPanel1.weightx = 1;
        gbcPanel1.weighty = 0;
        gbcPanel1.anchor = GridBagConstraints.WEST;
        gbcPanel1.insets = new Insets(30, 20, 0, 0);
        gbPanel1.setConstraints(tfTfDiasMedicamento, gbcPanel1);
        pnPanel1.add(tfTfDiasMedicamento);


        String[][] dataTbNotif = new String[][]{new String[]{"11", "21"},
                new String[]{"12", "22"},
                new String[]{"13", "23"}};
        String[] colsTbNotif = new String[]{"", ""};
        tbTbNotif = new JTable(dataTbNotif, colsTbNotif);
        JScrollPane scpTbNotif = new JScrollPane(tbTbNotif);
        gbcPanel1.gridx = 1;
        gbcPanel1.gridy = 9;
        gbcPanel1.gridwidth = 12;
        gbcPanel1.gridheight = 8;
        gbcPanel1.fill = GridBagConstraints.BOTH;
        gbcPanel1.weightx = 1;
        gbcPanel1.weighty = 1;
        gbcPanel1.anchor = GridBagConstraints.NORTH;
        gbcPanel1.insets = new Insets(30, 30, 50, 30);
        gbPanel1.setConstraints(scpTbNotif, gbcPanel1);
        pnPanel1.add(scpTbNotif);
        tbpTabbedPane0.addTab("Notificaciones", pnPanel1);

        pnPanel2 = new JPanel();
        GridBagLayout gbPanel2 = new GridBagLayout();
        GridBagConstraints gbcPanel2 = new GridBagConstraints();
        pnPanel2.setLayout(gbPanel2);

        lbLbDiaReporte = new JLabel( "Día del reporte: "  );
        gbcPanel2.gridx = 6;
        gbcPanel2.gridy = 0;
        gbcPanel2.gridwidth = 1;
        gbcPanel2.gridheight = 1;
        gbcPanel2.fill = GridBagConstraints.VERTICAL;
        gbcPanel2.weightx = 1;
        gbcPanel2.weighty = 0;
        gbcPanel2.anchor = GridBagConstraints.EAST;
        gbcPanel2.insets = new Insets( 30,30,0,0 );
        gbPanel2.setConstraints( lbLbDiaReporte, gbcPanel2 );
        pnPanel2.add( lbLbDiaReporte );


        tfText1 = new JTextField();
        tfText1.setColumns(5);
        gbcPanel2.gridx = 7;
        gbcPanel2.gridy = 0;
        gbcPanel2.gridwidth = 1;
        gbcPanel2.gridheight = 1;
        gbcPanel2.fill = GridBagConstraints.NONE;
        gbcPanel2.weightx = 1;
        gbcPanel2.weighty = 0;
        gbcPanel2.anchor = GridBagConstraints.WEST;
        gbcPanel2.insets = new Insets(30, 20, 0, 0);
        gbPanel2.setConstraints(tfText1, gbcPanel2);
        pnPanel2.add(tfText1);

        btBtDiaAnterior = new JButton("Día anterior");
        gbcPanel2.gridx = 6;
        gbcPanel2.gridy = 3;
        gbcPanel2.gridwidth = 1;
        gbcPanel2.gridheight = 1;
        gbcPanel2.fill = GridBagConstraints.NONE;
        gbcPanel2.weightx = 1;
        gbcPanel2.weighty = 0;
        gbcPanel2.anchor = GridBagConstraints.WEST;
        gbcPanel2.insets = new Insets(40, 30, 0, 0);
        gbPanel2.setConstraints(btBtDiaAnterior, gbcPanel2);
        pnPanel2.add(btBtDiaAnterior);

        btBtDiaSiguiente = new JButton("Día siguiente");
        gbcPanel2.gridx = 19;
        gbcPanel2.gridy = 3;
        gbcPanel2.gridwidth = 6;
        gbcPanel2.gridheight = 1;
        gbcPanel2.fill = GridBagConstraints.NONE;
        gbcPanel2.weightx = 1;
        gbcPanel2.weighty = 0;
        gbcPanel2.anchor = GridBagConstraints.EAST;
        gbcPanel2.insets = new Insets(40, 0, 0, 30);
        gbPanel2.setConstraints(btBtDiaSiguiente, gbcPanel2);
        pnPanel2.add(btBtDiaSiguiente);

        String[][] dataTable1 = new String[][]{new String[]{"11", "21"},
                new String[]{"12", "22"},
                new String[]{"13", "23"}};
        String[] colsTable1 = new String[]{"", ""};
        tbTable1 = new JTable(dataTable1, colsTable1);
        JScrollPane scpTable1 = new JScrollPane(tbTable1);
        gbcPanel2.gridx = 6;
        gbcPanel2.gridy = 6;
        gbcPanel2.gridwidth = 19;
        gbcPanel2.gridheight = 7;
        gbcPanel2.fill = GridBagConstraints.BOTH;
        gbcPanel2.weightx = 1;
        gbcPanel2.weighty = 1;
        gbcPanel2.anchor = GridBagConstraints.NORTH;
        gbcPanel2.insets = new Insets(30, 30, 50, 30);
        gbPanel2.setConstraints(scpTable1, gbcPanel2);
        pnPanel2.add(scpTable1);
        tbpTabbedPane0.addTab("Reportes", pnPanel2);

        /*
        gbcPanel0.gridx = 0;
        gbcPanel0.gridy = 0;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 1;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints(tbpTabbedPane0, gbcPanel0);
        pnPanel0.add(tbpTabbedPane0);

        */
        /////////////////////////////////////////////////////////////

        pnTabAlta = new JPanel();
        GridBagLayout gbTabAlta = new GridBagLayout();
        GridBagConstraints gbcTabAlta = new GridBagConstraints();
        pnTabAlta.setLayout( gbTabAlta );

        pnAltaMasiva = new JPanel();
        pnAltaMasiva.setBorder( BorderFactory.createTitledBorder( "Alta Masiva" ) );
        rbgPanel16 = new ButtonGroup();
        GridBagLayout gbAltaMasiva = new GridBagLayout();
        GridBagConstraints gbcPanel16 = new GridBagConstraints();
        pnAltaMasiva.setLayout( gbAltaMasiva );

        tbtBtnAltaMasiva = new JToggleButton( "Seleccionar Archivo"  );
        rbgPanel16.add( tbtBtnAltaMasiva );
        gbcPanel16.gridx = 0;
        gbcPanel16.gridy = 4;
        gbcPanel16.gridwidth = 14;
        gbcPanel16.gridheight = 3;
        gbcPanel16.fill = GridBagConstraints.NONE;
        gbcPanel16.weightx = 1;
        gbcPanel16.weighty = 0;
        gbcPanel16.anchor = GridBagConstraints.NORTH;
        gbcPanel16.insets = new Insets( 10,10,10,10 );
        gbAltaMasiva.setConstraints( tbtBtnAltaMasiva, gbcPanel16 );
        pnAltaMasiva.add( tbtBtnAltaMasiva );


        gbcTabAlta.gridx = 0;
        gbcTabAlta.gridy = 0;
        gbcTabAlta.gridwidth = 34;
        gbcTabAlta.gridheight = 7;
        gbcTabAlta.fill = GridBagConstraints.NONE;
        gbcTabAlta.weightx = 1;
        gbcTabAlta.weighty = 0;
        gbcTabAlta.anchor = GridBagConstraints.WEST;
        gbcTabAlta.insets = new Insets( 30,30,0,0 );
        gbTabAlta.setConstraints( pnAltaMasiva, gbcTabAlta );
        pnTabAlta.add( pnAltaMasiva );

        pnAltaIndividual = new JPanel();
        pnAltaIndividual.setBorder( BorderFactory.createTitledBorder( "Alta Individual" ) );
        rbgAltaIndividual = new ButtonGroup();
        GridBagLayout gbAltaIndividual = new GridBagLayout();
        GridBagConstraints gbcAltaIndividual = new GridBagConstraints();
        pnAltaIndividual.setLayout( gbAltaIndividual );

        lbLbNombreAltaR = new JLabel( "Nombre:"  );
        lbLbNombreAltaR.setHorizontalAlignment( 0 );
        gbcAltaIndividual.gridx = 0;
        gbcAltaIndividual.gridy = 4;
        gbcAltaIndividual.gridwidth = 9;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.NONE;
        gbcAltaIndividual.weightx = 0;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 10,10,10,0 );
        gbAltaIndividual.setConstraints( lbLbNombreAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( lbLbNombreAltaR );

        lbLbCuartoAltaR = new JLabel( "Cuarto: "  );
        lbLbCuartoAltaR.setHorizontalAlignment( 0 );
        gbcAltaIndividual.gridx = 0;
        gbcAltaIndividual.gridy = 7;
        gbcAltaIndividual.gridwidth = 9;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.NONE;
        gbcAltaIndividual.weightx = 0;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,10,10,0 );
        gbAltaIndividual.setConstraints( lbLbCuartoAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( lbLbCuartoAltaR );

        lbLbCamaAltaR = new JLabel( "Cama: "  );
        lbLbCamaAltaR.setHorizontalAlignment( 0 );
        gbcAltaIndividual.gridx = 0;
        gbcAltaIndividual.gridy = 10;
        gbcAltaIndividual.gridwidth = 9;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.NONE;
        gbcAltaIndividual.weightx = 0;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,10,10,0 );
        gbAltaIndividual.setConstraints( lbLbCamaAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( lbLbCamaAltaR );

        lbLbEdadAltaR = new JLabel( "Edad: "  );
        lbLbEdadAltaR.setHorizontalAlignment( 0 );
        gbcAltaIndividual.gridx = 0;
        gbcAltaIndividual.gridy = 13;
        gbcAltaIndividual.gridwidth = 9;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.NONE;
        gbcAltaIndividual.weightx = 0;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,10,10,0 );
        gbAltaIndividual.setConstraints( lbLbEdadAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( lbLbEdadAltaR );

        lbLbCondicionesAltaR = new JLabel( "Condiciones: "  );
        lbLbCondicionesAltaR.setHorizontalAlignment( 0 );
        gbcAltaIndividual.gridx = 0;
        gbcAltaIndividual.gridy = 16;
        gbcAltaIndividual.gridwidth = 9;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.NONE;
        gbcAltaIndividual.weightx = 0;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,10,10,0 );
        gbAltaIndividual.setConstraints( lbLbCondicionesAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( lbLbCondicionesAltaR );

        lbLbFamiliarAltaR = new JLabel( "Familiar: "  );
        lbLbFamiliarAltaR.setHorizontalAlignment( 0 );
        gbcAltaIndividual.gridx = 0;
        gbcAltaIndividual.gridy = 19;
        gbcAltaIndividual.gridwidth = 9;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.NONE;
        gbcAltaIndividual.weightx = 0;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,10,10,0 );
        gbAltaIndividual.setConstraints( lbLbFamiliarAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( lbLbFamiliarAltaR );

        lbLbTelefonoAltaR = new JLabel( "Teléfono: "  );
        lbLbTelefonoAltaR.setHorizontalAlignment( 0 );
        gbcAltaIndividual.gridx = 0;
        gbcAltaIndividual.gridy = 22;
        gbcAltaIndividual.gridwidth = 9;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.NONE;
        gbcAltaIndividual.weightx = 0;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,10,10,0 );
        gbAltaIndividual.setConstraints( lbLbTelefonoAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( lbLbTelefonoAltaR );

        tbtBtnAnadirFam = new JToggleButton( "Añadir Familiar"  );
        rbgAltaIndividual.add( tbtBtnAnadirFam );
        gbcAltaIndividual.gridx = 0;
        gbcAltaIndividual.gridy = 26;
        gbcAltaIndividual.gridwidth = 9;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.NONE;
        gbcAltaIndividual.weightx = 1;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.NORTH;
        gbcAltaIndividual.insets = new Insets( 0,10,10,0 );
        gbAltaIndividual.setConstraints( tbtBtnAnadirFam, gbcAltaIndividual );
        pnAltaIndividual.add( tbtBtnAnadirFam );

        tfTfNombreAltaR = new JTextField( );
        tfTfNombreAltaR.setColumns( 20 );
        gbcAltaIndividual.gridx = 9;
        gbcAltaIndividual.gridy = 3;
        gbcAltaIndividual.gridwidth = 7;
        gbcAltaIndividual.gridheight = 4;
        gbcAltaIndividual.fill = GridBagConstraints.HORIZONTAL;
        gbcAltaIndividual.weightx = 1;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 10,0,10,10 );
        gbAltaIndividual.setConstraints( tfTfNombreAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( tfTfNombreAltaR );

        tfTfCuartoAltaR = new JTextField( );
        gbcAltaIndividual.gridx = 9;
        gbcAltaIndividual.gridy = 7;
        gbcAltaIndividual.gridwidth = 7;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.HORIZONTAL;
        gbcAltaIndividual.weightx = 1;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,0,10,10 );
        gbAltaIndividual.setConstraints( tfTfCuartoAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( tfTfCuartoAltaR );

        tfTfCamaAltaR = new JTextField( );
        gbcAltaIndividual.gridx = 9;
        gbcAltaIndividual.gridy = 10;
        gbcAltaIndividual.gridwidth = 7;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.HORIZONTAL;
        gbcAltaIndividual.weightx = 1;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,0,10,10 );
        gbAltaIndividual.setConstraints( tfTfCamaAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( tfTfCamaAltaR );

        tfTfEdadAltaR = new JTextField( );
        gbcAltaIndividual.gridx = 9;
        gbcAltaIndividual.gridy = 13;
        gbcAltaIndividual.gridwidth = 7;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.HORIZONTAL;
        gbcAltaIndividual.weightx = 1;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,0,10,10 );
        gbAltaIndividual.setConstraints( tfTfEdadAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( tfTfEdadAltaR );

        tfTfCondicionesAltaR = new JTextField( );
        gbcAltaIndividual.gridx = 9;
        gbcAltaIndividual.gridy = 16;
        gbcAltaIndividual.gridwidth = 7;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.HORIZONTAL;
        gbcAltaIndividual.weightx = 1;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,0,10,10 );
        gbAltaIndividual.setConstraints( tfTfCondicionesAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( tfTfCondicionesAltaR );

        tfTfFamiliarAltaR = new JTextField( );
        gbcAltaIndividual.gridx = 9;
        gbcAltaIndividual.gridy = 19;
        gbcAltaIndividual.gridwidth = 7;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.HORIZONTAL;
        gbcAltaIndividual.weightx = 1;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,0,10,10 );
        gbAltaIndividual.setConstraints( tfTfFamiliarAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( tfTfFamiliarAltaR );

        tfTfTelefonoAltaR = new JTextField( );
        gbcAltaIndividual.gridx = 9;
        gbcAltaIndividual.gridy = 22;
        gbcAltaIndividual.gridwidth = 7;
        gbcAltaIndividual.gridheight = 3;
        gbcAltaIndividual.fill = GridBagConstraints.HORIZONTAL;
        gbcAltaIndividual.weightx = 1;
        gbcAltaIndividual.weighty = 0;
        gbcAltaIndividual.anchor = GridBagConstraints.WEST;
        gbcAltaIndividual.insets = new Insets( 0,0,10,10 );
        gbAltaIndividual.setConstraints( tfTfTelefonoAltaR, gbcAltaIndividual );
        pnAltaIndividual.add( tfTfTelefonoAltaR );


        //////////////////////////////////////////////////

        gbcTabAlta.gridx = 0;
        gbcTabAlta.gridy = 8;
        gbcTabAlta.gridwidth = 35;
        gbcTabAlta.gridheight = 37;
        gbcTabAlta.fill = GridBagConstraints.NONE;
        gbcTabAlta.weightx = 1;
        gbcTabAlta.weighty = 0;
        gbcTabAlta.anchor = GridBagConstraints.WEST;
        gbcTabAlta.insets = new Insets( 30,30,0,0 );
        gbTabAlta.setConstraints( pnAltaIndividual, gbcTabAlta );
        pnTabAlta.add( pnAltaIndividual );
        tbpTabbedPane0.addTab("Alta de Residentes",pnTabAlta);


        gbcPanel0.gridx = 0;
        gbcPanel0.gridy = 0;
        gbcPanel0.gridwidth = 1;
        gbcPanel0.gridheight = 1;
        gbcPanel0.fill = GridBagConstraints.BOTH;
        gbcPanel0.weightx = 1;
        gbcPanel0.weighty = 1;
        gbcPanel0.anchor = GridBagConstraints.NORTH;
        gbPanel0.setConstraints( tbpTabbedPane0, gbcPanel0 );
        pnPanel0.add( tbpTabbedPane0 );



        this.add(pnPanel0);
    }
}
