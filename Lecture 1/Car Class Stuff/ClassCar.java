class Car {
    String licensePlate = "";
    double speed = 0.0;
    double maxSpeed = 0.0;

    void SetlicensePlate(){
    }

    void SetSpeed () {
    }

    void GetSpeed() {
    }
}

class CarTest {
    public static void main (String[] args) {
        Car c= new Car();
        c.licensePlate = "New York A45";
        c.speed = 100.0;
        c.maxSpeed = 200;
        System.out.println(c.licensePlate);
        System.out.println(c.speed);
        System.out.println(c.maxSpeed);
    }
}