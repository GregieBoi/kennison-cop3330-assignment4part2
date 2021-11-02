package ucf.assignments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class todoListsTest {

    // Init a todoLists
    // Populate lists with list

    @Test
    @DisplayName("testGetLists")
    void getLists() {

        // assert that getList returns lists initialized above

    }

    @Test
    @DisplayName("testSetLists")
    void setLists() {

        // initialize new todoLists
        // call setLists(lists)
        // assert that lists.lists equals lists

    }

    @Test
    @DisplayName("testAddList")
    void addList() {

        // initialize new list
        // add new list to lists
        // assert that size is one larger than before
        // assert that lists at len is equal to new list

    }

    @Test
    @DisplayName("testRemoveList")
    void removeList() {

        // initialize  tempList
        // set tempList to lists at 2
        // call removeList(lists, 2)
        // assert that size is one less than before
        // assert that lists at 2 does not equal tempList

    }
}