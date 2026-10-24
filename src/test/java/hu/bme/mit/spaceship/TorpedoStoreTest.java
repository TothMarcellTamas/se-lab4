package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        // Arrange
        TorpedoStore store = new TorpedoStore(1);

        // Act
        boolean result = store.fire(1);

        // Assert
        assertEquals(true, result);
    }

    @Test 
    void numberOfTorpedos(){
        TorpedoStore store=new TorpedoStore(67);
        assertEquals(67, store.getTorpedoCount());
    }


    @Test 
    void negativeNumberOfTorpedos(){
        TorpedoStore store= new TorpedoStore(-67);
        assertThrows(IllegalArgumentException.class,()-> store.fire(-67));
    }

    @Test 
    void notFiring(){
        TorpedoStore store = new TorpedoStore(1,1);
        boolean res=store.fire(1);
        assertEquals(false, res);
    }

    void EmptyTest(){
        TorpedoStore store= new TorpedoStore(0);
        assertEquals(true, store.isEmpty());
    }

    
}
