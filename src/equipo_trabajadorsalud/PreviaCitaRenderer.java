/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo_trabajadorsalud;

import equipo0_dominio.Cita;
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/**
 *
 * @author Alfonso Felix
 */
public class PreviaCitaRenderer extends JLabel implements ListCellRenderer<Cita> {

    public PreviaCitaRenderer() {
        setOpaque(true);
    }

    @Override
    public Component getListCellRendererComponent(JList<? extends Cita> list, Cita value, int index, boolean isSelected, boolean cellHasFocus) {

        setText(String.format("%s - %s", value.getPaciente().getNombre()+" "+value.getPaciente().getPrimerApellido()+" "+value.getPaciente().getSegundoApellido(), value.getFecha()));
    
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
