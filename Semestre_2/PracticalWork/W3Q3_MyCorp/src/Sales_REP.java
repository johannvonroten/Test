import java.util.List;

public class Sales_REP {
    String name = "A.Aquil";
    String role = "Officier";
    String department = "Books";

    public Sales_REP(String name, String role, String department) {
        this.name = name;
        this.role = role;
        this.department = department;

    }

    public String toString() {
        return "Sales_REP [name=" + name + ", role=" + role + ", department=" + department + "]";
    }
}
