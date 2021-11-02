package ucf.assignments;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerListViewTest {

    @Test
    @DisplayName("testOpenList")
    void openList() {

        // call openLists()

    }

    @Test
    @DisplayName("testOpenItem")
    void openItem() {

        // call openItem()

    }

    @Test
    @DisplayName("testOnOpen")
    void onOpen() {

        // assert that file directory is opened

    }

    @Test
    @DisplayName("testOnSave")
    void onSave() {

        // initialize newList
        // populate newList
        // call onSave with newList
        // assert that file newList exist in specific directory

    }

    @Test
    @DisplayName("testOnSaveAll")
    void onSaveAll() {

        // initialize newLists
        // populate newLists
        // call onSave with newLists
        // assert that file newLists exist in specific directory

    }

    @Test
    @DisplayName("testOnExit")
    void onExit() {

        // call onExit
        // assert that listView is closed

    }

    @Test
    @DisplayName("testOnSelect")
    void onSelect() {

        // call onSelect at specific index
        // assert that list at index is displayed

    }

    @Test
    @DisplayName("testOnAddList")
    void onAddList() {

        // call OnAddList
        // assert that lists is one size larger

    }

    @Test
    @DisplayName("testOnEditList")
    void onEditList() {

        // initialize ogTitle
        // set ogTitle to list.title
        // call onEditList
        // assert that list.title does not equal ogTitle

    }

    @Test
    @DisplayName("testOnRemoveList")
    void onRemoveList() {

        // call onRemoveList()
        // assert that lists is one size less

    }

    @Test
    @DisplayName("testOnAddItem")
    void onAddItem() {

        // initialize newItem
        // call onAddItem with newItem
        // assert that items size is one larger

    }

    @Test
    @DisplayName("testOnEditItem")
    void onEditItem() {

        // initialize ogDesc and ogDue
        // set ogDesc to item.description
        // set ogDue to item.due
        // call onEditItem
        // assert that item.description does not equal ogDesc
        // assert that item.due does not equal ogDue

    }

    @Test
    @DisplayName("testOnRemoveItem")
    void onRemoveItem() {

        // call onRemoveItem
        // assert that items size is less by one

    }

    @Test
    @DisplayName("testOnMarkCompleted")
    void onMarkCompleted() {

        // call onMarkCompleted
        // assert that item.completed equals true

    }
}