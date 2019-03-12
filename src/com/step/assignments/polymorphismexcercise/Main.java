package com.step.assignments.polymorphismexcercise;

public class Main {
    public static void main(String[] args) {
        Console console = new Console();
        console.displayContent("hello this line is executed by using console obj");

        PDFPage pdfPage = new PDFPage();
        System.out.println(pdfPage.getContent());

        WebPage webPage = new WebPage();
        webPage.click();
        System.out.println(webPage.getContent());
        webPage.displayContent("Webpage");

        NonInteractiveWebPage nonInteractiveWebPage = new NonInteractiveWebPage();
        System.out.println(nonInteractiveWebPage.getContent());
        nonInteractiveWebPage.displayContent("NonIteractiveWebPage"); // here we can't call click method as in case of webpage object

    }

}
