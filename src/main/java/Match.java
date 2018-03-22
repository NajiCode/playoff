public class Match {
    private final Team teamOne;
    private final Team teamTwo;

    public Match(Team teamOne, Team teamTwo) {
        this.teamOne = teamOne;
        this.teamTwo = teamTwo;
    }

    public String layout() {
        return teamOne + " vs " + teamTwo;
    }
}
