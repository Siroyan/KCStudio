package controllers;

import javafx.event.ActionEvent;

public class Members {
    /* 会員を登録 */
    public void registMember(ActionEvent e){

    }

    /* 会員を編集 */
    public void editMember(ActionEvent e){

    }

    /* 会員を削除 */
    public void deleteMember(ActionEvent e){

    }

    /* rootへ移動 */
    public void returnToRoot(ActionEvent e) throws Exception {
        main.Main.changeScene("../views/root.fxml");
    }
}
