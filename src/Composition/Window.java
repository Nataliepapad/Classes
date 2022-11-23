package Composition;

public class Window {
    private int numberOfWindow;

    public int getNumberOfWindow(){
        return numberOfWindow;
    }

    public Window(int numberOfWindow) {
        this.numberOfWindow = numberOfWindow;
    }

    public void open(){
        System.out.println("The window no " + numberOfWindow + " is now open");
    }
}
