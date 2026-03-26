package edu.kis.powp.jobs2d.drivers.command;

import java.util.List;
import java.util.ArrayList;

// Composite

public class ComplexCommand implements DriverCommand {

    public List<DriverCommand> commands = new ArrayList<>();

    public ComplexCommand addCommand(DriverCommand cmd) {
        if (cmd != null){
            commands.add(cmd);
        }
        return this;
    }

    @Override
    public void execute() {
        for (DriverCommand cmd : commands) {
            cmd.execute();
        }
    }
}
