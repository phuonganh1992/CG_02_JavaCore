package input;

import file.DistanceIO;
import model.*;
import services.ClientService;
import services.DistanceService;
import services.OrderService;
import services.TaxiService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import static file.Path.PATH_FILE_LOCATION;

public class Input {
    public static final Scanner SCANNER = new Scanner(System.in);
    public static final int INITAL_TAXI_ID = 2000;
    public static final int INITAL_ORDER_ID = 3000;

    public static Client inputClient(){
        System.out.println("Enter client information");
        String clientUsername= inputClientUsername();
        String clientPassword = inputClientPassword();
        int clientId = inputClientId();
        SCANNER.nextLine();
        System.out.print("Enter client name: ");
        String clientName=SCANNER.nextLine();
        String clientPhoneNumber= inputPhoneNumber();
        System.out.print("Enter client address: ");
        String clientAddress=SCANNER.nextLine();
        return new Client(clientId,clientName,clientPhoneNumber,clientAddress,clientUsername,clientPassword);
    }

    private static int inputClientId() {
        boolean existId;
        int clientId;
        do {
            System.out.print("Enter client Id: ");
            clientId = SCANNER.nextInt();
            existId=ClientService.getInstance().findById(clientId)!=null;
            if(existId) System.out.println("Id already existed!");
        }while (existId);
        return clientId;
    }

    private static String inputPhoneNumber() {
        String clientPhoneNumber;
        boolean invalidPhoneNUmber;
        do{
            System.out.print("Enter client phone number: ");
            clientPhoneNumber=SCANNER.nextLine();
            invalidPhoneNUmber=!Validation.isValid(clientPhoneNumber, Validation.PHONE_NUMBER_REGEX);
            if(invalidPhoneNUmber) System.out.println("Wrong format of phone number");
        }while (invalidPhoneNUmber);
        return clientPhoneNumber;
    }

    public static String inputClientUsername() {
        String clientUsername;
        boolean existUsername;
        boolean invalidUsername;
        do{
            System.out.print("Enter client username: ");
            clientUsername=SCANNER.nextLine();
            existUsername=ClientService.getInstance().findByUsername(clientUsername)!=null;
            invalidUsername=!Validation.isValid(clientUsername, Validation.USER_NAME_REGEX);
            if (invalidUsername) System.out.println("Wrong format of username! ");
            else if(existUsername) System.out.println("Username already existed! ");
        } while (invalidUsername ||existUsername );
        return clientUsername;
    }

    public static String inputClientPassword() {
        String clientPassword;
        boolean invalidPassword;
        do{
            System.out.print("Enter client password: ");
            clientPassword=SCANNER.nextLine();
            invalidPassword=!Validation.isValid(clientPassword,Validation.PASSWORD_REGEX);
            if(invalidPassword) System.out.println("Wrong format of password");
        } while (invalidPassword);
        return clientPassword;
    }

    public static int inputOrderId(){
        List<Order> orderList=OrderService.getInstance().getOrders();
        int maxOrderID=INITAL_ORDER_ID;
        if(orderList.isEmpty()){
            return maxOrderID;
        }
        for (Order order:orderList) {
            if(order.getOrderId()>maxOrderID) maxOrderID=order.getOrderId();
        }

        return maxOrderID+1;

    }

    public static String inputStartLocation(){
        String startLocation;
        do {
            System.out.print("Enter start location: ");
            startLocation = SCANNER.nextLine();
            if (!DistanceIO.startLocations(PATH_FILE_LOCATION).contains(startLocation)) System.out.println("Wrong start location, pls re-enter!");
        }while (!DistanceIO.startLocations(PATH_FILE_LOCATION).contains(startLocation));
        return startLocation;
    }

    public static String inputEndLocation(String startLocation){
        String endLocation;
        do {
            System.out.print("Enter end location: ");
            endLocation = SCANNER.nextLine();
            if (!DistanceIO.endLocations(PATH_FILE_LOCATION).contains(endLocation)) System.out.println("Wrong end location, pls re-enter!");
            if(endLocation.equals(startLocation)) System.out.println("End location is equal to start location,pls re-enter!");
        }while (!DistanceIO.endLocations(PATH_FILE_LOCATION).contains(endLocation) || endLocation.equals(startLocation));
        return endLocation;
    }
    public static Distance inputDistance(){
        String startLocation=inputStartLocation();
        String endLocation=inputEndLocation(startLocation);
        int length= DistanceService.getInstance().findLength(startLocation,endLocation);
        int journeyTime=DistanceService.getInstance().findJourneyTime(startLocation,endLocation);
        return new Distance(startLocation,endLocation,length,journeyTime);
    }
    public static LocalDate inputDate(String dateString){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return LocalDate.parse(dateString,formatter);
    }
    public static Taxi inputTaxi(){
        System.out.println("Enter taxi information");
//        SCANNER.nextLine();
        String licensePlate = inputLicensePlate();
        System.out.print("Enter taxi color: ");
        String taxiColor=SCANNER.nextLine();
        System.out.print("Enter taxi seat quantity: ");
        int taxiSeatQuantity=SCANNER.nextInt();
        System.out.print("Enter taxi status: ");
        int taxiStatus=SCANNER.nextInt();

        int taxiID = inputTaxiIdToCreate();
        return new Taxi(taxiID,licensePlate,taxiColor,taxiSeatQuantity,taxiStatus) ;
    }

    public static String inputLicensePlate() {
        String licensePlate;
        boolean existLicensePlate;
        boolean invalidLicense;
        do{
            System.out.print("Enter taxi license plate: ");
            licensePlate=SCANNER.nextLine();
            existLicensePlate= TaxiService.getInstance().findByLicensePlate(licensePlate)!=null;
            invalidLicense=!Validation.isValid(licensePlate, Validation.LICENSE_REGEX);
            if (invalidLicense) System.out.println("Wrong format of license! ");
            else if(existLicensePlate) System.out.println("License already existed, pls re-enter! ");
        } while (existLicensePlate ||invalidLicense );
        return licensePlate;
    }

    public static int inputTaxiIdToCreate() {
        List<Taxi> taxiList=TaxiService.getInstance().getTaxis();
        int maxTaxiId=INITAL_TAXI_ID;
        if(taxiList.isEmpty()){
            return maxTaxiId;
        }
        for (Taxi taxi:taxiList) {
            if(taxi.getTaxiID()>maxTaxiId) maxTaxiId=taxi.getTaxiID();
        }

        return maxTaxiId+1;
    }
    public static int inputTaxiIdToFind() {
        System.out.print("Enter Taxi Id: ");
        return SCANNER.nextInt();
    }

}
