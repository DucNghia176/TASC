package AssignmentJavaCore.Assignment;

public class Customer {
    private String name;
    private String email;
    private String phone;

    public Customer(String phone, String email, String name) {
        this.phone = phone;
        this.email = email;
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name.trim() + '\'' +
                ", email='" + email.trim() + '\'' +
                ", phone='" + phone.trim() + '\'' +
                '}';
    }
}
