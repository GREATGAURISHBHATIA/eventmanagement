class Fashion extends AbstractEvent {
    private String theme;
    private String[] designers;
    private String[] models;
    private String[] judge;

    public Fashion() {
        designers = new String[0];
        models = new String[0];
        judge = new String[0];
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String[] getDesigners() {
        return designers;
    }

    public void setDesigners(String[] designers) {
        this.designers = designers;
    }

    public String[] getModels() {
        return models;
    }

    public void setModels(String[] models) {
        this.models = models;
    }

    public String[] getJudge() {
        return judge;
    }

    public void setJudge(String[] judge) {
        this.judge = judge;
    }
}