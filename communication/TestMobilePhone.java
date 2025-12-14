package communication;

import java.util.ArrayList;

public class TestMobilePhone {
    public static void main(String[] args) {
        SimCard s1 = new SimCard(123456, "0779480770");
        SimCard s2 = new SimCard(654321, "0779480770");
        SimCard s3 = new SimCard(56789, "0779480770");


        MobilePhone phone1 = new MobilePhone(8, 12, 4.2, "Android", "Samsung", "S21", 6.5f, "Android", 108);
        System.out.println(phone1.Display());
        MobilePhone phone2 = new MobilePhone(12, 8, 3.2, "IOS", "Apple", "Iphone 13 por max", 6.4f, "Android", 50);
        System.out.println(phone2.Display());
        MobilePhone phone3 = new MobilePhone(6, 8, 4.2, "Android", "Google", "Pixel 7", 6.4f, "Android", 50);
        System.out.println(phone3.Display());

    
        System.out.println(phone1.Display());
        System.out.println(phone2.Display());
        System.out.println(phone3.Display());

        
        System.out.println("\nPerformance Score: " + phone1.getPerformance());
        System.out.println("\nPerformance Score: " + phone2.getPerformance());
        System.out.println("\nPerformance Score: " + phone3.getPerformance());

        ArrayList<MobilePhone> arr = new ArrayList<MobilePhone>();
        arr.add(phone1);
        arr.add(phone2);
        arr.add(phone3);
        
    }
}

