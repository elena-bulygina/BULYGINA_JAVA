package Task22;

public class Aerostat extends Transport implements Movement{
    private double height;

    public Aerostat(String number, double speed) {
        super(number, speed);
        this.height = 0;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double move(double speed,double time) {
        height += speed*time*4;
        return height;
    }
}





