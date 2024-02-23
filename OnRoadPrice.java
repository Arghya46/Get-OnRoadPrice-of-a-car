
 
class Car
 {
    static long price = 10;
    static int a;
    int b;
 

 static double OnRoadPrice (String city)
   {
       switch (city) {
          case "Delhi":
              return price + price *0.1;
            
        case "Mumbai":
               return price + price * 0.09;
        }
    return a;    
    }
     
}

 class Test
 {
     public static void main(String[] args) {
        System.out.println(Car.OnRoadPrice("Delhi"));
     }
 }