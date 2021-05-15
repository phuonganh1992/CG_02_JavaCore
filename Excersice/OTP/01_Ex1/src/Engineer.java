public class Engineer extends Officer{
    private String techicalTraining;

    public Engineer() {
    }

    public Engineer(String techicalTraining) {
        this.techicalTraining = techicalTraining;
    }

    public Engineer(String name, int age, String gender, String address, String techicalTraining) {
        super(name, age, gender, address);
        this.techicalTraining = techicalTraining;
    }

    public String getTechicalTraining() {
        return techicalTraining;
    }

    public void setTechicalTraining(String techicalTraining) {
        this.techicalTraining = techicalTraining;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "techicalTraining='" + techicalTraining + '\'' +
                "} " + super.toString();
    }
}
