package Task22;

public class Cars extends Transport implements Movement{
    private double capacity;
    private double length;

    public Cars(String number, double speed, double capacity) {
        super(number,speed);
        this.capacity = capacity;
        this.length = 0;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    @Override
    public double move(double speed,double time) {
        length += speed*time*3;
        return length;
    }
}




