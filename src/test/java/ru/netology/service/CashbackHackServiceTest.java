package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBuy1() {

        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldBuy999() {

        Assert.assertEquals(service.remain(1001), 999);
    }

    @Test
    public void shouldNotBuy1000() {

        Assert.assertEquals(service.remain(1000), null);
    }

}
