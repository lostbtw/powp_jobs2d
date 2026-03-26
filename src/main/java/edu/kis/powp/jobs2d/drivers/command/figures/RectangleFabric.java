package edu.kis.powp.jobs2d.drivers.command.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class RectangleFabric {
    public static DriverCommand create(Job2dDriver driver, int x, int y, int width, int height){
        return new ComplexCommand()
        .addCommand(new SetPositionCommand(driver, x, y))
        .addCommand(new OperateToCommand(driver, x + width, y))
        .addCommand(new OperateToCommand(driver, x + width, y + height))
        .addCommand(new OperateToCommand(driver, x, y + height))
        .addCommand(new OperateToCommand(driver, x, y));
    };
}