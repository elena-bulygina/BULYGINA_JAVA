package Task21;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int maxprogram = 25;
        int maxchannel = 5;
        TV tv = new TV();
        RemoteController remoteController = new RemoteController(tv);
        Channel[] myChannel = new Channel[maxchannel];
        Program[] myProgram = new Program[maxprogram];
        String channelName = "";
        String programName = "";

        for (int j = 0; j < maxprogram; j++) {
            programName = "Программа "+j;
            myProgram[j] = new Program(programName);
        }

        int j;
        for (int i = 0; i < maxchannel; i++) {
            channelName = "Канал " + i;
            myChannel[i] = new Channel(channelName);
            j = i;
            while (j < maxprogram) {
                myChannel[i].addProgram(myProgram[j]);
                j = j + 5;
            }
            tv.addChannel(myChannel[i]);
        }
        Random random = new Random();
        for (int i = 0; i < 5; i++)
            remoteController.pressButton(random.nextInt(4));
    }
}
