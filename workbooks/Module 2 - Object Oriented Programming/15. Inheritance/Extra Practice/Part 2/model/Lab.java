package model;

import java.util.ArrayList;

public class Lab {
                          // Polymorphism
    private ArrayList<LabEquipment> labEquipments;

    public Lab() {
        this.labEquipments = new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int index) {
        return this.labEquipments.get(index).clone();
    }
    
}
