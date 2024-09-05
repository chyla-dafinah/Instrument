import java.util.Scanner;

public class PlayInstrument {
    public static void main(String[] args) {
        Instrument a = new Instrument("Guitar", 101.5);
        Instrument b = new Instrument("Piano", 200.0);
        Instrument c = new Instrument("Violin", 150.9);

        a.setType("Guitar");
        a.setPrice(100.5);
        b.setType("Piano");
        b.setPrice(200.0);
        c.setType("Violin");
        c.setPrice(10.9);
        a.print();
        b.print();
        c.print();

        if (a.getPrice() > b.getPrice() && a.getPrice() > c.getPrice()) {
            System.out.println("Harga Gitar Yang Paling Mahal");
        }else if(b.getPrice() > a.getPrice() && b.getPrice() > c.getPrice()) {
            System.out.println("Harga Piano Yang Paling Mahal");
        }else if(c.getPrice() > a.getPrice() && c.getPrice() > b.getPrice()) {
            System.out.println("Harga Violin Yang Paling Mahal");
        }
        
        if(a.getPrice() < b.getPrice() && a.getPrice() < c.getPrice()) {
            System.out.println("Harga Gitar Yang Paling Murah");
        }else if(b.getPrice() < a.getPrice() && b.getPrice() < c.getPrice()) {
            System.out.println("Harga Piano Yang Paling Murah");
        }else if(c.getPrice() < a.getPrice() && c.getPrice() < b.getPrice()) {
            System.out.println("Harga Violin Yang Paling Murah");    
        }
    }
    
}
