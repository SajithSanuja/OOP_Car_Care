package Models;

public class Inventory {
    public String iid;
    public String iname;
    public String sid;
    public double buyingPrice;
    public double sellingPrice;

    public Inventory(String iid, String iname, String sid, double buyingPrice, double sellingPrice) {
        this.iid = iid;
        this.iname = iname;
        this.sid = sid;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }


}
