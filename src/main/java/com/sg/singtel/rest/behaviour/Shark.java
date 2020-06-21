package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.utils.Constant;

public class Shark extends Fish {
	Logger logger = LoggerFactory.getLogger(Shark.class);

    @Override
    public String bodySize() {
        return "large";
    }

    @Override
    public String bodyColor() {
        return "grey";
    }

    public String canEat() {
        logger.debug("Shark ::: "+ Constant.I_EAT_FISH);
        return Constant.I_EAT_FISH;
    }
}
