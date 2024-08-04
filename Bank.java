class Account {
    public String name;
    public String email;
    private String password;

    //getters and setters
    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Apna College";
        account1.email = "apnacollege@gmail.com";
        // account1.password = "12345"; This will not work as password is private
        account1.setPassword("12345");
        System.out.println(account1.getPassword());
    }
}
