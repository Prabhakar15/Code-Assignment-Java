package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.api.NotFlyable;
import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.utils.Constant;
import com.sg.singtel.rest.utils.enmus.SoundEnums;

public class Chicken extends Bird implements NotFlyable {
	Logger logger = LoggerFactory.getLogger(Chicken.class);
    public Chicken() {
        super(new SingHelper(SoundEnums.CHICKEN));
    }

    public Chicken(SingHelper singHelper) {
        super(singHelper);
    }

    @Override
    public String canWalk() {
        return super.canWalk();
    }

    @Override
    public String cantFly() {
        logger.debug("Chicken ::: "+ Constant.I_CANT_FLY);
        return Constant.I_CANT_FLY;
    }
}
