package com.trajkovski.shipwreck;

import com.trajkovski.shipwreck.controller.ShipwreckController;
import com.trajkovski.shipwreck.model.Shipwreck;
import com.trajkovski.shipwreck.repository.ShipwreckRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.util.AssertionErrors.assertEquals;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ShipwreckControllerTest {

    @InjectMocks
    private ShipwreckController sc;

    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testShipwreckGet() {
        Shipwreck sw = new Shipwreck();
        sw.setId(1L);
        when(shipwreckRepository.findOne(1L)).thenReturn(sw);
        Shipwreck wreck = sc.get(1L);
        verify(shipwreckRepository).findOne(1L);
        //assertEquals("Test", 1L, wreck.getId().longValue());
        assertThat(wreck.getId(), is(1L));

    }
}
