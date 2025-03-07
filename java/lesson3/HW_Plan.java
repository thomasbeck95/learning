package lesson3;

class BasicPlan{
    boolean canStream;
    boolean canDownload;
    boolean hasSD;
    boolean hasHD;
    boolean hasUHD;
    int numOfDevices;
    double price;

    public BasicPlan() {
        this.canStream = true;
        this.canDownload = true;
        this.hasSD = true;
        this.hasHD = false;
        this.hasUHD = false;
        this.numOfDevices = 1;
        this.price = 8.99;
    }

    @Override
    public String toString() {
        return "BasicPlan{" +
                "canStream=" + canStream +
                ", canDownload=" + canDownload +
                ", hasSD=" + hasSD +
                ", hasHD=" + hasHD +
                ", hasUHD=" + hasUHD +
                ", numOfDevices=" + numOfDevices +
                ", price=" + price +
                '}';
    }
}

class StandardPlan extends BasicPlan{
    public StandardPlan(){
        this.hasHD = true;
        this.hasUHD = false;
        this.numOfDevices = 2;
        this.price = 12.99;
    }
}

class PremiumPlan extends StandardPlan{
    public PremiumPlan(){
        this.hasUHD = true;
        this.numOfDevices = 4;
        this.price = 15.99;
    }
}

class CustomPlan extends StandardPlan{
    public CustomPlan(boolean canStream, boolean canDownload,
                        boolean hasSD, boolean hasHD,
                        boolean hasUHD, int numOfDevices,
                        double price) {
        this.canStream = canStream;
        this.canDownload = canDownload;
        this.hasSD = hasSD;
        this.hasHD = hasHD;
        this.hasUHD = hasUHD;
        this.numOfDevices = numOfDevices;
        this.price = price;
    }
}

public class HW_Plan {
    public static void main(String[] args) {
        BasicPlan bp = new BasicPlan();
        StandardPlan sp = new StandardPlan();
        PremiumPlan pp = new PremiumPlan();
        System.out.println(bp);
        System.out.println(sp);
        System.out.println(pp);

    }
}
