package ucf.assignments;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerListView {

    //Set listsTable View
    @FXML private TableView<todoList> ListsTableView;
    @FXML private TableColumn<todoList, String> listName;

    //Set allItems table
    @FXML private TableView<item> items;
    @FXML private TableColumn<item, String> dueCol;
    @FXML private TableColumn<item, String> descriptionCol;

    //Set itemsInc table
    @FXML private TableView<item> itemsInc;
    @FXML private TableColumn<item, String> dueCol2;
    @FXML private TableColumn<item, String> descriptionCol2;

    //Set itemsComp table
    @FXML private TableView<item> itemsComp;
    @FXML private TableColumn<item, String> dueCol3;
    @FXML private TableColumn<item, String> descriptionCol3;


    @FXML
    void openList(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("newList.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("List");
        stage.setScene(new Scene(root1));
        stage.showAndWait();

    }

    @FXML
    void openItem(ActionEvent event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("newItem.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setTitle("List");
        stage.setScene(new Scene(root1));
        stage.showAndWait();

    }

    public void onOpen() {

        // open file directory
        // check if folder or single file
        // add all list and items to interface

    }

    public void onSave() {

        // open file directory
        // take in location
        // create txt file in format for application
        // store file in location

    }

    public void onSaveAll() {

        // open file directory
        // take in location
        // create folder of text files
        // create txt file for each list
        // store files in folder

    }

    public void onExit() {

        // close application

    }

    public void onSelect() {

        // swap list to selected list in items table

    }

    public void onAddList() {

        // open newList.fxml
        // take in input
        // create new list with title given

    }

    public void onEditList() {

        // open newList.fxml with current title in text prompt
        // change title to new input

    }

    public void onRemoveList() {

        // delete selected list from lists

    }

    public void onAddItem() {

        // open newItem.fxml
        // take in input
        // create item with input given

    }

    public void onEditItem() {

        // open newItem.fxml with current data in text boxes
        // change item data to input given

    }

    public void onRemoveItem() {

        // delete selected item from list

    }

    public void onMarkCompleted() {

        // set completed to true

    }

}
