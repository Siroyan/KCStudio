package controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Members implements Initializable {

    @FXML
    private ListView<String> memberList = new ListView<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        String[] s = new String[]{"abc", "bcd", "cde"};
        ObservableList<String> lm = FXCollections.observableArrayList(s);
        memberList.setItems(lm);
    }

    /* Index View */
    /* 会員登録ページへ */
    @FXML
    private void goRegistMemberView(ActionEvent e) throws Exception {
        main.Main.changeScene("../views/memberNew.fxml");
    }

    /* 会員編集ページへ */
    @FXML
    private void goEditMemberView(ActionEvent e) throws Exception {

    }

    /* 会員削除ページへ */
    @FXML
    private void goDeleteMemberView(ActionEvent e) throws Exception {

    }

    /* New View */
    @FXML
    private TextField nameField;
    /* 会員を登録 */
    @FXML
    private void registMember(ActionEvent e) throws Exception {
        models.Member.regist(nameField.getText());
        main.Main.changeScene("../views/memberIndex.fxml");
    }

    /* MemberIndexへ移動 */
    @FXML
    private void returnToMemberIndex(ActionEvent e) throws Exception {
        main.Main.changeScene("../views/memberIndex.fxml");
    }

    /* rootへ移動 */
    @FXML
    private void returnToRoot(ActionEvent e) throws Exception {
        main.Main.changeScene("../views/root.fxml");
    }
}
