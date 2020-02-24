package controllers;

import javafx.event.ActionEvent;

public class Root {
    /* 会員トップページへ移動 */
    public void goMemberTop(ActionEvent e) throws Exception {
        main.Main.changeScene("../views/member.fxml");
    }

    /* 肉トップページへ移動 */
    public void goMeatTop(ActionEvent e) throws Exception {
        main.Main.changeScene("../views/meat.fxml");
    }

    /* 組み合わせトップページへ移動 */
    public void goCombinationTop(ActionEvent e) throws Exception {
        main.Main.changeScene("../views/combination.fxml");
    }
}
