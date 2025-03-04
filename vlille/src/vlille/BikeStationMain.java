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
        
        //  Verification if the parameter is passed as argument 
        if (args.length>0){
            // Recuperation of the value of argument, and conversion to a int
            int n = Integer.parseInt(args[0]);

            // try to get the bike at the position n
            try{
                Bike getBike= station.takeBike(n);
                System.out.println("The bike with ID : " + getBike.getId());
            }
            catch (BikeNotAvailableException e) {
                System.out.println("The bike is not available at the position : "+n);
            }
        }
        else{
                System.out.println("No argument provided, please set an argument");
            }    

        

}}
