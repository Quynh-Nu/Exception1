package Entries;

public class GiangVienThinhGiang extends GiangVien{
    private String companyAdress;
    private int hours;

    public GiangVienThinhGiang(String name, String email, String address, int phone, String companyAdress, int hours) {
        super(name, email, address, phone);
        this.companyAdress = companyAdress;
        this.hours = hours;
    }

    public String getCompanyAdress() {
        return companyAdress;
    }

    public void setCompanyAdress(String companyAdress) {
        this.companyAdress = companyAdress;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "GiangVienThinhGiang{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone + '\'' +
                ",companyAdress='" + companyAdress + '\'' +
                ", hours=" + hours +
                '}';
    }
}
