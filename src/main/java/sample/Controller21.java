package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.*;

public class Controller21 {

    @FXML
    private TextArea textArea;

    @FXML
    private TextField countOfPoints;

    private Integer countOfPoint = 0;
    private List<String> resultList = new ArrayList<>();
    private Main main;

    public void setMain(Main main) { this.main = main; }

    @FXML
    private void sendText() {
        Map<Integer, String> randomCard = setRandom();
        String resultStr = randomCard.entrySet().stream().findFirst().get().getValue();
        if (countOfPoint < 21) {
            if (resultList.size() == 0) {
                resultList.add(resultStr);
                textArea.appendText(resultStr + "\n");
                countOfPoint += randomCard.entrySet().stream().findFirst().get().getKey();
                countOfPoints.setText(String.valueOf(countOfPoint));
            } else {
                if (resultList.stream().anyMatch(resultStr::equals)) {
                    sendText();
                } else {
                    resultList.add(resultStr);
                    textArea.appendText(resultStr + "\n");
                    countOfPoint += randomCard.entrySet().stream().findFirst().get().getKey();
                    countOfPoints.setText(String.valueOf(countOfPoint));
                }
            }
        }
        winnOrLose();
    }

    private Map<Integer, String> setRandom() {
        Random random = new Random();
        Map<Integer, String> result = new LinkedHashMap<>();

        int high = 14;
        int lower = 1;
        int randomInt;

        randomInt = random.nextInt(high - lower) + lower;
        result.put(randomInt, Enums.getEnumByPosition(randomInt).getName()
                + " "
                + Enums.getEnumByPosition(randomInt).getColor().getSuit());

        return result;
    }

    private void winnOrLose() {
        if (countOfPoint == 21) {
            textArea.appendText("YOU WIN" + "\n\t");
        } else if (countOfPoint > 21) {
            textArea.appendText("YOU LOSE" + "\n\t");
        }
    }

    @FXML
    private void restart() {
        countOfPoint = 0;
        countOfPoints.setText(countOfPoint.toString());
        textArea.setText("");
        resultList = new ArrayList<>();
    }
}
