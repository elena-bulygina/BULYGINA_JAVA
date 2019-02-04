package Task22;

public class Bicycles extends Transport implements Movement{
    private double length;

    public Bicycles(String number, double speed) {
        super(number,speed);
        this.length = 0;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double move(double speed,double time) {
        length += speed*time;
        return length;
    }
}
