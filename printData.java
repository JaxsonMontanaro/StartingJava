/*
DECLARE firstName AS STRING
DECLARE streetAddress AS STRING
DECLARE lastName AS STRING
DECLARE city AS STRING
DECLARE zipCode AS INT

SET firstName = "Jack"
SET middleName = "Aiden"
SET lastName = "Bell"
SET streetAddress = "101 Ohio Street"
SET city = "Las Vegas"
Set state = "Nevada"
SET zipCode = "89000"

PRINT firstName
PRINT lastname
PRINT lastName
PRINT streetAddress
PRINT city
PRINT state
PRINT zipCode
*/

public class printData {
    public static void main(String[] args) {
        String firstName = "Jack";
        String middleName = "Aiden";
        String lastName = "Bell";
        String streetAddress = "101 Ohio Street";
        String city = "Las Vegas";
        String state = "Nevada";
        String zipCode = "89000";

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
        System.out.println(streetAddress);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zipCode);
    }
}