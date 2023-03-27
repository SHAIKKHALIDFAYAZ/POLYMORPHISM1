public class Main {
    public static void main(String[] args) {

        Contact contactOne =new Contact("Khalid", new PhoneNumber("7095216944"));
        Contact contactTwo =new Contact("Khalid", new PhoneNumber(91,"7095216944"));
        Contact contactThree =new Contact("Khalid", new PhoneNumber("7095216944"));
        Contact contactFour =new Contact("Khalid", "shaikkhalidfayaz@gmail.com");
        Contact contactFive =new Contact("Khalid", new PhoneNumber("7095216944"),"shaiknayazfayaz@gmail.com");

        System.out.println(contactOne);
        System.out.println(contactTwo);
        System.out.println(contactThree);
        System.out.println(contactFour);
        System.out.println(contactFive);
    }
}