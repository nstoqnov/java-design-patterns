package org.example.App;

import org.example.Buttons.Button;
import org.example.Checkboxes.Checkbox;
import org.example.Factories.GUIFactory;

public class App {
    private Button button;
    private Checkbox checkbox;

    public App(GUIFactory guiFactory){
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }
    void paint(){
        button.paint();
        checkbox.paint();
    }

}
