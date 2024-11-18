package org.example;

import org.example.factory.Dialog;
import org.example.factory.HtmlDialog;
import org.example.factory.WindowsDialog;

public class Main {
    private static Dialog dialog;
    public static void main(String[] args) {

        configure();
        runBusinessLogic();
    }

    private static void configure() {
        System.out.println(System.getProperty("os.name"));
        if(System.getProperty("os.name").equals("Macs OS X")){
            dialog = new WindowsDialog();
        }else{
            dialog = new HtmlDialog();
        }
    }
    private static void runBusinessLogic() {
        dialog.renderWindow();
    }
}