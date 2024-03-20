class BangunDatar {
    // Method untuk menghitung luas bentuk
    public double calculateArea() {
        return 0;
    }
}

class Lingkaran extends BangunDatar {
    public double radius;

    // Constructor untuk lingkaran
    public Lingkaran(double radius) {
        this.radius = radius;
    }

    // Override method calculateArea untuk lingkaran
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Overloading untuk menghitung keliling lingkaran
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
