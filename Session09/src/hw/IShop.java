package hw;

import java.util.List;
import java.util.Scanner;

public interface IShop {
    float RATE = 1.3F;
    <T> void inputData(Scanner sc, List<T> list);
    void displayData();
}
