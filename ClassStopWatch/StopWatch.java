package PracticeRectangles.ClassStopWatch;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        startTime = new Date();
        endTime = new Date();
    }

    public StopWatch(Date startTime, Date endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long Start() {
        return startTime.getSeconds();
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public long End() {
        return endTime.getSeconds();
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

}
