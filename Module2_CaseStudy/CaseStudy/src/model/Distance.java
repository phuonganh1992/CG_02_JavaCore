package model;

public class Distance {
    private String start;
    private String end;
    private int length;
    private int journeyEstimateTime;

    public Distance() {
    }
    public Distance(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public Distance(String start, String end, int length, int journeyEstimateTime) {
        this.start = start;
        this.end = end;
        this.length = length;
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

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
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
                ", length=" + length +
                ", journey Estimate Time=" + journeyEstimateTime +
                '}';
    }
}
