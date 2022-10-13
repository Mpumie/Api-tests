package resources;

public enum APIResources {

    SignUpAPI("/api/v1/access-control/employer/sign-up"),
    SignInAPI("/api/v1/access-control/sign-in"),
    AddCategoryAPI("/api/v1/lookup/categories/saveOrUpdate"),
    AddSkillAPI("/api/v1/lookup/employer-skills/saveOrUpdate");
    private String resource;

    APIResources(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }


}
