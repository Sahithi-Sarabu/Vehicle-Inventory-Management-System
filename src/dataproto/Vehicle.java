package dataproto;

import java.util.Collection;

public class Vehicle extends DataObject {
    private String dealerId;
    private String brand;// Honda
    private String model;// Accord
    private int year;
    private String type;// SEDAN, SUV, VAN, PICKUP; private VehicleType type;
    private Category category;// enum Category{ NEW, USED };
    private String color;
    private float price;
    private float mileage;
    private Collection<Incentive> matchedIncentives;
    private float salePrice;
    private int peopleExpressingInterestInThisCar;

    public Vehicle(String id, String brand, String model) {
        super(id);
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }

    public String getBrand() {
        // TODO Auto-generated method stub
        return brand;
    }

    public String getModel() {
        // TODO Auto-generated method stub
        return model;
    }
}
