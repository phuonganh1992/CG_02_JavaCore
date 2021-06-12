package model;

public class Distance {
    private String start;
    private String end;
    private int lengthDistance;
    private int journeyEstimateTime;

    public Distance() {
    }
    public Distance(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public Distance(String start, String end, int lengthDistance, int journeyEstimateTime) {
        this.start = start;
        this.end = end;
        this.lengthDistance = lengthDistance;
        this.journeyEstimateTime = journeyEstimateTime;
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

    public int getLengthDistance() {
        return lengthDistance;
    }

    public void setLengthDistance(int lengthDistance) {
        this.lengthDistance = lengthDistance;
    }

    public int getJourneyEstimateTime() {
        return journeyEstimateTime;
    }

    public void setJourneyEstimateTime(int journeyEstimateTime) {
        this.journeyEstimateTime = journeyEstimateTime;
    }

    @Override
    public String toString() {
        return "Distance{" +
                "start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", length=" + lengthDistance +
                ", journey Estimate Time=" + journeyEstimateTime +
                '}';
    }
}
