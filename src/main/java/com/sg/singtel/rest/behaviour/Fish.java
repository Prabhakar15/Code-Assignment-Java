package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.api.BodyType;
import com.sg.singtel.rest.api.Swimmable;
import com.sg.singtel.rest.utils.Constant;

public class Fish extends Animal implements Swimmable, BodyType {
	Logger logger = LoggerFactory.getLogger(Fish.class);
    public String canSwim() {
        logger.debug("Fish ::: "+ Constant.I_AM_SWIMMING);
        return Constant.I_AM_SWIMMING;
    }

    public String bodySize() {
        return null;
    }

    public String bodyColor() {
        return null;
    }
}
