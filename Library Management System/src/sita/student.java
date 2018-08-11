package sita;


/**
 *
 * @author sita kumari
 */
public class student {
   private String name;
   private String fathername;
   private int roll;
  private String branch;
  private String year;
  private String section;
  private String dateofbirth;
  private String email;
   private String contactno;
  private String address;
   
   public void setName(String name){
       this.name=name;
   }
    public String getName(){
       return name;
   }

    @Override
    public String toString() {
        return "student{" + "name=" + name + ", fathername=" + fathername + ", roll=" + roll + ", branch=" + branch + ", year=" + year + ", section=" + section + ", dateofbirth=" + dateofbirth + ", email=" + email + ", contactno=" + contactno + ", address=" + address + '}';
    }

    public String getFathername() {
        return fathername;
    }

    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
}
