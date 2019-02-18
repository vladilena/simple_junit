package calculation;

import org.junit.*;


public class TestArithmetics {
    private static Arithmetics ar;

    @BeforeClass
    public static void runT() {
        ar = new Arithmetics();
    }

    @Test
    public void testAdd() {
        double res = ar.add(3, 7);
//        if (res !=10) Assert.fail();
//        Assert.assertTrue(res == 10);
//        Assert.assertFalse(res != 10);
        Assert.assertEquals(res, 10.0, 0.001);
        Assert.assertNotNull(ar);
    }

    @Ignore
    @Test
    public void TestDedut() {
        double res = ar.dedut(10, 3);
        Assert.assertEquals(res, 7.0, 0.001);
    }

    @Test
    public void TestMult() {
        double res = ar.mult(20, 3);
        Assert.assertEquals(res, 60.0, 0.001);
    }

    @Test
    public void TestDiv() {
        double res = ar.div(20, 2);
        ;
        Assert.assertEquals(res, 10.0, 0.001);
//        try {
//            ar.div(20, 0);
//            Assert.fail();
//        } catch (ArithmeticException e) {
//        }
    }

    @Test(expected = ArithmeticException.class)
    public void TestDivException() {
        ar.div(10, 0);//Infinity
    }

    @Test(timeout = 1000)
    public void TestN() {
        ar.div(20, 3);
    }
}
