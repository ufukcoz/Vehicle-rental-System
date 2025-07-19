package araçkiralamasystem;
public class Truck extends Araçlar  {
    private boolean dorse=true;
    
    public Truck(String color, String brand, int model, String plakanumber,boolean dorse) {
        super(color, brand, model, plakanumber);
        this.dorse=dorse;
    
    if(this.dorse){
        System.out.println("there is dorse");
        dorse=false;
    }   else{
        System.out.println("there is no dorse");     
    
}}

    @Override
    public void getInfo() {
        System.out.println("TRUCK:"+color+" "+brand+" "+model+" "+plakanumber+" "+dorse);
    }


    @Override
    public void price(int day) {
        double amount=day*1000;
}

    @Override
    public void kirala() {
        System.out.println("araç kiralandı");    }
}
