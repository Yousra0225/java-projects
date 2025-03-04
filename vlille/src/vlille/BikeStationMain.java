package vlille;
import vlille.util.BikeModel;

public class BikeStationMain{
    public static void main(String[] args){
        // Create a bike station named "Timoleon" with a capacity of 10 bikes
        BikeStation station= new BikeStation("timoleon", 10);

        // Create two bikes and add them to the station
        Bike bike1= new Bike("b001", BikeModel.CLASSIC);
        Bike bike2= new Bike("b002", BikeModel.ELECTRIC);

        station.dropBike(bike1);
        station.dropBike(bike2);
        System.out.println("bike 1 of id: "+bike1.getId()+", of model : "+bike1.getModel());
        System.out.println("bike 2 of id: "+bike1.getId()+", of model : "+bike2.getModel());
        
       
            }         
        

}}
