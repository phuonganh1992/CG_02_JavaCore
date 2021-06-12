package model;

public class Location {
    private String start;
    private String end;
    private int distance;
    private int journeyTime;

    public Location() {
    }
    public Location(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public Location(String start, String end, int distance, int journeyTime) {
        this.start = start;
        this.end = end;
        this.distance = distance;
        this.journeyTime = journeyTime;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getJourneyTime() {
        return journeyTime;
    }

    public void setJourneyTime(int journeyTime) {
        this.journeyTime = journeyTime;
    }

    @Override
    public String toString() {
        return "Location{" +
                "start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", distance=" + distance +
                ", journeyTime=" + journeyTime +
                '}';
    }
}
