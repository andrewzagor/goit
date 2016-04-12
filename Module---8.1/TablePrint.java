package TableCollection;

import CollectionMusicInstrument.*;
import CollectionMusicInstrument.Flute;
import CollectionMusicInstrument.Piano;
import CollectionMusicInstrument.Trumpet;

import javax.swing.*;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ZahornyiAI on 12.04.2016.
 */
public class TablePrint implements TableModel {

    private Set<TableModelListener> listeners = new HashSet<TableModelListener>();

    private List<MusInstr> musinsts;

    public TablePrint(List<MusInstr> musinsts ) {
        this.musinsts = musinsts;
    }

    public Class getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public int getColumnCount() {
        return 3;
    }

    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Имя";
            case 1:
                return "Количесвто";
            case 2:
                return "Цена";
        }
        return "";
    }

    public int getRowCount() {
        return musinsts.size();
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        MusInstr musinstr = musinsts.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return musinstr.getName();
            case 1:
                return musinstr.getQuantity();
            case 2:
                return musinstr.getPrice();
        }
        return "";
    }
   public void setValueAt(Object value, int rowIndex, int columnIndex) {
    }

    @Override
    public void addTableModelListener(TableModelListener listener) {
        listeners.remove(listener);
    }

    @Override
    public void removeTableModelListener(TableModelListener listener) {
        listeners.remove(listener);
    }

}

