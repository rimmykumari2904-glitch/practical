package class5;

public class encapsulation {
    private int contact;
    protected String name;
    public int getContact() {
        return contact;
    }
    public void setContact(int contact) {
        this.contact = contact;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] Args){
        encapsulation s = new encapsulation();
        s.setName("Diksha");
        s.setContact(6584);
        System.out.println("Name:" + s.getName());
        System.out.println("Contact:" + s.getContact());
    }
}
