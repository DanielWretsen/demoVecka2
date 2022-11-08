import java.util.ArrayList;
import java.util.List;

public class Main
{//Arraylist, ett jättebra verktyg att använda i inlämningsavgiften1

    public static void main(String[] args)
    {   //Om varje telefon har en ägare direkt från början så kan man ha en metod som hämtar listan och lägger till den direk
        //vid skapandet
        List<Person> persons = new ArrayList<>(); //Lista med personobjekt.
        persons.add(new Person("Marcus Friberg", 44));
        persons.add(new Person("Pelle Pålsson ", 55));
        //

//Hämtar personobjekten med get.
        Phone phone1 = new Phone("Apple", "Iphone", 7999, persons.get(0));
        Phone phone2 = new Phone("Samsung", "Galaxy S22", 7999, persons.get(1));
        Phone phone3 = new Phone("Huwaei", "P21", 5999, persons.get(1));
        Phone phone4 = new Phone("Apple ", "Iphone Pro Max", 1999, persons.get(0));
        Phone phone5 = new Phone("Apple ", "Iphone 12 Pro ", 1299, persons.get(1));
        //Det vi vill göra är att vi vill skapa upp telefonerna ovan och att de hoppar in på rätt ägare.

        for(Person theperson : persons)
        {//För varje person i listan så kallar vi det för theperson
            System.out.println("Telefoner som ägs av " + theperson.getName());
            for (Phone thePhone : theperson.getPhoneList())
            {
                System.out.println(thePhone.getBrand()+ " " + thePhone.getModel() + " " + " " + thePhone.getPrice());
            }
        }

        //person1.addPhone(phone1);
        // System.out.println("Marcus Friberg har " + person1.getPhoneList().size() + " telefoner");
        //Om vi ska få in dessa objekt ovan i en samling nu så kan vi använda en Arraylist
        //En ArrayList med telefonobjekt:
        // ArrayList<Phone> myPhones = new ArrayList<>();
        //Det finns andra sätt att skapa upp ArrayList. ArrayList är en klass.
      //  List<Phone> myPhones = new ArrayList<>(); //Är bättre att skriva List eftersom det finns linked list osv.
        //Nu har vi en lista med mina telefoner och den är för närvarnade tom,
        //Men då kan man lägga till dem om man skriver:
      //  myPhones.add(phone1); //Ska läggas in i personobjekten ovan.
       // myPhones.add(phone2);
       // myPhones.add(phone3);
        //Nu har vi en lista där vi lagt till 3 st telefoner, det här är som sagt så är det en Arraylist
        //ArrayList är en lite mer avancerad array, eftersom den inte är låst som en vanlig array.
        // Bra ställe att lagra larmkomponenter eller rum i ett hus eller så

        //objektet Phone som vi kallar för thePhone i vår myPhoneslista, som vi vill göra något:
        //För varje Phone som vi kallar för thePhone, utför det som kommer här:
        //Den kommer snurra precis så många gånger som vi har telefoner.
        //Det är väldigt fiffigt, eftersom då kan vi skriva.
      //  System.out.printf("phone1 " +phone1.toString());
       // System.out.println("--------------------");

        //Phone phone4 = phone1;
       // person1.setAge(44);
       // person1.setName("Marcus Friberg");
       // System.out.println("phone4 + " + phone4.toString());//En liten fallgropp som man kan falla i,
        //Eftersom man kanske tänker att jag kopierar telefonobjekt1 till telefonobjekt4 eftersom jag vill ju ha 2 iphone i den här butiken eller något liknande.
        // Utan det är bara en pointer till minnet, som refererar till adressen för phone1, d.v.s där det ligger, inte själva objektet.
        //Så det som händer för phone4 = phone1; är att vi bara kopierar pointern/adressen och lägger den i objektet 4.
        //Om vi efter det här kör:
       // phone1.setPrice(5999);//Nu har vi ändrat priset på telefon1 till 5999
       // System.out.println("-------------------------");//En avskiljare
       // System.out.println(phone4.getPrice()); //Så nu när vi skriver ut phone4 så borde man tänka sig att
        //phone4 har kvar 7999, men det har ändrats till 5999 pga bara minnesadressen.
        //Det är samma telefon i minnet, så ändrar vi 1:an så ändras 4:an med automatiskt.
        //Vilket är en fälla annars.

        //for (Phone thePhone : person.getPhoneList()) //Går in och skriver ut alla telefoner som tillhör person.
       // {
         //   System.out.println(person.getName()+ thePhone.toString());
            //Vi behöver inte tala om för for satsen hur många vi ska rotera, utan den kör så många
            //Gånger vi har lådor i byrån just nu.
            //Det här är ett bra sätt att spara utrymme i main, vi behöver inte ha 18 rader i sout i ett larmsystem t.ex., utan
            //vi iterer igenom de listorna vi har.
         //   System.out.println("----------------------");
            //Vi kan även göra denna variant för få det lite avskilt.

            //Så länge i är mindre än myPhones.size(), d.v.s 3, så ska vi snurra och utföra samt öka in +1.
            //.size() är storleken, d.v.s hur många element som finns i listan.
           // for (int i = 0; i < myPhones.size(); i++) {
            //    System.out.println(myPhones.get(i)); //get index.
           // }
            //Det man får vara lite vaksam på om man itererar över arrayList eller listor är om man börja manipulera dem när man
            //t.exVi spinner igenom den här för att titta efter en viss telefon eller så, sen tar vi bort den
            //och sen fortsäter vi och snurrar, då kan man åka på lite exceptions, d.v.s fel, eftersom listans byggs upp av.
            //indexar, så iterar man från 0 så kan det bli fel. dvs det som var index 4 blir index 3 och för eller senare så
            //kommer den försöka leta i ett index som inte finns,så när man börjar så tittar den och kollar på hur stor är listan
            // och hur många gånger kommer jag behöva köra runt? Men när du har plockat bort några grejer så kommer inte
            // listan vara lika stor längre.
            //Vi kommer i nästa kurs titta på hur man på ett säkert sätt kan manipulera listor samtidigt som man loopar igenom dem.









  //Mellan klasserna Person och Phone så har vi fått coupling, d.v.s ett beroende där emellan och det är ju telefonerna.
            //Utan phoneklassen så kommer Person klassen att klaga att det inte finns några telefoner.
            //I det här skedet, om man vill ha en interaktion mellan objekt, eller objektägaren och ett annat objekt så får man ju
            // leva med att mån av coupling, d.vs att det finns beroenden. Det handlar mer om att se till att rätt klass kanske äger
            //rätt egenskaper, att t,ex denna klass i person, det finns en lista av telefoner men vi kanske inte ska ha t.ex  bygga in fler beroenden som t.ex katter som beroenden mellan de tv klasserna med
            // eller lagra listan på telefoner i en av hans katter, det är mer på den nivån just nu eftersom vi inte gått igenom att isolera klaser.
            // så ibland handlar det mer om att reducera beroendena. När vi tittar på webbservices på större system så kommer kolla mer på det.


        }
    }
