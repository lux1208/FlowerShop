/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wennshenglim
 */
public class StaffTest {
    static Staff s;
    static Scanner input = new Scanner(System.in);
    private static Staff instance;
        static List<Staff> StaffList = new ArrayList<Staff>();
    static Staff staffLoggedIn;
    
    
    public StaffTest() {
    }
    
    @Before
    public void setUp() {
        this.instance = new Staff("admin", "FlowerShop", "admin", "0134789658");
    }

    /**
     * Test of getUsername method, of class Staff.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        String expResult = "admin";
        String result = instance.getUsername();
        assertEquals(expResult, result);

    }

    /**
     * Test of setUsername method, of class Staff.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "admin";
        instance.setUsername(username);

    }

    /**
     * Test of getName method, of class Staff.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String expResult = "FlowerShop";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Staff.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "FlowerShop";
        instance.setName(name);

    }

    /**
     * Test of getPassword method, of class Staff.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        String expResult = "admin";
        String result = instance.getPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPassword method, of class Staff.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "admin";
        instance.setPassword(password);
    }

    /**
     * Test of getPhoneNo method, of class Staff.
     */
    @Test
    public void testGetPhoneNo() {
        System.out.println("getPhoneNo");
        String expResult = "0134789658";
        String result = instance.getPhoneNo();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPhoneNo method, of class Staff.
     */
    @Test
    public void testSetPhoneNo() {
        System.out.println("setPhoneNo");
        String phoneNo = "0134789658";
        instance.setPhoneNo(phoneNo);
        LogInMenu();
    }
     public static void LogInMenu() {
        Staff staff = new Staff("admin", "FlowerShop", "admin", "0134789658");
        StaffList.add(staff);
        boolean check = false;
        if (staffLoggedIn == null) {

            do {
                System.out.println("\nStaff Log In Menu\n==================");
                System.out.print("Username: ");
                String username = "admin";
                System.out.print("Password: ");
                String password = "admin";
                for (int i = 0; i < StaffList.size(); i++) {
                    if (StaffList.get(i).getUsername().equals(username)
                            && StaffList.get(i).getPassword().equals(password)) {
                        System.out.println("\nWelcome back, " + username + "!!");
                        check = true;
                        staffLoggedIn = new Staff(username, StaffList.get(i).getName(), StaffList.get(i).getPassword(), StaffList.get(i).getPhoneNo());
                        CustomerMaintenanceMenu();
                        
                    } else {
                        System.out.print("\nInvalid login credentials!! Please reenter\n");
                        check = false;
                    }
                }
            } while (check == false);
        } else {
            System.out.println("You have already logged in!! Redirect to main menu");
            CustomerMaintenanceMenu();
           
        }
    }

    public static void CustomerMaintenanceMenu() {
        int selection;
       
            System.out.println("\nCustomer Maintenance & Invoice Payment Menu\n============================================");
            System.out.println("[1] Register New Account");
            System.out.println("[2] Search Account");
            System.out.println("[3] View All Accounts");
            System.out.println("[4] Update Account Details");
            System.out.println("[5] Delete Account");
            System.out.println("[6] Logout");
            System.out.print("Please Select: ");
            selection = 6;
           
            switch (selection) {
                
                case 6:
                    StaffLogOut();
                    System.out.println();
                    break;
                default:
                    System.out.println("\nPlease choose between 1 to 6.");
                    break;
            }
       

    }
    public static void StaffLogOut() {

        if (staffLoggedIn != null) {
            staffLoggedIn = null;
            System.out.println("\nYou Have Logged Out Successfully!!\n");
        }
        
    }
    

}
