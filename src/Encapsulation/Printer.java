package Encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100){
            this.tonerLevel = tonerLevel;
        } else{
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted = 0;
    }

    public void fillUpToner(int addedToner){
        if((tonerLevel + addedToner) > 100){
            System.out.println("Printer filled to maximum. Excess toner of: " + (tonerLevel + addedToner - 100) + "%");
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel + addedToner;
        }
    }

    public void printPages(int pages){
        int pagesToPrint = pages;

        if(this.isDuplex){
            pagesToPrint = pages/2 + pages % 2;
        }

        this.pagesPrinted += pagesToPrint;
        System.out.println( isDuplex? "Printing in duplex. Total of: " + pagesPrinted + " pages printed" :
                            "Not printing in duplex. Total of: " + pagesPrinted + " pages printed");

    }
}
