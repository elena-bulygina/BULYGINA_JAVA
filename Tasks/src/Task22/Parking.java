package Task22;

class Parking {
    private int parkingNumber;
    private int maxPlaceNumber;
    private ParkingPlace places[];

    public Parking(int parkingNumber,int maxPlaceNumber) {
        this.parkingNumber = parkingNumber;
        this.maxPlaceNumber = maxPlaceNumber;
        this.places = new ParkingPlace[maxPlaceNumber];
        for (int i = 0; i < places.length; i++) {
            this.places[i] = new ParkingPlace();
        }
    }

    public int park(Transport transport) {
        for (int i = 0; i < places.length; i++) {
            if (places[i].getNumber() == null) {
                this.places[i].setTransport(transport);
                this.places[i].setNumber(transport.getNumber());
                this.places[i].setPlaceNumber(i);
                System.out.println("Парковка № "+this.parkingNumber+". Паркуется "+this.places[i].getNumber()+" на место № "+this.places[i].getPlaceNumber());
                return i;
            }
        }
        System.out.println("Для "+transport.getNumber()+" на парковке свободных мест нет.");
        return -1;
    }

    public void unpark(Transport transport,String number) {
        for (int i = 0; i < places.length; i++) {
            if (places[i].getNumber().equals(number)) {
                System.out.println("Транспорт "+this.places[i].getNumber()+" удаляется с места № "+this.places[i].getPlaceNumber()+" парковки № "+this.parkingNumber);
                places[i].setNumber("");
                places[i].setTransport(null);
                return;
           }
        }
        System.out.println("На парковке № "+this.parkingNumber+" транспорта с номером "+transport.getNumber()+" нет.");
    }
}
