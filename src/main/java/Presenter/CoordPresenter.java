package Presenter;

import Model.Colet;
import Model.ColetRepository;
import Model.ColetRepositoryImpl;
import View.CoordView;
import View.ICoordView;

import javax.swing.*;

public class CoordPresenter {
    ColetRepository coletRepository;
    ICoordView coordView;

    public CoordPresenter(CoordView coordView) {
        this.coordView = coordView;
        coletRepository = new ColetRepositoryImpl();
    }


    public void addColet() {
        String locD = coordView.getTextField2().getText();
        String locE = coordView.getTextField3().getText();
        String valoare = coordView.getTextField4().getText();
        if (locD.equals("") || locE.equals("") || valoare.equals("")) {
            coordView.emptyFields();
            return;
        }
        float v;
        try {
            v = Float.parseFloat(valoare);
        } catch (NumberFormatException e) {
            coordView.noValue();
            return;
        }
        Colet colet = new Colet(locD, locE, v);
        coletRepository.saveColet(colet);
        coordView.viewColete();
    }

    public void deleteColet() {
        JTable table = coordView.getTable();
        int row, value;
        row = table.getSelectedRow();
        value = (Integer) table.getModel().getValueAt(row, 0);
        coletRepository.deleteColet(value);
        coordView.viewColete();
    }

    public void updateColet() {
        JTable table = coordView.getTable();
        int row, id;
        row = table.getSelectedRow();
        String locD, locE;
        Float valoare;
        if (table.getModel().getValueAt(row, 0).getClass() == String.class)
            id = Integer.parseInt((String) table.getModel().getValueAt(row, 0));
        else id = (int) table.getModel().getValueAt(row, 0);
        if (table.getModel().getValueAt(row, 3).getClass() == String.class)
            valoare = Float.parseFloat((String) table.getModel().getValueAt(row, 3));
        else valoare = (Float) table.getModel().getValueAt(row, 3);
        locD = (String) table.getModel().getValueAt(row, 1);
        locE = (String) table.getModel().getValueAt(row, 2);

        if (locD.equals("") || locE.equals("")) {
            coordView.emptyFields();
            return;
        }
        Colet colet = coletRepository.getColetById(id);
        if (colet == null) {
            coordView.viewColete();
            return;
        }
        colet.setLocDest(locD);
        colet.setLocExp(locE);
        colet.setValoare(valoare);
        coletRepository.updateColet(colet);
        coordView.viewColete();
    }
}
