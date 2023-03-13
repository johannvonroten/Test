public class Books {
    String name = "D.Cham";
    String role = "Area Manager";
    String department = "Sales";
    String chiefof = "Sales Rep + Sales Rep2";

    public Books(String name, String role, String department, String chiefof) {
        this.name = name;
        this.role = role;
        this.department = department;
        this.chiefof = chiefof;
    }

    public String toString() {
        return "Books [name=" + name + ", role=" + role + ", department=" + department + ", chief of=" + chiefof + "]";
    }
}
