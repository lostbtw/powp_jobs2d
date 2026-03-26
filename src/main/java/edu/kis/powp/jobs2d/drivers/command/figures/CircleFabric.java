package edu.kis.powp.jobs2d.drivers.command.figures;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.drivers.command.ComplexCommand;
import edu.kis.powp.jobs2d.drivers.command.DriverCommand;
import edu.kis.powp.jobs2d.drivers.command.OperateToCommand;
import edu.kis.powp.jobs2d.drivers.command.SetPositionCommand;

public class CircleFabric {

    private static final int SEGMENTS_NUMBER = 32;
    
    public static DriverCommand create(Job2dDriver driver, int x, int y, int r){

        ComplexCommand cmd = new ComplexCommand();
        
        // Starts drawing from right side
        int startX = x + r;
        int startY = y;

        cmd.addCommand(new SetPositionCommand(driver, startX, startY));
        for(int i = 1; i <= SEGMENTS_NUMBER; i++){
            double angle = 2.0 * Math.PI * i / SEGMENTS_NUMBER;
            int newX = x + (int) Math.round(r * Math.cos(angle)); 
            int newY = y + (int) Math.round(r * Math.sin(angle));
            cmd.addCommand(new OperateToCommand(driver, newX, newY));
        }
        return cmd;
    }
}
