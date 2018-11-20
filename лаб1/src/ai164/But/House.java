package ai164.But;

import java.util.ArrayList;

public class House {
    private int floorAmount;
    private int flatAmount;
    private ArrayList<Flat> flats;

    public House(int floorAmount, int flatAmount) {
        this.floorAmount = floorAmount;
        this.flatAmount = flatAmount;
    }

    public int getFloorAmount() {
        return floorAmount;
    }

    public int getFlatAmount() {
        return flatAmount;
    }

    public void setFloorAmount(int floorAmount) {
        this.floorAmount = floorAmount;
    }

    public void setFlatAmount(int flatAmount) {
        this.flatAmount = flatAmount;
    }

    public void setFlat(Flat flat) {
        flats.add(flat);
    }
}
