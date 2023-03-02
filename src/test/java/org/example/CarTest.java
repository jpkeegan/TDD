package org.example;

import org.junit.*;

public class CarTest {
    Car car;

    @Before
    public void setUp() {
        car = new Car(30,5);
    }

    @After
    public void cleanUp() {
        car = null;
    }

    @Test
    public void testDrive(){
        int milesDriven = car.drive(100);
        Assert.assertEquals(150, milesDriven);

        milesDriven = car.drive(50);
        Assert.assertEquals(0, milesDriven);
        Assert.assertEquals(0.0, car.getGas(), 0.001);
    }

    @Test
    public void testFill() {
        car.fill(10);
        Assert.assertEquals(15.0, car.getGas(), 0.001);

        car.fill(-5);
        Assert.assertEquals(10.0, car.getGas(), 0.001);
    }

    @Test
    public void testGetMileage(){
        Assert.assertEquals(30, car.getMileage());
    }

    @Test
    public void testSetMileage(){
        car.setMileage(5);
        Assert.assertEquals(5, car.getMileage());
    }

    @Test
    public void testGetGas(){
        Assert.assertEquals(5, car.getGas(), 0.001);
    }

    @Test
    public void testSetGas(){
        car.setGas(10);
        Assert.assertEquals(10, car.getGas(), 0.001);
    }

    @Test
    public void testToString(){
        String expected = "Exercise3{mileage=30, gas=5.0}";
        String actual = car.toString();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructor(){
        int expectedMileage = 30;
        double expectedGas = 5.0;
        Car car = new Car(expectedMileage, expectedGas);
        Assert.assertEquals(expectedMileage, car.getMileage());
        Assert.assertEquals(expectedGas, car.getGas(), 0.001);
    }

}
