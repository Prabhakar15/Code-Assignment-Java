package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.utils.Constant;

public class Clownfish extends Fish {

	Logger logger = LoggerFactory.getLogger(Clownfish.class);
	
    @Override
    public String bodySize() {
        return "small";
    }

    @Override
    public String bodyColor() {
        return "orange";
    }

    public String makeJoke() {
        logger.debug("Clownfish :::  "+ Constant.I_MAKE_JOKES);
        return Constant.I_MAKE_JOKES;
    }
}
