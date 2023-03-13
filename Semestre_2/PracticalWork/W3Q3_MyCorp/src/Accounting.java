public class Accounting {
    String name = "F.Elsig";
    String role = "Area Manager";
    String department = "Finance";

    public Accounting(String name, String role, String department) {
        this.name = name;
        this.role = role;
        this.department = department;
    }

    public String toString() {
        return "Accounting [name=" + name + ", role=" + role + ", department=" + department + "]";
    }
}
