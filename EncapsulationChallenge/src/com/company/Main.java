package com.company;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(-105, -1, false);
        Printer printer1 = new Printer(true);

        printer.fillTonerUp(125);
        printer.printPage(3);
        printer.showPagesPrinted();

        printer1.fillTonerUp(50);
        printer1.printPage(5);
        printer1.showPagesPrinted();
    }
}
