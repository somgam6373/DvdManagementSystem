package dto;

public class RequestDTO {
    private int id;
    private String title;
    private int audience;
    private String date;
    private int grade;

    public RequestDTO(int id, String title, int audience, String date, int grade) {
        super();
        this.id = id;
        this.title = title;
        this.audience = audience;
        this.date = date;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getAudience() {
        return audience;
    }
    public void setAudience(int audience) {
        this.audience = audience;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

}
