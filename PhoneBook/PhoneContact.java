class PhoneContact {

    String firstName;
    String lastName;
    String company;
    String nickname;
    String phone;
    String emailAddress;

    public PhoneContact(String firstName, String lastName, String company, String nickname, String phone, String emailAddress) {
     
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.nickname = nickname;
        this.phone = phone;
        this.emailAddress = emailAddress;
    }

    public void displayContact() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Company: " + company);
        System.out.println("Nickname: " + nickname);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + emailAddress);
        System.out.println("-----------------------------\n");
    }
}