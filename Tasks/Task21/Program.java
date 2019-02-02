package Task21;

class Program {
    private String name;

    public Program(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void printName() {
        System.out.println("Сейчас идет программа "+this.name);
    }
}



