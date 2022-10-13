package resources;

import pojo.*;

public class TestDataBuild {
    Category category = new Category();
    public SignUp signUpPayLoad(){
        SignUp signUp = new SignUp();
        signUp.setName("Zuki");
        signUp.setSurname("Molose");
        signUp.setUsername("Zuki");
        signUp.setPassword("Philasande@1715");
        signUp.setEmail("zuk.molo@gma.com");
        signUp.setContactNumber("0125969675");
        signUp.setContactPerson("Zukiswa Molose");

        return signUp;

    }
    public Login logInPayLoad(){
        Login login = new Login();
        login.setUsername("Test");
        login.setPassword("Philasande@1715");
        return login;

    }
    public Category categoryPayLoad(String name, String description){

        category.setName(name);
        category.setDescription(description);
        return category;

    }
    public Skill addSkillPayload(){
        Skill skill = new Skill();
//        category.setId(category.getId());
//        category.setVersion(category.getVersion());
        skill.setCategory(skill.getCategory());
//        category.setName("Technical Skill");
//        category.setDescription(category.getDescription());
//        category.setUderId(category.getUderId());
        skill.setName("Javasss");
        skill.setDescription("This is a Technical Skill for backend");
        return skill;

    }

}
