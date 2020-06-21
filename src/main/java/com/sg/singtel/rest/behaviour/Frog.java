package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.api.Speakable;
import com.sg.singtel.rest.api.Swimmable;
import com.sg.singtel.rest.api.Walkable;
import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.utils.Constant;
import com.sg.singtel.rest.utils.enmus.SoundEnums;

public class Frog extends Animal implements Swimmable, Walkable, Speakable {
	Logger logger = LoggerFactory.getLogger(Frog.class);
    SingHelper singHelper;

    public Frog() {
        singHelper = new SingHelper(SoundEnums.DEFAULT);
    }

    public Frog(SingHelper singHelper) {
    	singHelper = singHelper;
    }

    public String callSound() {
        return singHelper.makeSound();
    }

    public String canSwim() {
        logger.debug("Frog ::: "+ Constant.I_AM_SWIMMING);
        return Constant.I_AM_SWIMMING;
    }

    public String canWalk() {
        logger.debug("Frog ::: "+ Constant.I_AM_WALKING);
        return Constant.I_AM_WALKING;
    }
}
