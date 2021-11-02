/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 McGreggor Kennison
 */

package ucf.assignments;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ListView.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("ToDo List Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();

    }

}

class todoLists {

    ArrayList<todoList> lists;

    public ArrayList<todoList> getLists() {

        return lists;

    }

    public void setLists(ArrayList<todoList> lists) {

        this.lists = lists;

    }

    public void addList(ArrayList<todoList> lists) {

        // create new list
        // add list to arraylist

    }

    public void removeList(ArrayList<todoList> lists, int id) {

        // Remove lists at id

    }
}

class todoList {

    String title;
    ArrayList<item> items;

    public String getTitle() {

        return title;

    }

    public void setTitle(String title) {

        this.title = title;

    }

    public ArrayList<item> getItems() {

        return items;

    }

    public void setItems(ArrayList<item> items) {

        this.items = items;

    }

    public void addItem(ArrayList<item> items) {

        // Create new item
        // Add item to items

    }

    public void removeItem(ArrayList<item> items, int id) {

        // Remove items at id

    }
}

class item {

    String description;
    String due;
    Boolean completed;

    public String getDescription() {

        return description;

    }

    public void setDescription(String description) {

        this.description = description;

    }

    public String getDue() {

        return due;

    }

    public void setDue(String due) {

        this.due = due;

    }

    public Boolean getCompleted() {

        return completed;

    }

    public void setCompleted(Boolean completed) {

        this.completed = completed;

    }

}