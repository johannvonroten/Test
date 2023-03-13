public class Chief_Executive_Officier {
    String name = "J.Smith";
    String role = "Top Management";
    String chiefof = "Sales & Procurement & Finance";

    public Chief_Executive_Officier(String name, String role, String chiefof) {
        this.name = name;
        this.role = role;
        this.chiefof = chiefof;
    }

    public String toString() {
        return "Chief_Executive_Officier [name=" + name + ", role=" + role + ", chief of=" + chiefof + "]";
    }
}
