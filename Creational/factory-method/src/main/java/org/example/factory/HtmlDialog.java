package org.example.factory;

import org.example.buttons.Button;
import org.example.buttons.HtmlButton;

public class HtmlDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
