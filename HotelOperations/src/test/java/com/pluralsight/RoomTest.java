package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {
  
    @Test
    public void checkIn_after_occuppancyShouldBeTrue(){
        // arrange
        Room r1 = new Room(2);
        
        // act
        r1.checkIn();
        
        // assert
        assertTrue(r1.isOccupied());
    }

    @Test
    public void checkIn_after_dirtyShouldBeTrue(){
        // arrange
        Room r1 = new Room(2);

        // act
        r1.checkIn();

        // assert
        assertTrue(r1.isDirty());
    }

    @Test
    public void checkIn_after_availableShouldBeFalse(){
        // arrange
        Room r1 = new Room(2);

        // act
        r1.checkIn();

        // assert
        assertFalse(r1.isAvailable());
    }
    
    @Test
    public void checkOut_after_occuppancyShouldBeFalse(){
        // arrange
        Room r1 = new Room(2);

        // act
        r1.checkOut();

        // assert
        assertFalse(r1.isOccupied());
    }


    @Test
    public void checkOut_after_dirtyShouldBeFalse(){
        // arrange
        Room r1 = new Room(2);

        // act
        r1.checkOut();

        // assert
        assertFalse(r1.isDirty());
    }

    @Test
    public void checkOut_after_availableShouldBeTrue(){
        // arrange
        Room r1 = new Room(2);

        // act
        r1.checkOut();

        // assert
        assertTrue(r1.isAvailable());
    }

    @Test
    public void cleanRoom_after_dirtyShouldBeFalse(){
        // arrange
        Room r1 = new Room(2);

        // act
        r1.cleanRoom();

        // assert
        assertFalse(r1.isDirty());
    }
}