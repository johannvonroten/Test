public class Sales {
    String name = "V.Jaton";
    String role = "Division Directors";
    String department = "Chief Executive officer";
    String chiefof = "Magazines & Books";

    public Sales(String name, String role, String department, String chiefof) {
        this.name = name;
        this.role = role;
        this.department = department;
        this.chiefof = chiefof;
    }
    public String toString() {
        return "Sales [name=" + name + ", role=" + role + ", department=" + department + ", chief of=" + chiefof + "]";
    }

}
