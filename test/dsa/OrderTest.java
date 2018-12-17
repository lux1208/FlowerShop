/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa;

import java.text.DateFormat;
import java.util.ArrayList;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author wei
 */
public class OrderTest {
    
    static Order o;
    static Scanner input = new Scanner(System.in);
    static List<Order> OrderList = new ArrayList<Order>();
    static List<Order> DeliveryList = new ArrayList<Order>();
    private static Order instance;
    static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
    static Date localDate = new Date();
    static String lDate = dateFormat.format(localDate); 
    static int sel = 1;
    
    public OrderTest() {
    }
    
    @Before
    public void setUp() {
        Date myDate = parseDate("2018-12-16");
        this.instance = new Order("D001","dasdasd",myDate,"15:30","20.00","      -       ","      -       ","      -       ","Delivering");
    }

    /**
     * Test of getAddress method, of class Order.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        String expResult = "      -       ";
        String result = instance.getAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAddress method, of class Order.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String Address = "      -       ";
        instance.setAddress(Address);
    }

    /**
     * Test of getOrderid method, of class Order.
     */
    @Test
    public void testGetOrderid() {
        System.out.println("getOrderid");
        String expResult = "D001";
        String result = instance.getOrderid();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrderDesc method, of class Order.
     */
    @Test
    public void testGetOrderDesc() {
        System.out.println("getOrderDesc");
        String expResult = "dasdasd";
        String result = instance.getOrderDesc();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrderDate method, of class Order.
     */
    @Test
    public void testGetOrderDate() {
        Date myDate = parseDate("2018-12-16");
        System.out.println("getOrderDate");
        Date expResult = myDate;
        Date result = instance.getOrderDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getOrderTime method, of class Order.
     */
    @Test
    public void testGetOrderTime() {
        System.out.println("getOrderTime");
        String expResult = "15:30";
        String result = instance.getOrderTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class Order.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        String expResult = "Delivering";
        String result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPDate method, of class Order.
     */
    @Test
    public void testGetPDate() {
        System.out.println("getPDate");
        String expResult = "      -       ";
        String result = instance.getPDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTime method, of class Order.
     */
    @Test
    public void testGetTime() {
        System.out.println("getTime");
        String expResult = "      -       ";
        String result = instance.getTime();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAmount method, of class Order.
     */
    @Test
    public void testGetAmount() {
        System.out.println("getAmount");
        String expResult = "20.00";
        String result = instance.getAmount();
        assertEquals(expResult, result);
    }

    /**
     * Test of setOrderid method, of class Order.
     */
    @Test
    public void testSetOrderid() {
        System.out.println("setOrderid");
        String Orderid = "D001";
        instance.setOrderid(Orderid);
    }

    /**
     * Test of setOrderDesc method, of class Order.
     */
    @Test
    public void testSetOrderDesc() {
        System.out.println("setOrderDesc");
        String OrderDesc = "dasdasd";
        instance.setOrderDesc(OrderDesc);
    }

    /**
     * Test of setOrderDate method, of class Order.
     */
    @Test
    public void testSetOrderDate() {
        Date myDate = parseDate("2018-12-12");
        System.out.println("setOrderDate");
        Date OrderDate = myDate;
        instance.setOrderDate(OrderDate);
    }

    /**
     * Test of setOrderTime method, of class Order.
     */
    @Test
    public void testSetOrderTime() {
        System.out.println("setOrderTime");
        String OrderTime = "15:30";
        instance.setOrderTime(OrderTime);
    }

    /**
     * Test of setAmount method, of class Order.
     */
    @Test
    public void testSetAmount() {
        System.out.println("setAmount");
        String Amount = "20.00";
        instance.setAmount(Amount);
    }

    /**
     * Test of setPDate method, of class Order.
     */
    @Test
    public void testSetPDate() {
        System.out.println("setPDate");
        String pDate = "";
        instance.setPDate(pDate);
    }

    /**
     * Test of setTime method, of class Order.
     */
    @Test
    public void testSetTime() {
        System.out.println("setTime");
        String time = "";
        instance.setTime(time);
    }

    /**
     * Test of setStatus method, of class Order.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        String status = "Delivering";
        instance.setStatus(status);
        
        ViewOrderDelivery();
        ViewAllOrder();
    }

    
    private static void ViewOrderDelivery() {
        Order PastOrder;
        Date myDate = parseDate("2018-12-16");
        Date myDate1 = parseDate("2018-12-17");
        PastOrder = new Order("D001","dasdasd",myDate,"15:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D002","dasdasd",myDate,"15:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D003","dasdasd",myDate,"15:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D004","dasdasd",myDate,"14:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D005","dasdasd",myDate1,"14:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D006","dasdasd",myDate1,"14:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D007","dasdasd",myDate1,"16:00","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D008","dasdasd",myDate1,"16;00","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        
        String s;
        List d = getOrderDeliveryByDate(lDate);
        
        int selection;
        System.out.println();
        System.out.println("--------|All Order that ready for delivery|--------");
        do {
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println("\tOrder ID\tDetails\t\tCollect Time\tAmount To Paid\t\t   Address\t\tDate Picked Up\t\tTime Picked Up\t\tOrder Status");
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            if (d.isEmpty()) {
                System.out.println("@@@@@@@@@@@                                       No record                                       @@@@@@@@@@@");
            } else {
                for(int i = 0;i < d.size();i++){
                    System.out.println(i+1 + "\t" + d.get(i));
                }
            }
            System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            System.out.println();
            System.out.println("Select one of the Order to proceed payment");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

            selection = 1;
            if(selection == 1){
                s = ((Order)d.get(selection - 1)).getOrderid();
                    SelectD(s);
                    System.out.println();
                    break;
            }
//            flush();
//            switch (selection) {
//                case 1:
//                    s = ((Order)d.get(selection - 1)).getOrderid();
//                    SelectD(s);
//                    System.out.println();
//                    break;
//                case 2:
//                    s = ((Order)d.get(selection - 1)).getOrderid();
//                    SelectD(s);
//                    System.out.println();
//                    break;  
//                case 3:
//                    s = ((Order)d.get(selection - 1)).getOrderid();
//                    SelectD(s);
//                    System.out.println();
//                    break;  
//                case 0:
//                    break;
//                default:
//                    System.out.println("Please select one of the order. Press 0 to Exit");
//                    break;
//            }
        } while (selection != 0); 
        
        System.out.println(instance.getStatus());
    }
    
        private static void ViewAllOrder() {
            
        Order PastOrder;
        Date myDate = parseDate("2018-12-16");
        PastOrder = new Order("P001","dasdasd",myDate,"14:30","20.00","      -       ","      -       ","      -       ","Unpick");
        OrderList.add(PastOrder);
        PastOrder = new Order("P002","dasdasd",myDate,"15:30","40.00","      -       ","      -       ","      -       ","Unpick");
        OrderList.add(PastOrder);
        PastOrder = new Order("P003","dasdasd",myDate,"16:30","30.00","      -       ","      -       ","      -       ","Unpick");
        OrderList.add(PastOrder);
        Date myDate1 = parseDate("2018-12-17");
        PastOrder = new Order("P004","dasdasd",myDate1,"15:30","20.00","      -       ","      -       ","      -       ","Unpick");
        OrderList.add(PastOrder);
        PastOrder = new Order("P005","dasdasd",myDate1,"16:30","20.00","      -       ","      -       ","      -       ","Unpick");
        OrderList.add(PastOrder);
        PastOrder = new Order("P006","dasdasd",myDate1,"17:30","20.00","      -       ","      -       ","      -       ","Unpick");
        OrderList.add(PastOrder);
        PastOrder = new Order("P007","dasdasd",myDate1,"18:30","20.00","      -       ","      -       ","      -       ","Unpick");
        OrderList.add(PastOrder);
        Date myDate2 = parseDate("2018-12-16");
        PastOrder = new Order("P008","dasdasd",myDate2,"11:30","20.00","      -       ","      -       ","      -       ","Unpick");
        OrderList.add(PastOrder);
        PastOrder = new Order("P009","dasdasd",myDate2,"12:30","20.00","      -       ","      -       ","      -       ","Unpick");
        OrderList.add(PastOrder);
        
        PastOrder = new Order("D001","dasdasd",myDate,"15:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D002","dasdasd",myDate,"15:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D003","dasdasd",myDate,"15:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D004","dasdasd",myDate,"14:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D005","dasdasd",myDate1,"14:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D006","dasdasd",myDate1,"14:30","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D007","dasdasd",myDate1,"16:00","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        PastOrder = new Order("D008","dasdasd",myDate1,"16;00","20.00","      -       ","      -       ","      -       ","Undelivered");
        DeliveryList.add(PastOrder);
        
        System.out.println();
        System.out.println("--------|All Order|--------");
        System.out.println("--------|All Pick-up Order|--------");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Order ID\tDetails\t\tCollect Time\tAmount To Paid\t\t   Address\t\tDate Picked Up\t\tTime Picked Up\t\tOrder Status");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            for(int i = 0;i < OrderList.size();i++){
                System.out.println(OrderList.get(i));
            }
        System.out.println();
        System.out.println("--------|All Delivery Order|--------");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Order ID\tDetails\t\tCollect Time\tAmount To Paid\t\t   Address\t\tDate Picked Up\t\tTime Picked Up\t\tOrder Status");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
            for(int i = 0;i < DeliveryList.size();i++){
                System.out.println(DeliveryList.get(i));
            }
    }
    
    public static void SelectD(String s){
        String p = s;
        String up = "Delivering";
        o = getOrderDeliveryAmountById(p);
        o.setStatus(up);  
    }
    
        public static List getOrderDeliveryByDate(String lDate){
        Order o;  
        List<Order> OrderDList = new ArrayList<Order>();        
        
        for(int i = 0;i < DeliveryList.size();i++){
            o = (Order)DeliveryList.get(i);
            Date OrderDate = ((Order)DeliveryList.get(i)).getOrderDate();
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
            String strDate = dateFormat.format(OrderDate); 
            if(strDate.equals(lDate)){
                OrderDList.add(o);
            }
            else{
            }
        }
        return OrderDList;
    }
    
    public static Date parseDate(String date) {
     try {
         return new SimpleDateFormat("yyyy-MM-dd").parse(date);
     } catch (ParseException e) {
         return null;
     }
    }
    
    public static Order getOrderDeliveryAmountById(String s){  
        Order o = null;
        
        for(int i = 0;i < DeliveryList.size();i++){
            String Orderid = ((Order)DeliveryList.get(i)).getOrderid();
            if(s.equals(Orderid)){
                o = DeliveryList.get(i);
            }
            else{
            }
        }
        return o;
    }
    
    public static int manageSelectionError() {
        int selection = 0;
        boolean valid = false;
        do {
            try {
                System.out.print("Please select method : ");
                selection = input.nextInt();

                valid = true;
            } catch (Exception ex) {
                System.out.println("Invalid input. Please try again! ");
                flush();
            }
        } while (!valid);
        return selection;
    }
    
    public static void flush() {
        input.nextLine();
    }
}
