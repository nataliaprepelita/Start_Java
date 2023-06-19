package Homeworks.L4HW_Classes_Intro_Prepelita_Natalia;

public class TextEditorDemo {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.textString = "Hello. ";

        editor.myString("My name is Leo. ");
        editor.myString("I'm 20 years old. ");
        editor.myString("I am from Italy.");
        editor.showMyString();
    }
}
