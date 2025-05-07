package com.pluralsight;

import org.junit.jupiter.api.Test;

import static java.lang.System.out;
import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {

    @Test
    public void testGetGuestNameShouldDisplayGuestName() {
        // arrange
        Reservation r1 = new Reservation("Damian", "King", 3, false);

        // act
        out.println("Damian");

        // assert
        assertEquals("Damian", r1.getGuestName());
    }

    @Test
    public void testGetRoomTypeShouldDisplayKing() {
        // arrange
        Reservation r1 = new Reservation("Damian", "King", 3, false);

        // act
        out.println(r1.getRoomType());

        // assert
        assertEquals("King", r1.getRoomType());
    }

    @Test
    public void testGetRoomTypeShouldDisplayDouble() {
        // arrange
        Reservation r1 = new Reservation("Damian", "Double", 3, false);

        // act
        out.println(r1.getRoomType());

        // assert
        assertEquals("Double", r1.getRoomType());
    }

    @Test
    public void testGetNumberOfNightsShouldDisplayNumberOfNights() {
        // arrange
        Reservation r1 = new Reservation("Damian", "King", 3, false);

        // act
        out.println(r1.getNumberOfNights());

        // assert
        assertEquals(3, r1.getNumberOfNights());
    }

    @Test
    public void testIsWeekenedInThisCaseShouldBeFalse() {
        // arrange
        Reservation r1 = new Reservation("Damian", "King", 3, false);

        // act
        out.println("Is it a weekend stay?: " + r1.isWeekend());

        // assert
        assertEquals(false, r1.isWeekend());
    }

    @Test
    public void testIsWeekenedInThisCaseShouldBeTrue() {
        // arrange
        Reservation r2 = new Reservation("Damian", "King", 3, true);

        // act
        out.println("Is it a weekend stay?: " + r2.isWeekend());

        // assert
        assertEquals(true, r2.isWeekend());
    }

    @Test
    public void testGetPriceShouldBeEqualTo139() throws Exception {
        // arrange
        Reservation r1 = new Reservation("Damian", "King", 3, false);

        // act
        out.println(r1.getPrice());

        // assert
        assertEquals(139, r1.getPrice());
    }

    @Test
    public void testGetPriceShouldBeEqualTo124() throws Exception {
        // arrange
        Reservation r1 = new Reservation("Damian", "Double", 3, false);

        // act
        out.println(r1.getPrice());

        // assert
        assertEquals(124, r1.getPrice());
    }

    @Test
    public void testGetReservationTotalShouldBeEqualToKingAndWeekendPrice() throws Exception{
        // arrange
        Reservation r1 = new Reservation("Damian", "King", 3, true);

        // act
       double total = r1.getReservationTotal();

        // assert
      assertEquals(458.70, total, 0.001);
    }

    @Test
    public void testGetReservationTotalShouldBeEqualToKingPrice() throws Exception{
        // arrange
        Reservation r1 = new Reservation("Damian", "King", 3, false);

        // act
        double total = r1.getReservationTotal();

        // assert
        assertEquals(417, total, 0.001);
    }
}