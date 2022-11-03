package pojo;

public class LoginResponse {
   private String token;
    private int userId;
    private int employeeId;
    private String [] roles;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public String getToken() {
        return token;
    }

    public String setToken(String token) {
        this.token = token;
        return token;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
