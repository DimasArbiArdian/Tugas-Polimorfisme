
abstract class Buah{
    protected abstract void Rasa();
}

class Mangga extends Buah{
    @Override
    protected void Rasa(){
        System.out.println("Mangga: Eeuummm Maniiiss.");
    }
}
class Lemon extends Buah{
    @Override
    protected void Rasa(){
        System.out.println("Lemon: Iisshh Aseemmm.");
    }
}

public class InfoBuah {
    public static void main(String[] args) {
        Buah mangga = new Mangga();
        mangga.Rasa();
        
        Buah lemon = new Lemon();
        lemon.Rasa();
    }
}
