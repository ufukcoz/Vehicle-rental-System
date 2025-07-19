/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author hp
 */package araçkiralamasystem;
public abstract class Araçlar  {
 protected String color;
   protected String brand;
    protected int model;
    public String plakanumber;

    public Araçlar(String color, String brand, int model,String plakanumber) {
        this.color = color;
        this.brand = brand;
        this.model = model;
        this.plakanumber=plakanumber;
    }public abstract void getInfo();
    public abstract void price(int day);
    public abstract void  kirala();
}
