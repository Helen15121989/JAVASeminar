package homeworkJava6;

public class Computer {

    private String model;
    private Integer ram;
    private Integer disk;
    private String os;
    private String color;

    @Override
    public String toString() {
        return "Computer [model=" + model + ", ram=" + ram + ", disk=" + disk + ", os=" + os + ", color=" + color + "]";
    }

    Computer(String model, Integer ram, Integer disk, String os, String color) {
        this.model = model;
        this.ram = ram;
        this.disk = disk;
        this.os = os;
        this.color = color;

    }
    public Integer getRam() {
        return ram;
    }
    public String getColor() {
        return color;
    }
    public Integer getDisk() {
        return disk;
    }
    public String getModel() {
        return model;
    }
    public String getOs() {
        return os;
    }

}
