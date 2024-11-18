package org.example;

import org.example.App.App;
import org.example.Factories.GUIFactory;
import org.example.Factories.MacOSFactory;
import org.example.Factories.WindowsFactory;

public class Main {
    private static App configureApplication(){
        App app;
        GUIFactory guiFactory;

        if(System.getProperty("os.name").toLowerCase().equals("mac os x")){
           guiFactory = new MacOSFactory();
        } else {
            guiFactory = new WindowsFactory();
        }
        app = new App(guiFactory);
        return app;
    }
    public static void main(String[] args) {
        App app = configureApplication();
        app.paint();
    }
}