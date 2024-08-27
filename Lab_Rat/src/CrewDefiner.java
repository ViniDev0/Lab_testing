/**
 * App
 */
public class CrewDefiner {

    private int task;
    private String crewName;

    public CrewDefiner(int task, String crewName) {
        this.task = task;
        this.crewName = crewName;
    }

    public int getTasks() {
        return task;
    }

    public void setTasks(int task) {
        if (task > 0) {
            this.task = task;
        }
    }
    
    public String getCrewName() {
        return crewName;
    }
    
    public void setCrewName(String crewName) {
        this.crewName = crewName;
    }
}
