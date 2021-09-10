package Entries;

public class GiangVienCoHuu extends GiangVien {
    private int salary, totalHours;

    public GiangVienCoHuu(String name, String email, String address, int phone, int salary, int totalHours) {
        super(name, email, address, phone);
        this.salary = salary;
        this.totalHours = totalHours;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    @Override
    public String toString() {
        return "GiangVienCoHuu{" +
                "name='" + name +'\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", phone=" + phone + '\'' +
                ", salary=" + salary + '\'' +
                ", totalHours=" + totalHours +
                '}';
    }
}
