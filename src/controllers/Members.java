package controllers;

import javafx.event.ActionEvent;

public class Members {
    /* Index View */
    /* 会員登録ページへ */
    public void goRegistMemberView(ActionEvent e) throws Exception {
        main.Main.changeScene("../views/memberNew.fxml");
    }

    /* 会員編集ページへ */
    public void goEditMemberView(ActionEvent e) throws Exception {

    }

    /* 会員削除ページへ */
    public void goDeleteMemberView(ActionEvent e) throws Exception {

    }

    /* New View */
    /* 会員を登録 */
    public void registMember(ActionEvent e){
        models.Member.regist();
    }

    /* rootへ移動 */
    public void returnToMemberIndex(ActionEvent e) throws Exception {
        main.Main.changeScene("../views/memberIndex.fxml");
    }

    /* rootへ移動 */
    public void returnToRoot(ActionEvent e) throws Exception {
        main.Main.changeScene("../views/root.fxml");
    }
}
