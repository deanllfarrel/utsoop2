package final2;

interface tr {
    public void eat();
    public void travel();
}

class MammalInt implements tr{
    @Override
    public void eat() {
        System.out.println ("Mammal Eats");
    }
    
    @Override
    public void travel() {
        System.out.println ("Mammal Travels");
    }
}

public class Main{
    public static void main(String[] args) {
        MammalInt m = new MammalInt();
        m.eat();
        m.travel();
    }
}