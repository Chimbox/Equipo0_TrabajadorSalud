/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo_trabajadorsalud;

import equipo0_dominio.Documento;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Alfonso Felix
 */
public class ExpedienteRenderer extends JLabel implements ListCellRenderer<Documento> {

    public ExpedienteRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Documento> list, Documento value, int index, boolean isSelected, boolean cellHasFocus) {

        setText(String.format("DOC #%d: %s", value.getId(), value.getContenido()));

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }

        return this;
    }

}
