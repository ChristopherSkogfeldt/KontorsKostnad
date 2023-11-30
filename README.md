


# Project README

## Project Name: Office Rent Calculator

This project is a simple Java application that calculates the monthly rent for different offices based on their size.

## How to Run the Code

To run the code, use a Java-compatible IDE like IntelliJ IDEA:

1. Open the IntelliJ IDEA program.
2. Go to the top left corner, click on "File," and select "Open." Choose the project's root folder.
3. Go to the top right corner, click the green button, and select "Run 'Main.main()'." This starts the program.

## Project Structure

- **Main.java:** The main class and entry point of the program. Creates instances of Office and displays the cost.
- **Office.java:** The class representing an office and containing logic to calculate the monthly rent.
- Main.java contains the main class and serves as the entry point for the program.
- this this file represents a class to manage offices and calculate their monthly rent based on their size.


### Installation and requirements You gonna need to have Windows 10, Windows 10 pro or Windows 11 installed on your computer, to be able to run the program on your computer. 
And you gonna need Java Development Kit (JDK) installed also. 
This how you can get and install jdk. 
Go to Oracle's JDK download page Oracle JDK Downloads ( https://www.oracle.com/java/technologies/downloads/) 
On the download page you will find different versions of JDK. 
Choose the version that suits your operating system and your needs. 
There are usually two versions: Oracle OpenJDK (free to use) and Oracle JDK (requires a license for commercial use). 
For most development purposes, Oracle OpenJDK is sufficient. 
Accept the license agreement (Terms) if necessary. 
Download the installation package appropriate for your operating system. 
Usually there are versions for Windows, macOS and various Linux distributions. 
Once the download is complete, open the installation package and follow the installation instructions. 
There may be different steps depending on your operating system. 
After installation, you should be able to verify that the JDK is installed correctly by opening a command prompt window (cmd on Windows or terminal on macOS/Linux) and running the command java -version. 
It should show the JDK version you have installed. 
Note that there are other distributions of the JDK, such as OpenJDK, AdoptOpenJDK, and Amazon Corretto, which are also free and popular. 
You can use one of these if you prefer. 
They may also be available in your Linux distribution's package manager. 
If you work with Java development, there are often IDEs (Integrated Development Environments) such as Eclipse, IntelliJ IDEA, and NetBeans that include a built-in JDK and handle the installation for you. 
Here are some alternative JDK sources: 
OpenJDK: OpenJDK Download AdoptOpenJDK: 
AdoptOpenJDK download Amazon Corretto: 
Amazon Corretto Download Follow the installation instructions for your chosen JDK distribution.




### Main.java
The main method is the starting point of the program. 
It creates instances of the Office class with different sizes and then 
prints out the monthly cost for each office.


### Office.java
this this file represents a class to manage offices and calculate their 
monthly rent based on their size.


### MainTests.java
this test class verifies that the Main class 
outputs information about the cost of different offices.

@Test
public void testOfficeCostOutput() {
// Mock System.out.println to capture the printed output
ByteArrayOutputStream outContent = new ByteArrayOutputStream();
System.setOut(new PrintStream(outContent));

    // Call the main method in Main class
    Main.main(new String[]{});

    // Get the printed output
    String output = outContent.toString().trim();

    // Assertions to check if the expected information is present in the output
    assertTrue(output.contains("Cost for Office 1:"));
    assertTrue(output.contains("Cost for Office 2:"));
    assertTrue(output.contains("Cost for Office 3:"));
    assertTrue(output.contains("Cost for Office 4:"));
    assertTrue(output.contains("Cost for Office 5:"));
    assertTrue(output.contains("Cost for Office 6:"));
}



### OfficeTests.java

Test Methods:

testCalculateMonthlyRentForSmallOffice

Creates an instance of Office with small dimensions (15.0 square meters).
Asserts that the result of calculateMonthlyRent for the small office is approximately equal to 4187.5, with a tolerance of 0.001.
testCalculateMonthlyRentForLargeOffice

Creates an instance of Office with large dimensions (25.0 square meters).
Asserts that the result of calculateMonthlyRent for the large office is approximately equal to 6114.583333333333, with a tolerance of 0.001.
testCalculateMonthlyRentForMediumOffice

Creates an instance of Office with medium dimensions (18.0 square meters).
Asserts that the result of calculateMonthlyRent for the medium office is approximately equal to 5025.0, with a tolerance of 0.001.
Each test method checks whether the calculateMonthlyRent method in the Office class produces the expected monthly rent value for offices of different sizes. The third argument in the assertEquals method is the tolerance, allowing for small variations due to floating-point precision. The tests help ensure that the calculateMonthlyRent method behaves as expected for various input values.

[import org.example.Office;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;]()

public class OfficeTests {

    @Test
    public void testCalculateMonthlyRentForSmallOffice() {
        Office smallOffice = new Office(15.0);
        Assert.assertEquals(4187.5 , smallOffice.calculateMonthlyRent(), 0.001);
    }

    @Test
    public void testCalculateMonthlyRentForLargeOffice() {
        Office largeOffice = new Office(25.0);
        assertEquals(6114.583333333333, largeOffice.calculateMonthlyRent(), 0.001);
    }

    @Test
    public void testCalculateMonthlyRentForMediumOffice() {
        Office mediumOffice = new Office(18.0);
        assertEquals(5025.0, mediumOffice.calculateMonthlyRent(), 0.001);
    }
}

In the provided Java code for JUnit tests, the imports serve the following purposes:

import org.example.Office;

This import statement is used to bring the Office class from the
org.example package into the current Java file. 
It allows the tests to create instances of the Office class and invoke its methods.
import org.junit.Assert;

This import statement brings in the Assert class from the JUnit framework. 
It provides a set of assertion methods (e.g., assertEquals) 
that are used to verify expected and actual values during the test execution.
import static org.junit.Assert.*;

This static import is used to bring in all static members (fields and methods) 
of the Assert class. It allows test methods to use assertion methods directly 
without prefixing them with the class name (Assert).
By using these imports, the test code becomes more concise and readable. 
Test methods can use simple assertions like assertEquals without needing to qualify 
them with the Assert class, and they can create instances of the Office class for testing.












