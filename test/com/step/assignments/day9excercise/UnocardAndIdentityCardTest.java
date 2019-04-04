package com.step.assignments.day9excercise;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class UnocardAndIdentityCardTest {


    @Test
    @DisplayName("should not change the original unocard object after modifying duplicate unocard")
    void testForUnocard(){
        Unocard unocard =  new Unocard("Green", 4);
        Unocard duplicateUnocard = unocard.getDuplicate();

        assertEquals(unocard.getColor(), duplicateUnocard.getColor());
        assertEquals(unocard.getNumber(), duplicateUnocard.getNumber());
        assertNotEquals(unocard, duplicateUnocard);
    }

    @Test
    @DisplayName("should not change the original unocard object after modifying duplicate unocard")
    void testForIdentityCard(){
        IdentityCard identityCard = new IdentityCard("Srushti", 6);
        IdentityCard duplicateIdentityCard = identityCard.getDuplicate();

        assertEquals(identityCard.getName(), duplicateIdentityCard.getName());
        assertEquals(identityCard.getBatch(), duplicateIdentityCard.getBatch());
        assertNotEquals(identityCard, duplicateIdentityCard);

    }

}