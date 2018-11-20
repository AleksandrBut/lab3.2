package ai164.But;

public class Room {
    private double length;
    private double height;
    private double width;
    private String roomColor;
    private double amountPerM2;

    public Room(double length, double height, double width, String roomColor, double amountPerM2) {
        this.length = length;
        this.height = height;
        this.width = width;
        this.roomColor = roomColor;
        this.amountPerM2 = amountPerM2;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public String getRoomColor() {
        return roomColor;
    }

    public double getAmountPerM2() {
        return amountPerM2;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setRoomColor(String roomColor) {
        this.roomColor = roomColor;
    }

    public void setAmountPerM2(double amountPerM2) {
        this.amountPerM2 = amountPerM2;
    }
}
