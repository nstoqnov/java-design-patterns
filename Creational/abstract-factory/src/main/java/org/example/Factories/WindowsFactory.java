package org.example.Factories;

import org.example.Buttons.Button;
import org.example.Buttons.WindowsButton;
import org.example.Checkboxes.Checkbox;
import org.example.Checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
