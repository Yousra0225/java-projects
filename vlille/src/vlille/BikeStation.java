package vlille;

public class BikeStation {

   /** array of slots for bikes in the station */
   private Bike[] bikes;
   /** name of the station */
   private String name;

   /**
    * Constructor for the BikeStation class
    * @param name the name of the bike station.
    * @param capacity the maximum capacity of the bike station.
    */
   public BikeStation(String name, int capacity) {
      this.name =name;
      this.bikes=new Bike[capacity];
   }

   /**
    * get the name of the bike station
    * @return the name of the bike station
    */
   public String getName() {
      return name;
   }

   /**
    * get the maximum capacity of the bike station
    * @return  the maximum number of bikes station
    */
   public int getCapacity() {
      return bikes.length;
   }

   /**
    * get number of bikes curreently available in the bike station
    * @return the number of the bikes currently available
    */
   public int getNumberOfBikes() {
      // i create a counter to count every bike is at the station
      int count=0;
      // we through the array and we check at eatch index if the element is present or not 
      for(Bike bike :bikes){
         if(bike !=null){
            // if the element is not null, so it is present and we count it
            count++;
         }
      }
      return count;
   }

   /**
    * get the smallest index corresponds to a free slot
    * @return index of the free slot
    */
   public int firstFreeSlot() {
      for(Bike bike:bikes){
         for(int i = 0; i<bikes.length;i++){
            if(bikes[i]==null){
               return i;
            }
         }
      }
      return -1;
   }

   /**
    * drop a bike into station if there is a free slot
    *@param bike the bike to be droped
    *@return true if the bike is dropped , and false if not
    */
   public boolean dropBike(Bike bike) {
      int freeSlot=firstFreeSlot();
      if(freeSlot!=-1){
         bikes[freeSlot]=bike;
         return true;
      }
      return false;
   }

   /**
    * take a bike from the slot in the station
    @param i index of the slot (from which we take the bike)
    @return the bike from the slot
    @throws BikeNotAvailableException if there is no bike in the slot
    */
   public Bike takeBike(int i) throws BikeNotAvailableException {
      if(i>=0 && i<bikes.length && bikes[i]!=null){
         Bike bike =bikes[i];
         bikes[i]=null;
         return bike;
      } else{
         throw new BikeNotAvailableException("No Bike available at the slot.");
      }
   }

}
