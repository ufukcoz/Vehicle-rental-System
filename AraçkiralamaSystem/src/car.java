package araçkiralamasystem;
public class car extends Araçlar implements IExtra {
  protected String packageType;

    public car(String packageType, String color, String brand, int model, String plakanumber) {
        super(color, brand, model, plakanumber);
        this.packageType = packageType;
    }
    public car(String color, String brand, int model, String plakanumber) {
        super(color, brand, model, plakanumber);
    }

    @Override
    public void getInfo() {
        System.out.println("CAR:"+packageType+color+" "+brand+" "+model+" "+plakanumber);
    }

    @Override
    public void price(int day) {
       double amount=day*600; 
    }
     @Override
    public void kirala() {
        System.out.println("araç kiralandı");    }

    @Override
    public void electricCar() {
        System.out.println("this car electric car .");
    }
    
}
