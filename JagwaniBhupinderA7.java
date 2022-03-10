//importing libraries for the program
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.math.BigDecimal;

//class extends Application for the program
public class JagwaniBhupinderA7 extends Application{
    // declaring class members
    // textfield for getting the values in the calculator
    TextField textField;

    // toggle group for on and off radio buttons
    ToggleGroup onOffGroup;

    // radio buttons for on and off
    RadioButton onButton, offButton;

    // buttons for the calculator
    Button clear, delete, percentage, divide, subtract, multiply, decimal, add, equal,
            zero, one, two, three, four, five, six, seven, eight, nine;
    //operand1 and operand 2 of type big decimal for performing calculations with precision
    BigDecimal operand1;
    BigDecimal operand2;
    //operator of type char, initialized with preset value.
    char operator = '#';
    //a variable to check if equals is pressed
    boolean equalPressed = false;

    //main method that launches the application
    public static void main(String[] args) {
        launch(args);
    }

    //start method that sets the stage
    public void start(Stage myStage){
        //giving title to the stage
        myStage.setTitle("Calculator using JavaFX application");
        //using gridpane object to place the buttons
        GridPane gridPane = new GridPane();
        //initializing TextField
        textField = initializeTextField();

        //creating a Toggle group
        onOffGroup = new ToggleGroup();
        //creating on and off buttons with none of them selected while the application launches.
        onButton = createRadioButton("on", false);
        offButton = createRadioButton("off", false);

        // creating all other buttons
         clear = createButton("AC");
         delete = createButton("<");
         percentage = createButton("%");
         divide = createButton("÷");
         subtract = createButton("-");
         multiply = createButton("X");
         decimal = createButton(".");
         add = createButton("+");
         equal = createButton("=");
         zero = createButton("0");
         one = createButton("1");
         two = createButton("2");
         three = createButton("3");
         four = createButton("4");
         five = createButton("5");
         six = createButton("6");
         seven = createButton("7");
         eight = createButton("8");
         nine = createButton("9");

         //common method for all buttons
         setActionForAll();

         //using gridpane to place text field, on and off radio buttons and all other buttons in the application
        //specifying column and row index along with the number of columns and rows will the buttons and text field span

        // 1st Row
        gridPane.add(textField, 0, 0, 4, 2);

        //2nd Row
        gridPane.add(onButton, 0, 2, 1, 1);
        gridPane.add(offButton, 0, 3, 1, 1);
        gridPane.add(delete, 1,2, 1, 2);
        gridPane.add(clear, 2,2, 1, 2);
        gridPane.add(percentage, 3,2, 1, 2);

        //3rd Row
        gridPane.add(seven, 0, 4, 1, 2);
        gridPane.add(eight, 1,4, 1, 2);
        gridPane.add(nine, 2,4, 1, 2);
        gridPane.add(divide, 3,4, 1, 2);

        //4th Row
        gridPane.add(four, 0, 6, 1, 2);
        gridPane.add(five, 1,6, 1, 2);
        gridPane.add(six, 2,6, 1, 2);
        gridPane.add(subtract, 3,6, 1, 2);

        //5th Row
        gridPane.add(one, 0, 8, 1, 2);
        gridPane.add(two, 1,8, 1, 2);
        gridPane.add(three, 2,8, 1, 2);
        gridPane.add(multiply, 3,8, 1, 2);

        //6th Row
        gridPane.add(decimal, 0, 10, 1, 2);
        gridPane.add(zero, 1,10, 1, 2);
        gridPane.add(add, 2,10, 1, 2);
        equal.setPrefWidth(105);
        gridPane.add(equal, 3,10, 1, 2);

        //setting Horizontal and vertical gaps between buttons
        gridPane.setHgap(18);
        gridPane.setVgap(12);

        gridPane.setPadding(new Insets(20,10,10,20));
        //creating the scene
        Scene scene = new Scene(gridPane, 400, 500);
        //setting the scene on stage
        myStage.setScene(scene);
        //show command to show the stage
        myStage.show();


    }
    //a common method that calls all the methods for multiple buttons
    public void setActionForAll(){
        setActionOnOff();
        setActionClear();
        setActionDelete();
        setActionPercentage();
        setActionDivide();
        setActionSubtract();
        setActionMultiply();
        setActionDecimal();
        setActionAdd();
        setActionEqual();
        setActionZero();
        setActionOne();
        setActionTwo();
        setActionThree();
        setActionFour();
        setActionFive();
        setActionSix();
        setActionSeven();
        setActionEight();
        setActionNine();

    }
    //setting action for method for on and off radio buttons
    void setActionOnOff(){
        //adding listener to the toggle group
        onOffGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            //getting which radio button is selected
            RadioButton rb = (RadioButton) onOffGroup.getSelectedToggle();
            // clearing the text field
            textField.setText("");
            //if else statement to enable and disable the calculator based on the radio button pressed.
            if(rb.getText().equals(onButton.getText())){
                textField.setDisable(false);
                clear.setDisable(false);
                delete.setDisable(false);
                percentage.setDisable(false);
                divide.setDisable(false);
                subtract.setDisable(false);
                multiply.setDisable(false);
                decimal.setDisable(false);
                add.setDisable(false);
                equal.setDisable(false);
                zero.setDisable(false);
                one.setDisable(false);
                two.setDisable(false);
                three.setDisable(false);
                four.setDisable(false);
                five.setDisable(false);
                six.setDisable(false);
                seven.setDisable(false);
                eight.setDisable(false);
                nine.setDisable(false);
            }
            else{
                textField.setDisable(true);
                clear.setDisable(true);
                delete.setDisable(true);
                percentage.setDisable(true);
                divide.setDisable(true);
                subtract.setDisable(true);
                multiply.setDisable(true);
                decimal.setDisable(true);
                add.setDisable(true);
                equal.setDisable(true);
                zero.setDisable(true);
                one.setDisable(true);
                two.setDisable(true);
                three.setDisable(true);
                four.setDisable(true);
                five.setDisable(true);
                six.setDisable(true);
                seven.setDisable(true);
                eight.setDisable(true);
                nine.setDisable(true);
            }
        });

    }
    //method to clear the text field and reset the operands and operator when clear button is pressed.
    void setActionClear(){
        clear.setOnAction(event -> {
            textField.setText("");
            operand1 = BigDecimal.valueOf(0.0);
            operand2 = BigDecimal.valueOf(0.0);
            operator = '#';
        });


    }
    //method to delete the last digit when delete button is pressed.
    void setActionDelete(){
        delete.setOnAction(event -> {
            if(textField.getText().length() > 0){
                textField.setText(textField.getText(0, textField.getLength()-1));
            }
        });

    }
    //calling operatorClicked() method for percentage
    void setActionPercentage(){
        percentage.setOnAction(event -> operatorClicked('%'));

    }
    //calling operatorClicked() method for divide
    void setActionDivide(){
        divide.setOnAction(event -> operatorClicked('÷'));

    }
    //calling operatorClicked() method for subtract
    void setActionSubtract(){
        subtract.setOnAction(event -> operatorClicked('-'));

    }
    //calling operatorClicked() method for multiply
    void setActionMultiply(){
        multiply.setOnAction(event -> operatorClicked('x'));

    }
    //method for handling decimal button  click
    void setActionDecimal(){
        decimal.setOnAction(event -> {
            //checking if decimal is already present in the textfield or not
            if(!textField.getText().contains(".")){
                textField.setText(textField.getText() + ".");
            }
        });
    }
    //calling operatorClicked() method for addition
    void setActionAdd(){
        add.setOnAction(event -> operatorClicked('+'));

    }
    //calculating the final value based on the operator selected
    void setActionEqual(){
        equal.setOnAction(event -> {
            //setting the boolean equalPressed = true for future usage
            equalPressed = true;

            // if no value specified, use 0 by default for operand2
            if(textField.getText().isEmpty()){
                operand2 = BigDecimal.valueOf(0.0);
            }
            else{
                operand2 = BigDecimal.valueOf(Double.parseDouble(textField.getText()));
            }
            switch (operator){
                case '+':
                    textField.setText(String.valueOf(operand1.add(operand2)));
                    break;
                case '-':
                    textField.setText(String.valueOf(operand1.subtract(operand2)));
                    break;
                case 'x': textField.setText(String.valueOf(operand1.multiply(operand2)));
                    break;
                case '÷': if(operand2.compareTo(BigDecimal.ZERO) == 0){
                    textField.setText("Error");
                }
                else{
                    // setting precision to 5 decimal places.
                    textField.setText(operand1.divide(operand2, 5, BigDecimal.ROUND_CEILING).toString());
                }
                    break;
                case '%':
                    // setting precision to 5 decimal places.
                    textField.setText(String.valueOf(operand1.multiply( operand2).divide(new BigDecimal(100), 5, BigDecimal.ROUND_CEILING)));
                    break;
            }
        });
    }
    //performing action when 0 is pressed
    void setActionZero(){

        zero.setOnAction(event -> {
            checkForEquals();
            textField.setText(textField.getText() + "0");
                });
    }
    //performing action when 1 is pressed
    void setActionOne(){
        one.setOnAction(event -> {
            checkForEquals();
            textField.setText(textField.getText() + "1");
        });

    }
    //performing action when 2 is pressed
    void setActionTwo(){
        two.setOnAction(event -> {
            checkForEquals();
            textField.setText(textField.getText() + "2");
        });

    }
    //performing action when 3 is pressed
    void setActionThree(){
        three.setOnAction(event -> {
            checkForEquals();
            textField.setText(textField.getText() + "3");
        });

    }
    //performing action when 4 is pressed
    void setActionFour(){
        four.setOnAction(event -> {
            checkForEquals();
            textField.setText(textField.getText() + "4");
        });

    }
    //performing action when 5 is pressed
    void setActionFive(){
        five.setOnAction(event -> {
            checkForEquals();
            textField.setText(textField.getText() + "5");
        });

    }
    //performing action when 6 is pressed
    void setActionSix(){
        six.setOnAction(event -> {
            checkForEquals();
            textField.setText(textField.getText() + "6");
        });

    }
    //performing action when 7 is pressed
    void setActionSeven(){
        seven.setOnAction(event -> {
            checkForEquals();
            textField.setText(textField.getText() + "7");
        });

    }
    //performing action when 8 is pressed
    void setActionEight(){
        eight.setOnAction(event -> {
            checkForEquals();
            textField.setText(textField.getText() + "8");
        });

    }
    //performing action when 9 is pressed
    void setActionNine(){
        nine.setOnAction(event -> {
            checkForEquals();
            textField.setText(textField.getText() + "9");
        });

    }
    //this method sets the first operand when an operator is clicked and also saves which operator was selected
    void operatorClicked(char op){
        operator = op;
        // setting operand1 to 0 as default
        if(textField.getText().isEmpty()){
            operand1 = new BigDecimal(0);
        }
        else{
            operand1 = BigDecimal.valueOf(Double.parseDouble(textField.getText()));
        }
        // clearing the textfield for next operand
        textField.setText("");

    }
    //If a digit is pressed after equals was pressed, then clear the text field before appending it.
    void checkForEquals(){
        if(equalPressed){
            textField.setText("");
            equalPressed = false;
        }
    }
    //creating text field and setting size, padding, and alignment of the text field
    TextField initializeTextField(){
        TextField tf = new TextField();

        tf.setPadding(new Insets(10,10,10,10));
        tf.setPrefSize(380, 80);
        tf.setAlignment(Pos.CENTER_RIGHT);

        return tf;
    }
    //creating buttons and specifying their size
    Button createButton(String displayName){
        Button b = new Button(displayName);
        b.setPrefSize(85, 60);

        return b;
    }
    //creating radio buttons and adding them into a toggle group
    RadioButton createRadioButton(String name, boolean selected){
        RadioButton button = new RadioButton(name);
        button.setPrefSize(85,30);
        button.setSelected(selected);
        button.setToggleGroup(onOffGroup);

        return button;
    }

// references:
    //https://stackoverflow.com/questions/26523393/radio-button-change-event-javafx
    //https://www.geeksforgeeks.org/javafx-radiobutton-with-examples/
    //https://www.geeksforgeeks.org/javafx-button-with-examples/
    //http://tutorials.jenkov.com/javafx/gridpane.html
    //https://www.tutorialspoint.com/java/math/bigdecimal_divide_rdroundingmode_scale.html

}
