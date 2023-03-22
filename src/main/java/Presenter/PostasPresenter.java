package Presenter;

import Model.Colet;
import Model.ColetRepository;
import Model.ColetRepositoryImpl;
import View.IPostasView;
import View.PostasView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class PostasPresenter {
    private ColetRepository coletRepository;
    private IPostasView postasView;

    public PostasPresenter(PostasView postasView) {
        coletRepository = new ColetRepositoryImpl();
        this.postasView = postasView;
    }

    public void findColete() {
        List<Colet> colete = coletRepository.findColete();
        String[] col = {"ID", "Locatie Destinatie", "Locatie Provenienta", "Valoare"};
        DefaultTableModel model = new DefaultTableModel(new Object[0][0], col);
        for (Colet c : colete) {
            Object[] o = new Object[4];
            o[0] = c.getId();
            o[1] = c.getLocDest();
            o[2] = c.getLocExp();
            o[3] = c.getValoare();
            model.addRow(o);
        }
        JTable table = postasView.getTable1();
        table.setModel(model);
        postasView.setTable1(table);
    }

    public void findColetById() {
        String id = postasView.getTextField1().getText();
        if (id.equals("")) {
            findColete();
            return;
        }
        try {
            int idd = Integer.parseInt(id);
            Colet c = coletRepository.getColetById(idd);
            if( c== null){
                postasView.noColetFound();
                return;
            }
            String[] col = {"ID", "Locatie Destinatie", "Locatie Provenienta", "Valoare"};
            DefaultTableModel model = new DefaultTableModel(new Object[0][0], col);
            Object[] o = new Object[4];
            o[0] = c.getId();
            o[1] = c.getLocDest();
            o[2] = c.getLocExp();
            o[3] = c.getValoare();
            model.addRow(o);
            JTable table = postasView.getTable1();
            table.setModel(model);
            postasView.setTable1(table);
        } catch (NumberFormatException e) {
            postasView.wrongNumber();
        }
    }
}
