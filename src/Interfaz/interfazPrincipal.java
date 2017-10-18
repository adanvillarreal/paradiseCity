package Interfaz;

import javax.swing.*;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class interfazPrincipal {

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
    }
}
