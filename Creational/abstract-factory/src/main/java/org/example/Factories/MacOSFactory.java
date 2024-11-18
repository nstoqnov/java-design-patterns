package org.example.Factories;

import org.example.Buttons.Button;
import org.example.Buttons.MacOSButton;
import org.example.Checkboxes.Checkbox;
import org.example.Checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
