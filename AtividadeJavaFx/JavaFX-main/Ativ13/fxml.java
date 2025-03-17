<?xml version="1.0" encoding="UTF-8"?>

<?import javafx.scene.control.Button?>
<?import javafx.scene.control.Label?>
<?import javafx.scene.control.TextField?>
<?import javafx.scene.layout.VBox?>

<VBox xmlns="http://javafx.com/javafx/17" xmlns:fx="http://javafx.com/fxml/1" fx:controller="java.awt.dnd.DragGestureEvent" spacing="10" alignment="CENTER" style="-fx-padding: 20;">
    <TextField fx:id="namesInput" promptText="Digite os nomes, separados por vírgulas" />
    <Button text="Sortear" onAction="#handleDrawButtonClick"/>
    <Label fx:id="resultLabel" text="Nome sorteado " />
</VBox>
