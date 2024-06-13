package test;
/*
 * N Class extends 1 Class
 * N Class implement M Interface
 * N Interface extends M Interface
 * */

public interface I2 extends I1, IPerson {
    void sub(int number1, int number2);
}
