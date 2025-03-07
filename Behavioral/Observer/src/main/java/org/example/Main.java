package org.example;

import org.example.editor.Editor;
import org.example.listeners.EmailNotificationListener;
import org.example.listeners.EventListener;
import org.example.listeners.LogOpenListener;

public class Main {
    public static void main(String[] args) {

        Editor editor = new Editor();
        EventListener eventListener = new LogOpenListener("/file.txt");
        editor.events.subscribe("open", eventListener);
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}