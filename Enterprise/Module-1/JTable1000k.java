package Enterprise;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by ZahornyiAI on 06.07.2016.
 */
public class JTable1000k {
    Object[] headers = { " ", "add", "get", "remove", "contains ", "populate", "iterator.add", "iterator.remove" };

    ArrayList1000k arrayList1000k = new ArrayList1000k();
    ArrayList arrayList = arrayList1000k.resultArrayList();

    LinkedList1000k linkedList1000k = new LinkedList1000k();
    ArrayList linkedList = linkedList1000k.resultLinkedList();

    HashSet1000k hashSet1000k = new HashSet1000k();
    ArrayList hashSet = hashSet1000k.resultHashSet();

    TreeSet1000k treeSet1000k = new TreeSet1000k();
    ArrayList treeSet = treeSet1000k.resultHashSet();

    Object[][] data = {{arrayList.get(0),arrayList.get(1),arrayList.get(2),arrayList.get(3),arrayList.get(4),arrayList.get(5),arrayList.get(6),arrayList.get(7)},
            {linkedList.get(0),linkedList.get(1),linkedList.get(2),linkedList.get(3),linkedList.get(4),linkedList.get(5),linkedList.get(6),linkedList.get(7)},
            {hashSet.get(0),hashSet.get(1),hashSet.get(2),hashSet.get(3),hashSet.get(4),hashSet.get(5),hashSet.get(6),hashSet.get(7)},
            {treeSet.get(0),treeSet.get(1),treeSet.get(2),treeSet.get(3),treeSet.get(4),treeSet.get(5),treeSet.get(6),treeSet.get(7)}};


    JTable jTabCalc1000k;

    JTable1000k() throws IOException {

        JFrame jfrm = new JFrame("JTable1000k");
        jfrm.getContentPane().setLayout(new FlowLayout());
        jfrm.setSize(800, 400);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jTabCalc1000k = new JTable(data, headers);
        JScrollPane jscrlp = new JScrollPane(jTabCalc1000k);
        jTabCalc1000k.setPreferredScrollableViewportSize(new Dimension(700, 300));
        jfrm.getContentPane().add(jscrlp);
        jfrm.setVisible(true);

        File file = new File("result1000K.xls");

        TableModel model = jTabCalc1000k.getModel();
        FileWriter excel = new FileWriter(file);

        for(int i = 0; i < model.getColumnCount(); i++){
            excel.write(model.getColumnName(i) + "\t");
        }

        excel.write("\n");

        for(int i=0; i< model.getRowCount(); i++) {
            for(int j=0; j < model.getColumnCount(); j++) {
                excel.write(model.getValueAt(i,j).toString()+"\t");
            }
            excel.write("\n");
        }

        excel.close();}



    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new JTable1000k();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
