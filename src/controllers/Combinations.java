package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Combinations {
    /* 組み合わせを作成 */
    @FXML
    private void makeCombination(ActionEvent e){

    }

    /* 作成した組み合わせをファイルに出力 */
    @FXML
    public void exportToFile(ActionEvent e){

    }

    /* rootへ移動 */
    @FXML
    public void returnToRoot(ActionEvent e) throws Exception {
        main.Main.changeScene("../views/root.fxml");
    }
}
