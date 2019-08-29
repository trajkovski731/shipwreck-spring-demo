package com.trajkovski.shipwreck;

import com.trajkovski.shipwreck.model.Shipwreck;
import com.trajkovski.shipwreck.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.is;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(ShipwreckApplication.class)
public class ShipwreckRepositoryIntegrationTest {

    @Autowired
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void setup() {
        Shipwreck shipwreck = new Shipwreck();
        shipwreck.setName("Filip");
        shipwreckRepository.saveAndFlush(shipwreck);
    }

    @Test
    public void testFindAll() {
        List<Shipwreck> wrecks = shipwreckRepository.findAll();
        assertThat(wrecks.size(), is(greaterThanOrEqualTo(1)));
    }
}
