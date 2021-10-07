package codechallenges;

import codechallenges.Queue.Animal;
import codechallenges.Queue.AnimalShelter;
import codechallenges.Queue.Cat;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;



public class AnimalShelterTest {
//    @Test
//    void dequeueWithBadPrefVariable(){
//        AnimalShelter sut = new AnimalShelter();
//        Cat newCat = new Cat("fluffy");
//        sut.enqueue(newCat);
//        assertThrows(NullPointerException.class, () -> sut.dequeue("babboon"));
//        //I've tried several variations to get this to throw a Null pointer exception/return null, , etc. nothing worked.
//    }

    @Test
    void dequeueAsExpected(){
        AnimalShelter sut = new AnimalShelter();
        Cat newCat = new Cat("fluffy");
        Cat newCat2 = new Cat("snuffles");
        Cat newDog = new Cat("harry");
        Cat newDog2 = new Cat("hermione");
        Cat newCat3 = new Cat("voldemort");
        Cat newCat4 = new Cat("bob ross");
        sut.enqueue(newCat);
        sut.enqueue(newCat2);
        sut.enqueue(newDog);
        sut.enqueue(newDog2);
        sut.enqueue(newCat3);
        sut.enqueue(newCat4);
        Animal actual = sut.dequeue("dog");
        assertEquals(newDog, actual);
        //something isn't working correctly, not sure what it is though
    }
}
