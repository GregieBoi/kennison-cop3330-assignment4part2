package ucf.assignments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class todoListTest {

    // Init new list
    // Set list title
    // Populate list with items

    @Test
    @DisplayName("testGetTitle")
    void getTitle() {

        // assert that getTitle returns title initialized above

    }

    @Test
    @DisplayName("testSetTitle")
    void setTitle() {

        // initialize newTitle
        // call setTitle(newTitle)
        // assert that newTitle equals list.title

    }

    @Test
    @DisplayName("testGetItems")
    void getItems() {

        // assert that getItems returns items initialized above

    }

    @Test
    @DisplayName("testSetItems")
    void setItems() {

        // initialize newList
        // call setItems(items)
        // assert that list.items equals newList.items

    }

    @Test
    @DisplayName("testAddItem")
    void addItem() {

        // initialize newItem
        // call addItem(newItem)
        // assert that items size is larger by one
        // assert that items at len is newItem

    }

    @Test
    @DisplayName("testRemoveItem")
    void removeItem() {

        // initialize tempItem
        // set tempItem to items at 2
        // callRemoveItem(items, 2)
        // assert that items size is less by one
        // assert that items at 2 does not equal tempItem

    }
}