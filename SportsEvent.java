class SportsEvent extends AbstractEvent {
    private String sportType, FirstTeam, SecondTeam;

    public String getSportType() {
        return sportType;
    }

    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public String getFirstTeam() {
        return FirstTeam;
    }

    public void setFirstTeam(String FirstTeam) {
        this.FirstTeam = FirstTeam;
    }

    public String getSecondTeam() {
        return SecondTeam;
    }

    public void setSecondTeam(String SecondTeam) {
        this.SecondTeam = SecondTeam;
    }
}