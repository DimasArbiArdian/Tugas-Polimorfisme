
class Fruit {
    public void rasaInfo() {
        System.out.println("Ini adalah kendaraan.");
    }
}

class Jeruk extends Fruit {
    @Override
    public void rasaInfo() {
        System.out.println("Ini adalah Jeruk Santang.");
    }

    public void rasaInfo(String rasa) {
        System.out.println("Rasanya " + rasa + ".");
    }
}

class infoBuah{
    public static void main(String[] args) {
        Jeruk jeruk = new Jeruk();
        jeruk.rasaInfo();
        jeruk.rasaInfo("Maniisss");
    }
}