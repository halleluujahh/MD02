package ra.inheritance;

public class Person {
    private String name;
    private String age;
    private boolean sex;
    private String address;

    public Person() {
    }

    public Person(String name, String age, boolean sex, String address) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void wellcome(){
        System.out.println("Chào mừng bạn đến với Rikkei Academy");
    }
}
