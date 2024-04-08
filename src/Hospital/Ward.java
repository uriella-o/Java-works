package Hospital;

public class Ward {
    private int roomnumber;
    private String Bed;
    private String size;
    private int NoOfBeds;

    public void setBed(String bed) {
        this.Bed = bed;
    }
    public String getBed() {
        return this.Bed;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public String getSize() {
        return this.size;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.NoOfBeds = noOfBeds;
    }
    public int getNoOfBeds() {
        return this.NoOfBeds;
    }

    public int getRoomnumber() {
        return this.roomnumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }
}
