package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

    public static final String FIGURE_JOE_1 = "Figure Joe 1";
    public static final String FIGURE_JOE_2 = "Figure Joe 2"; 

	private DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
        Job2dDriver driver = driverManager.getCurrentDriver();
		String testName = e.getActionCommand();
    	if (FIGURE_JOE_1.equals(testName)){
                FiguresJoe.figureScript1(driver);
		} else if (FIGURE_JOE_2.equals(testName)){
			    FiguresJoe.figureScript2(driver);
		}
	}
}
