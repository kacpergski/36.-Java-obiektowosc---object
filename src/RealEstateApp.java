import java.util.Scanner;

public class RealEstateApp {
    public static void main(String[] args) {
        int option;
        RealEstateRepo realEstateRepo =  new RealEstateRepo();
        Scanner scanner = new Scanner(System.in, "UTF-8");

            do {
                System.out.println("1. Add Real Estate");
                System.out.println("2. Display All");
                System.out.println("3. Add");
                System.out.println("4. Add");
                System.out.println("0. Close");
                option = scanner.nextInt();
                scanner.nextLine();

                switch (option){

                    case 1:
                        System.out.println("Number: ");
                        int number = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Bound: ");
                        String bound = scanner.nextLine();

                        System.out.println("Land register number: ");
                        String landRegisterNumber = scanner.nextLine();

                        System.out.println("Description");
                        String description = scanner.nextLine();

                        System.out.println("-----address-------------");
                        System.out.println("Street: ");
                        String street = scanner.nextLine();

                        System.out.println("House number: ");
                        int houseNumber =  scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Flat number: ");
                        int flatNumber =  scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("Post code: ");
                        String postCode = scanner.nextLine();

                        System.out.println("City: ");
                        String city = scanner.nextLine();
                        Address address = new Address(street, houseNumber,flatNumber, postCode,city);
                        RealEstate realEstate = new RealEstate(number, bound, address, landRegisterNumber, description);

                        realEstateRepo.add(realEstate);
                        break;

                    case 2:
                        realEstateRepo.displayAll();
                        break;


                    case 3:
                        break;


                }


            }while (option != 0);
scanner.close();
    }
}
