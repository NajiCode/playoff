public class Team implements Comparable<Team>{
    private String name;
    private int point;

    public Team(String name) {
        this.name = name;
        this.point = 0;
    }

    public void addPoint() {
        point++;
    }

    public int compareTo(Team team) {
        if (this.point > team.point) {
            return 1;
        }
        if (this.point < team.point) {
            return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        return name;
    }
}
