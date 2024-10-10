package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;


public class CashbackHackServiceTest {

    @Test
    void shouldReturnCashback(){

        int amount = 800;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 200;

        Assert.assertEquals(actual,expected);
    }

    @Test
    void shouldReturnCashback2(){

        int amount = 0;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual,expected);
    }

    @Test
    void shouldReturnCashback3(){

        int amount = 1000;
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(actual,expected);
    }
}