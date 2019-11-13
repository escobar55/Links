import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static ArrayList<Company> companies = new ArrayList<>();
    public static ArrayList<People> person = new ArrayList<>();
    public static ArrayList<Link> links = new ArrayList<>();

    public static void main(String[] args) {
        Company company = new Company("IBM", 200L );
        Company company2 = new Company("Amazon", 201L);
        Collections.addAll(companies,company, company2);

        People people = new People("linh", 001L);
        People people2 = new People("Luis", 002L);
        Collections.addAll(person, people, people2);

        Link link1 = new Link(01L, 200L, 001L);
        Link link2 = new Link(02l, 201L,002L);
        Collections.addAll(links, link1, link2);

        connections();

        Scanner key = new Scanner(System.in);
        System.out.println("Would you like to add a new company? (Y/N)");
        String answer = key.nextLine();
        if(answer.equalsIgnoreCase("y")){
            addCompany();
        }
        else {
            System.out.println("GoodBye!");
        }

        System.out.println("Would you like to add a new person? (Y/N)");
        answer = key.nextLine();
        if(answer.equalsIgnoreCase("y")){
            addPeople();
        }
        else {
            System.out.println("GoodBye!");
        }

        System.out.println("Would you like to create a new connection? (Y/N)");
        answer = key.nextLine();
        if(answer.equalsIgnoreCase("y")){
           addLinks();
        }
        else {
            System.out.println("GoodBye!");
        }

        System.out.println("Would you like to see your connections? (Y/N)");
        answer = key.nextLine();
        if(answer.equalsIgnoreCase("y")){
            connections();
        }
        else {
            System.out.println("GoodBye!");
        }

        System.out.println("Would you like to edit a company? (Y/N)");
        answer = key.nextLine();
        if(answer.equalsIgnoreCase("y")){
            editCompany();
        }
        else {
            System.out.println("GoodBye!");
        }

        System.out.println("Would you like to edit a person? (Y/N)");
        answer = key.nextLine();
        if(answer.equalsIgnoreCase("y")){
            editPerson();
        }
        else {
            System.out.println("GoodBye!");
        }


    }

    public static void connections(){
        for (Link l: links){
            for(Company c: companies){
                if(l.getCompanyId() == c.getId()){
                    System.out.println(c.getName());
                    break;
                }
            }
         for(People p: person){
             if(l.getPeopleId() == p.getId()){
                 System.out.println(p.getName());
                 break;
             }
         }
        }
        ///sout the rest

    }//end of connections

    public static void addCompany(){
        Scanner key = new Scanner(System.in);
        Company company3 = new Company();
        System.out.println("Please enter the name of the company: ");
        company3.setName(key.nextLine());
        System.out.println("Please enter an ID for the company: ");
        company3.setId(key.nextLong());
        companies.add(company3);
    }

    public static void addPeople(){
        Scanner key = new Scanner(System.in);
        People people3 = new People();
        System.out.println("Please enter the name of the person: ");
        people3.setName(key.nextLine());
        System.out.println("Please enter an ID for the person: ");
        people3.setId(key.nextLong());
        person.add(people3);
    }

    public static void addLinks(){
        Scanner key = new Scanner(System.in);
        Link link3 = new Link();
        System.out.println("Please enter a linkID for your new connection: ");
        link3.setId(key.nextLong());
        System.out.println("Please enter the companyID: ");
        link3.setCompanyId(key.nextLong());
        System.out.println("Please enter the Person ID linked to the entered company: ");
        link3.setPeopleId(key.nextLong());
        links.add(link3);
    }

    public static void editCompany(){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the ID of the company that you wish to edit: ");
        long userInput = key.nextLong();
        key.nextLine();
        for(Company c: companies){
            if(userInput == c.getId()){
                System.out.println("Would you like to edit the name (y/n)? ");
                String answer = key.nextLine();
                if(answer.equalsIgnoreCase("y")){
                    System.out.println("please enter the new name: ");
                    c.setName(key.nextLine());
                }
            }
        }
        connections();
    }

    public static void editPerson(){
        Scanner key = new Scanner(System.in);
        System.out.println("Enter the ID of the person that you wish to edit: ");
        long userInput = key.nextLong();
        key.nextLine();
        for(People p: person){
            if(userInput == p.getId()){
                System.out.println("Would you like to edit the name (y/n)? ");
                String answer = key.nextLine();
                if(answer.equalsIgnoreCase("y")){
                    System.out.println("please enter the new name: ");
                    p.setName(key.nextLine());
                }
            }
        }
        connections();
    }



}
