package phesus.configuratron;

import javafx.collections.ListChangeListener;
import javafx.event.EventHandler;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

/**
 * Created with IntelliJ IDEA.
 * User: Octavio
 * Date: 25/08/12
 * Time: 03:25 AM
 * To change this template use File | Settings | File Templates.
 */
class PersistentButtonToggleGroup extends ToggleGroup {
    PersistentButtonToggleGroup() {
        super();
        getToggles().addListener(new ListChangeListener<Toggle>() { @Override public void onChanged(Change<? extends Toggle> c) {
            while (c.next()) for (final Toggle addedToggle : c.getAddedSubList())
                ((ToggleButton) addedToggle).addEventFilter(MouseEvent.MOUSE_RELEASED, new EventHandler<MouseEvent>() {
                    @Override public void handle(MouseEvent mouseEvent) {
                        if (addedToggle.equals(getSelectedToggle())) mouseEvent.consume();
                    }
                });
        }});
    }
}