package prakticheskoe_zadanie_2_4;

import javafx.fxml.FXML;
import javafx.scene.control.*;


public class Controller {

    @FXML
    private TextField enterMessageTextField;

    @FXML
    private Button sendMessageButton;

    @FXML
    private TextArea chatTextArea;

    @FXML
//Всегда отрабатывает при старте программы
    public void initialize() {
//        System.out.println("Привет!!!");
//        enterMessageTextField.requestFocus();//пробовал принудительно передать фокус какому-либо элементу, но не получилось. Видимо надо не здесь это делать
    }

    @FXML
//Выбор в верхнем меню Файл-->Выход Ctrl+Q
    void doExit() {
        System.exit(0);//Выходим из программы
    }

    @FXML
//Выбор в верхнем меню Помощь-->О программе
//Выводит подсказку к программе
    void doAboutProgramm() {
        showMessage(Alert.AlertType.INFORMATION, "О программе", "---===Иван Булкин продакшн===---\nCopyright © 2021");
    }

    @FXML
//Нажатие кнопки Отослать сообщение
    void doSendMessageButton() {
//        System.out.println("Нажатие кнопки Отослать сообщение");
        chatTextArea.appendText(enterMessageTextField.getText());
        if (enterMessageTextField.getText() != "") {
            chatTextArea.appendText("\n");//переводим строку, если введён какой-либо текст
        }
        enterMessageTextField.clear();//Очищаем поле ввода, для ввода следующего сообщения
    }

//Вот этот метод сделала сама Идея, когда я нажал на блоке кода Ctrl+Alt+M круто, в принципе
    private void showMessage(Alert.AlertType error, String s, String s2) {
        var alert = new Alert(error);
        alert.setTitle(s);
        alert.setResizable(false);
        alert.setHeaderText(s2);
        alert.show();
    }
}