package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {

    @Test
    public void add100from900() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void add900from100() {
        CashbackHackService service = new CashbackHackService();
        int expected = 900;
        int actual = service.remain(100);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void add0from1000() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1000);
        Assert.assertEquals(actual, expected);
    }
}