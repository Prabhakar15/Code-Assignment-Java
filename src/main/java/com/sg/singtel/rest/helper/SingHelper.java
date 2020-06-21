package com.sg.singtel.rest.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.utils.enmus.SoundEnums;

public class SingHelper {
	Logger logger = LoggerFactory.getLogger(SingHelper.class);
    private SoundEnums soundEnums;

    public SingHelper(SoundEnums soundEnums) {
        this.soundEnums = soundEnums;
    }

    public String makeSound() {
        logger.debug("SingHelper ::: "+ soundEnums.getSound());
        return soundEnums.getSound();
    }
}
