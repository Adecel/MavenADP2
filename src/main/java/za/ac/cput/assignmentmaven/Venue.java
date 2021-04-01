/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignmentmaven;

/**
 *
 * @author Kegomoditswe Leshope 2191890748
 */
public class Venue {
     private String buildingName;
    private String roomNumber;
    int numberSeats;

    public String getBuildingName() {
        return buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getNumberSeats() {
        return numberSeats;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNumberSeats(int numberSeats) {
        this.numberSeats = numberSeats;
    }

    @Override
    public String toString() {
        return "Calc{" + "buildingName=" + buildingName + ", roomNumber=" + roomNumber + ", numberSeats=" + numberSeats + '}';
    }

  
   
}
