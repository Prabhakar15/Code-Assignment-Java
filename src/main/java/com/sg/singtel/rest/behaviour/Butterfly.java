package com.sg.singtel.rest.behaviour;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sg.singtel.rest.api.Flyable;
import com.sg.singtel.rest.api.NotFlyable;
import com.sg.singtel.rest.api.NotSpeakable;
import com.sg.singtel.rest.api.Speakable;
import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.utils.Constant;
import com.sg.singtel.rest.utils.enmus.SoundEnums;

public class Butterfly extends Insect {
	
	Logger logger = LoggerFactory.getLogger(Butterfly.class);
    private Insect state = new caterpillarState(new SingHelper(SoundEnums.CATERPILLAR));

    public Butterfly() {
        super(new SingHelper(SoundEnums.CATERPILLAR));
    }

    public String transform() {
        state = new ButterflyState(new SingHelper(SoundEnums.NO_SOUND));
        return state.callSound();
    }

    @Override
    public String canFly() {
       return state.canFly();
    }
    
    @Override
    public String cantFly() {
       return state.cantFly();
    }

    
    public String callSound() {
    	return state.callSound();
    }

    @Override
    public String canWalk() {
        return state.canWalk();
    }

    private class ButterflyState extends Insect implements Flyable, NotSpeakable {

        public ButterflyState(SingHelper singHelper) {
            super(singHelper);
        }

        @Override
        public String callSound() {
        	return super.callSound();
        }

        @Override
        public String canFly() {
            return super.canFly();
        }
    }

    class caterpillarState extends Insect implements Speakable, NotFlyable {

        public caterpillarState(SingHelper singHelper) {
            super(singHelper);

        }
       
        public String callSound() {
        	return super.callSound();
        }

        public String cantFly() {
        	logger.debug("Butterfly - caterpillarState ::: "+ Constant.I_CANT_FLY);
        	return Constant.I_CANT_FLY;
        }
    }
}
