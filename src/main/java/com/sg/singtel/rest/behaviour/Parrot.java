package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.api.Flyable;
import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.utils.Constant;
import com.sg.singtel.rest.utils.enmus.SoundEnums;

public class Parrot extends Bird implements Flyable {
	Logger logger = LoggerFactory.getLogger(Parrot.class);
    public Parrot() {
        super(new SingHelper(SoundEnums.DEFAULT));
    }

    public Parrot(SingHelper singHelper) {
        super(singHelper);
    }

    public String canFly() {
        logger.debug("Parrot ::: "+ Constant.I_AM_FLYING);
        return Constant.I_AM_FLYING;
    }
}
