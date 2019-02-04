package Task22;

//  Реализовать иерархию классов - транспорт (самолеты, машины, танки, вертолеты, космические корабли, велосипеды и т.д.)
//
//  Используем как обычные классы, так и абстрактные с интерфейсами.
//
//  Каждый вид транспорта может запарковаться на ПАРКОВКУ, сообщив ей свой гос. номер.
//
//  Каждый вид транспорта может уехать из пароковки, сообщив ей свой гос. номер.
//
// Реализовать класс Парковка. Важно учесть, что это МАШИНА ПАРКУЕТСЯ В ПАРКОВКУ.


public abstract class Transport {
    private String number;
    private double speed;


    public Transport(String number,double speed) {
        this.number = number;
        this.speed = speed;
    }

    public String getNumber() {
        return number;
    }

    public double getSpeed() {
        return speed;
    }

    public static void moveAll(Movement movements[], double speed,double time) {
        for (int i = 0; i < movements.length; i++) {
            movements[i].move(speed,time);
        }
    }
}
