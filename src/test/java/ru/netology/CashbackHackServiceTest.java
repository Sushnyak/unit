package ru.netology;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnCashback(){

        int amount = 800;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnCashback2(){

        int amount = 0;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void shouldReturnCashback3(){

        int amount = 1000;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected,actual);
    }
}