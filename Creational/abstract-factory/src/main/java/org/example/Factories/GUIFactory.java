package org.example.Factories;

import org.example.Buttons.Button;
import org.example.Checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
