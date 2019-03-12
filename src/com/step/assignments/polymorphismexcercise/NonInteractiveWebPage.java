package com.step.assignments.polymorphismexcercise;

public class NonInteractiveWebPage implements GetContent, Display{

    public String getContent(){
        return "This is some text content of webpage";
    }

    @Override
    public void displayContent(String content) {
        String text = "this is some text which belongs to the ";
        System.out.println(text + content);
    }
}
