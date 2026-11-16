public class TwoDimArray {
    public static void main(String[] args) {
        String[] fruits = {"Apple","Mango", "Orange"};
        String[] cannedGoods = {"Sardines","Tuna","Luncheon Meat"};
        String grocery[][] = {fruits,cannedGoods};
        // String g[][] = {{"Apple","Mango", "Orange"},
        //                 {"Sardines","Tuna","Luncheon Meat"}
        //                 };       
                        System.out.println("The Grocery Items are:");
                        for (int i = 0; i < 2; i++) //row
                        {
                          for (int y = 0; y < 3; y++)  //col
                          {
                            System.out.println("Item["+i+"]"+"["+y+"]:" + grocery[i][y]);
                          } 
                        }  
    }
    
}
