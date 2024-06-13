package test;

public interface IPerson {
    //1.Chỉ chứa các hằng số
    public static final float PI = 3.14F;
    String USER_NAME = "quangnd";
    //2. Chỉ chứa các phương thức trừu tượng (Trước Java 8)
    public abstract void inputData();
    void displayData();
}
