package model;

public class Car {
    private String make;
    private String model;
    public BodyType bodyType;
    private int productionYear;
    private double price;

    public enum BodyType {
        SEDAN, COUPE, HATCHBACK, SUV, TRUCK, VAN
    };

    public static final int MINIMUM_PRODUCTION_YEAR = 1900;

    public Car(String make, String model, BodyType bodyType, int productionYear, double price) {
        setMake(make);
        setModel(model);
        setBodyType(bodyType);
        setProductionYear(productionYear);
        setPrice(price);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null || make.isBlank()) {
            throw new IllegalArgumentException("Make cannot be null or blank.");
        }
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("Model cannot be null or blank.");
        }
        this.model = model;
    }

    public BodyType getBodyType() {
        return this.bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        if (bodyType == null) throw new IllegalArgumentException("BodyType cannot be null.");
        this.bodyType = bodyType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        if (productionYear < MINIMUM_PRODUCTION_YEAR) {
            throw new IllegalArgumentException("Production year must be greater than or equal to the minimum year.");
        }
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0 || price > 200000) {
            throw new IllegalArgumentException("Price must be within a valid range.");
        }
        this.price = price;
    }

}