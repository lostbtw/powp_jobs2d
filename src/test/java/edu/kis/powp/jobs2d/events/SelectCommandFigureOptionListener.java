package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.figures.CircleFabric;
import edu.kis.powp.jobs2d.drivers.command.figures.RectangleFabric;

public class SelectCommandFigureOptionListener implements ActionListener {

    public static final String FIGURE_RECTANGLE = "Command Figure - Rectangle";
    public static final String FIGURE_CIRCLE = "Command Figure - Circle";

    private final DriverManager driverManager;

    public SelectCommandFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Job2dDriver driver = driverManager.getCurrentDriver();
        DriverCommand command = null;

        switch (e.getActionCommand()) {
            case FIGURE_RECTANGLE:
                command = RectangleFabric.create(driver, 100, 100, 200, 120);
                break;
            case FIGURE_CIRCLE:
                command = CircleFabric.create(driver, 300, 220, 90);
                break;
            default:
                break;
        }

        if (command != null) {
            command.execute();
        }
    }
}