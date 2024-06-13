package ra.static_demo;

public class Guest {
    public static void main(String[] args) {
        RikkeiAcademy_Web user1 = new RikkeiAcademy_Web();//user1.cntVisited = 0
        user1.visited();//user1.cntVisited = 1
        System.out.println("Số lượt truy cập sau khi user1 truy cập: " + user1.getCntVisited());//1
        RikkeiAcademy_Web user2 = new RikkeiAcademy_Web();//user2.cntVisited = 0
        user2.visited();//user2.cntVisited = 1
        System.out.println("Số lượt truy cập sau khi user2 truy cập: " + user2.getCntVisited());//1
        RikkeiAcademy_Web user3 = new RikkeiAcademy_Web();//user3.cntVisited = 0
        user3.visited();//user3.cntVisited = 1
        System.out.println("Số lượt truy cập sau khi user13 truy cập: " + user3.getCntVisited());//1
    }
}
