/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package codechallenges.linkedList;

import codechallenges.linkedList.LinkedList;
import org.junit.jupiter.api.Test;

import static codechallenges.linkedList.LinkedList.zipLists;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    void testLinkedListAppend() {
        LinkedList sut = new LinkedList();
        sut.append(0);
        String actualAppend = sut.toString();
        String expectedAppend = "{ 0 } -> NULL";
        assertEquals(expectedAppend, actualAppend);
        sut.append(-3);
        String actualAppendNegative = sut.toString();
        String expectedAppendNegative = "{ 0 } -> { -3 } -> NULL";
        assertEquals(expectedAppendNegative, actualAppendNegative);
    }


    @Test
    void testLinkedListInsertBefore() {
        LinkedList sut = new LinkedList();
        sut.append(1);
        sut.append(2);
        sut.append(3);
        sut.append(4);
        assertThrows(IllegalArgumentException.class, () -> sut.insertBefore(10, 8));
        sut.insertBefore(1, 0);
        String actualFirstNodeResponse = sut.toString();
        String expectFirstNodeResponse = "{ 0 } -> { 1 } -> { 2 } -> { 3 } -> { 4 } -> NULL";
        assertEquals(expectFirstNodeResponse, actualFirstNodeResponse);
        sut.insertBefore(4, 3);
        String actualLastNodeResponse = sut.toString();
        String expectedLastNodeResponse = "{ 0 } -> { 1 } -> { 2 } -> { 3 } -> { 3 } -> { 4 } -> NULL";
        assertEquals(expectedLastNodeResponse, actualLastNodeResponse);
    }

    @Test
    void testLinkedListInsertAfter() {
        LinkedList sut = new LinkedList();
        sut.append(1);
        sut.append(2);
        sut.append(3);
        sut.append(4);
        assertThrows(IllegalArgumentException.class, () -> sut.insertAfter(10, 8));
        sut.insertAfter(4, 5);
        String actualLastNodeResponse = sut.toString();
        String expectedLastNodeResponse = "{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> NULL";
        assertEquals(expectedLastNodeResponse, actualLastNodeResponse);
        sut.insertAfter(1, 2);
        String actualFirstNodeResponse = sut.toString();
        String expectedFirstNodeResponse = "{ 1 } -> { 2 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> NULL";
        assertEquals(expectedFirstNodeResponse, actualFirstNodeResponse);
    }

    @Test
    void linkedListKthGreaterThan() {
        LinkedList sut = new LinkedList();
        sut.append(1);
        sut.append(2);
        sut.append(3);
        sut.append(4);
        assertThrows(IllegalArgumentException.class, () -> sut.kthFromEnd(6));
    }

    @Test
    void linkedListKthSameLength() {
        LinkedList sut = new LinkedList();
        sut.append(1);
        sut.append(2);
        sut.append(3);
        sut.append(4);
        assertEquals(1, sut.kthFromEnd(3));
    }

    @Test
    void testLinkedListKthGreaterThan(){
        LinkedList sut = new LinkedList();
        sut.append(1);
        sut.append(2);
        sut.append(3);
        sut.append(4);
        assertThrows(IllegalArgumentException.class, () -> sut.kthFromEnd(-2));
    }

    @Test
    void testLinkedListKthLengthOfOne(){
        LinkedList sut = new LinkedList();
        sut.append(1);
        assertEquals(1, sut.kthFromEnd(0));
        assertThrows(IllegalArgumentException.class, () -> sut.kthFromEnd(1));
    }

    @Test
    void testLinkedListKthHappyPath(){
        LinkedList sut = new LinkedList();
        sut.append(1);
        sut.append(2);
        sut.append(3);
        sut.append(4);
        sut.append(5);
        sut.append(6);
        sut.append(7);
        assertEquals(4, sut.kthFromEnd(3));
    }

    @Test
    void linkedListZip(){
        LinkedList sut = new LinkedList();
        sut.append(1);
        sut.append(2);
        sut.append(3);
        LinkedList list2 = new LinkedList();
        list2.append(4);
        list2.append(5);
        list2.append(6);
        list2.append(7);
        list2.append(8);
        zipLists(sut, list2);
    }
}


