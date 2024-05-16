package org.example;

import org.example.DataModel.Vehicle;
import org.junit.jupiter.api.Test;

import static org.example.DataModel.Dealership.*;

public class DealershipTest {
    @Test
    public void Test_If_Vehicle_List_Adds_New_Vehicle() {
        Vehicle marsRover = new Vehicle(11121, 2033, "Mars", "Rover", Type.SEDAN, "Black", 1, 1000000);
        vehicleInventory.add(marsRover);
        assert vehicleInventory.contains(marsRover);
    }

        @Test
        public void Test_If_Car_To_String_Prints_Correctly(){
            Vehicle marsRover = new Vehicle(11121, 2033, "Mars", "Rover", Type.SEDAN, "Black", 1, 1000000);
            carToString(marsRover);

        }

        @Test public void Test_If_Vehicle_is_Added(){
            Vehicle marsRover = new Vehicle(11121, 2033, "Mars", "Rover", Type.SEDAN, "Black", 1, 1000000);
            addVehicle();
            assert vehicleInventory.contains(marsRover);
        }

    }

