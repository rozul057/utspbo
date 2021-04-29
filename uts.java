public class vehicle {
    
class Vehicle{
    String maker ;
    int kmPerGallons;
    
    Vehicle(String maker,int kmPerGallons){
        this.maker=maker;
        this.kmPerGallons=kmPerGallons;
    }
    
    void maker(){
        System.out.println("Kendaraan        :"+ this.maker);
    }
    int kmPerGallons(){
        System.out.println("Konsumsi         :" +this.kmPerGallons +" kmPerLiters");
        return kmPerGallons;
    }
    
}


public static void main(String[] args) {
        
    Vehicle vehicle1 = new Vehicle("Motor", 20000);
    vehicle2 = new Vehicle("Mobil", 10000);
        
        vehicle1.maker();
        vehicle1.kmPerGallons();
        vehicle2.maker();
        vehicle2.kmPerGallons();
        
        if(vehicle1.kmPerGallons>vehicle2.kmPerGallons){
            System.out.println("Nilai baliknya  = 1");
        }else if (vehicle2.kmPerGallons>vehicle1.kmPerGallons){
            System.out.println("Nilai baliknya  = -1");
        }
        
        
    }
    
}
