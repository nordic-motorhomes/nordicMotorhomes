package nordicmotorhomes.project.Model;
//Albert-Madalin Turcu

//the next class it represents the model for the motorhomes which helps us to create more than one object without being redundant.

public class Motorhome {

    //below are instantiated all the motorhomes informations
    private int motorhomeId;
    private String status;
    private String model;
    private int sleepingPlaces;
    private String length;
    private String width;
    private String height;
    private String engine;
    private String permissibleWeight;


//    public Motorhome(){}

    //the following method it represents the constructor of the class Motorhomes which get executed when the class is called
    public Motorhome(int motorhomeId, String status, String model, int sleepingPlaces, String length, String width, String height, String engine, String permissibleWeight) {
        this.motorhomeId = motorhomeId;
        this.model = model;
        this.status = status;
        this.sleepingPlaces = sleepingPlaces;
        this.length = length;
        this.width = width;
        this.height = height;
        this.engine = engine;
        this.permissibleWeight = permissibleWeight;
    }

    //the following methods consists in getters and setters that helps us to work with the motorhomes data
    public int getMotorhomeId() {
        return motorhomeId;
    }

    public void setMotorhomeId(int motorhomeId) {
        this.motorhomeId = motorhomeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSleepingPlaces() {
        return sleepingPlaces;
    }

    public void setSleepingPlaces(int sleepingPlaces) {
        this.sleepingPlaces = sleepingPlaces;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getPermissibleWeight() {
        return permissibleWeight;
    }

    public void setPermissibleWeight(String permissibleWeight) {
        this.permissibleWeight = permissibleWeight;
    }

    public String toString(){
        return "Motorhome{"+
                "motorhomeId=" + motorhomeId +
                ", model=" + model + '\'' +
                ", status=" + status + '\'' +
                ", sleepingPlaces=" + sleepingPlaces + '\'' +
                ", length=" + length + '\'' +
                ", width=" + width + '\'' +
                ", height=" + height + '\'' +
                ", engine=" + engine + '\'' +
                ", permissibleWeight=" + permissibleWeight + '\'' +
                 '}';
    }
}
