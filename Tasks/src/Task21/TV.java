package Task21;

//    Смоделировать предметную область "Телевизор"
//        •TV
//        •Channel
//        •Program
//        •RemoteController
//    Нужно, чтобы можно было переключать каналы и смотреть передачи.


class TV {
    public final int MAX_NUMBER_OF_CHANNEL = 100;
    private Channel channels[];
    private int counterOfChannel;

    public TV() {
        this.channels = new Channel[MAX_NUMBER_OF_CHANNEL];
        this.counterOfChannel = 0;
    }

    public void addChannel(Channel channel) {
        this.channels[counterOfChannel] = channel;
        this.counterOfChannel++;
    }

    public void showChannel(int channelNumber) {
        channels[channelNumber].show();
    }
}


