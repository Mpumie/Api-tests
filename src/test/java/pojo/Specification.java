package pojo;

import java.util.List;

public class Specification {
    private String title;
    private String description;
    private String benefits;
    private List <String> competencyLevels;
    private String companyValues;

    CoreSkills coreSkills;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public List<String> getCompetencyLevels() {
        return competencyLevels;
    }

    public void setCompetencyLevels(List<String> competencyLevels) {
        this.competencyLevels = competencyLevels;
    }

    public String getCompanyValues() {
        return companyValues;
    }

    public void setCompanyValues(String companyValues) {
        this.companyValues = companyValues;
    }
    public CoreSkills getCoreSkills() {
        return coreSkills;
    }

    public void setCoreSkills(CoreSkills coreSkills) {
        this.coreSkills = coreSkills;
    }
}
