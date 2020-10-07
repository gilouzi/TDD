import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

class Tests {
   public void testMultiplication() {
      Dollar five = new Dollar(5);
      assertEquals(new Dollar(10), five.times(2));
      assertEquals(new Dollar(15), five.times(3));
    }
    public void testEquality() {
      assertTrue(new Dollar(5).equals(new Dollar(5)));
      assertFalse(new Dollar(5).equals(new Dollar(6)));
      assertTrue(new Franc(5).equals(new Franc(5)));
      assertFalse(new Franc(5).equals(new Franc(6)));
    }
    public void testFrancMultiplication() {
      Franc five = new Franc(5);
      assertEquals(new Franc(10), five.times(2));
      assertEquals(new Franc(15), five.times(3));
    }
  }
