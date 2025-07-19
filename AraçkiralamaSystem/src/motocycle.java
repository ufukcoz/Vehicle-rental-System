package araçkiralamasystem;
public class motocycle extends Araçlar {
 protected String ccpower;
 
  public motocycle(String ccpower, String color, String brand, int model, String plakanumber) {
        super(color, brand, model, plakanumber);
        this.ccpower = ccpower;
    }


    public motocycle(String color, String brand, int model, String plakanumber) {
        super(color, brand, model, plakanumber);
    }

   
    @Override
    public void getInfo() {
        System.out.println("MOTOCYCLE:"+ ccpower+" "+color+" "+brand+" "+model+" "+plakanumber);
    }

    @Override
    public void price(int day) {
       double amount=day*200;
    }
     @Override
    public void kirala() {
        System.out.println("araç kiralandı");    }
 
}
