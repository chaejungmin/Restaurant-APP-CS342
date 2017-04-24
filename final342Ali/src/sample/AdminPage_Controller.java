package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by alishirsalimian on 4/2/17.
 */
public class AdminPage_Controller extends ResturantAPI {
    private static String myusername;

    String resturantName = "Bufallo Wild Wilds";
    @FXML
    private TextField Menu_Text,WaitTime_Text, OpenTime_Text, ClosingTime_Text, ContactNum_Text, Street_Text, City_Text, State_Text, Zipcode_Text;

    @FXML
    private Button backButton;

    public void goBack() throws IOException {
        Stage stage;
        Parent root;
        stage= (Stage)backButton.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("Login_Scene.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public void UpdateWaitTime() {
        System.out.println("username1" + ValidLoginController.getMyVariable());


        System.out.println( Integer.parseInt(WaitTime_Text.getText()));

        setWaitTime( Integer.parseInt(WaitTime_Text.getText()),resturantName);
    }

    public void UpdateOpenTime() { setOpenTime(OpenTime_Text.getText(),resturantName);}

    public void UpdateClosingTime() {setclosingTime(ClosingTime_Text.getText(),resturantName);}

    public void UpdateContactNumber() {setPhoneNumber(ContactNum_Text.getText(),resturantName);}

    public void UpdateStreet() {setstreet(Street_Text.getText(),resturantName);}

    public void UpdateCity(){ setcity(City_Text.getText(),resturantName);}

    public void UpdateState(){ setstate(State_Text.getText(),resturantName);}

    public void UpdateZipcode(){ setZipcode(Integer.parseInt(Zipcode_Text.getText()),resturantName);}
    
    public void UpdateMenu(){ setMenu(Menu_Text.getText(),resturantName); }



}