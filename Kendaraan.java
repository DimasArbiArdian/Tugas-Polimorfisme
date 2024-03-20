
class Kendaraan {
    public void displayInfo() {
        System.out.println("Ini adalah kendaraan.");
    }
}

class Motor extends Kendaraan {
    @Override
    public void displayInfo() {
        System.out.println("Ini adalah Motorku.");
    }

    public void displayInfo(String brand) {
        System.out.println("Motorku mereknya " + brand + ".");
    }
}

class Main{
    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.displayInfo();
        motor.displayInfo("Ducati");
    }
}