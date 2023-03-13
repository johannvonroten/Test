public class Finance {
    String name = "M.Jaquet";
    String role = "Division Directors";
    String department = "Chief Executive officer";
    String chiefof = "Accounting";

    public Finance(String name, String role, String department, String chiefof) {
        this.name = name;
        this.role = role;
        this.department = department;
        this.chiefof = chiefof;
    }

    public String toString() {
        return "Finance [name=" + name + ", role=" + role + ", department=" + department + ", chief of=" + chiefof + "]";
    }


}
