public class Phone
{ //properties
    private String brand;
    private String model;
    private int price;

    private Person owner; //Så har vi en telefon och en ägare.

    public Phone() //skapar en tom konstruktor
    {

    }

    public Phone (String brand, String model, int price, Person owner)
    {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.owner = owner;
        owner.getPhoneList().add(this); //Lägger till telefonen som skapas av ägarens lista av telefoner.

    }
//Skapar Getters & Setters
    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public Person getOwner()
    {
        return owner;
    }

    public void setOwner(Person owner)
    {
        this.owner = owner;
    }

    @Override //Skriver över metoden som ärvs, för att beskriva att vi menar detta istället.
    public String toString()
    {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}


