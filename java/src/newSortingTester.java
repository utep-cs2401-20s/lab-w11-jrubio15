import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

    public class newSortingTester {
        @Test
        public void newSortingTester1() {
            int[] z = {1,1,1,1,1};
            newSorting.newSorting(z,z.length);
            int[] s = {1,1,1,1,1};
            assertArrayEquals(s,z);
        }
        @Test
        public void newSortingTester2() {
            int[] z = {2,4,6,8,10,0};
            newSorting.newSorting(z,z.length);
            int[] s = {0,2,4,6,8,10};
            assertArrayEquals(s,z);
        }
        @Test
        public void newSortingTester3() {
            int[] z = {-9,-7,-5,-3,0};
            newSorting.newSorting(z,z.length);
            int[] s = {-9,-7,-5,-3,0};
            assertArrayEquals(s,z);
        }
        @Test
        public void newSortingTester4() {
            int[] z = {-3,-3,-3};
            newSorting.newSorting(z,z.length);
            int[] s = {-3,-3,-3};
            assertArrayEquals(s,z);
        }
        @Test
        public void newSortingTester5() {
            int[] z = {0};
            newSorting.newSorting(z,z.length);
            int[] s = {0};
            assertArrayEquals(s,z);
        }
    }

