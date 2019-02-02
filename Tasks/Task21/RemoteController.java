package Task21;

class RemoteController {
    private final int MAX_NUMBER_OF_BUTTON = 5;
    private TV tv;
    private int[] buttonNumber;

    public RemoteController(TV tv) {
        this.tv = tv;
        this.buttonNumber = new int[MAX_NUMBER_OF_BUTTON];
        for (int i = 0; i < MAX_NUMBER_OF_BUTTON; i++)
            buttonNumber[i] = i;
    }

    public void pressButton(int buttonNumber) {
        tv.showChannel(buttonNumber);
    }
}
