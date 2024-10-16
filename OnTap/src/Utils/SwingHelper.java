/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.util.ArrayList;
import java.util.function.Function;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thnrg
 * @param <Data>
 * @param <Item>
 */
public class SwingHelper<Data extends DAO<Item>, Item> 
{
    protected Data data;
    
    public SwingHelper (Data daoObject)
    {
        this.data = daoObject;
    }
    
    public SHelper isID(Function<? super Item, String> idGetter, String string)
    {
        if(string.equals("")){return SHelper.EMPTY_ERROR;}
        if(data.findIndex(idGetter, string) != -1) {return SHelper.ALREADY_EXIST_ERROR;}
        return SHelper.TRUE;
    }
    
    public SHelper isName(String string)
    {
        if(string.equals("")){return SHelper.EMPTY_ERROR;}
        return SHelper.TRUE;
    }
    
    public SHelper isPrice(String string)
    {
        if(string.equals("")){return SHelper.EMPTY_ERROR;}
        if(!Tools.isDouble(string)){return SHelper.NAN_ERROR;}
        if(Double.parseDouble(string) < 0){return SHelper.NEGATIVE_NUMBER_ERROR;}
        return SHelper.TRUE;
    }
    
    public boolean isIDResolve(Function<? super Item, String> idGetter, JTextField txtField, JFrame parentComponent, String emptyError, String alreadyExistError)
    {
        switch(isID(idGetter, txtField.getText()))
        {
            case SHelper.EMPTY_ERROR -> txtErrorDialogue(txtField, parentComponent, emptyError);
            case SHelper.ALREADY_EXIST_ERROR -> txtErrorDialogue(txtField, parentComponent, alreadyExistError);
            case SHelper.TRUE -> {return true;}
        }
        return false;
    }
    
    public boolean isNameResolve(JTextField txtField, JFrame parentComponent, String emptyError)
    {
        switch(isName(txtField.getText()))
        {
            case SHelper.EMPTY_ERROR -> txtErrorDialogue(txtField, parentComponent, emptyError);
            case SHelper.TRUE -> {return true;}
        }
        return false;
    }
    
    public boolean isPriceResolve(JTextField txtField, JFrame parentComponent, String emptyError, String nanError, String negativeNumberError)
    {
        switch(isPrice(txtField.getText()))
        {
            case SHelper.EMPTY_ERROR -> txtErrorDialogue(txtField, parentComponent, emptyError);
            case SHelper.NAN_ERROR -> txtErrorDialogue(txtField, parentComponent, nanError);
            case SHelper.NEGATIVE_NUMBER_ERROR -> txtErrorDialogue(txtField, parentComponent, negativeNumberError);
            case SHelper.TRUE -> {return true;}
        }
        return false;
    }
    
    public void txtErrorDialogue(JTextField txtField, JFrame parentComponent, String errorMessage)
    {
        JOptionPane.showMessageDialog(parentComponent, errorMessage, "Warning", JOptionPane.WARNING_MESSAGE);
        txtField.requestFocus();
    }
    
    public DefaultTableModel getTblModel(DefaultTableModel model, ArrayList<Item> list)
    {
        model.setRowCount(0);
        for (Item item : list)
        {
            model.addRow(data.getDataAsObjectArray(item));
        }
        return model;
    }
    
    public DefaultTableModel getTblModel(ArrayList<Item> list)
    {
        return getTblModel(new DefaultTableModel(), list);
    }
    
    public DefaultTableModel getTblModel(DefaultTableModel baseModel)
    {
        return getTblModel(baseModel, data.getItems());
    }
    
    public DefaultTableModel getTblModel()
    {
        return getTblModel(new DefaultTableModel());
    }
    
    public DefaultTableModel getTblModelFiltered(DefaultTableModel baseModel, Function<? super Item, String> getter, String filter)
    {
        DefaultTableModel model = baseModel;
        
        ArrayList<Item> list = data.findHasFilter(getter, filter);
        if(!list.isEmpty())
        {
            return getTblModel(model, list);
        }
        return null;
    }
    
    public DefaultTableModel getTblModelFiltered(Function<? super Item, String> getter, String filter)
    {
        return getTblModelFiltered(new DefaultTableModel(), getter, filter);
    }
    
    public void loadToTable(JTable tbl)
    {
        tbl.setModel(getTblModel((DefaultTableModel) tbl.getModel()));
    }
    
    public SHelper loadToTableFiltered(JTable tbl, Function<? super Item, String> getter, String filter)
    {
        DefaultTableModel model = getTblModelFiltered((DefaultTableModel) tbl.getModel(), getter, filter);
        if(model == null)
        {
            return SHelper.NOT_FOUND_ERROR;
        }
        tbl.setModel(model);
        return SHelper.TRUE;
    }
}
