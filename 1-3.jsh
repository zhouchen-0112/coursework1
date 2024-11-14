// The last 6 digits of my student number is 700039

import java.util.Scanner;

int vanilla = 39;     
int chocolate = 0;    
int strawberry = 70;  
int cone = 100;       

double calculateTotal ( String flavour, int scoops ) {
    int scoop;
    
    switch (flavour) {
        case "v":
            scoop = vanilla ;
            break;
        case "c":
            scoop = chocolate;
            break;
        case "s":
            scoop = strawberry;
            break;
        default:
            System.out.println("We don't have that flavour.");
            return -1; 
    }
    
    if (scoops < 1) {
        System.out.println("We don't sell just a cone.");
        return -1; 
    } else if (scoops > 3) {
        System.out.println("That's too many scoops to fit in a cone.");
        return -1; 
    }

    int totalPence = cone + (scoops * scoops);

    return totalPence / 100.0;
}

Scanner scanner = new Scanner(System.in);

System.out.println("Would you like (v)anilla, (c)hocolate or (s)trawberry?");
String flavour = scanner.nextLine().trim().toLowerCase();

System.out.println("How many scoops would you like?");
int scoops;
try {
    scoops = Integer.parseInt(scanner.nextLine().trim());
} catch (NumberFormatException e) {
    System.out.println("Invalid number of scoops.");
    return;
}

double totalPrice = calculateTotal(flavour, scoops);

if (totalPrice >= 0) {
    System.out.printf("That will be %.2f pounds, please.\n", totalPrice);
}

scanner.close();