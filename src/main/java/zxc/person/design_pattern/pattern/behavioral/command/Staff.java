package zxc.person.design_pattern.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by geely
 *
 * 操作者，员工
 *
 */
public class Staff {
    private List<Command> commandList = new ArrayList<Command>();
    public void addCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){
        for(Command command : commandList){
            command.execute();
        }
        commandList.clear();
    }

}
