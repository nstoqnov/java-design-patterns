package org.example.components;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AddButton extends JButton implements Component{
    private Mediator mediator;

    public AddButton(){
        super("Add");
    }
    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
