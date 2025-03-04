package vlille;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import vlille.Bike;
import vlille.util.BikeModel;

public class BikeTest {

   @Test
   public void modelAndIdAreCorrectAfterCreation() {
      Bike b1 = new Bike("ref1", BikeModel.CLASSIC);
      assertEquals("ref1", b1.getId());
      assertEquals(BikeModel.CLASSIC, b1.getModel());
   }

   @Test
   public void testEqualsReturnsTrueWhenSameId() {
      Bike b1 = new Bike("ref1", BikeModel.CLASSIC);
      Bike sameIdThanB1 = new Bike("ref1", BikeModel.CLASSIC);
      assertTrue(b1.equals(b1));
      assertTrue(b1.equals(sameIdThanB1));
   }

   @Test
   public void testEqualsReturnsFalseWhenNotSameId() {
      Bike b1 = new Bike("ref1", BikeModel.CLASSIC);
      Bike b2 = new Bike("ref2", BikeModel.CLASSIC);
      assertFalse(b1.equals(b2));
   }

   @Test
   public void testEqualsReturnsFalseWhenNotABikeOrNull() {
      Bike b1 = new Bike("ref1", BikeModel.CLASSIC);
      assertFalse(b1.equals(new Object()));
      assertFalse(b1.equals(null));
   }

}
