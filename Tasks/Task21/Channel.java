package Task21;

import java.util.Random;

class Channel {
    private final int MAX_NUMBER_OF_PROGRAM = 5;
    private int counterOfProgram;
    private String name;
    private Program[] programs;

    public Channel(String name) {
        this.name = name;
        programs = new Program[MAX_NUMBER_OF_PROGRAM];
        counterOfProgram = 0;
    }

    public String getName() {
        return name;
    }

    public void addProgram(Program program) {
        this.programs[counterOfProgram] = program;
        this.counterOfProgram++;
    }
    void show() {
        System.out.println(this.name );
        Random random = new Random();
        programs[random.nextInt(5)].printName();
     }
}


