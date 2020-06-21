package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.api.Speakable;
import com.sg.singtel.rest.api.Walkable;
import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.utils.Constant;
import com.sg.singtel.rest.utils.enmus.SoundEnums;

public abstract class Mammal extends Animal implements Walkable, Speakable {
	Logger logger = LoggerFactory.getLogger(Mammal.class);
    private SingHelper singHelper;

    public Mammal() {
        this.singHelper = new SingHelper(SoundEnums.DEFAULT);
    }

    public Mammal(SingHelper singHelper) {
        this.singHelper = singHelper;
    }

    public String callSound() {
        return singHelper.makeSound();
    }

    public String canWalk() {
        logger.debug("Mammal ::: "+ Constant.I_AM_WALKING);
        return Constant.I_AM_WALKING;
    }
}
