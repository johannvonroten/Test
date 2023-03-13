public class Magazines {
    String name = "D.Kaiser";
    String role = "Area Manager";
    String department = "Sales";

    public Magazines(String name, String role, String department) {
        this.name = name;
        this.role = role;
        this.department = department;
    }

    public String toString() {
        return "Magazines [name=" + name + ", role=" + role + ", department=" + department + "]";
    }
}
