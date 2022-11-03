package resources;

import pojo.*;

import java.util.ArrayList;
import java.util.List;

public class TestDataBuild {
    Category category = new Category();

    public SignUp candidateSignup(){
        SignUp signUp = new SignUp();
        signUp.setName("Muziwakhe");
        signUp.setSurname("Malope");
        signUp.setPassword("Philasande@1715");
        signUp.setUsername("Muziwakhe");
        signUp.setEmail("liz.md@gmail.co.za");
        signUp.setContactNumber("0766137492");
        return signUp;
    }

    public EmployerSignUp employerSignUp(){
        EmployerSignUp employerSignUp = new EmployerSignUp();
        employerSignUp.setUsername("Emlly");
        employerSignUp.setPassword("Philasande@1715");
        employerSignUp.setName("Mahlangu cc");
        employerSignUp.setEmail("melly.mh@gmail.com");
        employerSignUp.setContactPerson("Melly");
        employerSignUp.setContactNumber("0139487589");
        employerSignUp.setPreferredCommunicationType("EMAIL");
        Industry industry = new Industry();
        industry.setId(25);
        industry.setVersion(0);
        industry.setName("Information Technology");
        employerSignUp.setIndustry(industry);
        return employerSignUp;
    }


    public Login logInPayLoad(){
        Login login = new Login();
        login.setUsername("Emlly");
        login.setPassword("Philasande@1715");
        return login;
    }

    public Specification specificationPayload(){
        Specification specification = new Specification();
        specification.setTitle("Development");
        specification.setDescription("Description");
        List<String> competencyLevels = new ArrayList<String>();
        competencyLevels.add("Junior");
        competencyLevels.add("Senior");
        specification.setCompetencyLevels(competencyLevels);
        specification.setBenefits("Benefits");
        specification.setCompanyValues("Company Values");
        CoreSkills coreSkills = new CoreSkills();
//        coreSkills.setId(50);
//        coreSkills.setVersion(0);
        coreSkills.setDescription("Core Skills description");
        category.setName("Technical");
        category.setDescription("Technical Skill");
        coreSkills.setCategory(category);
        Skills skills = new Skills();
//        skills.setId(6);
//        skills.setVersion(0);
        skills.setName("Angular");
//        skills.setUserId(0);
        coreSkills.setSkill(skills);
        coreSkills.setEmployerId(8);
        specification.setCoreSkills(coreSkills);


        return specification;
    }

    public Category categoryPayload(){
        category.setName("24689012349689 Category");
        category.setDescription("This is a Tech Category");
        return category;
    }

    public Skills skillsPayload(){
        Skills skills = new Skills();
        category.setId(1);
        category.setVersion(0);
        category.setName("Technical");
        category.setDescription("The abilities and knowledge needed to perform specific tasks");
        skills.setCategory(category);
        skills.setDescription("This is a tech skil");
        skills.setId(2);
        skills.setVersion(0);
        skills.setName("Angular Skill");
        return  skills;
    }
    public String deleteCategoryPayload(int userId)
    {
        return "{\r\n    \"user_Id\":\""+userId+"\"\r\n}";
    }
}
