package Q4;

class Owner {
    private String ownerName;
    private String phoneNo;

    public Owner() {
        this.ownerName = "Unknown";
        this.phoneNo = "Unknown";
    }

    public Owner(String name, String num) {
        this.ownerName = name;
        this.phoneNo = num;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String num) {
        this.phoneNo = num;
    }
}

class Bicycle {
    // Data Member
    private Owner owner;

    // Constructor: Initializes the data member
    public Bicycle() {
        owner = new Owner(); // Default Owner object
    }

    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    // Returns the Owner object
    public Owner getOwner() {
        return owner;
    }

    // Assigns the Owner object
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}

public class Question_04 {
    public static void main(String[] args) {
        Owner owner1 = new Owner("Janith", "0768107481");
        Bicycle bike1 = new Bicycle(owner1);

        Owner owner2 = new Owner();
        owner2.setOwnerName("Visura");
        owner2.setPhoneNo("0755139897");
        Bicycle bike2 = new Bicycle();
        bike2.setOwner(owner2);

        System.out.println("Bike 1 Owner: " + bike1.getOwner().getOwnerName() + ", Phone: " + bike1.getOwner().getPhoneNo());
        System.out.println("Bike 2 Owner: " + bike2.getOwner().getOwnerName() + ", Phone: " + bike2.getOwner().getPhoneNo());
    }
}
