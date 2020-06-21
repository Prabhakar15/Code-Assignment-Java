package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.api.Flyable;
import com.sg.singtel.rest.api.NotFlyable;
import com.sg.singtel.rest.api.Speakable;
import com.sg.singtel.rest.api.Walkable;
import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.utils.Constant;

public class Insect extends Animal implements Flyable, Walkable, Speakable, NotFlyable {
	Logger logger = LoggerFactory.getLogger(Insect.class);
    private SingHelper singHelper;

    public Insect(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public String canFly() {
        logger.debug("Insect ::: "+ Constant.I_AM_FLYING);
        return Constant.I_AM_FLYING;
    }

    public String callSound() {
        return singHelper.makeSound();
    }

    public String canWalk() {
    	logger.debug("Insect ::: "+ Constant.I_AM_WALKING);
    	return Constant.I_AM_WALKING;
    }
    
    public String cantFly() {
        logger.debug("Insect ::: "+ Constant.I_CANT_FLY);
        return Constant.I_CANT_FLY;
    }
}
