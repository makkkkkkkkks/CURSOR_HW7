package main.java.com.makkkkkkkks.family;

public class Family implements Comparable<Family> {

    private String name;
    private int quantityMember;
    private String title;
    private String nameOfEmblem;

    @Override
    public int compareTo(Family member) {
        return name.compareTo(member.getName());
    }

    public Family(String name, int quantityMember, String title, String nameOfEmblem) {
        this.name = name;
        this.quantityMember = quantityMember;
        this.title = title;
        this.nameOfEmblem = nameOfEmblem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityMember() {
        return quantityMember;
    }

    public void setQuantityMember(int quantityMember) {
        this.quantityMember = quantityMember;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameOfEmblem() {
        return nameOfEmblem;
    }

    public void setNameOfEmblem(String nameOfEmblem) {
        this.nameOfEmblem = nameOfEmblem;
    }

    public String toString() {
        return "Family: " + "name= " + name +
                " quantityMember= " + quantityMember +
                " title= " + title +
                " nameOfEmblem= " + nameOfEmblem;
    }
}