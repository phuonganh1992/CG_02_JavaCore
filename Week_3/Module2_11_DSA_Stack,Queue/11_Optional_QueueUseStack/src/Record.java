public class Record implements Comparable<Record>{
    private String name;
    private boolean gender;
    private int dateOfBirth;

    public Record() {
    }

    public Record(String name, boolean gender, int dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    @Override
    public int compareTo(Record record) {
        if(getDateOfBirth()>record.dateOfBirth) return 1;
        else if(getDateOfBirth()<record.dateOfBirth) return -1;
        else return 0;

    }
}
