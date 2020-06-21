package com.sg.singtel.rest.behaviour;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.api.Flyable;
import com.sg.singtel.rest.api.Speakable;
import com.sg.singtel.rest.api.Walkable;
import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.utils.Constant;
import com.sg.singtel.rest.utils.enmus.SoundEnums;


public class Bird extends Animal implements Walkable, Speakable, Flyable {

    private SingHelper singHelper;
    Logger logger = LoggerFactory.getLogger(Bird.class);

    public Bird() {
        this.singHelper = new SingHelper(SoundEnums.DEFAULT);
    }

    public Bird(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public String callSound() {
        return singHelper.makeSound();
    }

    public String canWalk() {
    	logger.debug("BIRD ::: "+ Constant.I_AM_WALKING);
    	return Constant.I_AM_WALKING;
    }


    public String canFly() {
    	logger.debug("BIRD ::: "+ Constant.I_AM_FLYING);
    	return Constant.I_AM_FLYING;
    }
}
