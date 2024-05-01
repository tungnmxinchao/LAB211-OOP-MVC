package entity;

public class Report {
    String id;
    private String name;
    private String course;
    private int totalCourse;

    public Report() {
    }

    public Report(String id, String name, String course, int totalCourse) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.totalCourse = totalCourse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getTotalCourse() {
        return totalCourse;
    }

    public void setTotalCourse(int totalCourse) {
        this.totalCourse = totalCourse;
    }

    


    @Override
    public String toString() {
        return String.format("%-20s | %-10s | %-10s", name,course, totalCourse);
    }
    
    
    
}
