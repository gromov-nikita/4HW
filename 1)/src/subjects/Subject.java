package subjects;

public abstract class Subject {
    private String name;
    private int time;
    private String complexity;
    public String getName() {
        return name;
    }
    public int getTime() {
        return time;
    }
    public String getComplexity() {
        return complexity;
    }
    protected void setName(String name) {
        this.name = name;
    }
    protected void setTime(int time) {
        this.time = time;
    }
    protected void setComplexity(String complexity) {
        this.complexity = complexity;
    }
    @Override
    public String toString() {
        return "Name: " + name + " Time: " + time + " Complexity: " + complexity;
    }
}
