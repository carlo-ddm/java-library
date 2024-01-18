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

    public void addLabEquipment(LabEquipment labEquipment) {
        this.labEquipments.add(labEquipment.clone());
    }

    public void setLabEquipment(LabEquipment labEquipment, int index) {
        this.labEquipments.set(index, labEquipment.clone());
    }
    
}
