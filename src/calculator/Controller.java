package calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {

    private String leftSideStr = "";
    private String rightSideStr = "";

    private boolean leftExpr = true;
    // private boolean rightExpr = false;

    private String operSign;
    private boolean operUsed = false;

    private double result = 0;

    @FXML
    public TextArea txtArea;

    public void btn1Click(ActionEvent actionEvent) {
        if (leftExpr) leftSideStr += "1";
        else rightSideStr += "1";
        txtArea.appendText("1");
    }

    public void btn2Click(ActionEvent actionEvent) {
        if (leftExpr) leftSideStr += "2";
        else rightSideStr += "2";
        txtArea.appendText("2");
    }

    public void btn3Click(ActionEvent actionEvent) {
        if (leftExpr) leftSideStr += "3";
        else rightSideStr += "3";
        txtArea.appendText("3");
    }

    public void btn4Click(ActionEvent actionEvent) {
        if (leftExpr) leftSideStr += "4";
        else rightSideStr += "4";
        txtArea.appendText("4");
    }

    public void btn5Click(ActionEvent actionEvent) {
        if (leftExpr) leftSideStr += "5";
        else rightSideStr += "5";
        txtArea.appendText("5");
    }

    public void btn6Click(ActionEvent actionEvent) {
        if (leftExpr) leftSideStr += "6";
        else rightSideStr += "6";
        txtArea.appendText("6");
    }

    public void btn7Click(ActionEvent actionEvent) {
        if (leftExpr) leftSideStr += "7";
        else rightSideStr += "7";
        txtArea.appendText("7");
    }

    public void btn8Click(ActionEvent actionEvent) {
        if (leftExpr) leftSideStr += "8";
        else rightSideStr += "8";
        txtArea.appendText("8");
    }

    public void btn9Click(ActionEvent actionEvent) {
        if (leftExpr) leftSideStr += "9";
        else rightSideStr += "9";
        txtArea.appendText("9");
    }

    public void btn0Click(ActionEvent actionEvent) {
        if (leftExpr) {
            if (!leftSideStr.equals("")) {
                leftSideStr += "0";
                txtArea.appendText("0");
            }
        }
        else {
            if (!rightSideStr.equals("")) {
                rightSideStr += "0";
                txtArea.appendText("0");
            }
        }
    }


    public void btnPlusClick(ActionEvent actionEvent) {
        if (!operUsed) {
            txtArea.appendText("\n+\n");
            leftExpr = false;
            operSign = "+";
            operUsed = true;
        }
    }

    public void btnMinusClick(ActionEvent actionEvent) {
        if (!operUsed) {
            txtArea.appendText("\n-\n");
            leftExpr = false;
            operSign = "-";
            operUsed = true;
        }
    }

    public void btnMultClick(ActionEvent actionEvent) {
        if (!operUsed) {
            txtArea.appendText("\n*\n");
            leftExpr = false;
            operSign = "*";
            operUsed = true;
        }
    }

    public void btnDivClick(ActionEvent actionEvent) {
        if (!operUsed) {
            txtArea.appendText("\n/\n");
            leftExpr = false;
            operSign = "/";
            operUsed = true;
        }
    }


    public void btnEnterClick(ActionEvent actionEvent) {
        txtArea.appendText("\n=\n");
        long leftSideLng = Long.parseLong(leftSideStr);
        long rightSideLng = Long.parseLong(rightSideStr);

        switch (operSign) {
            case "+" :
                result = leftSideLng + rightSideLng;
                break;
            case "-" :
                result = leftSideLng - rightSideLng;
                break;
            case "*" :
                result = leftSideLng * rightSideLng;
                break;
            case "/" :
                result = leftSideLng / rightSideLng;
                break;
        }

        txtArea.appendText(Double.toString(result));

    }

    public void btnClearClick(ActionEvent actionEvent) {
        txtArea.clear();
        leftSideStr = "";
        rightSideStr = "";
        leftExpr = true;
        result = 0;
    }


}
