package com.company;

public class Printer {
    private int tonerLevel, pagesPrinted;
    private boolean isDuplex;

    public Printer(boolean isDuplex) {
        this(0, 0, isDuplex);
    }

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplex) {
        if (tonerLevel < 0)
            this.tonerLevel = 0;
        else this.tonerLevel = Math.min(tonerLevel, 100);

        this.pagesPrinted = Math.max(pagesPrinted, 0);
        this.isDuplex = isDuplex;
    }

    public void fillTonerUp(int amount) {
        if (amount < 1)
            System.out.println("Value must be at least 1 or higher");
        else {
            if (getTonerLevel() + amount > 100) {
                setTonerLevel();
                System.out.println("Toner filled up to the brim");
            }
            else {
                this.tonerLevel += amount;
                System.out.println("Toner filled up to " + getTonerLevel() + "%");
            }
        }
    }

    private void drainToner() {
        if (isDuplex())
            this.tonerLevel -= 2;
        else
            this.tonerLevel -= 1;
    }

    public void printPage(int numberOfPages) {
        if (numberOfPages < 1)
            System.out.println("Value must be at least 1 or higher");
        else {
            int i = 0, j = numberOfPages;

            while (numberOfPages > 0) {
                if (getTonerLevel() <= 10)
                    System.out.println("WARNING Toner level critical: " + getTonerLevel() + "%");
                if (getTonerLevel() <= 0) {
                    System.out.println("Toner depleted, replenish before proceeding");
                    break;
                } else {
                    i++;

                    if (isDuplex()) {
                        if (i % 2 != 0)
                            this.pagesPrinted++;
                    } else this.pagesPrinted++;

                    System.out.println("Printing page " + i + " of " + j);
                    drainToner();
                    numberOfPages--;
                }
            }
        }
    }

    public void showPagesPrinted() {
        System.out.println("Papers used: " + getPagesPrinted());
    }

    private int getTonerLevel() {
        return tonerLevel;
    }

    private void setTonerLevel() {
        this.tonerLevel = 100;
    }

    private int getPagesPrinted() {
        return pagesPrinted;
    }

    private boolean isDuplex() {
        return isDuplex;
    }
}
