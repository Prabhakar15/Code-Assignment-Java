package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.api.Flyable;
import com.sg.singtel.rest.api.Swimmable;
import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.utils.Constant;
import com.sg.singtel.rest.utils.enmus.SoundEnums;

public class Duck extends Bird implements Swimmable, Flyable {

	Logger logger = LoggerFactory.getLogger(Duck.class);
	
    public Duck() {
        super(new SingHelper(SoundEnums.DUCK));
    }

    @Override
    public String canWalk() {
        return super.canWalk();
    }

    public String canFly() {
    	logger.debug("Duck ::: "+ Constant.I_AM_FLYING);
    	return Constant.I_AM_FLYING;
    }

    public String canSwim() {
    	logger.debug("Duck ::: "+ Constant.I_AM_SWIMMING);
    	return Constant.I_AM_SWIMMING;
    }
}
