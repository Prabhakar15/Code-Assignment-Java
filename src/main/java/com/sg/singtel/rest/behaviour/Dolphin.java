package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.api.Swimmable;
import com.sg.singtel.rest.utils.Constant;

public class Dolphin extends Animal implements Swimmable {
	Logger logger = LoggerFactory.getLogger(Dolphin.class);
    public String canSwim() {
        logger.debug("Dolphin ::: "+ Constant.I_AM_SWIMMING);
        return Constant.I_AM_SWIMMING;
    }
}
