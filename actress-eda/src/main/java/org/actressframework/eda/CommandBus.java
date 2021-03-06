package org.actressframework.eda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component(CommandBus.ACTRESS_COMMAND_BUS)
public class CommandBus extends AbstractBus<CommandHandler> {

    static final String ACTRESS_COMMAND_BUS = "actress-commandBus";

    @Autowired(required = false)
    private List<CommandHandler> handlers = new ArrayList<CommandHandler>();

    public CommandBus() {
        super(ACTRESS_COMMAND_BUS);
    }

    @Override
    protected Iterable<CommandHandler> handlers() {
        return handlers;
    }
}
