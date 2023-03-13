public class Procurement {
    String name = "F.Vernier";
    String role = "Division Directors";
    String department = "Chief Executive officer";
    String chiefof = "Asia & EU + USA";

    public Procurement(String name, String role, String department, String chiefof) {
        this.name = name;
        this.role = role;
        this.department = department;
        this.chiefof = chiefof;
    }

    public String toString() {
        return "Procurement [name=" + name + ", role=" + role + ", department=" + department + ", chief of=" + chiefof + "]";
    }
}
