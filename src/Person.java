import java.util.ArrayList;
import java.util.List;

public class Person //couplinggenomgång
{//Vi gör en klass av en person som har namn, ålder och en lista med telefoner.
    private String name;
    private int age;
    private List<Phone> phoneList = new ArrayList<>(); //Importera java.util för List samt skapar upp en ny Lista.
    public Person()
    {

    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public List<Phone> getPhoneList()
    {
        return phoneList;
    }

    public void addPhone (Phone phoneToAdd) //Tar bort setPhoneList och (List<Phone> phoneList) samt skriver add istället
    {
        phoneList.add(phoneToAdd);//Vill inte sätta en lista med telefoner på en gång utan vi vill att personen ska börja
        // med en tom lista och så kan vi lägga till telefoner alt eftersom han vet vilken det handlar om.
        //Läraren gjorde helt enkelt en metod och ropar på add.phone och skickar med en telefon och går över på
        //this.phoneList och så lägger vi till telefonen som läraren skickar in.


    }
}
