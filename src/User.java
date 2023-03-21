public class User {

    String name;
    String college;
    Address address = new Address();
    private String email;
    private String cpf;



    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        if(this.email == null) {
            this.email = email;
        } else {
            System.err.println("Error: Cannot change email!");
            System.exit(1);
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (this.cpf == null) {
            this.cpf = cpf;
        } else {
            System.err.println("Error: Cannot change cpf!");
            System.exit(1);
        }
    }

    public String getCollege() {
        return this.college;
    }
    
    public void setCollege(String college) {
        this.college = college;
    }
}
