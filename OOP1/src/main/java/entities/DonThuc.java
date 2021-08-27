package entities;

public class DonThuc {
    String donThuc1;
    String donThuc2;

    public DonThuc(String donThuc1, String donThuc2) {
        this.donThuc1 = donThuc1;
        this.donThuc2 = donThuc2;
    }

    public String getDonThuc1() {
        return donThuc1;
    }

    public void setDonThuc1(String donThuc1) {
        this.donThuc1 = donThuc1;
    }

    public String getDonThuc2() {
        return donThuc2;
    }

    public void setDonThuc2(String donThuc2) {
        this.donThuc2 = donThuc2;
    }

    @Override
    public String toString() {
        return "DonThuc{" +
                "donThuc1='" + donThuc1 + '\'' +
                ", donThuc2='" + donThuc2 + '\'' +
                '}';
    }
}
