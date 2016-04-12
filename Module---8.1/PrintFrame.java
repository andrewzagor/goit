package TableCollection;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by ZahornyiAI on 12.04.2016.
 */
public class PrintFrame extends JFrame {
    public PrintFrame() {
        super("Тестовое окно");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ArrayList<MusInstr> musInstrs = new ArrayList<MusInstr>();
        musInstrs.add(new TableCollection.Guitar("Guitar",  34, 780));
        musInstrs.add(new TableCollection.Piano("Piano", 12, 2390));
        musInstrs.add(new TableCollection.Flute("Flute",  24,  1370));
        musInstrs.add(new TableCollection.Trumpet("Trumpet", 19, 520));
        musInstrs.add(new TableCollection.Guitar("Guitar",  158, 580));
        musInstrs.add(new TableCollection.Flute("Flute",  2,  5890));

        TablePrint model = new TablePrint(musInstrs);

        JTable table = new JTable(model);

        getContentPane().add(new JScrollPane(table));

        setPreferredSize(new Dimension(260, 220));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args) {

            javax.swing.SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JFrame.setDefaultLookAndFeelDecorated(true);
                    new PrintFrame();
                }
            });
    }}
