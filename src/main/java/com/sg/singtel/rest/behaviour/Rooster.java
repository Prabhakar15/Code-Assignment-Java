package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.helper.LanguageHelper;
import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.utils.enmus.LanguageEnums;
import com.sg.singtel.rest.utils.enmus.SoundEnums;

public class Rooster extends Chicken {
	Logger logger = LoggerFactory.getLogger(Rooster.class);
    LanguageHelper languageHelper;
    SingHelper singHelper;
    LanguageEnums languageEnums;

    public Rooster() {
        this.singHelper = new SingHelper(SoundEnums.ROOSTER);
    }

    public Rooster(LanguageEnums languageEnums) {
        this.singHelper = new SingHelper(SoundEnums.ROOSTER);
        this.languageEnums = languageEnums;
    }

    @Override
    public String canFly() {
        return super.canFly();
    }

    @Override
    public String callSound() {
        String translate = LanguageHelper.translate(SoundEnums.ROOSTER.getSound(), languageEnums);
        logger.debug("Rooster ::: "+translate);
        return translate;

    }
}
