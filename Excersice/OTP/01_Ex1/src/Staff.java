public class Staff extends Officer{
    private String task;

    public Staff() {
    }

    public Staff(String task) {
        this.task = task;
    }

    public Staff(String name, int age, String gender, String address, String task) {
        super(name, age, gender, address);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "task='" + task + '\'' +
                "} " + super.toString();
    }
}
