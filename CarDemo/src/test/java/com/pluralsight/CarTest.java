package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
  
    @Test
    public void accelerate_should_increaseCarSeed(){
        // arrange
        Car c = new Car("Ford", "Mustang");
        int speedChange = 15;
        int expectedSpeed = 15;
        
        // acct
        c.accelerate(speedChange);
        
        // assert
        int actualSpeed = c.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void brake_should_decreaseCarSpeed() {
        // arrange
        Car car = new Car("Ford", "F150 Raptor");
        int speedUpBy = 15;
        int slowDownBy = 10;
        int expectedSpeed = 5;
        car.accelerate(speedUpBy);
        
        // act
        car.brake(slowDownBy);
        
        // assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }

    @Test
    public void brake_should_stopCar_whenChangeIsGreater() {
        // arrange
        Car car = new Car("Ford", "F150 Raptor");
        int speedUpBy = 15;
        int slowDownBy = 20;
        int expectedSpeed = 0;
        car.accelerate(speedUpBy);
        // act
        car.brake(slowDownBy);
        // assert
        int actualSpeed = car.getSpeed();
        assertEquals(expectedSpeed, actualSpeed);
    }
}