package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Members {
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
    public TextField nameField;
    /* 会員を登録 */
    @FXML
    private void registMember(ActionEvent e) throws Exception {
        models.Member.regist(nameField.getText());
        main.Main.changeScene("../views/memberIndex.fxml");
    }

    /* rootへ移動 */
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
