package inheritance;

public class Manager extends Employee {
    private String area;

    public Manager() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
}