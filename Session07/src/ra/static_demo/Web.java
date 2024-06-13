package ra.static_demo;

public class RikkeiAcademy_Web {
    private static int cntVisited;
    static {
        //Khối static dùng để khởi tạo giá trị cho các biên static
        //Khối static được gọi (chạy) truớc constructor
        cntVisited = 0;
    }

    public int getCntVisited() {
        return cntVisited;
    }

    public void setCntVisited(int cntVisited) {
        this.cntVisited = cntVisited;
    }

    public void visited() {
        this.cntVisited++;
    }
}
