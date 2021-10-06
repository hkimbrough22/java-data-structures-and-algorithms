package codechallenges.Queue;

import codechallenges.linkedList.Node;

import java.lang.instrument.IllegalClassFormatException;
import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {

    Queue<Animal> shelter = new Queue<>();

    public void enqueue(Animal animal) {
        if(animal instanceof Cat || animal instanceof Dog) {
        shelter.enqueue(animal);
        } else throw new IllegalArgumentException("Your animal must be a Cat or a Dog");
    }

    public Animal dequeue(String pref) {
        if (pref != "cat" || pref != "dog") {
            return null;
        } else if(shelter.isEmpty()){
            throw new IllegalArgumentException("There are no animals in the shelter!");
        } else {
            Node<Animal> tempNode = shelter.front;
            while(tempNode != null) {
                if(tempNode.value.type == pref){
                    shelter.front = shelter.front.next;
                    tempNode.next = null;
                    return tempNode.value;
                } else {
                    tempNode = tempNode.next;
                }
            }
            return null;
        }
    }
}
