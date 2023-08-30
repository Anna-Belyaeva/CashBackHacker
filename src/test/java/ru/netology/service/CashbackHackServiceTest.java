package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBuy1() {

        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldBuy999() {

        Assert.assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldNotBuy1000() {

        Assert.assertEquals(null, service.remain(1000));
    }

}
