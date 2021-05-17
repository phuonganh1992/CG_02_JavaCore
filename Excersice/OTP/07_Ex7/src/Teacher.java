public class Teacher extends Person {
    private int grossSalary;
    private int penalty;
    private int bonus;
    private int netSalary;

    public Teacher() {
    }

    public Teacher(String name, int age, String town, String code, int grossSalary, int penalty, int bonus) {
        super(name, age, town, code);
        this.grossSalary = grossSalary;
        this.penalty = penalty;
        this.bonus = bonus;
        this.netSalary=grossSalary+bonus-penalty;
    }

    public int getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(int grossSalary) {
        this.grossSalary = grossSalary;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getNetSalary() {
        return this.netSalary;
    }

    public void setNetSalary() {
        this.netSalary = grossSalary+bonus-penalty;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "grossSalary=" + grossSalary +
                ", penalty=" + penalty +
                ", bonus=" + bonus +
                ", netSalary=" + netSalary +
                "} " + super.toString();
    }
}
