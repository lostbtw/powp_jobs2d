package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        Job2dDriver driver = driverManager.getCurrentDriver();
		String testName = e.getActionCommand();
        switch (testName) {
            case "Figure Joe 1":
                FiguresJoe.figureScript1(driver);
                break;
            case "Figure Joe 2":
                FiguresJoe.figureScript2(driver);
                break;
			default:
				break;
        }
	}
}
