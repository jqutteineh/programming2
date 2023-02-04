package assignment;
import java.util.Scanner;

public class MainHT {
	public static void main(String[] args) {
        HT<String, Integer> hashMapPerson = new HT<>();
        boolean exit = false;
        try (Scanner in = new Scanner(System.in)) {
			while (!exit) {
                System.out.println("Please select your request .......");
                System.out.println("1.Insert");
                System.out.println("2.Search");
                System.out.println("3.Remove");
                System.out.println("4.Print");
                System.out.println("5.Exit");
                String select = in.nextLine();
                switch (select) {
                    case "1":
                        System.out.println("Enter name >>>>> ");
                        String name = in.nextLine();
                        System.out.println("Enter age  >>>>>");
                        int age = in.nextInt();
                        hashMapPerson.insert(name, age);
                        System.out.println("insertion complete");
                        break;
                    case "2":
                        System.out.println("search name: ");
                        String searchname = in.nextLine();
                        System.out.println( hashMapPerson.search(searchname));
                        break;
                    case "3":
                         System.out.println("remove name: ");
                        String removename = in.nextLine();
                        hashMapPerson.remove(removename);
                        
                        break;
                    case "4":
                        hashMapPerson.print();
                        break;
                    case "5":
                        exit = true;
                        break;

                }

            }
		}

        
    }
	}


